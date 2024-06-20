#!/bin/bash
# Copyright 2024 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.


# This script generates all libraries using the 2.0.0 variant of the generator
# in parallel. For each one of the libraries, a `mvn compile` is run as well to
# confirm the library works

set -x
variant=$1
# root_dir is used by the utility functions
export root_dir=$(realpath $(dirname "${BASH_SOURCE[0]}")/../../../)

latest_variant=2.0.0

# Default to use the latest variant
if [[ -z "${variant}" ]]
then
  variant=${latest_variant}
fi

# Install the local generator without dependencies first and then install the dependencies with hash checking.
python3 -m pip install --no-deps -e ${root_dir}/google-api-java-client-services/generator --user -q
python3 -m pip install --require-hashes -r ${root_dir}/google-api-java-client-services/generator/generator_requirements.txt --user

# load utility functions
source "${root_dir}/google-api-java-client-services/.github/workflows/utils.sh"

export failed_libs="${root_dir}/google-api-java-client-services/failed_libs"
if [[ -f "${failed_libs}" ]];then
  rm "${failed_libs}"
fi

parallel -j30 -i bash -xe -c "generate_from_discovery '{}' ${variant} true" -- $(find "${root_dir}/discovery-artifact-manager/discoveries/" -printf '%p ')

echo 'failed libs are:'
cat "${failed_libs}
