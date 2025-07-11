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

package com.google.api.services.dialogflow.v2beta1.model;

/**
 * The request message for Participants.AnalyzeContent.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1AnalyzeContentRequest extends com.google.api.client.json.GenericJson {

  /**
   * Parameters for a human assist query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1AssistQueryParameters assistQueryParams;

  /**
   * The natural language speech audio to be processed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1AudioInput audioInput;

  /**
   * The unique identifier of the Dialogflow CX page to override the `current_page` in the session.
   * Format: `projects//locations//agents//flows//pages/`. If `cx_current_page` is specified, the
   * previous state of the session will be ignored by Dialogflow CX, including the previous page and
   * the previous session parameters. In most cases, `cx_current_page` and `cx_parameters` should be
   * configured together to direct a session to a specific state. Note: this field should only be
   * used if you are connecting to a Dialogflow CX agent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cxCurrentPage;

  /**
   * Additional parameters to be put into Dialogflow CX session parameters. To remove a parameter
   * from the session, clients should explicitly set the parameter value to null. Note: this field
   * should only be used if you are connecting to a Dialogflow CX agent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> cxParameters;

  /**
   * An input event to send to Dialogflow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1EventInput eventInput;

  /**
   * The intent to be triggered on V3 agent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1IntentInput intentInput;

  /**
   * Optional. The send time of the message from end user or human agent's perspective. It is used
   * for identifying the same message under one participant. For BatchCreateMessages API only: Given
   * two messages under the same participant: * If send time are different regardless of whether the
   * content of the messages are exactly the same, the conversation will regard them as two distinct
   * messages sent by the participant. * If send time is the same regardless of whether the content
   * of the messages are exactly the same, the conversation will regard them as same message, and
   * ignore the message received later. If the value is not provided, a new request will always be
   * regarded as a new message without any de-duplication.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String messageSendTime;

  /**
   * Parameters for a Dialogflow virtual-agent query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1QueryParameters queryParams;

  /**
   * Speech synthesis configuration. The speech synthesis settings for a virtual agent that may be
   * configured for the associated conversation profile are not used when calling AnalyzeContent. If
   * this configuration is not supplied, speech synthesis is disabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1OutputAudioConfig replyAudioConfig;

  /**
   * A unique identifier for this request. Restricted to 36 ASCII characters. A random UUID is
   * recommended. This request is only idempotent if a `request_id` is provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestId;

  /**
   * An input representing the selection of a suggestion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1SuggestionInput suggestionInput;

  /**
   * The natural language text to be processed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1TextInput textInput;

  /**
   * Parameters for a human assist query.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1AssistQueryParameters getAssistQueryParams() {
    return assistQueryParams;
  }

  /**
   * Parameters for a human assist query.
   * @param assistQueryParams assistQueryParams or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1AnalyzeContentRequest setAssistQueryParams(GoogleCloudDialogflowV2beta1AssistQueryParameters assistQueryParams) {
    this.assistQueryParams = assistQueryParams;
    return this;
  }

  /**
   * The natural language speech audio to be processed.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1AudioInput getAudioInput() {
    return audioInput;
  }

  /**
   * The natural language speech audio to be processed.
   * @param audioInput audioInput or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1AnalyzeContentRequest setAudioInput(GoogleCloudDialogflowV2beta1AudioInput audioInput) {
    this.audioInput = audioInput;
    return this;
  }

  /**
   * The unique identifier of the Dialogflow CX page to override the `current_page` in the session.
   * Format: `projects//locations//agents//flows//pages/`. If `cx_current_page` is specified, the
   * previous state of the session will be ignored by Dialogflow CX, including the previous page and
   * the previous session parameters. In most cases, `cx_current_page` and `cx_parameters` should be
   * configured together to direct a session to a specific state. Note: this field should only be
   * used if you are connecting to a Dialogflow CX agent.
   * @return value or {@code null} for none
   */
  public java.lang.String getCxCurrentPage() {
    return cxCurrentPage;
  }

  /**
   * The unique identifier of the Dialogflow CX page to override the `current_page` in the session.
   * Format: `projects//locations//agents//flows//pages/`. If `cx_current_page` is specified, the
   * previous state of the session will be ignored by Dialogflow CX, including the previous page and
   * the previous session parameters. In most cases, `cx_current_page` and `cx_parameters` should be
   * configured together to direct a session to a specific state. Note: this field should only be
   * used if you are connecting to a Dialogflow CX agent.
   * @param cxCurrentPage cxCurrentPage or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1AnalyzeContentRequest setCxCurrentPage(java.lang.String cxCurrentPage) {
    this.cxCurrentPage = cxCurrentPage;
    return this;
  }

  /**
   * Additional parameters to be put into Dialogflow CX session parameters. To remove a parameter
   * from the session, clients should explicitly set the parameter value to null. Note: this field
   * should only be used if you are connecting to a Dialogflow CX agent.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getCxParameters() {
    return cxParameters;
  }

  /**
   * Additional parameters to be put into Dialogflow CX session parameters. To remove a parameter
   * from the session, clients should explicitly set the parameter value to null. Note: this field
   * should only be used if you are connecting to a Dialogflow CX agent.
   * @param cxParameters cxParameters or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1AnalyzeContentRequest setCxParameters(java.util.Map<String, java.lang.Object> cxParameters) {
    this.cxParameters = cxParameters;
    return this;
  }

  /**
   * An input event to send to Dialogflow.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1EventInput getEventInput() {
    return eventInput;
  }

  /**
   * An input event to send to Dialogflow.
   * @param eventInput eventInput or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1AnalyzeContentRequest setEventInput(GoogleCloudDialogflowV2beta1EventInput eventInput) {
    this.eventInput = eventInput;
    return this;
  }

  /**
   * The intent to be triggered on V3 agent.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentInput getIntentInput() {
    return intentInput;
  }

  /**
   * The intent to be triggered on V3 agent.
   * @param intentInput intentInput or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1AnalyzeContentRequest setIntentInput(GoogleCloudDialogflowV2beta1IntentInput intentInput) {
    this.intentInput = intentInput;
    return this;
  }

  /**
   * Optional. The send time of the message from end user or human agent's perspective. It is used
   * for identifying the same message under one participant. For BatchCreateMessages API only: Given
   * two messages under the same participant: * If send time are different regardless of whether the
   * content of the messages are exactly the same, the conversation will regard them as two distinct
   * messages sent by the participant. * If send time is the same regardless of whether the content
   * of the messages are exactly the same, the conversation will regard them as same message, and
   * ignore the message received later. If the value is not provided, a new request will always be
   * regarded as a new message without any de-duplication.
   * @return value or {@code null} for none
   */
  public String getMessageSendTime() {
    return messageSendTime;
  }

  /**
   * Optional. The send time of the message from end user or human agent's perspective. It is used
   * for identifying the same message under one participant. For BatchCreateMessages API only: Given
   * two messages under the same participant: * If send time are different regardless of whether the
   * content of the messages are exactly the same, the conversation will regard them as two distinct
   * messages sent by the participant. * If send time is the same regardless of whether the content
   * of the messages are exactly the same, the conversation will regard them as same message, and
   * ignore the message received later. If the value is not provided, a new request will always be
   * regarded as a new message without any de-duplication.
   * @param messageSendTime messageSendTime or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1AnalyzeContentRequest setMessageSendTime(String messageSendTime) {
    this.messageSendTime = messageSendTime;
    return this;
  }

  /**
   * Parameters for a Dialogflow virtual-agent query.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1QueryParameters getQueryParams() {
    return queryParams;
  }

  /**
   * Parameters for a Dialogflow virtual-agent query.
   * @param queryParams queryParams or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1AnalyzeContentRequest setQueryParams(GoogleCloudDialogflowV2beta1QueryParameters queryParams) {
    this.queryParams = queryParams;
    return this;
  }

  /**
   * Speech synthesis configuration. The speech synthesis settings for a virtual agent that may be
   * configured for the associated conversation profile are not used when calling AnalyzeContent. If
   * this configuration is not supplied, speech synthesis is disabled.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1OutputAudioConfig getReplyAudioConfig() {
    return replyAudioConfig;
  }

  /**
   * Speech synthesis configuration. The speech synthesis settings for a virtual agent that may be
   * configured for the associated conversation profile are not used when calling AnalyzeContent. If
   * this configuration is not supplied, speech synthesis is disabled.
   * @param replyAudioConfig replyAudioConfig or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1AnalyzeContentRequest setReplyAudioConfig(GoogleCloudDialogflowV2beta1OutputAudioConfig replyAudioConfig) {
    this.replyAudioConfig = replyAudioConfig;
    return this;
  }

  /**
   * A unique identifier for this request. Restricted to 36 ASCII characters. A random UUID is
   * recommended. This request is only idempotent if a `request_id` is provided.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestId() {
    return requestId;
  }

  /**
   * A unique identifier for this request. Restricted to 36 ASCII characters. A random UUID is
   * recommended. This request is only idempotent if a `request_id` is provided.
   * @param requestId requestId or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1AnalyzeContentRequest setRequestId(java.lang.String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * An input representing the selection of a suggestion.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SuggestionInput getSuggestionInput() {
    return suggestionInput;
  }

  /**
   * An input representing the selection of a suggestion.
   * @param suggestionInput suggestionInput or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1AnalyzeContentRequest setSuggestionInput(GoogleCloudDialogflowV2beta1SuggestionInput suggestionInput) {
    this.suggestionInput = suggestionInput;
    return this;
  }

  /**
   * The natural language text to be processed.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1TextInput getTextInput() {
    return textInput;
  }

  /**
   * The natural language text to be processed.
   * @param textInput textInput or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1AnalyzeContentRequest setTextInput(GoogleCloudDialogflowV2beta1TextInput textInput) {
    this.textInput = textInput;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1AnalyzeContentRequest set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1AnalyzeContentRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1AnalyzeContentRequest clone() {
    return (GoogleCloudDialogflowV2beta1AnalyzeContentRequest) super.clone();
  }

}
