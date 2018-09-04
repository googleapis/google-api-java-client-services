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

"""Java library generator.

Specializations to the code Generator for Java bindings. This class also serves
as a superclass for GWT generation, since that shares Java's naming rules.
"""

__author__ = 'aiuto@google.com (Tony Aiuto)'

from googleapis.codegen import api
from googleapis.codegen import api_library_generator
from googleapis.codegen import data_types
from googleapis.codegen import language_model
from googleapis.codegen import utilities
from googleapis.codegen.import_definition import ImportDefinition
from googleapis.codegen.java_import_manager import JavaImportManager
from googleapis.codegen.utilities import maven_utils


class BaseJavaGenerator(api_library_generator.ApiLibraryGenerator):
  """Base for Java code generators."""

  # pylint: disable=redefined-outer-name
  def __init__(self, discovery, language='java', language_model=None,
               options=None):
    if not language_model:
      language_model = self._GetDefaultLanguageModel(options)
    super(BaseJavaGenerator, self).__init__(JavaApi, discovery, language,
                                            language_model, options=options)

  @classmethod
  def _GetDefaultLanguageModel(cls, options=None):
    return JavaLanguageModel(options=options)

  def _InnerModelClassesSupported(self):
    """Gets whether or not inner model classes are supported."""
    return True

  def AnnotateApi(self, the_api):
    """Annotate the Api dictionary with Java specifics."""
    the_api.SetTemplateValue(
        'maven',
        maven_utils.GetMavenMetadata(the_api, self.language_version),
        'maven metadata')

  def AnnotateParameter(self, unused_method, parameter):
    """Annotate a Parameter with Java specific elements."""
    self._HandleImports(parameter)

  def AnnotateProperty(self, unused_api, prop, unused_schema):
    """Annotate a Property with Java specific elements."""
    self._HandleImports(prop)

  def _HandleImports(self, element):
    """Handles imports for the specified element.

    Args:
      element: (Property|Parameter) The property we want to set the import for.
    """
    # Get the parent of this Property/Parameter.
    parent = element.schema
    if self._InnerModelClassesSupported():
      # If inner classes are supported find the top level parent to set
      # imports for.
      while parent.parent:
        parent = parent.parent
    import_manager = JavaImportManager.GetCachedImportManager(parent)

    # For collections, we have to get the imports for the first non-collection
    # up the base_type chain.
    data_type = element.data_type
    json_type = data_type.json_type
    while json_type == 'array' or json_type == 'map':
      data_type = data_type._base_type  # pylint: disable=protected-access
      json_type = data_type.json_type
    json_format = data_type.values.get('format')

    type_format_to_datatype_and_imports = self.language_model.type_map
    datatype_and_imports = (
        type_format_to_datatype_and_imports.get((json_type, json_format)))
    if datatype_and_imports:
      import_definition = datatype_and_imports[1]
      # Import all required imports.
      for required_import in import_definition.imports:
        import_manager.AddImport(required_import)
      # Set all template values, if specified.
      for template_value in import_definition.template_values:
        element.SetTemplateValue(template_value, True)


class Java14Generator(BaseJavaGenerator):
  """A Java generator for language version 1.14 and higher."""

  @classmethod
  def _GetDefaultLanguageModel(cls, options=None):
    return JavaLanguageModel(options=options)


def _SimpleType(class_name, primative_type=None):
  """Type definition for classes with no primitives or special imports."""
  return (class_name, ImportDefinition([class_name]), primative_type)


class JavaLanguageModel(language_model.LanguageModel):
  """A LanguageModel tuned for Java."""

  language = 'java'

  _JSON_STRING_IMPORT = 'com.google.api.client.json.JsonString'
  _JSON_STRING_TEMPLATE_VALUE = 'requiresJsonString'
  member_policy = language_model.NamingPolicy(language_model.LOWER_CAMEL_CASE)
  getter_policy = language_model.NamingPolicy(
      language_model.UPPER_CAMEL_CASE, 'get{name}')
  setter_policy = language_model.NamingPolicy(
      language_model.UPPER_CAMEL_CASE, 'set{name}')
  has_policy = language_model.NamingPolicy(
      language_model.UPPER_CAMEL_CASE, 'has{name}')
  array_of_policy = language_model.NamingPolicy(
      format_string='java.util.List<{name}>')
  map_of_policy = language_model.NamingPolicy(
      format_string='java.util.Map<String, {name}>')
  constant_policy = language_model.NamingPolicy(
      case_transform=language_model.UPPER_UNCAMEL_CASE,
      separator='_')
  enum_policy = language_model.NamingPolicy(
      language_model.UPPER_CAMEL_CASE,
      format_string='{name}Values')

  # Dictionary of json type and format to its corresponding data type and
  # import definition. The first import in the imports list is the primary
  # import.
  _TYPE_BOOLEAN = _SimpleType('java.lang.Boolean', primative_type='boolean')
  _TYPE_DOUBLE = _SimpleType('java.lang.Double', primative_type='double')
  _TYPE_FLOAT = _SimpleType('java.lang.Float', primative_type='float')
  _TYPE_INTEGER = _SimpleType('java.lang.Integer', primative_type='int')
  _TYPE_LONG = _SimpleType('java.lang.Long', primative_type='long')
  _TYPE_SHORT = _SimpleType('java.lang.Short', primative_type='short')
  _TYPE_DATETIME = ('com.google.api.client.util.DateTime',
                    ImportDefinition(['com.google.api.client.util.DateTime']),
                    None)
  _TYPE_STRING = _SimpleType('java.lang.String')

  _TYPE_FORMAT_TO_DATATYPE_AND_IMPORTS = {
      ('any', None): _SimpleType('java.lang.Object'),
      ('boolean', None): _TYPE_BOOLEAN,
      ('integer', None): _TYPE_INTEGER,
      ('integer', 'int16'): _TYPE_SHORT,
      ('integer', 'int32'): _TYPE_INTEGER,
      # We prefer Long here over UnsignedInteger because Long has built-in
      # support for autoboxing in Java.
      ('integer', 'uint32'): _TYPE_LONG,
      # TODO(user): Switch to java.lang.Number in a separate CL.
      # ('number', None): _SimpleType('java.lang.Number'),
      ('number', None): ('Number', ImportDefinition(), None),
      ('number', 'double'): _TYPE_DOUBLE,
      ('number', 'float'): _TYPE_FLOAT,
      ('object', None): _SimpleType('java.lang.Object'),
      ('string', None): _TYPE_STRING,
      ('string', 'byte'): _TYPE_STRING,
      ('string', 'date'): _TYPE_DATETIME,
      ('string', 'date-time'): _TYPE_DATETIME,
      ('string', 'int64'): ('java.lang.Long',
                            ImportDefinition(
                                ['java.lang.Long', _JSON_STRING_IMPORT],
                                [_JSON_STRING_TEMPLATE_VALUE]),
                            'long'),
      ('string', 'uint64'): ('java.math.BigInteger',
                             ImportDefinition(
                                 ['java.math.BigInteger', _JSON_STRING_IMPORT],
                                 [_JSON_STRING_TEMPLATE_VALUE]),
                             None),
      }

  _JAVA_KEYWORDS = [
      'abstract', 'assert', 'boolean', 'break', 'byte', 'case', 'catch', 'char',
      'class', 'const', 'continue', 'default', 'do', 'double', 'else', 'enum',
      'extends', 'final', 'finally', 'float', 'for', 'goto', 'if', 'implements',
      'import', 'instanceof', 'int', 'interface', 'long', 'native', 'new',
      'package', 'private', 'protected', 'public', 'return', 'short', 'static',
      'strictfp', 'super', 'switch', 'synchronized', 'this', 'throw', 'throws',
      'transient', 'try', 'void', 'volatile', 'while'
      ]

  # TODO(user): Remove this. We should instead be using fully qualified names
  # for models to avoid collisions. This will be fixed in Bug 6448720.
  _SPECIAL_CLASS_NAMES = [
      # Required because GenericData extends AbstractMap<String, Object>
      'entry'
      ]

  # We can not create classes which match a Java keyword or built in object
  # type.
  RESERVED_CLASS_NAMES = _JAVA_KEYWORDS + _SPECIAL_CLASS_NAMES + [
      'float', 'integer', 'object', 'string', 'true', 'false', 'null'
      ]

  allowed_characters = '$'
  reserved_words = RESERVED_CLASS_NAMES

  def __init__(self, options=None):
    super(JavaLanguageModel, self).__init__(class_name_delimiter='.')
    self._type_map = JavaLanguageModel._TYPE_FORMAT_TO_DATATYPE_AND_IMPORTS

    self._SUPPORTED_TYPES['boolean'] = self._Boolean
    self._SUPPORTED_TYPES['integer'] = self._Int
    self._options = options

  def _Boolean(self, data_value):
    """Convert provided boolean to language specific literal."""
    return unicode(bool(data_value.value)).lower()

  def _Int(self, data_value):
    """Convert provided int to language specific literal."""
    # Available types can be found in class variables
    code_types = {
        'java.lang.Short': '%s',
        'java.lang.Integer': '%s',
        'java.lang.Long': '%sL',
    }
    try:
      return code_types[data_value.code_type] % long(data_value.value)
    except KeyError:
      raise ValueError(
          ('Provided DataValue (%s) does not present an appropriate Java '
           'annotated code type (%s).') %
          (data_value.value, data_value.code_type))

  @property
  def type_map(self):
    return self._type_map

  def _GetTypeInfo(self, def_dict):
    """Returns a tuple of type information for a json schema data dict.

    For the dictionary containing {type, [format]}, return the tuple of the form
      (Java class name, ImportDefinition, Java primitive data type)
    describing the appropriate Java data type.

    Args:
      def_dict: (dict) JSON schema data definition.
    Returns:
      tuple of (class name, ImportDefinition, primitive data type).
    """
    json_type = def_dict.get('type', 'string')
    json_format = def_dict.get('format')
    result = self.type_map.get((json_type, json_format))
    if result:
      return result

    # TODO(user): Uncomment this and update golden files.
    # result = self.type_map.get((json_type, None))
    # if result:
    #   return result
    #
    # raise ValueError('Unknown type: %s format: %s' % (json_type, json_format))

    return (utilities.CamelCase(json_type), None, None)

  def GetCodeTypeFromDictionary(self, def_dict):
    """Convert a json schema type to a suitable Java type name.

    Overrides the default.

    Args:
      def_dict: (dict) A dictionary describing Json schema for this Property.
    Returns:
      A name suitable for use as a class in the generator's target language.
    """
    return self._GetTypeInfo(def_dict)[0]

  def GetPrimitiveTypeFromDictionary(self, def_dict):
    """Convert a json schema type to a suitable Java primitive name or None.

    Overrides the default.

    Args:
      def_dict: (dict) A dictionary describing Json schema for this Property.
    Returns:
      A name suitable for use as a primitive in the generator's target language.
    """
    return self._GetTypeInfo(def_dict)[2]

  def ToMemberName(self, s, the_api):
    """CamelCase a wire format name into a suitable Java variable name."""
    camel_s = utilities.CamelCase(s)
    if s.lower() in JavaLanguageModel.RESERVED_CLASS_NAMES:
      # Prepend the service name
      return '%s%s' % (the_api.values['name'], camel_s)
    return camel_s[0].lower() + camel_s[1:]

  def ToSafeClassName(self, s, the_api, parent=None):
    """Convert a name to a suitable class name in Java.

    Subclasses should override as appropriate.

    Args:
      s: (str) A canonical name for data element. (Usually the API wire format)
      the_api: (Api) The API this element is part of. For use as a hint when the
        name cannot be used directly.
      parent: (schema) The parent we use to get a safe class name.
    Returns:
      A name suitable for use as an element in Java.
    """
    safe_class_name = utilities.CamelCase(s)
    if parent:
      for ancestor in parent.full_path:
        if ancestor.safeClassName == safe_class_name:
          safe_class_name = '%s%s' % (parent.class_name, safe_class_name)
    if safe_class_name.lower() in JavaLanguageModel.RESERVED_CLASS_NAMES:
      api_name = utilities.CamelCase(the_api.values['name'])
      if utilities.CamelCase(the_api.values['canonicalName']):
        # Use canonical name if specified.
        api_name = utilities.CamelCase(
            the_api.values['canonicalName']).replace(' ', '')
      # Prepend the API name
      safe_class_name = '%s%s' % (api_name, utilities.CamelCase(s))
    return safe_class_name

  def ToPropertyGetterMethodWithDelim(self, prop_name):
    """Convert a property name to the name of the getter method that returns it.

    Args:
      prop_name: (str) The name of a property.
    Returns:
      A Java specific name of the getter method that returns the specified
      property. Eg: returns .getXyz for a property called xyz.
    """
    return '%sget%s()' % (self._class_name_delimiter,
                          utilities.CamelCase(prop_name))

  def CodeTypeForVoid(self):
    """Return the Java type name for a void.

    Overrides the default.

    Returns:
      (str) 'EmptyResponse'
    """
    return 'Void'

  def DefaultContainerPathForOwner(self, module):
    """Overrides the default."""
    return '/'.join(utilities.ReversedDomainComponents(module.owner_domain))


class JavaApi(api.Api):
  """An Api with Java annotations."""

  def __init__(self, discovery_doc, **unused_kwargs):
    super(JavaApi, self).__init__(discovery_doc)
    # Java puts the model classes in a module nested under the API, so adjust
    # the path accordingly.
    self.model_module.SetPath('model')

  def TopLevelModelClasses(self):
    """Return the models which are not children of another model.

    Adds an additional constraint on Api.TopLevelModelClasses to remove top
    level schemas which are arrays.

    Returns:
      list of Model.
    """
    return [m for m in self.ModelClasses()
            if not m.parent and not isinstance(m, data_types.ArrayDataType)]

  # pylint: disable=unused-argument
  def ToClassName(self, s, element, element_type=None):
    """Convert a discovery name to a suitable Java class name.

    In Java, nested class names cannot share the same name as the outer class
    name.

    Overrides the default.

    Args:
      s: (str) A rosy name of data element.
      element: (object) The object we need a class name for.
      element_type: (str) The kind of object we need a class name for.
    Returns:
      A name suitable for use as a class in the generator's target language.
    """
    # Camelcase what we have and account for spaces in canonical names
    name = utilities.CamelCase(s).replace(' ', '')
    if name.lower() in JavaLanguageModel.RESERVED_CLASS_NAMES:
      # Prepend the service name
      service = self._class_name or utilities.CamelCase(self.values['name'])
      return service + name

    if name == self.values.get('className'):
      if 'resource' == element_type:
        name += 'Operations'
      elif 'method' == element_type:
        name += 'Operation'
    return name
