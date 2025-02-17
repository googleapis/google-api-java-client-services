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

package com.google.api.services.container.v1beta1.model;

/**
 * WorkloadPolicyConfig is the configuration related to GCW workload policy
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WorkloadPolicyConfig extends com.google.api.client.json.GenericJson {

  /**
   * If true, workloads can use NET_ADMIN capability.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowNetAdmin;

  /**
   * If true, enables the GCW Auditor that audits workloads on standard clusters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autopilotCompatibilityAuditingEnabled;

  /**
   * If true, workloads can use NET_ADMIN capability.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowNetAdmin() {
    return allowNetAdmin;
  }

  /**
   * If true, workloads can use NET_ADMIN capability.
   * @param allowNetAdmin allowNetAdmin or {@code null} for none
   */
  public WorkloadPolicyConfig setAllowNetAdmin(java.lang.Boolean allowNetAdmin) {
    this.allowNetAdmin = allowNetAdmin;
    return this;
  }

  /**
   * If true, enables the GCW Auditor that audits workloads on standard clusters.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutopilotCompatibilityAuditingEnabled() {
    return autopilotCompatibilityAuditingEnabled;
  }

  /**
   * If true, enables the GCW Auditor that audits workloads on standard clusters.
   * @param autopilotCompatibilityAuditingEnabled autopilotCompatibilityAuditingEnabled or {@code null} for none
   */
  public WorkloadPolicyConfig setAutopilotCompatibilityAuditingEnabled(java.lang.Boolean autopilotCompatibilityAuditingEnabled) {
    this.autopilotCompatibilityAuditingEnabled = autopilotCompatibilityAuditingEnabled;
    return this;
  }

  @Override
  public WorkloadPolicyConfig set(String fieldName, Object value) {
    return (WorkloadPolicyConfig) super.set(fieldName, value);
  }

  @Override
  public WorkloadPolicyConfig clone() {
    return (WorkloadPolicyConfig) super.clone();
  }

}
