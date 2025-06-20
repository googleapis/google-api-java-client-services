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

package com.google.api.services.integrations.v1.model;

/**
 * JWT claims used for the jwt-bearer authorization grant.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Application Integration API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudConnectorsV1AuthConfigOauth2JwtBearerJwtClaims extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Value for the "aud" claim.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String audience;

  /**
   * Optional. Value for the "iss" claim.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String issuer;

  /**
   * Optional. Value for the "sub" claim.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subject;

  /**
   * Optional. Value for the "aud" claim.
   * @return value or {@code null} for none
   */
  public java.lang.String getAudience() {
    return audience;
  }

  /**
   * Optional. Value for the "aud" claim.
   * @param audience audience or {@code null} for none
   */
  public GoogleCloudConnectorsV1AuthConfigOauth2JwtBearerJwtClaims setAudience(java.lang.String audience) {
    this.audience = audience;
    return this;
  }

  /**
   * Optional. Value for the "iss" claim.
   * @return value or {@code null} for none
   */
  public java.lang.String getIssuer() {
    return issuer;
  }

  /**
   * Optional. Value for the "iss" claim.
   * @param issuer issuer or {@code null} for none
   */
  public GoogleCloudConnectorsV1AuthConfigOauth2JwtBearerJwtClaims setIssuer(java.lang.String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Optional. Value for the "sub" claim.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubject() {
    return subject;
  }

  /**
   * Optional. Value for the "sub" claim.
   * @param subject subject or {@code null} for none
   */
  public GoogleCloudConnectorsV1AuthConfigOauth2JwtBearerJwtClaims setSubject(java.lang.String subject) {
    this.subject = subject;
    return this;
  }

  @Override
  public GoogleCloudConnectorsV1AuthConfigOauth2JwtBearerJwtClaims set(String fieldName, Object value) {
    return (GoogleCloudConnectorsV1AuthConfigOauth2JwtBearerJwtClaims) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudConnectorsV1AuthConfigOauth2JwtBearerJwtClaims clone() {
    return (GoogleCloudConnectorsV1AuthConfigOauth2JwtBearerJwtClaims) super.clone();
  }

}
