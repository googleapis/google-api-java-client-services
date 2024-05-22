#!/bin/bash

generate_from_discovery() {

  discovery=$1
  variant=$2
  compile=$3

  if [[ -z "${compile}" ]]; then
    compile="false"
  fi

  service=$(basename ${discovery} | cut -d. -f1)
  version=$(basename ${discovery} | sed 's/\.json//' | cut -d. -f2-)
  target_dir=${root_dir}/google-api-java-client-services/clients/google-api-services-${service}/${version}/${variant}
  output_dir=$(mktemp -d)
  python3 -m googleapis.codegen \
      --output_dir=${output_dir} \
      --input=${discovery} \
      --language=java \
      --language_variant=${variant} \
      --package_path=api/services

  # for new libraries, we create the destination folder
  mkdir -p "${target_dir}"
  # transfer generated source into the wiped-out service's source folder
  rm -rdf ${target_dir}/*
  cp -r ${output_dir}/* "${target_dir}"

  # Copy the latest variant's README to the main service location
  # Generation of libraries with older variants should not update the root README
  cp ${root_dir}/google-api-java-client-services/clients/google-api-services-${service}/${version}/${variant}/README.md ${root_dir}/google-api-java-client-services/clients/google-api-services-${service}/${version}/README.md

  if [[ "${compile}" == "true" ]];then
    pushd ${root_dir}/google-api-java-client-services/clients/google-api-services-${service}/${version}/${latest_variant}
    mvn compile
    popd
  fi
}

export -f generate_from_discovery
