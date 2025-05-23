/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.datastore.v1.model;

/**
 * A transformation of an entity property.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PropertyTransform extends com.google.api.client.json.GenericJson {

  /**
   * Appends the given elements in order if they are not already present in the current property
   * value. If the property is not an array, or if the property does not yet exist, it is first set
   * to the empty array. Equivalent numbers of different types (e.g. 3L and 3.0) are considered
   * equal when checking if a value is missing. NaN is equal to NaN, and the null value is equal to
   * the null value. If the input contains multiple equivalent values, only the first will be
   * considered. The corresponding transform result will be the null value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ArrayValue appendMissingElements;

  /**
   * Adds the given value to the property's current value. This must be an integer or a double
   * value. If the property is not an integer or double, or if the property does not yet exist, the
   * transformation will set the property to the given value. If either of the given value or the
   * current property value are doubles, both values will be interpreted as doubles. Double
   * arithmetic and representation of double values follows IEEE 754 semantics. If there is
   * positive/negative integer overflow, the property is resolved to the largest magnitude
   * positive/negative integer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Value increment;

  /**
   * Sets the property to the maximum of its current value and the given value. This must be an
   * integer or a double value. If the property is not an integer or double, or if the property does
   * not yet exist, the transformation will set the property to the given value. If a maximum
   * operation is applied where the property and the input value are of mixed types (that is - one
   * is an integer and one is a double) the property takes on the type of the larger operand. If the
   * operands are equivalent (e.g. 3 and 3.0), the property does not change. 0, 0.0, and -0.0 are
   * all zero. The maximum of a zero stored value and zero input value is always the stored value.
   * The maximum of any numeric value x and NaN is NaN.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Value maximum;

  /**
   * Sets the property to the minimum of its current value and the given value. This must be an
   * integer or a double value. If the property is not an integer or double, or if the property does
   * not yet exist, the transformation will set the property to the input value. If a minimum
   * operation is applied where the property and the input value are of mixed types (that is - one
   * is an integer and one is a double) the property takes on the type of the smaller operand. If
   * the operands are equivalent (e.g. 3 and 3.0), the property does not change. 0, 0.0, and -0.0
   * are all zero. The minimum of a zero stored value and zero input value is always the stored
   * value. The minimum of any numeric value x and NaN is NaN.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Value minimum;

  /**
   * Optional. The name of the property. Property paths (a list of property names separated by dots
   * (`.`)) may be used to refer to properties inside entity values. For example `foo.bar` means the
   * property `bar` inside the entity property `foo`. If a property name contains a dot `.` or a
   * backlslash `\`, then that name must be escaped.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String property;

  /**
   * Removes all of the given elements from the array in the property. If the property is not an
   * array, or if the property does not yet exist, it is set to the empty array. Equivalent numbers
   * of different types (e.g. 3L and 3.0) are considered equal when deciding whether an element
   * should be removed. NaN is equal to NaN, and the null value is equal to the null value. This
   * will remove all equivalent values if there are duplicates. The corresponding transform result
   * will be the null value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ArrayValue removeAllFromArray;

  /**
   * Sets the property to the given server value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String setToServerValue;

  /**
   * Appends the given elements in order if they are not already present in the current property
   * value. If the property is not an array, or if the property does not yet exist, it is first set
   * to the empty array. Equivalent numbers of different types (e.g. 3L and 3.0) are considered
   * equal when checking if a value is missing. NaN is equal to NaN, and the null value is equal to
   * the null value. If the input contains multiple equivalent values, only the first will be
   * considered. The corresponding transform result will be the null value.
   * @return value or {@code null} for none
   */
  public ArrayValue getAppendMissingElements() {
    return appendMissingElements;
  }

  /**
   * Appends the given elements in order if they are not already present in the current property
   * value. If the property is not an array, or if the property does not yet exist, it is first set
   * to the empty array. Equivalent numbers of different types (e.g. 3L and 3.0) are considered
   * equal when checking if a value is missing. NaN is equal to NaN, and the null value is equal to
   * the null value. If the input contains multiple equivalent values, only the first will be
   * considered. The corresponding transform result will be the null value.
   * @param appendMissingElements appendMissingElements or {@code null} for none
   */
  public PropertyTransform setAppendMissingElements(ArrayValue appendMissingElements) {
    this.appendMissingElements = appendMissingElements;
    return this;
  }

  /**
   * Adds the given value to the property's current value. This must be an integer or a double
   * value. If the property is not an integer or double, or if the property does not yet exist, the
   * transformation will set the property to the given value. If either of the given value or the
   * current property value are doubles, both values will be interpreted as doubles. Double
   * arithmetic and representation of double values follows IEEE 754 semantics. If there is
   * positive/negative integer overflow, the property is resolved to the largest magnitude
   * positive/negative integer.
   * @return value or {@code null} for none
   */
  public Value getIncrement() {
    return increment;
  }

  /**
   * Adds the given value to the property's current value. This must be an integer or a double
   * value. If the property is not an integer or double, or if the property does not yet exist, the
   * transformation will set the property to the given value. If either of the given value or the
   * current property value are doubles, both values will be interpreted as doubles. Double
   * arithmetic and representation of double values follows IEEE 754 semantics. If there is
   * positive/negative integer overflow, the property is resolved to the largest magnitude
   * positive/negative integer.
   * @param increment increment or {@code null} for none
   */
  public PropertyTransform setIncrement(Value increment) {
    this.increment = increment;
    return this;
  }

  /**
   * Sets the property to the maximum of its current value and the given value. This must be an
   * integer or a double value. If the property is not an integer or double, or if the property does
   * not yet exist, the transformation will set the property to the given value. If a maximum
   * operation is applied where the property and the input value are of mixed types (that is - one
   * is an integer and one is a double) the property takes on the type of the larger operand. If the
   * operands are equivalent (e.g. 3 and 3.0), the property does not change. 0, 0.0, and -0.0 are
   * all zero. The maximum of a zero stored value and zero input value is always the stored value.
   * The maximum of any numeric value x and NaN is NaN.
   * @return value or {@code null} for none
   */
  public Value getMaximum() {
    return maximum;
  }

  /**
   * Sets the property to the maximum of its current value and the given value. This must be an
   * integer or a double value. If the property is not an integer or double, or if the property does
   * not yet exist, the transformation will set the property to the given value. If a maximum
   * operation is applied where the property and the input value are of mixed types (that is - one
   * is an integer and one is a double) the property takes on the type of the larger operand. If the
   * operands are equivalent (e.g. 3 and 3.0), the property does not change. 0, 0.0, and -0.0 are
   * all zero. The maximum of a zero stored value and zero input value is always the stored value.
   * The maximum of any numeric value x and NaN is NaN.
   * @param maximum maximum or {@code null} for none
   */
  public PropertyTransform setMaximum(Value maximum) {
    this.maximum = maximum;
    return this;
  }

  /**
   * Sets the property to the minimum of its current value and the given value. This must be an
   * integer or a double value. If the property is not an integer or double, or if the property does
   * not yet exist, the transformation will set the property to the input value. If a minimum
   * operation is applied where the property and the input value are of mixed types (that is - one
   * is an integer and one is a double) the property takes on the type of the smaller operand. If
   * the operands are equivalent (e.g. 3 and 3.0), the property does not change. 0, 0.0, and -0.0
   * are all zero. The minimum of a zero stored value and zero input value is always the stored
   * value. The minimum of any numeric value x and NaN is NaN.
   * @return value or {@code null} for none
   */
  public Value getMinimum() {
    return minimum;
  }

  /**
   * Sets the property to the minimum of its current value and the given value. This must be an
   * integer or a double value. If the property is not an integer or double, or if the property does
   * not yet exist, the transformation will set the property to the input value. If a minimum
   * operation is applied where the property and the input value are of mixed types (that is - one
   * is an integer and one is a double) the property takes on the type of the smaller operand. If
   * the operands are equivalent (e.g. 3 and 3.0), the property does not change. 0, 0.0, and -0.0
   * are all zero. The minimum of a zero stored value and zero input value is always the stored
   * value. The minimum of any numeric value x and NaN is NaN.
   * @param minimum minimum or {@code null} for none
   */
  public PropertyTransform setMinimum(Value minimum) {
    this.minimum = minimum;
    return this;
  }

  /**
   * Optional. The name of the property. Property paths (a list of property names separated by dots
   * (`.`)) may be used to refer to properties inside entity values. For example `foo.bar` means the
   * property `bar` inside the entity property `foo`. If a property name contains a dot `.` or a
   * backlslash `\`, then that name must be escaped.
   * @return value or {@code null} for none
   */
  public java.lang.String getProperty() {
    return property;
  }

  /**
   * Optional. The name of the property. Property paths (a list of property names separated by dots
   * (`.`)) may be used to refer to properties inside entity values. For example `foo.bar` means the
   * property `bar` inside the entity property `foo`. If a property name contains a dot `.` or a
   * backlslash `\`, then that name must be escaped.
   * @param property property or {@code null} for none
   */
  public PropertyTransform setProperty(java.lang.String property) {
    this.property = property;
    return this;
  }

  /**
   * Removes all of the given elements from the array in the property. If the property is not an
   * array, or if the property does not yet exist, it is set to the empty array. Equivalent numbers
   * of different types (e.g. 3L and 3.0) are considered equal when deciding whether an element
   * should be removed. NaN is equal to NaN, and the null value is equal to the null value. This
   * will remove all equivalent values if there are duplicates. The corresponding transform result
   * will be the null value.
   * @return value or {@code null} for none
   */
  public ArrayValue getRemoveAllFromArray() {
    return removeAllFromArray;
  }

  /**
   * Removes all of the given elements from the array in the property. If the property is not an
   * array, or if the property does not yet exist, it is set to the empty array. Equivalent numbers
   * of different types (e.g. 3L and 3.0) are considered equal when deciding whether an element
   * should be removed. NaN is equal to NaN, and the null value is equal to the null value. This
   * will remove all equivalent values if there are duplicates. The corresponding transform result
   * will be the null value.
   * @param removeAllFromArray removeAllFromArray or {@code null} for none
   */
  public PropertyTransform setRemoveAllFromArray(ArrayValue removeAllFromArray) {
    this.removeAllFromArray = removeAllFromArray;
    return this;
  }

  /**
   * Sets the property to the given server value.
   * @return value or {@code null} for none
   */
  public java.lang.String getSetToServerValue() {
    return setToServerValue;
  }

  /**
   * Sets the property to the given server value.
   * @param setToServerValue setToServerValue or {@code null} for none
   */
  public PropertyTransform setSetToServerValue(java.lang.String setToServerValue) {
    this.setToServerValue = setToServerValue;
    return this;
  }

  @Override
  public PropertyTransform set(String fieldName, Object value) {
    return (PropertyTransform) super.set(fieldName, value);
  }

  @Override
  public PropertyTransform clone() {
    return (PropertyTransform) super.clone();
  }

}
