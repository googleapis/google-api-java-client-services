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

package com.google.api.services.discoveryengine.v1beta.model;

/**
 * A time interval extending just after a start time through an end time. If the start time is the
 * same as the end time, then the interval represents a single point in time.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleMonitoringV3TimeInterval extends com.google.api.client.json.GenericJson {

  /**
   * Required. The end of the time interval.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Optional. The beginning of the time interval. The default value for the start time is the end
   * time. The start time must not be later than the end time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Required. The end of the time interval.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Required. The end of the time interval.
   * @param endTime endTime or {@code null} for none
   */
  public GoogleMonitoringV3TimeInterval setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Optional. The beginning of the time interval. The default value for the start time is the end
   * time. The start time must not be later than the end time.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Optional. The beginning of the time interval. The default value for the start time is the end
   * time. The start time must not be later than the end time.
   * @param startTime startTime or {@code null} for none
   */
  public GoogleMonitoringV3TimeInterval setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public GoogleMonitoringV3TimeInterval set(String fieldName, Object value) {
    return (GoogleMonitoringV3TimeInterval) super.set(fieldName, value);
  }

  @Override
  public GoogleMonitoringV3TimeInterval clone() {
    return (GoogleMonitoringV3TimeInterval) super.clone();
  }

}
