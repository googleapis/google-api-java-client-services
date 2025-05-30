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

package com.google.api.services.managedkafka.v1.model;

/**
 * Response for ListTopics.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Managed Service for Apache Kafka API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListTopicsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token that can be sent as `page_token` to retrieve the next page of results. If this field is
   * omitted, there are no more results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of topics in the requested parent. The order of the topics is unspecified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Topic> topics;

  /**
   * A token that can be sent as `page_token` to retrieve the next page of results. If this field is
   * omitted, there are no more results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token that can be sent as `page_token` to retrieve the next page of results. If this field is
   * omitted, there are no more results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListTopicsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of topics in the requested parent. The order of the topics is unspecified.
   * @return value or {@code null} for none
   */
  public java.util.List<Topic> getTopics() {
    return topics;
  }

  /**
   * The list of topics in the requested parent. The order of the topics is unspecified.
   * @param topics topics or {@code null} for none
   */
  public ListTopicsResponse setTopics(java.util.List<Topic> topics) {
    this.topics = topics;
    return this;
  }

  @Override
  public ListTopicsResponse set(String fieldName, Object value) {
    return (ListTopicsResponse) super.set(fieldName, value);
  }

  @Override
  public ListTopicsResponse clone() {
    return (ListTopicsResponse) super.clone();
  }

}
