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

package com.google.api.services.bigquery.model;

/**
 * Statistics for an extract job.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class JobStatistics4 extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Number of files per destination URI or URI pattern specified in the extract
   * configuration. These values will be in the same order as the URIs specified in the
   * 'destinationUris' field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> destinationUriFileCounts;

  /**
   * Output only. Number of user bytes extracted into the result. This is the byte count as computed
   * by BigQuery for billing purposes and doesn't have any relationship with the number of actual
   * result bytes extracted in the desired format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long inputBytes;

  /**
   * Output only. Describes a timeline of job execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<QueryTimelineSample> timeline;

  /**
   * Output only. Number of files per destination URI or URI pattern specified in the extract
   * configuration. These values will be in the same order as the URIs specified in the
   * 'destinationUris' field.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getDestinationUriFileCounts() {
    return destinationUriFileCounts;
  }

  /**
   * Output only. Number of files per destination URI or URI pattern specified in the extract
   * configuration. These values will be in the same order as the URIs specified in the
   * 'destinationUris' field.
   * @param destinationUriFileCounts destinationUriFileCounts or {@code null} for none
   */
  public JobStatistics4 setDestinationUriFileCounts(java.util.List<java.lang.Long> destinationUriFileCounts) {
    this.destinationUriFileCounts = destinationUriFileCounts;
    return this;
  }

  /**
   * Output only. Number of user bytes extracted into the result. This is the byte count as computed
   * by BigQuery for billing purposes and doesn't have any relationship with the number of actual
   * result bytes extracted in the desired format.
   * @return value or {@code null} for none
   */
  public java.lang.Long getInputBytes() {
    return inputBytes;
  }

  /**
   * Output only. Number of user bytes extracted into the result. This is the byte count as computed
   * by BigQuery for billing purposes and doesn't have any relationship with the number of actual
   * result bytes extracted in the desired format.
   * @param inputBytes inputBytes or {@code null} for none
   */
  public JobStatistics4 setInputBytes(java.lang.Long inputBytes) {
    this.inputBytes = inputBytes;
    return this;
  }

  /**
   * Output only. Describes a timeline of job execution.
   * @return value or {@code null} for none
   */
  public java.util.List<QueryTimelineSample> getTimeline() {
    return timeline;
  }

  /**
   * Output only. Describes a timeline of job execution.
   * @param timeline timeline or {@code null} for none
   */
  public JobStatistics4 setTimeline(java.util.List<QueryTimelineSample> timeline) {
    this.timeline = timeline;
    return this;
  }

  @Override
  public JobStatistics4 set(String fieldName, Object value) {
    return (JobStatistics4) super.set(fieldName, value);
  }

  @Override
  public JobStatistics4 clone() {
    return (JobStatistics4) super.clone();
  }

}
