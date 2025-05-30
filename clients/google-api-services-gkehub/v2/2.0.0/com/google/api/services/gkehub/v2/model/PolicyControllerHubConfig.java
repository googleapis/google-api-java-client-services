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

package com.google.api.services.gkehub.v2.model;

/**
 * Configuration for Policy Controller
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PolicyControllerHubConfig extends com.google.api.client.json.GenericJson {

  /**
   * Sets the interval for Policy Controller Audit Scans (in seconds). When set to 0, this disables
   * audit functionality altogether.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long auditIntervalSeconds;

  /**
   * The maximum number of audit violations to be stored in a constraint. If not set, the internal
   * default (currently 20) will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long constraintViolationLimit;

  /**
   * Map of deployment configs to deployments (“admission”, “audit”, “mutation”).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, PolicyControllerPolicyControllerDeploymentConfig> deploymentConfigs;

  /**
   * The set of namespaces that are excluded from Policy Controller checks. Namespaces do not need
   * to currently exist on the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> exemptableNamespaces;

  /**
   * The install_spec represents the intended state specified by the latest request that mutated
   * install_spec in the feature spec, not the lifecycle state of the feature observed by the Hub
   * feature controller that is reported in the feature state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String installSpec;

  /**
   * Logs all denies and dry run failures.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean logDeniesEnabled;

  /**
   * Monitoring specifies the configuration of monitoring.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PolicyControllerMonitoringConfig monitoring;

  /**
   * Enables the ability to mutate resources using Policy Controller.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean mutationEnabled;

  /**
   * Specifies the desired policy content on the cluster
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PolicyControllerPolicyContentSpec policyContent;

  /**
   * Enables the ability to use Constraint Templates that reference to objects other than the object
   * currently being evaluated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean referentialRulesEnabled;

  /**
   * Sets the interval for Policy Controller Audit Scans (in seconds). When set to 0, this disables
   * audit functionality altogether.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAuditIntervalSeconds() {
    return auditIntervalSeconds;
  }

  /**
   * Sets the interval for Policy Controller Audit Scans (in seconds). When set to 0, this disables
   * audit functionality altogether.
   * @param auditIntervalSeconds auditIntervalSeconds or {@code null} for none
   */
  public PolicyControllerHubConfig setAuditIntervalSeconds(java.lang.Long auditIntervalSeconds) {
    this.auditIntervalSeconds = auditIntervalSeconds;
    return this;
  }

  /**
   * The maximum number of audit violations to be stored in a constraint. If not set, the internal
   * default (currently 20) will be used.
   * @return value or {@code null} for none
   */
  public java.lang.Long getConstraintViolationLimit() {
    return constraintViolationLimit;
  }

  /**
   * The maximum number of audit violations to be stored in a constraint. If not set, the internal
   * default (currently 20) will be used.
   * @param constraintViolationLimit constraintViolationLimit or {@code null} for none
   */
  public PolicyControllerHubConfig setConstraintViolationLimit(java.lang.Long constraintViolationLimit) {
    this.constraintViolationLimit = constraintViolationLimit;
    return this;
  }

  /**
   * Map of deployment configs to deployments (“admission”, “audit”, “mutation”).
   * @return value or {@code null} for none
   */
  public java.util.Map<String, PolicyControllerPolicyControllerDeploymentConfig> getDeploymentConfigs() {
    return deploymentConfigs;
  }

  /**
   * Map of deployment configs to deployments (“admission”, “audit”, “mutation”).
   * @param deploymentConfigs deploymentConfigs or {@code null} for none
   */
  public PolicyControllerHubConfig setDeploymentConfigs(java.util.Map<String, PolicyControllerPolicyControllerDeploymentConfig> deploymentConfigs) {
    this.deploymentConfigs = deploymentConfigs;
    return this;
  }

  /**
   * The set of namespaces that are excluded from Policy Controller checks. Namespaces do not need
   * to currently exist on the cluster.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExemptableNamespaces() {
    return exemptableNamespaces;
  }

  /**
   * The set of namespaces that are excluded from Policy Controller checks. Namespaces do not need
   * to currently exist on the cluster.
   * @param exemptableNamespaces exemptableNamespaces or {@code null} for none
   */
  public PolicyControllerHubConfig setExemptableNamespaces(java.util.List<java.lang.String> exemptableNamespaces) {
    this.exemptableNamespaces = exemptableNamespaces;
    return this;
  }

  /**
   * The install_spec represents the intended state specified by the latest request that mutated
   * install_spec in the feature spec, not the lifecycle state of the feature observed by the Hub
   * feature controller that is reported in the feature state.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstallSpec() {
    return installSpec;
  }

  /**
   * The install_spec represents the intended state specified by the latest request that mutated
   * install_spec in the feature spec, not the lifecycle state of the feature observed by the Hub
   * feature controller that is reported in the feature state.
   * @param installSpec installSpec or {@code null} for none
   */
  public PolicyControllerHubConfig setInstallSpec(java.lang.String installSpec) {
    this.installSpec = installSpec;
    return this;
  }

  /**
   * Logs all denies and dry run failures.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLogDeniesEnabled() {
    return logDeniesEnabled;
  }

  /**
   * Logs all denies and dry run failures.
   * @param logDeniesEnabled logDeniesEnabled or {@code null} for none
   */
  public PolicyControllerHubConfig setLogDeniesEnabled(java.lang.Boolean logDeniesEnabled) {
    this.logDeniesEnabled = logDeniesEnabled;
    return this;
  }

  /**
   * Monitoring specifies the configuration of monitoring.
   * @return value or {@code null} for none
   */
  public PolicyControllerMonitoringConfig getMonitoring() {
    return monitoring;
  }

  /**
   * Monitoring specifies the configuration of monitoring.
   * @param monitoring monitoring or {@code null} for none
   */
  public PolicyControllerHubConfig setMonitoring(PolicyControllerMonitoringConfig monitoring) {
    this.monitoring = monitoring;
    return this;
  }

  /**
   * Enables the ability to mutate resources using Policy Controller.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMutationEnabled() {
    return mutationEnabled;
  }

  /**
   * Enables the ability to mutate resources using Policy Controller.
   * @param mutationEnabled mutationEnabled or {@code null} for none
   */
  public PolicyControllerHubConfig setMutationEnabled(java.lang.Boolean mutationEnabled) {
    this.mutationEnabled = mutationEnabled;
    return this;
  }

  /**
   * Specifies the desired policy content on the cluster
   * @return value or {@code null} for none
   */
  public PolicyControllerPolicyContentSpec getPolicyContent() {
    return policyContent;
  }

  /**
   * Specifies the desired policy content on the cluster
   * @param policyContent policyContent or {@code null} for none
   */
  public PolicyControllerHubConfig setPolicyContent(PolicyControllerPolicyContentSpec policyContent) {
    this.policyContent = policyContent;
    return this;
  }

  /**
   * Enables the ability to use Constraint Templates that reference to objects other than the object
   * currently being evaluated.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReferentialRulesEnabled() {
    return referentialRulesEnabled;
  }

  /**
   * Enables the ability to use Constraint Templates that reference to objects other than the object
   * currently being evaluated.
   * @param referentialRulesEnabled referentialRulesEnabled or {@code null} for none
   */
  public PolicyControllerHubConfig setReferentialRulesEnabled(java.lang.Boolean referentialRulesEnabled) {
    this.referentialRulesEnabled = referentialRulesEnabled;
    return this;
  }

  @Override
  public PolicyControllerHubConfig set(String fieldName, Object value) {
    return (PolicyControllerHubConfig) super.set(fieldName, value);
  }

  @Override
  public PolicyControllerHubConfig clone() {
    return (PolicyControllerHubConfig) super.clone();
  }

}
