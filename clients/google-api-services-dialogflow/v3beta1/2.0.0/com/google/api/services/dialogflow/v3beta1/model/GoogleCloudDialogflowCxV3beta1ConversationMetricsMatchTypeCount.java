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

package com.google.api.services.dialogflow.v3beta1.model;

/**
 * Count by Match.MatchType of the matches in the conversation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1ConversationMetricsMatchTypeCount extends com.google.api.client.json.GenericJson {

  /**
   * The number of matches with type Match.MatchType.DIRECT_INTENT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer directIntentCount;

  /**
   * The number of matches with type Match.MatchType.EVENT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer eventCount;

  /**
   * The number of matches with type Match.MatchType.INTENT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer intentCount;

  /**
   * The number of matches with type Match.MatchType.NO_INPUT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer noInputCount;

  /**
   * The number of matches with type Match.MatchType.NO_MATCH.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer noMatchCount;

  /**
   * The number of matches with type Match.MatchType.PARAMETER_FILLING.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer parameterFillingCount;

  /**
   * The number of matches with type Match.MatchType.MATCH_TYPE_UNSPECIFIED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer unspecifiedCount;

  /**
   * The number of matches with type Match.MatchType.DIRECT_INTENT.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDirectIntentCount() {
    return directIntentCount;
  }

  /**
   * The number of matches with type Match.MatchType.DIRECT_INTENT.
   * @param directIntentCount directIntentCount or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ConversationMetricsMatchTypeCount setDirectIntentCount(java.lang.Integer directIntentCount) {
    this.directIntentCount = directIntentCount;
    return this;
  }

  /**
   * The number of matches with type Match.MatchType.EVENT.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getEventCount() {
    return eventCount;
  }

  /**
   * The number of matches with type Match.MatchType.EVENT.
   * @param eventCount eventCount or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ConversationMetricsMatchTypeCount setEventCount(java.lang.Integer eventCount) {
    this.eventCount = eventCount;
    return this;
  }

  /**
   * The number of matches with type Match.MatchType.INTENT.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIntentCount() {
    return intentCount;
  }

  /**
   * The number of matches with type Match.MatchType.INTENT.
   * @param intentCount intentCount or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ConversationMetricsMatchTypeCount setIntentCount(java.lang.Integer intentCount) {
    this.intentCount = intentCount;
    return this;
  }

  /**
   * The number of matches with type Match.MatchType.NO_INPUT.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNoInputCount() {
    return noInputCount;
  }

  /**
   * The number of matches with type Match.MatchType.NO_INPUT.
   * @param noInputCount noInputCount or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ConversationMetricsMatchTypeCount setNoInputCount(java.lang.Integer noInputCount) {
    this.noInputCount = noInputCount;
    return this;
  }

  /**
   * The number of matches with type Match.MatchType.NO_MATCH.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNoMatchCount() {
    return noMatchCount;
  }

  /**
   * The number of matches with type Match.MatchType.NO_MATCH.
   * @param noMatchCount noMatchCount or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ConversationMetricsMatchTypeCount setNoMatchCount(java.lang.Integer noMatchCount) {
    this.noMatchCount = noMatchCount;
    return this;
  }

  /**
   * The number of matches with type Match.MatchType.PARAMETER_FILLING.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getParameterFillingCount() {
    return parameterFillingCount;
  }

  /**
   * The number of matches with type Match.MatchType.PARAMETER_FILLING.
   * @param parameterFillingCount parameterFillingCount or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ConversationMetricsMatchTypeCount setParameterFillingCount(java.lang.Integer parameterFillingCount) {
    this.parameterFillingCount = parameterFillingCount;
    return this;
  }

  /**
   * The number of matches with type Match.MatchType.MATCH_TYPE_UNSPECIFIED.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getUnspecifiedCount() {
    return unspecifiedCount;
  }

  /**
   * The number of matches with type Match.MatchType.MATCH_TYPE_UNSPECIFIED.
   * @param unspecifiedCount unspecifiedCount or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ConversationMetricsMatchTypeCount setUnspecifiedCount(java.lang.Integer unspecifiedCount) {
    this.unspecifiedCount = unspecifiedCount;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1ConversationMetricsMatchTypeCount set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1ConversationMetricsMatchTypeCount) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1ConversationMetricsMatchTypeCount clone() {
    return (GoogleCloudDialogflowCxV3beta1ConversationMetricsMatchTypeCount) super.clone();
  }

}
