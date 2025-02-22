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
 * Reporting data of a Chrome browser profile.
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
public final class GoogleChromeManagementVersionsV1ReportingData extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Executable path of the installed Chrome browser. A valid path is included only in
   * affiliated profiles.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String browserExecutablePath;

  /**
   * Output only. Information of the extensions installed on the profile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromeManagementVersionsV1ReportingDataExtensionData> extensionData;

  /**
   * Output only. Information of the policies applied on the extensions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromeManagementVersionsV1ReportingDataExtensionPolicyData> extensionPolicyData;

  /**
   * Output only. Updated version of a browser, if it is different from the active browser version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String installedBrowserVersion;

  /**
   * Output only. Information of the policies applied on the profile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromeManagementVersionsV1ReportingDataPolicyData> policyData;

  /**
   * Output only. Path of the profile. A valid path is included only in affiliated profiles.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String profilePath;

  /**
   * Output only. Executable path of the installed Chrome browser. A valid path is included only in
   * affiliated profiles.
   * @return value or {@code null} for none
   */
  public java.lang.String getBrowserExecutablePath() {
    return browserExecutablePath;
  }

  /**
   * Output only. Executable path of the installed Chrome browser. A valid path is included only in
   * affiliated profiles.
   * @param browserExecutablePath browserExecutablePath or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ReportingData setBrowserExecutablePath(java.lang.String browserExecutablePath) {
    this.browserExecutablePath = browserExecutablePath;
    return this;
  }

  /**
   * Output only. Information of the extensions installed on the profile.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromeManagementVersionsV1ReportingDataExtensionData> getExtensionData() {
    return extensionData;
  }

  /**
   * Output only. Information of the extensions installed on the profile.
   * @param extensionData extensionData or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ReportingData setExtensionData(java.util.List<GoogleChromeManagementVersionsV1ReportingDataExtensionData> extensionData) {
    this.extensionData = extensionData;
    return this;
  }

  /**
   * Output only. Information of the policies applied on the extensions.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromeManagementVersionsV1ReportingDataExtensionPolicyData> getExtensionPolicyData() {
    return extensionPolicyData;
  }

  /**
   * Output only. Information of the policies applied on the extensions.
   * @param extensionPolicyData extensionPolicyData or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ReportingData setExtensionPolicyData(java.util.List<GoogleChromeManagementVersionsV1ReportingDataExtensionPolicyData> extensionPolicyData) {
    this.extensionPolicyData = extensionPolicyData;
    return this;
  }

  /**
   * Output only. Updated version of a browser, if it is different from the active browser version.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstalledBrowserVersion() {
    return installedBrowserVersion;
  }

  /**
   * Output only. Updated version of a browser, if it is different from the active browser version.
   * @param installedBrowserVersion installedBrowserVersion or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ReportingData setInstalledBrowserVersion(java.lang.String installedBrowserVersion) {
    this.installedBrowserVersion = installedBrowserVersion;
    return this;
  }

  /**
   * Output only. Information of the policies applied on the profile.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromeManagementVersionsV1ReportingDataPolicyData> getPolicyData() {
    return policyData;
  }

  /**
   * Output only. Information of the policies applied on the profile.
   * @param policyData policyData or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ReportingData setPolicyData(java.util.List<GoogleChromeManagementVersionsV1ReportingDataPolicyData> policyData) {
    this.policyData = policyData;
    return this;
  }

  /**
   * Output only. Path of the profile. A valid path is included only in affiliated profiles.
   * @return value or {@code null} for none
   */
  public java.lang.String getProfilePath() {
    return profilePath;
  }

  /**
   * Output only. Path of the profile. A valid path is included only in affiliated profiles.
   * @param profilePath profilePath or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ReportingData setProfilePath(java.lang.String profilePath) {
    this.profilePath = profilePath;
    return this;
  }

  @Override
  public GoogleChromeManagementVersionsV1ReportingData set(String fieldName, Object value) {
    return (GoogleChromeManagementVersionsV1ReportingData) super.set(fieldName, value);
  }

  @Override
  public GoogleChromeManagementVersionsV1ReportingData clone() {
    return (GoogleChromeManagementVersionsV1ReportingData) super.clone();
  }

}
