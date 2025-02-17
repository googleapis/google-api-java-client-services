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
 * The tag to attach to profiles matching the condition. At most one `TagCondition` can be specified
 * per sensitivity level.
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
public final class GooglePrivacyDlpV2TagCondition extends com.google.api.client.json.GenericJson {

  /**
   * Conditions attaching the tag to a resource on its profile having this sensitivity score.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2SensitivityScore sensitivityScore;

  /**
   * The tag value to attach to resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2TagValue tag;

  /**
   * Conditions attaching the tag to a resource on its profile having this sensitivity score.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2SensitivityScore getSensitivityScore() {
    return sensitivityScore;
  }

  /**
   * Conditions attaching the tag to a resource on its profile having this sensitivity score.
   * @param sensitivityScore sensitivityScore or {@code null} for none
   */
  public GooglePrivacyDlpV2TagCondition setSensitivityScore(GooglePrivacyDlpV2SensitivityScore sensitivityScore) {
    this.sensitivityScore = sensitivityScore;
    return this;
  }

  /**
   * The tag value to attach to resources.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2TagValue getTag() {
    return tag;
  }

  /**
   * The tag value to attach to resources.
   * @param tag tag or {@code null} for none
   */
  public GooglePrivacyDlpV2TagCondition setTag(GooglePrivacyDlpV2TagValue tag) {
    this.tag = tag;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2TagCondition set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2TagCondition) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2TagCondition clone() {
    return (GooglePrivacyDlpV2TagCondition) super.clone();
  }

}
