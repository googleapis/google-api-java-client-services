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

package com.google.api.services.clouddeploy.v1.model;

/**
 * RetryJobRequest is the request object used by `RetryJob`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Deploy API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RetryJobRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The job ID for the Job to retry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jobId;

  /**
   * Optional. Deploy policies to override. Format is
   * `projects/{project}/locations/{location}/deployPolicies/{deployPolicy}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> overrideDeployPolicy;

  /**
   * Required. The phase ID the Job to retry belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phaseId;

  /**
   * Required. The job ID for the Job to retry.
   * @return value or {@code null} for none
   */
  public java.lang.String getJobId() {
    return jobId;
  }

  /**
   * Required. The job ID for the Job to retry.
   * @param jobId jobId or {@code null} for none
   */
  public RetryJobRequest setJobId(java.lang.String jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * Optional. Deploy policies to override. Format is
   * `projects/{project}/locations/{location}/deployPolicies/{deployPolicy}`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getOverrideDeployPolicy() {
    return overrideDeployPolicy;
  }

  /**
   * Optional. Deploy policies to override. Format is
   * `projects/{project}/locations/{location}/deployPolicies/{deployPolicy}`.
   * @param overrideDeployPolicy overrideDeployPolicy or {@code null} for none
   */
  public RetryJobRequest setOverrideDeployPolicy(java.util.List<java.lang.String> overrideDeployPolicy) {
    this.overrideDeployPolicy = overrideDeployPolicy;
    return this;
  }

  /**
   * Required. The phase ID the Job to retry belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhaseId() {
    return phaseId;
  }

  /**
   * Required. The phase ID the Job to retry belongs to.
   * @param phaseId phaseId or {@code null} for none
   */
  public RetryJobRequest setPhaseId(java.lang.String phaseId) {
    this.phaseId = phaseId;
    return this;
  }

  @Override
  public RetryJobRequest set(String fieldName, Object value) {
    return (RetryJobRequest) super.set(fieldName, value);
  }

  @Override
  public RetryJobRequest clone() {
    return (RetryJobRequest) super.clone();
  }

}
