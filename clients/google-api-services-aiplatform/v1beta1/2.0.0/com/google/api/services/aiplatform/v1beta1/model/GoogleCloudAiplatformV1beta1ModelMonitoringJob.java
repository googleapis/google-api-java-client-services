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
 * Represents a model monitoring job that analyze dataset using different monitoring algorithm.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1ModelMonitoringJob extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Timestamp when this ModelMonitoringJob was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The display name of the ModelMonitoringJob. The name can be up to 128 characters long and can
   * consist of any UTF-8.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. Execution results for all the monitoring objectives.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1ModelMonitoringJobExecutionDetail jobExecutionDetail;

  /**
   * Monitoring monitoring job spec. It outlines the specifications for monitoring objectives,
   * notifications, and result exports. If left blank, the default monitoring specifications from
   * the top-level resource 'ModelMonitor' will be applied. If provided, we will use the
   * specification defined here rather than the default one.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1ModelMonitoringSpec modelMonitoringSpec;

  /**
   * Output only. Resource name of a ModelMonitoringJob. Format: `projects/{project_id}/locations/{l
   * ocation_id}/modelMonitors/{model_monitor_id}/modelMonitoringJobs/{model_monitoring_job_id}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Schedule resource name. It will only appear when this job is triggered by a
   * schedule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String schedule;

  /**
   * Output only. Timestamp when this ModelMonitoringJob was scheduled. It will only appear when
   * this job is triggered by a schedule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String scheduleTime;

  /**
   * Output only. The state of the monitoring job. * When the job is still creating, the state will
   * be 'JOB_STATE_PENDING'. * Once the job is successfully created, the state will be
   * 'JOB_STATE_RUNNING'. * Once the job is finished, the state will be one of 'JOB_STATE_FAILED',
   * 'JOB_STATE_SUCCEEDED', 'JOB_STATE_PARTIALLY_SUCCEEDED'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Timestamp when this ModelMonitoringJob was updated most recently.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Timestamp when this ModelMonitoringJob was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Timestamp when this ModelMonitoringJob was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ModelMonitoringJob setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The display name of the ModelMonitoringJob. The name can be up to 128 characters long and can
   * consist of any UTF-8.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The display name of the ModelMonitoringJob. The name can be up to 128 characters long and can
   * consist of any UTF-8.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ModelMonitoringJob setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. Execution results for all the monitoring objectives.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ModelMonitoringJobExecutionDetail getJobExecutionDetail() {
    return jobExecutionDetail;
  }

  /**
   * Output only. Execution results for all the monitoring objectives.
   * @param jobExecutionDetail jobExecutionDetail or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ModelMonitoringJob setJobExecutionDetail(GoogleCloudAiplatformV1beta1ModelMonitoringJobExecutionDetail jobExecutionDetail) {
    this.jobExecutionDetail = jobExecutionDetail;
    return this;
  }

  /**
   * Monitoring monitoring job spec. It outlines the specifications for monitoring objectives,
   * notifications, and result exports. If left blank, the default monitoring specifications from
   * the top-level resource 'ModelMonitor' will be applied. If provided, we will use the
   * specification defined here rather than the default one.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ModelMonitoringSpec getModelMonitoringSpec() {
    return modelMonitoringSpec;
  }

  /**
   * Monitoring monitoring job spec. It outlines the specifications for monitoring objectives,
   * notifications, and result exports. If left blank, the default monitoring specifications from
   * the top-level resource 'ModelMonitor' will be applied. If provided, we will use the
   * specification defined here rather than the default one.
   * @param modelMonitoringSpec modelMonitoringSpec or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ModelMonitoringJob setModelMonitoringSpec(GoogleCloudAiplatformV1beta1ModelMonitoringSpec modelMonitoringSpec) {
    this.modelMonitoringSpec = modelMonitoringSpec;
    return this;
  }

  /**
   * Output only. Resource name of a ModelMonitoringJob. Format: `projects/{project_id}/locations/{l
   * ocation_id}/modelMonitors/{model_monitor_id}/modelMonitoringJobs/{model_monitoring_job_id}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of a ModelMonitoringJob. Format: `projects/{project_id}/locations/{l
   * ocation_id}/modelMonitors/{model_monitor_id}/modelMonitoringJobs/{model_monitoring_job_id}`
   * @param name name or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ModelMonitoringJob setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Schedule resource name. It will only appear when this job is triggered by a
   * schedule.
   * @return value or {@code null} for none
   */
  public java.lang.String getSchedule() {
    return schedule;
  }

  /**
   * Output only. Schedule resource name. It will only appear when this job is triggered by a
   * schedule.
   * @param schedule schedule or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ModelMonitoringJob setSchedule(java.lang.String schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Output only. Timestamp when this ModelMonitoringJob was scheduled. It will only appear when
   * this job is triggered by a schedule.
   * @return value or {@code null} for none
   */
  public String getScheduleTime() {
    return scheduleTime;
  }

  /**
   * Output only. Timestamp when this ModelMonitoringJob was scheduled. It will only appear when
   * this job is triggered by a schedule.
   * @param scheduleTime scheduleTime or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ModelMonitoringJob setScheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
    return this;
  }

  /**
   * Output only. The state of the monitoring job. * When the job is still creating, the state will
   * be 'JOB_STATE_PENDING'. * Once the job is successfully created, the state will be
   * 'JOB_STATE_RUNNING'. * Once the job is finished, the state will be one of 'JOB_STATE_FAILED',
   * 'JOB_STATE_SUCCEEDED', 'JOB_STATE_PARTIALLY_SUCCEEDED'.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The state of the monitoring job. * When the job is still creating, the state will
   * be 'JOB_STATE_PENDING'. * Once the job is successfully created, the state will be
   * 'JOB_STATE_RUNNING'. * Once the job is finished, the state will be one of 'JOB_STATE_FAILED',
   * 'JOB_STATE_SUCCEEDED', 'JOB_STATE_PARTIALLY_SUCCEEDED'.
   * @param state state or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ModelMonitoringJob setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Timestamp when this ModelMonitoringJob was updated most recently.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Timestamp when this ModelMonitoringJob was updated most recently.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ModelMonitoringJob setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1ModelMonitoringJob set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1ModelMonitoringJob) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1ModelMonitoringJob clone() {
    return (GoogleCloudAiplatformV1beta1ModelMonitoringJob) super.clone();
  }

}
