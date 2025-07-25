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

package com.google.api.services.parametermanager.v1.model;

/**
 * Message for response to listing ParameterVersions
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Parameter Manager API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListParameterVersionsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token identifying a page of results the server should return.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of ParameterVersions
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ParameterVersion> parameterVersions;

  /**
   * Unordered list. Locations that could not be reached.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> unreachable;

  /**
   * A token identifying a page of results the server should return.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token identifying a page of results the server should return.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListParameterVersionsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of ParameterVersions
   * @return value or {@code null} for none
   */
  public java.util.List<ParameterVersion> getParameterVersions() {
    return parameterVersions;
  }

  /**
   * The list of ParameterVersions
   * @param parameterVersions parameterVersions or {@code null} for none
   */
  public ListParameterVersionsResponse setParameterVersions(java.util.List<ParameterVersion> parameterVersions) {
    this.parameterVersions = parameterVersions;
    return this;
  }

  /**
   * Unordered list. Locations that could not be reached.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUnreachable() {
    return unreachable;
  }

  /**
   * Unordered list. Locations that could not be reached.
   * @param unreachable unreachable or {@code null} for none
   */
  public ListParameterVersionsResponse setUnreachable(java.util.List<java.lang.String> unreachable) {
    this.unreachable = unreachable;
    return this;
  }

  @Override
  public ListParameterVersionsResponse set(String fieldName, Object value) {
    return (ListParameterVersionsResponse) super.set(fieldName, value);
  }

  @Override
  public ListParameterVersionsResponse clone() {
    return (ListParameterVersionsResponse) super.clone();
  }

}
