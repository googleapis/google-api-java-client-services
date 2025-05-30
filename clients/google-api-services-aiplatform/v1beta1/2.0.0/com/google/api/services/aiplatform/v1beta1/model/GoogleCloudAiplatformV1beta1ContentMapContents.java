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
 * Repeated Content type.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1ContentMapContents extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Repeated contents.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAiplatformV1beta1Content> contents;

  static {
    // hack to force ProGuard to consider GoogleCloudAiplatformV1beta1Content used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudAiplatformV1beta1Content.class);
  }

  /**
   * Optional. Repeated contents.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAiplatformV1beta1Content> getContents() {
    return contents;
  }

  /**
   * Optional. Repeated contents.
   * @param contents contents or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ContentMapContents setContents(java.util.List<GoogleCloudAiplatformV1beta1Content> contents) {
    this.contents = contents;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1ContentMapContents set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1ContentMapContents) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1ContentMapContents clone() {
    return (GoogleCloudAiplatformV1beta1ContentMapContents) super.clone();
  }

}
