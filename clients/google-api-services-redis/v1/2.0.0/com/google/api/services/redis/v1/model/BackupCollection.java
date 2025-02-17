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

package com.google.api.services.redis.v1.model;

/**
 * BackupCollection of a cluster.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Memorystore for Redis API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BackupCollection extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The full resource path of the cluster the backup collection belongs to. Example:
   * projects/{project}/locations/{location}/clusters/{cluster}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cluster;

  /**
   * Output only. The cluster uid of the backup collection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterUid;

  /**
   * Output only. The time when the backup collection was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The KMS key used to encrypt the backups under this backup collection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsKey;

  /**
   * Identifier. Full resource path of the backup collection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. System assigned unique identifier of the backup collection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * Output only. The full resource path of the cluster the backup collection belongs to. Example:
   * projects/{project}/locations/{location}/clusters/{cluster}
   * @return value or {@code null} for none
   */
  public java.lang.String getCluster() {
    return cluster;
  }

  /**
   * Output only. The full resource path of the cluster the backup collection belongs to. Example:
   * projects/{project}/locations/{location}/clusters/{cluster}
   * @param cluster cluster or {@code null} for none
   */
  public BackupCollection setCluster(java.lang.String cluster) {
    this.cluster = cluster;
    return this;
  }

  /**
   * Output only. The cluster uid of the backup collection.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterUid() {
    return clusterUid;
  }

  /**
   * Output only. The cluster uid of the backup collection.
   * @param clusterUid clusterUid or {@code null} for none
   */
  public BackupCollection setClusterUid(java.lang.String clusterUid) {
    this.clusterUid = clusterUid;
    return this;
  }

  /**
   * Output only. The time when the backup collection was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time when the backup collection was created.
   * @param createTime createTime or {@code null} for none
   */
  public BackupCollection setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The KMS key used to encrypt the backups under this backup collection.
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsKey() {
    return kmsKey;
  }

  /**
   * Output only. The KMS key used to encrypt the backups under this backup collection.
   * @param kmsKey kmsKey or {@code null} for none
   */
  public BackupCollection setKmsKey(java.lang.String kmsKey) {
    this.kmsKey = kmsKey;
    return this;
  }

  /**
   * Identifier. Full resource path of the backup collection.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. Full resource path of the backup collection.
   * @param name name or {@code null} for none
   */
  public BackupCollection setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. System assigned unique identifier of the backup collection.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Output only. System assigned unique identifier of the backup collection.
   * @param uid uid or {@code null} for none
   */
  public BackupCollection setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  @Override
  public BackupCollection set(String fieldName, Object value) {
    return (BackupCollection) super.set(fieldName, value);
  }

  @Override
  public BackupCollection clone() {
    return (BackupCollection) super.clone();
  }

}
