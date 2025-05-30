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

package com.google.api.services.storagebatchoperations.v1.model;

/**
 * Describes options for object metadata update.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Storage Batch Operations API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PutMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Updates objects Cache-Control fixed metadata. Unset values will be ignored. Set empty
   * values to clear the metadata. Additionally, the value for Custom-Time cannot decrease. Refer to
   * documentation in https://cloud.google.com/storage/docs/metadata#caching_data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cacheControl;

  /**
   * Optional. Updates objects Content-Disposition fixed metadata. Unset values will be ignored. Set
   * empty values to clear the metadata. Refer
   * https://cloud.google.com/storage/docs/metadata#content-disposition for additional
   * documentation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentDisposition;

  /**
   * Optional. Updates objects Content-Encoding fixed metadata. Unset values will be ignored. Set
   * empty values to clear the metadata. Refer to documentation in
   * https://cloud.google.com/storage/docs/metadata#content-encoding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentEncoding;

  /**
   * Optional. Updates objects Content-Language fixed metadata. Refer to ISO 639-1 language codes
   * for typical values of this metadata. Max length 100 characters. Unset values will be ignored.
   * Set empty values to clear the metadata. Refer to documentation in
   * https://cloud.google.com/storage/docs/metadata#content-language.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentLanguage;

  /**
   * Optional. Updates objects Content-Type fixed metadata. Unset values will be ignored. Set empty
   * values to clear the metadata. Refer to documentation in
   * https://cloud.google.com/storage/docs/metadata#content-type
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentType;

  /**
   * Optional. Updates objects custom metadata. Adds or sets individual custom metadata key value
   * pairs on objects. Keys that are set with empty custom metadata values will have its value
   * cleared. Existing custom metadata not specified with this flag is not changed. Refer to
   * documentation in https://cloud.google.com/storage/docs/metadata#custom-metadata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> customMetadata;

  /**
   * Optional. Updates objects Custom-Time fixed metadata. Unset values will be ignored. Set empty
   * values to clear the metadata. Refer to documentation in
   * https://cloud.google.com/storage/docs/metadata#custom-time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customTime;

  /**
   * Optional. Updates objects Cache-Control fixed metadata. Unset values will be ignored. Set empty
   * values to clear the metadata. Additionally, the value for Custom-Time cannot decrease. Refer to
   * documentation in https://cloud.google.com/storage/docs/metadata#caching_data.
   * @return value or {@code null} for none
   */
  public java.lang.String getCacheControl() {
    return cacheControl;
  }

  /**
   * Optional. Updates objects Cache-Control fixed metadata. Unset values will be ignored. Set empty
   * values to clear the metadata. Additionally, the value for Custom-Time cannot decrease. Refer to
   * documentation in https://cloud.google.com/storage/docs/metadata#caching_data.
   * @param cacheControl cacheControl or {@code null} for none
   */
  public PutMetadata setCacheControl(java.lang.String cacheControl) {
    this.cacheControl = cacheControl;
    return this;
  }

  /**
   * Optional. Updates objects Content-Disposition fixed metadata. Unset values will be ignored. Set
   * empty values to clear the metadata. Refer
   * https://cloud.google.com/storage/docs/metadata#content-disposition for additional
   * documentation.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentDisposition() {
    return contentDisposition;
  }

  /**
   * Optional. Updates objects Content-Disposition fixed metadata. Unset values will be ignored. Set
   * empty values to clear the metadata. Refer
   * https://cloud.google.com/storage/docs/metadata#content-disposition for additional
   * documentation.
   * @param contentDisposition contentDisposition or {@code null} for none
   */
  public PutMetadata setContentDisposition(java.lang.String contentDisposition) {
    this.contentDisposition = contentDisposition;
    return this;
  }

  /**
   * Optional. Updates objects Content-Encoding fixed metadata. Unset values will be ignored. Set
   * empty values to clear the metadata. Refer to documentation in
   * https://cloud.google.com/storage/docs/metadata#content-encoding.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentEncoding() {
    return contentEncoding;
  }

  /**
   * Optional. Updates objects Content-Encoding fixed metadata. Unset values will be ignored. Set
   * empty values to clear the metadata. Refer to documentation in
   * https://cloud.google.com/storage/docs/metadata#content-encoding.
   * @param contentEncoding contentEncoding or {@code null} for none
   */
  public PutMetadata setContentEncoding(java.lang.String contentEncoding) {
    this.contentEncoding = contentEncoding;
    return this;
  }

  /**
   * Optional. Updates objects Content-Language fixed metadata. Refer to ISO 639-1 language codes
   * for typical values of this metadata. Max length 100 characters. Unset values will be ignored.
   * Set empty values to clear the metadata. Refer to documentation in
   * https://cloud.google.com/storage/docs/metadata#content-language.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentLanguage() {
    return contentLanguage;
  }

  /**
   * Optional. Updates objects Content-Language fixed metadata. Refer to ISO 639-1 language codes
   * for typical values of this metadata. Max length 100 characters. Unset values will be ignored.
   * Set empty values to clear the metadata. Refer to documentation in
   * https://cloud.google.com/storage/docs/metadata#content-language.
   * @param contentLanguage contentLanguage or {@code null} for none
   */
  public PutMetadata setContentLanguage(java.lang.String contentLanguage) {
    this.contentLanguage = contentLanguage;
    return this;
  }

  /**
   * Optional. Updates objects Content-Type fixed metadata. Unset values will be ignored. Set empty
   * values to clear the metadata. Refer to documentation in
   * https://cloud.google.com/storage/docs/metadata#content-type
   * @return value or {@code null} for none
   */
  public java.lang.String getContentType() {
    return contentType;
  }

  /**
   * Optional. Updates objects Content-Type fixed metadata. Unset values will be ignored. Set empty
   * values to clear the metadata. Refer to documentation in
   * https://cloud.google.com/storage/docs/metadata#content-type
   * @param contentType contentType or {@code null} for none
   */
  public PutMetadata setContentType(java.lang.String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Optional. Updates objects custom metadata. Adds or sets individual custom metadata key value
   * pairs on objects. Keys that are set with empty custom metadata values will have its value
   * cleared. Existing custom metadata not specified with this flag is not changed. Refer to
   * documentation in https://cloud.google.com/storage/docs/metadata#custom-metadata
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getCustomMetadata() {
    return customMetadata;
  }

  /**
   * Optional. Updates objects custom metadata. Adds or sets individual custom metadata key value
   * pairs on objects. Keys that are set with empty custom metadata values will have its value
   * cleared. Existing custom metadata not specified with this flag is not changed. Refer to
   * documentation in https://cloud.google.com/storage/docs/metadata#custom-metadata
   * @param customMetadata customMetadata or {@code null} for none
   */
  public PutMetadata setCustomMetadata(java.util.Map<String, java.lang.String> customMetadata) {
    this.customMetadata = customMetadata;
    return this;
  }

  /**
   * Optional. Updates objects Custom-Time fixed metadata. Unset values will be ignored. Set empty
   * values to clear the metadata. Refer to documentation in
   * https://cloud.google.com/storage/docs/metadata#custom-time.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomTime() {
    return customTime;
  }

  /**
   * Optional. Updates objects Custom-Time fixed metadata. Unset values will be ignored. Set empty
   * values to clear the metadata. Refer to documentation in
   * https://cloud.google.com/storage/docs/metadata#custom-time.
   * @param customTime customTime or {@code null} for none
   */
  public PutMetadata setCustomTime(java.lang.String customTime) {
    this.customTime = customTime;
    return this;
  }

  @Override
  public PutMetadata set(String fieldName, Object value) {
    return (PutMetadata) super.set(fieldName, value);
  }

  @Override
  public PutMetadata clone() {
    return (PutMetadata) super.clone();
  }

}
