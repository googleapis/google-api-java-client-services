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

package com.google.api.services.language.v1.model;

/**
 * Represents the input to API methods.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Natural Language API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Document extends com.google.api.client.json.GenericJson {

  /**
   * The content of the input in string format. Cloud audit logging exempt since it is based on user
   * data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * The Google Cloud Storage URI where the file content is located. This URI must be of the form:
   * gs://bucket_name/object_name. For more details, see
   * https://cloud.google.com/storage/docs/reference-uris. NOTE: Cloud Storage object versioning is
   * not supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gcsContentUri;

  /**
   * The language of the document (if not specified, the language is automatically detected). Both
   * ISO and BCP-47 language codes are accepted. [Language
   * Support](https://cloud.google.com/natural-language/docs/languages) lists currently supported
   * languages for each API method. If the language (either specified by the caller or automatically
   * detected) is not supported by the called API method, an `INVALID_ARGUMENT` error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String language;

  /**
   * Required. If the type is not set or is `TYPE_UNSPECIFIED`, returns an `INVALID_ARGUMENT` error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The content of the input in string format. Cloud audit logging exempt since it is based on user
   * data.
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * The content of the input in string format. Cloud audit logging exempt since it is based on user
   * data.
   * @param content content or {@code null} for none
   */
  public Document setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * The Google Cloud Storage URI where the file content is located. This URI must be of the form:
   * gs://bucket_name/object_name. For more details, see
   * https://cloud.google.com/storage/docs/reference-uris. NOTE: Cloud Storage object versioning is
   * not supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getGcsContentUri() {
    return gcsContentUri;
  }

  /**
   * The Google Cloud Storage URI where the file content is located. This URI must be of the form:
   * gs://bucket_name/object_name. For more details, see
   * https://cloud.google.com/storage/docs/reference-uris. NOTE: Cloud Storage object versioning is
   * not supported.
   * @param gcsContentUri gcsContentUri or {@code null} for none
   */
  public Document setGcsContentUri(java.lang.String gcsContentUri) {
    this.gcsContentUri = gcsContentUri;
    return this;
  }

  /**
   * The language of the document (if not specified, the language is automatically detected). Both
   * ISO and BCP-47 language codes are accepted. [Language
   * Support](https://cloud.google.com/natural-language/docs/languages) lists currently supported
   * languages for each API method. If the language (either specified by the caller or automatically
   * detected) is not supported by the called API method, an `INVALID_ARGUMENT` error is returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguage() {
    return language;
  }

  /**
   * The language of the document (if not specified, the language is automatically detected). Both
   * ISO and BCP-47 language codes are accepted. [Language
   * Support](https://cloud.google.com/natural-language/docs/languages) lists currently supported
   * languages for each API method. If the language (either specified by the caller or automatically
   * detected) is not supported by the called API method, an `INVALID_ARGUMENT` error is returned.
   * @param language language or {@code null} for none
   */
  public Document setLanguage(java.lang.String language) {
    this.language = language;
    return this;
  }

  /**
   * Required. If the type is not set or is `TYPE_UNSPECIFIED`, returns an `INVALID_ARGUMENT` error.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Required. If the type is not set or is `TYPE_UNSPECIFIED`, returns an `INVALID_ARGUMENT` error.
   * @param type type or {@code null} for none
   */
  public Document setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Document set(String fieldName, Object value) {
    return (Document) super.set(fieldName, value);
  }

  @Override
  public Document clone() {
    return (Document) super.clone();
  }

}
