#!/usr/bin/python2.7
# Copyright 2010 Google Inc. All Rights Reserved.
#
#  Licensed under the Apache License, Version 2.0 (the "License");
#  you may not use this file except in compliance with the License.
#  You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
#  Unless required by applicable law or agreed to in writing, software
#  distributed under the License is distributed on an "AS IS" BASIS,
#  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#  See the License for the specific language governing permissions and
#  limitations under the License.

"""Tests for api_exception.py."""

from google.apputils import basetest

from googleapis.codegen.api_exception import ApiException


class ApiExceptionTest(basetest.TestCase):

  def testExceptionStr(self):
    e = ApiException('foo')
    self.assertEquals('foo', str(e))
    e = ApiException('foo', {'bar': 1})
    self.assertEquals("""foo: {'bar': 1}""", str(e))


if __name__ == '__main__':
  basetest.main()
