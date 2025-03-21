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

package com.google.api.services.securityposture.v1.model;

/**
 * Metadata for a constraint in a Policy.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Posture API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Constraint extends com.google.api.client.json.GenericJson {

  /**
   * Optional. A predefined organization policy constraint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OrgPolicyConstraint orgPolicyConstraint;

  /**
   * Optional. A custom organization policy constraint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OrgPolicyConstraintCustom orgPolicyConstraintCustom;

  /**
   * Optional. A custom module for Security Health Analytics.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SecurityHealthAnalyticsCustomModule securityHealthAnalyticsCustomModule;

  /**
   * Optional. A built-in detector for Security Health Analytics.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SecurityHealthAnalyticsModule securityHealthAnalyticsModule;

  /**
   * Optional. A predefined organization policy constraint.
   * @return value or {@code null} for none
   */
  public OrgPolicyConstraint getOrgPolicyConstraint() {
    return orgPolicyConstraint;
  }

  /**
   * Optional. A predefined organization policy constraint.
   * @param orgPolicyConstraint orgPolicyConstraint or {@code null} for none
   */
  public Constraint setOrgPolicyConstraint(OrgPolicyConstraint orgPolicyConstraint) {
    this.orgPolicyConstraint = orgPolicyConstraint;
    return this;
  }

  /**
   * Optional. A custom organization policy constraint.
   * @return value or {@code null} for none
   */
  public OrgPolicyConstraintCustom getOrgPolicyConstraintCustom() {
    return orgPolicyConstraintCustom;
  }

  /**
   * Optional. A custom organization policy constraint.
   * @param orgPolicyConstraintCustom orgPolicyConstraintCustom or {@code null} for none
   */
  public Constraint setOrgPolicyConstraintCustom(OrgPolicyConstraintCustom orgPolicyConstraintCustom) {
    this.orgPolicyConstraintCustom = orgPolicyConstraintCustom;
    return this;
  }

  /**
   * Optional. A custom module for Security Health Analytics.
   * @return value or {@code null} for none
   */
  public SecurityHealthAnalyticsCustomModule getSecurityHealthAnalyticsCustomModule() {
    return securityHealthAnalyticsCustomModule;
  }

  /**
   * Optional. A custom module for Security Health Analytics.
   * @param securityHealthAnalyticsCustomModule securityHealthAnalyticsCustomModule or {@code null} for none
   */
  public Constraint setSecurityHealthAnalyticsCustomModule(SecurityHealthAnalyticsCustomModule securityHealthAnalyticsCustomModule) {
    this.securityHealthAnalyticsCustomModule = securityHealthAnalyticsCustomModule;
    return this;
  }

  /**
   * Optional. A built-in detector for Security Health Analytics.
   * @return value or {@code null} for none
   */
  public SecurityHealthAnalyticsModule getSecurityHealthAnalyticsModule() {
    return securityHealthAnalyticsModule;
  }

  /**
   * Optional. A built-in detector for Security Health Analytics.
   * @param securityHealthAnalyticsModule securityHealthAnalyticsModule or {@code null} for none
   */
  public Constraint setSecurityHealthAnalyticsModule(SecurityHealthAnalyticsModule securityHealthAnalyticsModule) {
    this.securityHealthAnalyticsModule = securityHealthAnalyticsModule;
    return this;
  }

  @Override
  public Constraint set(String fieldName, Object value) {
    return (Constraint) super.set(fieldName, value);
  }

  @Override
  public Constraint clone() {
    return (Constraint) super.clone();
  }

}
