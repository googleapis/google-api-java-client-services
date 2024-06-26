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
 * Request to search for potentially sensitive info in a ContentItem.
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
public final class GooglePrivacyDlpV2InspectContentRequest extends com.google.api.client.json.GenericJson {

  /**
   * Configuration for the inspector. What specified here will override the template referenced by
   * the inspect_template_name argument.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2InspectConfig inspectConfig;

  /**
   * Template to use. Any configuration directly specified in inspect_config will override those set
   * in the template. Singular fields that are set in this request will replace their corresponding
   * fields in the template. Repeated fields are appended. Singular sub-messages and groups are
   * recursively merged.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inspectTemplateName;

  /**
   * The item to inspect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2ContentItem item;

  /**
   * Deprecated. This field has no effect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locationId;

  /**
   * Configuration for the inspector. What specified here will override the template referenced by
   * the inspect_template_name argument.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2InspectConfig getInspectConfig() {
    return inspectConfig;
  }

  /**
   * Configuration for the inspector. What specified here will override the template referenced by
   * the inspect_template_name argument.
   * @param inspectConfig inspectConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2InspectContentRequest setInspectConfig(GooglePrivacyDlpV2InspectConfig inspectConfig) {
    this.inspectConfig = inspectConfig;
    return this;
  }

  /**
   * Template to use. Any configuration directly specified in inspect_config will override those set
   * in the template. Singular fields that are set in this request will replace their corresponding
   * fields in the template. Repeated fields are appended. Singular sub-messages and groups are
   * recursively merged.
   * @return value or {@code null} for none
   */
  public java.lang.String getInspectTemplateName() {
    return inspectTemplateName;
  }

  /**
   * Template to use. Any configuration directly specified in inspect_config will override those set
   * in the template. Singular fields that are set in this request will replace their corresponding
   * fields in the template. Repeated fields are appended. Singular sub-messages and groups are
   * recursively merged.
   * @param inspectTemplateName inspectTemplateName or {@code null} for none
   */
  public GooglePrivacyDlpV2InspectContentRequest setInspectTemplateName(java.lang.String inspectTemplateName) {
    this.inspectTemplateName = inspectTemplateName;
    return this;
  }

  /**
   * The item to inspect.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2ContentItem getItem() {
    return item;
  }

  /**
   * The item to inspect.
   * @param item item or {@code null} for none
   */
  public GooglePrivacyDlpV2InspectContentRequest setItem(GooglePrivacyDlpV2ContentItem item) {
    this.item = item;
    return this;
  }

  /**
   * Deprecated. This field has no effect.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocationId() {
    return locationId;
  }

  /**
   * Deprecated. This field has no effect.
   * @param locationId locationId or {@code null} for none
   */
  public GooglePrivacyDlpV2InspectContentRequest setLocationId(java.lang.String locationId) {
    this.locationId = locationId;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2InspectContentRequest set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2InspectContentRequest) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2InspectContentRequest clone() {
    return (GooglePrivacyDlpV2InspectContentRequest) super.clone();
  }

}
