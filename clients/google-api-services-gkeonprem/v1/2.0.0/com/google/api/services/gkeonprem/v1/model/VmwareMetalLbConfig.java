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

package com.google.api.services.gkeonprem.v1.model;

/**
 * Represents configuration parameters for the MetalLB load balancer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE On-Prem API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VmwareMetalLbConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. AddressPools is a list of non-overlapping IP pools used by load balancer typed
   * services. All addresses must be routable to load balancer nodes. IngressVIP must be included in
   * the pools.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<VmwareAddressPool> addressPools;

  static {
    // hack to force ProGuard to consider VmwareAddressPool used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(VmwareAddressPool.class);
  }

  /**
   * Required. AddressPools is a list of non-overlapping IP pools used by load balancer typed
   * services. All addresses must be routable to load balancer nodes. IngressVIP must be included in
   * the pools.
   * @return value or {@code null} for none
   */
  public java.util.List<VmwareAddressPool> getAddressPools() {
    return addressPools;
  }

  /**
   * Required. AddressPools is a list of non-overlapping IP pools used by load balancer typed
   * services. All addresses must be routable to load balancer nodes. IngressVIP must be included in
   * the pools.
   * @param addressPools addressPools or {@code null} for none
   */
  public VmwareMetalLbConfig setAddressPools(java.util.List<VmwareAddressPool> addressPools) {
    this.addressPools = addressPools;
    return this;
  }

  @Override
  public VmwareMetalLbConfig set(String fieldName, Object value) {
    return (VmwareMetalLbConfig) super.set(fieldName, value);
  }

  @Override
  public VmwareMetalLbConfig clone() {
    return (VmwareMetalLbConfig) super.clone();
  }

}
