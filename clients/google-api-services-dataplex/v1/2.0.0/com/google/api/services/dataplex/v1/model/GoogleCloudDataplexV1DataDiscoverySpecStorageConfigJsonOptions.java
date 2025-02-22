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

package com.google.api.services.dataplex.v1.model;

/**
 * Describes JSON data format.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataplex API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDataplexV1DataDiscoverySpecStorageConfigJsonOptions extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The character encoding of the data. The default is UTF-8.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String encoding;

  /**
   * Optional. Whether to disable the inference of data types for JSON data. If true, all columns
   * are registered as their primitive types (strings, number, or boolean).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean typeInferenceDisabled;

  /**
   * Optional. The character encoding of the data. The default is UTF-8.
   * @return value or {@code null} for none
   */
  public java.lang.String getEncoding() {
    return encoding;
  }

  /**
   * Optional. The character encoding of the data. The default is UTF-8.
   * @param encoding encoding or {@code null} for none
   */
  public GoogleCloudDataplexV1DataDiscoverySpecStorageConfigJsonOptions setEncoding(java.lang.String encoding) {
    this.encoding = encoding;
    return this;
  }

  /**
   * Optional. Whether to disable the inference of data types for JSON data. If true, all columns
   * are registered as their primitive types (strings, number, or boolean).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTypeInferenceDisabled() {
    return typeInferenceDisabled;
  }

  /**
   * Optional. Whether to disable the inference of data types for JSON data. If true, all columns
   * are registered as their primitive types (strings, number, or boolean).
   * @param typeInferenceDisabled typeInferenceDisabled or {@code null} for none
   */
  public GoogleCloudDataplexV1DataDiscoverySpecStorageConfigJsonOptions setTypeInferenceDisabled(java.lang.Boolean typeInferenceDisabled) {
    this.typeInferenceDisabled = typeInferenceDisabled;
    return this;
  }

  @Override
  public GoogleCloudDataplexV1DataDiscoverySpecStorageConfigJsonOptions set(String fieldName, Object value) {
    return (GoogleCloudDataplexV1DataDiscoverySpecStorageConfigJsonOptions) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDataplexV1DataDiscoverySpecStorageConfigJsonOptions clone() {
    return (GoogleCloudDataplexV1DataDiscoverySpecStorageConfigJsonOptions) super.clone();
  }

}
