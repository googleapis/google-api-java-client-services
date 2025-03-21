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

package com.google.api.services.discoveryengine.v1alpha.model;

/**
 * Metadata and configurations for a Google Cloud project in the service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1Project extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The timestamp when this project is created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. Full resource name of the project, for example `projects/{project}`. Note that
   * when making requests, project number and project id are both acceptable, but the server will
   * always respond in project number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The timestamp when this project is successfully provisioned. Empty value means
   * this project is still provisioning and is not ready for use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String provisionCompletionTime;

  /**
   * Output only. A map of terms of services. The key is the `id` of ServiceTerms.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudDiscoveryengineV1ProjectServiceTerms> serviceTermsMap;

  /**
   * Output only. The timestamp when this project is created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The timestamp when this project is created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Project setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. Full resource name of the project, for example `projects/{project}`. Note that
   * when making requests, project number and project id are both acceptable, but the server will
   * always respond in project number.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Full resource name of the project, for example `projects/{project}`. Note that
   * when making requests, project number and project id are both acceptable, but the server will
   * always respond in project number.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Project setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The timestamp when this project is successfully provisioned. Empty value means
   * this project is still provisioning and is not ready for use.
   * @return value or {@code null} for none
   */
  public String getProvisionCompletionTime() {
    return provisionCompletionTime;
  }

  /**
   * Output only. The timestamp when this project is successfully provisioned. Empty value means
   * this project is still provisioning and is not ready for use.
   * @param provisionCompletionTime provisionCompletionTime or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Project setProvisionCompletionTime(String provisionCompletionTime) {
    this.provisionCompletionTime = provisionCompletionTime;
    return this;
  }

  /**
   * Output only. A map of terms of services. The key is the `id` of ServiceTerms.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudDiscoveryengineV1ProjectServiceTerms> getServiceTermsMap() {
    return serviceTermsMap;
  }

  /**
   * Output only. A map of terms of services. The key is the `id` of ServiceTerms.
   * @param serviceTermsMap serviceTermsMap or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Project setServiceTermsMap(java.util.Map<String, GoogleCloudDiscoveryengineV1ProjectServiceTerms> serviceTermsMap) {
    this.serviceTermsMap = serviceTermsMap;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1Project set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1Project) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1Project clone() {
    return (GoogleCloudDiscoveryengineV1Project) super.clone();
  }

}
