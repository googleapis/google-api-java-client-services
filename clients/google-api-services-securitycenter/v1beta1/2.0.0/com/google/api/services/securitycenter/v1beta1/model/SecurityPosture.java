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

package com.google.api.services.securitycenter.v1beta1.model;

/**
 * Represents a posture that is deployed on Google Cloud by the Security Command Center Posture
 * Management service. A posture contains one or more policy sets. A policy set is a group of
 * policies that enforce a set of security rules on Google Cloud.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SecurityPosture extends com.google.api.client.json.GenericJson {

  /**
   * The name of the updated policy, for example,
   * `projects/{project_id}/policies/{constraint_name}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String changedPolicy;

  /**
   * Name of the posture, for example, `CIS-Posture`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The ID of the updated policy, for example, `compute-policy-1`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String policy;

  /**
   * The details about a change in an updated policy that violates the deployed posture.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PolicyDriftDetails> policyDriftDetails;

  static {
    // hack to force ProGuard to consider PolicyDriftDetails used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PolicyDriftDetails.class);
  }

  /**
   * The name of the updated policyset, for example, `cis-policyset`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String policySet;

  /**
   * The name of the posture deployment, for example,
   * `organizations/{org_id}/posturedeployments/{posture_deployment_id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String postureDeployment;

  /**
   * The project, folder, or organization on which the posture is deployed, for example,
   * `projects/{project_number}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String postureDeploymentResource;

  /**
   * The version of the posture, for example, `c7cfa2a8`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String revisionId;

  /**
   * The name of the updated policy, for example,
   * `projects/{project_id}/policies/{constraint_name}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getChangedPolicy() {
    return changedPolicy;
  }

  /**
   * The name of the updated policy, for example,
   * `projects/{project_id}/policies/{constraint_name}`.
   * @param changedPolicy changedPolicy or {@code null} for none
   */
  public SecurityPosture setChangedPolicy(java.lang.String changedPolicy) {
    this.changedPolicy = changedPolicy;
    return this;
  }

  /**
   * Name of the posture, for example, `CIS-Posture`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the posture, for example, `CIS-Posture`.
   * @param name name or {@code null} for none
   */
  public SecurityPosture setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The ID of the updated policy, for example, `compute-policy-1`.
   * @return value or {@code null} for none
   */
  public java.lang.String getPolicy() {
    return policy;
  }

  /**
   * The ID of the updated policy, for example, `compute-policy-1`.
   * @param policy policy or {@code null} for none
   */
  public SecurityPosture setPolicy(java.lang.String policy) {
    this.policy = policy;
    return this;
  }

  /**
   * The details about a change in an updated policy that violates the deployed posture.
   * @return value or {@code null} for none
   */
  public java.util.List<PolicyDriftDetails> getPolicyDriftDetails() {
    return policyDriftDetails;
  }

  /**
   * The details about a change in an updated policy that violates the deployed posture.
   * @param policyDriftDetails policyDriftDetails or {@code null} for none
   */
  public SecurityPosture setPolicyDriftDetails(java.util.List<PolicyDriftDetails> policyDriftDetails) {
    this.policyDriftDetails = policyDriftDetails;
    return this;
  }

  /**
   * The name of the updated policyset, for example, `cis-policyset`.
   * @return value or {@code null} for none
   */
  public java.lang.String getPolicySet() {
    return policySet;
  }

  /**
   * The name of the updated policyset, for example, `cis-policyset`.
   * @param policySet policySet or {@code null} for none
   */
  public SecurityPosture setPolicySet(java.lang.String policySet) {
    this.policySet = policySet;
    return this;
  }

  /**
   * The name of the posture deployment, for example,
   * `organizations/{org_id}/posturedeployments/{posture_deployment_id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getPostureDeployment() {
    return postureDeployment;
  }

  /**
   * The name of the posture deployment, for example,
   * `organizations/{org_id}/posturedeployments/{posture_deployment_id}`.
   * @param postureDeployment postureDeployment or {@code null} for none
   */
  public SecurityPosture setPostureDeployment(java.lang.String postureDeployment) {
    this.postureDeployment = postureDeployment;
    return this;
  }

  /**
   * The project, folder, or organization on which the posture is deployed, for example,
   * `projects/{project_number}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getPostureDeploymentResource() {
    return postureDeploymentResource;
  }

  /**
   * The project, folder, or organization on which the posture is deployed, for example,
   * `projects/{project_number}`.
   * @param postureDeploymentResource postureDeploymentResource or {@code null} for none
   */
  public SecurityPosture setPostureDeploymentResource(java.lang.String postureDeploymentResource) {
    this.postureDeploymentResource = postureDeploymentResource;
    return this;
  }

  /**
   * The version of the posture, for example, `c7cfa2a8`.
   * @return value or {@code null} for none
   */
  public java.lang.String getRevisionId() {
    return revisionId;
  }

  /**
   * The version of the posture, for example, `c7cfa2a8`.
   * @param revisionId revisionId or {@code null} for none
   */
  public SecurityPosture setRevisionId(java.lang.String revisionId) {
    this.revisionId = revisionId;
    return this;
  }

  @Override
  public SecurityPosture set(String fieldName, Object value) {
    return (SecurityPosture) super.set(fieldName, value);
  }

  @Override
  public SecurityPosture clone() {
    return (SecurityPosture) super.clone();
  }

}
