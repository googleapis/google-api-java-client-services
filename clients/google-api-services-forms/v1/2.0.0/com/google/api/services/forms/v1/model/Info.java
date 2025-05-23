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

package com.google.api.services.forms.v1.model;

/**
 * The general information for a form.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Forms API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Info extends com.google.api.client.json.GenericJson {

  /**
   * The description of the form.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Output only. The title of the document which is visible in Drive. If Info.title is empty,
   * `document_title` may appear in its place in the Google Forms UI and be visible to responders.
   * `document_title` can be set on create, but cannot be modified by a batchUpdate request. Please
   * use the [Google Drive API](https://developers.google.com/drive/api/v3/reference/files/update)
   * if you need to programmatically update `document_title`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String documentTitle;

  /**
   * Required. The title of the form which is visible to responders.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The description of the form.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description of the form.
   * @param description description or {@code null} for none
   */
  public Info setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Output only. The title of the document which is visible in Drive. If Info.title is empty,
   * `document_title` may appear in its place in the Google Forms UI and be visible to responders.
   * `document_title` can be set on create, but cannot be modified by a batchUpdate request. Please
   * use the [Google Drive API](https://developers.google.com/drive/api/v3/reference/files/update)
   * if you need to programmatically update `document_title`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDocumentTitle() {
    return documentTitle;
  }

  /**
   * Output only. The title of the document which is visible in Drive. If Info.title is empty,
   * `document_title` may appear in its place in the Google Forms UI and be visible to responders.
   * `document_title` can be set on create, but cannot be modified by a batchUpdate request. Please
   * use the [Google Drive API](https://developers.google.com/drive/api/v3/reference/files/update)
   * if you need to programmatically update `document_title`.
   * @param documentTitle documentTitle or {@code null} for none
   */
  public Info setDocumentTitle(java.lang.String documentTitle) {
    this.documentTitle = documentTitle;
    return this;
  }

  /**
   * Required. The title of the form which is visible to responders.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Required. The title of the form which is visible to responders.
   * @param title title or {@code null} for none
   */
  public Info setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public Info set(String fieldName, Object value) {
    return (Info) super.set(fieldName, value);
  }

  @Override
  public Info clone() {
    return (Info) super.clone();
  }

}
