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

package com.google.api.services.analyticsadmin.v1alpha.model;

/**
 * Request message for CreateRollupProperty RPC.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Admin API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAnalyticsAdminV1alphaCreateRollupPropertyRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The roll-up property to create.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAnalyticsAdminV1alphaProperty rollupProperty;

  /**
   * Optional. The resource names of properties that will be sources to the created roll-up
   * property.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> sourceProperties;

  /**
   * Required. The roll-up property to create.
   * @return value or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaProperty getRollupProperty() {
    return rollupProperty;
  }

  /**
   * Required. The roll-up property to create.
   * @param rollupProperty rollupProperty or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaCreateRollupPropertyRequest setRollupProperty(GoogleAnalyticsAdminV1alphaProperty rollupProperty) {
    this.rollupProperty = rollupProperty;
    return this;
  }

  /**
   * Optional. The resource names of properties that will be sources to the created roll-up
   * property.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSourceProperties() {
    return sourceProperties;
  }

  /**
   * Optional. The resource names of properties that will be sources to the created roll-up
   * property.
   * @param sourceProperties sourceProperties or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaCreateRollupPropertyRequest setSourceProperties(java.util.List<java.lang.String> sourceProperties) {
    this.sourceProperties = sourceProperties;
    return this;
  }

  @Override
  public GoogleAnalyticsAdminV1alphaCreateRollupPropertyRequest set(String fieldName, Object value) {
    return (GoogleAnalyticsAdminV1alphaCreateRollupPropertyRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleAnalyticsAdminV1alphaCreateRollupPropertyRequest clone() {
    return (GoogleAnalyticsAdminV1alphaCreateRollupPropertyRequest) super.clone();
  }

}
