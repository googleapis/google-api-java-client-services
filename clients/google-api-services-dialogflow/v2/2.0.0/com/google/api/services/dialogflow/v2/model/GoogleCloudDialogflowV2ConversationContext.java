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

package com.google.api.services.dialogflow.v2.model;

/**
 * Context of the conversation, including transcripts.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2ConversationContext extends com.google.api.client.json.GenericJson {

  /**
   * Optional. List of message transcripts in the conversation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2MessageEntry> messageEntries;

  /**
   * Optional. List of message transcripts in the conversation.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2MessageEntry> getMessageEntries() {
    return messageEntries;
  }

  /**
   * Optional. List of message transcripts in the conversation.
   * @param messageEntries messageEntries or {@code null} for none
   */
  public GoogleCloudDialogflowV2ConversationContext setMessageEntries(java.util.List<GoogleCloudDialogflowV2MessageEntry> messageEntries) {
    this.messageEntries = messageEntries;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2ConversationContext set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2ConversationContext) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2ConversationContext clone() {
    return (GoogleCloudDialogflowV2ConversationContext) super.clone();
  }

}
