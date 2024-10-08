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

package com.google.api.services.androidmanagement.v1.model;

/**
 * Batched event logs of events from the device.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchUsageLogEvents extends com.google.api.client.json.GenericJson {

  /**
   * If present, the name of the device in the form ‘enterprises/{enterpriseId}/devices/{deviceId}’
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String device;

  /**
   * The device timestamp when the batch of events were collected from the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String retrievalTime;

  /**
   * The list of UsageLogEvent that were reported by the device, sorted chronologically by the event
   * time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<UsageLogEvent> usageLogEvents;

  /**
   * If present, the resource name of the user that owns this device in the form
   * ‘enterprises/{enterpriseId}/users/{userId}’.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String user;

  /**
   * If present, the name of the device in the form ‘enterprises/{enterpriseId}/devices/{deviceId}’
   * @return value or {@code null} for none
   */
  public java.lang.String getDevice() {
    return device;
  }

  /**
   * If present, the name of the device in the form ‘enterprises/{enterpriseId}/devices/{deviceId}’
   * @param device device or {@code null} for none
   */
  public BatchUsageLogEvents setDevice(java.lang.String device) {
    this.device = device;
    return this;
  }

  /**
   * The device timestamp when the batch of events were collected from the device.
   * @return value or {@code null} for none
   */
  public String getRetrievalTime() {
    return retrievalTime;
  }

  /**
   * The device timestamp when the batch of events were collected from the device.
   * @param retrievalTime retrievalTime or {@code null} for none
   */
  public BatchUsageLogEvents setRetrievalTime(String retrievalTime) {
    this.retrievalTime = retrievalTime;
    return this;
  }

  /**
   * The list of UsageLogEvent that were reported by the device, sorted chronologically by the event
   * time.
   * @return value or {@code null} for none
   */
  public java.util.List<UsageLogEvent> getUsageLogEvents() {
    return usageLogEvents;
  }

  /**
   * The list of UsageLogEvent that were reported by the device, sorted chronologically by the event
   * time.
   * @param usageLogEvents usageLogEvents or {@code null} for none
   */
  public BatchUsageLogEvents setUsageLogEvents(java.util.List<UsageLogEvent> usageLogEvents) {
    this.usageLogEvents = usageLogEvents;
    return this;
  }

  /**
   * If present, the resource name of the user that owns this device in the form
   * ‘enterprises/{enterpriseId}/users/{userId}’.
   * @return value or {@code null} for none
   */
  public java.lang.String getUser() {
    return user;
  }

  /**
   * If present, the resource name of the user that owns this device in the form
   * ‘enterprises/{enterpriseId}/users/{userId}’.
   * @param user user or {@code null} for none
   */
  public BatchUsageLogEvents setUser(java.lang.String user) {
    this.user = user;
    return this;
  }

  @Override
  public BatchUsageLogEvents set(String fieldName, Object value) {
    return (BatchUsageLogEvents) super.set(fieldName, value);
  }

  @Override
  public BatchUsageLogEvents clone() {
    return (BatchUsageLogEvents) super.clone();
  }

}
