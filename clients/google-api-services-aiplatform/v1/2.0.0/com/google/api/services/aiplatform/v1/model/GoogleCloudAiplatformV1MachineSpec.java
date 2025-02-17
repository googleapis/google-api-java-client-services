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
 * Specification of a single machine.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1MachineSpec extends com.google.api.client.json.GenericJson {

  /**
   * The number of accelerators to attach to the machine.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer acceleratorCount;

  /**
   * Immutable. The type of accelerator(s) that may be attached to the machine as per
   * accelerator_count.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String acceleratorType;

  /**
   * Immutable. The type of the machine. See the [list of machine types supported for
   * prediction](https://cloud.google.com/vertex-ai/docs/predictions/configure-compute#machine-
   * types) See the [list of machine types supported for custom
   * training](https://cloud.google.com/vertex-ai/docs/training/configure-compute#machine-types).
   * For DeployedModel this field is optional, and the default value is `n1-standard-2`. For
   * BatchPredictionJob or as part of WorkerPoolSpec this field is required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String machineType;

  /**
   * Optional. Immutable. The number of nodes per replica for multihost GPU deployments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer multihostGpuNodeCount;

  /**
   * Optional. Immutable. Configuration controlling how this resource pool consumes reservation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1ReservationAffinity reservationAffinity;

  /**
   * Immutable. The topology of the TPUs. Corresponds to the TPU topologies available from GKE.
   * (Example: tpu_topology: "2x2x1").
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tpuTopology;

  /**
   * The number of accelerators to attach to the machine.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAcceleratorCount() {
    return acceleratorCount;
  }

  /**
   * The number of accelerators to attach to the machine.
   * @param acceleratorCount acceleratorCount or {@code null} for none
   */
  public GoogleCloudAiplatformV1MachineSpec setAcceleratorCount(java.lang.Integer acceleratorCount) {
    this.acceleratorCount = acceleratorCount;
    return this;
  }

  /**
   * Immutable. The type of accelerator(s) that may be attached to the machine as per
   * accelerator_count.
   * @return value or {@code null} for none
   */
  public java.lang.String getAcceleratorType() {
    return acceleratorType;
  }

  /**
   * Immutable. The type of accelerator(s) that may be attached to the machine as per
   * accelerator_count.
   * @param acceleratorType acceleratorType or {@code null} for none
   */
  public GoogleCloudAiplatformV1MachineSpec setAcceleratorType(java.lang.String acceleratorType) {
    this.acceleratorType = acceleratorType;
    return this;
  }

  /**
   * Immutable. The type of the machine. See the [list of machine types supported for
   * prediction](https://cloud.google.com/vertex-ai/docs/predictions/configure-compute#machine-
   * types) See the [list of machine types supported for custom
   * training](https://cloud.google.com/vertex-ai/docs/training/configure-compute#machine-types).
   * For DeployedModel this field is optional, and the default value is `n1-standard-2`. For
   * BatchPredictionJob or as part of WorkerPoolSpec this field is required.
   * @return value or {@code null} for none
   */
  public java.lang.String getMachineType() {
    return machineType;
  }

  /**
   * Immutable. The type of the machine. See the [list of machine types supported for
   * prediction](https://cloud.google.com/vertex-ai/docs/predictions/configure-compute#machine-
   * types) See the [list of machine types supported for custom
   * training](https://cloud.google.com/vertex-ai/docs/training/configure-compute#machine-types).
   * For DeployedModel this field is optional, and the default value is `n1-standard-2`. For
   * BatchPredictionJob or as part of WorkerPoolSpec this field is required.
   * @param machineType machineType or {@code null} for none
   */
  public GoogleCloudAiplatformV1MachineSpec setMachineType(java.lang.String machineType) {
    this.machineType = machineType;
    return this;
  }

  /**
   * Optional. Immutable. The number of nodes per replica for multihost GPU deployments.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMultihostGpuNodeCount() {
    return multihostGpuNodeCount;
  }

  /**
   * Optional. Immutable. The number of nodes per replica for multihost GPU deployments.
   * @param multihostGpuNodeCount multihostGpuNodeCount or {@code null} for none
   */
  public GoogleCloudAiplatformV1MachineSpec setMultihostGpuNodeCount(java.lang.Integer multihostGpuNodeCount) {
    this.multihostGpuNodeCount = multihostGpuNodeCount;
    return this;
  }

  /**
   * Optional. Immutable. Configuration controlling how this resource pool consumes reservation.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1ReservationAffinity getReservationAffinity() {
    return reservationAffinity;
  }

  /**
   * Optional. Immutable. Configuration controlling how this resource pool consumes reservation.
   * @param reservationAffinity reservationAffinity or {@code null} for none
   */
  public GoogleCloudAiplatformV1MachineSpec setReservationAffinity(GoogleCloudAiplatformV1ReservationAffinity reservationAffinity) {
    this.reservationAffinity = reservationAffinity;
    return this;
  }

  /**
   * Immutable. The topology of the TPUs. Corresponds to the TPU topologies available from GKE.
   * (Example: tpu_topology: "2x2x1").
   * @return value or {@code null} for none
   */
  public java.lang.String getTpuTopology() {
    return tpuTopology;
  }

  /**
   * Immutable. The topology of the TPUs. Corresponds to the TPU topologies available from GKE.
   * (Example: tpu_topology: "2x2x1").
   * @param tpuTopology tpuTopology or {@code null} for none
   */
  public GoogleCloudAiplatformV1MachineSpec setTpuTopology(java.lang.String tpuTopology) {
    this.tpuTopology = tpuTopology;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1MachineSpec set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1MachineSpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1MachineSpec clone() {
    return (GoogleCloudAiplatformV1MachineSpec) super.clone();
  }

}
