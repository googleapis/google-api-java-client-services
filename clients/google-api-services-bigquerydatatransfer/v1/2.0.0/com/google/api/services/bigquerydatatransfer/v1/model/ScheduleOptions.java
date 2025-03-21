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

package com.google.api.services.bigquerydatatransfer.v1.model;

/**
 * Options customizing the data transfer schedule.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery Data Transfer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ScheduleOptions extends com.google.api.client.json.GenericJson {

  /**
   * If true, automatic scheduling of data transfer runs for this configuration will be disabled.
   * The runs can be started on ad-hoc basis using StartManualTransferRuns API. When automatic
   * scheduling is disabled, the TransferConfig.schedule field will be ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableAutoScheduling;

  /**
   * Defines time to stop scheduling transfer runs. A transfer run cannot be scheduled at or after
   * the end time. The end time can be changed at any moment. The time when a data transfer can be
   * triggered manually is not limited by this option.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Specifies time to start scheduling transfer runs. The first run will be scheduled at or after
   * the start time according to a recurrence pattern defined in the schedule string. The start time
   * can be changed at any moment. The time when a data transfer can be triggered manually is not
   * limited by this option.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * If true, automatic scheduling of data transfer runs for this configuration will be disabled.
   * The runs can be started on ad-hoc basis using StartManualTransferRuns API. When automatic
   * scheduling is disabled, the TransferConfig.schedule field will be ignored.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableAutoScheduling() {
    return disableAutoScheduling;
  }

  /**
   * If true, automatic scheduling of data transfer runs for this configuration will be disabled.
   * The runs can be started on ad-hoc basis using StartManualTransferRuns API. When automatic
   * scheduling is disabled, the TransferConfig.schedule field will be ignored.
   * @param disableAutoScheduling disableAutoScheduling or {@code null} for none
   */
  public ScheduleOptions setDisableAutoScheduling(java.lang.Boolean disableAutoScheduling) {
    this.disableAutoScheduling = disableAutoScheduling;
    return this;
  }

  /**
   * Defines time to stop scheduling transfer runs. A transfer run cannot be scheduled at or after
   * the end time. The end time can be changed at any moment. The time when a data transfer can be
   * triggered manually is not limited by this option.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Defines time to stop scheduling transfer runs. A transfer run cannot be scheduled at or after
   * the end time. The end time can be changed at any moment. The time when a data transfer can be
   * triggered manually is not limited by this option.
   * @param endTime endTime or {@code null} for none
   */
  public ScheduleOptions setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Specifies time to start scheduling transfer runs. The first run will be scheduled at or after
   * the start time according to a recurrence pattern defined in the schedule string. The start time
   * can be changed at any moment. The time when a data transfer can be triggered manually is not
   * limited by this option.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Specifies time to start scheduling transfer runs. The first run will be scheduled at or after
   * the start time according to a recurrence pattern defined in the schedule string. The start time
   * can be changed at any moment. The time when a data transfer can be triggered manually is not
   * limited by this option.
   * @param startTime startTime or {@code null} for none
   */
  public ScheduleOptions setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public ScheduleOptions set(String fieldName, Object value) {
    return (ScheduleOptions) super.set(fieldName, value);
  }

  @Override
  public ScheduleOptions clone() {
    return (ScheduleOptions) super.clone();
  }

}
