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
 * The Model Registry Model and Online Prediction Endpoint associated with this TuningJob.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1TunedModel extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The checkpoints associated with this TunedModel. This field is only populated for
   * tuning jobs that enable intermediate checkpoints.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAiplatformV1TunedModelCheckpoint> checkpoints;

  /**
   * Output only. A resource name of an Endpoint. Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String endpoint;

  /**
   * Output only. The resource name of the TunedModel. Format:
   * `projects/{project}/locations/{location}/models/{model}@{version_id}` When tuning from a base
   * model, the version_id will be 1. For continuous tuning, the version id will be incremented by 1
   * from the last version id in the parent model. E.g.,
   * `projects/{project}/locations/{location}/models/{model}@{last_version_id + 1}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String model;

  /**
   * Output only. The checkpoints associated with this TunedModel. This field is only populated for
   * tuning jobs that enable intermediate checkpoints.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAiplatformV1TunedModelCheckpoint> getCheckpoints() {
    return checkpoints;
  }

  /**
   * Output only. The checkpoints associated with this TunedModel. This field is only populated for
   * tuning jobs that enable intermediate checkpoints.
   * @param checkpoints checkpoints or {@code null} for none
   */
  public GoogleCloudAiplatformV1TunedModel setCheckpoints(java.util.List<GoogleCloudAiplatformV1TunedModelCheckpoint> checkpoints) {
    this.checkpoints = checkpoints;
    return this;
  }

  /**
   * Output only. A resource name of an Endpoint. Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getEndpoint() {
    return endpoint;
  }

  /**
   * Output only. A resource name of an Endpoint. Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`.
   * @param endpoint endpoint or {@code null} for none
   */
  public GoogleCloudAiplatformV1TunedModel setEndpoint(java.lang.String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Output only. The resource name of the TunedModel. Format:
   * `projects/{project}/locations/{location}/models/{model}@{version_id}` When tuning from a base
   * model, the version_id will be 1. For continuous tuning, the version id will be incremented by 1
   * from the last version id in the parent model. E.g.,
   * `projects/{project}/locations/{location}/models/{model}@{last_version_id + 1}`
   * @return value or {@code null} for none
   */
  public java.lang.String getModel() {
    return model;
  }

  /**
   * Output only. The resource name of the TunedModel. Format:
   * `projects/{project}/locations/{location}/models/{model}@{version_id}` When tuning from a base
   * model, the version_id will be 1. For continuous tuning, the version id will be incremented by 1
   * from the last version id in the parent model. E.g.,
   * `projects/{project}/locations/{location}/models/{model}@{last_version_id + 1}`
   * @param model model or {@code null} for none
   */
  public GoogleCloudAiplatformV1TunedModel setModel(java.lang.String model) {
    this.model = model;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1TunedModel set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1TunedModel) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1TunedModel clone() {
    return (GoogleCloudAiplatformV1TunedModel) super.clone();
  }

}
