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

package com.google.api.services.compute.model;

/**
 * AccessLocation is only used for regional snapshot. It contains which regions are allowed to
 * create a regional snapshot from disks located in the given region/zone. It includes key-value
 * pairs designed to store the following structure. The keys should match their corresponding
 * values, which must be provided: access_location: { locations { us-central1 { region: "us-
 * central1" }, asia-west2 { region: "asia-west2" } } }
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DiskSettingsAccessLocation extends com.google.api.client.json.GenericJson {

  /**
   * List of regions that can create a regional snapshot from the current region
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, DiskSettingsAccessLocationAccessLocationPreference> locations;

  /**
   * Policy of which location is allowed to access snapshot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String policy;

  /**
   * List of regions that can create a regional snapshot from the current region
   * @return value or {@code null} for none
   */
  public java.util.Map<String, DiskSettingsAccessLocationAccessLocationPreference> getLocations() {
    return locations;
  }

  /**
   * List of regions that can create a regional snapshot from the current region
   * @param locations locations or {@code null} for none
   */
  public DiskSettingsAccessLocation setLocations(java.util.Map<String, DiskSettingsAccessLocationAccessLocationPreference> locations) {
    this.locations = locations;
    return this;
  }

  /**
   * Policy of which location is allowed to access snapshot.
   * @return value or {@code null} for none
   */
  public java.lang.String getPolicy() {
    return policy;
  }

  /**
   * Policy of which location is allowed to access snapshot.
   * @param policy policy or {@code null} for none
   */
  public DiskSettingsAccessLocation setPolicy(java.lang.String policy) {
    this.policy = policy;
    return this;
  }

  @Override
  public DiskSettingsAccessLocation set(String fieldName, Object value) {
    return (DiskSettingsAccessLocation) super.set(fieldName, value);
  }

  @Override
  public DiskSettingsAccessLocation clone() {
    return (DiskSettingsAccessLocation) super.clone();
  }

}
