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

package com.google.api.services.merchantapi.accounts_v1beta.model;

/**
 * A non-empty list of row or column headers for a table. Exactly one of `prices`, `weights`,
 * `num_items`, `postal_code_group_names`, or `location` must be set.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Merchant API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Headers extends com.google.api.client.json.GenericJson {

  /**
   * Required. A list of location ID sets. Must be non-empty. Can only be set if all other fields
   * are not set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LocationIdSet> locations;

  /**
   * Required. A list of inclusive number of items upper bounds. The last value can be `"infinity"`.
   * For example `["10", "50", "infinity"]` represents the headers "<= 10 items", "<= 50 items", and
   * "> 50 items". Must be non-empty. Can only be set if all other fields are not set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> numberOfItems;

  /**
   * Required. A list of postal group names. The last value can be `"all other locations"`. Example:
   * `["zone 1", "zone 2", "all other locations"]`. The referred postal code groups must match the
   * delivery country of the service. Must be non-empty. Can only be set if all other fields are not
   * set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> postalCodeGroupNames;

  /**
   * Required. A list of inclusive order price upper bounds. The last price's value can be infinity
   * by setting price amount_micros = -1. For example `[{"amount_micros": 10000000, "currency_code":
   * "USD"}, {"amount_micros": 500000000, "currency_code": "USD"}, {"amount_micros": -1,
   * "currency_code": "USD"}]` represents the headers "<= $10", "<= $500", and "> $500". All prices
   * within a service must have the same currency. Must be non-empty. Must be positive except -1.
   * Can only be set if all other fields are not set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Price> prices;

  /**
   * Required. A list of inclusive order weight upper bounds. The last weight's value can be
   * infinity by setting price amount_micros = -1. For example `[{"amount_micros": 10000000, "unit":
   * "kg"}, {"amount_micros": 50000000, "unit": "kg"}, {"amount_micros": -1, "unit": "kg"}]`
   * represents the headers "<= 10kg", "<= 50kg", and "> 50kg". All weights within a service must
   * have the same unit. Must be non-empty. Must be positive except -1. Can only be set if all other
   * fields are not set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Weight> weights;

  /**
   * Required. A list of location ID sets. Must be non-empty. Can only be set if all other fields
   * are not set.
   * @return value or {@code null} for none
   */
  public java.util.List<LocationIdSet> getLocations() {
    return locations;
  }

  /**
   * Required. A list of location ID sets. Must be non-empty. Can only be set if all other fields
   * are not set.
   * @param locations locations or {@code null} for none
   */
  public Headers setLocations(java.util.List<LocationIdSet> locations) {
    this.locations = locations;
    return this;
  }

  /**
   * Required. A list of inclusive number of items upper bounds. The last value can be `"infinity"`.
   * For example `["10", "50", "infinity"]` represents the headers "<= 10 items", "<= 50 items", and
   * "> 50 items". Must be non-empty. Can only be set if all other fields are not set.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNumberOfItems() {
    return numberOfItems;
  }

  /**
   * Required. A list of inclusive number of items upper bounds. The last value can be `"infinity"`.
   * For example `["10", "50", "infinity"]` represents the headers "<= 10 items", "<= 50 items", and
   * "> 50 items". Must be non-empty. Can only be set if all other fields are not set.
   * @param numberOfItems numberOfItems or {@code null} for none
   */
  public Headers setNumberOfItems(java.util.List<java.lang.String> numberOfItems) {
    this.numberOfItems = numberOfItems;
    return this;
  }

  /**
   * Required. A list of postal group names. The last value can be `"all other locations"`. Example:
   * `["zone 1", "zone 2", "all other locations"]`. The referred postal code groups must match the
   * delivery country of the service. Must be non-empty. Can only be set if all other fields are not
   * set.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPostalCodeGroupNames() {
    return postalCodeGroupNames;
  }

  /**
   * Required. A list of postal group names. The last value can be `"all other locations"`. Example:
   * `["zone 1", "zone 2", "all other locations"]`. The referred postal code groups must match the
   * delivery country of the service. Must be non-empty. Can only be set if all other fields are not
   * set.
   * @param postalCodeGroupNames postalCodeGroupNames or {@code null} for none
   */
  public Headers setPostalCodeGroupNames(java.util.List<java.lang.String> postalCodeGroupNames) {
    this.postalCodeGroupNames = postalCodeGroupNames;
    return this;
  }

  /**
   * Required. A list of inclusive order price upper bounds. The last price's value can be infinity
   * by setting price amount_micros = -1. For example `[{"amount_micros": 10000000, "currency_code":
   * "USD"}, {"amount_micros": 500000000, "currency_code": "USD"}, {"amount_micros": -1,
   * "currency_code": "USD"}]` represents the headers "<= $10", "<= $500", and "> $500". All prices
   * within a service must have the same currency. Must be non-empty. Must be positive except -1.
   * Can only be set if all other fields are not set.
   * @return value or {@code null} for none
   */
  public java.util.List<Price> getPrices() {
    return prices;
  }

  /**
   * Required. A list of inclusive order price upper bounds. The last price's value can be infinity
   * by setting price amount_micros = -1. For example `[{"amount_micros": 10000000, "currency_code":
   * "USD"}, {"amount_micros": 500000000, "currency_code": "USD"}, {"amount_micros": -1,
   * "currency_code": "USD"}]` represents the headers "<= $10", "<= $500", and "> $500". All prices
   * within a service must have the same currency. Must be non-empty. Must be positive except -1.
   * Can only be set if all other fields are not set.
   * @param prices prices or {@code null} for none
   */
  public Headers setPrices(java.util.List<Price> prices) {
    this.prices = prices;
    return this;
  }

  /**
   * Required. A list of inclusive order weight upper bounds. The last weight's value can be
   * infinity by setting price amount_micros = -1. For example `[{"amount_micros": 10000000, "unit":
   * "kg"}, {"amount_micros": 50000000, "unit": "kg"}, {"amount_micros": -1, "unit": "kg"}]`
   * represents the headers "<= 10kg", "<= 50kg", and "> 50kg". All weights within a service must
   * have the same unit. Must be non-empty. Must be positive except -1. Can only be set if all other
   * fields are not set.
   * @return value or {@code null} for none
   */
  public java.util.List<Weight> getWeights() {
    return weights;
  }

  /**
   * Required. A list of inclusive order weight upper bounds. The last weight's value can be
   * infinity by setting price amount_micros = -1. For example `[{"amount_micros": 10000000, "unit":
   * "kg"}, {"amount_micros": 50000000, "unit": "kg"}, {"amount_micros": -1, "unit": "kg"}]`
   * represents the headers "<= 10kg", "<= 50kg", and "> 50kg". All weights within a service must
   * have the same unit. Must be non-empty. Must be positive except -1. Can only be set if all other
   * fields are not set.
   * @param weights weights or {@code null} for none
   */
  public Headers setWeights(java.util.List<Weight> weights) {
    this.weights = weights;
    return this;
  }

  @Override
  public Headers set(String fieldName, Object value) {
    return (Headers) super.set(fieldName, value);
  }

  @Override
  public Headers clone() {
    return (Headers) super.clone();
  }

}
