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

package com.google.api.services.retail.v2alpha.model;

/**
 * A statistic about the number of products in a branch.
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
public final class GoogleCloudRetailV2alphaBranchProductCountStatistic extends com.google.api.client.json.GenericJson {

  /**
   * The number of products in scope broken down into different groups. The key is a group
   * representing a set of products, and the value is the number of products in that group. Note:
   * keys in this map may change over time. Possible keys: * "primary-in-stock", products have
   * Product.Type.PRIMARY type and Product.Availability.IN_STOCK availability. * "primary-out-of-
   * stock", products have Product.Type.PRIMARY type and Product.Availability.OUT_OF_STOCK
   * availability. * "primary-preorder", products have Product.Type.PRIMARY type and
   * Product.Availability.PREORDER availability. * "primary-backorder", products have
   * Product.Type.PRIMARY type and Product.Availability.BACKORDER availability. * "variant-in-
   * stock", products have Product.Type.VARIANT type and Product.Availability.IN_STOCK availability.
   * * "variant-out-of-stock", products have Product.Type.VARIANT type and
   * Product.Availability.OUT_OF_STOCK availability. * "variant-preorder", products have
   * Product.Type.VARIANT type and Product.Availability.PREORDER availability. * "variant-
   * backorder", products have Product.Type.VARIANT type and Product.Availability.BACKORDER
   * availability. * "price-discounted", products have [Product.price_info.price] <
   * [Product.price_info.original_price].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.Map<String, java.lang.Long> counts;

  /**
   * [ProductCountScope] of the [counts].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scope;

  /**
   * The number of products in scope broken down into different groups. The key is a group
   * representing a set of products, and the value is the number of products in that group. Note:
   * keys in this map may change over time. Possible keys: * "primary-in-stock", products have
   * Product.Type.PRIMARY type and Product.Availability.IN_STOCK availability. * "primary-out-of-
   * stock", products have Product.Type.PRIMARY type and Product.Availability.OUT_OF_STOCK
   * availability. * "primary-preorder", products have Product.Type.PRIMARY type and
   * Product.Availability.PREORDER availability. * "primary-backorder", products have
   * Product.Type.PRIMARY type and Product.Availability.BACKORDER availability. * "variant-in-
   * stock", products have Product.Type.VARIANT type and Product.Availability.IN_STOCK availability.
   * * "variant-out-of-stock", products have Product.Type.VARIANT type and
   * Product.Availability.OUT_OF_STOCK availability. * "variant-preorder", products have
   * Product.Type.VARIANT type and Product.Availability.PREORDER availability. * "variant-
   * backorder", products have Product.Type.VARIANT type and Product.Availability.BACKORDER
   * availability. * "price-discounted", products have [Product.price_info.price] <
   * [Product.price_info.original_price].
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Long> getCounts() {
    return counts;
  }

  /**
   * The number of products in scope broken down into different groups. The key is a group
   * representing a set of products, and the value is the number of products in that group. Note:
   * keys in this map may change over time. Possible keys: * "primary-in-stock", products have
   * Product.Type.PRIMARY type and Product.Availability.IN_STOCK availability. * "primary-out-of-
   * stock", products have Product.Type.PRIMARY type and Product.Availability.OUT_OF_STOCK
   * availability. * "primary-preorder", products have Product.Type.PRIMARY type and
   * Product.Availability.PREORDER availability. * "primary-backorder", products have
   * Product.Type.PRIMARY type and Product.Availability.BACKORDER availability. * "variant-in-
   * stock", products have Product.Type.VARIANT type and Product.Availability.IN_STOCK availability.
   * * "variant-out-of-stock", products have Product.Type.VARIANT type and
   * Product.Availability.OUT_OF_STOCK availability. * "variant-preorder", products have
   * Product.Type.VARIANT type and Product.Availability.PREORDER availability. * "variant-
   * backorder", products have Product.Type.VARIANT type and Product.Availability.BACKORDER
   * availability. * "price-discounted", products have [Product.price_info.price] <
   * [Product.price_info.original_price].
   * @param counts counts or {@code null} for none
   */
  public GoogleCloudRetailV2alphaBranchProductCountStatistic setCounts(java.util.Map<String, java.lang.Long> counts) {
    this.counts = counts;
    return this;
  }

  /**
   * [ProductCountScope] of the [counts].
   * @return value or {@code null} for none
   */
  public java.lang.String getScope() {
    return scope;
  }

  /**
   * [ProductCountScope] of the [counts].
   * @param scope scope or {@code null} for none
   */
  public GoogleCloudRetailV2alphaBranchProductCountStatistic setScope(java.lang.String scope) {
    this.scope = scope;
    return this;
  }

  @Override
  public GoogleCloudRetailV2alphaBranchProductCountStatistic set(String fieldName, Object value) {
    return (GoogleCloudRetailV2alphaBranchProductCountStatistic) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2alphaBranchProductCountStatistic clone() {
    return (GoogleCloudRetailV2alphaBranchProductCountStatistic) super.clone();
  }

}
