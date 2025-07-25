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

package com.google.api.services.androidenterprise.model;

/**
 * Options for Google authentication during the enrollment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EnrollmentTokenGoogleAuthenticationOptions extends com.google.api.client.json.GenericJson {

  /**
   * [Optional] Specifies whether user should authenticate with Google during enrollment. This
   * setting, if specified,`GoogleAuthenticationSettings` specified for the enterprise resource is
   * ignored for devices enrolled with this token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authenticationRequirement;

  /**
   * [Optional] Specifies the managed Google account that the user must use during
   * enrollment.`AuthenticationRequirement` must be set to`REQUIRED` if this field is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requiredAccountEmail;

  /**
   * [Optional] Specifies whether user should authenticate with Google during enrollment. This
   * setting, if specified,`GoogleAuthenticationSettings` specified for the enterprise resource is
   * ignored for devices enrolled with this token.
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthenticationRequirement() {
    return authenticationRequirement;
  }

  /**
   * [Optional] Specifies whether user should authenticate with Google during enrollment. This
   * setting, if specified,`GoogleAuthenticationSettings` specified for the enterprise resource is
   * ignored for devices enrolled with this token.
   * @param authenticationRequirement authenticationRequirement or {@code null} for none
   */
  public EnrollmentTokenGoogleAuthenticationOptions setAuthenticationRequirement(java.lang.String authenticationRequirement) {
    this.authenticationRequirement = authenticationRequirement;
    return this;
  }

  /**
   * [Optional] Specifies the managed Google account that the user must use during
   * enrollment.`AuthenticationRequirement` must be set to`REQUIRED` if this field is set.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequiredAccountEmail() {
    return requiredAccountEmail;
  }

  /**
   * [Optional] Specifies the managed Google account that the user must use during
   * enrollment.`AuthenticationRequirement` must be set to`REQUIRED` if this field is set.
   * @param requiredAccountEmail requiredAccountEmail or {@code null} for none
   */
  public EnrollmentTokenGoogleAuthenticationOptions setRequiredAccountEmail(java.lang.String requiredAccountEmail) {
    this.requiredAccountEmail = requiredAccountEmail;
    return this;
  }

  @Override
  public EnrollmentTokenGoogleAuthenticationOptions set(String fieldName, Object value) {
    return (EnrollmentTokenGoogleAuthenticationOptions) super.set(fieldName, value);
  }

  @Override
  public EnrollmentTokenGoogleAuthenticationOptions clone() {
    return (EnrollmentTokenGoogleAuthenticationOptions) super.clone();
  }

}
