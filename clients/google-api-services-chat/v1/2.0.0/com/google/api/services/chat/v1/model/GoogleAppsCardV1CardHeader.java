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

package com.google.api.services.chat.v1.model;

/**
 * Represents a card header. For an example in Google Chat apps, see [Add a
 * header](https://developers.google.com/workspace/chat/design-components-card-dialog#add_a_header).
 * [Google Workspace add-ons and Chat apps](https://developers.google.com/workspace/extend):
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsCardV1CardHeader extends com.google.api.client.json.GenericJson {

  /**
   * The alternative text of this image that's used for accessibility.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageAltText;

  /**
   * The shape used to crop the image. [Google Workspace add-ons and Chat
   * apps](https://developers.google.com/workspace/extend):
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageType;

  /**
   * The HTTPS URL of the image in the card header.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageUrl;

  /**
   * The subtitle of the card header. If specified, appears on its own line below the `title`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subtitle;

  /**
   * Required. The title of the card header. The header has a fixed height: if both a title and
   * subtitle are specified, each takes up one line. If only the title is specified, it takes up
   * both lines.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The alternative text of this image that's used for accessibility.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageAltText() {
    return imageAltText;
  }

  /**
   * The alternative text of this image that's used for accessibility.
   * @param imageAltText imageAltText or {@code null} for none
   */
  public GoogleAppsCardV1CardHeader setImageAltText(java.lang.String imageAltText) {
    this.imageAltText = imageAltText;
    return this;
  }

  /**
   * The shape used to crop the image. [Google Workspace add-ons and Chat
   * apps](https://developers.google.com/workspace/extend):
   * @return value or {@code null} for none
   */
  public java.lang.String getImageType() {
    return imageType;
  }

  /**
   * The shape used to crop the image. [Google Workspace add-ons and Chat
   * apps](https://developers.google.com/workspace/extend):
   * @param imageType imageType or {@code null} for none
   */
  public GoogleAppsCardV1CardHeader setImageType(java.lang.String imageType) {
    this.imageType = imageType;
    return this;
  }

  /**
   * The HTTPS URL of the image in the card header.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageUrl() {
    return imageUrl;
  }

  /**
   * The HTTPS URL of the image in the card header.
   * @param imageUrl imageUrl or {@code null} for none
   */
  public GoogleAppsCardV1CardHeader setImageUrl(java.lang.String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * The subtitle of the card header. If specified, appears on its own line below the `title`.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubtitle() {
    return subtitle;
  }

  /**
   * The subtitle of the card header. If specified, appears on its own line below the `title`.
   * @param subtitle subtitle or {@code null} for none
   */
  public GoogleAppsCardV1CardHeader setSubtitle(java.lang.String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

  /**
   * Required. The title of the card header. The header has a fixed height: if both a title and
   * subtitle are specified, each takes up one line. If only the title is specified, it takes up
   * both lines.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Required. The title of the card header. The header has a fixed height: if both a title and
   * subtitle are specified, each takes up one line. If only the title is specified, it takes up
   * both lines.
   * @param title title or {@code null} for none
   */
  public GoogleAppsCardV1CardHeader setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public GoogleAppsCardV1CardHeader set(String fieldName, Object value) {
    return (GoogleAppsCardV1CardHeader) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsCardV1CardHeader clone() {
    return (GoogleAppsCardV1CardHeader) super.clone();
  }

}
