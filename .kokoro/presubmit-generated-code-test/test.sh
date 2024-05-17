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

echo "Current working directory"
pwd
echo "Content of current working directory"
echo --------
ls
echo --------

# Add project as safe to run `git diff`
git config --global --add safe.directory $(realpath .)

diff_result=$(git diff --name-only "${KOKORO_GITHUB_PULL_REQUEST_TARGET_BRANCH}...${KOKORO_GITHUB_PULL_REQUEST_COMMIT}" -- generator/  .kokoro/presubmit-generated-code-test/)
if [ -z "${diff_result}" ]; then
  # Skip compilation + Running tests
  echo "No differences found in the PR branch. Returning success."
  exit 0
fi



