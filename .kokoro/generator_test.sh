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

pushd $(dirname "$0")/..
python2 -m pip install -e generator/ --user

pushd generator
for file in `find tests/ -name '*_test.py'`
do
  python2 $file
  es=$?
  if [ $es -ne 0 ]; then
      EXIT_STATUS=$es
  fi
done
popd

popd

exit $EXIT_STATUS
