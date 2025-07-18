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

package com.google.api.services.contactcenterinsights.v1.model;

/**
 * Information about an agent involved in the conversation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Contact Center AI Insights API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudContactcenterinsightsV1ConversationQualityMetadataAgentInfo extends com.google.api.client.json.GenericJson {

  /**
   * A user-specified string representing the agent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String agentId;

  /**
   * The agent type, e.g. HUMAN_AGENT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String agentType;

  /**
   * The agent's name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * A user-provided string indicating the outcome of the agent's segment of the call.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dispositionCode;

  /**
   * The agent's location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * A user-specified string representing the agent's team. Deprecated in favor of the `teams`
   * field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String team;

  /**
   * User-specified strings representing the agent's teams.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> teams;

  /**
   * A user-specified string representing the agent.
   * @return value or {@code null} for none
   */
  public java.lang.String getAgentId() {
    return agentId;
  }

  /**
   * A user-specified string representing the agent.
   * @param agentId agentId or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1ConversationQualityMetadataAgentInfo setAgentId(java.lang.String agentId) {
    this.agentId = agentId;
    return this;
  }

  /**
   * The agent type, e.g. HUMAN_AGENT.
   * @return value or {@code null} for none
   */
  public java.lang.String getAgentType() {
    return agentType;
  }

  /**
   * The agent type, e.g. HUMAN_AGENT.
   * @param agentType agentType or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1ConversationQualityMetadataAgentInfo setAgentType(java.lang.String agentType) {
    this.agentType = agentType;
    return this;
  }

  /**
   * The agent's name.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The agent's name.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1ConversationQualityMetadataAgentInfo setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * A user-provided string indicating the outcome of the agent's segment of the call.
   * @return value or {@code null} for none
   */
  public java.lang.String getDispositionCode() {
    return dispositionCode;
  }

  /**
   * A user-provided string indicating the outcome of the agent's segment of the call.
   * @param dispositionCode dispositionCode or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1ConversationQualityMetadataAgentInfo setDispositionCode(java.lang.String dispositionCode) {
    this.dispositionCode = dispositionCode;
    return this;
  }

  /**
   * The agent's location.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * The agent's location.
   * @param location location or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1ConversationQualityMetadataAgentInfo setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * A user-specified string representing the agent's team. Deprecated in favor of the `teams`
   * field.
   * @return value or {@code null} for none
   */
  public java.lang.String getTeam() {
    return team;
  }

  /**
   * A user-specified string representing the agent's team. Deprecated in favor of the `teams`
   * field.
   * @param team team or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1ConversationQualityMetadataAgentInfo setTeam(java.lang.String team) {
    this.team = team;
    return this;
  }

  /**
   * User-specified strings representing the agent's teams.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTeams() {
    return teams;
  }

  /**
   * User-specified strings representing the agent's teams.
   * @param teams teams or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1ConversationQualityMetadataAgentInfo setTeams(java.util.List<java.lang.String> teams) {
    this.teams = teams;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1ConversationQualityMetadataAgentInfo set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1ConversationQualityMetadataAgentInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1ConversationQualityMetadataAgentInfo clone() {
    return (GoogleCloudContactcenterinsightsV1ConversationQualityMetadataAgentInfo) super.clone();
  }

}
