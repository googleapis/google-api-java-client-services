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

package com.google.api.services.cloudsupport.v2.model;

/**
 * A comment associated with a support case. Case comments are the primary way for Google Support to
 * communicate with a user who has opened a case. When a user responds to Google Support, the user's
 * responses also appear as comments.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Support API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Comment extends com.google.api.client.json.GenericJson {

  /**
   * The full comment body. Maximum of 12800 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String body;

  /**
   * Output only. The time when the comment was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The user or Google Support agent who created the comment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Actor creator;

  /**
   * Output only. Identifier. The resource name of the comment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. DEPRECATED. DO NOT USE. A duplicate of the `body` field. This field is only
   * present for legacy reasons.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String plainTextBody;

  /**
   * The full comment body. Maximum of 12800 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getBody() {
    return body;
  }

  /**
   * The full comment body. Maximum of 12800 characters.
   * @param body body or {@code null} for none
   */
  public Comment setBody(java.lang.String body) {
    this.body = body;
    return this;
  }

  /**
   * Output only. The time when the comment was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time when the comment was created.
   * @param createTime createTime or {@code null} for none
   */
  public Comment setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The user or Google Support agent who created the comment.
   * @return value or {@code null} for none
   */
  public Actor getCreator() {
    return creator;
  }

  /**
   * Output only. The user or Google Support agent who created the comment.
   * @param creator creator or {@code null} for none
   */
  public Comment setCreator(Actor creator) {
    this.creator = creator;
    return this;
  }

  /**
   * Output only. Identifier. The resource name of the comment.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Identifier. The resource name of the comment.
   * @param name name or {@code null} for none
   */
  public Comment setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. DEPRECATED. DO NOT USE. A duplicate of the `body` field. This field is only
   * present for legacy reasons.
   * @return value or {@code null} for none
   */
  public java.lang.String getPlainTextBody() {
    return plainTextBody;
  }

  /**
   * Output only. DEPRECATED. DO NOT USE. A duplicate of the `body` field. This field is only
   * present for legacy reasons.
   * @param plainTextBody plainTextBody or {@code null} for none
   */
  public Comment setPlainTextBody(java.lang.String plainTextBody) {
    this.plainTextBody = plainTextBody;
    return this;
  }

  @Override
  public Comment set(String fieldName, Object value) {
    return (Comment) super.set(fieldName, value);
  }

  @Override
  public Comment clone() {
    return (Comment) super.clone();
  }

}
