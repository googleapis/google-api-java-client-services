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

source $(dirname "$0")/common.sh
MAVEN_SETTINGS_FILE=$(realpath $(dirname "$0")/../)/settings.xml
pushd $(dirname "$0")/../

setup_environment_secrets
create_settings_xml_file "settings.xml"

deploy_library() {
  pushd $1
  SERVICE=$2
  API_VERSION=$3
  REVISION=$4
  LIBRARY_VERSION=$5
  echo "Releasing artifact for ${SERVICE}, ${API_VERSION}, ${REVISION}, ${LIBRARY_VERSION}."

  mvn clean install deploy \
    --settings ${MAVEN_SETTINGS_FILE} \
    -DperformRelease=true \
    -Dgpg.executable=gpg \
    -Dgpg.passphrase=${GPG_PASSPHRASE} \
    -Dgpg.homedir=${GPG_HOMEDIR} \
    -DautoReleaseAfterClose=true
  popd
}

for directory in `find clients -mindepth 3 -maxdepth 3 -type d`
do
  library_version=$(echo ${directory} | cut -f2 -d'/')
  service=$(echo ${directory} | cut -f3 -d'/' | cut -f4 -d'-')
  api_version=$(echo ${directory} | cut -f4 -d'/')
  revision=$(xmllint --xpath "/*[local-name()='project']/*[local-name()='version']/text()" ${directory}/pom.xml | cut -f2 -d'-')

  if [[ $(artifact_exists $service $api_version $revision $library_version) == "true" ]]
  then
    echo "Artifact already exists for $service, $api_version, $revision, $library_version."
  else
    deploy_library $directory $service $api_version $revision $library_version
  fi
  exit 0
done
