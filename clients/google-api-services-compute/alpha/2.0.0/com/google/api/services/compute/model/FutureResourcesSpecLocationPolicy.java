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
 * Specification of locations to create resources in.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FutureResourcesSpecLocationPolicy extends com.google.api.client.json.GenericJson {

  /**
   * Preferences for specified locations. Keys of the map are locations - zones, in format of
   * 'zones/'. Values are preferences for the zones. If a zone is not specified in this map, it is
   * ALLOWed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, FutureResourcesSpecLocationPolicyLocation> locations;

  /**
   * Preferences for specified locations. Keys of the map are locations - zones, in format of
   * 'zones/'. Values are preferences for the zones. If a zone is not specified in this map, it is
   * ALLOWed.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, FutureResourcesSpecLocationPolicyLocation> getLocations() {
    return locations;
  }

  /**
   * Preferences for specified locations. Keys of the map are locations - zones, in format of
   * 'zones/'. Values are preferences for the zones. If a zone is not specified in this map, it is
   * ALLOWed.
   * @param locations locations or {@code null} for none
   */
  public FutureResourcesSpecLocationPolicy setLocations(java.util.Map<String, FutureResourcesSpecLocationPolicyLocation> locations) {
    this.locations = locations;
    return this;
  }

  @Override
  public FutureResourcesSpecLocationPolicy set(String fieldName, Object value) {
    return (FutureResourcesSpecLocationPolicy) super.set(fieldName, value);
  }

  @Override
  public FutureResourcesSpecLocationPolicy clone() {
    return (FutureResourcesSpecLocationPolicy) super.clone();
  }

}
