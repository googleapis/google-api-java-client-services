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

package com.google.api.services.bigqueryconnection.v1.model;

/**
 * Connection properties specific to Salesforce DataCloud. This is intended for use only by
 * Salesforce partner projects.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery Connection API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SalesforceDataCloudProperties extends com.google.api.client.json.GenericJson {

  /**
   * Output only. A unique Google-owned and Google-generated service account identity for the
   * connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String identity;

  /**
   * The URL to the user's Salesforce DataCloud instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instanceUri;

  /**
   * The ID of the user's Salesforce tenant.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tenantId;

  /**
   * Output only. A unique Google-owned and Google-generated service account identity for the
   * connection.
   * @return value or {@code null} for none
   */
  public java.lang.String getIdentity() {
    return identity;
  }

  /**
   * Output only. A unique Google-owned and Google-generated service account identity for the
   * connection.
   * @param identity identity or {@code null} for none
   */
  public SalesforceDataCloudProperties setIdentity(java.lang.String identity) {
    this.identity = identity;
    return this;
  }

  /**
   * The URL to the user's Salesforce DataCloud instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstanceUri() {
    return instanceUri;
  }

  /**
   * The URL to the user's Salesforce DataCloud instance.
   * @param instanceUri instanceUri or {@code null} for none
   */
  public SalesforceDataCloudProperties setInstanceUri(java.lang.String instanceUri) {
    this.instanceUri = instanceUri;
    return this;
  }

  /**
   * The ID of the user's Salesforce tenant.
   * @return value or {@code null} for none
   */
  public java.lang.String getTenantId() {
    return tenantId;
  }

  /**
   * The ID of the user's Salesforce tenant.
   * @param tenantId tenantId or {@code null} for none
   */
  public SalesforceDataCloudProperties setTenantId(java.lang.String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  @Override
  public SalesforceDataCloudProperties set(String fieldName, Object value) {
    return (SalesforceDataCloudProperties) super.set(fieldName, value);
  }

  @Override
  public SalesforceDataCloudProperties clone() {
    return (SalesforceDataCloudProperties) super.clone();
  }

}
