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
 * Parameters associated with the WIPE command to wipe the device.
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
public final class WipeParams extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Flags to determine what data to wipe.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> wipeDataFlags;

  /**
   * Optional. A short message displayed to the user before wiping the work profile on personal
   * devices. This has no effect on company owned devices. The maximum message length is 200
   * characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UserFacingMessage wipeReason;

  /**
   * Optional. Flags to determine what data to wipe.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getWipeDataFlags() {
    return wipeDataFlags;
  }

  /**
   * Optional. Flags to determine what data to wipe.
   * @param wipeDataFlags wipeDataFlags or {@code null} for none
   */
  public WipeParams setWipeDataFlags(java.util.List<java.lang.String> wipeDataFlags) {
    this.wipeDataFlags = wipeDataFlags;
    return this;
  }

  /**
   * Optional. A short message displayed to the user before wiping the work profile on personal
   * devices. This has no effect on company owned devices. The maximum message length is 200
   * characters.
   * @return value or {@code null} for none
   */
  public UserFacingMessage getWipeReason() {
    return wipeReason;
  }

  /**
   * Optional. A short message displayed to the user before wiping the work profile on personal
   * devices. This has no effect on company owned devices. The maximum message length is 200
   * characters.
   * @param wipeReason wipeReason or {@code null} for none
   */
  public WipeParams setWipeReason(UserFacingMessage wipeReason) {
    this.wipeReason = wipeReason;
    return this;
  }

  @Override
  public WipeParams set(String fieldName, Object value) {
    return (WipeParams) super.set(fieldName, value);
  }

  @Override
  public WipeParams clone() {
    return (WipeParams) super.clone();
  }

}
