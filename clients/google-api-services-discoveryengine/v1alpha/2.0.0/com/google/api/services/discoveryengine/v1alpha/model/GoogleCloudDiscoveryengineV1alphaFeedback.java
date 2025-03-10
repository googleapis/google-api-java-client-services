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
 * Information about the user feedback. This information will be used for logging and metrics
 * purpose.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1alphaFeedback extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The additional user comment of the feedback if user gives a thumb down.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String comment;

  /**
   * The related conversation information when user gives feedback.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaFeedbackConversationInfo conversationInfo;

  /**
   * Required. Indicate whether the user gives a positive or negative feedback. If the user gives a
   * negative feedback, there might be more feedback details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String feedbackType;

  /**
   * The version of the LLM model that was used to generate the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String llmModelVersion;

  /**
   * Optional. The reason if user gives a thumb down.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> reasons;

  /**
   * Optional. The additional user comment of the feedback if user gives a thumb down.
   * @return value or {@code null} for none
   */
  public java.lang.String getComment() {
    return comment;
  }

  /**
   * Optional. The additional user comment of the feedback if user gives a thumb down.
   * @param comment comment or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaFeedback setComment(java.lang.String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * The related conversation information when user gives feedback.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaFeedbackConversationInfo getConversationInfo() {
    return conversationInfo;
  }

  /**
   * The related conversation information when user gives feedback.
   * @param conversationInfo conversationInfo or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaFeedback setConversationInfo(GoogleCloudDiscoveryengineV1alphaFeedbackConversationInfo conversationInfo) {
    this.conversationInfo = conversationInfo;
    return this;
  }

  /**
   * Required. Indicate whether the user gives a positive or negative feedback. If the user gives a
   * negative feedback, there might be more feedback details.
   * @return value or {@code null} for none
   */
  public java.lang.String getFeedbackType() {
    return feedbackType;
  }

  /**
   * Required. Indicate whether the user gives a positive or negative feedback. If the user gives a
   * negative feedback, there might be more feedback details.
   * @param feedbackType feedbackType or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaFeedback setFeedbackType(java.lang.String feedbackType) {
    this.feedbackType = feedbackType;
    return this;
  }

  /**
   * The version of the LLM model that was used to generate the response.
   * @return value or {@code null} for none
   */
  public java.lang.String getLlmModelVersion() {
    return llmModelVersion;
  }

  /**
   * The version of the LLM model that was used to generate the response.
   * @param llmModelVersion llmModelVersion or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaFeedback setLlmModelVersion(java.lang.String llmModelVersion) {
    this.llmModelVersion = llmModelVersion;
    return this;
  }

  /**
   * Optional. The reason if user gives a thumb down.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getReasons() {
    return reasons;
  }

  /**
   * Optional. The reason if user gives a thumb down.
   * @param reasons reasons or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaFeedback setReasons(java.util.List<java.lang.String> reasons) {
    this.reasons = reasons;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaFeedback set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1alphaFeedback) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaFeedback clone() {
    return (GoogleCloudDiscoveryengineV1alphaFeedback) super.clone();
  }

}
