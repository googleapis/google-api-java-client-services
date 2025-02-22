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

package com.google.api.services.meet.v2.model;

/**
 * Single instance of a meeting held in a space.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Meet API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConferenceRecord extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Timestamp when the conference ended. Set for past conferences. Unset if the
   * conference is ongoing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Output only. Server enforced expiration time for when this conference record resource is
   * deleted. The resource is deleted 30 days after the conference ends.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expireTime;

  /**
   * Identifier. Resource name of the conference record. Format:
   * `conferenceRecords/{conference_record}` where `{conference_record}` is a unique ID for each
   * instance of a call within a space.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The space where the conference was held.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String space;

  /**
   * Output only. Timestamp when the conference started. Always set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Output only. Timestamp when the conference ended. Set for past conferences. Unset if the
   * conference is ongoing.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Output only. Timestamp when the conference ended. Set for past conferences. Unset if the
   * conference is ongoing.
   * @param endTime endTime or {@code null} for none
   */
  public ConferenceRecord setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Output only. Server enforced expiration time for when this conference record resource is
   * deleted. The resource is deleted 30 days after the conference ends.
   * @return value or {@code null} for none
   */
  public String getExpireTime() {
    return expireTime;
  }

  /**
   * Output only. Server enforced expiration time for when this conference record resource is
   * deleted. The resource is deleted 30 days after the conference ends.
   * @param expireTime expireTime or {@code null} for none
   */
  public ConferenceRecord setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  /**
   * Identifier. Resource name of the conference record. Format:
   * `conferenceRecords/{conference_record}` where `{conference_record}` is a unique ID for each
   * instance of a call within a space.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. Resource name of the conference record. Format:
   * `conferenceRecords/{conference_record}` where `{conference_record}` is a unique ID for each
   * instance of a call within a space.
   * @param name name or {@code null} for none
   */
  public ConferenceRecord setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The space where the conference was held.
   * @return value or {@code null} for none
   */
  public java.lang.String getSpace() {
    return space;
  }

  /**
   * Output only. The space where the conference was held.
   * @param space space or {@code null} for none
   */
  public ConferenceRecord setSpace(java.lang.String space) {
    this.space = space;
    return this;
  }

  /**
   * Output only. Timestamp when the conference started. Always set.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Output only. Timestamp when the conference started. Always set.
   * @param startTime startTime or {@code null} for none
   */
  public ConferenceRecord setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public ConferenceRecord set(String fieldName, Object value) {
    return (ConferenceRecord) super.set(fieldName, value);
  }

  @Override
  public ConferenceRecord clone() {
    return (ConferenceRecord) super.clone();
  }

}
