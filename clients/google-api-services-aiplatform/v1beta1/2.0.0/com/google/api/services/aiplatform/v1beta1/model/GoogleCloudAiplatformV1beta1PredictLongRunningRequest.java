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
 * Request message for PredictionService.PredictLongRunning.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1PredictLongRunningRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The instances that are the input to the prediction call. A DeployedModel may have an
   * upper limit on the number of instances it supports per request, and when it is exceeded the
   * prediction call errors in case of AutoML Models, or, in case of customer created Models, the
   * behaviour is as documented by that Model. The schema of any single instance may be specified
   * via Endpoint's DeployedModels' Model's PredictSchemata's instance_schema_uri.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Object> instances;

  /**
   * Optional. The parameters that govern the prediction. The schema of the parameters may be
   * specified via Endpoint's DeployedModels' Model's PredictSchemata's parameters_schema_uri.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object parameters;

  /**
   * Required. The instances that are the input to the prediction call. A DeployedModel may have an
   * upper limit on the number of instances it supports per request, and when it is exceeded the
   * prediction call errors in case of AutoML Models, or, in case of customer created Models, the
   * behaviour is as documented by that Model. The schema of any single instance may be specified
   * via Endpoint's DeployedModels' Model's PredictSchemata's instance_schema_uri.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Object> getInstances() {
    return instances;
  }

  /**
   * Required. The instances that are the input to the prediction call. A DeployedModel may have an
   * upper limit on the number of instances it supports per request, and when it is exceeded the
   * prediction call errors in case of AutoML Models, or, in case of customer created Models, the
   * behaviour is as documented by that Model. The schema of any single instance may be specified
   * via Endpoint's DeployedModels' Model's PredictSchemata's instance_schema_uri.
   * @param instances instances or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1PredictLongRunningRequest setInstances(java.util.List<java.lang.Object> instances) {
    this.instances = instances;
    return this;
  }

  /**
   * Optional. The parameters that govern the prediction. The schema of the parameters may be
   * specified via Endpoint's DeployedModels' Model's PredictSchemata's parameters_schema_uri.
   * @return value or {@code null} for none
   */
  public java.lang.Object getParameters() {
    return parameters;
  }

  /**
   * Optional. The parameters that govern the prediction. The schema of the parameters may be
   * specified via Endpoint's DeployedModels' Model's PredictSchemata's parameters_schema_uri.
   * @param parameters parameters or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1PredictLongRunningRequest setParameters(java.lang.Object parameters) {
    this.parameters = parameters;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1PredictLongRunningRequest set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1PredictLongRunningRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1PredictLongRunningRequest clone() {
    return (GoogleCloudAiplatformV1beta1PredictLongRunningRequest) super.clone();
  }

}
