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

package com.google.api.services.aiplatform.v1.model;

/**
 * Model definition for GoogleCloudAiplatformV1FeatureViewBigQuerySource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1FeatureViewBigQuerySource extends com.google.api.client.json.GenericJson {

  /**
   * Required. Columns to construct entity_id / row keys.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> entityIdColumns;

  /**
   * Required. The BigQuery view URI that will be materialized on each sync trigger based on
   * FeatureView.SyncConfig.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Required. Columns to construct entity_id / row keys.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEntityIdColumns() {
    return entityIdColumns;
  }

  /**
   * Required. Columns to construct entity_id / row keys.
   * @param entityIdColumns entityIdColumns or {@code null} for none
   */
  public GoogleCloudAiplatformV1FeatureViewBigQuerySource setEntityIdColumns(java.util.List<java.lang.String> entityIdColumns) {
    this.entityIdColumns = entityIdColumns;
    return this;
  }

  /**
   * Required. The BigQuery view URI that will be materialized on each sync trigger based on
   * FeatureView.SyncConfig.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Required. The BigQuery view URI that will be materialized on each sync trigger based on
   * FeatureView.SyncConfig.
   * @param uri uri or {@code null} for none
   */
  public GoogleCloudAiplatformV1FeatureViewBigQuerySource setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1FeatureViewBigQuerySource set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1FeatureViewBigQuerySource) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1FeatureViewBigQuerySource clone() {
    return (GoogleCloudAiplatformV1FeatureViewBigQuerySource) super.clone();
  }

}
