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

package com.google.api.services.vision.v1.model;

/**
 * Multiple image annotation requests are batched into a single service call.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchAnnotateImagesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The labels with user-defined metadata for the request. Label keys and values can be
   * no longer than 63 characters (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed. Label values are
   * optional. Label keys must start with a letter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Optional. Target project and location to make a call. Format: `projects/{project-
   * id}/locations/{location-id}`. If no parent is specified, a region will be chosen automatically.
   * Supported location-ids: `us`: USA country only, `asia`: East asia areas, like Japan, Taiwan,
   * `eu`: The European Union. Example: `projects/project-A/locations/eu`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parent;

  /**
   * Required. Individual image annotation requests for this batch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AnnotateImageRequest> requests;

  static {
    // hack to force ProGuard to consider AnnotateImageRequest used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AnnotateImageRequest.class);
  }

  /**
   * Optional. The labels with user-defined metadata for the request. Label keys and values can be
   * no longer than 63 characters (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed. Label values are
   * optional. Label keys must start with a letter.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. The labels with user-defined metadata for the request. Label keys and values can be
   * no longer than 63 characters (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed. Label values are
   * optional. Label keys must start with a letter.
   * @param labels labels or {@code null} for none
   */
  public BatchAnnotateImagesRequest setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Optional. Target project and location to make a call. Format: `projects/{project-
   * id}/locations/{location-id}`. If no parent is specified, a region will be chosen automatically.
   * Supported location-ids: `us`: USA country only, `asia`: East asia areas, like Japan, Taiwan,
   * `eu`: The European Union. Example: `projects/project-A/locations/eu`.
   * @return value or {@code null} for none
   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * Optional. Target project and location to make a call. Format: `projects/{project-
   * id}/locations/{location-id}`. If no parent is specified, a region will be chosen automatically.
   * Supported location-ids: `us`: USA country only, `asia`: East asia areas, like Japan, Taiwan,
   * `eu`: The European Union. Example: `projects/project-A/locations/eu`.
   * @param parent parent or {@code null} for none
   */
  public BatchAnnotateImagesRequest setParent(java.lang.String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Required. Individual image annotation requests for this batch.
   * @return value or {@code null} for none
   */
  public java.util.List<AnnotateImageRequest> getRequests() {
    return requests;
  }

  /**
   * Required. Individual image annotation requests for this batch.
   * @param requests requests or {@code null} for none
   */
  public BatchAnnotateImagesRequest setRequests(java.util.List<AnnotateImageRequest> requests) {
    this.requests = requests;
    return this;
  }

  @Override
  public BatchAnnotateImagesRequest set(String fieldName, Object value) {
    return (BatchAnnotateImagesRequest) super.set(fieldName, value);
  }

  @Override
  public BatchAnnotateImagesRequest clone() {
    return (BatchAnnotateImagesRequest) super.clone();
  }

}
