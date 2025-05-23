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

package com.google.api.services.displayvideo.v4.model;

/**
 * Settings that control the active duration of a line item.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LineItemFlight extends com.google.api.client.json.GenericJson {

  /**
   * The flight start and end dates of the line item. They are resolved relative to the parent
   * advertiser's time zone. * Required when flight_date_type is
   * `LINE_ITEM_FLIGHT_DATE_TYPE_CUSTOM`. Output only otherwise. * When creating a new flight, both
   * `start_date` and `end_date` must be in the future. * An existing flight with a `start_date` in
   * the past has a mutable `end_date` but an immutable `start_date`. * `end_date` must be the
   * `start_date` or later, both before the year 2037.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DateRange dateRange;

  /**
   * Required. The type of the line item's flight dates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String flightDateType;

  /**
   * The flight start and end dates of the line item. They are resolved relative to the parent
   * advertiser's time zone. * Required when flight_date_type is
   * `LINE_ITEM_FLIGHT_DATE_TYPE_CUSTOM`. Output only otherwise. * When creating a new flight, both
   * `start_date` and `end_date` must be in the future. * An existing flight with a `start_date` in
   * the past has a mutable `end_date` but an immutable `start_date`. * `end_date` must be the
   * `start_date` or later, both before the year 2037.
   * @return value or {@code null} for none
   */
  public DateRange getDateRange() {
    return dateRange;
  }

  /**
   * The flight start and end dates of the line item. They are resolved relative to the parent
   * advertiser's time zone. * Required when flight_date_type is
   * `LINE_ITEM_FLIGHT_DATE_TYPE_CUSTOM`. Output only otherwise. * When creating a new flight, both
   * `start_date` and `end_date` must be in the future. * An existing flight with a `start_date` in
   * the past has a mutable `end_date` but an immutable `start_date`. * `end_date` must be the
   * `start_date` or later, both before the year 2037.
   * @param dateRange dateRange or {@code null} for none
   */
  public LineItemFlight setDateRange(DateRange dateRange) {
    this.dateRange = dateRange;
    return this;
  }

  /**
   * Required. The type of the line item's flight dates.
   * @return value or {@code null} for none
   */
  public java.lang.String getFlightDateType() {
    return flightDateType;
  }

  /**
   * Required. The type of the line item's flight dates.
   * @param flightDateType flightDateType or {@code null} for none
   */
  public LineItemFlight setFlightDateType(java.lang.String flightDateType) {
    this.flightDateType = flightDateType;
    return this;
  }

  @Override
  public LineItemFlight set(String fieldName, Object value) {
    return (LineItemFlight) super.set(fieldName, value);
  }

  @Override
  public LineItemFlight clone() {
    return (LineItemFlight) super.clone();
  }

}
