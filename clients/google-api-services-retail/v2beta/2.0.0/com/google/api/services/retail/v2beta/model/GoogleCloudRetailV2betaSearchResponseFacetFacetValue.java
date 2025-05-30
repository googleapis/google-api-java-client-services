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

package com.google.api.services.retail.v2beta.model;

/**
 * A facet value which contains value names and their count.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI Search for commerce API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2betaSearchResponseFacetFacetValue extends com.google.api.client.json.GenericJson {

  /**
   * Number of items that have this facet value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long count;

  /**
   * Interval value for a facet, such as [10, 20) for facet "price".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2betaInterval interval;

  /**
   * The maximum value in the FacetValue.interval. Only supported on numerical facets and returned
   * if SearchRequest.FacetSpec.FacetKey.return_min_max is true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double maxValue;

  /**
   * The minimum value in the FacetValue.interval. Only supported on numerical facets and returned
   * if SearchRequest.FacetSpec.FacetKey.return_min_max is true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double minValue;

  /**
   * Text value of a facet, such as "Black" for facet "colorFamilies".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * Number of items that have this facet value.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCount() {
    return count;
  }

  /**
   * Number of items that have this facet value.
   * @param count count or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchResponseFacetFacetValue setCount(java.lang.Long count) {
    this.count = count;
    return this;
  }

  /**
   * Interval value for a facet, such as [10, 20) for facet "price".
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2betaInterval getInterval() {
    return interval;
  }

  /**
   * Interval value for a facet, such as [10, 20) for facet "price".
   * @param interval interval or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchResponseFacetFacetValue setInterval(GoogleCloudRetailV2betaInterval interval) {
    this.interval = interval;
    return this;
  }

  /**
   * The maximum value in the FacetValue.interval. Only supported on numerical facets and returned
   * if SearchRequest.FacetSpec.FacetKey.return_min_max is true.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMaxValue() {
    return maxValue;
  }

  /**
   * The maximum value in the FacetValue.interval. Only supported on numerical facets and returned
   * if SearchRequest.FacetSpec.FacetKey.return_min_max is true.
   * @param maxValue maxValue or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchResponseFacetFacetValue setMaxValue(java.lang.Double maxValue) {
    this.maxValue = maxValue;
    return this;
  }

  /**
   * The minimum value in the FacetValue.interval. Only supported on numerical facets and returned
   * if SearchRequest.FacetSpec.FacetKey.return_min_max is true.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMinValue() {
    return minValue;
  }

  /**
   * The minimum value in the FacetValue.interval. Only supported on numerical facets and returned
   * if SearchRequest.FacetSpec.FacetKey.return_min_max is true.
   * @param minValue minValue or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchResponseFacetFacetValue setMinValue(java.lang.Double minValue) {
    this.minValue = minValue;
    return this;
  }

  /**
   * Text value of a facet, such as "Black" for facet "colorFamilies".
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * Text value of a facet, such as "Black" for facet "colorFamilies".
   * @param value value or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchResponseFacetFacetValue setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public GoogleCloudRetailV2betaSearchResponseFacetFacetValue set(String fieldName, Object value) {
    return (GoogleCloudRetailV2betaSearchResponseFacetFacetValue) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2betaSearchResponseFacetFacetValue clone() {
    return (GoogleCloudRetailV2betaSearchResponseFacetFacetValue) super.clone();
  }

}
