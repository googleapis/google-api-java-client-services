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

package com.google.api.services.addressvalidation.v1.model;

/**
 * High level overview of the address validation result and geocode.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Address Validation API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleMapsAddressvalidationV1Verdict extends com.google.api.client.json.GenericJson {

  /**
   * The address is considered complete if there are no unresolved tokens, no unexpected or missing
   * address components. If unset, indicates that the value is `false`. See
   * `missing_component_types`, `unresolved_tokens` or `unexpected` fields for more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean addressComplete;

  /**
   * Information about the granularity of the `geocode`. This can be understood as the semantic
   * meaning of how coarse or fine the geocoded location is. This can differ from the
   * `validation_granularity` above occasionally. For example, our database might record the
   * existence of an apartment number but do not have a precise location for the apartment within a
   * big apartment complex. In that case, the `validation_granularity` will be `SUB_PREMISE` but the
   * `geocode_granularity` will be `PREMISE`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String geocodeGranularity;

  /**
   * At least one address component was inferred (added) that wasn't in the input, see
   * [google.maps.addressvalidation.v1.Address.address_components] for details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hasInferredComponents;

  /**
   * At least one address component was replaced, see
   * [google.maps.addressvalidation.v1.Address.address_components] for details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hasReplacedComponents;

  /**
   * At least one address component cannot be categorized or validated, see
   * [google.maps.addressvalidation.v1.Address.address_components] for details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hasUnconfirmedComponents;

  /**
   * The granularity of the **input** address. This is the result of parsing the input address and
   * does not give any validation signals. For validation signals, refer to `validation_granularity`
   * below. For example, if the input address includes a specific apartment number, then the
   * `input_granularity` here will be `SUB_PREMISE`. If we cannot match the apartment number in the
   * databases or the apartment number is invalid, the `validation_granularity` will likely be
   * `PREMISE` or worse.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inputGranularity;

  /**
   * The granularity level that the API can fully **validate** the address to. For example, an
   * `validation_granularity` of `PREMISE` indicates all address components at the level of
   * `PREMISE` or more coarse can be validated. Per address component validation result can be found
   * in [google.maps.addressvalidation.v1.Address.address_components].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String validationGranularity;

  /**
   * The address is considered complete if there are no unresolved tokens, no unexpected or missing
   * address components. If unset, indicates that the value is `false`. See
   * `missing_component_types`, `unresolved_tokens` or `unexpected` fields for more details.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAddressComplete() {
    return addressComplete;
  }

  /**
   * The address is considered complete if there are no unresolved tokens, no unexpected or missing
   * address components. If unset, indicates that the value is `false`. See
   * `missing_component_types`, `unresolved_tokens` or `unexpected` fields for more details.
   * @param addressComplete addressComplete or {@code null} for none
   */
  public GoogleMapsAddressvalidationV1Verdict setAddressComplete(java.lang.Boolean addressComplete) {
    this.addressComplete = addressComplete;
    return this;
  }

  /**
   * Information about the granularity of the `geocode`. This can be understood as the semantic
   * meaning of how coarse or fine the geocoded location is. This can differ from the
   * `validation_granularity` above occasionally. For example, our database might record the
   * existence of an apartment number but do not have a precise location for the apartment within a
   * big apartment complex. In that case, the `validation_granularity` will be `SUB_PREMISE` but the
   * `geocode_granularity` will be `PREMISE`.
   * @return value or {@code null} for none
   */
  public java.lang.String getGeocodeGranularity() {
    return geocodeGranularity;
  }

  /**
   * Information about the granularity of the `geocode`. This can be understood as the semantic
   * meaning of how coarse or fine the geocoded location is. This can differ from the
   * `validation_granularity` above occasionally. For example, our database might record the
   * existence of an apartment number but do not have a precise location for the apartment within a
   * big apartment complex. In that case, the `validation_granularity` will be `SUB_PREMISE` but the
   * `geocode_granularity` will be `PREMISE`.
   * @param geocodeGranularity geocodeGranularity or {@code null} for none
   */
  public GoogleMapsAddressvalidationV1Verdict setGeocodeGranularity(java.lang.String geocodeGranularity) {
    this.geocodeGranularity = geocodeGranularity;
    return this;
  }

  /**
   * At least one address component was inferred (added) that wasn't in the input, see
   * [google.maps.addressvalidation.v1.Address.address_components] for details.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHasInferredComponents() {
    return hasInferredComponents;
  }

  /**
   * At least one address component was inferred (added) that wasn't in the input, see
   * [google.maps.addressvalidation.v1.Address.address_components] for details.
   * @param hasInferredComponents hasInferredComponents or {@code null} for none
   */
  public GoogleMapsAddressvalidationV1Verdict setHasInferredComponents(java.lang.Boolean hasInferredComponents) {
    this.hasInferredComponents = hasInferredComponents;
    return this;
  }

  /**
   * At least one address component was replaced, see
   * [google.maps.addressvalidation.v1.Address.address_components] for details.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHasReplacedComponents() {
    return hasReplacedComponents;
  }

  /**
   * At least one address component was replaced, see
   * [google.maps.addressvalidation.v1.Address.address_components] for details.
   * @param hasReplacedComponents hasReplacedComponents or {@code null} for none
   */
  public GoogleMapsAddressvalidationV1Verdict setHasReplacedComponents(java.lang.Boolean hasReplacedComponents) {
    this.hasReplacedComponents = hasReplacedComponents;
    return this;
  }

  /**
   * At least one address component cannot be categorized or validated, see
   * [google.maps.addressvalidation.v1.Address.address_components] for details.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHasUnconfirmedComponents() {
    return hasUnconfirmedComponents;
  }

  /**
   * At least one address component cannot be categorized or validated, see
   * [google.maps.addressvalidation.v1.Address.address_components] for details.
   * @param hasUnconfirmedComponents hasUnconfirmedComponents or {@code null} for none
   */
  public GoogleMapsAddressvalidationV1Verdict setHasUnconfirmedComponents(java.lang.Boolean hasUnconfirmedComponents) {
    this.hasUnconfirmedComponents = hasUnconfirmedComponents;
    return this;
  }

  /**
   * The granularity of the **input** address. This is the result of parsing the input address and
   * does not give any validation signals. For validation signals, refer to `validation_granularity`
   * below. For example, if the input address includes a specific apartment number, then the
   * `input_granularity` here will be `SUB_PREMISE`. If we cannot match the apartment number in the
   * databases or the apartment number is invalid, the `validation_granularity` will likely be
   * `PREMISE` or worse.
   * @return value or {@code null} for none
   */
  public java.lang.String getInputGranularity() {
    return inputGranularity;
  }

  /**
   * The granularity of the **input** address. This is the result of parsing the input address and
   * does not give any validation signals. For validation signals, refer to `validation_granularity`
   * below. For example, if the input address includes a specific apartment number, then the
   * `input_granularity` here will be `SUB_PREMISE`. If we cannot match the apartment number in the
   * databases or the apartment number is invalid, the `validation_granularity` will likely be
   * `PREMISE` or worse.
   * @param inputGranularity inputGranularity or {@code null} for none
   */
  public GoogleMapsAddressvalidationV1Verdict setInputGranularity(java.lang.String inputGranularity) {
    this.inputGranularity = inputGranularity;
    return this;
  }

  /**
   * The granularity level that the API can fully **validate** the address to. For example, an
   * `validation_granularity` of `PREMISE` indicates all address components at the level of
   * `PREMISE` or more coarse can be validated. Per address component validation result can be found
   * in [google.maps.addressvalidation.v1.Address.address_components].
   * @return value or {@code null} for none
   */
  public java.lang.String getValidationGranularity() {
    return validationGranularity;
  }

  /**
   * The granularity level that the API can fully **validate** the address to. For example, an
   * `validation_granularity` of `PREMISE` indicates all address components at the level of
   * `PREMISE` or more coarse can be validated. Per address component validation result can be found
   * in [google.maps.addressvalidation.v1.Address.address_components].
   * @param validationGranularity validationGranularity or {@code null} for none
   */
  public GoogleMapsAddressvalidationV1Verdict setValidationGranularity(java.lang.String validationGranularity) {
    this.validationGranularity = validationGranularity;
    return this;
  }

  @Override
  public GoogleMapsAddressvalidationV1Verdict set(String fieldName, Object value) {
    return (GoogleMapsAddressvalidationV1Verdict) super.set(fieldName, value);
  }

  @Override
  public GoogleMapsAddressvalidationV1Verdict clone() {
    return (GoogleMapsAddressvalidationV1Verdict) super.clone();
  }

}
