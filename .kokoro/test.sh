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

EXIT_STATUS=0

for directory in `find clients -mindepth 3 -maxdepth 3 -type d | sort`
do
  pushd $directory
  diff=$(git diff master .)
  if [ -z "$diff" ]; then
    # skipping tests
    echo "No difference from master, skipping tests."
  else
    mvn clean verify package -B | tee sponge_log.log
    es=$?
    if [ $es -ne 0 ]; then
        EXIT_STATUS=$es
    fi
  fi
  popd
done

exit $EXIT_STATUS
