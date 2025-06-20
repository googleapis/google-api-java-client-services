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

package com.google.api.services.contactcenterinsights.v1.model;

/**
 * An AuthorizedViewSet contains a set of AuthorizedView resources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Contact Center AI Insights API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudContactcenterinsightsV1AuthorizedViewSet extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Create time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Display Name. Limit 64 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Identifier. The resource name of the AuthorizedViewSet. Format:
   * projects/{project}/locations/{location}/authorizedViewSets/{authorized_view_set}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Update time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Create time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Create time.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1AuthorizedViewSet setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Display Name. Limit 64 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Display Name. Limit 64 characters.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1AuthorizedViewSet setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Identifier. The resource name of the AuthorizedViewSet. Format:
   * projects/{project}/locations/{location}/authorizedViewSets/{authorized_view_set}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The resource name of the AuthorizedViewSet. Format:
   * projects/{project}/locations/{location}/authorizedViewSets/{authorized_view_set}
   * @param name name or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1AuthorizedViewSet setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Update time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Update time.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1AuthorizedViewSet setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1AuthorizedViewSet set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1AuthorizedViewSet) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1AuthorizedViewSet clone() {
    return (GoogleCloudContactcenterinsightsV1AuthorizedViewSet) super.clone();
  }

}
