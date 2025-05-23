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

package com.google.api.services.displayvideo.v4.model;

/**
 * Review statuses for the creative.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReviewStatusInfo extends com.google.api.client.json.GenericJson {

  /**
   * Represents the basic approval needed for a creative to begin serving. Summary of
   * creative_and_landing_page_review_status and content_and_policy_review_status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String approvalStatus;

  /**
   * Content and policy review status for the creative.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentAndPolicyReviewStatus;

  /**
   * Creative and landing page review status for the creative.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creativeAndLandingPageReviewStatus;

  /**
   * Exchange review statuses for the creative.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ExchangeReviewStatus> exchangeReviewStatuses;

  static {
    // hack to force ProGuard to consider ExchangeReviewStatus used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ExchangeReviewStatus.class);
  }

  /**
   * Represents the basic approval needed for a creative to begin serving. Summary of
   * creative_and_landing_page_review_status and content_and_policy_review_status.
   * @return value or {@code null} for none
   */
  public java.lang.String getApprovalStatus() {
    return approvalStatus;
  }

  /**
   * Represents the basic approval needed for a creative to begin serving. Summary of
   * creative_and_landing_page_review_status and content_and_policy_review_status.
   * @param approvalStatus approvalStatus or {@code null} for none
   */
  public ReviewStatusInfo setApprovalStatus(java.lang.String approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

  /**
   * Content and policy review status for the creative.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentAndPolicyReviewStatus() {
    return contentAndPolicyReviewStatus;
  }

  /**
   * Content and policy review status for the creative.
   * @param contentAndPolicyReviewStatus contentAndPolicyReviewStatus or {@code null} for none
   */
  public ReviewStatusInfo setContentAndPolicyReviewStatus(java.lang.String contentAndPolicyReviewStatus) {
    this.contentAndPolicyReviewStatus = contentAndPolicyReviewStatus;
    return this;
  }

  /**
   * Creative and landing page review status for the creative.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreativeAndLandingPageReviewStatus() {
    return creativeAndLandingPageReviewStatus;
  }

  /**
   * Creative and landing page review status for the creative.
   * @param creativeAndLandingPageReviewStatus creativeAndLandingPageReviewStatus or {@code null} for none
   */
  public ReviewStatusInfo setCreativeAndLandingPageReviewStatus(java.lang.String creativeAndLandingPageReviewStatus) {
    this.creativeAndLandingPageReviewStatus = creativeAndLandingPageReviewStatus;
    return this;
  }

  /**
   * Exchange review statuses for the creative.
   * @return value or {@code null} for none
   */
  public java.util.List<ExchangeReviewStatus> getExchangeReviewStatuses() {
    return exchangeReviewStatuses;
  }

  /**
   * Exchange review statuses for the creative.
   * @param exchangeReviewStatuses exchangeReviewStatuses or {@code null} for none
   */
  public ReviewStatusInfo setExchangeReviewStatuses(java.util.List<ExchangeReviewStatus> exchangeReviewStatuses) {
    this.exchangeReviewStatuses = exchangeReviewStatuses;
    return this;
  }

  @Override
  public ReviewStatusInfo set(String fieldName, Object value) {
    return (ReviewStatusInfo) super.set(fieldName, value);
  }

  @Override
  public ReviewStatusInfo clone() {
    return (ReviewStatusInfo) super.clone();
  }

}
