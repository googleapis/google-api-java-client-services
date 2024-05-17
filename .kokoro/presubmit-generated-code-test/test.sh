#!/bin/bash
# Copyright 2024 Google Inc.
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

# Fail on any non-zero status code
set -eo pipefail

# Kokoro checks out the google-api-java-client-services repository
# under this "github" directory.
KOKORO_GITHUB_DIR=$(realpath github)

echo
echo
echo "Step 1: Return success if there is no test or generator changes"
echo

cd "${KOKORO_GITHUB_DIR}/google-api-java-client-services"
# Add project as safe to run `git diff`
git config --global --add safe.directory "$(realpath .)"

diff_result=$(git diff --name-only "${KOKORO_GITHUB_PULL_REQUEST_TARGET_BRANCH}...${KOKORO_GITHUB_PULL_REQUEST_COMMIT}" -- generator/  .kokoro/)
if [ -z "${diff_result}" ]; then
  # Skip compilation + Running tests
  echo "No differences found in the PR branch. Returning success."
  exit 0
fi

echo "There are generator-related changes: ${diff_result}"

echo
echo
echo "Step 2: Prepare tools for Apiary Java code generator"
echo

cd "${KOKORO_GITHUB_DIR}"

# google-api-java-client-services and discovery-artifact-manager should
# be checked out as siblings
git clone --depth 1 https://github.com/googleapis/discovery-artifact-manager

# Preparation commands from .github/workflows/generate.yaml
apt update
apt install python2 -y
echo "using $(python2 --version)"
curl https://bootstrap.pypa.io/pip/2.7/get-pip.py -o get-pip.py
python2 get-pip.py

echo
echo
echo "Step 3: Run the generator for cloudresourcemanager"
echo

bash ./google-api-java-client-services/.github/workflows/generate.sh cloudresourcemanager


echo
echo
echo "Step 4: Compile the generated code and install the module to local Maven repository"
echo
# For xmllint command
apt-get -y install libxml2-utils

function update_pom_version() {
  pom_file=$1
  version=$2
  xmllint --shell "${pom_file}" &>/dev/null <<EOF
setns x=http://maven.apache.org/POM/4.0.0
cd .//x:project/x:version
set $version
save $pom_file
EOF
}

function parse_pom_version() {
  pom_file=$1
  # Namespace (xmlns) prevents xmllint from specifying tag names in XPath
  result=$(sed -e 's/xmlns=".*"//' "${pom_file}" | xmllint --xpath '/project/version/text()' -)

  if [ -z "${result}" ]; then
    echo "Version is not found in $1"
    exit 1
  fi
  echo "$result"
}

LATEST_RESOURCEMANAGER_API_VERSION=v3
LATEST_VARIANT=2.0.0

cd "${KOKORO_GITHUB_DIR}/google-api-java-client-services/clients/google-api-services-cloudresourcemanager/${LATEST_RESOURCEMANAGER_API_VERSION}/${LATEST_VARIANT}"
RESOURCEMANAGER_LIBRARY_VERSION=$(parse_pom_version pom.xml)
RESOURCEMANAGER_LIBRARY_SNAPSHOT_VERSION="${RESOURCEMANAGER_LIBRARY_VERSION}-SNAPSHOT"
update_pom_version pom.xml "${RESOURCEMANAGER_LIBRARY_SNAPSHOT_VERSION}"
echo "Code diff by setting the SNAPSHOT version:"
git diff .
echo "-----"
echo "Installing google-api-services-cloudresourcemanager version ${RESOURCEMANAGER_LIBRARY_VERSION}"
mvn -V -B -ntp install -Dclirr.skip=true -Dmaven.javadoc.skip=true

echo
echo
echo "Step 5: Run the integration test that uses Cloud ResourceManager library"
echo

cd "${KOKORO_GITHUB_DIR}/google-api-java-client-services/generator/tests/java-integration-test"
mvn -V -B -ntp test -Dcloudresourcemanager.version="${RESOURCEMANAGER_LIBRARY_SNAPSHOT_VERSION}"

echo "Build finished"
