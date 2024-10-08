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

package com.google.api.services.migrationcenter.v1alpha1.model;

/**
 * Assets export job message.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Migration Center API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AssetsExportJob extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Conditions for selecting assets to export.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssetsExportJobExportCondition condition;

  /**
   * Output only. Resource creation time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Export asset inventory details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssetsExportJobInventory inventory;

  /**
   * Optional. Labels as key value pairs. Labels must meet the following constraints: * Keys and
   * values can contain only lowercase letters, numeric characters, underscores, and dashes. * All
   * characters must use UTF-8 encoding, and international characters are allowed. * Keys must start
   * with a lowercase letter or international character. * Each resource is limited to a maximum of
   * 64 labels. Both keys and values are additionally constrained to be <= 128 bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. Identifier. Resource name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Export data regarding asset network dependencies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssetsExportJobNetworkDependencies networkDependencies;

  /**
   * Export asset with performance data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssetsExportJobPerformanceData performanceData;

  /**
   * Output only. Recent non expired executions of the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AssetsExportJobExecution> recentExecutions;

  /**
   * Optional. When this value is set to 'true' the response will include all assets, including
   * those that are hidden.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean showHidden;

  /**
   * Export to Cloud Storage files downloadable using signed URIs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SignedUriDestination signedUriDestination;

  /**
   * Output only. Resource update time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Optional. Conditions for selecting assets to export.
   * @return value or {@code null} for none
   */
  public AssetsExportJobExportCondition getCondition() {
    return condition;
  }

  /**
   * Optional. Conditions for selecting assets to export.
   * @param condition condition or {@code null} for none
   */
  public AssetsExportJob setCondition(AssetsExportJobExportCondition condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Output only. Resource creation time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Resource creation time.
   * @param createTime createTime or {@code null} for none
   */
  public AssetsExportJob setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Export asset inventory details.
   * @return value or {@code null} for none
   */
  public AssetsExportJobInventory getInventory() {
    return inventory;
  }

  /**
   * Export asset inventory details.
   * @param inventory inventory or {@code null} for none
   */
  public AssetsExportJob setInventory(AssetsExportJobInventory inventory) {
    this.inventory = inventory;
    return this;
  }

  /**
   * Optional. Labels as key value pairs. Labels must meet the following constraints: * Keys and
   * values can contain only lowercase letters, numeric characters, underscores, and dashes. * All
   * characters must use UTF-8 encoding, and international characters are allowed. * Keys must start
   * with a lowercase letter or international character. * Each resource is limited to a maximum of
   * 64 labels. Both keys and values are additionally constrained to be <= 128 bytes.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Labels as key value pairs. Labels must meet the following constraints: * Keys and
   * values can contain only lowercase letters, numeric characters, underscores, and dashes. * All
   * characters must use UTF-8 encoding, and international characters are allowed. * Keys must start
   * with a lowercase letter or international character. * Each resource is limited to a maximum of
   * 64 labels. Both keys and values are additionally constrained to be <= 128 bytes.
   * @param labels labels or {@code null} for none
   */
  public AssetsExportJob setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. Identifier. Resource name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Identifier. Resource name.
   * @param name name or {@code null} for none
   */
  public AssetsExportJob setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Export data regarding asset network dependencies.
   * @return value or {@code null} for none
   */
  public AssetsExportJobNetworkDependencies getNetworkDependencies() {
    return networkDependencies;
  }

  /**
   * Export data regarding asset network dependencies.
   * @param networkDependencies networkDependencies or {@code null} for none
   */
  public AssetsExportJob setNetworkDependencies(AssetsExportJobNetworkDependencies networkDependencies) {
    this.networkDependencies = networkDependencies;
    return this;
  }

  /**
   * Export asset with performance data.
   * @return value or {@code null} for none
   */
  public AssetsExportJobPerformanceData getPerformanceData() {
    return performanceData;
  }

  /**
   * Export asset with performance data.
   * @param performanceData performanceData or {@code null} for none
   */
  public AssetsExportJob setPerformanceData(AssetsExportJobPerformanceData performanceData) {
    this.performanceData = performanceData;
    return this;
  }

  /**
   * Output only. Recent non expired executions of the job.
   * @return value or {@code null} for none
   */
  public java.util.List<AssetsExportJobExecution> getRecentExecutions() {
    return recentExecutions;
  }

  /**
   * Output only. Recent non expired executions of the job.
   * @param recentExecutions recentExecutions or {@code null} for none
   */
  public AssetsExportJob setRecentExecutions(java.util.List<AssetsExportJobExecution> recentExecutions) {
    this.recentExecutions = recentExecutions;
    return this;
  }

  /**
   * Optional. When this value is set to 'true' the response will include all assets, including
   * those that are hidden.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getShowHidden() {
    return showHidden;
  }

  /**
   * Optional. When this value is set to 'true' the response will include all assets, including
   * those that are hidden.
   * @param showHidden showHidden or {@code null} for none
   */
  public AssetsExportJob setShowHidden(java.lang.Boolean showHidden) {
    this.showHidden = showHidden;
    return this;
  }

  /**
   * Export to Cloud Storage files downloadable using signed URIs.
   * @return value or {@code null} for none
   */
  public SignedUriDestination getSignedUriDestination() {
    return signedUriDestination;
  }

  /**
   * Export to Cloud Storage files downloadable using signed URIs.
   * @param signedUriDestination signedUriDestination or {@code null} for none
   */
  public AssetsExportJob setSignedUriDestination(SignedUriDestination signedUriDestination) {
    this.signedUriDestination = signedUriDestination;
    return this;
  }

  /**
   * Output only. Resource update time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Resource update time.
   * @param updateTime updateTime or {@code null} for none
   */
  public AssetsExportJob setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public AssetsExportJob set(String fieldName, Object value) {
    return (AssetsExportJob) super.set(fieldName, value);
  }

  @Override
  public AssetsExportJob clone() {
    return (AssetsExportJob) super.clone();
  }

}
