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
 * The result of validating an address.
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
public final class GoogleMapsAddressvalidationV1ValidationResult extends com.google.api.client.json.GenericJson {

  /**
   * Information about the address itself as opposed to the geocode.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleMapsAddressvalidationV1Address address;

  /**
   * Preview: This feature is in Preview (pre-GA). Pre-GA products and features might have limited
   * support, and changes to pre-GA products and features might not be compatible with other pre-GA
   * versions. Pre-GA Offerings are covered by the [Google Maps Platform Service Specific
   * Terms](https://cloud.google.com/maps-platform/terms/maps-service-terms). For more information,
   * see the [launch stage descriptions](https://developers.google.com/maps/launch-stages). The
   * address translated to English. Translated addresses are not reusable as API input. The service
   * provides them so that the user can use their native language to confirm or deny the validation
   * of the originally-provided address. If part of the address doesn't have an English translation,
   * the service returns that part in an alternate language that uses a Latin script. See
   * [here](https://developers.google.com/maps/documentation/address-validation/convert-addresses-
   * english) for an explanation of how the alternate language is selected. If part of the address
   * doesn't have any translations or transliterations in a language that uses a Latin script, the
   * service returns that part in the local language associated with the address. Enable this output
   * by using the [google.maps.addressvalidation.v1.LanguageOptions.return_english_latin_address]
   * flag. Note: the [google.maps.addressvalidation.v1.Address.unconfirmed_component_types] field in
   * the `english_latin_address` and the
   * [google.maps.addressvalidation.v1.AddressComponent.confirmation_level] fields in
   * `english_latin_address.address_components` are not populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleMapsAddressvalidationV1Address englishLatinAddress;

  /**
   * Information about the location and place that the address geocoded to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleMapsAddressvalidationV1Geocode geocode;

  /**
   * Other information relevant to deliverability. `metadata` is not guaranteed to be fully
   * populated for every address sent to the Address Validation API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleMapsAddressvalidationV1AddressMetadata metadata;

  /**
   * Extra deliverability flags provided by USPS. Only provided in region `US` and `PR`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleMapsAddressvalidationV1UspsData uspsData;

  /**
   * Overall verdict flags
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleMapsAddressvalidationV1Verdict verdict;

  /**
   * Information about the address itself as opposed to the geocode.
   * @return value or {@code null} for none
   */
  public GoogleMapsAddressvalidationV1Address getAddress() {
    return address;
  }

  /**
   * Information about the address itself as opposed to the geocode.
   * @param address address or {@code null} for none
   */
  public GoogleMapsAddressvalidationV1ValidationResult setAddress(GoogleMapsAddressvalidationV1Address address) {
    this.address = address;
    return this;
  }

  /**
   * Preview: This feature is in Preview (pre-GA). Pre-GA products and features might have limited
   * support, and changes to pre-GA products and features might not be compatible with other pre-GA
   * versions. Pre-GA Offerings are covered by the [Google Maps Platform Service Specific
   * Terms](https://cloud.google.com/maps-platform/terms/maps-service-terms). For more information,
   * see the [launch stage descriptions](https://developers.google.com/maps/launch-stages). The
   * address translated to English. Translated addresses are not reusable as API input. The service
   * provides them so that the user can use their native language to confirm or deny the validation
   * of the originally-provided address. If part of the address doesn't have an English translation,
   * the service returns that part in an alternate language that uses a Latin script. See
   * [here](https://developers.google.com/maps/documentation/address-validation/convert-addresses-
   * english) for an explanation of how the alternate language is selected. If part of the address
   * doesn't have any translations or transliterations in a language that uses a Latin script, the
   * service returns that part in the local language associated with the address. Enable this output
   * by using the [google.maps.addressvalidation.v1.LanguageOptions.return_english_latin_address]
   * flag. Note: the [google.maps.addressvalidation.v1.Address.unconfirmed_component_types] field in
   * the `english_latin_address` and the
   * [google.maps.addressvalidation.v1.AddressComponent.confirmation_level] fields in
   * `english_latin_address.address_components` are not populated.
   * @return value or {@code null} for none
   */
  public GoogleMapsAddressvalidationV1Address getEnglishLatinAddress() {
    return englishLatinAddress;
  }

  /**
   * Preview: This feature is in Preview (pre-GA). Pre-GA products and features might have limited
   * support, and changes to pre-GA products and features might not be compatible with other pre-GA
   * versions. Pre-GA Offerings are covered by the [Google Maps Platform Service Specific
   * Terms](https://cloud.google.com/maps-platform/terms/maps-service-terms). For more information,
   * see the [launch stage descriptions](https://developers.google.com/maps/launch-stages). The
   * address translated to English. Translated addresses are not reusable as API input. The service
   * provides them so that the user can use their native language to confirm or deny the validation
   * of the originally-provided address. If part of the address doesn't have an English translation,
   * the service returns that part in an alternate language that uses a Latin script. See
   * [here](https://developers.google.com/maps/documentation/address-validation/convert-addresses-
   * english) for an explanation of how the alternate language is selected. If part of the address
   * doesn't have any translations or transliterations in a language that uses a Latin script, the
   * service returns that part in the local language associated with the address. Enable this output
   * by using the [google.maps.addressvalidation.v1.LanguageOptions.return_english_latin_address]
   * flag. Note: the [google.maps.addressvalidation.v1.Address.unconfirmed_component_types] field in
   * the `english_latin_address` and the
   * [google.maps.addressvalidation.v1.AddressComponent.confirmation_level] fields in
   * `english_latin_address.address_components` are not populated.
   * @param englishLatinAddress englishLatinAddress or {@code null} for none
   */
  public GoogleMapsAddressvalidationV1ValidationResult setEnglishLatinAddress(GoogleMapsAddressvalidationV1Address englishLatinAddress) {
    this.englishLatinAddress = englishLatinAddress;
    return this;
  }

  /**
   * Information about the location and place that the address geocoded to.
   * @return value or {@code null} for none
   */
  public GoogleMapsAddressvalidationV1Geocode getGeocode() {
    return geocode;
  }

  /**
   * Information about the location and place that the address geocoded to.
   * @param geocode geocode or {@code null} for none
   */
  public GoogleMapsAddressvalidationV1ValidationResult setGeocode(GoogleMapsAddressvalidationV1Geocode geocode) {
    this.geocode = geocode;
    return this;
  }

  /**
   * Other information relevant to deliverability. `metadata` is not guaranteed to be fully
   * populated for every address sent to the Address Validation API.
   * @return value or {@code null} for none
   */
  public GoogleMapsAddressvalidationV1AddressMetadata getMetadata() {
    return metadata;
  }

  /**
   * Other information relevant to deliverability. `metadata` is not guaranteed to be fully
   * populated for every address sent to the Address Validation API.
   * @param metadata metadata or {@code null} for none
   */
  public GoogleMapsAddressvalidationV1ValidationResult setMetadata(GoogleMapsAddressvalidationV1AddressMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Extra deliverability flags provided by USPS. Only provided in region `US` and `PR`.
   * @return value or {@code null} for none
   */
  public GoogleMapsAddressvalidationV1UspsData getUspsData() {
    return uspsData;
  }

  /**
   * Extra deliverability flags provided by USPS. Only provided in region `US` and `PR`.
   * @param uspsData uspsData or {@code null} for none
   */
  public GoogleMapsAddressvalidationV1ValidationResult setUspsData(GoogleMapsAddressvalidationV1UspsData uspsData) {
    this.uspsData = uspsData;
    return this;
  }

  /**
   * Overall verdict flags
   * @return value or {@code null} for none
   */
  public GoogleMapsAddressvalidationV1Verdict getVerdict() {
    return verdict;
  }

  /**
   * Overall verdict flags
   * @param verdict verdict or {@code null} for none
   */
  public GoogleMapsAddressvalidationV1ValidationResult setVerdict(GoogleMapsAddressvalidationV1Verdict verdict) {
    this.verdict = verdict;
    return this;
  }

  @Override
  public GoogleMapsAddressvalidationV1ValidationResult set(String fieldName, Object value) {
    return (GoogleMapsAddressvalidationV1ValidationResult) super.set(fieldName, value);
  }

  @Override
  public GoogleMapsAddressvalidationV1ValidationResult clone() {
    return (GoogleMapsAddressvalidationV1ValidationResult) super.clone();
  }

}
