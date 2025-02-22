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
 * All the findings for a single scanned item.
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
public final class GooglePrivacyDlpV2InspectResult extends com.google.api.client.json.GenericJson {

  /**
   * List of findings for an item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2Finding> findings;

  static {
    // hack to force ProGuard to consider GooglePrivacyDlpV2Finding used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GooglePrivacyDlpV2Finding.class);
  }

  /**
   * If true, then this item might have more findings than were returned, and the findings returned
   * are an arbitrary subset of all findings. The findings list might be truncated because the input
   * items were too large, or because the server reached the maximum amount of resources allowed for
   * a single API call. For best results, divide the input into smaller batches.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean findingsTruncated;

  /**
   * List of findings for an item.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2Finding> getFindings() {
    return findings;
  }

  /**
   * List of findings for an item.
   * @param findings findings or {@code null} for none
   */
  public GooglePrivacyDlpV2InspectResult setFindings(java.util.List<GooglePrivacyDlpV2Finding> findings) {
    this.findings = findings;
    return this;
  }

  /**
   * If true, then this item might have more findings than were returned, and the findings returned
   * are an arbitrary subset of all findings. The findings list might be truncated because the input
   * items were too large, or because the server reached the maximum amount of resources allowed for
   * a single API call. For best results, divide the input into smaller batches.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getFindingsTruncated() {
    return findingsTruncated;
  }

  /**
   * If true, then this item might have more findings than were returned, and the findings returned
   * are an arbitrary subset of all findings. The findings list might be truncated because the input
   * items were too large, or because the server reached the maximum amount of resources allowed for
   * a single API call. For best results, divide the input into smaller batches.
   * @param findingsTruncated findingsTruncated or {@code null} for none
   */
  public GooglePrivacyDlpV2InspectResult setFindingsTruncated(java.lang.Boolean findingsTruncated) {
    this.findingsTruncated = findingsTruncated;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2InspectResult set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2InspectResult) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2InspectResult clone() {
    return (GooglePrivacyDlpV2InspectResult) super.clone();
  }

}
