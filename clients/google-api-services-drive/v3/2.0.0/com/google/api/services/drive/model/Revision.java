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

package com.google.api.services.drive.model;

/**
 * The metadata for a revision to a file. Some resource methods (such as `revisions.update`) require
 * a `revisionId`. Use the `revisions.list` method to retrieve the ID for a revision.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Drive API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Revision extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Links for exporting Docs Editors files to specific formats.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> exportLinks;

  /**
   * Output only. The ID of the revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Whether to keep this revision forever, even if it is no longer the head revision. If not set,
   * the revision will be automatically purged 30 days after newer content is uploaded. This can be
   * set on a maximum of 200 revisions for a file. This field is only applicable to files with
   * binary content in Drive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean keepForever;

  /**
   * Output only. Identifies what kind of resource this is. Value: the fixed string
   * `"drive#revision"`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Output only. The last user to modify this revision. This field is only populated when the last
   * modification was performed by a signed-in user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private User lastModifyingUser;

  /**
   * Output only. The MD5 checksum of the revision's content. This is only applicable to files with
   * binary content in Drive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String md5Checksum;

  /**
   * Output only. The MIME type of the revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mimeType;

  /**
   * The last time the revision was modified (RFC 3339 date-time).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime modifiedTime;

  /**
   * Output only. The original filename used to create this revision. This is only applicable to
   * files with binary content in Drive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originalFilename;

  /**
   * Whether subsequent revisions will be automatically republished. This is only applicable to Docs
   * Editors files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean publishAuto;

  /**
   * Whether this revision is published. This is only applicable to Docs Editors files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean published;

  /**
   * Output only. A link to the published revision. This is only populated for Docs Editors files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String publishedLink;

  /**
   * Whether this revision is published outside the domain. This is only applicable to Docs Editors
   * files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean publishedOutsideDomain;

  /**
   * Output only. The size of the revision's content in bytes. This is only applicable to files with
   * binary content in Drive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long size;

  /**
   * Output only. Links for exporting Docs Editors files to specific formats.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getExportLinks() {
    return exportLinks;
  }

  /**
   * Output only. Links for exporting Docs Editors files to specific formats.
   * @param exportLinks exportLinks or {@code null} for none
   */
  public Revision setExportLinks(java.util.Map<String, java.lang.String> exportLinks) {
    this.exportLinks = exportLinks;
    return this;
  }

  /**
   * Output only. The ID of the revision.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Output only. The ID of the revision.
   * @param id id or {@code null} for none
   */
  public Revision setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Whether to keep this revision forever, even if it is no longer the head revision. If not set,
   * the revision will be automatically purged 30 days after newer content is uploaded. This can be
   * set on a maximum of 200 revisions for a file. This field is only applicable to files with
   * binary content in Drive.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getKeepForever() {
    return keepForever;
  }

  /**
   * Whether to keep this revision forever, even if it is no longer the head revision. If not set,
   * the revision will be automatically purged 30 days after newer content is uploaded. This can be
   * set on a maximum of 200 revisions for a file. This field is only applicable to files with
   * binary content in Drive.
   * @param keepForever keepForever or {@code null} for none
   */
  public Revision setKeepForever(java.lang.Boolean keepForever) {
    this.keepForever = keepForever;
    return this;
  }

  /**
   * Output only. Identifies what kind of resource this is. Value: the fixed string
   * `"drive#revision"`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Output only. Identifies what kind of resource this is. Value: the fixed string
   * `"drive#revision"`.
   * @param kind kind or {@code null} for none
   */
  public Revision setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Output only. The last user to modify this revision. This field is only populated when the last
   * modification was performed by a signed-in user.
   * @return value or {@code null} for none
   */
  public User getLastModifyingUser() {
    return lastModifyingUser;
  }

  /**
   * Output only. The last user to modify this revision. This field is only populated when the last
   * modification was performed by a signed-in user.
   * @param lastModifyingUser lastModifyingUser or {@code null} for none
   */
  public Revision setLastModifyingUser(User lastModifyingUser) {
    this.lastModifyingUser = lastModifyingUser;
    return this;
  }

  /**
   * Output only. The MD5 checksum of the revision's content. This is only applicable to files with
   * binary content in Drive.
   * @return value or {@code null} for none
   */
  public java.lang.String getMd5Checksum() {
    return md5Checksum;
  }

  /**
   * Output only. The MD5 checksum of the revision's content. This is only applicable to files with
   * binary content in Drive.
   * @param md5Checksum md5Checksum or {@code null} for none
   */
  public Revision setMd5Checksum(java.lang.String md5Checksum) {
    this.md5Checksum = md5Checksum;
    return this;
  }

  /**
   * Output only. The MIME type of the revision.
   * @return value or {@code null} for none
   */
  public java.lang.String getMimeType() {
    return mimeType;
  }

  /**
   * Output only. The MIME type of the revision.
   * @param mimeType mimeType or {@code null} for none
   */
  public Revision setMimeType(java.lang.String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * The last time the revision was modified (RFC 3339 date-time).
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getModifiedTime() {
    return modifiedTime;
  }

  /**
   * The last time the revision was modified (RFC 3339 date-time).
   * @param modifiedTime modifiedTime or {@code null} for none
   */
  public Revision setModifiedTime(com.google.api.client.util.DateTime modifiedTime) {
    this.modifiedTime = modifiedTime;
    return this;
  }

  /**
   * Output only. The original filename used to create this revision. This is only applicable to
   * files with binary content in Drive.
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginalFilename() {
    return originalFilename;
  }

  /**
   * Output only. The original filename used to create this revision. This is only applicable to
   * files with binary content in Drive.
   * @param originalFilename originalFilename or {@code null} for none
   */
  public Revision setOriginalFilename(java.lang.String originalFilename) {
    this.originalFilename = originalFilename;
    return this;
  }

  /**
   * Whether subsequent revisions will be automatically republished. This is only applicable to Docs
   * Editors files.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPublishAuto() {
    return publishAuto;
  }

  /**
   * Whether subsequent revisions will be automatically republished. This is only applicable to Docs
   * Editors files.
   * @param publishAuto publishAuto or {@code null} for none
   */
  public Revision setPublishAuto(java.lang.Boolean publishAuto) {
    this.publishAuto = publishAuto;
    return this;
  }

  /**
   * Whether this revision is published. This is only applicable to Docs Editors files.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPublished() {
    return published;
  }

  /**
   * Whether this revision is published. This is only applicable to Docs Editors files.
   * @param published published or {@code null} for none
   */
  public Revision setPublished(java.lang.Boolean published) {
    this.published = published;
    return this;
  }

  /**
   * Output only. A link to the published revision. This is only populated for Docs Editors files.
   * @return value or {@code null} for none
   */
  public java.lang.String getPublishedLink() {
    return publishedLink;
  }

  /**
   * Output only. A link to the published revision. This is only populated for Docs Editors files.
   * @param publishedLink publishedLink or {@code null} for none
   */
  public Revision setPublishedLink(java.lang.String publishedLink) {
    this.publishedLink = publishedLink;
    return this;
  }

  /**
   * Whether this revision is published outside the domain. This is only applicable to Docs Editors
   * files.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPublishedOutsideDomain() {
    return publishedOutsideDomain;
  }

  /**
   * Whether this revision is published outside the domain. This is only applicable to Docs Editors
   * files.
   * @param publishedOutsideDomain publishedOutsideDomain or {@code null} for none
   */
  public Revision setPublishedOutsideDomain(java.lang.Boolean publishedOutsideDomain) {
    this.publishedOutsideDomain = publishedOutsideDomain;
    return this;
  }

  /**
   * Output only. The size of the revision's content in bytes. This is only applicable to files with
   * binary content in Drive.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSize() {
    return size;
  }

  /**
   * Output only. The size of the revision's content in bytes. This is only applicable to files with
   * binary content in Drive.
   * @param size size or {@code null} for none
   */
  public Revision setSize(java.lang.Long size) {
    this.size = size;
    return this;
  }

  @Override
  public Revision set(String fieldName, Object value) {
    return (Revision) super.set(fieldName, value);
  }

  @Override
  public Revision clone() {
    return (Revision) super.clone();
  }

}
