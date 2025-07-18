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

package com.google.api.services.discoveryengine.v1alpha.model;

/**
 * Describes general widget (or web app) UI settings as seen in the cloud console UI configuration
 * page.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1alphaWidgetConfigUiSettings extends com.google.api.client.json.GenericJson {

  /**
   * Per data store configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDiscoveryengineV1alphaWidgetConfigDataStoreUiConfig> dataStoreUiConfigs;

  static {
    // hack to force ProGuard to consider GoogleCloudDiscoveryengineV1alphaWidgetConfigDataStoreUiConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDiscoveryengineV1alphaWidgetConfigDataStoreUiConfig.class);
  }

  /**
   * The default ordering for search results if specified. Used to set SearchRequest#order_by on
   * applicable requests. https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1a
   * lpha/projects.locations.dataStores.servingConfigs/search#request-body
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultSearchRequestOrderBy;

  /**
   * If set to true, the widget will not collect user events.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableUserEventsCollection;

  /**
   * Whether or not to enable autocomplete.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableAutocomplete;

  /**
   * Optional. If set to true, the widget will enable people search.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enablePeopleSearch;

  /**
   * Turn on or off collecting the search result quality feedback from end users.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableQualityFeedback;

  /**
   * Whether to enable safe search.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableSafeSearch;

  /**
   * Whether to enable search-as-you-type behavior for the search widget.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableSearchAsYouType;

  /**
   * If set to true, the widget will enable visual content summary on applicable search requests.
   * Only used by healthcare search.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableVisualContentSummary;

  /**
   * Output only. Feature config for the engine to opt in or opt out of features. Supported keys: *
   * `agent-gallery` * `no-code-agent-builder` * `prompt-gallery` * `model-selector` * `notebook-lm`
   * * `people-search` * `people-search-org-chart` * `bi-directional-audio` * `feedback` * `session-
   * sharing` * `personalization-memory` - Enables personalization based on user preferences.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> features;

  /**
   * Describes generative answer configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaWidgetConfigUiSettingsGenerativeAnswerConfig generativeAnswerConfig;

  /**
   * Describes widget (or web app) interaction type
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String interactionType;

  /**
   * Controls whether result extract is display and how (snippet or extractive answer). Default to
   * no result if unspecified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resultDescriptionType;

  /**
   * Per data store configuration.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDiscoveryengineV1alphaWidgetConfigDataStoreUiConfig> getDataStoreUiConfigs() {
    return dataStoreUiConfigs;
  }

  /**
   * Per data store configuration.
   * @param dataStoreUiConfigs dataStoreUiConfigs or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaWidgetConfigUiSettings setDataStoreUiConfigs(java.util.List<GoogleCloudDiscoveryengineV1alphaWidgetConfigDataStoreUiConfig> dataStoreUiConfigs) {
    this.dataStoreUiConfigs = dataStoreUiConfigs;
    return this;
  }

  /**
   * The default ordering for search results if specified. Used to set SearchRequest#order_by on
   * applicable requests. https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1a
   * lpha/projects.locations.dataStores.servingConfigs/search#request-body
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultSearchRequestOrderBy() {
    return defaultSearchRequestOrderBy;
  }

  /**
   * The default ordering for search results if specified. Used to set SearchRequest#order_by on
   * applicable requests. https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1a
   * lpha/projects.locations.dataStores.servingConfigs/search#request-body
   * @param defaultSearchRequestOrderBy defaultSearchRequestOrderBy or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaWidgetConfigUiSettings setDefaultSearchRequestOrderBy(java.lang.String defaultSearchRequestOrderBy) {
    this.defaultSearchRequestOrderBy = defaultSearchRequestOrderBy;
    return this;
  }

  /**
   * If set to true, the widget will not collect user events.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableUserEventsCollection() {
    return disableUserEventsCollection;
  }

  /**
   * If set to true, the widget will not collect user events.
   * @param disableUserEventsCollection disableUserEventsCollection or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaWidgetConfigUiSettings setDisableUserEventsCollection(java.lang.Boolean disableUserEventsCollection) {
    this.disableUserEventsCollection = disableUserEventsCollection;
    return this;
  }

  /**
   * Whether or not to enable autocomplete.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableAutocomplete() {
    return enableAutocomplete;
  }

  /**
   * Whether or not to enable autocomplete.
   * @param enableAutocomplete enableAutocomplete or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaWidgetConfigUiSettings setEnableAutocomplete(java.lang.Boolean enableAutocomplete) {
    this.enableAutocomplete = enableAutocomplete;
    return this;
  }

  /**
   * Optional. If set to true, the widget will enable people search.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnablePeopleSearch() {
    return enablePeopleSearch;
  }

  /**
   * Optional. If set to true, the widget will enable people search.
   * @param enablePeopleSearch enablePeopleSearch or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaWidgetConfigUiSettings setEnablePeopleSearch(java.lang.Boolean enablePeopleSearch) {
    this.enablePeopleSearch = enablePeopleSearch;
    return this;
  }

  /**
   * Turn on or off collecting the search result quality feedback from end users.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableQualityFeedback() {
    return enableQualityFeedback;
  }

  /**
   * Turn on or off collecting the search result quality feedback from end users.
   * @param enableQualityFeedback enableQualityFeedback or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaWidgetConfigUiSettings setEnableQualityFeedback(java.lang.Boolean enableQualityFeedback) {
    this.enableQualityFeedback = enableQualityFeedback;
    return this;
  }

  /**
   * Whether to enable safe search.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableSafeSearch() {
    return enableSafeSearch;
  }

  /**
   * Whether to enable safe search.
   * @param enableSafeSearch enableSafeSearch or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaWidgetConfigUiSettings setEnableSafeSearch(java.lang.Boolean enableSafeSearch) {
    this.enableSafeSearch = enableSafeSearch;
    return this;
  }

  /**
   * Whether to enable search-as-you-type behavior for the search widget.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableSearchAsYouType() {
    return enableSearchAsYouType;
  }

  /**
   * Whether to enable search-as-you-type behavior for the search widget.
   * @param enableSearchAsYouType enableSearchAsYouType or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaWidgetConfigUiSettings setEnableSearchAsYouType(java.lang.Boolean enableSearchAsYouType) {
    this.enableSearchAsYouType = enableSearchAsYouType;
    return this;
  }

  /**
   * If set to true, the widget will enable visual content summary on applicable search requests.
   * Only used by healthcare search.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableVisualContentSummary() {
    return enableVisualContentSummary;
  }

  /**
   * If set to true, the widget will enable visual content summary on applicable search requests.
   * Only used by healthcare search.
   * @param enableVisualContentSummary enableVisualContentSummary or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaWidgetConfigUiSettings setEnableVisualContentSummary(java.lang.Boolean enableVisualContentSummary) {
    this.enableVisualContentSummary = enableVisualContentSummary;
    return this;
  }

  /**
   * Output only. Feature config for the engine to opt in or opt out of features. Supported keys: *
   * `agent-gallery` * `no-code-agent-builder` * `prompt-gallery` * `model-selector` * `notebook-lm`
   * * `people-search` * `people-search-org-chart` * `bi-directional-audio` * `feedback` * `session-
   * sharing` * `personalization-memory` - Enables personalization based on user preferences.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getFeatures() {
    return features;
  }

  /**
   * Output only. Feature config for the engine to opt in or opt out of features. Supported keys: *
   * `agent-gallery` * `no-code-agent-builder` * `prompt-gallery` * `model-selector` * `notebook-lm`
   * * `people-search` * `people-search-org-chart` * `bi-directional-audio` * `feedback` * `session-
   * sharing` * `personalization-memory` - Enables personalization based on user preferences.
   * @param features features or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaWidgetConfigUiSettings setFeatures(java.util.Map<String, java.lang.String> features) {
    this.features = features;
    return this;
  }

  /**
   * Describes generative answer configuration.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaWidgetConfigUiSettingsGenerativeAnswerConfig getGenerativeAnswerConfig() {
    return generativeAnswerConfig;
  }

  /**
   * Describes generative answer configuration.
   * @param generativeAnswerConfig generativeAnswerConfig or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaWidgetConfigUiSettings setGenerativeAnswerConfig(GoogleCloudDiscoveryengineV1alphaWidgetConfigUiSettingsGenerativeAnswerConfig generativeAnswerConfig) {
    this.generativeAnswerConfig = generativeAnswerConfig;
    return this;
  }

  /**
   * Describes widget (or web app) interaction type
   * @return value or {@code null} for none
   */
  public java.lang.String getInteractionType() {
    return interactionType;
  }

  /**
   * Describes widget (or web app) interaction type
   * @param interactionType interactionType or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaWidgetConfigUiSettings setInteractionType(java.lang.String interactionType) {
    this.interactionType = interactionType;
    return this;
  }

  /**
   * Controls whether result extract is display and how (snippet or extractive answer). Default to
   * no result if unspecified.
   * @return value or {@code null} for none
   */
  public java.lang.String getResultDescriptionType() {
    return resultDescriptionType;
  }

  /**
   * Controls whether result extract is display and how (snippet or extractive answer). Default to
   * no result if unspecified.
   * @param resultDescriptionType resultDescriptionType or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaWidgetConfigUiSettings setResultDescriptionType(java.lang.String resultDescriptionType) {
    this.resultDescriptionType = resultDescriptionType;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaWidgetConfigUiSettings set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1alphaWidgetConfigUiSettings) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaWidgetConfigUiSettings clone() {
    return (GoogleCloudDiscoveryengineV1alphaWidgetConfigUiSettings) super.clone();
  }

}
