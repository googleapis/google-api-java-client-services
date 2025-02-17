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

package com.google.api.services.dataproc.model;

/**
 * Outer message that contains the data obtained from spark listener, packaged with information that
 * is required to process it.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SparkWrapperObject extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppSummary appSummary;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ApplicationEnvironmentInfo applicationEnvironmentInfo;

  /**
   * Application Id created by Spark.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String applicationId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ApplicationInfo applicationInfo;

  /**
   * VM Timestamp associated with the data object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String eventTimestamp;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExecutorStageSummary executorStageSummary;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExecutorSummary executorSummary;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobData jobData;

  /**
   * Native Build Info
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NativeBuildInfoUiData nativeBuildInfoUiData;

  /**
   * Native SQL Execution Info
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NativeSqlExecutionUiData nativeSqlExecutionUiData;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PoolData poolData;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ProcessSummary processSummary;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RddOperationGraph rddOperationGraph;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RddStorageInfo rddStorageInfo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResourceProfileInfo resourceProfileInfo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SparkPlanGraph sparkPlanGraph;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SpeculationStageSummary speculationStageSummary;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SqlExecutionUiData sqlExecutionUiData;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StageData stageData;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StreamBlockData streamBlockData;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StreamingQueryData streamingQueryData;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StreamingQueryProgress streamingQueryProgress;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TaskData taskData;

  /**
   * @return value or {@code null} for none
   */
  public AppSummary getAppSummary() {
    return appSummary;
  }

  /**
   * @param appSummary appSummary or {@code null} for none
   */
  public SparkWrapperObject setAppSummary(AppSummary appSummary) {
    this.appSummary = appSummary;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public ApplicationEnvironmentInfo getApplicationEnvironmentInfo() {
    return applicationEnvironmentInfo;
  }

  /**
   * @param applicationEnvironmentInfo applicationEnvironmentInfo or {@code null} for none
   */
  public SparkWrapperObject setApplicationEnvironmentInfo(ApplicationEnvironmentInfo applicationEnvironmentInfo) {
    this.applicationEnvironmentInfo = applicationEnvironmentInfo;
    return this;
  }

  /**
   * Application Id created by Spark.
   * @return value or {@code null} for none
   */
  public java.lang.String getApplicationId() {
    return applicationId;
  }

  /**
   * Application Id created by Spark.
   * @param applicationId applicationId or {@code null} for none
   */
  public SparkWrapperObject setApplicationId(java.lang.String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public ApplicationInfo getApplicationInfo() {
    return applicationInfo;
  }

  /**
   * @param applicationInfo applicationInfo or {@code null} for none
   */
  public SparkWrapperObject setApplicationInfo(ApplicationInfo applicationInfo) {
    this.applicationInfo = applicationInfo;
    return this;
  }

  /**
   * VM Timestamp associated with the data object.
   * @return value or {@code null} for none
   */
  public String getEventTimestamp() {
    return eventTimestamp;
  }

  /**
   * VM Timestamp associated with the data object.
   * @param eventTimestamp eventTimestamp or {@code null} for none
   */
  public SparkWrapperObject setEventTimestamp(String eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public ExecutorStageSummary getExecutorStageSummary() {
    return executorStageSummary;
  }

  /**
   * @param executorStageSummary executorStageSummary or {@code null} for none
   */
  public SparkWrapperObject setExecutorStageSummary(ExecutorStageSummary executorStageSummary) {
    this.executorStageSummary = executorStageSummary;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public ExecutorSummary getExecutorSummary() {
    return executorSummary;
  }

  /**
   * @param executorSummary executorSummary or {@code null} for none
   */
  public SparkWrapperObject setExecutorSummary(ExecutorSummary executorSummary) {
    this.executorSummary = executorSummary;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public JobData getJobData() {
    return jobData;
  }

  /**
   * @param jobData jobData or {@code null} for none
   */
  public SparkWrapperObject setJobData(JobData jobData) {
    this.jobData = jobData;
    return this;
  }

  /**
   * Native Build Info
   * @return value or {@code null} for none
   */
  public NativeBuildInfoUiData getNativeBuildInfoUiData() {
    return nativeBuildInfoUiData;
  }

  /**
   * Native Build Info
   * @param nativeBuildInfoUiData nativeBuildInfoUiData or {@code null} for none
   */
  public SparkWrapperObject setNativeBuildInfoUiData(NativeBuildInfoUiData nativeBuildInfoUiData) {
    this.nativeBuildInfoUiData = nativeBuildInfoUiData;
    return this;
  }

  /**
   * Native SQL Execution Info
   * @return value or {@code null} for none
   */
  public NativeSqlExecutionUiData getNativeSqlExecutionUiData() {
    return nativeSqlExecutionUiData;
  }

  /**
   * Native SQL Execution Info
   * @param nativeSqlExecutionUiData nativeSqlExecutionUiData or {@code null} for none
   */
  public SparkWrapperObject setNativeSqlExecutionUiData(NativeSqlExecutionUiData nativeSqlExecutionUiData) {
    this.nativeSqlExecutionUiData = nativeSqlExecutionUiData;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public PoolData getPoolData() {
    return poolData;
  }

  /**
   * @param poolData poolData or {@code null} for none
   */
  public SparkWrapperObject setPoolData(PoolData poolData) {
    this.poolData = poolData;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public ProcessSummary getProcessSummary() {
    return processSummary;
  }

  /**
   * @param processSummary processSummary or {@code null} for none
   */
  public SparkWrapperObject setProcessSummary(ProcessSummary processSummary) {
    this.processSummary = processSummary;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public RddOperationGraph getRddOperationGraph() {
    return rddOperationGraph;
  }

  /**
   * @param rddOperationGraph rddOperationGraph or {@code null} for none
   */
  public SparkWrapperObject setRddOperationGraph(RddOperationGraph rddOperationGraph) {
    this.rddOperationGraph = rddOperationGraph;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public RddStorageInfo getRddStorageInfo() {
    return rddStorageInfo;
  }

  /**
   * @param rddStorageInfo rddStorageInfo or {@code null} for none
   */
  public SparkWrapperObject setRddStorageInfo(RddStorageInfo rddStorageInfo) {
    this.rddStorageInfo = rddStorageInfo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public ResourceProfileInfo getResourceProfileInfo() {
    return resourceProfileInfo;
  }

  /**
   * @param resourceProfileInfo resourceProfileInfo or {@code null} for none
   */
  public SparkWrapperObject setResourceProfileInfo(ResourceProfileInfo resourceProfileInfo) {
    this.resourceProfileInfo = resourceProfileInfo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public SparkPlanGraph getSparkPlanGraph() {
    return sparkPlanGraph;
  }

  /**
   * @param sparkPlanGraph sparkPlanGraph or {@code null} for none
   */
  public SparkWrapperObject setSparkPlanGraph(SparkPlanGraph sparkPlanGraph) {
    this.sparkPlanGraph = sparkPlanGraph;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public SpeculationStageSummary getSpeculationStageSummary() {
    return speculationStageSummary;
  }

  /**
   * @param speculationStageSummary speculationStageSummary or {@code null} for none
   */
  public SparkWrapperObject setSpeculationStageSummary(SpeculationStageSummary speculationStageSummary) {
    this.speculationStageSummary = speculationStageSummary;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public SqlExecutionUiData getSqlExecutionUiData() {
    return sqlExecutionUiData;
  }

  /**
   * @param sqlExecutionUiData sqlExecutionUiData or {@code null} for none
   */
  public SparkWrapperObject setSqlExecutionUiData(SqlExecutionUiData sqlExecutionUiData) {
    this.sqlExecutionUiData = sqlExecutionUiData;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public StageData getStageData() {
    return stageData;
  }

  /**
   * @param stageData stageData or {@code null} for none
   */
  public SparkWrapperObject setStageData(StageData stageData) {
    this.stageData = stageData;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public StreamBlockData getStreamBlockData() {
    return streamBlockData;
  }

  /**
   * @param streamBlockData streamBlockData or {@code null} for none
   */
  public SparkWrapperObject setStreamBlockData(StreamBlockData streamBlockData) {
    this.streamBlockData = streamBlockData;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public StreamingQueryData getStreamingQueryData() {
    return streamingQueryData;
  }

  /**
   * @param streamingQueryData streamingQueryData or {@code null} for none
   */
  public SparkWrapperObject setStreamingQueryData(StreamingQueryData streamingQueryData) {
    this.streamingQueryData = streamingQueryData;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public StreamingQueryProgress getStreamingQueryProgress() {
    return streamingQueryProgress;
  }

  /**
   * @param streamingQueryProgress streamingQueryProgress or {@code null} for none
   */
  public SparkWrapperObject setStreamingQueryProgress(StreamingQueryProgress streamingQueryProgress) {
    this.streamingQueryProgress = streamingQueryProgress;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public TaskData getTaskData() {
    return taskData;
  }

  /**
   * @param taskData taskData or {@code null} for none
   */
  public SparkWrapperObject setTaskData(TaskData taskData) {
    this.taskData = taskData;
    return this;
  }

  @Override
  public SparkWrapperObject set(String fieldName, Object value) {
    return (SparkWrapperObject) super.set(fieldName, value);
  }

  @Override
  public SparkWrapperObject clone() {
    return (SparkWrapperObject) super.clone();
  }

}
