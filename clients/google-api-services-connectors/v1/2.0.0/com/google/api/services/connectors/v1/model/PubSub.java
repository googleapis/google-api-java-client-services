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
 * Pub/Sub message includes details of the Destination Pub/Sub topic.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Connectors API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PubSub extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Pub/Sub message attributes to be added to the Pub/Sub message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> attributes;

  /**
   * Optional. Configuration for configuring the trigger
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ConfigVariable> configVariables;

  static {
    // hack to force ProGuard to consider ConfigVariable used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ConfigVariable.class);
  }

  /**
   * Required. The project id which has the Pub/Sub topic.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Required. The topic id of the Pub/Sub topic.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String topicId;

  /**
   * Optional. Pub/Sub message attributes to be added to the Pub/Sub message.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAttributes() {
    return attributes;
  }

  /**
   * Optional. Pub/Sub message attributes to be added to the Pub/Sub message.
   * @param attributes attributes or {@code null} for none
   */
  public PubSub setAttributes(java.util.Map<String, java.lang.String> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Optional. Configuration for configuring the trigger
   * @return value or {@code null} for none
   */
  public java.util.List<ConfigVariable> getConfigVariables() {
    return configVariables;
  }

  /**
   * Optional. Configuration for configuring the trigger
   * @param configVariables configVariables or {@code null} for none
   */
  public PubSub setConfigVariables(java.util.List<ConfigVariable> configVariables) {
    this.configVariables = configVariables;
    return this;
  }

  /**
   * Required. The project id which has the Pub/Sub topic.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Required. The project id which has the Pub/Sub topic.
   * @param projectId projectId or {@code null} for none
   */
  public PubSub setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Required. The topic id of the Pub/Sub topic.
   * @return value or {@code null} for none
   */
  public java.lang.String getTopicId() {
    return topicId;
  }

  /**
   * Required. The topic id of the Pub/Sub topic.
   * @param topicId topicId or {@code null} for none
   */
  public PubSub setTopicId(java.lang.String topicId) {
    this.topicId = topicId;
    return this;
  }

  @Override
  public PubSub set(String fieldName, Object value) {
    return (PubSub) super.set(fieldName, value);
  }

  @Override
  public PubSub clone() {
    return (PubSub) super.clone();
  }

}
