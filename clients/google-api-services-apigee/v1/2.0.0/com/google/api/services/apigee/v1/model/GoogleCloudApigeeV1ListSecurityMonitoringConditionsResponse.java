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
 * Response for ListSecurityMonitoringConditions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1ListSecurityMonitoringConditionsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token that can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of security monitoring conditions in the organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1SecurityMonitoringCondition> securityMonitoringConditions;

  /**
   * A token that can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token that can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudApigeeV1ListSecurityMonitoringConditionsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * List of security monitoring conditions in the organization.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1SecurityMonitoringCondition> getSecurityMonitoringConditions() {
    return securityMonitoringConditions;
  }

  /**
   * List of security monitoring conditions in the organization.
   * @param securityMonitoringConditions securityMonitoringConditions or {@code null} for none
   */
  public GoogleCloudApigeeV1ListSecurityMonitoringConditionsResponse setSecurityMonitoringConditions(java.util.List<GoogleCloudApigeeV1SecurityMonitoringCondition> securityMonitoringConditions) {
    this.securityMonitoringConditions = securityMonitoringConditions;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1ListSecurityMonitoringConditionsResponse set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1ListSecurityMonitoringConditionsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1ListSecurityMonitoringConditionsResponse clone() {
    return (GoogleCloudApigeeV1ListSecurityMonitoringConditionsResponse) super.clone();
  }

}
