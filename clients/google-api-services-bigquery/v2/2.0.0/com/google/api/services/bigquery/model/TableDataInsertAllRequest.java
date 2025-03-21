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

package com.google.api.services.bigquery.model;

/**
 * Request for sending a single streaming insert.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TableDataInsertAllRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Accept rows that contain values that do not match the schema. The unknown values are
   * ignored. Default is false, which treats unknown values as errors.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean ignoreUnknownValues;

  /**
   * Optional. The resource type of the response. The value is not checked at the backend.
   * Historically, it has been set to "bigquery#tableDataInsertAllRequest" but you are not required
   * to set it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Rows> rows;

  static {
    // hack to force ProGuard to consider Rows used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Rows.class);
  }

  /**
   * Optional. Insert all valid rows of a request, even if invalid rows exist. The default value is
   * false, which causes the entire request to fail if any invalid rows exist.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean skipInvalidRows;

  /**
   * Optional. If specified, treats the destination table as a base template, and inserts the rows
   * into an instance table named "{destination}{templateSuffix}". BigQuery will manage creation of
   * the instance table, using the schema of the base template table. See
   * https://cloud.google.com/bigquery/streaming-data-into-bigquery#template-tables for
   * considerations when working with templates tables.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String templateSuffix;

  /**
   * Optional. Unique request trace id. Used for debugging purposes only. It is case-sensitive,
   * limited to up to 36 ASCII characters. A UUID is recommended.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String traceId;

  /**
   * Optional. Accept rows that contain values that do not match the schema. The unknown values are
   * ignored. Default is false, which treats unknown values as errors.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIgnoreUnknownValues() {
    return ignoreUnknownValues;
  }

  /**
   * Optional. Accept rows that contain values that do not match the schema. The unknown values are
   * ignored. Default is false, which treats unknown values as errors.
   * @param ignoreUnknownValues ignoreUnknownValues or {@code null} for none
   */
  public TableDataInsertAllRequest setIgnoreUnknownValues(java.lang.Boolean ignoreUnknownValues) {
    this.ignoreUnknownValues = ignoreUnknownValues;
    return this;
  }

  /**
   * Optional. The resource type of the response. The value is not checked at the backend.
   * Historically, it has been set to "bigquery#tableDataInsertAllRequest" but you are not required
   * to set it.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Optional. The resource type of the response. The value is not checked at the backend.
   * Historically, it has been set to "bigquery#tableDataInsertAllRequest" but you are not required
   * to set it.
   * @param kind kind or {@code null} for none
   */
  public TableDataInsertAllRequest setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Rows> getRows() {
    return rows;
  }

  /**
   * @param rows rows or {@code null} for none
   */
  public TableDataInsertAllRequest setRows(java.util.List<Rows> rows) {
    this.rows = rows;
    return this;
  }

  /**
   * Optional. Insert all valid rows of a request, even if invalid rows exist. The default value is
   * false, which causes the entire request to fail if any invalid rows exist.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSkipInvalidRows() {
    return skipInvalidRows;
  }

  /**
   * Optional. Insert all valid rows of a request, even if invalid rows exist. The default value is
   * false, which causes the entire request to fail if any invalid rows exist.
   * @param skipInvalidRows skipInvalidRows or {@code null} for none
   */
  public TableDataInsertAllRequest setSkipInvalidRows(java.lang.Boolean skipInvalidRows) {
    this.skipInvalidRows = skipInvalidRows;
    return this;
  }

  /**
   * Optional. If specified, treats the destination table as a base template, and inserts the rows
   * into an instance table named "{destination}{templateSuffix}". BigQuery will manage creation of
   * the instance table, using the schema of the base template table. See
   * https://cloud.google.com/bigquery/streaming-data-into-bigquery#template-tables for
   * considerations when working with templates tables.
   * @return value or {@code null} for none
   */
  public java.lang.String getTemplateSuffix() {
    return templateSuffix;
  }

  /**
   * Optional. If specified, treats the destination table as a base template, and inserts the rows
   * into an instance table named "{destination}{templateSuffix}". BigQuery will manage creation of
   * the instance table, using the schema of the base template table. See
   * https://cloud.google.com/bigquery/streaming-data-into-bigquery#template-tables for
   * considerations when working with templates tables.
   * @param templateSuffix templateSuffix or {@code null} for none
   */
  public TableDataInsertAllRequest setTemplateSuffix(java.lang.String templateSuffix) {
    this.templateSuffix = templateSuffix;
    return this;
  }

  /**
   * Optional. Unique request trace id. Used for debugging purposes only. It is case-sensitive,
   * limited to up to 36 ASCII characters. A UUID is recommended.
   * @return value or {@code null} for none
   */
  public java.lang.String getTraceId() {
    return traceId;
  }

  /**
   * Optional. Unique request trace id. Used for debugging purposes only. It is case-sensitive,
   * limited to up to 36 ASCII characters. A UUID is recommended.
   * @param traceId traceId or {@code null} for none
   */
  public TableDataInsertAllRequest setTraceId(java.lang.String traceId) {
    this.traceId = traceId;
    return this;
  }

  @Override
  public TableDataInsertAllRequest set(String fieldName, Object value) {
    return (TableDataInsertAllRequest) super.set(fieldName, value);
  }

  @Override
  public TableDataInsertAllRequest clone() {
    return (TableDataInsertAllRequest) super.clone();
  }

  /**
   * Data for a single insertion row.
   */
  public static final class Rows extends com.google.api.client.json.GenericJson {

    /**
     * Insertion ID for best-effort deduplication. This feature is not recommended, and users seeking
     * stronger insertion semantics are encouraged to use other mechanisms such as the BigQuery Write
     * API.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String insertId;

    /**
     * Data for a single row.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.Map<String, java.lang.Object> json;

    /**
     * Insertion ID for best-effort deduplication. This feature is not recommended, and users seeking
     * stronger insertion semantics are encouraged to use other mechanisms such as the BigQuery Write
     * API.
     * @return value or {@code null} for none
     */
    public java.lang.String getInsertId() {
      return insertId;
    }

    /**
     * Insertion ID for best-effort deduplication. This feature is not recommended, and users seeking
     * stronger insertion semantics are encouraged to use other mechanisms such as the BigQuery Write
     * API.
     * @param insertId insertId or {@code null} for none
     */
    public Rows setInsertId(java.lang.String insertId) {
      this.insertId = insertId;
      return this;
    }

    /**
     * Data for a single row.
     * @return value or {@code null} for none
     */
    public java.util.Map<String, java.lang.Object> getJson() {
      return json;
    }

    /**
     * Data for a single row.
     * @param json json or {@code null} for none
     */
    public Rows setJson(java.util.Map<String, java.lang.Object> json) {
      this.json = json;
      return this;
    }

    @Override
    public Rows set(String fieldName, Object value) {
      return (Rows) super.set(fieldName, value);
    }

    @Override
    public Rows clone() {
      return (Rows) super.clone();
    }

  }

}
