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

package com.google.api.services.osconfig.v2.model;

/**
 * Represents a resource that is being orchestrated by the policy orchestrator.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudOsconfigV2OrchestratedResource extends com.google.api.client.json.GenericJson {

  /**
   * Optional. ID of the resource to be used while generating set of affected resources. For UPSERT
   * action the value is auto-generated during PolicyOrchestrator creation when not set. When the
   * value is set it should following next restrictions: * Must contain only lowercase letters,
   * numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end
   * with a number or a letter. * Must be unique within the project. For DELETE action, ID must be
   * specified explicitly during PolicyOrchestrator creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Optional. OSPolicyAssignment resource to be created, updated or deleted. Name field is ignored
   * and replace with a generated value. With this field set, orchestrator will perform actions on
   * `project/{project}/locations/{zone}/osPolicyAssignments/{resource_id}` resources, where
   * `project` and `zone` pairs come from the expanded scope, and `resource_id` comes from the
   * `resource_id` field of orchestrator resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OSPolicyAssignment osPolicyAssignmentV1Payload;

  /**
   * Optional. ID of the resource to be used while generating set of affected resources. For UPSERT
   * action the value is auto-generated during PolicyOrchestrator creation when not set. When the
   * value is set it should following next restrictions: * Must contain only lowercase letters,
   * numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end
   * with a number or a letter. * Must be unique within the project. For DELETE action, ID must be
   * specified explicitly during PolicyOrchestrator creation.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Optional. ID of the resource to be used while generating set of affected resources. For UPSERT
   * action the value is auto-generated during PolicyOrchestrator creation when not set. When the
   * value is set it should following next restrictions: * Must contain only lowercase letters,
   * numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end
   * with a number or a letter. * Must be unique within the project. For DELETE action, ID must be
   * specified explicitly during PolicyOrchestrator creation.
   * @param id id or {@code null} for none
   */
  public GoogleCloudOsconfigV2OrchestratedResource setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Optional. OSPolicyAssignment resource to be created, updated or deleted. Name field is ignored
   * and replace with a generated value. With this field set, orchestrator will perform actions on
   * `project/{project}/locations/{zone}/osPolicyAssignments/{resource_id}` resources, where
   * `project` and `zone` pairs come from the expanded scope, and `resource_id` comes from the
   * `resource_id` field of orchestrator resource.
   * @return value or {@code null} for none
   */
  public OSPolicyAssignment getOsPolicyAssignmentV1Payload() {
    return osPolicyAssignmentV1Payload;
  }

  /**
   * Optional. OSPolicyAssignment resource to be created, updated or deleted. Name field is ignored
   * and replace with a generated value. With this field set, orchestrator will perform actions on
   * `project/{project}/locations/{zone}/osPolicyAssignments/{resource_id}` resources, where
   * `project` and `zone` pairs come from the expanded scope, and `resource_id` comes from the
   * `resource_id` field of orchestrator resource.
   * @param osPolicyAssignmentV1Payload osPolicyAssignmentV1Payload or {@code null} for none
   */
  public GoogleCloudOsconfigV2OrchestratedResource setOsPolicyAssignmentV1Payload(OSPolicyAssignment osPolicyAssignmentV1Payload) {
    this.osPolicyAssignmentV1Payload = osPolicyAssignmentV1Payload;
    return this;
  }

  @Override
  public GoogleCloudOsconfigV2OrchestratedResource set(String fieldName, Object value) {
    return (GoogleCloudOsconfigV2OrchestratedResource) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudOsconfigV2OrchestratedResource clone() {
    return (GoogleCloudOsconfigV2OrchestratedResource) super.clone();
  }

}
