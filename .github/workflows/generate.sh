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

LATEST_VARIANT=2.0.0

if [[ -z "${SERVICE}" ]]
then
  echo "Usage: ${0} <service> [variant]"
  exit 1
fi

# Default to use the latest variant
if [[ -z "${VARIANT}" ]]
then
  VARIANT=${LATEST_VARIANT}
fi

# Install the local generator without dependencies first and then install the dependencies with hash checking.
python2 -m pip install --no-deps -e ${ROOT_DIR}/google-api-java-client-services/generator --user -q
python2 -m pip install --require-hashes -r ${ROOT_DIR}/google-api-java-client-services/generator/generator_requirements.txt --user

pushd ${ROOT_DIR}/discovery-artifact-manager

for DISCOVERY in `ls discoveries/${SERVICE}.*.json`
do
  VERSION=$(basename ${DISCOVERY} | sed 's/\.json//' | cut -d. -f2-)
  TARGET_DIR=${ROOT_DIR}/google-api-java-client-services/clients/google-api-services-${SERVICE}/${VERSION}/${VARIANT}
  OUTPUT_DIR=$(mktemp -d)
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

  if [ $(find "${OUTPUT_DIR}" -mindepth 1 | wc -l) == '0' ]; then
    echo 'the generation produced no files'
    exit 1
  fi

  # for new libraries, we create the destination folder
  mkdir -p "${TARGET_DIR}"
  # transfer generated source into the wiped-out service's source folder
  rm -rdf ${TARGET_DIR}/*
  cp -r ${OUTPUT_DIR}/* "${TARGET_DIR}"

  # Copy the latest variant's README to the main service location
  # Generation of libraries with older variants should not update the root README
  cp ${ROOT_DIR}/google-api-java-client-services/clients/google-api-services-${SERVICE}/${VERSION}/${LATEST_VARIANT}/README.md ${ROOT_DIR}/google-api-java-client-services/clients/google-api-services-${SERVICE}/${VERSION}/README.md
done

