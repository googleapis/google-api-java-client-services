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
 * Access Control Configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1alphaAclConfig extends com.google.api.client.json.GenericJson {

  /**
   * Identity provider config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaIdpConfig idpConfig;

  /**
   * Immutable. The full resource name of the acl configuration. Format:
   * `projects/{project}/locations/{location}/aclConfig`. This field must be a UTF-8 encoded string
   * with a length limit of 1024 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Identity provider config.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaIdpConfig getIdpConfig() {
    return idpConfig;
  }

  /**
   * Identity provider config.
   * @param idpConfig idpConfig or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaAclConfig setIdpConfig(GoogleCloudDiscoveryengineV1alphaIdpConfig idpConfig) {
    this.idpConfig = idpConfig;
    return this;
  }

  /**
   * Immutable. The full resource name of the acl configuration. Format:
   * `projects/{project}/locations/{location}/aclConfig`. This field must be a UTF-8 encoded string
   * with a length limit of 1024 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Immutable. The full resource name of the acl configuration. Format:
   * `projects/{project}/locations/{location}/aclConfig`. This field must be a UTF-8 encoded string
   * with a length limit of 1024 characters.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaAclConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaAclConfig set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1alphaAclConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaAclConfig clone() {
    return (GoogleCloudDiscoveryengineV1alphaAclConfig) super.clone();
  }

}
