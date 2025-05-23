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

package com.google.api.services.connectors.v1.model;

/**
 * AuthConfig defines details of a authentication type.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Connectors API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EndUserAuthentication extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Config variables for the EndUserAuthentication.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EndUserAuthenticationConfigVariable> configVariables;

  /**
   * Output only. Created time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. Destination configs for the EndUserAuthentication.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DestinationConfig> destinationConfigs;

  static {
    // hack to force ProGuard to consider DestinationConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DestinationConfig.class);
  }

  /**
   * Optional. The EndUserAuthenticationConfig for the EndUserAuthentication.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EndUserAuthenticationConfig endUserAuthenticationConfig;

  /**
   * Optional. Labels for the EndUserAuthentication.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> labels;

  /**
   * Required. Identifier. Resource name of the EndUserAuthentication. Format: projects/{project}/lo
   * cations/{location}/connections/{connection}/endUserAuthentications/{end_user_authentication}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. The destination to hit when we receive an event
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EndUserAuthenticationNotifyEndpointDestination notifyEndpointDestination;

  /**
   * Optional. Roles for the EndUserAuthentication.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> roles;

  /**
   * Optional. Status of the EndUserAuthentication.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EndUserAuthenticationEndUserAuthenticationStatus status;

  /**
   * Output only. Updated time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Optional. The user id of the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userId;

  /**
   * Optional. Config variables for the EndUserAuthentication.
   * @return value or {@code null} for none
   */
  public java.util.List<EndUserAuthenticationConfigVariable> getConfigVariables() {
    return configVariables;
  }

  /**
   * Optional. Config variables for the EndUserAuthentication.
   * @param configVariables configVariables or {@code null} for none
   */
  public EndUserAuthentication setConfigVariables(java.util.List<EndUserAuthenticationConfigVariable> configVariables) {
    this.configVariables = configVariables;
    return this;
  }

  /**
   * Output only. Created time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Created time.
   * @param createTime createTime or {@code null} for none
   */
  public EndUserAuthentication setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. Destination configs for the EndUserAuthentication.
   * @return value or {@code null} for none
   */
  public java.util.List<DestinationConfig> getDestinationConfigs() {
    return destinationConfigs;
  }

  /**
   * Optional. Destination configs for the EndUserAuthentication.
   * @param destinationConfigs destinationConfigs or {@code null} for none
   */
  public EndUserAuthentication setDestinationConfigs(java.util.List<DestinationConfig> destinationConfigs) {
    this.destinationConfigs = destinationConfigs;
    return this;
  }

  /**
   * Optional. The EndUserAuthenticationConfig for the EndUserAuthentication.
   * @return value or {@code null} for none
   */
  public EndUserAuthenticationConfig getEndUserAuthenticationConfig() {
    return endUserAuthenticationConfig;
  }

  /**
   * Optional. The EndUserAuthenticationConfig for the EndUserAuthentication.
   * @param endUserAuthenticationConfig endUserAuthenticationConfig or {@code null} for none
   */
  public EndUserAuthentication setEndUserAuthenticationConfig(EndUserAuthenticationConfig endUserAuthenticationConfig) {
    this.endUserAuthenticationConfig = endUserAuthenticationConfig;
    return this;
  }

  /**
   * Optional. Labels for the EndUserAuthentication.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Labels for the EndUserAuthentication.
   * @param labels labels or {@code null} for none
   */
  public EndUserAuthentication setLabels(java.util.List<java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Required. Identifier. Resource name of the EndUserAuthentication. Format: projects/{project}/lo
   * cations/{location}/connections/{connection}/endUserAuthentications/{end_user_authentication}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Identifier. Resource name of the EndUserAuthentication. Format: projects/{project}/lo
   * cations/{location}/connections/{connection}/endUserAuthentications/{end_user_authentication}
   * @param name name or {@code null} for none
   */
  public EndUserAuthentication setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. The destination to hit when we receive an event
   * @return value or {@code null} for none
   */
  public EndUserAuthenticationNotifyEndpointDestination getNotifyEndpointDestination() {
    return notifyEndpointDestination;
  }

  /**
   * Optional. The destination to hit when we receive an event
   * @param notifyEndpointDestination notifyEndpointDestination or {@code null} for none
   */
  public EndUserAuthentication setNotifyEndpointDestination(EndUserAuthenticationNotifyEndpointDestination notifyEndpointDestination) {
    this.notifyEndpointDestination = notifyEndpointDestination;
    return this;
  }

  /**
   * Optional. Roles for the EndUserAuthentication.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRoles() {
    return roles;
  }

  /**
   * Optional. Roles for the EndUserAuthentication.
   * @param roles roles or {@code null} for none
   */
  public EndUserAuthentication setRoles(java.util.List<java.lang.String> roles) {
    this.roles = roles;
    return this;
  }

  /**
   * Optional. Status of the EndUserAuthentication.
   * @return value or {@code null} for none
   */
  public EndUserAuthenticationEndUserAuthenticationStatus getStatus() {
    return status;
  }

  /**
   * Optional. Status of the EndUserAuthentication.
   * @param status status or {@code null} for none
   */
  public EndUserAuthentication setStatus(EndUserAuthenticationEndUserAuthenticationStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Output only. Updated time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Updated time.
   * @param updateTime updateTime or {@code null} for none
   */
  public EndUserAuthentication setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Optional. The user id of the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserId() {
    return userId;
  }

  /**
   * Optional. The user id of the user.
   * @param userId userId or {@code null} for none
   */
  public EndUserAuthentication setUserId(java.lang.String userId) {
    this.userId = userId;
    return this;
  }

  @Override
  public EndUserAuthentication set(String fieldName, Object value) {
    return (EndUserAuthentication) super.set(fieldName, value);
  }

  @Override
  public EndUserAuthentication clone() {
    return (EndUserAuthentication) super.clone();
  }

}
