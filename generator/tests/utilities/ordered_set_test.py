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
"""Tests for ordered_set.py."""

from google.apputils import basetest

from googleapis.codegen.utilities import ordered_set


class OrderedSetTest(basetest.TestCase):

  def testFrozenSet(self):
    s = ordered_set.FrozenOrderedSet(range(5))
    self.assertEquals(5, len(s))
    self.assertTrue(4 in s)
    self.assertEquals(range(5), list(s))

  def testMutableSet(self):
    s = ordered_set.MutableOrderedSet()
    for i in range(5):
      s.add(i)
    self.assertEquals(5, len(s))
    self.assertTrue(4 in s)
    self.assertEquals(range(5), list(s))

    s.remove(3)
    self.assertEquals([0, 1, 2, 4], list(s))
    s.clear()
    self.assertEquals(0, len(s))


if __name__ == '__main__':
  basetest.main()
