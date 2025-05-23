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

package com.google.api.services.gkehub.v1beta.model;

/**
 * Properties of a GKE upgrade that can be overridden by the user. For example, a user can skip
 * soaking by overriding the soaking to 0.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ClusterUpgradeGKEUpgradeOverride extends com.google.api.client.json.GenericJson {

  /**
   * Required. Post conditions to override for the specified upgrade (name + version). Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ClusterUpgradePostConditions postConditions;

  /**
   * Required. Which upgrade to override. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ClusterUpgradeGKEUpgrade upgrade;

  /**
   * Required. Post conditions to override for the specified upgrade (name + version). Required.
   * @return value or {@code null} for none
   */
  public ClusterUpgradePostConditions getPostConditions() {
    return postConditions;
  }

  /**
   * Required. Post conditions to override for the specified upgrade (name + version). Required.
   * @param postConditions postConditions or {@code null} for none
   */
  public ClusterUpgradeGKEUpgradeOverride setPostConditions(ClusterUpgradePostConditions postConditions) {
    this.postConditions = postConditions;
    return this;
  }

  /**
   * Required. Which upgrade to override. Required.
   * @return value or {@code null} for none
   */
  public ClusterUpgradeGKEUpgrade getUpgrade() {
    return upgrade;
  }

  /**
   * Required. Which upgrade to override. Required.
   * @param upgrade upgrade or {@code null} for none
   */
  public ClusterUpgradeGKEUpgradeOverride setUpgrade(ClusterUpgradeGKEUpgrade upgrade) {
    this.upgrade = upgrade;
    return this;
  }

  @Override
  public ClusterUpgradeGKEUpgradeOverride set(String fieldName, Object value) {
    return (ClusterUpgradeGKEUpgradeOverride) super.set(fieldName, value);
  }

  @Override
  public ClusterUpgradeGKEUpgradeOverride clone() {
    return (ClusterUpgradeGKEUpgradeOverride) super.clone();
  }

}
