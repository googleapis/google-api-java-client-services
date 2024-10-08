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

package com.google.api.services.iap.v1.model;

/**
 * The OAuth 2.0 Settings
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity-Aware Proxy API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OAuth2 extends com.google.api.client.json.GenericJson {

  /**
   * The OAuth 2.0 client ID registered in the workforce identity federation OAuth 2.0 Server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientId;

  /**
   * Input only. The OAuth 2.0 client secret created while registering the client ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientSecret;

  /**
   * Output only. SHA256 hash value for the client secret. This field is returned by IAP when the
   * settings are retrieved.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientSecretSha256;

  /**
   * The OAuth 2.0 client ID registered in the workforce identity federation OAuth 2.0 Server.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientId() {
    return clientId;
  }

  /**
   * The OAuth 2.0 client ID registered in the workforce identity federation OAuth 2.0 Server.
   * @param clientId clientId or {@code null} for none
   */
  public OAuth2 setClientId(java.lang.String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Input only. The OAuth 2.0 client secret created while registering the client ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientSecret() {
    return clientSecret;
  }

  /**
   * Input only. The OAuth 2.0 client secret created while registering the client ID.
   * @param clientSecret clientSecret or {@code null} for none
   */
  public OAuth2 setClientSecret(java.lang.String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * Output only. SHA256 hash value for the client secret. This field is returned by IAP when the
   * settings are retrieved.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientSecretSha256() {
    return clientSecretSha256;
  }

  /**
   * Output only. SHA256 hash value for the client secret. This field is returned by IAP when the
   * settings are retrieved.
   * @param clientSecretSha256 clientSecretSha256 or {@code null} for none
   */
  public OAuth2 setClientSecretSha256(java.lang.String clientSecretSha256) {
    this.clientSecretSha256 = clientSecretSha256;
    return this;
  }

  @Override
  public OAuth2 set(String fieldName, Object value) {
    return (OAuth2) super.set(fieldName, value);
  }

  @Override
  public OAuth2 clone() {
    return (OAuth2) super.clone();
  }

}
