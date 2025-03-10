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
 * Process Summary
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProcessSummary extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String addTime;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hostPort;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isActive;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String processId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> processLogs;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String removeTime;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalCores;

  /**
   * @return value or {@code null} for none
   */
  public String getAddTime() {
    return addTime;
  }

  /**
   * @param addTime addTime or {@code null} for none
   */
  public ProcessSummary setAddTime(String addTime) {
    this.addTime = addTime;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getHostPort() {
    return hostPort;
  }

  /**
   * @param hostPort hostPort or {@code null} for none
   */
  public ProcessSummary setHostPort(java.lang.String hostPort) {
    this.hostPort = hostPort;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsActive() {
    return isActive;
  }

  /**
   * @param isActive isActive or {@code null} for none
   */
  public ProcessSummary setIsActive(java.lang.Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getProcessId() {
    return processId;
  }

  /**
   * @param processId processId or {@code null} for none
   */
  public ProcessSummary setProcessId(java.lang.String processId) {
    this.processId = processId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getProcessLogs() {
    return processLogs;
  }

  /**
   * @param processLogs processLogs or {@code null} for none
   */
  public ProcessSummary setProcessLogs(java.util.Map<String, java.lang.String> processLogs) {
    this.processLogs = processLogs;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public String getRemoveTime() {
    return removeTime;
  }

  /**
   * @param removeTime removeTime or {@code null} for none
   */
  public ProcessSummary setRemoveTime(String removeTime) {
    this.removeTime = removeTime;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalCores() {
    return totalCores;
  }

  /**
   * @param totalCores totalCores or {@code null} for none
   */
  public ProcessSummary setTotalCores(java.lang.Integer totalCores) {
    this.totalCores = totalCores;
    return this;
  }

  @Override
  public ProcessSummary set(String fieldName, Object value) {
    return (ProcessSummary) super.set(fieldName, value);
  }

  @Override
  public ProcessSummary clone() {
    return (ProcessSummary) super.clone();
  }

}
