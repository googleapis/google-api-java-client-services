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
 * The CCAI Insights project wide analysis rule. This rule will be applied to all conversations that
 * match the filter defined in the rule. For a conversation matches the filter, the annotators
 * specified in the rule will be run. If a conversation matches multiple rules, a union of all the
 * annotators will be run. One project can have multiple analysis rules.
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
public final class GoogleCloudContactcenterinsightsV1AnalysisRule extends com.google.api.client.json.GenericJson {

  /**
   * If true, apply this rule to conversations. Otherwise, this rule is inactive and saved as a
   * draft.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean active;

  /**
   * Percentage of conversations that we should apply this analysis setting automatically, between
   * [0, 1]. For example, 0.1 means 10%. Conversations are sampled in a determenestic way. The
   * original runtime_percentage & upload percentage will be replaced by defining filters on the
   * conversation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double analysisPercentage;

  /**
   * Selector of annotators to run and the phrase matchers to use for conversations that matches the
   * conversation_filter. If not specified, NO annotators will be run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContactcenterinsightsV1AnnotatorSelector annotatorSelector;

  /**
   * Filter for the conversations that should apply this analysis rule. An empty filter means this
   * analysis rule applies to all conversations. Refer to https://cloud.google.com/contact-
   * center/insights/docs/filtering for details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String conversationFilter;

  /**
   * Output only. The time at which this analysis rule was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Display Name of the analysis rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Identifier. The resource name of the analysis rule. Format:
   * projects/{project}/locations/{location}/analysisRules/{analysis_rule}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The most recent time at which this analysis rule was updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * If true, apply this rule to conversations. Otherwise, this rule is inactive and saved as a
   * draft.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getActive() {
    return active;
  }

  /**
   * If true, apply this rule to conversations. Otherwise, this rule is inactive and saved as a
   * draft.
   * @param active active or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1AnalysisRule setActive(java.lang.Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Percentage of conversations that we should apply this analysis setting automatically, between
   * [0, 1]. For example, 0.1 means 10%. Conversations are sampled in a determenestic way. The
   * original runtime_percentage & upload percentage will be replaced by defining filters on the
   * conversation.
   * @return value or {@code null} for none
   */
  public java.lang.Double getAnalysisPercentage() {
    return analysisPercentage;
  }

  /**
   * Percentage of conversations that we should apply this analysis setting automatically, between
   * [0, 1]. For example, 0.1 means 10%. Conversations are sampled in a determenestic way. The
   * original runtime_percentage & upload percentage will be replaced by defining filters on the
   * conversation.
   * @param analysisPercentage analysisPercentage or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1AnalysisRule setAnalysisPercentage(java.lang.Double analysisPercentage) {
    this.analysisPercentage = analysisPercentage;
    return this;
  }

  /**
   * Selector of annotators to run and the phrase matchers to use for conversations that matches the
   * conversation_filter. If not specified, NO annotators will be run.
   * @return value or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1AnnotatorSelector getAnnotatorSelector() {
    return annotatorSelector;
  }

  /**
   * Selector of annotators to run and the phrase matchers to use for conversations that matches the
   * conversation_filter. If not specified, NO annotators will be run.
   * @param annotatorSelector annotatorSelector or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1AnalysisRule setAnnotatorSelector(GoogleCloudContactcenterinsightsV1AnnotatorSelector annotatorSelector) {
    this.annotatorSelector = annotatorSelector;
    return this;
  }

  /**
   * Filter for the conversations that should apply this analysis rule. An empty filter means this
   * analysis rule applies to all conversations. Refer to https://cloud.google.com/contact-
   * center/insights/docs/filtering for details.
   * @return value or {@code null} for none
   */
  public java.lang.String getConversationFilter() {
    return conversationFilter;
  }

  /**
   * Filter for the conversations that should apply this analysis rule. An empty filter means this
   * analysis rule applies to all conversations. Refer to https://cloud.google.com/contact-
   * center/insights/docs/filtering for details.
   * @param conversationFilter conversationFilter or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1AnalysisRule setConversationFilter(java.lang.String conversationFilter) {
    this.conversationFilter = conversationFilter;
    return this;
  }

  /**
   * Output only. The time at which this analysis rule was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time at which this analysis rule was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1AnalysisRule setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Display Name of the analysis rule.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Display Name of the analysis rule.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1AnalysisRule setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Identifier. The resource name of the analysis rule. Format:
   * projects/{project}/locations/{location}/analysisRules/{analysis_rule}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The resource name of the analysis rule. Format:
   * projects/{project}/locations/{location}/analysisRules/{analysis_rule}
   * @param name name or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1AnalysisRule setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The most recent time at which this analysis rule was updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The most recent time at which this analysis rule was updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1AnalysisRule setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1AnalysisRule set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1AnalysisRule) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1AnalysisRule clone() {
    return (GoogleCloudContactcenterinsightsV1AnalysisRule) super.clone();
  }

}
