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

package com.google.api.services.apim.v1alpha.model;

/**
 * An aggregation of HTTP responses.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the API Management API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HttpOperationHttpResponse extends com.google.api.client.json.GenericJson {

  /**
   * Unordered map from header name to header metadata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, HttpOperationHeader> headers;

  static {
    // hack to force ProGuard to consider HttpOperationHeader used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(HttpOperationHeader.class);
  }

  /**
   * Map of status code to observed count
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.Map<String, java.lang.Long> responseCodes;

  /**
   * Unordered map from header name to header metadata
   * @return value or {@code null} for none
   */
  public java.util.Map<String, HttpOperationHeader> getHeaders() {
    return headers;
  }

  /**
   * Unordered map from header name to header metadata
   * @param headers headers or {@code null} for none
   */
  public HttpOperationHttpResponse setHeaders(java.util.Map<String, HttpOperationHeader> headers) {
    this.headers = headers;
    return this;
  }

  /**
   * Map of status code to observed count
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Long> getResponseCodes() {
    return responseCodes;
  }

  /**
   * Map of status code to observed count
   * @param responseCodes responseCodes or {@code null} for none
   */
  public HttpOperationHttpResponse setResponseCodes(java.util.Map<String, java.lang.Long> responseCodes) {
    this.responseCodes = responseCodes;
    return this;
  }

  @Override
  public HttpOperationHttpResponse set(String fieldName, Object value) {
    return (HttpOperationHttpResponse) super.set(fieldName, value);
  }

  @Override
  public HttpOperationHttpResponse clone() {
    return (HttpOperationHttpResponse) super.clone();
  }

}
