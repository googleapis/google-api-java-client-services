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

package com.google.api.services.androidpublisher.model;

/**
 * Contains item-level info for a ProductPurchaseV2.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Android Developer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProductLineItem extends com.google.api.client.json.GenericJson {

  /**
   * The purchased product ID (for example, 'monthly001').
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productId;

  /**
   * The offer details for this item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ProductOfferDetails productOfferDetails;

  /**
   * The purchased product ID (for example, 'monthly001').
   * @return value or {@code null} for none
   */
  public java.lang.String getProductId() {
    return productId;
  }

  /**
   * The purchased product ID (for example, 'monthly001').
   * @param productId productId or {@code null} for none
   */
  public ProductLineItem setProductId(java.lang.String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The offer details for this item.
   * @return value or {@code null} for none
   */
  public ProductOfferDetails getProductOfferDetails() {
    return productOfferDetails;
  }

  /**
   * The offer details for this item.
   * @param productOfferDetails productOfferDetails or {@code null} for none
   */
  public ProductLineItem setProductOfferDetails(ProductOfferDetails productOfferDetails) {
    this.productOfferDetails = productOfferDetails;
    return this;
  }

  @Override
  public ProductLineItem set(String fieldName, Object value) {
    return (ProductLineItem) super.set(fieldName, value);
  }

  @Override
  public ProductLineItem clone() {
    return (ProductLineItem) super.clone();
  }

}
