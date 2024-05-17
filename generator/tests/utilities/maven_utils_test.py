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


from absl.testing import absltest
from googleapis.codegen import java_generator
from googleapis.codegen.utilities import maven_utils


class MavenUtilsTest(absltest.TestCase):

  def testGetMavenArtifactId(self):
    args = [
        ({'api_name': 'adsense'}, 'google-api-services-adsense'),
        ({'api_name': 'adsense', 'owner_domain': 'snorg.com'}, 'adsense'),
        ({'api_name': 'adsense', 'owner_domain': 'snorg.com',
          'package_path': 'snorg.foobar'},
         'snorg-foobar-adsense'),
        ({'api_name': 'admin', 'package_path': 'admin',
          'canonical_name': 'reports'},
         'google-api-services-admin-reports'),
        ]
    for kwargs, artifact_id in args:
      self.assertEqual(artifact_id, maven_utils.GetMavenArtifactId(**kwargs))

  def testMavenArtifactIdAndModulePath(self):

    def TestApi(api_def):
      gen = java_generator.BaseJavaGenerator(api_def,
                                             options={'google_api': True})
      gen.AnnotateApiForLanguage(gen.api)
      api = gen.api

      # drop the leading com
      expected = '-'.join(api.module.path.split('/')[1:])
      actual = maven_utils.GetMavenArtifactId(
          api_def['name'],
          package_path=api_def.get('packagePath'),
          canonical_name=api_def.get('canonicalName'),
          owner_domain=api_def['ownerDomain'])
      self.assertEqual(expected, actual)
    TestApi({'name': 'admin',
             'version': 'directory_v1',
             'canonicalName': 'directory',
             'packagePath': 'admin',
             'ownerDomain': 'google.com'})
    TestApi({'name': 'identitytoolkit',
             'version': 'v1',
             'canonicalName': 'Identity Toolkit',
             'ownerDomain': 'google.com'})
    TestApi({'name': 'identitytoolkit',
             'version': 'v1',
             'packagePath': 'zomby',
             'canonicalName': 'Identity Toolkit',
             'ownerDomain': 'google.com'})

  def testGetMavenGroupId(self):
    self.assertEqual('com.foo.bar', maven_utils.GetMavenGroupId('bar.foo.com'))
    self.assertEqual('com.google.apis',
                      maven_utils.GetMavenGroupId('google.com'))

  def testGetMavenVersion(self):
    google_api = {'name': 'api',
                  'version': 'v1',
                  'revision': 3,
                  'ownerDomain': 'google.com'}
    lv = '1.5'
    self.assertEqual('v1-rev3-1.5',
                      maven_utils.GetMavenVersion(google_api, lv))
    endpoints_api = {'name': 'api',
                     'version': 'v1',
                     'ownerDomain': 'bestbuy.com'}
    self.assertEqual('v1-1.5-SNAPSHOT',
                      maven_utils.GetMavenVersion(endpoints_api, lv))


if __name__ == '__main__':
  absltest.main()
