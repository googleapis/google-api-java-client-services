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

package com.google.api.services.chromemanagement.v1.model;

/**
 * App launch data.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Chrome Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleChromeManagementV1TelemetryAppLaunchEvent extends com.google.api.client.json.GenericJson {

  /**
   * App id. For PWAs this is the start URL, and for extensions this is the extension id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appId;

  /**
   * App launch source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appLaunchSource;

  /**
   * Type of app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appType;

  /**
   * App id. For PWAs this is the start URL, and for extensions this is the extension id.
   * @return value or {@code null} for none
   */
  public java.lang.String getAppId() {
    return appId;
  }

  /**
   * App id. For PWAs this is the start URL, and for extensions this is the extension id.
   * @param appId appId or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryAppLaunchEvent setAppId(java.lang.String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * App launch source.
   * @return value or {@code null} for none
   */
  public java.lang.String getAppLaunchSource() {
    return appLaunchSource;
  }

  /**
   * App launch source.
   * @param appLaunchSource appLaunchSource or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryAppLaunchEvent setAppLaunchSource(java.lang.String appLaunchSource) {
    this.appLaunchSource = appLaunchSource;
    return this;
  }

  /**
   * Type of app.
   * @return value or {@code null} for none
   */
  public java.lang.String getAppType() {
    return appType;
  }

  /**
   * Type of app.
   * @param appType appType or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryAppLaunchEvent setAppType(java.lang.String appType) {
    this.appType = appType;
    return this;
  }

  @Override
  public GoogleChromeManagementV1TelemetryAppLaunchEvent set(String fieldName, Object value) {
    return (GoogleChromeManagementV1TelemetryAppLaunchEvent) super.set(fieldName, value);
  }

  @Override
  public GoogleChromeManagementV1TelemetryAppLaunchEvent clone() {
    return (GoogleChromeManagementV1TelemetryAppLaunchEvent) super.clone();
  }

}