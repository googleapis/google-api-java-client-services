#!/usr/bin/python2.7
# Copyright 2011 Google Inc. All Rights Reserved.
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

"""Tests for java_generator."""

__author__ = 'aiuto@google.com (Tony Aiuto)'

from absl.testing import absltest
from googleapis.codegen import data_types
from googleapis.codegen import data_value
from googleapis.codegen import java_generator


class JavaApiTest(absltest.TestCase):

  def testToClassName(self):
    """Test creating safe class names from object names."""
    # 'parameters': {}
    api = java_generator.JavaApi({
        'name': 'dummy',
        'version': 'v1',
        'resources': {
            'foo': {
                'methods': {
                    'bar': {
                        'id': 'bar',
                        }
                    }
                }
            }
        })
    self.assertEqual('Foo', api.ToClassName('foo', api))
    self.assertEqual('DummyClass', api.ToClassName('class', None))
    self.assertEqual('DummyDefault', api.ToClassName('default', None))
    self.assertEqual('DummyImport', api.ToClassName('import', None))
    self.assertEqual('DummyObject', api.ToClassName('object', None))
    self.assertEqual('DummyString', api.ToClassName('string', None))
    self.assertEqual('DummyTrue', api.ToClassName('true', None))
    self.assertEqual('dummy', api.values['name'])
    self.assertEqual('Dummy', api._class_name)

    # Test the renaming of the object when it matches the API name.
    self.assertEqual('Dummy', api.ToClassName('dummy', api))
    foo = api._resources[0]
    self.assertEqual('DummyOperations',
                      api.ToClassName('dummy', foo, element_type='resource'))
    bar = foo._methods[0]
    self.assertEqual('DummyOperation',
                      api.ToClassName('dummy', bar, element_type='method'))

  def testToClassNameWithCanonical(self):
    api = java_generator.JavaApi({
        'name': 'dummy',
        'canonicalName': 'Dummy Service',
        'version': 'v1',
        'resources': {}
        })
    self.assertEqual('dummy', api.values['name'])
    self.assertEqual('DummyService', api._class_name)
    self.assertEqual('DummyServiceClass', api.ToClassName('class', None))

  def testGetCodeTypeFromDictionary(self):
    """Test mapping of JSON schema types to Java class names."""
    language_model = java_generator.JavaLanguageModel()
    test_cases = [
        ['java.lang.String', {'type': 'string', 'format': 'byte'}],
        ['com.google.api.client.util.DateTime',
         {'type': 'string', 'format': 'date-time'}],
        ['java.lang.Double', {'type': 'number', 'format': 'double'}],
        ['java.lang.Float', {'type': 'number', 'format': 'float'}],
        ['java.lang.Short', {'type': 'integer', 'format': 'int16'}],
        ['java.lang.Integer', {'type': 'integer', 'format': 'int32'}],
        ['java.lang.Long', {'type': 'string', 'format': 'int64'}],
        ['java.lang.Object', {'type': 'any'}],
        ['java.lang.Boolean', {'type': 'boolean'}],
        ['java.lang.String', {'type': 'string'}],
        ['java.lang.Long', {'type': 'integer', 'format': 'uint32'}],
        ['java.math.BigInteger', {'type': 'string', 'format': 'uint64'}],
    ]
    for test_case in test_cases:
      self.assertEqual(
          test_case[0],
          language_model.GetCodeTypeFromDictionary(test_case[1]))

  def testGetPrimitiveTypeFromDictionary(self):
    """Test mapping of JSON schema types to Java class names."""
    language_model = java_generator.JavaLanguageModel()
    test_cases = [
        ['double', {'type': 'number', 'format': 'double'}],
        ['float', {'type': 'number', 'format': 'float'}],
        ['short', {'type': 'integer', 'format': 'int16'}],
        ['int', {'type': 'integer', 'format': 'int32'}],
        ['long', {'type': 'string', 'format': 'int64'}],
        ['boolean', {'type': 'boolean'}],
        ['long', {'type': 'integer', 'format': 'uint32'}],
        [None, {'type': 'string'}],
        [None, {'type': 'string', 'format': 'byte'}],
        [None, {'type': 'string', 'format': 'date-time'}],
        [None, {'type': 'string', 'format': 'uint64'}],
        [None, {'type': 'anything_else', 'format': 'uint64'}],
    ]

    for test_case in test_cases:
      self.assertEqual(
          test_case[0],
          language_model.GetPrimitiveTypeFromDictionary(test_case[1]))


class JavaGeneratorTest(absltest.TestCase):

  def testImportsForArray(self):
    """Test if we get the right imports for an array.

    The goal is to see that an array of a primative type which requires an
    import really works.
    """
    gen = java_generator.BaseJavaGenerator({
        'name': 'dummy',
        'version': 'v1',
        'resources': {},
        'schemas': {
            'Bar': {
                'id': 'Bar',
                'type': 'object',
                'properties': {
                    'p1': {
                        'type': 'array',
                        'items': {
                            'type': 'string',
                            'format': 'uint64'
                            }
                        },
                    'p2': {
                        'type': 'array',
                        'items': {
                            'type': 'array',
                            'items': {
                                'type': 'string',
                                'format': 'date-time'
                                }
                            }
                        }
                    }
                }
            }
        })
    gen.AnnotateApiForLanguage(gen.api)
    found_big_integer = False
    found_date_time = False
    for schema in list(gen._api._schemas.values()):
      import_manager = schema.values.get('importManager')
      for import_list in import_manager.ImportLists():
        for import_def in import_list:
          if import_def.find('BigInteger'):
            found_big_integer = True
          if import_def.find('DateTime'):
            found_date_time = True
    self.assertTrue(found_big_integer)
    self.assertTrue(found_date_time)


class JavaLanguageModelTest(absltest.TestCase):
  """Tests for features implemented in the language model."""


  def testDefaultPath(self):
    """Test the package path generation."""
    def MakeGen(host):
      gen = java_generator.BaseJavaGenerator({
          'name': 'fake',
          'version': 'v1',
          'rootUrl': 'https://%s/' % host,
          'servicePath': 'fake/v1',
          'ownerDomain': host,
          })
      gen.AnnotateApiForLanguage(gen.api)
      return gen

    gen = MakeGen('google.com')
    self.assertEqual('com/google/api/services/fake', gen.api.module.path)
    self.assertEqual('com/google/api/services/fake/model',
                      gen.api.model_module.path)

    gen = MakeGen('not-google.com')
    self.assertEqual('com/not_google/fake', gen.api.module.path)
    self.assertEqual('com.not_google.fake', gen.api.module.name)
    gen = MakeGen('my-custom_app.appspot.com')
    self.assertEqual('com/appspot/my_custom_app/fake', gen.api.module.path)

  def testDefaultPathWithPackagePathAndCanonicalName(self):
    """Test the package path generation."""
    def MakeGen():
      api_def = {
          'name': 'fake',
          'version': 'v1',
          'rootUrl': 'https://www.googleapis.com/',
          'servicePath': 'fake/v1',
          'ownerDomain': 'google.com',
          'packagePath': 'my/path',
          'canonicalName': 'Canonical Name'
      }
      gen = java_generator.BaseJavaGenerator(
          api_def, options={'google_api': True})
      gen.AnnotateApiForLanguage(gen.api)
      return gen

    gen = MakeGen()
    self.assertEqual('com/google/api/services/my/path/canonicalname',
                      gen.api.module.path)
    self.assertEqual('com/google/api/services/my/path/canonicalname/model',
                      gen.api.model_module.path)

  def testAllowedCharacters(self):
    # make sure $ is allowed in a name and that @ is not

    model = java_generator.JavaLanguageModel()
    self.assertEqual('$ref',
                      model.TransformString(None, '$ref', model.member_policy))
    self.assertEqual('set$ref',
                      model.TransformString(None, '$ref', model.setter_policy))
    self.assertEqual('getId',
                      model.TransformString(None, '@id', model.getter_policy))


class JavaLanguageModelDataValueTest(absltest.TestCase):
  """Tests for DataValue integration."""

  def setUp(self):
    self.language_model = java_generator.JavaLanguageModel()

  def _CreateDataValue(self, value, val_type):
    def_dict = {
        'className': 'Foo',
        'type': val_type,
        }
    prototype = data_types.DataType(
        def_dict, None, language_model=self.language_model)
    dv = data_value.DataValue(value, prototype)
    return dv

  def testRenderBoolean(self):
    dv = self._CreateDataValue(True, 'boolean')
    render_method = self.language_model._SUPPORTED_TYPES['boolean']
    self.assertEqual('true', render_method(dv))

    dv.SetValue(False)
    self.assertEqual('false', render_method(dv))

  def testRenderInteger(self):
    dv = self._CreateDataValue(42, 'integer')
    render_method = self.language_model._SUPPORTED_TYPES['integer']
    self.assertRaises(ValueError, render_method, dv)

    dv.SetTemplateValue('codeType', 'java.lang.Long')
    self.assertEqual('42L', render_method(dv))


class Java14LanguageModelTest(absltest.TestCase):

  def setUp(self):
    self.language_model = java_generator.JavaLanguageModel()

  def _CreateDataValue(self, value, val_type):
    def_dict = {
        'className': 'Foo',
        'type': val_type,
        }
    prototype = data_types.DataType(
        def_dict, None, language_model=self.language_model)
    dv = data_value.DataValue(value, prototype)
    return dv

  def testRenderBoolean(self):
    dv = self._CreateDataValue(True, 'boolean')
    render_method = self.language_model._SUPPORTED_TYPES['boolean']
    self.assertEqual('true', render_method(dv))

    dv.SetValue(False)
    self.assertEqual('false', render_method(dv))


if __name__ == '__main__':
  absltest.main()
