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

package com.google.api.services.dataproc.model;

/**
 * List of Executors associated with a Spark Application.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchSparkApplicationExecutorsResponse extends com.google.api.client.json.GenericJson {

  /**
   * This token is included in the response if there are more results to fetch. To fetch additional
   * results, provide this value as the page_token in a subsequent
   * SearchSparkApplicationExecutorsListRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Details about executors used by the application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ExecutorSummary> sparkApplicationExecutors;

  static {
    // hack to force ProGuard to consider ExecutorSummary used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ExecutorSummary.class);
  }

  /**
   * This token is included in the response if there are more results to fetch. To fetch additional
   * results, provide this value as the page_token in a subsequent
   * SearchSparkApplicationExecutorsListRequest.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * This token is included in the response if there are more results to fetch. To fetch additional
   * results, provide this value as the page_token in a subsequent
   * SearchSparkApplicationExecutorsListRequest.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public SearchSparkApplicationExecutorsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Details about executors used by the application.
   * @return value or {@code null} for none
   */
  public java.util.List<ExecutorSummary> getSparkApplicationExecutors() {
    return sparkApplicationExecutors;
  }

  /**
   * Details about executors used by the application.
   * @param sparkApplicationExecutors sparkApplicationExecutors or {@code null} for none
   */
  public SearchSparkApplicationExecutorsResponse setSparkApplicationExecutors(java.util.List<ExecutorSummary> sparkApplicationExecutors) {
    this.sparkApplicationExecutors = sparkApplicationExecutors;
    return this;
  }

  @Override
  public SearchSparkApplicationExecutorsResponse set(String fieldName, Object value) {
    return (SearchSparkApplicationExecutorsResponse) super.set(fieldName, value);
  }

  @Override
  public SearchSparkApplicationExecutorsResponse clone() {
    return (SearchSparkApplicationExecutorsResponse) super.clone();
  }

}
