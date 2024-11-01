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

package com.google.api.services.realtimebidding.v1.model;

/**
 * Video content for a creative.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Real-time Bidding API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VideoContent extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Video metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VideoMetadata videoMetadata;

  /**
   * The URL to fetch a video ad. The URL should return an XML response that conforms to the VAST
   * 2.0, 3.0 or 4.x standard.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String videoUrl;

  /**
   * The contents of a VAST document for a video ad. This document should conform to the VAST 2.0,
   * 3.0, or 4.x standard.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String videoVastXml;

  /**
   * Output only. Video metadata.
   * @return value or {@code null} for none
   */
  public VideoMetadata getVideoMetadata() {
    return videoMetadata;
  }

  /**
   * Output only. Video metadata.
   * @param videoMetadata videoMetadata or {@code null} for none
   */
  public VideoContent setVideoMetadata(VideoMetadata videoMetadata) {
    this.videoMetadata = videoMetadata;
    return this;
  }

  /**
   * The URL to fetch a video ad. The URL should return an XML response that conforms to the VAST
   * 2.0, 3.0 or 4.x standard.
   * @return value or {@code null} for none
   */
  public java.lang.String getVideoUrl() {
    return videoUrl;
  }

  /**
   * The URL to fetch a video ad. The URL should return an XML response that conforms to the VAST
   * 2.0, 3.0 or 4.x standard.
   * @param videoUrl videoUrl or {@code null} for none
   */
  public VideoContent setVideoUrl(java.lang.String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

  /**
   * The contents of a VAST document for a video ad. This document should conform to the VAST 2.0,
   * 3.0, or 4.x standard.
   * @return value or {@code null} for none
   */
  public java.lang.String getVideoVastXml() {
    return videoVastXml;
  }

  /**
   * The contents of a VAST document for a video ad. This document should conform to the VAST 2.0,
   * 3.0, or 4.x standard.
   * @param videoVastXml videoVastXml or {@code null} for none
   */
  public VideoContent setVideoVastXml(java.lang.String videoVastXml) {
    this.videoVastXml = videoVastXml;
    return this;
  }

  @Override
  public VideoContent set(String fieldName, Object value) {
    return (VideoContent) super.set(fieldName, value);
  }

  @Override
  public VideoContent clone() {
    return (VideoContent) super.clone();
  }

}
