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

package com.google.api.services.integrations.v1.model;

/**
 * The request for testing an integration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Application Integration API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudIntegrationsV1alphaTestIntegrationsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. This is used to identify the client on whose behalf the event will be executed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientId;

  /**
   * Optional. Config parameters used during integration execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> configParameters;

  /**
   * Optional. custom deadline of the rpc
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String deadlineSecondsTime;

  /**
   * Optional. Input parameters used during integration execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudIntegrationsV1alphaValueType> inputParameters;

  /**
   * Required. integration config to execute the workflow
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudIntegrationsV1alphaIntegrationVersion integrationVersion;

  /**
   * Optional. Passed in as parameters to each integration execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EnterpriseCrmFrontendsEventbusProtoEventParameters parameters;

  /**
   * Optional. Can be specified in the event request, otherwise false (default). If true, enables
   * tasks with condition "test_mode = true". If false, disables tasks with condition "test_mode =
   * true" if global test mode (set by platform) is also false {@link EventBusConfig}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean testMode;

  /**
   * Required. The trigger id of the integration trigger config. If both trigger_id and client_id is
   * present, the integration is executed from the start tasks provided by the matching trigger
   * config otherwise it is executed from the default start tasks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String triggerId;

  /**
   * Required. This is used to identify the client on whose behalf the event will be executed.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientId() {
    return clientId;
  }

  /**
   * Required. This is used to identify the client on whose behalf the event will be executed.
   * @param clientId clientId or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaTestIntegrationsRequest setClientId(java.lang.String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Optional. Config parameters used during integration execution.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getConfigParameters() {
    return configParameters;
  }

  /**
   * Optional. Config parameters used during integration execution.
   * @param configParameters configParameters or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaTestIntegrationsRequest setConfigParameters(java.util.Map<String, java.lang.Object> configParameters) {
    this.configParameters = configParameters;
    return this;
  }

  /**
   * Optional. custom deadline of the rpc
   * @return value or {@code null} for none
   */
  public String getDeadlineSecondsTime() {
    return deadlineSecondsTime;
  }

  /**
   * Optional. custom deadline of the rpc
   * @param deadlineSecondsTime deadlineSecondsTime or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaTestIntegrationsRequest setDeadlineSecondsTime(String deadlineSecondsTime) {
    this.deadlineSecondsTime = deadlineSecondsTime;
    return this;
  }

  /**
   * Optional. Input parameters used during integration execution.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudIntegrationsV1alphaValueType> getInputParameters() {
    return inputParameters;
  }

  /**
   * Optional. Input parameters used during integration execution.
   * @param inputParameters inputParameters or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaTestIntegrationsRequest setInputParameters(java.util.Map<String, GoogleCloudIntegrationsV1alphaValueType> inputParameters) {
    this.inputParameters = inputParameters;
    return this;
  }

  /**
   * Required. integration config to execute the workflow
   * @return value or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion getIntegrationVersion() {
    return integrationVersion;
  }

  /**
   * Required. integration config to execute the workflow
   * @param integrationVersion integrationVersion or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaTestIntegrationsRequest setIntegrationVersion(GoogleCloudIntegrationsV1alphaIntegrationVersion integrationVersion) {
    this.integrationVersion = integrationVersion;
    return this;
  }

  /**
   * Optional. Passed in as parameters to each integration execution.
   * @return value or {@code null} for none
   */
  public EnterpriseCrmFrontendsEventbusProtoEventParameters getParameters() {
    return parameters;
  }

  /**
   * Optional. Passed in as parameters to each integration execution.
   * @param parameters parameters or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaTestIntegrationsRequest setParameters(EnterpriseCrmFrontendsEventbusProtoEventParameters parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Optional. Can be specified in the event request, otherwise false (default). If true, enables
   * tasks with condition "test_mode = true". If false, disables tasks with condition "test_mode =
   * true" if global test mode (set by platform) is also false {@link EventBusConfig}.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTestMode() {
    return testMode;
  }

  /**
   * Optional. Can be specified in the event request, otherwise false (default). If true, enables
   * tasks with condition "test_mode = true". If false, disables tasks with condition "test_mode =
   * true" if global test mode (set by platform) is also false {@link EventBusConfig}.
   * @param testMode testMode or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaTestIntegrationsRequest setTestMode(java.lang.Boolean testMode) {
    this.testMode = testMode;
    return this;
  }

  /**
   * Required. The trigger id of the integration trigger config. If both trigger_id and client_id is
   * present, the integration is executed from the start tasks provided by the matching trigger
   * config otherwise it is executed from the default start tasks.
   * @return value or {@code null} for none
   */
  public java.lang.String getTriggerId() {
    return triggerId;
  }

  /**
   * Required. The trigger id of the integration trigger config. If both trigger_id and client_id is
   * present, the integration is executed from the start tasks provided by the matching trigger
   * config otherwise it is executed from the default start tasks.
   * @param triggerId triggerId or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaTestIntegrationsRequest setTriggerId(java.lang.String triggerId) {
    this.triggerId = triggerId;
    return this;
  }

  @Override
  public GoogleCloudIntegrationsV1alphaTestIntegrationsRequest set(String fieldName, Object value) {
    return (GoogleCloudIntegrationsV1alphaTestIntegrationsRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIntegrationsV1alphaTestIntegrationsRequest clone() {
    return (GoogleCloudIntegrationsV1alphaTestIntegrationsRequest) super.clone();
  }

}
