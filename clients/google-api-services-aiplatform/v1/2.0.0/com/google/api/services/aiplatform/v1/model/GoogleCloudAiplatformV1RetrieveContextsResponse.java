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

package com.google.api.services.aiplatform.v1.model;

/**
 * Response message for VertexRagService.RetrieveContexts.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1RetrieveContextsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The contexts of the query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1RagContexts contexts;

  /**
   * The contexts of the query.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1RagContexts getContexts() {
    return contexts;
  }

  /**
   * The contexts of the query.
   * @param contexts contexts or {@code null} for none
   */
  public GoogleCloudAiplatformV1RetrieveContextsResponse setContexts(GoogleCloudAiplatformV1RagContexts contexts) {
    this.contexts = contexts;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1RetrieveContextsResponse set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1RetrieveContextsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1RetrieveContextsResponse clone() {
    return (GoogleCloudAiplatformV1RetrieveContextsResponse) super.clone();
  }

}
