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

package com.google.api.services.container.model;

/**
 * UserManagedKeysConfig holds the resource address to Keys which are used for signing certs and
 * token that are used for communication within cluster.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UserManagedKeysConfig extends com.google.api.client.json.GenericJson {

  /**
   * The Certificate Authority Service caPool to use for the aggregation CA in this cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String aggregationCa;

  /**
   * The Certificate Authority Service caPool to use for the cluster CA in this cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterCa;

  /**
   * The Cloud KMS cryptoKey to use for Confidential Hyperdisk on the control plane nodes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String controlPlaneDiskEncryptionKey;

  /**
   * Resource path of the Certificate Authority Service caPool to use for the etcd API CA in this
   * cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etcdApiCa;

  /**
   * Resource path of the Certificate Authority Service caPool to use for the etcd peer CA in this
   * cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etcdPeerCa;

  /**
   * Resource path of the Cloud KMS cryptoKey to use for encryption of internal etcd backups.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gkeopsEtcdBackupEncryptionKey;

  /**
   * The Cloud KMS cryptoKeyVersions to use for signing service account JWTs issued by this cluster.
   * Format: `projects/{project}/locations/{location}/keyRings/{keyring}/cryptoKeys/{cryptoKey}/cryp
   * toKeyVersions/{cryptoKeyVersion}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> serviceAccountSigningKeys;

  /**
   * The Cloud KMS cryptoKeyVersions to use for verifying service account JWTs issued by this
   * cluster. Format: `projects/{project}/locations/{location}/keyRings/{keyring}/cryptoKeys/{crypto
   * Key}/cryptoKeyVersions/{cryptoKeyVersion}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> serviceAccountVerificationKeys;

  /**
   * The Certificate Authority Service caPool to use for the aggregation CA in this cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getAggregationCa() {
    return aggregationCa;
  }

  /**
   * The Certificate Authority Service caPool to use for the aggregation CA in this cluster.
   * @param aggregationCa aggregationCa or {@code null} for none
   */
  public UserManagedKeysConfig setAggregationCa(java.lang.String aggregationCa) {
    this.aggregationCa = aggregationCa;
    return this;
  }

  /**
   * The Certificate Authority Service caPool to use for the cluster CA in this cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterCa() {
    return clusterCa;
  }

  /**
   * The Certificate Authority Service caPool to use for the cluster CA in this cluster.
   * @param clusterCa clusterCa or {@code null} for none
   */
  public UserManagedKeysConfig setClusterCa(java.lang.String clusterCa) {
    this.clusterCa = clusterCa;
    return this;
  }

  /**
   * The Cloud KMS cryptoKey to use for Confidential Hyperdisk on the control plane nodes.
   * @return value or {@code null} for none
   */
  public java.lang.String getControlPlaneDiskEncryptionKey() {
    return controlPlaneDiskEncryptionKey;
  }

  /**
   * The Cloud KMS cryptoKey to use for Confidential Hyperdisk on the control plane nodes.
   * @param controlPlaneDiskEncryptionKey controlPlaneDiskEncryptionKey or {@code null} for none
   */
  public UserManagedKeysConfig setControlPlaneDiskEncryptionKey(java.lang.String controlPlaneDiskEncryptionKey) {
    this.controlPlaneDiskEncryptionKey = controlPlaneDiskEncryptionKey;
    return this;
  }

  /**
   * Resource path of the Certificate Authority Service caPool to use for the etcd API CA in this
   * cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtcdApiCa() {
    return etcdApiCa;
  }

  /**
   * Resource path of the Certificate Authority Service caPool to use for the etcd API CA in this
   * cluster.
   * @param etcdApiCa etcdApiCa or {@code null} for none
   */
  public UserManagedKeysConfig setEtcdApiCa(java.lang.String etcdApiCa) {
    this.etcdApiCa = etcdApiCa;
    return this;
  }

  /**
   * Resource path of the Certificate Authority Service caPool to use for the etcd peer CA in this
   * cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtcdPeerCa() {
    return etcdPeerCa;
  }

  /**
   * Resource path of the Certificate Authority Service caPool to use for the etcd peer CA in this
   * cluster.
   * @param etcdPeerCa etcdPeerCa or {@code null} for none
   */
  public UserManagedKeysConfig setEtcdPeerCa(java.lang.String etcdPeerCa) {
    this.etcdPeerCa = etcdPeerCa;
    return this;
  }

  /**
   * Resource path of the Cloud KMS cryptoKey to use for encryption of internal etcd backups.
   * @return value or {@code null} for none
   */
  public java.lang.String getGkeopsEtcdBackupEncryptionKey() {
    return gkeopsEtcdBackupEncryptionKey;
  }

  /**
   * Resource path of the Cloud KMS cryptoKey to use for encryption of internal etcd backups.
   * @param gkeopsEtcdBackupEncryptionKey gkeopsEtcdBackupEncryptionKey or {@code null} for none
   */
  public UserManagedKeysConfig setGkeopsEtcdBackupEncryptionKey(java.lang.String gkeopsEtcdBackupEncryptionKey) {
    this.gkeopsEtcdBackupEncryptionKey = gkeopsEtcdBackupEncryptionKey;
    return this;
  }

  /**
   * The Cloud KMS cryptoKeyVersions to use for signing service account JWTs issued by this cluster.
   * Format: `projects/{project}/locations/{location}/keyRings/{keyring}/cryptoKeys/{cryptoKey}/cryp
   * toKeyVersions/{cryptoKeyVersion}`
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getServiceAccountSigningKeys() {
    return serviceAccountSigningKeys;
  }

  /**
   * The Cloud KMS cryptoKeyVersions to use for signing service account JWTs issued by this cluster.
   * Format: `projects/{project}/locations/{location}/keyRings/{keyring}/cryptoKeys/{cryptoKey}/cryp
   * toKeyVersions/{cryptoKeyVersion}`
   * @param serviceAccountSigningKeys serviceAccountSigningKeys or {@code null} for none
   */
  public UserManagedKeysConfig setServiceAccountSigningKeys(java.util.List<java.lang.String> serviceAccountSigningKeys) {
    this.serviceAccountSigningKeys = serviceAccountSigningKeys;
    return this;
  }

  /**
   * The Cloud KMS cryptoKeyVersions to use for verifying service account JWTs issued by this
   * cluster. Format: `projects/{project}/locations/{location}/keyRings/{keyring}/cryptoKeys/{crypto
   * Key}/cryptoKeyVersions/{cryptoKeyVersion}`
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getServiceAccountVerificationKeys() {
    return serviceAccountVerificationKeys;
  }

  /**
   * The Cloud KMS cryptoKeyVersions to use for verifying service account JWTs issued by this
   * cluster. Format: `projects/{project}/locations/{location}/keyRings/{keyring}/cryptoKeys/{crypto
   * Key}/cryptoKeyVersions/{cryptoKeyVersion}`
   * @param serviceAccountVerificationKeys serviceAccountVerificationKeys or {@code null} for none
   */
  public UserManagedKeysConfig setServiceAccountVerificationKeys(java.util.List<java.lang.String> serviceAccountVerificationKeys) {
    this.serviceAccountVerificationKeys = serviceAccountVerificationKeys;
    return this;
  }

  @Override
  public UserManagedKeysConfig set(String fieldName, Object value) {
    return (UserManagedKeysConfig) super.set(fieldName, value);
  }

  @Override
  public UserManagedKeysConfig clone() {
    return (UserManagedKeysConfig) super.clone();
  }

}
