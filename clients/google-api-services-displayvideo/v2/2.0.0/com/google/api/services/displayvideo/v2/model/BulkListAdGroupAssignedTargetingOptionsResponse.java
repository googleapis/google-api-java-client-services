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

package com.google.api.services.displayvideo.v2.model;

/**
 * Model definition for BulkListAdGroupAssignedTargetingOptionsResponse.
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
public final class BulkListAdGroupAssignedTargetingOptionsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token identifying the next page of results. This value should be specified as the pageToken
   * in a subsequent call to `BulkListAdGroupAssignedTargetingOptions` to fetch the next page of
   * results. This token will be absent if there are no more AdGroupAssignedTargetingOption
   * resources to return.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of wrapper objects, each providing an assigned targeting option and the youtube ad
   * group it is assigned to. This list will be absent if empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<YoutubeAdGroupAssignedTargetingOption> youtubeAdGroupAssignedTargetingOptions;

  /**
   * A token identifying the next page of results. This value should be specified as the pageToken
   * in a subsequent call to `BulkListAdGroupAssignedTargetingOptions` to fetch the next page of
   * results. This token will be absent if there are no more AdGroupAssignedTargetingOption
   * resources to return.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token identifying the next page of results. This value should be specified as the pageToken
   * in a subsequent call to `BulkListAdGroupAssignedTargetingOptions` to fetch the next page of
   * results. This token will be absent if there are no more AdGroupAssignedTargetingOption
   * resources to return.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public BulkListAdGroupAssignedTargetingOptionsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of wrapper objects, each providing an assigned targeting option and the youtube ad
   * group it is assigned to. This list will be absent if empty.
   * @return value or {@code null} for none
   */
  public java.util.List<YoutubeAdGroupAssignedTargetingOption> getYoutubeAdGroupAssignedTargetingOptions() {
    return youtubeAdGroupAssignedTargetingOptions;
  }

  /**
   * The list of wrapper objects, each providing an assigned targeting option and the youtube ad
   * group it is assigned to. This list will be absent if empty.
   * @param youtubeAdGroupAssignedTargetingOptions youtubeAdGroupAssignedTargetingOptions or {@code null} for none
   */
  public BulkListAdGroupAssignedTargetingOptionsResponse setYoutubeAdGroupAssignedTargetingOptions(java.util.List<YoutubeAdGroupAssignedTargetingOption> youtubeAdGroupAssignedTargetingOptions) {
    this.youtubeAdGroupAssignedTargetingOptions = youtubeAdGroupAssignedTargetingOptions;
    return this;
  }

  @Override
  public BulkListAdGroupAssignedTargetingOptionsResponse set(String fieldName, Object value) {
    return (BulkListAdGroupAssignedTargetingOptionsResponse) super.set(fieldName, value);
  }

  @Override
  public BulkListAdGroupAssignedTargetingOptionsResponse clone() {
    return (BulkListAdGroupAssignedTargetingOptionsResponse) super.clone();
  }

}
