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

package com.google.api.services.iam.v1.model;

/**
 * Represents the OAuth 2.0 client credential configuration for retrieving additional user
 * attributes that are not present in the initial authentication credentials from the identity
 * provider, e.g. groups. See https://datatracker.ietf.org/doc/html/rfc6749#section-4.4 for more
 * details on client credentials grant flow.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity and Access Management (IAM) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleIamAdminV1WorkforcePoolProviderExtraAttributesOAuth2Client extends com.google.api.client.json.GenericJson {

  /**
   * Required. Represents the IdP and type of claims that should be fetched.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String attributesType;

  /**
   * Required. The OAuth 2.0 client ID for retrieving extra attributes from the identity provider.
   * Required to get the Access Token using client credentials grant flow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientId;

  /**
   * Required. The OAuth 2.0 client secret for retrieving extra attributes from the identity
   * provider. Required to get the Access Token using client credentials grant flow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleIamAdminV1WorkforcePoolProviderOidcClientSecret clientSecret;

  /**
   * Required. The OIDC identity provider's issuer URI. Must be a valid URI using the `https`
   * scheme. Required to get the OIDC discovery document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String issuerUri;

  /**
   * Optional. Represents the parameters to control which claims are fetched from an IdP.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleIamAdminV1WorkforcePoolProviderExtraAttributesOAuth2ClientQueryParameters queryParameters;

  /**
   * Required. Represents the IdP and type of claims that should be fetched.
   * @return value or {@code null} for none
   */
  public java.lang.String getAttributesType() {
    return attributesType;
  }

  /**
   * Required. Represents the IdP and type of claims that should be fetched.
   * @param attributesType attributesType or {@code null} for none
   */
  public GoogleIamAdminV1WorkforcePoolProviderExtraAttributesOAuth2Client setAttributesType(java.lang.String attributesType) {
    this.attributesType = attributesType;
    return this;
  }

  /**
   * Required. The OAuth 2.0 client ID for retrieving extra attributes from the identity provider.
   * Required to get the Access Token using client credentials grant flow.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientId() {
    return clientId;
  }

  /**
   * Required. The OAuth 2.0 client ID for retrieving extra attributes from the identity provider.
   * Required to get the Access Token using client credentials grant flow.
   * @param clientId clientId or {@code null} for none
   */
  public GoogleIamAdminV1WorkforcePoolProviderExtraAttributesOAuth2Client setClientId(java.lang.String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Required. The OAuth 2.0 client secret for retrieving extra attributes from the identity
   * provider. Required to get the Access Token using client credentials grant flow.
   * @return value or {@code null} for none
   */
  public GoogleIamAdminV1WorkforcePoolProviderOidcClientSecret getClientSecret() {
    return clientSecret;
  }

  /**
   * Required. The OAuth 2.0 client secret for retrieving extra attributes from the identity
   * provider. Required to get the Access Token using client credentials grant flow.
   * @param clientSecret clientSecret or {@code null} for none
   */
  public GoogleIamAdminV1WorkforcePoolProviderExtraAttributesOAuth2Client setClientSecret(GoogleIamAdminV1WorkforcePoolProviderOidcClientSecret clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * Required. The OIDC identity provider's issuer URI. Must be a valid URI using the `https`
   * scheme. Required to get the OIDC discovery document.
   * @return value or {@code null} for none
   */
  public java.lang.String getIssuerUri() {
    return issuerUri;
  }

  /**
   * Required. The OIDC identity provider's issuer URI. Must be a valid URI using the `https`
   * scheme. Required to get the OIDC discovery document.
   * @param issuerUri issuerUri or {@code null} for none
   */
  public GoogleIamAdminV1WorkforcePoolProviderExtraAttributesOAuth2Client setIssuerUri(java.lang.String issuerUri) {
    this.issuerUri = issuerUri;
    return this;
  }

  /**
   * Optional. Represents the parameters to control which claims are fetched from an IdP.
   * @return value or {@code null} for none
   */
  public GoogleIamAdminV1WorkforcePoolProviderExtraAttributesOAuth2ClientQueryParameters getQueryParameters() {
    return queryParameters;
  }

  /**
   * Optional. Represents the parameters to control which claims are fetched from an IdP.
   * @param queryParameters queryParameters or {@code null} for none
   */
  public GoogleIamAdminV1WorkforcePoolProviderExtraAttributesOAuth2Client setQueryParameters(GoogleIamAdminV1WorkforcePoolProviderExtraAttributesOAuth2ClientQueryParameters queryParameters) {
    this.queryParameters = queryParameters;
    return this;
  }

  @Override
  public GoogleIamAdminV1WorkforcePoolProviderExtraAttributesOAuth2Client set(String fieldName, Object value) {
    return (GoogleIamAdminV1WorkforcePoolProviderExtraAttributesOAuth2Client) super.set(fieldName, value);
  }

  @Override
  public GoogleIamAdminV1WorkforcePoolProviderExtraAttributesOAuth2Client clone() {
    return (GoogleIamAdminV1WorkforcePoolProviderExtraAttributesOAuth2Client) super.clone();
  }

}
