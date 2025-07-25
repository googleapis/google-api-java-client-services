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

package com.google.api.services.cloudchannel.v1.model;

/**
 * Represents a postal address, such as for postal delivery or payments addresses. With a postal
 * address, a postal service can deliver items to a premise, P.O. box, or similar. A postal address
 * is not intended to model geographical locations like roads, towns, or mountains. In typical
 * usage, an address would be created by user input or from importing existing data, depending on
 * the type of process. Advice on address input or editing: - Use an internationalization-ready
 * address widget such as https://github.com/google/libaddressinput. - Users should not be presented
 * with UI elements for input or editing of fields outside countries where that field is used. For
 * more guidance on how to use this schema, see: https://support.google.com/business/answer/6397478.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Channel API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleTypePostalAddress extends com.google.api.client.json.GenericJson {

  /**
   * Unstructured address lines describing the lower levels of an address. Because values in
   * `address_lines` do not have type information and may sometimes contain multiple values in a
   * single field (for example, "Austin, TX"), it is important that the line order is clear. The
   * order of address lines should be "envelope order" for the country or region of the address. In
   * places where this can vary (for example, Japan), `address_language` is used to make it explicit
   * (for example, "ja" for large-to-small ordering and "ja-Latn" or "en" for small-to-large). In
   * this way, the most specific line of an address can be selected based on the language. The
   * minimum permitted structural representation of an address consists of a `region_code` with all
   * remaining information placed in the `address_lines`. It would be possible to format such an
   * address very approximately without geocoding, but no semantic reasoning could be made about any
   * of the address components until it was at least partially resolved. Creating an address only
   * containing a `region_code` and `address_lines` and then geocoding is the recommended way to
   * handle completely unstructured addresses (as opposed to guessing which parts of the address
   * should be localities or administrative areas).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> addressLines;

  /**
   * Optional. Highest administrative subdivision which is used for postal addresses of a country or
   * region. For example, this can be a state, a province, an oblast, or a prefecture. For Spain,
   * this is the province and not the autonomous community (for example, "Barcelona" and not
   * "Catalonia"). Many countries don't use an administrative area in postal addresses. For example,
   * in Switzerland, this should be left unpopulated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String administrativeArea;

  /**
   * Optional. BCP-47 language code of the contents of this address (if known). This is often the UI
   * language of the input form or is expected to match one of the languages used in the address'
   * country/region, or their transliterated equivalents. This can affect formatting in certain
   * countries, but is not critical to the correctness of the data and will never affect any
   * validation or other non-formatting related operations. If this value is not known, it should be
   * omitted (rather than specifying a possibly incorrect default). Examples: "zh-Hant", "ja", "ja-
   * Latn", "en".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * Optional. Generally refers to the city or town portion of the address. Examples: US city, IT
   * comune, UK post town. In regions of the world where localities are not well defined or do not
   * fit into this structure well, leave `locality` empty and use `address_lines`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locality;

  /**
   * Optional. The name of the organization at the address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String organization;

  /**
   * Optional. Postal code of the address. Not all countries use or require postal codes to be
   * present, but where they are used, they may trigger additional validation with other parts of
   * the address (for example, state or zip code validation in the United States).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String postalCode;

  /**
   * Optional. The recipient at the address. This field may, under certain circumstances, contain
   * multiline information. For example, it might contain "care of" information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> recipients;

  /**
   * Required. CLDR region code of the country/region of the address. This is never inferred and it
   * is up to the user to ensure the value is correct. See https://cldr.unicode.org/ and
   * https://www.unicode.org/cldr/charts/30/supplemental/territory_information.html for details.
   * Example: "CH" for Switzerland.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String regionCode;

  /**
   * The schema revision of the `PostalAddress`. This must be set to 0, which is the latest
   * revision. All new revisions **must** be backward compatible with old revisions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer revision;

  /**
   * Optional. Additional, country-specific, sorting code. This is not used in most regions. Where
   * it is used, the value is either a string like "CEDEX", optionally followed by a number (for
   * example, "CEDEX 7"), or just a number alone, representing the "sector code" (Jamaica),
   * "delivery area indicator" (Malawi) or "post office indicator" (Côte d'Ivoire).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sortingCode;

  /**
   * Optional. Sublocality of the address. For example, this can be a neighborhood, borough, or
   * district.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sublocality;

  /**
   * Unstructured address lines describing the lower levels of an address. Because values in
   * `address_lines` do not have type information and may sometimes contain multiple values in a
   * single field (for example, "Austin, TX"), it is important that the line order is clear. The
   * order of address lines should be "envelope order" for the country or region of the address. In
   * places where this can vary (for example, Japan), `address_language` is used to make it explicit
   * (for example, "ja" for large-to-small ordering and "ja-Latn" or "en" for small-to-large). In
   * this way, the most specific line of an address can be selected based on the language. The
   * minimum permitted structural representation of an address consists of a `region_code` with all
   * remaining information placed in the `address_lines`. It would be possible to format such an
   * address very approximately without geocoding, but no semantic reasoning could be made about any
   * of the address components until it was at least partially resolved. Creating an address only
   * containing a `region_code` and `address_lines` and then geocoding is the recommended way to
   * handle completely unstructured addresses (as opposed to guessing which parts of the address
   * should be localities or administrative areas).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAddressLines() {
    return addressLines;
  }

  /**
   * Unstructured address lines describing the lower levels of an address. Because values in
   * `address_lines` do not have type information and may sometimes contain multiple values in a
   * single field (for example, "Austin, TX"), it is important that the line order is clear. The
   * order of address lines should be "envelope order" for the country or region of the address. In
   * places where this can vary (for example, Japan), `address_language` is used to make it explicit
   * (for example, "ja" for large-to-small ordering and "ja-Latn" or "en" for small-to-large). In
   * this way, the most specific line of an address can be selected based on the language. The
   * minimum permitted structural representation of an address consists of a `region_code` with all
   * remaining information placed in the `address_lines`. It would be possible to format such an
   * address very approximately without geocoding, but no semantic reasoning could be made about any
   * of the address components until it was at least partially resolved. Creating an address only
   * containing a `region_code` and `address_lines` and then geocoding is the recommended way to
   * handle completely unstructured addresses (as opposed to guessing which parts of the address
   * should be localities or administrative areas).
   * @param addressLines addressLines or {@code null} for none
   */
  public GoogleTypePostalAddress setAddressLines(java.util.List<java.lang.String> addressLines) {
    this.addressLines = addressLines;
    return this;
  }

  /**
   * Optional. Highest administrative subdivision which is used for postal addresses of a country or
   * region. For example, this can be a state, a province, an oblast, or a prefecture. For Spain,
   * this is the province and not the autonomous community (for example, "Barcelona" and not
   * "Catalonia"). Many countries don't use an administrative area in postal addresses. For example,
   * in Switzerland, this should be left unpopulated.
   * @return value or {@code null} for none
   */
  public java.lang.String getAdministrativeArea() {
    return administrativeArea;
  }

  /**
   * Optional. Highest administrative subdivision which is used for postal addresses of a country or
   * region. For example, this can be a state, a province, an oblast, or a prefecture. For Spain,
   * this is the province and not the autonomous community (for example, "Barcelona" and not
   * "Catalonia"). Many countries don't use an administrative area in postal addresses. For example,
   * in Switzerland, this should be left unpopulated.
   * @param administrativeArea administrativeArea or {@code null} for none
   */
  public GoogleTypePostalAddress setAdministrativeArea(java.lang.String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

  /**
   * Optional. BCP-47 language code of the contents of this address (if known). This is often the UI
   * language of the input form or is expected to match one of the languages used in the address'
   * country/region, or their transliterated equivalents. This can affect formatting in certain
   * countries, but is not critical to the correctness of the data and will never affect any
   * validation or other non-formatting related operations. If this value is not known, it should be
   * omitted (rather than specifying a possibly incorrect default). Examples: "zh-Hant", "ja", "ja-
   * Latn", "en".
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * Optional. BCP-47 language code of the contents of this address (if known). This is often the UI
   * language of the input form or is expected to match one of the languages used in the address'
   * country/region, or their transliterated equivalents. This can affect formatting in certain
   * countries, but is not critical to the correctness of the data and will never affect any
   * validation or other non-formatting related operations. If this value is not known, it should be
   * omitted (rather than specifying a possibly incorrect default). Examples: "zh-Hant", "ja", "ja-
   * Latn", "en".
   * @param languageCode languageCode or {@code null} for none
   */
  public GoogleTypePostalAddress setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Optional. Generally refers to the city or town portion of the address. Examples: US city, IT
   * comune, UK post town. In regions of the world where localities are not well defined or do not
   * fit into this structure well, leave `locality` empty and use `address_lines`.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocality() {
    return locality;
  }

  /**
   * Optional. Generally refers to the city or town portion of the address. Examples: US city, IT
   * comune, UK post town. In regions of the world where localities are not well defined or do not
   * fit into this structure well, leave `locality` empty and use `address_lines`.
   * @param locality locality or {@code null} for none
   */
  public GoogleTypePostalAddress setLocality(java.lang.String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * Optional. The name of the organization at the address.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrganization() {
    return organization;
  }

  /**
   * Optional. The name of the organization at the address.
   * @param organization organization or {@code null} for none
   */
  public GoogleTypePostalAddress setOrganization(java.lang.String organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Optional. Postal code of the address. Not all countries use or require postal codes to be
   * present, but where they are used, they may trigger additional validation with other parts of
   * the address (for example, state or zip code validation in the United States).
   * @return value or {@code null} for none
   */
  public java.lang.String getPostalCode() {
    return postalCode;
  }

  /**
   * Optional. Postal code of the address. Not all countries use or require postal codes to be
   * present, but where they are used, they may trigger additional validation with other parts of
   * the address (for example, state or zip code validation in the United States).
   * @param postalCode postalCode or {@code null} for none
   */
  public GoogleTypePostalAddress setPostalCode(java.lang.String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Optional. The recipient at the address. This field may, under certain circumstances, contain
   * multiline information. For example, it might contain "care of" information.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRecipients() {
    return recipients;
  }

  /**
   * Optional. The recipient at the address. This field may, under certain circumstances, contain
   * multiline information. For example, it might contain "care of" information.
   * @param recipients recipients or {@code null} for none
   */
  public GoogleTypePostalAddress setRecipients(java.util.List<java.lang.String> recipients) {
    this.recipients = recipients;
    return this;
  }

  /**
   * Required. CLDR region code of the country/region of the address. This is never inferred and it
   * is up to the user to ensure the value is correct. See https://cldr.unicode.org/ and
   * https://www.unicode.org/cldr/charts/30/supplemental/territory_information.html for details.
   * Example: "CH" for Switzerland.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegionCode() {
    return regionCode;
  }

  /**
   * Required. CLDR region code of the country/region of the address. This is never inferred and it
   * is up to the user to ensure the value is correct. See https://cldr.unicode.org/ and
   * https://www.unicode.org/cldr/charts/30/supplemental/territory_information.html for details.
   * Example: "CH" for Switzerland.
   * @param regionCode regionCode or {@code null} for none
   */
  public GoogleTypePostalAddress setRegionCode(java.lang.String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

  /**
   * The schema revision of the `PostalAddress`. This must be set to 0, which is the latest
   * revision. All new revisions **must** be backward compatible with old revisions.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRevision() {
    return revision;
  }

  /**
   * The schema revision of the `PostalAddress`. This must be set to 0, which is the latest
   * revision. All new revisions **must** be backward compatible with old revisions.
   * @param revision revision or {@code null} for none
   */
  public GoogleTypePostalAddress setRevision(java.lang.Integer revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Optional. Additional, country-specific, sorting code. This is not used in most regions. Where
   * it is used, the value is either a string like "CEDEX", optionally followed by a number (for
   * example, "CEDEX 7"), or just a number alone, representing the "sector code" (Jamaica),
   * "delivery area indicator" (Malawi) or "post office indicator" (Côte d'Ivoire).
   * @return value or {@code null} for none
   */
  public java.lang.String getSortingCode() {
    return sortingCode;
  }

  /**
   * Optional. Additional, country-specific, sorting code. This is not used in most regions. Where
   * it is used, the value is either a string like "CEDEX", optionally followed by a number (for
   * example, "CEDEX 7"), or just a number alone, representing the "sector code" (Jamaica),
   * "delivery area indicator" (Malawi) or "post office indicator" (Côte d'Ivoire).
   * @param sortingCode sortingCode or {@code null} for none
   */
  public GoogleTypePostalAddress setSortingCode(java.lang.String sortingCode) {
    this.sortingCode = sortingCode;
    return this;
  }

  /**
   * Optional. Sublocality of the address. For example, this can be a neighborhood, borough, or
   * district.
   * @return value or {@code null} for none
   */
  public java.lang.String getSublocality() {
    return sublocality;
  }

  /**
   * Optional. Sublocality of the address. For example, this can be a neighborhood, borough, or
   * district.
   * @param sublocality sublocality or {@code null} for none
   */
  public GoogleTypePostalAddress setSublocality(java.lang.String sublocality) {
    this.sublocality = sublocality;
    return this;
  }

  @Override
  public GoogleTypePostalAddress set(String fieldName, Object value) {
    return (GoogleTypePostalAddress) super.set(fieldName, value);
  }

  @Override
  public GoogleTypePostalAddress clone() {
    return (GoogleTypePostalAddress) super.clone();
  }

}
