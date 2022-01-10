#!/bin/bash

# Copyright 2022 Google LLC
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

set -ex

SERVICE=$1
VARIANT=$2
ROOT_DIR=$(realpath $(dirname "${BASH_SOURCE[0]}")/../../../)

if [[ -z "${SERVICE}" ]]
then
  echo "Usage: ${0} <service> [variant]"
  exit 1
fi

if [[ -z "${VARIANT}" ]]
then
  VARIANT=1.31.0
fi

# install the local generators
python2 -m pip install -e ${ROOT_DIR}/google-api-java-client-services/generator --user -q

pushd ${ROOT_DIR}/discovery-artifact-manager

for DISCOVERY in `ls discoveries/${SERVICE}.*.json`
do
  VERSION=$(basename ${DISCOVERY} | cut -d. -f2)
  OUTPUT_DIR=${ROOT_DIR}/google-api-java-client-services/clients/google-api-services-${SERVICE}/${VERSION}/${VARIANT}
  echo ${DISCOVERY}
  echo ${VERSION}
  echo ${OUTPUT_DIR}
  # run the local generator
  python2 -m googleapis.codegen \
      --output_dir=${OUTPUT_DIR} \
      --input=${DISCOVERY} \
      --language=java \
      --language_variant=${VARIANT} \
      --package_path=api/services
done
