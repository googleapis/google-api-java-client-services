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

package com.google.api.services.aiplatform.v1beta1.model;

/**
 * SlackChannels contains the Slack channels and corresponding access token.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1SlackSourceSlackChannels extends com.google.api.client.json.GenericJson {

  /**
   * Required. The SecretManager secret version resource name (e.g.
   * projects/{project}/secrets/{secret}/versions/{version}) storing the Slack channel access token
   * that has access to the slack channel IDs. See: https://api.slack.com/tutorials/tracks/getting-
   * a-token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1ApiAuthApiKeyConfig apiKeyConfig;

  /**
   * Required. The Slack channel IDs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAiplatformV1beta1SlackSourceSlackChannelsSlackChannel> channels;

  /**
   * Required. The SecretManager secret version resource name (e.g.
   * projects/{project}/secrets/{secret}/versions/{version}) storing the Slack channel access token
   * that has access to the slack channel IDs. See: https://api.slack.com/tutorials/tracks/getting-
   * a-token.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ApiAuthApiKeyConfig getApiKeyConfig() {
    return apiKeyConfig;
  }

  /**
   * Required. The SecretManager secret version resource name (e.g.
   * projects/{project}/secrets/{secret}/versions/{version}) storing the Slack channel access token
   * that has access to the slack channel IDs. See: https://api.slack.com/tutorials/tracks/getting-
   * a-token.
   * @param apiKeyConfig apiKeyConfig or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SlackSourceSlackChannels setApiKeyConfig(GoogleCloudAiplatformV1beta1ApiAuthApiKeyConfig apiKeyConfig) {
    this.apiKeyConfig = apiKeyConfig;
    return this;
  }

  /**
   * Required. The Slack channel IDs.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAiplatformV1beta1SlackSourceSlackChannelsSlackChannel> getChannels() {
    return channels;
  }

  /**
   * Required. The Slack channel IDs.
   * @param channels channels or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SlackSourceSlackChannels setChannels(java.util.List<GoogleCloudAiplatformV1beta1SlackSourceSlackChannelsSlackChannel> channels) {
    this.channels = channels;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1SlackSourceSlackChannels set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1SlackSourceSlackChannels) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1SlackSourceSlackChannels clone() {
    return (GoogleCloudAiplatformV1beta1SlackSourceSlackChannels) super.clone();
  }

}
