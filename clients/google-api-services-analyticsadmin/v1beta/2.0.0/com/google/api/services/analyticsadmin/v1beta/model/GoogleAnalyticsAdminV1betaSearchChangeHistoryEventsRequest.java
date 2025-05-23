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

package com.google.api.services.analyticsadmin.v1beta.model;

/**
 * Request message for SearchChangeHistoryEvents RPC.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Admin API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAnalyticsAdminV1betaSearchChangeHistoryEventsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. If set, only return changes that match one or more of these types of actions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> action;

  /**
   * Optional. If set, only return changes if they are made by a user in this list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> actorEmail;

  /**
   * Optional. If set, only return changes made after this time (inclusive).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String earliestChangeTime;

  /**
   * Optional. If set, only return changes made before this time (inclusive).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String latestChangeTime;

  /**
   * Optional. The maximum number of ChangeHistoryEvent items to return. If unspecified, at most 50
   * items will be returned. The maximum value is 200 (higher values will be coerced to the
   * maximum). Note that the service may return a page with fewer items than this value specifies
   * (potentially even zero), and that there still may be additional pages. If you want a particular
   * number of items, you'll need to continue requesting additional pages using `page_token` until
   * you get the needed number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageSize;

  /**
   * Optional. A page token, received from a previous `SearchChangeHistoryEvents` call. Provide this
   * to retrieve the subsequent page. When paginating, all other parameters provided to
   * `SearchChangeHistoryEvents` must match the call that provided the page token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * Optional. Resource name for a child property. If set, only return changes made to this property
   * or its child resources. Format: properties/{propertyId} Example: `properties/100`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String property;

  /**
   * Optional. If set, only return changes if they are for a resource that matches at least one of
   * these types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> resourceType;

  /**
   * Optional. If set, only return changes that match one or more of these types of actions.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAction() {
    return action;
  }

  /**
   * Optional. If set, only return changes that match one or more of these types of actions.
   * @param action action or {@code null} for none
   */
  public GoogleAnalyticsAdminV1betaSearchChangeHistoryEventsRequest setAction(java.util.List<java.lang.String> action) {
    this.action = action;
    return this;
  }

  /**
   * Optional. If set, only return changes if they are made by a user in this list.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getActorEmail() {
    return actorEmail;
  }

  /**
   * Optional. If set, only return changes if they are made by a user in this list.
   * @param actorEmail actorEmail or {@code null} for none
   */
  public GoogleAnalyticsAdminV1betaSearchChangeHistoryEventsRequest setActorEmail(java.util.List<java.lang.String> actorEmail) {
    this.actorEmail = actorEmail;
    return this;
  }

  /**
   * Optional. If set, only return changes made after this time (inclusive).
   * @return value or {@code null} for none
   */
  public String getEarliestChangeTime() {
    return earliestChangeTime;
  }

  /**
   * Optional. If set, only return changes made after this time (inclusive).
   * @param earliestChangeTime earliestChangeTime or {@code null} for none
   */
  public GoogleAnalyticsAdminV1betaSearchChangeHistoryEventsRequest setEarliestChangeTime(String earliestChangeTime) {
    this.earliestChangeTime = earliestChangeTime;
    return this;
  }

  /**
   * Optional. If set, only return changes made before this time (inclusive).
   * @return value or {@code null} for none
   */
  public String getLatestChangeTime() {
    return latestChangeTime;
  }

  /**
   * Optional. If set, only return changes made before this time (inclusive).
   * @param latestChangeTime latestChangeTime or {@code null} for none
   */
  public GoogleAnalyticsAdminV1betaSearchChangeHistoryEventsRequest setLatestChangeTime(String latestChangeTime) {
    this.latestChangeTime = latestChangeTime;
    return this;
  }

  /**
   * Optional. The maximum number of ChangeHistoryEvent items to return. If unspecified, at most 50
   * items will be returned. The maximum value is 200 (higher values will be coerced to the
   * maximum). Note that the service may return a page with fewer items than this value specifies
   * (potentially even zero), and that there still may be additional pages. If you want a particular
   * number of items, you'll need to continue requesting additional pages using `page_token` until
   * you get the needed number.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * Optional. The maximum number of ChangeHistoryEvent items to return. If unspecified, at most 50
   * items will be returned. The maximum value is 200 (higher values will be coerced to the
   * maximum). Note that the service may return a page with fewer items than this value specifies
   * (potentially even zero), and that there still may be additional pages. If you want a particular
   * number of items, you'll need to continue requesting additional pages using `page_token` until
   * you get the needed number.
   * @param pageSize pageSize or {@code null} for none
   */
  public GoogleAnalyticsAdminV1betaSearchChangeHistoryEventsRequest setPageSize(java.lang.Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Optional. A page token, received from a previous `SearchChangeHistoryEvents` call. Provide this
   * to retrieve the subsequent page. When paginating, all other parameters provided to
   * `SearchChangeHistoryEvents` must match the call that provided the page token.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * Optional. A page token, received from a previous `SearchChangeHistoryEvents` call. Provide this
   * to retrieve the subsequent page. When paginating, all other parameters provided to
   * `SearchChangeHistoryEvents` must match the call that provided the page token.
   * @param pageToken pageToken or {@code null} for none
   */
  public GoogleAnalyticsAdminV1betaSearchChangeHistoryEventsRequest setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * Optional. Resource name for a child property. If set, only return changes made to this property
   * or its child resources. Format: properties/{propertyId} Example: `properties/100`
   * @return value or {@code null} for none
   */
  public java.lang.String getProperty() {
    return property;
  }

  /**
   * Optional. Resource name for a child property. If set, only return changes made to this property
   * or its child resources. Format: properties/{propertyId} Example: `properties/100`
   * @param property property or {@code null} for none
   */
  public GoogleAnalyticsAdminV1betaSearchChangeHistoryEventsRequest setProperty(java.lang.String property) {
    this.property = property;
    return this;
  }

  /**
   * Optional. If set, only return changes if they are for a resource that matches at least one of
   * these types.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getResourceType() {
    return resourceType;
  }

  /**
   * Optional. If set, only return changes if they are for a resource that matches at least one of
   * these types.
   * @param resourceType resourceType or {@code null} for none
   */
  public GoogleAnalyticsAdminV1betaSearchChangeHistoryEventsRequest setResourceType(java.util.List<java.lang.String> resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  @Override
  public GoogleAnalyticsAdminV1betaSearchChangeHistoryEventsRequest set(String fieldName, Object value) {
    return (GoogleAnalyticsAdminV1betaSearchChangeHistoryEventsRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleAnalyticsAdminV1betaSearchChangeHistoryEventsRequest clone() {
    return (GoogleAnalyticsAdminV1betaSearchChangeHistoryEventsRequest) super.clone();
  }

}
