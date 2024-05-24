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
 * Defines an answer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1Answer extends com.google.api.client.json.GenericJson {

  /**
   * Additional answer-skipped reasons. This provides the reason for ignored cases. If nothing is
   * skipped, this field is not set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> answerSkippedReasons;

  /**
   * The textual answer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String answerText;

  /**
   * Citations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDiscoveryengineV1AnswerCitation> citations;

  /**
   * Output only. Answer completed timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String completeTime;

  /**
   * Output only. Answer creation timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Immutable. Fully qualified name `projects/{project}/locations/global/collections/{collection}/e
   * ngines/{engine}/sessions/answers`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Query understanding information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1AnswerQueryUnderstandingInfo queryUnderstandingInfo;

  /**
   * References.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDiscoveryengineV1AnswerReference> references;

  /**
   * Suggested related questions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> relatedQuestions;

  /**
   * The state of the answer generation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Answer generation steps.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDiscoveryengineV1AnswerStep> steps;

  /**
   * Additional answer-skipped reasons. This provides the reason for ignored cases. If nothing is
   * skipped, this field is not set.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAnswerSkippedReasons() {
    return answerSkippedReasons;
  }

  /**
   * Additional answer-skipped reasons. This provides the reason for ignored cases. If nothing is
   * skipped, this field is not set.
   * @param answerSkippedReasons answerSkippedReasons or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Answer setAnswerSkippedReasons(java.util.List<java.lang.String> answerSkippedReasons) {
    this.answerSkippedReasons = answerSkippedReasons;
    return this;
  }

  /**
   * The textual answer.
   * @return value or {@code null} for none
   */
  public java.lang.String getAnswerText() {
    return answerText;
  }

  /**
   * The textual answer.
   * @param answerText answerText or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Answer setAnswerText(java.lang.String answerText) {
    this.answerText = answerText;
    return this;
  }

  /**
   * Citations.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDiscoveryengineV1AnswerCitation> getCitations() {
    return citations;
  }

  /**
   * Citations.
   * @param citations citations or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Answer setCitations(java.util.List<GoogleCloudDiscoveryengineV1AnswerCitation> citations) {
    this.citations = citations;
    return this;
  }

  /**
   * Output only. Answer completed timestamp.
   * @return value or {@code null} for none
   */
  public String getCompleteTime() {
    return completeTime;
  }

  /**
   * Output only. Answer completed timestamp.
   * @param completeTime completeTime or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Answer setCompleteTime(String completeTime) {
    this.completeTime = completeTime;
    return this;
  }

  /**
   * Output only. Answer creation timestamp.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Answer creation timestamp.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Answer setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Immutable. Fully qualified name `projects/{project}/locations/global/collections/{collection}/e
   * ngines/{engine}/sessions/answers`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Immutable. Fully qualified name `projects/{project}/locations/global/collections/{collection}/e
   * ngines/{engine}/sessions/answers`
   * @param name name or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Answer setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Query understanding information.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1AnswerQueryUnderstandingInfo getQueryUnderstandingInfo() {
    return queryUnderstandingInfo;
  }

  /**
   * Query understanding information.
   * @param queryUnderstandingInfo queryUnderstandingInfo or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Answer setQueryUnderstandingInfo(GoogleCloudDiscoveryengineV1AnswerQueryUnderstandingInfo queryUnderstandingInfo) {
    this.queryUnderstandingInfo = queryUnderstandingInfo;
    return this;
  }

  /**
   * References.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDiscoveryengineV1AnswerReference> getReferences() {
    return references;
  }

  /**
   * References.
   * @param references references or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Answer setReferences(java.util.List<GoogleCloudDiscoveryengineV1AnswerReference> references) {
    this.references = references;
    return this;
  }

  /**
   * Suggested related questions.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRelatedQuestions() {
    return relatedQuestions;
  }

  /**
   * Suggested related questions.
   * @param relatedQuestions relatedQuestions or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Answer setRelatedQuestions(java.util.List<java.lang.String> relatedQuestions) {
    this.relatedQuestions = relatedQuestions;
    return this;
  }

  /**
   * The state of the answer generation.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The state of the answer generation.
   * @param state state or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Answer setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Answer generation steps.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDiscoveryengineV1AnswerStep> getSteps() {
    return steps;
  }

  /**
   * Answer generation steps.
   * @param steps steps or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Answer setSteps(java.util.List<GoogleCloudDiscoveryengineV1AnswerStep> steps) {
    this.steps = steps;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1Answer set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1Answer) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1Answer clone() {
    return (GoogleCloudDiscoveryengineV1Answer) super.clone();
  }

}