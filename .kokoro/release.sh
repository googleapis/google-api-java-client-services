#!/bin/bash
# Copyright 2018 Google Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

set -eo pipefail

if [[ -z "${CREDENTIALS}" ]]; then
  CREDENTIALS=${KOKORO_KEYSTORE_DIR}/73713_docuploader_service_account
fi

if [[ -z "${STAGING_BUCKET}" ]]; then
  echo "Need to set STAGING_BUCKET environment variable"
  exit 1
fi

source $(dirname "$0")/common.sh
MAVEN_SETTINGS_FILE=$(realpath $(dirname "$0")/../)/settings.xml
pushd $(dirname "$0")/../

setup_environment_secrets
create_settings_xml_file "settings.xml"

# install docuploader package
python3 -m pip install gcp-docuploader

deploy_library() {
  SERVICE=$1
  API_VERSION=$2
  REVISION=$3
  LIBRARY_VERSION=$4
  echo "Releasing artifact for ${SERVICE}, ${API_VERSION}, ${REVISION}, ${LIBRARY_VERSION}."

  mvn clean install -B
  mvn deploy \
    --settings ${MAVEN_SETTINGS_FILE} \
    -DperformRelease=true \
    -Dgpg.executable=gpg \
    -Dgpg.passphrase=${GPG_PASSPHRASE} \
    -Dgpg.homedir=${GPG_HOMEDIR} \
    -DautoReleaseAfterClose=true \
    -B

  # javadoc build during package is put into target/apidocs (not target/site/apidocs)
  pushd target/apidocs

  # create metadata
  python3 -m docuploader create-metadata \
    --name google-api-services-${SERVICE} \
    --version ${API_VERSION}-${REVISION}-${LIBRARY_VERSION} \
    --language java

  # upload docs
  python3 -m docuploader upload . \
    --credentials ${CREDENTIALS} \
    --staging-bucket ${STAGING_BUCKET}

  popd
}

EXIT_CODE=0
for directory in `find clients -mindepth 3 -maxdepth 3 -type d | sort`
do
  service=$(echo ${directory} | cut -f2 -d'/' | cut -f4 -d'-')
  api_version=$(echo ${directory} | cut -f3 -d'/')
  library_version=$(echo ${directory} | cut -ff -d'/')
  revision=$(xmllint --xpath "/*[local-name()='project']/*[local-name()='version']/text()" ${directory}/pom.xml | cut -f2 -d'-')
  artifact_id=$(xmllint --xpath "/*[local-name()='project']/*[local-name()='artifactId']/text()" ${directory}/pom.xml)

  if [[ $(artifact_exists $artifact_id $api_version $revision $library_version) == "true" ]]
  then
    echo "Artifact already exists for $service, $api_version, $revision, $library_version."
  else
    echo "Deploying $service, $api_version, $revision, $library_version."
    output_file="${service}-${api_version}-${revision}-${library_version}-sponge_log.log"
    set +e
    pushd $directory
    deploy_library $service $api_version $revision $library_version | tee $output_file
    if [[ $? -ne 0 ]]
    then
      EXIT_CODE=127
    fi
    popd
    set -e
  fi
done

exit $EXIT_CODE
