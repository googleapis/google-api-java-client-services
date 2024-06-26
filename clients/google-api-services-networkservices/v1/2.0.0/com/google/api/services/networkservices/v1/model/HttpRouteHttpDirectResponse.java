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

package com.google.api.services.networkservices.v1.model;

/**
 * Static HTTP response object to be returned.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HttpRouteHttpDirectResponse extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Response body as bytes. Maximum body size is 4096B.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bytesBody;

  /**
   * Required. Status to return as part of HTTP Response. Must be a positive integer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer status;

  /**
   * Optional. Response body as a string. Maximum body length is 1024 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stringBody;

  /**
   * Optional. Response body as bytes. Maximum body size is 4096B.
   * @see #decodeBytesBody()
   * @return value or {@code null} for none
   */
  public java.lang.String getBytesBody() {
    return bytesBody;
  }

  /**
   * Optional. Response body as bytes. Maximum body size is 4096B.
   * @see #getBytesBody()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeBytesBody() {
    return com.google.api.client.util.Base64.decodeBase64(bytesBody);
  }

  /**
   * Optional. Response body as bytes. Maximum body size is 4096B.
   * @see #encodeBytesBody()
   * @param bytesBody bytesBody or {@code null} for none
   */
  public HttpRouteHttpDirectResponse setBytesBody(java.lang.String bytesBody) {
    this.bytesBody = bytesBody;
    return this;
  }

  /**
   * Optional. Response body as bytes. Maximum body size is 4096B.
   * @see #setBytesBody()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public HttpRouteHttpDirectResponse encodeBytesBody(byte[] bytesBody) {
    this.bytesBody = com.google.api.client.util.Base64.encodeBase64URLSafeString(bytesBody);
    return this;
  }

  /**
   * Required. Status to return as part of HTTP Response. Must be a positive integer.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStatus() {
    return status;
  }

  /**
   * Required. Status to return as part of HTTP Response. Must be a positive integer.
   * @param status status or {@code null} for none
   */
  public HttpRouteHttpDirectResponse setStatus(java.lang.Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Optional. Response body as a string. Maximum body length is 1024 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getStringBody() {
    return stringBody;
  }

  /**
   * Optional. Response body as a string. Maximum body length is 1024 characters.
   * @param stringBody stringBody or {@code null} for none
   */
  public HttpRouteHttpDirectResponse setStringBody(java.lang.String stringBody) {
    this.stringBody = stringBody;
    return this;
  }

  @Override
  public HttpRouteHttpDirectResponse set(String fieldName, Object value) {
    return (HttpRouteHttpDirectResponse) super.set(fieldName, value);
  }

  @Override
  public HttpRouteHttpDirectResponse clone() {
    return (HttpRouteHttpDirectResponse) super.clone();
  }

}
