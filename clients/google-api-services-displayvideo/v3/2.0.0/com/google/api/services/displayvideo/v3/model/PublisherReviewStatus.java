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

package com.google.api.services.displayvideo.v3.model;

/**
 * Publisher review status for the creative.
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
public final class PublisherReviewStatus extends com.google.api.client.json.GenericJson {

  /**
   * The publisher reviewing the creative.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String publisherName;

  /**
   * Status of the publisher review.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * The publisher reviewing the creative.
   * @return value or {@code null} for none
   */
  public java.lang.String getPublisherName() {
    return publisherName;
  }

  /**
   * The publisher reviewing the creative.
   * @param publisherName publisherName or {@code null} for none
   */
  public PublisherReviewStatus setPublisherName(java.lang.String publisherName) {
    this.publisherName = publisherName;
    return this;
  }

  /**
   * Status of the publisher review.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Status of the publisher review.
   * @param status status or {@code null} for none
   */
  public PublisherReviewStatus setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public PublisherReviewStatus set(String fieldName, Object value) {
    return (PublisherReviewStatus) super.set(fieldName, value);
  }

  @Override
  public PublisherReviewStatus clone() {
    return (PublisherReviewStatus) super.clone();
  }

}
