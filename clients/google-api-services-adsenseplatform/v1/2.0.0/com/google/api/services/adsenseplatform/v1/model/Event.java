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

package com.google.api.services.adsenseplatform.v1.model;

/**
 * A platform sub-account event to record spam signals.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdSense Platform API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Event extends com.google.api.client.json.GenericJson {

  /**
   * Required. Information associated with the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EventInfo eventInfo;

  /**
   * Required. Event timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String eventTime;

  /**
   * Required. Event type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventType;

  /**
   * Required. Information associated with the event.
   * @return value or {@code null} for none
   */
  public EventInfo getEventInfo() {
    return eventInfo;
  }

  /**
   * Required. Information associated with the event.
   * @param eventInfo eventInfo or {@code null} for none
   */
  public Event setEventInfo(EventInfo eventInfo) {
    this.eventInfo = eventInfo;
    return this;
  }

  /**
   * Required. Event timestamp.
   * @return value or {@code null} for none
   */
  public String getEventTime() {
    return eventTime;
  }

  /**
   * Required. Event timestamp.
   * @param eventTime eventTime or {@code null} for none
   */
  public Event setEventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * Required. Event type.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventType() {
    return eventType;
  }

  /**
   * Required. Event type.
   * @param eventType eventType or {@code null} for none
   */
  public Event setEventType(java.lang.String eventType) {
    this.eventType = eventType;
    return this;
  }

  @Override
  public Event set(String fieldName, Object value) {
    return (Event) super.set(fieldName, value);
  }

  @Override
  public Event clone() {
    return (Event) super.clone();
  }

}
