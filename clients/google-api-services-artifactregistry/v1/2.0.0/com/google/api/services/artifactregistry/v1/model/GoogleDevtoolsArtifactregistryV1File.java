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

package com.google.api.services.artifactregistry.v1.model;

/**
 * Files store content that is potentially associated with Packages or Versions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Artifact Registry API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDevtoolsArtifactregistryV1File extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Client specified annotations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> annotations;

  /**
   * Output only. The time when the File was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The time when the last attempt to refresh the file's data was made. Only set when
   * the repository is remote.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String fetchTime;

  /**
   * The hashes of the file content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Hash> hashes;

  /**
   * The name of the file, for example: `projects/p1/locations/us-
   * central1/repositories/repo1/files/a%2Fb%2Fc.txt`. If the file ID part contains slashes, they
   * are escaped.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The name of the Package or Version that owns this file, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String owner;

  /**
   * The size of the File in bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long sizeBytes;

  /**
   * Output only. The time when the File was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Optional. Client specified annotations.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAnnotations() {
    return annotations;
  }

  /**
   * Optional. Client specified annotations.
   * @param annotations annotations or {@code null} for none
   */
  public GoogleDevtoolsArtifactregistryV1File setAnnotations(java.util.Map<String, java.lang.String> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * Output only. The time when the File was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time when the File was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleDevtoolsArtifactregistryV1File setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The time when the last attempt to refresh the file's data was made. Only set when
   * the repository is remote.
   * @return value or {@code null} for none
   */
  public String getFetchTime() {
    return fetchTime;
  }

  /**
   * Output only. The time when the last attempt to refresh the file's data was made. Only set when
   * the repository is remote.
   * @param fetchTime fetchTime or {@code null} for none
   */
  public GoogleDevtoolsArtifactregistryV1File setFetchTime(String fetchTime) {
    this.fetchTime = fetchTime;
    return this;
  }

  /**
   * The hashes of the file content.
   * @return value or {@code null} for none
   */
  public java.util.List<Hash> getHashes() {
    return hashes;
  }

  /**
   * The hashes of the file content.
   * @param hashes hashes or {@code null} for none
   */
  public GoogleDevtoolsArtifactregistryV1File setHashes(java.util.List<Hash> hashes) {
    this.hashes = hashes;
    return this;
  }

  /**
   * The name of the file, for example: `projects/p1/locations/us-
   * central1/repositories/repo1/files/a%2Fb%2Fc.txt`. If the file ID part contains slashes, they
   * are escaped.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the file, for example: `projects/p1/locations/us-
   * central1/repositories/repo1/files/a%2Fb%2Fc.txt`. If the file ID part contains slashes, they
   * are escaped.
   * @param name name or {@code null} for none
   */
  public GoogleDevtoolsArtifactregistryV1File setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the Package or Version that owns this file, if any.
   * @return value or {@code null} for none
   */
  public java.lang.String getOwner() {
    return owner;
  }

  /**
   * The name of the Package or Version that owns this file, if any.
   * @param owner owner or {@code null} for none
   */
  public GoogleDevtoolsArtifactregistryV1File setOwner(java.lang.String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * The size of the File in bytes.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSizeBytes() {
    return sizeBytes;
  }

  /**
   * The size of the File in bytes.
   * @param sizeBytes sizeBytes or {@code null} for none
   */
  public GoogleDevtoolsArtifactregistryV1File setSizeBytes(java.lang.Long sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }

  /**
   * Output only. The time when the File was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time when the File was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleDevtoolsArtifactregistryV1File setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleDevtoolsArtifactregistryV1File set(String fieldName, Object value) {
    return (GoogleDevtoolsArtifactregistryV1File) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsArtifactregistryV1File clone() {
    return (GoogleDevtoolsArtifactregistryV1File) super.clone();
  }

}
