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
 * Configuration for managing system updatesNote: Google Play system updates
 * (https://source.android.com/docs/core/ota/modular-system) (also called Mainline updates) are
 * automatically downloaded but require a device reboot to be installed. Refer to the mainline
 * section in Manage system updates (https://developer.android.com/work/dpc/system-updates#mainline)
 * for further details.
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
public final class SystemUpdate extends com.google.api.client.json.GenericJson {

  /**
   * If the type is WINDOWED, the end of the maintenance window, measured as the number of minutes
   * after midnight in device's local time. This value must be between 0 and 1439, inclusive. If
   * this value is less than start_minutes, then the maintenance window spans midnight. If the
   * maintenance window specified is smaller than 30 minutes, the actual window is extended to 30
   * minutes beyond the start time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer endMinutes;

  /**
   * An annually repeating time period in which over-the-air (OTA) system updates are postponed to
   * freeze the OS version running on a device. To prevent freezing the device indefinitely, each
   * freeze period must be separated by at least 60 days.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FreezePeriod> freezePeriods;

  static {
    // hack to force ProGuard to consider FreezePeriod used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(FreezePeriod.class);
  }

  /**
   * If the type is WINDOWED, the start of the maintenance window, measured as the number of minutes
   * after midnight in the device's local time. This value must be between 0 and 1439, inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer startMinutes;

  /**
   * The type of system update to configure.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * If the type is WINDOWED, the end of the maintenance window, measured as the number of minutes
   * after midnight in device's local time. This value must be between 0 and 1439, inclusive. If
   * this value is less than start_minutes, then the maintenance window spans midnight. If the
   * maintenance window specified is smaller than 30 minutes, the actual window is extended to 30
   * minutes beyond the start time.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getEndMinutes() {
    return endMinutes;
  }

  /**
   * If the type is WINDOWED, the end of the maintenance window, measured as the number of minutes
   * after midnight in device's local time. This value must be between 0 and 1439, inclusive. If
   * this value is less than start_minutes, then the maintenance window spans midnight. If the
   * maintenance window specified is smaller than 30 minutes, the actual window is extended to 30
   * minutes beyond the start time.
   * @param endMinutes endMinutes or {@code null} for none
   */
  public SystemUpdate setEndMinutes(java.lang.Integer endMinutes) {
    this.endMinutes = endMinutes;
    return this;
  }

  /**
   * An annually repeating time period in which over-the-air (OTA) system updates are postponed to
   * freeze the OS version running on a device. To prevent freezing the device indefinitely, each
   * freeze period must be separated by at least 60 days.
   * @return value or {@code null} for none
   */
  public java.util.List<FreezePeriod> getFreezePeriods() {
    return freezePeriods;
  }

  /**
   * An annually repeating time period in which over-the-air (OTA) system updates are postponed to
   * freeze the OS version running on a device. To prevent freezing the device indefinitely, each
   * freeze period must be separated by at least 60 days.
   * @param freezePeriods freezePeriods or {@code null} for none
   */
  public SystemUpdate setFreezePeriods(java.util.List<FreezePeriod> freezePeriods) {
    this.freezePeriods = freezePeriods;
    return this;
  }

  /**
   * If the type is WINDOWED, the start of the maintenance window, measured as the number of minutes
   * after midnight in the device's local time. This value must be between 0 and 1439, inclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStartMinutes() {
    return startMinutes;
  }

  /**
   * If the type is WINDOWED, the start of the maintenance window, measured as the number of minutes
   * after midnight in the device's local time. This value must be between 0 and 1439, inclusive.
   * @param startMinutes startMinutes or {@code null} for none
   */
  public SystemUpdate setStartMinutes(java.lang.Integer startMinutes) {
    this.startMinutes = startMinutes;
    return this;
  }

  /**
   * The type of system update to configure.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of system update to configure.
   * @param type type or {@code null} for none
   */
  public SystemUpdate setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public SystemUpdate set(String fieldName, Object value) {
    return (SystemUpdate) super.set(fieldName, value);
  }

  @Override
  public SystemUpdate clone() {
    return (SystemUpdate) super.clone();
  }

}
