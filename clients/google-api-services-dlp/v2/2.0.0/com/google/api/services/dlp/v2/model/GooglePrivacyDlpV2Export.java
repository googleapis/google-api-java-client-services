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

package com.google.api.services.dlp.v2.model;

/**
 * If set, the detailed data profiles will be persisted to the location of your choice whenever
 * updated.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Sensitive Data Protection (DLP). For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2Export extends com.google.api.client.json.GenericJson {

  /**
   * Store all profiles to BigQuery. * The system will create a new dataset and table for you if
   * none are are provided. The dataset will be named `sensitive_data_protection_discovery` and
   * table will be named `discovery_profiles`. This table will be placed in the same project as the
   * container project running the scan. After the first profile is generated and the dataset and
   * table are created, the discovery scan configuration will be updated with the dataset and table
   * names. * See [Analyze data profiles stored in BigQuery](https://cloud.google.com/sensitive-
   * data-protection/docs/analyze-data-profiles). * See [Sample queries for your BigQuery
   * table](https://cloud.google.com/sensitive-data-protection/docs/analyze-data-
   * profiles#sample_sql_queries). * Data is inserted using [streaming
   * insert](https://cloud.google.com/blog/products/bigquery/life-of-a-bigquery-streaming-insert)
   * and so data may be in the buffer for a period of time after the profile has finished. * The
   * Pub/Sub notification is sent before the streaming buffer is guaranteed to be written, so data
   * may not be instantly visible to queries by the time your topic receives the Pub/Sub
   * notification. * The best practice is to use the same table for an entire organization so that
   * you can take advantage of the [provided Looker reports](https://cloud.google.com/sensitive-
   * data-protection/docs/analyze-data-profiles#use_a_premade_report). If you use VPC Service
   * Controls to define security perimeters, then you must use a separate table for each boundary.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2BigQueryTable profileTable;

  /**
   * Store sample data profile findings in an existing table or a new table in an existing dataset.
   * Each regeneration will result in new rows in BigQuery. Data is inserted using [streaming
   * insert](https://cloud.google.com/blog/products/bigquery/life-of-a-bigquery-streaming-insert)
   * and so data may be in the buffer for a period of time after the profile has finished.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2BigQueryTable sampleFindingsTable;

  /**
   * Store all profiles to BigQuery. * The system will create a new dataset and table for you if
   * none are are provided. The dataset will be named `sensitive_data_protection_discovery` and
   * table will be named `discovery_profiles`. This table will be placed in the same project as the
   * container project running the scan. After the first profile is generated and the dataset and
   * table are created, the discovery scan configuration will be updated with the dataset and table
   * names. * See [Analyze data profiles stored in BigQuery](https://cloud.google.com/sensitive-
   * data-protection/docs/analyze-data-profiles). * See [Sample queries for your BigQuery
   * table](https://cloud.google.com/sensitive-data-protection/docs/analyze-data-
   * profiles#sample_sql_queries). * Data is inserted using [streaming
   * insert](https://cloud.google.com/blog/products/bigquery/life-of-a-bigquery-streaming-insert)
   * and so data may be in the buffer for a period of time after the profile has finished. * The
   * Pub/Sub notification is sent before the streaming buffer is guaranteed to be written, so data
   * may not be instantly visible to queries by the time your topic receives the Pub/Sub
   * notification. * The best practice is to use the same table for an entire organization so that
   * you can take advantage of the [provided Looker reports](https://cloud.google.com/sensitive-
   * data-protection/docs/analyze-data-profiles#use_a_premade_report). If you use VPC Service
   * Controls to define security perimeters, then you must use a separate table for each boundary.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2BigQueryTable getProfileTable() {
    return profileTable;
  }

  /**
   * Store all profiles to BigQuery. * The system will create a new dataset and table for you if
   * none are are provided. The dataset will be named `sensitive_data_protection_discovery` and
   * table will be named `discovery_profiles`. This table will be placed in the same project as the
   * container project running the scan. After the first profile is generated and the dataset and
   * table are created, the discovery scan configuration will be updated with the dataset and table
   * names. * See [Analyze data profiles stored in BigQuery](https://cloud.google.com/sensitive-
   * data-protection/docs/analyze-data-profiles). * See [Sample queries for your BigQuery
   * table](https://cloud.google.com/sensitive-data-protection/docs/analyze-data-
   * profiles#sample_sql_queries). * Data is inserted using [streaming
   * insert](https://cloud.google.com/blog/products/bigquery/life-of-a-bigquery-streaming-insert)
   * and so data may be in the buffer for a period of time after the profile has finished. * The
   * Pub/Sub notification is sent before the streaming buffer is guaranteed to be written, so data
   * may not be instantly visible to queries by the time your topic receives the Pub/Sub
   * notification. * The best practice is to use the same table for an entire organization so that
   * you can take advantage of the [provided Looker reports](https://cloud.google.com/sensitive-
   * data-protection/docs/analyze-data-profiles#use_a_premade_report). If you use VPC Service
   * Controls to define security perimeters, then you must use a separate table for each boundary.
   * @param profileTable profileTable or {@code null} for none
   */
  public GooglePrivacyDlpV2Export setProfileTable(GooglePrivacyDlpV2BigQueryTable profileTable) {
    this.profileTable = profileTable;
    return this;
  }

  /**
   * Store sample data profile findings in an existing table or a new table in an existing dataset.
   * Each regeneration will result in new rows in BigQuery. Data is inserted using [streaming
   * insert](https://cloud.google.com/blog/products/bigquery/life-of-a-bigquery-streaming-insert)
   * and so data may be in the buffer for a period of time after the profile has finished.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2BigQueryTable getSampleFindingsTable() {
    return sampleFindingsTable;
  }

  /**
   * Store sample data profile findings in an existing table or a new table in an existing dataset.
   * Each regeneration will result in new rows in BigQuery. Data is inserted using [streaming
   * insert](https://cloud.google.com/blog/products/bigquery/life-of-a-bigquery-streaming-insert)
   * and so data may be in the buffer for a period of time after the profile has finished.
   * @param sampleFindingsTable sampleFindingsTable or {@code null} for none
   */
  public GooglePrivacyDlpV2Export setSampleFindingsTable(GooglePrivacyDlpV2BigQueryTable sampleFindingsTable) {
    this.sampleFindingsTable = sampleFindingsTable;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2Export set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2Export) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2Export clone() {
    return (GooglePrivacyDlpV2Export) super.clone();
  }

}
