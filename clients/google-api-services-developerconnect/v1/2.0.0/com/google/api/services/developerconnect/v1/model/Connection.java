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

package com.google.api.services.developerconnect.v1.model;

/**
 * Message describing Connection object
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Developer Connect API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Connection extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Allows clients to store small amounts of arbitrary data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> annotations;

  /**
   * Output only. [Output only] Create timestamp
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. [Output only] Delete timestamp
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String deleteTime;

  /**
   * Optional. If disabled is set to true, functionality is disabled for this connection. Repository
   * based API methods and webhooks processing for repositories in this connection will be disabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disabled;

  /**
   * Optional. This checksum is computed by the server based on the value of other fields, and may
   * be sent on update and delete requests to ensure the client has an up-to-date value before
   * proceeding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Configuration for connections to github.com.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GitHubConfig githubConfig;

  /**
   * Output only. Installation state of the Connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InstallationState installationState;

  /**
   * Optional. Labels as key value pairs
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Identifier. The resource name of the connection, in the format
   * `projects/{project}/locations/{location}/connections/{connection_id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Set to true when the connection is being set up or updated in the background.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean reconciling;

  /**
   * Output only. A system-assigned unique identifier for a the GitRepositoryLink.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * Output only. [Output only] Update timestamp
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Optional. Allows clients to store small amounts of arbitrary data.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAnnotations() {
    return annotations;
  }

  /**
   * Optional. Allows clients to store small amounts of arbitrary data.
   * @param annotations annotations or {@code null} for none
   */
  public Connection setAnnotations(java.util.Map<String, java.lang.String> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * Output only. [Output only] Create timestamp
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. [Output only] Create timestamp
   * @param createTime createTime or {@code null} for none
   */
  public Connection setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. [Output only] Delete timestamp
   * @return value or {@code null} for none
   */
  public String getDeleteTime() {
    return deleteTime;
  }

  /**
   * Output only. [Output only] Delete timestamp
   * @param deleteTime deleteTime or {@code null} for none
   */
  public Connection setDeleteTime(String deleteTime) {
    this.deleteTime = deleteTime;
    return this;
  }

  /**
   * Optional. If disabled is set to true, functionality is disabled for this connection. Repository
   * based API methods and webhooks processing for repositories in this connection will be disabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisabled() {
    return disabled;
  }

  /**
   * Optional. If disabled is set to true, functionality is disabled for this connection. Repository
   * based API methods and webhooks processing for repositories in this connection will be disabled.
   * @param disabled disabled or {@code null} for none
   */
  public Connection setDisabled(java.lang.Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Optional. This checksum is computed by the server based on the value of other fields, and may
   * be sent on update and delete requests to ensure the client has an up-to-date value before
   * proceeding.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Optional. This checksum is computed by the server based on the value of other fields, and may
   * be sent on update and delete requests to ensure the client has an up-to-date value before
   * proceeding.
   * @param etag etag or {@code null} for none
   */
  public Connection setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Configuration for connections to github.com.
   * @return value or {@code null} for none
   */
  public GitHubConfig getGithubConfig() {
    return githubConfig;
  }

  /**
   * Configuration for connections to github.com.
   * @param githubConfig githubConfig or {@code null} for none
   */
  public Connection setGithubConfig(GitHubConfig githubConfig) {
    this.githubConfig = githubConfig;
    return this;
  }

  /**
   * Output only. Installation state of the Connection.
   * @return value or {@code null} for none
   */
  public InstallationState getInstallationState() {
    return installationState;
  }

  /**
   * Output only. Installation state of the Connection.
   * @param installationState installationState or {@code null} for none
   */
  public Connection setInstallationState(InstallationState installationState) {
    this.installationState = installationState;
    return this;
  }

  /**
   * Optional. Labels as key value pairs
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Labels as key value pairs
   * @param labels labels or {@code null} for none
   */
  public Connection setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Identifier. The resource name of the connection, in the format
   * `projects/{project}/locations/{location}/connections/{connection_id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The resource name of the connection, in the format
   * `projects/{project}/locations/{location}/connections/{connection_id}`.
   * @param name name or {@code null} for none
   */
  public Connection setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Set to true when the connection is being set up or updated in the background.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReconciling() {
    return reconciling;
  }

  /**
   * Output only. Set to true when the connection is being set up or updated in the background.
   * @param reconciling reconciling or {@code null} for none
   */
  public Connection setReconciling(java.lang.Boolean reconciling) {
    this.reconciling = reconciling;
    return this;
  }

  /**
   * Output only. A system-assigned unique identifier for a the GitRepositoryLink.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Output only. A system-assigned unique identifier for a the GitRepositoryLink.
   * @param uid uid or {@code null} for none
   */
  public Connection setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Output only. [Output only] Update timestamp
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. [Output only] Update timestamp
   * @param updateTime updateTime or {@code null} for none
   */
  public Connection setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Connection set(String fieldName, Object value) {
    return (Connection) super.set(fieldName, value);
  }

  @Override
  public Connection clone() {
    return (Connection) super.clone();
  }

}