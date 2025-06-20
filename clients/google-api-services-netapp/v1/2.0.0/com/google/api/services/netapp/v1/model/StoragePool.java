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

package com.google.api.services.netapp.v1.model;

/**
 * StoragePool is a container for volumes with a service level and capacity. Volumes can be created
 * in a pool of sufficient available capacity. StoragePool capacity is what you are billed for.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the NetApp API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StoragePool extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Specifies the Active Directory to be used for creating a SMB volume.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String activeDirectory;

  /**
   * Optional. True if the storage pool supports Auto Tiering enabled volumes. Default is false.
   * Auto-tiering can be enabled after storage pool creation but it can't be disabled once enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowAutoTiering;

  /**
   * Required. Capacity in GIB of the pool
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long capacityGib;

  /**
   * Output only. Create time of the storage pool
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. True if using Independent Scaling of capacity and performance (Hyperdisk) By default
   * set to false
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean customPerformanceEnabled;

  /**
   * Optional. Description of the storage pool
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. Flag indicating that the hot-tier threshold will be auto-increased by 10% of the hot-
   * tier when it hits 100%. Default is true. The increment will kick in only if the new size after
   * increment is still less than or equal to storage pool size.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableHotTierAutoResize;

  /**
   * Output only. Specifies the current pool encryption key source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String encryptionType;

  /**
   * Deprecated. Used to allow SO pool to access AD or DNS server from other regions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean globalAccessAllowed;

  /**
   * Optional. Total hot tier capacity for the Storage Pool. It is applicable only to Flex service
   * level. It should be less than the minimum storage pool size and cannot be more than the current
   * storage pool size. It cannot be decreased once set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long hotTierSizeGib;

  /**
   * Optional. Specifies the KMS config to be used for volume encryption.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsConfig;

  /**
   * Optional. Labels as key value pairs
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Optional. Flag indicating if the pool is NFS LDAP enabled or not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean ldapEnabled;

  /**
   * Identifier. Name of the storage pool
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. VPC Network name. Format: projects/{project}/global/networks/{network}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * Optional. This field is not implemented. The values provided in this field are ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String psaRange;

  /**
   * Optional. Specifies the replica zone for regional storagePool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String replicaZone;

  /**
   * Output only. Reserved for future use
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean satisfiesPzi;

  /**
   * Output only. Reserved for future use
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean satisfiesPzs;

  /**
   * Required. Service level of the storage pool
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceLevel;

  /**
   * Output only. State of the storage pool
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. State details of the storage pool
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stateDetails;

  /**
   * Optional. Custom Performance Total IOPS of the pool if not provided, it will be calculated
   * based on the total_throughput_mibps
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalIops;

  /**
   * Optional. Custom Performance Total Throughput of the pool (in MiBps)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalThroughputMibps;

  /**
   * Output only. Allocated size of all volumes in GIB in the storage pool
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long volumeCapacityGib;

  /**
   * Output only. Volume count of the storage pool
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer volumeCount;

  /**
   * Optional. Specifies the active zone for regional storagePool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * Optional. Specifies the Active Directory to be used for creating a SMB volume.
   * @return value or {@code null} for none
   */
  public java.lang.String getActiveDirectory() {
    return activeDirectory;
  }

  /**
   * Optional. Specifies the Active Directory to be used for creating a SMB volume.
   * @param activeDirectory activeDirectory or {@code null} for none
   */
  public StoragePool setActiveDirectory(java.lang.String activeDirectory) {
    this.activeDirectory = activeDirectory;
    return this;
  }

  /**
   * Optional. True if the storage pool supports Auto Tiering enabled volumes. Default is false.
   * Auto-tiering can be enabled after storage pool creation but it can't be disabled once enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowAutoTiering() {
    return allowAutoTiering;
  }

  /**
   * Optional. True if the storage pool supports Auto Tiering enabled volumes. Default is false.
   * Auto-tiering can be enabled after storage pool creation but it can't be disabled once enabled.
   * @param allowAutoTiering allowAutoTiering or {@code null} for none
   */
  public StoragePool setAllowAutoTiering(java.lang.Boolean allowAutoTiering) {
    this.allowAutoTiering = allowAutoTiering;
    return this;
  }

  /**
   * Required. Capacity in GIB of the pool
   * @return value or {@code null} for none
   */
  public java.lang.Long getCapacityGib() {
    return capacityGib;
  }

  /**
   * Required. Capacity in GIB of the pool
   * @param capacityGib capacityGib or {@code null} for none
   */
  public StoragePool setCapacityGib(java.lang.Long capacityGib) {
    this.capacityGib = capacityGib;
    return this;
  }

  /**
   * Output only. Create time of the storage pool
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Create time of the storage pool
   * @param createTime createTime or {@code null} for none
   */
  public StoragePool setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. True if using Independent Scaling of capacity and performance (Hyperdisk) By default
   * set to false
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCustomPerformanceEnabled() {
    return customPerformanceEnabled;
  }

  /**
   * Optional. True if using Independent Scaling of capacity and performance (Hyperdisk) By default
   * set to false
   * @param customPerformanceEnabled customPerformanceEnabled or {@code null} for none
   */
  public StoragePool setCustomPerformanceEnabled(java.lang.Boolean customPerformanceEnabled) {
    this.customPerformanceEnabled = customPerformanceEnabled;
    return this;
  }

  /**
   * Optional. Description of the storage pool
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. Description of the storage pool
   * @param description description or {@code null} for none
   */
  public StoragePool setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. Flag indicating that the hot-tier threshold will be auto-increased by 10% of the hot-
   * tier when it hits 100%. Default is true. The increment will kick in only if the new size after
   * increment is still less than or equal to storage pool size.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableHotTierAutoResize() {
    return enableHotTierAutoResize;
  }

  /**
   * Optional. Flag indicating that the hot-tier threshold will be auto-increased by 10% of the hot-
   * tier when it hits 100%. Default is true. The increment will kick in only if the new size after
   * increment is still less than or equal to storage pool size.
   * @param enableHotTierAutoResize enableHotTierAutoResize or {@code null} for none
   */
  public StoragePool setEnableHotTierAutoResize(java.lang.Boolean enableHotTierAutoResize) {
    this.enableHotTierAutoResize = enableHotTierAutoResize;
    return this;
  }

  /**
   * Output only. Specifies the current pool encryption key source.
   * @return value or {@code null} for none
   */
  public java.lang.String getEncryptionType() {
    return encryptionType;
  }

  /**
   * Output only. Specifies the current pool encryption key source.
   * @param encryptionType encryptionType or {@code null} for none
   */
  public StoragePool setEncryptionType(java.lang.String encryptionType) {
    this.encryptionType = encryptionType;
    return this;
  }

  /**
   * Deprecated. Used to allow SO pool to access AD or DNS server from other regions.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getGlobalAccessAllowed() {
    return globalAccessAllowed;
  }

  /**
   * Deprecated. Used to allow SO pool to access AD or DNS server from other regions.
   * @param globalAccessAllowed globalAccessAllowed or {@code null} for none
   */
  public StoragePool setGlobalAccessAllowed(java.lang.Boolean globalAccessAllowed) {
    this.globalAccessAllowed = globalAccessAllowed;
    return this;
  }

  /**
   * Optional. Total hot tier capacity for the Storage Pool. It is applicable only to Flex service
   * level. It should be less than the minimum storage pool size and cannot be more than the current
   * storage pool size. It cannot be decreased once set.
   * @return value or {@code null} for none
   */
  public java.lang.Long getHotTierSizeGib() {
    return hotTierSizeGib;
  }

  /**
   * Optional. Total hot tier capacity for the Storage Pool. It is applicable only to Flex service
   * level. It should be less than the minimum storage pool size and cannot be more than the current
   * storage pool size. It cannot be decreased once set.
   * @param hotTierSizeGib hotTierSizeGib or {@code null} for none
   */
  public StoragePool setHotTierSizeGib(java.lang.Long hotTierSizeGib) {
    this.hotTierSizeGib = hotTierSizeGib;
    return this;
  }

  /**
   * Optional. Specifies the KMS config to be used for volume encryption.
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsConfig() {
    return kmsConfig;
  }

  /**
   * Optional. Specifies the KMS config to be used for volume encryption.
   * @param kmsConfig kmsConfig or {@code null} for none
   */
  public StoragePool setKmsConfig(java.lang.String kmsConfig) {
    this.kmsConfig = kmsConfig;
    return this;
  }

  /**
   * Optional. Labels as key value pairs
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Labels as key value pairs
   * @param labels labels or {@code null} for none
   */
  public StoragePool setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Optional. Flag indicating if the pool is NFS LDAP enabled or not.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLdapEnabled() {
    return ldapEnabled;
  }

  /**
   * Optional. Flag indicating if the pool is NFS LDAP enabled or not.
   * @param ldapEnabled ldapEnabled or {@code null} for none
   */
  public StoragePool setLdapEnabled(java.lang.Boolean ldapEnabled) {
    this.ldapEnabled = ldapEnabled;
    return this;
  }

  /**
   * Identifier. Name of the storage pool
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. Name of the storage pool
   * @param name name or {@code null} for none
   */
  public StoragePool setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. VPC Network name. Format: projects/{project}/global/networks/{network}
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * Required. VPC Network name. Format: projects/{project}/global/networks/{network}
   * @param network network or {@code null} for none
   */
  public StoragePool setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * Optional. This field is not implemented. The values provided in this field are ignored.
   * @return value or {@code null} for none
   */
  public java.lang.String getPsaRange() {
    return psaRange;
  }

  /**
   * Optional. This field is not implemented. The values provided in this field are ignored.
   * @param psaRange psaRange or {@code null} for none
   */
  public StoragePool setPsaRange(java.lang.String psaRange) {
    this.psaRange = psaRange;
    return this;
  }

  /**
   * Optional. Specifies the replica zone for regional storagePool.
   * @return value or {@code null} for none
   */
  public java.lang.String getReplicaZone() {
    return replicaZone;
  }

  /**
   * Optional. Specifies the replica zone for regional storagePool.
   * @param replicaZone replicaZone or {@code null} for none
   */
  public StoragePool setReplicaZone(java.lang.String replicaZone) {
    this.replicaZone = replicaZone;
    return this;
  }

  /**
   * Output only. Reserved for future use
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSatisfiesPzi() {
    return satisfiesPzi;
  }

  /**
   * Output only. Reserved for future use
   * @param satisfiesPzi satisfiesPzi or {@code null} for none
   */
  public StoragePool setSatisfiesPzi(java.lang.Boolean satisfiesPzi) {
    this.satisfiesPzi = satisfiesPzi;
    return this;
  }

  /**
   * Output only. Reserved for future use
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSatisfiesPzs() {
    return satisfiesPzs;
  }

  /**
   * Output only. Reserved for future use
   * @param satisfiesPzs satisfiesPzs or {@code null} for none
   */
  public StoragePool setSatisfiesPzs(java.lang.Boolean satisfiesPzs) {
    this.satisfiesPzs = satisfiesPzs;
    return this;
  }

  /**
   * Required. Service level of the storage pool
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceLevel() {
    return serviceLevel;
  }

  /**
   * Required. Service level of the storage pool
   * @param serviceLevel serviceLevel or {@code null} for none
   */
  public StoragePool setServiceLevel(java.lang.String serviceLevel) {
    this.serviceLevel = serviceLevel;
    return this;
  }

  /**
   * Output only. State of the storage pool
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. State of the storage pool
   * @param state state or {@code null} for none
   */
  public StoragePool setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. State details of the storage pool
   * @return value or {@code null} for none
   */
  public java.lang.String getStateDetails() {
    return stateDetails;
  }

  /**
   * Output only. State details of the storage pool
   * @param stateDetails stateDetails or {@code null} for none
   */
  public StoragePool setStateDetails(java.lang.String stateDetails) {
    this.stateDetails = stateDetails;
    return this;
  }

  /**
   * Optional. Custom Performance Total IOPS of the pool if not provided, it will be calculated
   * based on the total_throughput_mibps
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalIops() {
    return totalIops;
  }

  /**
   * Optional. Custom Performance Total IOPS of the pool if not provided, it will be calculated
   * based on the total_throughput_mibps
   * @param totalIops totalIops or {@code null} for none
   */
  public StoragePool setTotalIops(java.lang.Long totalIops) {
    this.totalIops = totalIops;
    return this;
  }

  /**
   * Optional. Custom Performance Total Throughput of the pool (in MiBps)
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalThroughputMibps() {
    return totalThroughputMibps;
  }

  /**
   * Optional. Custom Performance Total Throughput of the pool (in MiBps)
   * @param totalThroughputMibps totalThroughputMibps or {@code null} for none
   */
  public StoragePool setTotalThroughputMibps(java.lang.Long totalThroughputMibps) {
    this.totalThroughputMibps = totalThroughputMibps;
    return this;
  }

  /**
   * Output only. Allocated size of all volumes in GIB in the storage pool
   * @return value or {@code null} for none
   */
  public java.lang.Long getVolumeCapacityGib() {
    return volumeCapacityGib;
  }

  /**
   * Output only. Allocated size of all volumes in GIB in the storage pool
   * @param volumeCapacityGib volumeCapacityGib or {@code null} for none
   */
  public StoragePool setVolumeCapacityGib(java.lang.Long volumeCapacityGib) {
    this.volumeCapacityGib = volumeCapacityGib;
    return this;
  }

  /**
   * Output only. Volume count of the storage pool
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVolumeCount() {
    return volumeCount;
  }

  /**
   * Output only. Volume count of the storage pool
   * @param volumeCount volumeCount or {@code null} for none
   */
  public StoragePool setVolumeCount(java.lang.Integer volumeCount) {
    this.volumeCount = volumeCount;
    return this;
  }

  /**
   * Optional. Specifies the active zone for regional storagePool.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * Optional. Specifies the active zone for regional storagePool.
   * @param zone zone or {@code null} for none
   */
  public StoragePool setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public StoragePool set(String fieldName, Object value) {
    return (StoragePool) super.set(fieldName, value);
  }

  @Override
  public StoragePool clone() {
    return (StoragePool) super.clone();
  }

}
