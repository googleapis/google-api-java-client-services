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

package com.google.api.services.connectors.v1.model;

/**
 * Connectors indicates a specific connector type, e.x. Salesforce, SAP etc.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Connectors API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Connector extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Category of the connector.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String category;

  /**
   * Output only. The type of the connector.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String connectorType;

  /**
   * Output only. Created time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. Description of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Output only. Display name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. Link to documentation page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String documentationUri;

  /**
   * Output only. Eventing details. Will be null if eventing is not supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EventingDetails eventingDetails;

  /**
   * Output only. Link to external page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String externalUri;

  /**
   * Output only. Resource labels to represent user-provided metadata. Refer to cloud documentation
   * on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. Flag to mark the version indicating the launch stage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String launchStage;

  /**
   * Output only. Marketplace connector details. Will be null if the connector is not marketplace
   * connector.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MarketplaceConnectorDetails marketplaceConnectorDetails;

  /**
   * Output only. Resource name of the Connector. Format:
   * projects/{project}/locations/{location}/providers/{provider}/connectors/{connector} Only global
   * location is supported for Connector resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Tags of the connector.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> tags;

  /**
   * Output only. Updated time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Cloud storage location of icons etc consumed by UI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String webAssetsLocation;

  /**
   * Output only. Category of the connector.
   * @return value or {@code null} for none
   */
  public java.lang.String getCategory() {
    return category;
  }

  /**
   * Output only. Category of the connector.
   * @param category category or {@code null} for none
   */
  public Connector setCategory(java.lang.String category) {
    this.category = category;
    return this;
  }

  /**
   * Output only. The type of the connector.
   * @return value or {@code null} for none
   */
  public java.lang.String getConnectorType() {
    return connectorType;
  }

  /**
   * Output only. The type of the connector.
   * @param connectorType connectorType or {@code null} for none
   */
  public Connector setConnectorType(java.lang.String connectorType) {
    this.connectorType = connectorType;
    return this;
  }

  /**
   * Output only. Created time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Created time.
   * @param createTime createTime or {@code null} for none
   */
  public Connector setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. Description of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Output only. Description of the resource.
   * @param description description or {@code null} for none
   */
  public Connector setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Output only. Display name.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Output only. Display name.
   * @param displayName displayName or {@code null} for none
   */
  public Connector setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. Link to documentation page.
   * @return value or {@code null} for none
   */
  public java.lang.String getDocumentationUri() {
    return documentationUri;
  }

  /**
   * Output only. Link to documentation page.
   * @param documentationUri documentationUri or {@code null} for none
   */
  public Connector setDocumentationUri(java.lang.String documentationUri) {
    this.documentationUri = documentationUri;
    return this;
  }

  /**
   * Output only. Eventing details. Will be null if eventing is not supported.
   * @return value or {@code null} for none
   */
  public EventingDetails getEventingDetails() {
    return eventingDetails;
  }

  /**
   * Output only. Eventing details. Will be null if eventing is not supported.
   * @param eventingDetails eventingDetails or {@code null} for none
   */
  public Connector setEventingDetails(EventingDetails eventingDetails) {
    this.eventingDetails = eventingDetails;
    return this;
  }

  /**
   * Output only. Link to external page.
   * @return value or {@code null} for none
   */
  public java.lang.String getExternalUri() {
    return externalUri;
  }

  /**
   * Output only. Link to external page.
   * @param externalUri externalUri or {@code null} for none
   */
  public Connector setExternalUri(java.lang.String externalUri) {
    this.externalUri = externalUri;
    return this;
  }

  /**
   * Output only. Resource labels to represent user-provided metadata. Refer to cloud documentation
   * on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Output only. Resource labels to represent user-provided metadata. Refer to cloud documentation
   * on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
   * @param labels labels or {@code null} for none
   */
  public Connector setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. Flag to mark the version indicating the launch stage.
   * @return value or {@code null} for none
   */
  public java.lang.String getLaunchStage() {
    return launchStage;
  }

  /**
   * Output only. Flag to mark the version indicating the launch stage.
   * @param launchStage launchStage or {@code null} for none
   */
  public Connector setLaunchStage(java.lang.String launchStage) {
    this.launchStage = launchStage;
    return this;
  }

  /**
   * Output only. Marketplace connector details. Will be null if the connector is not marketplace
   * connector.
   * @return value or {@code null} for none
   */
  public MarketplaceConnectorDetails getMarketplaceConnectorDetails() {
    return marketplaceConnectorDetails;
  }

  /**
   * Output only. Marketplace connector details. Will be null if the connector is not marketplace
   * connector.
   * @param marketplaceConnectorDetails marketplaceConnectorDetails or {@code null} for none
   */
  public Connector setMarketplaceConnectorDetails(MarketplaceConnectorDetails marketplaceConnectorDetails) {
    this.marketplaceConnectorDetails = marketplaceConnectorDetails;
    return this;
  }

  /**
   * Output only. Resource name of the Connector. Format:
   * projects/{project}/locations/{location}/providers/{provider}/connectors/{connector} Only global
   * location is supported for Connector resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of the Connector. Format:
   * projects/{project}/locations/{location}/providers/{provider}/connectors/{connector} Only global
   * location is supported for Connector resource.
   * @param name name or {@code null} for none
   */
  public Connector setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Tags of the connector.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTags() {
    return tags;
  }

  /**
   * Output only. Tags of the connector.
   * @param tags tags or {@code null} for none
   */
  public Connector setTags(java.util.List<java.lang.String> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Output only. Updated time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Updated time.
   * @param updateTime updateTime or {@code null} for none
   */
  public Connector setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Output only. Cloud storage location of icons etc consumed by UI.
   * @return value or {@code null} for none
   */
  public java.lang.String getWebAssetsLocation() {
    return webAssetsLocation;
  }

  /**
   * Output only. Cloud storage location of icons etc consumed by UI.
   * @param webAssetsLocation webAssetsLocation or {@code null} for none
   */
  public Connector setWebAssetsLocation(java.lang.String webAssetsLocation) {
    this.webAssetsLocation = webAssetsLocation;
    return this;
  }

  @Override
  public Connector set(String fieldName, Object value) {
    return (Connector) super.set(fieldName, value);
  }

  @Override
  public Connector clone() {
    return (Connector) super.clone();
  }

}
