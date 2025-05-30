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

package com.google.api.services.spanner.v1.model;

/**
 * The split points of a table or an index.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SplitPoints extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The expiration timestamp of the split points. A timestamp in the past means immediate
   * expiration. The maximum value can be 30 days in the future. Defaults to 10 days in the future
   * if not specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expireTime;

  /**
   * The index to split. If specified, the `table` field must refer to the index's base table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String index;

  /**
   * Required. The list of split keys. In essence, the split boundaries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Key> keys;

  static {
    // hack to force ProGuard to consider Key used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Key.class);
  }

  /**
   * The table to split.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String table;

  /**
   * Optional. The expiration timestamp of the split points. A timestamp in the past means immediate
   * expiration. The maximum value can be 30 days in the future. Defaults to 10 days in the future
   * if not specified.
   * @return value or {@code null} for none
   */
  public String getExpireTime() {
    return expireTime;
  }

  /**
   * Optional. The expiration timestamp of the split points. A timestamp in the past means immediate
   * expiration. The maximum value can be 30 days in the future. Defaults to 10 days in the future
   * if not specified.
   * @param expireTime expireTime or {@code null} for none
   */
  public SplitPoints setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  /**
   * The index to split. If specified, the `table` field must refer to the index's base table.
   * @return value or {@code null} for none
   */
  public java.lang.String getIndex() {
    return index;
  }

  /**
   * The index to split. If specified, the `table` field must refer to the index's base table.
   * @param index index or {@code null} for none
   */
  public SplitPoints setIndex(java.lang.String index) {
    this.index = index;
    return this;
  }

  /**
   * Required. The list of split keys. In essence, the split boundaries.
   * @return value or {@code null} for none
   */
  public java.util.List<Key> getKeys() {
    return keys;
  }

  /**
   * Required. The list of split keys. In essence, the split boundaries.
   * @param keys keys or {@code null} for none
   */
  public SplitPoints setKeys(java.util.List<Key> keys) {
    this.keys = keys;
    return this;
  }

  /**
   * The table to split.
   * @return value or {@code null} for none
   */
  public java.lang.String getTable() {
    return table;
  }

  /**
   * The table to split.
   * @param table table or {@code null} for none
   */
  public SplitPoints setTable(java.lang.String table) {
    this.table = table;
    return this;
  }

  @Override
  public SplitPoints set(String fieldName, Object value) {
    return (SplitPoints) super.set(fieldName, value);
  }

  @Override
  public SplitPoints clone() {
    return (SplitPoints) super.clone();
  }

}
