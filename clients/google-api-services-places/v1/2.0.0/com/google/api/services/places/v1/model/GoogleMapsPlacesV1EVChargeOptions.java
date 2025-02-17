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
 * Information about the EV Charge Station hosted in Place. Terminology follows
 * https://afdc.energy.gov/fuels/electricity_infrastructure.html One port could charge one car at a
 * time. One port has one or more connectors. One station has one or more ports.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Places API (New). For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleMapsPlacesV1EVChargeOptions extends com.google.api.client.json.GenericJson {

  /**
   * A list of EV charging connector aggregations that contain connectors of the same type and same
   * charge rate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleMapsPlacesV1EVChargeOptionsConnectorAggregation> connectorAggregation;

  /**
   * Number of connectors at this station. However, because some ports can have multiple connectors
   * but only be able to charge one car at a time (e.g.) the number of connectors may be greater
   * than the total number of cars which can charge simultaneously.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer connectorCount;

  /**
   * A list of EV charging connector aggregations that contain connectors of the same type and same
   * charge rate.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleMapsPlacesV1EVChargeOptionsConnectorAggregation> getConnectorAggregation() {
    return connectorAggregation;
  }

  /**
   * A list of EV charging connector aggregations that contain connectors of the same type and same
   * charge rate.
   * @param connectorAggregation connectorAggregation or {@code null} for none
   */
  public GoogleMapsPlacesV1EVChargeOptions setConnectorAggregation(java.util.List<GoogleMapsPlacesV1EVChargeOptionsConnectorAggregation> connectorAggregation) {
    this.connectorAggregation = connectorAggregation;
    return this;
  }

  /**
   * Number of connectors at this station. However, because some ports can have multiple connectors
   * but only be able to charge one car at a time (e.g.) the number of connectors may be greater
   * than the total number of cars which can charge simultaneously.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getConnectorCount() {
    return connectorCount;
  }

  /**
   * Number of connectors at this station. However, because some ports can have multiple connectors
   * but only be able to charge one car at a time (e.g.) the number of connectors may be greater
   * than the total number of cars which can charge simultaneously.
   * @param connectorCount connectorCount or {@code null} for none
   */
  public GoogleMapsPlacesV1EVChargeOptions setConnectorCount(java.lang.Integer connectorCount) {
    this.connectorCount = connectorCount;
    return this;
  }

  @Override
  public GoogleMapsPlacesV1EVChargeOptions set(String fieldName, Object value) {
    return (GoogleMapsPlacesV1EVChargeOptions) super.set(fieldName, value);
  }

  @Override
  public GoogleMapsPlacesV1EVChargeOptions clone() {
    return (GoogleMapsPlacesV1EVChargeOptions) super.clone();
  }

}
