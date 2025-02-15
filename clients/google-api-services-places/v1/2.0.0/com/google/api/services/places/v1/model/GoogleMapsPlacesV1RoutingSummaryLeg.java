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
 * A leg is a single portion of a journey from one location to another.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Places API (New). For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleMapsPlacesV1RoutingSummaryLeg extends com.google.api.client.json.GenericJson {

  /**
   * The distance of this leg of the trip.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer distanceMeters;

  /**
   * The time it takes to complete this leg of the trip.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String duration;

  /**
   * The distance of this leg of the trip.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDistanceMeters() {
    return distanceMeters;
  }

  /**
   * The distance of this leg of the trip.
   * @param distanceMeters distanceMeters or {@code null} for none
   */
  public GoogleMapsPlacesV1RoutingSummaryLeg setDistanceMeters(java.lang.Integer distanceMeters) {
    this.distanceMeters = distanceMeters;
    return this;
  }

  /**
   * The time it takes to complete this leg of the trip.
   * @return value or {@code null} for none
   */
  public String getDuration() {
    return duration;
  }

  /**
   * The time it takes to complete this leg of the trip.
   * @param duration duration or {@code null} for none
   */
  public GoogleMapsPlacesV1RoutingSummaryLeg setDuration(String duration) {
    this.duration = duration;
    return this;
  }

  @Override
  public GoogleMapsPlacesV1RoutingSummaryLeg set(String fieldName, Object value) {
    return (GoogleMapsPlacesV1RoutingSummaryLeg) super.set(fieldName, value);
  }

  @Override
  public GoogleMapsPlacesV1RoutingSummaryLeg clone() {
    return (GoogleMapsPlacesV1RoutingSummaryLeg) super.clone();
  }

}
