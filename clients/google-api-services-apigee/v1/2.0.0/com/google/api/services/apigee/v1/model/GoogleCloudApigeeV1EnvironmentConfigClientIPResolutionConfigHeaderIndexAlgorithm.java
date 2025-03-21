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

package com.google.api.services.apigee.v1.model;

/**
 * Resolves the client ip based on a custom header.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1EnvironmentConfigClientIPResolutionConfigHeaderIndexAlgorithm extends com.google.api.client.json.GenericJson {

  /**
   * The index of the ip in the header. (By default, value is 0 if missing)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer ipHeaderIndex;

  /**
   * The name of the header to extract the client ip from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipHeaderName;

  /**
   * The index of the ip in the header. (By default, value is 0 if missing)
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIpHeaderIndex() {
    return ipHeaderIndex;
  }

  /**
   * The index of the ip in the header. (By default, value is 0 if missing)
   * @param ipHeaderIndex ipHeaderIndex or {@code null} for none
   */
  public GoogleCloudApigeeV1EnvironmentConfigClientIPResolutionConfigHeaderIndexAlgorithm setIpHeaderIndex(java.lang.Integer ipHeaderIndex) {
    this.ipHeaderIndex = ipHeaderIndex;
    return this;
  }

  /**
   * The name of the header to extract the client ip from.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpHeaderName() {
    return ipHeaderName;
  }

  /**
   * The name of the header to extract the client ip from.
   * @param ipHeaderName ipHeaderName or {@code null} for none
   */
  public GoogleCloudApigeeV1EnvironmentConfigClientIPResolutionConfigHeaderIndexAlgorithm setIpHeaderName(java.lang.String ipHeaderName) {
    this.ipHeaderName = ipHeaderName;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1EnvironmentConfigClientIPResolutionConfigHeaderIndexAlgorithm set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1EnvironmentConfigClientIPResolutionConfigHeaderIndexAlgorithm) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1EnvironmentConfigClientIPResolutionConfigHeaderIndexAlgorithm clone() {
    return (GoogleCloudApigeeV1EnvironmentConfigClientIPResolutionConfigHeaderIndexAlgorithm) super.clone();
  }

}
