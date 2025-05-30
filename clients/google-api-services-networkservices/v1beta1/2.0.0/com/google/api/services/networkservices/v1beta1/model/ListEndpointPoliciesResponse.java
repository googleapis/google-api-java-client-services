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

package com.google.api.services.networkservices.v1beta1.model;

/**
 * Response returned by the ListEndpointPolicies method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListEndpointPoliciesResponse extends com.google.api.client.json.GenericJson {

  /**
   * List of EndpointPolicy resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EndpointPolicy> endpointPolicies;

  static {
    // hack to force ProGuard to consider EndpointPolicy used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(EndpointPolicy.class);
  }

  /**
   * If there might be more results than those appearing in this response, then `next_page_token` is
   * included. To get the next set of results, call this method again using the value of
   * `next_page_token` as `page_token`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Unreachable resources. Populated when the request opts into return_partial_success and reading
   * across collections e.g. when attempting to list all resources across all supported locations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> unreachable;

  /**
   * List of EndpointPolicy resources.
   * @return value or {@code null} for none
   */
  public java.util.List<EndpointPolicy> getEndpointPolicies() {
    return endpointPolicies;
  }

  /**
   * List of EndpointPolicy resources.
   * @param endpointPolicies endpointPolicies or {@code null} for none
   */
  public ListEndpointPoliciesResponse setEndpointPolicies(java.util.List<EndpointPolicy> endpointPolicies) {
    this.endpointPolicies = endpointPolicies;
    return this;
  }

  /**
   * If there might be more results than those appearing in this response, then `next_page_token` is
   * included. To get the next set of results, call this method again using the value of
   * `next_page_token` as `page_token`.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * If there might be more results than those appearing in this response, then `next_page_token` is
   * included. To get the next set of results, call this method again using the value of
   * `next_page_token` as `page_token`.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListEndpointPoliciesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Unreachable resources. Populated when the request opts into return_partial_success and reading
   * across collections e.g. when attempting to list all resources across all supported locations.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUnreachable() {
    return unreachable;
  }

  /**
   * Unreachable resources. Populated when the request opts into return_partial_success and reading
   * across collections e.g. when attempting to list all resources across all supported locations.
   * @param unreachable unreachable or {@code null} for none
   */
  public ListEndpointPoliciesResponse setUnreachable(java.util.List<java.lang.String> unreachable) {
    this.unreachable = unreachable;
    return this;
  }

  @Override
  public ListEndpointPoliciesResponse set(String fieldName, Object value) {
    return (ListEndpointPoliciesResponse) super.set(fieldName, value);
  }

  @Override
  public ListEndpointPoliciesResponse clone() {
    return (ListEndpointPoliciesResponse) super.clone();
  }

}
