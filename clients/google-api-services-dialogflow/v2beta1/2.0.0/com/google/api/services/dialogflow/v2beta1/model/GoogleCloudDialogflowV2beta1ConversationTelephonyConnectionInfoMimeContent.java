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
 * The mime content from the initial SIP INVITE.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1ConversationTelephonyConnectionInfoMimeContent extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The content payload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * Optional. The mime type of the content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mimeType;

  /**
   * Optional. The content payload.
   * @see #decodeContent()
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * Optional. The content payload.
   * @see #getContent()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeContent() {
    return com.google.api.client.util.Base64.decodeBase64(content);
  }

  /**
   * Optional. The content payload.
   * @see #encodeContent()
   * @param content content or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1ConversationTelephonyConnectionInfoMimeContent setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * Optional. The content payload.
   * @see #setContent()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleCloudDialogflowV2beta1ConversationTelephonyConnectionInfoMimeContent encodeContent(byte[] content) {
    this.content = com.google.api.client.util.Base64.encodeBase64URLSafeString(content);
    return this;
  }

  /**
   * Optional. The mime type of the content.
   * @return value or {@code null} for none
   */
  public java.lang.String getMimeType() {
    return mimeType;
  }

  /**
   * Optional. The mime type of the content.
   * @param mimeType mimeType or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1ConversationTelephonyConnectionInfoMimeContent setMimeType(java.lang.String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1ConversationTelephonyConnectionInfoMimeContent set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1ConversationTelephonyConnectionInfoMimeContent) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1ConversationTelephonyConnectionInfoMimeContent clone() {
    return (GoogleCloudDialogflowV2beta1ConversationTelephonyConnectionInfoMimeContent) super.clone();
  }

}
