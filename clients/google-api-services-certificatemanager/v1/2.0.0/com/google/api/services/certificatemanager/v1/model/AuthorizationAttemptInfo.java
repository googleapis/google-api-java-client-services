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

package com.google.api.services.certificatemanager.v1.model;

/**
 * State of the latest attempt to authorize a domain for certificate issuance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Certificate Manager API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AuthorizationAttemptInfo extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Human readable explanation for reaching the state. Provided to help address the
   * configuration issues. Not guaranteed to be stable. For programmatic access use FailureReason
   * enum.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String details;

  /**
   * Output only. Domain name of the authorization attempt.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String domain;

  /**
   * Output only. Reason for failure of the authorization attempt for the domain.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String failureReason;

  /**
   * Output only. State of the domain for managed certificate issuance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Human readable explanation for reaching the state. Provided to help address the
   * configuration issues. Not guaranteed to be stable. For programmatic access use FailureReason
   * enum.
   * @return value or {@code null} for none
   */
  public java.lang.String getDetails() {
    return details;
  }

  /**
   * Output only. Human readable explanation for reaching the state. Provided to help address the
   * configuration issues. Not guaranteed to be stable. For programmatic access use FailureReason
   * enum.
   * @param details details or {@code null} for none
   */
  public AuthorizationAttemptInfo setDetails(java.lang.String details) {
    this.details = details;
    return this;
  }

  /**
   * Output only. Domain name of the authorization attempt.
   * @return value or {@code null} for none
   */
  public java.lang.String getDomain() {
    return domain;
  }

  /**
   * Output only. Domain name of the authorization attempt.
   * @param domain domain or {@code null} for none
   */
  public AuthorizationAttemptInfo setDomain(java.lang.String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Output only. Reason for failure of the authorization attempt for the domain.
   * @return value or {@code null} for none
   */
  public java.lang.String getFailureReason() {
    return failureReason;
  }

  /**
   * Output only. Reason for failure of the authorization attempt for the domain.
   * @param failureReason failureReason or {@code null} for none
   */
  public AuthorizationAttemptInfo setFailureReason(java.lang.String failureReason) {
    this.failureReason = failureReason;
    return this;
  }

  /**
   * Output only. State of the domain for managed certificate issuance.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. State of the domain for managed certificate issuance.
   * @param state state or {@code null} for none
   */
  public AuthorizationAttemptInfo setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public AuthorizationAttemptInfo set(String fieldName, Object value) {
    return (AuthorizationAttemptInfo) super.set(fieldName, value);
  }

  @Override
  public AuthorizationAttemptInfo clone() {
    return (AuthorizationAttemptInfo) super.clone();
  }

}
