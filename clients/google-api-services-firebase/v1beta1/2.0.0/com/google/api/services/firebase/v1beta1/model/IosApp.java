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

package com.google.api.services.firebase.v1beta1.model;

/**
 * Details of a Firebase App for iOS.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IosApp extends com.google.api.client.json.GenericJson {

  /**
   * The globally unique, Google-assigned identifier (UID) for the Firebase API key associated with
   * the `IosApp`. Be aware that this value is the UID of the API key, _not_ the
   * [`keyString`](https://cloud.google.com/api-
   * keys/docs/reference/rest/v2/projects.locations.keys#Key.FIELDS.key_string) of the API key. The
   * `keyString` is the value that can be found in the App's [configuration
   * artifact](../../rest/v1beta1/projects.iosApps/getConfig). If `api_key_id` is not set in
   * requests to [`iosApps.Create`](../../rest/v1beta1/projects.iosApps/create), then Firebase
   * automatically associates an `api_key_id` with the `IosApp`. This auto-associated key may be an
   * existing valid key or, if no valid key exists, a new one will be provisioned. In patch
   * requests, `api_key_id` cannot be set to an empty value, and the new UID must have no
   * restrictions or only have restrictions that are valid for the associated `IosApp`. We recommend
   * using the [Google Cloud Console](https://console.cloud.google.com/apis/credentials) to manage
   * API keys.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String apiKeyId;

  /**
   * Output only. Immutable. The globally unique, Firebase-assigned identifier for the `IosApp`.
   * This identifier should be treated as an opaque token, as the data format is not specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appId;

  /**
   * The automatically generated Apple ID assigned to the iOS app by Apple in the iOS App Store.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appStoreId;

  /**
   * Immutable. The canonical bundle ID of the iOS app as it would appear in the iOS AppStore.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bundleId;

  /**
   * The user-assigned display name for the `IosApp`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * This checksum is computed by the server based on the value of other fields, and it may be sent
   * with update requests to ensure the client has an up-to-date value before proceeding. Learn more
   * about `etag` in Google's [AIP-154 standard](https://google.aip.dev/154#declarative-friendly-
   * resources). This etag is strongly validated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Output only. If the App has been removed from the Project, this is the timestamp of when the
   * App is considered expired and will be permanently deleted. After this time, the App cannot be
   * undeleted (that is, restored to the Project). This value is only provided if the App is in the
   * `DELETED` state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expireTime;

  /**
   * The resource name of the IosApp, in the format: projects/PROJECT_IDENTIFIER /iosApps/APP_ID *
   * PROJECT_IDENTIFIER: the parent Project's
   * [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its
   * [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using project
   * identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the
   * value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`. * APP_ID: the
   * globally unique, Firebase-assigned identifier for the App (see
   * [`appId`](../projects.iosApps#IosApp.FIELDS.app_id)).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Immutable. A user-assigned unique identifier of the parent FirebaseProject for the
   * `IosApp`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Output only. The lifecycle state of the App.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The Apple Developer Team ID associated with the App in the App Store.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String teamId;

  /**
   * The globally unique, Google-assigned identifier (UID) for the Firebase API key associated with
   * the `IosApp`. Be aware that this value is the UID of the API key, _not_ the
   * [`keyString`](https://cloud.google.com/api-
   * keys/docs/reference/rest/v2/projects.locations.keys#Key.FIELDS.key_string) of the API key. The
   * `keyString` is the value that can be found in the App's [configuration
   * artifact](../../rest/v1beta1/projects.iosApps/getConfig). If `api_key_id` is not set in
   * requests to [`iosApps.Create`](../../rest/v1beta1/projects.iosApps/create), then Firebase
   * automatically associates an `api_key_id` with the `IosApp`. This auto-associated key may be an
   * existing valid key or, if no valid key exists, a new one will be provisioned. In patch
   * requests, `api_key_id` cannot be set to an empty value, and the new UID must have no
   * restrictions or only have restrictions that are valid for the associated `IosApp`. We recommend
   * using the [Google Cloud Console](https://console.cloud.google.com/apis/credentials) to manage
   * API keys.
   * @return value or {@code null} for none
   */
  public java.lang.String getApiKeyId() {
    return apiKeyId;
  }

  /**
   * The globally unique, Google-assigned identifier (UID) for the Firebase API key associated with
   * the `IosApp`. Be aware that this value is the UID of the API key, _not_ the
   * [`keyString`](https://cloud.google.com/api-
   * keys/docs/reference/rest/v2/projects.locations.keys#Key.FIELDS.key_string) of the API key. The
   * `keyString` is the value that can be found in the App's [configuration
   * artifact](../../rest/v1beta1/projects.iosApps/getConfig). If `api_key_id` is not set in
   * requests to [`iosApps.Create`](../../rest/v1beta1/projects.iosApps/create), then Firebase
   * automatically associates an `api_key_id` with the `IosApp`. This auto-associated key may be an
   * existing valid key or, if no valid key exists, a new one will be provisioned. In patch
   * requests, `api_key_id` cannot be set to an empty value, and the new UID must have no
   * restrictions or only have restrictions that are valid for the associated `IosApp`. We recommend
   * using the [Google Cloud Console](https://console.cloud.google.com/apis/credentials) to manage
   * API keys.
   * @param apiKeyId apiKeyId or {@code null} for none
   */
  public IosApp setApiKeyId(java.lang.String apiKeyId) {
    this.apiKeyId = apiKeyId;
    return this;
  }

  /**
   * Output only. Immutable. The globally unique, Firebase-assigned identifier for the `IosApp`.
   * This identifier should be treated as an opaque token, as the data format is not specified.
   * @return value or {@code null} for none
   */
  public java.lang.String getAppId() {
    return appId;
  }

  /**
   * Output only. Immutable. The globally unique, Firebase-assigned identifier for the `IosApp`.
   * This identifier should be treated as an opaque token, as the data format is not specified.
   * @param appId appId or {@code null} for none
   */
  public IosApp setAppId(java.lang.String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * The automatically generated Apple ID assigned to the iOS app by Apple in the iOS App Store.
   * @return value or {@code null} for none
   */
  public java.lang.String getAppStoreId() {
    return appStoreId;
  }

  /**
   * The automatically generated Apple ID assigned to the iOS app by Apple in the iOS App Store.
   * @param appStoreId appStoreId or {@code null} for none
   */
  public IosApp setAppStoreId(java.lang.String appStoreId) {
    this.appStoreId = appStoreId;
    return this;
  }

  /**
   * Immutable. The canonical bundle ID of the iOS app as it would appear in the iOS AppStore.
   * @return value or {@code null} for none
   */
  public java.lang.String getBundleId() {
    return bundleId;
  }

  /**
   * Immutable. The canonical bundle ID of the iOS app as it would appear in the iOS AppStore.
   * @param bundleId bundleId or {@code null} for none
   */
  public IosApp setBundleId(java.lang.String bundleId) {
    this.bundleId = bundleId;
    return this;
  }

  /**
   * The user-assigned display name for the `IosApp`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The user-assigned display name for the `IosApp`.
   * @param displayName displayName or {@code null} for none
   */
  public IosApp setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * This checksum is computed by the server based on the value of other fields, and it may be sent
   * with update requests to ensure the client has an up-to-date value before proceeding. Learn more
   * about `etag` in Google's [AIP-154 standard](https://google.aip.dev/154#declarative-friendly-
   * resources). This etag is strongly validated.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * This checksum is computed by the server based on the value of other fields, and it may be sent
   * with update requests to ensure the client has an up-to-date value before proceeding. Learn more
   * about `etag` in Google's [AIP-154 standard](https://google.aip.dev/154#declarative-friendly-
   * resources). This etag is strongly validated.
   * @param etag etag or {@code null} for none
   */
  public IosApp setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Output only. If the App has been removed from the Project, this is the timestamp of when the
   * App is considered expired and will be permanently deleted. After this time, the App cannot be
   * undeleted (that is, restored to the Project). This value is only provided if the App is in the
   * `DELETED` state.
   * @return value or {@code null} for none
   */
  public String getExpireTime() {
    return expireTime;
  }

  /**
   * Output only. If the App has been removed from the Project, this is the timestamp of when the
   * App is considered expired and will be permanently deleted. After this time, the App cannot be
   * undeleted (that is, restored to the Project). This value is only provided if the App is in the
   * `DELETED` state.
   * @param expireTime expireTime or {@code null} for none
   */
  public IosApp setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  /**
   * The resource name of the IosApp, in the format: projects/PROJECT_IDENTIFIER /iosApps/APP_ID *
   * PROJECT_IDENTIFIER: the parent Project's
   * [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its
   * [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using project
   * identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the
   * value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`. * APP_ID: the
   * globally unique, Firebase-assigned identifier for the App (see
   * [`appId`](../projects.iosApps#IosApp.FIELDS.app_id)).
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the IosApp, in the format: projects/PROJECT_IDENTIFIER /iosApps/APP_ID *
   * PROJECT_IDENTIFIER: the parent Project's
   * [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its
   * [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using project
   * identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the
   * value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`. * APP_ID: the
   * globally unique, Firebase-assigned identifier for the App (see
   * [`appId`](../projects.iosApps#IosApp.FIELDS.app_id)).
   * @param name name or {@code null} for none
   */
  public IosApp setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Immutable. A user-assigned unique identifier of the parent FirebaseProject for the
   * `IosApp`.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Output only. Immutable. A user-assigned unique identifier of the parent FirebaseProject for the
   * `IosApp`.
   * @param projectId projectId or {@code null} for none
   */
  public IosApp setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Output only. The lifecycle state of the App.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The lifecycle state of the App.
   * @param state state or {@code null} for none
   */
  public IosApp setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * The Apple Developer Team ID associated with the App in the App Store.
   * @return value or {@code null} for none
   */
  public java.lang.String getTeamId() {
    return teamId;
  }

  /**
   * The Apple Developer Team ID associated with the App in the App Store.
   * @param teamId teamId or {@code null} for none
   */
  public IosApp setTeamId(java.lang.String teamId) {
    this.teamId = teamId;
    return this;
  }

  @Override
  public IosApp set(String fieldName, Object value) {
    return (IosApp) super.set(fieldName, value);
  }

  @Override
  public IosApp clone() {
    return (IosApp) super.clone();
  }

}
