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

package com.google.api.services.deploymentmanager.model;

/**
 * Additional details for quota exceeded error for resource quota.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Deployment Manager V2 API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QuotaExceededInfo extends com.google.api.client.json.GenericJson {

  /**
   * The map holding related quota dimensions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> dimensions;

  /**
   * Future quota limit being rolled out. The limit's unit depends on the quota type or metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double futureLimit;

  /**
   * Current effective quota limit. The limit's unit depends on the quota type or metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double limit;

  /**
   * The name of the quota limit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String limitName;

  /**
   * The Compute Engine quota metric name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String metricName;

  /**
   * Rollout status of the future quota limit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rolloutStatus;

  /**
   * The map holding related quota dimensions.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getDimensions() {
    return dimensions;
  }

  /**
   * The map holding related quota dimensions.
   * @param dimensions dimensions or {@code null} for none
   */
  public QuotaExceededInfo setDimensions(java.util.Map<String, java.lang.String> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  /**
   * Future quota limit being rolled out. The limit's unit depends on the quota type or metric.
   * @return value or {@code null} for none
   */
  public java.lang.Double getFutureLimit() {
    return futureLimit;
  }

  /**
   * Future quota limit being rolled out. The limit's unit depends on the quota type or metric.
   * @param futureLimit futureLimit or {@code null} for none
   */
  public QuotaExceededInfo setFutureLimit(java.lang.Double futureLimit) {
    this.futureLimit = futureLimit;
    return this;
  }

  /**
   * Current effective quota limit. The limit's unit depends on the quota type or metric.
   * @return value or {@code null} for none
   */
  public java.lang.Double getLimit() {
    return limit;
  }

  /**
   * Current effective quota limit. The limit's unit depends on the quota type or metric.
   * @param limit limit or {@code null} for none
   */
  public QuotaExceededInfo setLimit(java.lang.Double limit) {
    this.limit = limit;
    return this;
  }

  /**
   * The name of the quota limit.
   * @return value or {@code null} for none
   */
  public java.lang.String getLimitName() {
    return limitName;
  }

  /**
   * The name of the quota limit.
   * @param limitName limitName or {@code null} for none
   */
  public QuotaExceededInfo setLimitName(java.lang.String limitName) {
    this.limitName = limitName;
    return this;
  }

  /**
   * The Compute Engine quota metric name.
   * @return value or {@code null} for none
   */
  public java.lang.String getMetricName() {
    return metricName;
  }

  /**
   * The Compute Engine quota metric name.
   * @param metricName metricName or {@code null} for none
   */
  public QuotaExceededInfo setMetricName(java.lang.String metricName) {
    this.metricName = metricName;
    return this;
  }

  /**
   * Rollout status of the future quota limit.
   * @return value or {@code null} for none
   */
  public java.lang.String getRolloutStatus() {
    return rolloutStatus;
  }

  /**
   * Rollout status of the future quota limit.
   * @param rolloutStatus rolloutStatus or {@code null} for none
   */
  public QuotaExceededInfo setRolloutStatus(java.lang.String rolloutStatus) {
    this.rolloutStatus = rolloutStatus;
    return this;
  }

  @Override
  public QuotaExceededInfo set(String fieldName, Object value) {
    return (QuotaExceededInfo) super.set(fieldName, value);
  }

  @Override
  public QuotaExceededInfo clone() {
    return (QuotaExceededInfo) super.clone();
  }

}
