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

package com.google.api.services.retail.v2alpha.model;

/**
 * A floating point interval.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI Search for commerce API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2alphaInterval extends com.google.api.client.json.GenericJson {

  /**
   * Exclusive upper bound.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double exclusiveMaximum;

  /**
   * Exclusive lower bound.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double exclusiveMinimum;

  /**
   * Inclusive upper bound.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double maximum;

  /**
   * Inclusive lower bound.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double minimum;

  /**
   * Exclusive upper bound.
   * @return value or {@code null} for none
   */
  public java.lang.Double getExclusiveMaximum() {
    return exclusiveMaximum;
  }

  /**
   * Exclusive upper bound.
   * @param exclusiveMaximum exclusiveMaximum or {@code null} for none
   */
  public GoogleCloudRetailV2alphaInterval setExclusiveMaximum(java.lang.Double exclusiveMaximum) {
    this.exclusiveMaximum = exclusiveMaximum;
    return this;
  }

  /**
   * Exclusive lower bound.
   * @return value or {@code null} for none
   */
  public java.lang.Double getExclusiveMinimum() {
    return exclusiveMinimum;
  }

  /**
   * Exclusive lower bound.
   * @param exclusiveMinimum exclusiveMinimum or {@code null} for none
   */
  public GoogleCloudRetailV2alphaInterval setExclusiveMinimum(java.lang.Double exclusiveMinimum) {
    this.exclusiveMinimum = exclusiveMinimum;
    return this;
  }

  /**
   * Inclusive upper bound.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMaximum() {
    return maximum;
  }

  /**
   * Inclusive upper bound.
   * @param maximum maximum or {@code null} for none
   */
  public GoogleCloudRetailV2alphaInterval setMaximum(java.lang.Double maximum) {
    this.maximum = maximum;
    return this;
  }

  /**
   * Inclusive lower bound.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMinimum() {
    return minimum;
  }

  /**
   * Inclusive lower bound.
   * @param minimum minimum or {@code null} for none
   */
  public GoogleCloudRetailV2alphaInterval setMinimum(java.lang.Double minimum) {
    this.minimum = minimum;
    return this;
  }

  @Override
  public GoogleCloudRetailV2alphaInterval set(String fieldName, Object value) {
    return (GoogleCloudRetailV2alphaInterval) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2alphaInterval clone() {
    return (GoogleCloudRetailV2alphaInterval) super.clone();
  }

}
