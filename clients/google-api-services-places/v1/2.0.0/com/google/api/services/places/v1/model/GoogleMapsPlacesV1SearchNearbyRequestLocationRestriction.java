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

package com.google.api.services.places.v1.model;

/**
 * The region to search.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Places API (New). For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleMapsPlacesV1SearchNearbyRequestLocationRestriction extends com.google.api.client.json.GenericJson {

  /**
   * A circle defined by center point and radius.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleMapsPlacesV1Circle circle;

  /**
   * A circle defined by center point and radius.
   * @return value or {@code null} for none
   */
  public GoogleMapsPlacesV1Circle getCircle() {
    return circle;
  }

  /**
   * A circle defined by center point and radius.
   * @param circle circle or {@code null} for none
   */
  public GoogleMapsPlacesV1SearchNearbyRequestLocationRestriction setCircle(GoogleMapsPlacesV1Circle circle) {
    this.circle = circle;
    return this;
  }

  @Override
  public GoogleMapsPlacesV1SearchNearbyRequestLocationRestriction set(String fieldName, Object value) {
    return (GoogleMapsPlacesV1SearchNearbyRequestLocationRestriction) super.set(fieldName, value);
  }

  @Override
  public GoogleMapsPlacesV1SearchNearbyRequestLocationRestriction clone() {
    return (GoogleMapsPlacesV1SearchNearbyRequestLocationRestriction) super.clone();
  }

}
