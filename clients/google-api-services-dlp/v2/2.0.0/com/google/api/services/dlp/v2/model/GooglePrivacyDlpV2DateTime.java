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

package com.google.api.services.dlp.v2.model;

/**
 * Message for a date time object. e.g. 2018-01-01, 5th August.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Sensitive Data Protection (DLP). For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2DateTime extends com.google.api.client.json.GenericJson {

  /**
   * One or more of the following must be set. Must be a valid date or time value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeDate date;

  /**
   * Day of week
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dayOfWeek;

  /**
   * Time of day
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeTimeOfDay time;

  /**
   * Time zone
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2TimeZone timeZone;

  /**
   * One or more of the following must be set. Must be a valid date or time value.
   * @return value or {@code null} for none
   */
  public GoogleTypeDate getDate() {
    return date;
  }

  /**
   * One or more of the following must be set. Must be a valid date or time value.
   * @param date date or {@code null} for none
   */
  public GooglePrivacyDlpV2DateTime setDate(GoogleTypeDate date) {
    this.date = date;
    return this;
  }

  /**
   * Day of week
   * @return value or {@code null} for none
   */
  public java.lang.String getDayOfWeek() {
    return dayOfWeek;
  }

  /**
   * Day of week
   * @param dayOfWeek dayOfWeek or {@code null} for none
   */
  public GooglePrivacyDlpV2DateTime setDayOfWeek(java.lang.String dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  /**
   * Time of day
   * @return value or {@code null} for none
   */
  public GoogleTypeTimeOfDay getTime() {
    return time;
  }

  /**
   * Time of day
   * @param time time or {@code null} for none
   */
  public GooglePrivacyDlpV2DateTime setTime(GoogleTypeTimeOfDay time) {
    this.time = time;
    return this;
  }

  /**
   * Time zone
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2TimeZone getTimeZone() {
    return timeZone;
  }

  /**
   * Time zone
   * @param timeZone timeZone or {@code null} for none
   */
  public GooglePrivacyDlpV2DateTime setTimeZone(GooglePrivacyDlpV2TimeZone timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2DateTime set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2DateTime) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2DateTime clone() {
    return (GooglePrivacyDlpV2DateTime) super.clone();
  }

}
