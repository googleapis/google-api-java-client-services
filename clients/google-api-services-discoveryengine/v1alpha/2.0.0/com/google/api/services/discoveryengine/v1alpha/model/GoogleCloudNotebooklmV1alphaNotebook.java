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

package com.google.api.services.discoveryengine.v1alpha.model;

/**
 * Notebook is a resource where users can store their content (as sources) and interacts with the
 * content.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudNotebooklmV1alphaNotebook extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The emoji of the notebook.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String emoji;

  /**
   * The metadata of the notebook.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudNotebooklmV1alphaNotebookMetadata metadata;

  /**
   * Identifier. The identifier of the notebook. Format:
   * `projects/{project}/locations/{location}/notebooks/{notebook_id}`. This field must be a UTF-8
   * encoded string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. Notebook id, which is the last segment of the notebook's resource name. This is to
   * make it similar with notebooklm API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String notebookId;

  /**
   * Optional. The title of the notebook.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Output only. The emoji of the notebook.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmoji() {
    return emoji;
  }

  /**
   * Output only. The emoji of the notebook.
   * @param emoji emoji or {@code null} for none
   */
  public GoogleCloudNotebooklmV1alphaNotebook setEmoji(java.lang.String emoji) {
    this.emoji = emoji;
    return this;
  }

  /**
   * The metadata of the notebook.
   * @return value or {@code null} for none
   */
  public GoogleCloudNotebooklmV1alphaNotebookMetadata getMetadata() {
    return metadata;
  }

  /**
   * The metadata of the notebook.
   * @param metadata metadata or {@code null} for none
   */
  public GoogleCloudNotebooklmV1alphaNotebook setMetadata(GoogleCloudNotebooklmV1alphaNotebookMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Identifier. The identifier of the notebook. Format:
   * `projects/{project}/locations/{location}/notebooks/{notebook_id}`. This field must be a UTF-8
   * encoded string.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The identifier of the notebook. Format:
   * `projects/{project}/locations/{location}/notebooks/{notebook_id}`. This field must be a UTF-8
   * encoded string.
   * @param name name or {@code null} for none
   */
  public GoogleCloudNotebooklmV1alphaNotebook setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. Notebook id, which is the last segment of the notebook's resource name. This is to
   * make it similar with notebooklm API.
   * @return value or {@code null} for none
   */
  public java.lang.String getNotebookId() {
    return notebookId;
  }

  /**
   * Optional. Notebook id, which is the last segment of the notebook's resource name. This is to
   * make it similar with notebooklm API.
   * @param notebookId notebookId or {@code null} for none
   */
  public GoogleCloudNotebooklmV1alphaNotebook setNotebookId(java.lang.String notebookId) {
    this.notebookId = notebookId;
    return this;
  }

  /**
   * Optional. The title of the notebook.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Optional. The title of the notebook.
   * @param title title or {@code null} for none
   */
  public GoogleCloudNotebooklmV1alphaNotebook setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public GoogleCloudNotebooklmV1alphaNotebook set(String fieldName, Object value) {
    return (GoogleCloudNotebooklmV1alphaNotebook) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudNotebooklmV1alphaNotebook clone() {
    return (GoogleCloudNotebooklmV1alphaNotebook) super.clone();
  }

}
