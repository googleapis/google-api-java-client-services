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

package com.google.api.services.vault.v1.model;

/**
 * Options for Gmail exports.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Vault API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MailExportOptions extends com.google.api.client.json.GenericJson {

  /**
   * The file format for exported messages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String exportFormat;

  /**
   * Optional. To enable exporting linked Drive files, set to **true**.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean exportLinkedDriveFiles;

  /**
   * To export confidential mode content, set to **true**.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean showConfidentialModeContent;

  /**
   * To use the new export system, set to **true**.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useNewExport;

  /**
   * The file format for exported messages.
   * @return value or {@code null} for none
   */
  public java.lang.String getExportFormat() {
    return exportFormat;
  }

  /**
   * The file format for exported messages.
   * @param exportFormat exportFormat or {@code null} for none
   */
  public MailExportOptions setExportFormat(java.lang.String exportFormat) {
    this.exportFormat = exportFormat;
    return this;
  }

  /**
   * Optional. To enable exporting linked Drive files, set to **true**.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getExportLinkedDriveFiles() {
    return exportLinkedDriveFiles;
  }

  /**
   * Optional. To enable exporting linked Drive files, set to **true**.
   * @param exportLinkedDriveFiles exportLinkedDriveFiles or {@code null} for none
   */
  public MailExportOptions setExportLinkedDriveFiles(java.lang.Boolean exportLinkedDriveFiles) {
    this.exportLinkedDriveFiles = exportLinkedDriveFiles;
    return this;
  }

  /**
   * To export confidential mode content, set to **true**.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getShowConfidentialModeContent() {
    return showConfidentialModeContent;
  }

  /**
   * To export confidential mode content, set to **true**.
   * @param showConfidentialModeContent showConfidentialModeContent or {@code null} for none
   */
  public MailExportOptions setShowConfidentialModeContent(java.lang.Boolean showConfidentialModeContent) {
    this.showConfidentialModeContent = showConfidentialModeContent;
    return this;
  }

  /**
   * To use the new export system, set to **true**.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseNewExport() {
    return useNewExport;
  }

  /**
   * To use the new export system, set to **true**.
   * @param useNewExport useNewExport or {@code null} for none
   */
  public MailExportOptions setUseNewExport(java.lang.Boolean useNewExport) {
    this.useNewExport = useNewExport;
    return this;
  }

  @Override
  public MailExportOptions set(String fieldName, Object value) {
    return (MailExportOptions) super.set(fieldName, value);
  }

  @Override
  public MailExportOptions clone() {
    return (MailExportOptions) super.clone();
  }

}
