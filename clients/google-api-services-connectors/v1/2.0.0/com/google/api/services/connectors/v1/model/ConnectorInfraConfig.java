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

package com.google.api.services.connectors.v1.model;

/**
 * This cofiguration provides infra configs like rate limit threshold which need to be configurable
 * for every connector version
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Connectors API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConnectorInfraConfig extends com.google.api.client.json.GenericJson {

  /**
   * Indicates that the Cloud Run CPU should always be allocated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean alwaysAllocateCpu;

  /**
   * The window used for ratelimiting runtime requests to connections.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long connectionRatelimitWindowSeconds;

  /**
   * Indicate whether connector versioning is enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean connectorVersioningEnabled;

  /**
   * Indicate whether connector is deployed on GKE/CloudRun
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deploymentModel;

  /**
   * HPA autoscaling config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HPAConfig hpaConfig;

  /**
   * Max QPS supported for internal requests originating from Connd.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long internalclientRatelimitThreshold;

  /**
   * Max Instance Request Conncurrency for Cloud Run service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxInstanceRequestConcurrency;

  /**
   * Indicate whether connector is being migrated to cloud run deployment model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean migrateDeploymentModel;

  /**
   * Indicate whether connector is being migrated to TLS.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean migrateTls;

  /**
   * Indicate whether connector is being migrated to use direct VPC egress.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkEgressMode;

  /**
   * Indicate whether cloud spanner is required for connector job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean provisionCloudSpanner;

  /**
   * Indicate whether memstore is required for connector job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean provisionMemstore;

  /**
   * Max QPS supported by the connector version before throttling of requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long ratelimitThreshold;

  /**
   * System resource limits.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResourceLimits resourceLimits;

  /**
   * System resource requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResourceRequests resourceRequests;

  /**
   * The name of shared connector deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sharedDeployment;

  /**
   * Indicates that the Cloud Run CPU should always be allocated.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAlwaysAllocateCpu() {
    return alwaysAllocateCpu;
  }

  /**
   * Indicates that the Cloud Run CPU should always be allocated.
   * @param alwaysAllocateCpu alwaysAllocateCpu or {@code null} for none
   */
  public ConnectorInfraConfig setAlwaysAllocateCpu(java.lang.Boolean alwaysAllocateCpu) {
    this.alwaysAllocateCpu = alwaysAllocateCpu;
    return this;
  }

  /**
   * The window used for ratelimiting runtime requests to connections.
   * @return value or {@code null} for none
   */
  public java.lang.Long getConnectionRatelimitWindowSeconds() {
    return connectionRatelimitWindowSeconds;
  }

  /**
   * The window used for ratelimiting runtime requests to connections.
   * @param connectionRatelimitWindowSeconds connectionRatelimitWindowSeconds or {@code null} for none
   */
  public ConnectorInfraConfig setConnectionRatelimitWindowSeconds(java.lang.Long connectionRatelimitWindowSeconds) {
    this.connectionRatelimitWindowSeconds = connectionRatelimitWindowSeconds;
    return this;
  }

  /**
   * Indicate whether connector versioning is enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getConnectorVersioningEnabled() {
    return connectorVersioningEnabled;
  }

  /**
   * Indicate whether connector versioning is enabled.
   * @param connectorVersioningEnabled connectorVersioningEnabled or {@code null} for none
   */
  public ConnectorInfraConfig setConnectorVersioningEnabled(java.lang.Boolean connectorVersioningEnabled) {
    this.connectorVersioningEnabled = connectorVersioningEnabled;
    return this;
  }

  /**
   * Indicate whether connector is deployed on GKE/CloudRun
   * @return value or {@code null} for none
   */
  public java.lang.String getDeploymentModel() {
    return deploymentModel;
  }

  /**
   * Indicate whether connector is deployed on GKE/CloudRun
   * @param deploymentModel deploymentModel or {@code null} for none
   */
  public ConnectorInfraConfig setDeploymentModel(java.lang.String deploymentModel) {
    this.deploymentModel = deploymentModel;
    return this;
  }

  /**
   * HPA autoscaling config.
   * @return value or {@code null} for none
   */
  public HPAConfig getHpaConfig() {
    return hpaConfig;
  }

  /**
   * HPA autoscaling config.
   * @param hpaConfig hpaConfig or {@code null} for none
   */
  public ConnectorInfraConfig setHpaConfig(HPAConfig hpaConfig) {
    this.hpaConfig = hpaConfig;
    return this;
  }

  /**
   * Max QPS supported for internal requests originating from Connd.
   * @return value or {@code null} for none
   */
  public java.lang.Long getInternalclientRatelimitThreshold() {
    return internalclientRatelimitThreshold;
  }

  /**
   * Max QPS supported for internal requests originating from Connd.
   * @param internalclientRatelimitThreshold internalclientRatelimitThreshold or {@code null} for none
   */
  public ConnectorInfraConfig setInternalclientRatelimitThreshold(java.lang.Long internalclientRatelimitThreshold) {
    this.internalclientRatelimitThreshold = internalclientRatelimitThreshold;
    return this;
  }

  /**
   * Max Instance Request Conncurrency for Cloud Run service.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxInstanceRequestConcurrency() {
    return maxInstanceRequestConcurrency;
  }

  /**
   * Max Instance Request Conncurrency for Cloud Run service.
   * @param maxInstanceRequestConcurrency maxInstanceRequestConcurrency or {@code null} for none
   */
  public ConnectorInfraConfig setMaxInstanceRequestConcurrency(java.lang.Integer maxInstanceRequestConcurrency) {
    this.maxInstanceRequestConcurrency = maxInstanceRequestConcurrency;
    return this;
  }

  /**
   * Indicate whether connector is being migrated to cloud run deployment model.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMigrateDeploymentModel() {
    return migrateDeploymentModel;
  }

  /**
   * Indicate whether connector is being migrated to cloud run deployment model.
   * @param migrateDeploymentModel migrateDeploymentModel or {@code null} for none
   */
  public ConnectorInfraConfig setMigrateDeploymentModel(java.lang.Boolean migrateDeploymentModel) {
    this.migrateDeploymentModel = migrateDeploymentModel;
    return this;
  }

  /**
   * Indicate whether connector is being migrated to TLS.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMigrateTls() {
    return migrateTls;
  }

  /**
   * Indicate whether connector is being migrated to TLS.
   * @param migrateTls migrateTls or {@code null} for none
   */
  public ConnectorInfraConfig setMigrateTls(java.lang.Boolean migrateTls) {
    this.migrateTls = migrateTls;
    return this;
  }

  /**
   * Indicate whether connector is being migrated to use direct VPC egress.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkEgressMode() {
    return networkEgressMode;
  }

  /**
   * Indicate whether connector is being migrated to use direct VPC egress.
   * @param networkEgressMode networkEgressMode or {@code null} for none
   */
  public ConnectorInfraConfig setNetworkEgressMode(java.lang.String networkEgressMode) {
    this.networkEgressMode = networkEgressMode;
    return this;
  }

  /**
   * Indicate whether cloud spanner is required for connector job.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getProvisionCloudSpanner() {
    return provisionCloudSpanner;
  }

  /**
   * Indicate whether cloud spanner is required for connector job.
   * @param provisionCloudSpanner provisionCloudSpanner or {@code null} for none
   */
  public ConnectorInfraConfig setProvisionCloudSpanner(java.lang.Boolean provisionCloudSpanner) {
    this.provisionCloudSpanner = provisionCloudSpanner;
    return this;
  }

  /**
   * Indicate whether memstore is required for connector job.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getProvisionMemstore() {
    return provisionMemstore;
  }

  /**
   * Indicate whether memstore is required for connector job.
   * @param provisionMemstore provisionMemstore or {@code null} for none
   */
  public ConnectorInfraConfig setProvisionMemstore(java.lang.Boolean provisionMemstore) {
    this.provisionMemstore = provisionMemstore;
    return this;
  }

  /**
   * Max QPS supported by the connector version before throttling of requests.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRatelimitThreshold() {
    return ratelimitThreshold;
  }

  /**
   * Max QPS supported by the connector version before throttling of requests.
   * @param ratelimitThreshold ratelimitThreshold or {@code null} for none
   */
  public ConnectorInfraConfig setRatelimitThreshold(java.lang.Long ratelimitThreshold) {
    this.ratelimitThreshold = ratelimitThreshold;
    return this;
  }

  /**
   * System resource limits.
   * @return value or {@code null} for none
   */
  public ResourceLimits getResourceLimits() {
    return resourceLimits;
  }

  /**
   * System resource limits.
   * @param resourceLimits resourceLimits or {@code null} for none
   */
  public ConnectorInfraConfig setResourceLimits(ResourceLimits resourceLimits) {
    this.resourceLimits = resourceLimits;
    return this;
  }

  /**
   * System resource requests.
   * @return value or {@code null} for none
   */
  public ResourceRequests getResourceRequests() {
    return resourceRequests;
  }

  /**
   * System resource requests.
   * @param resourceRequests resourceRequests or {@code null} for none
   */
  public ConnectorInfraConfig setResourceRequests(ResourceRequests resourceRequests) {
    this.resourceRequests = resourceRequests;
    return this;
  }

  /**
   * The name of shared connector deployment.
   * @return value or {@code null} for none
   */
  public java.lang.String getSharedDeployment() {
    return sharedDeployment;
  }

  /**
   * The name of shared connector deployment.
   * @param sharedDeployment sharedDeployment or {@code null} for none
   */
  public ConnectorInfraConfig setSharedDeployment(java.lang.String sharedDeployment) {
    this.sharedDeployment = sharedDeployment;
    return this;
  }

  @Override
  public ConnectorInfraConfig set(String fieldName, Object value) {
    return (ConnectorInfraConfig) super.set(fieldName, value);
  }

  @Override
  public ConnectorInfraConfig clone() {
    return (ConnectorInfraConfig) super.clone();
  }

}
