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
 * Allows customers to configure tenant IDs for a Cloud Identity Platform (GCIP) instance for each
 * application.
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
public final class GcipSettings extends com.google.api.client.json.GenericJson {

  /**
   * Login page URI associated with the GCIP tenants. Typically, all resources within the same
   * project share the same login page, though it could be overridden at the sub resource level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String loginPageUri;

  /**
   * Optional. GCIP tenant IDs that are linked to the IAP resource. `tenant_ids` could be a string
   * beginning with a number character to indicate authenticating with GCIP tenant flow, or in the
   * format of `_` to indicate authenticating with GCIP agent flow. If agent flow is used,
   * `tenant_ids` should only contain one single element, while for tenant flow, `tenant_ids` can
   * contain multiple elements.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> tenantIds;

  /**
   * Login page URI associated with the GCIP tenants. Typically, all resources within the same
   * project share the same login page, though it could be overridden at the sub resource level.
   * @return value or {@code null} for none
   */
  public java.lang.String getLoginPageUri() {
    return loginPageUri;
  }

  /**
   * Login page URI associated with the GCIP tenants. Typically, all resources within the same
   * project share the same login page, though it could be overridden at the sub resource level.
   * @param loginPageUri loginPageUri or {@code null} for none
   */
  public GcipSettings setLoginPageUri(java.lang.String loginPageUri) {
    this.loginPageUri = loginPageUri;
    return this;
  }

  /**
   * Optional. GCIP tenant IDs that are linked to the IAP resource. `tenant_ids` could be a string
   * beginning with a number character to indicate authenticating with GCIP tenant flow, or in the
   * format of `_` to indicate authenticating with GCIP agent flow. If agent flow is used,
   * `tenant_ids` should only contain one single element, while for tenant flow, `tenant_ids` can
   * contain multiple elements.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTenantIds() {
    return tenantIds;
  }

  /**
   * Optional. GCIP tenant IDs that are linked to the IAP resource. `tenant_ids` could be a string
   * beginning with a number character to indicate authenticating with GCIP tenant flow, or in the
   * format of `_` to indicate authenticating with GCIP agent flow. If agent flow is used,
   * `tenant_ids` should only contain one single element, while for tenant flow, `tenant_ids` can
   * contain multiple elements.
   * @param tenantIds tenantIds or {@code null} for none
   */
  public GcipSettings setTenantIds(java.util.List<java.lang.String> tenantIds) {
    this.tenantIds = tenantIds;
    return this;
  }

  @Override
  public GcipSettings set(String fieldName, Object value) {
    return (GcipSettings) super.set(fieldName, value);
  }

  @Override
  public GcipSettings clone() {
    return (GcipSettings) super.clone();
  }

}
