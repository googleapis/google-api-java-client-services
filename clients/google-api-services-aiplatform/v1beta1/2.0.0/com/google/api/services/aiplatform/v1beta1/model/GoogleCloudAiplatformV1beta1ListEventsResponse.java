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

package com.google.api.services.aiplatform.v1beta1.model;

/**
 * Response message for SessionService.ListEvents.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1ListEventsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token, which can be sent as ListEventsRequest.page_token to retrieve the next page. Absence
   * of this field indicates there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A list of events matching the request. Ordered by timestamp in ascending order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAiplatformV1beta1SessionEvent> sessionEvents;

  /**
   * A token, which can be sent as ListEventsRequest.page_token to retrieve the next page. Absence
   * of this field indicates there are no subsequent pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token, which can be sent as ListEventsRequest.page_token to retrieve the next page. Absence
   * of this field indicates there are no subsequent pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ListEventsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * A list of events matching the request. Ordered by timestamp in ascending order.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAiplatformV1beta1SessionEvent> getSessionEvents() {
    return sessionEvents;
  }

  /**
   * A list of events matching the request. Ordered by timestamp in ascending order.
   * @param sessionEvents sessionEvents or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ListEventsResponse setSessionEvents(java.util.List<GoogleCloudAiplatformV1beta1SessionEvent> sessionEvents) {
    this.sessionEvents = sessionEvents;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1ListEventsResponse set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1ListEventsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1ListEventsResponse clone() {
    return (GoogleCloudAiplatformV1beta1ListEventsResponse) super.clone();
  }

}
