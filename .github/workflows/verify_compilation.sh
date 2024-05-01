#!/bin/bash
# This script loops over the generated clients and uses `mvn compile` to
# create a list of clients that cannot be compiled. The resulting list is
# printed to stdout
set -exo
export repo_root=$(git rev-parse --show-toplevel)
export failed_libs="${repo_root}/failed_libs"

process_client() {
  pom_dir=$1
  pushd "${pom_dir}"
  lib_name=$(pwd | sed 's/.*\(google-api-services-.*\)/\1/')
  mvn compile || echo "${lib_name}" >> "${failed_libs}"
  popd #pom_dir
}

print_failed_libraries() {
  if [[ $(cat "${failed_libs}" | wc -l) -ne 0 ]]; then
    echo "The following libraries had compilation errors:"
    cat "${failed_libs}"
    exit 1
  else
    echo "All libraries were compiled successfully!"
  fi
}

# export process_client so it can be accessed by the inner shell launched by the
# find command
export -f process_client
# for convenience in local setups, we remove the failed libraries list
# beforehand
if [[ -f "${failed_libs}" ]];then
  rm "${failed_libs}"
fi
pushd "${repo_root}"

# some distros rename parallel to parallel.moreutils
parallel_bin="parallel.moreutils"
which parallel.moreutils || parallel_bin="parallel"

# runs mvn compile in parallel (max 50 jobs)
${parallel_bin} -j50 -i bash -xe -c 'process_client "{}"' -- $(find "clients" -mindepth 3 -name '*2.0.0*' -printf '%p ')

print_failed_libraries


popd #repo_root
