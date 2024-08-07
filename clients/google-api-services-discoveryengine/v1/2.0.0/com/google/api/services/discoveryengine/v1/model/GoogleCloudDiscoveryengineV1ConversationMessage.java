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

package com.google.api.services.discoveryengine.v1.model;

/**
 * Defines a conversation message.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1ConversationMessage extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Message creation timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Search reply.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1Reply reply;

  /**
   * User text input.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1TextInput userInput;

  /**
   * Output only. Message creation timestamp.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Message creation timestamp.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1ConversationMessage setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Search reply.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Reply getReply() {
    return reply;
  }

  /**
   * Search reply.
   * @param reply reply or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1ConversationMessage setReply(GoogleCloudDiscoveryengineV1Reply reply) {
    this.reply = reply;
    return this;
  }

  /**
   * User text input.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1TextInput getUserInput() {
    return userInput;
  }

  /**
   * User text input.
   * @param userInput userInput or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1ConversationMessage setUserInput(GoogleCloudDiscoveryengineV1TextInput userInput) {
    this.userInput = userInput;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1ConversationMessage set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1ConversationMessage) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1ConversationMessage clone() {
    return (GoogleCloudDiscoveryengineV1ConversationMessage) super.clone();
  }

}
