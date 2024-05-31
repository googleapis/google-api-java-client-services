#!/bin/bash
# Copyright 2020 Google LLC
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

if [[ $# -lt 2 ]]
then
    echo "Usage: $0 <path/to/discovery.json> <output-directory>"
    exit 1
fi

GENERATOR_DIR=$(dirname $0 | xargs realpath)
DISCOVERY=$1
OUTPUT_DIR=$(realpath $2)

# if discovery is a URL, download it to a temp file
if [[ ${DISCOVERY} = http* ]]
then
    TEMP_DISCOVERY=$(mktemp -t discovery-XXXXXXXXXX.json)
    echo "Downloading remote discovery ${DISCOVERY} to ${TEMP_DISCOVERY}"
    curl -sL "${DISCOVERY}" -o ${TEMP_DISCOVERY}
    DISCOVERY=${TEMP_DISCOVERY}
fi

# Install the local generator without dependencies first and then install the dependencies with hash checking.
python3 -m pip install --no-deps -e ${GENERATOR_DIR} --user -q
python3 -m pip install --require-hashes -r generator_requirements.txt --user

mkdir -p ${OUTPUT_DIR}

# run the local generator
python3 -m googleapis.codegen \
    --output_dir=${OUTPUT_DIR} \
    --input=${DISCOVERY} \
    --language=java \
    --language_variant=2.0.0 \
    --package_path=api/services

echo "Wrote client to ${OUTPUT_DIR}"

