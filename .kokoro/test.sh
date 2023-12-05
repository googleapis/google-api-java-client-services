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

# Fail on any non-zero status code
set -e

pushd $(dirname "$0")/../

# Add project as safe to run `git diff`
git config --global --add safe.directory $(realpath .)

VARIANT="2.0.0"

# Only search for directories with the latest variant as the generator only
# generates libraries for the latest variant
for directory in `find clients -mindepth 3 -maxdepth 3 -type d | grep ${VARIANT} | sort`
do
  # Find any diffs in the PR branch that are in this directory
  diff=$(git diff --name-only "${KOKORO_GITHUB_PULL_REQUEST_TARGET_BRANCH}...${KOKORO_GITHUB_PULL_REQUEST_COMMIT}" -- "${directory}")
  if [ -z "${diff}" ]; then
    # Skip compilation + Running tests
    echo "No differences found in the PR branch for ${directory}, skipping..."
  else
    # Run the mvn command in the directory
    pushd "${directory}"
    echo "Found differences in ${directory}. Compiling..."
    mvn verify -Dclirr.skip=true -Dmaven.javadoc.skip=true -B
    popd
  fi
done
popd