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

package com.google.api.services.alloydb.v1.model;

/**
 * A backup's position in a quantity-based retention queue, of backups with the same source cluster
 * and type, with length, retention, specified by the backup's retention policy. Once the position
 * is greater than the retention, the backup is eligible to be garbage collected. Example: 5 backups
 * from the same source cluster and type with a quantity-based retention of 3 and denoted by
 * backup_id (position, retention). Safe: backup_5 (1, 3), backup_4, (2, 3), backup_3 (3, 3).
 * Awaiting garbage collection: backup_2 (4, 3), backup_1 (5, 3)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AlloyDB API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QuantityBasedExpiry extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The backup's position among its backups with the same source cluster and type, by
   * descending chronological order create time(i.e. newest first).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer retentionCount;

  /**
   * Output only. The length of the quantity-based queue, specified by the backup's retention
   * policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalRetentionCount;

  /**
   * Output only. The backup's position among its backups with the same source cluster and type, by
   * descending chronological order create time(i.e. newest first).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRetentionCount() {
    return retentionCount;
  }

  /**
   * Output only. The backup's position among its backups with the same source cluster and type, by
   * descending chronological order create time(i.e. newest first).
   * @param retentionCount retentionCount or {@code null} for none
   */
  public QuantityBasedExpiry setRetentionCount(java.lang.Integer retentionCount) {
    this.retentionCount = retentionCount;
    return this;
  }

  /**
   * Output only. The length of the quantity-based queue, specified by the backup's retention
   * policy.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalRetentionCount() {
    return totalRetentionCount;
  }

  /**
   * Output only. The length of the quantity-based queue, specified by the backup's retention
   * policy.
   * @param totalRetentionCount totalRetentionCount or {@code null} for none
   */
  public QuantityBasedExpiry setTotalRetentionCount(java.lang.Integer totalRetentionCount) {
    this.totalRetentionCount = totalRetentionCount;
    return this;
  }

  @Override
  public QuantityBasedExpiry set(String fieldName, Object value) {
    return (QuantityBasedExpiry) super.set(fieldName, value);
  }

  @Override
  public QuantityBasedExpiry clone() {
    return (QuantityBasedExpiry) super.clone();
  }

}
