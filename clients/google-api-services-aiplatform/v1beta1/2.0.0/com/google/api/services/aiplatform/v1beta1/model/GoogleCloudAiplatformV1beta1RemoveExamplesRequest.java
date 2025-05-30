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

package com.google.api.services.aiplatform.v1beta1.model;

/**
 * Request message for ExampleStoreService.RemoveExamples.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1RemoveExamplesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Example IDs to remove. If both metadata filters and Example IDs are specified, the
   * metadata filters will be applied to the specified examples in order to identify which should be
   * removed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> exampleIds;

  /**
   * The metadata filters for StoredContentsExamples.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1StoredContentsExampleFilter storedContentsExampleFilter;

  /**
   * Optional. Example IDs to remove. If both metadata filters and Example IDs are specified, the
   * metadata filters will be applied to the specified examples in order to identify which should be
   * removed.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExampleIds() {
    return exampleIds;
  }

  /**
   * Optional. Example IDs to remove. If both metadata filters and Example IDs are specified, the
   * metadata filters will be applied to the specified examples in order to identify which should be
   * removed.
   * @param exampleIds exampleIds or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1RemoveExamplesRequest setExampleIds(java.util.List<java.lang.String> exampleIds) {
    this.exampleIds = exampleIds;
    return this;
  }

  /**
   * The metadata filters for StoredContentsExamples.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1StoredContentsExampleFilter getStoredContentsExampleFilter() {
    return storedContentsExampleFilter;
  }

  /**
   * The metadata filters for StoredContentsExamples.
   * @param storedContentsExampleFilter storedContentsExampleFilter or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1RemoveExamplesRequest setStoredContentsExampleFilter(GoogleCloudAiplatformV1beta1StoredContentsExampleFilter storedContentsExampleFilter) {
    this.storedContentsExampleFilter = storedContentsExampleFilter;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1RemoveExamplesRequest set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1RemoveExamplesRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1RemoveExamplesRequest clone() {
    return (GoogleCloudAiplatformV1beta1RemoveExamplesRequest) super.clone();
  }

}
