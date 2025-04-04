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

package com.google.api.services.compute.model;

/**
 * Model definition for RiskDetailsGlobalDnsInsight.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RiskDetailsGlobalDnsInsight extends com.google.api.client.json.GenericJson {

  /**
   * Whether the project default DNS setting is global or not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean projectDefaultIsGlobalDns;

  /**
   * The observation window for the query counts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String queryObservationWindow;

  /**
   * The number of queries that are risky. This will always be less than total_query_count.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long riskyQueryCount;

  /**
   * The total number of queries in the observation window.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalQueryCount;

  /**
   * Whether the project default DNS setting is global or not.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getProjectDefaultIsGlobalDns() {
    return projectDefaultIsGlobalDns;
  }

  /**
   * Whether the project default DNS setting is global or not.
   * @param projectDefaultIsGlobalDns projectDefaultIsGlobalDns or {@code null} for none
   */
  public RiskDetailsGlobalDnsInsight setProjectDefaultIsGlobalDns(java.lang.Boolean projectDefaultIsGlobalDns) {
    this.projectDefaultIsGlobalDns = projectDefaultIsGlobalDns;
    return this;
  }

  /**
   * The observation window for the query counts.
   * @return value or {@code null} for none
   */
  public String getQueryObservationWindow() {
    return queryObservationWindow;
  }

  /**
   * The observation window for the query counts.
   * @param queryObservationWindow queryObservationWindow or {@code null} for none
   */
  public RiskDetailsGlobalDnsInsight setQueryObservationWindow(String queryObservationWindow) {
    this.queryObservationWindow = queryObservationWindow;
    return this;
  }

  /**
   * The number of queries that are risky. This will always be less than total_query_count.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRiskyQueryCount() {
    return riskyQueryCount;
  }

  /**
   * The number of queries that are risky. This will always be less than total_query_count.
   * @param riskyQueryCount riskyQueryCount or {@code null} for none
   */
  public RiskDetailsGlobalDnsInsight setRiskyQueryCount(java.lang.Long riskyQueryCount) {
    this.riskyQueryCount = riskyQueryCount;
    return this;
  }

  /**
   * The total number of queries in the observation window.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalQueryCount() {
    return totalQueryCount;
  }

  /**
   * The total number of queries in the observation window.
   * @param totalQueryCount totalQueryCount or {@code null} for none
   */
  public RiskDetailsGlobalDnsInsight setTotalQueryCount(java.lang.Long totalQueryCount) {
    this.totalQueryCount = totalQueryCount;
    return this;
  }

  @Override
  public RiskDetailsGlobalDnsInsight set(String fieldName, Object value) {
    return (RiskDetailsGlobalDnsInsight) super.set(fieldName, value);
  }

  @Override
  public RiskDetailsGlobalDnsInsight clone() {
    return (RiskDetailsGlobalDnsInsight) super.clone();
  }

}
