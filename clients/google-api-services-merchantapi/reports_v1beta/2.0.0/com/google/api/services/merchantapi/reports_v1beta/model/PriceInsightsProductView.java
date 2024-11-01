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

package com.google.api.services.merchantapi.reports_v1beta.model;

/**
 * Fields available for query in `price_insights_product_view` table. [Price
 * insights](https://support.google.com/merchants/answer/11916926) report. Values are only set for
 * fields requested explicitly in the request's search query.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Merchant API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PriceInsightsProductView extends com.google.api.client.json.GenericJson {

  /**
   * Brand of the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String brand;

  /**
   * Product category (1st level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String categoryL1;

  /**
   * Product category (2nd level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String categoryL2;

  /**
   * Product category (3rd level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String categoryL3;

  /**
   * Product category (4th level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String categoryL4;

  /**
   * Product category (5th level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String categoryL5;

  /**
   * The predicted effectiveness of applying the price suggestion, bucketed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String effectiveness;

  /**
   * REST ID of the product, in the form of `channel~languageCode~feedLabel~offerId`. Can be used to
   * join data with the `product_view` table. Required in the `SELECT` clause.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Merchant-provided id of the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String offerId;

  /**
   * Predicted change in clicks as a fraction after introducing the suggested price compared to
   * current active price. For example, 0.05 is a 5% predicted increase in clicks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double predictedClicksChangeFraction;

  /**
   * Predicted change in conversions as a fraction after introducing the suggested price compared to
   * current active price. For example, 0.05 is a 5% predicted increase in conversions).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double predictedConversionsChangeFraction;

  /**
   * Predicted change in impressions as a fraction after introducing the suggested price compared to
   * current active price. For example, 0.05 is a 5% predicted increase in impressions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double predictedImpressionsChangeFraction;

  /**
   * Current price of the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price price;

  /**
   * Product type (1st level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productTypeL1;

  /**
   * Product type (2nd level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productTypeL2;

  /**
   * Product type (3rd level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productTypeL3;

  /**
   * Product type (4th level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productTypeL4;

  /**
   * Product type (5th level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productTypeL5;

  /**
   * Latest suggested price for the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price suggestedPrice;

  /**
   * Title of the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Brand of the product.
   * @return value or {@code null} for none
   */
  public java.lang.String getBrand() {
    return brand;
  }

  /**
   * Brand of the product.
   * @param brand brand or {@code null} for none
   */
  public PriceInsightsProductView setBrand(java.lang.String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Product category (1st level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * @return value or {@code null} for none
   */
  public java.lang.String getCategoryL1() {
    return categoryL1;
  }

  /**
   * Product category (1st level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * @param categoryL1 categoryL1 or {@code null} for none
   */
  public PriceInsightsProductView setCategoryL1(java.lang.String categoryL1) {
    this.categoryL1 = categoryL1;
    return this;
  }

  /**
   * Product category (2nd level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * @return value or {@code null} for none
   */
  public java.lang.String getCategoryL2() {
    return categoryL2;
  }

  /**
   * Product category (2nd level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * @param categoryL2 categoryL2 or {@code null} for none
   */
  public PriceInsightsProductView setCategoryL2(java.lang.String categoryL2) {
    this.categoryL2 = categoryL2;
    return this;
  }

  /**
   * Product category (3rd level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * @return value or {@code null} for none
   */
  public java.lang.String getCategoryL3() {
    return categoryL3;
  }

  /**
   * Product category (3rd level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * @param categoryL3 categoryL3 or {@code null} for none
   */
  public PriceInsightsProductView setCategoryL3(java.lang.String categoryL3) {
    this.categoryL3 = categoryL3;
    return this;
  }

  /**
   * Product category (4th level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * @return value or {@code null} for none
   */
  public java.lang.String getCategoryL4() {
    return categoryL4;
  }

  /**
   * Product category (4th level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * @param categoryL4 categoryL4 or {@code null} for none
   */
  public PriceInsightsProductView setCategoryL4(java.lang.String categoryL4) {
    this.categoryL4 = categoryL4;
    return this;
  }

  /**
   * Product category (5th level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * @return value or {@code null} for none
   */
  public java.lang.String getCategoryL5() {
    return categoryL5;
  }

  /**
   * Product category (5th level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * @param categoryL5 categoryL5 or {@code null} for none
   */
  public PriceInsightsProductView setCategoryL5(java.lang.String categoryL5) {
    this.categoryL5 = categoryL5;
    return this;
  }

  /**
   * The predicted effectiveness of applying the price suggestion, bucketed.
   * @return value or {@code null} for none
   */
  public java.lang.String getEffectiveness() {
    return effectiveness;
  }

  /**
   * The predicted effectiveness of applying the price suggestion, bucketed.
   * @param effectiveness effectiveness or {@code null} for none
   */
  public PriceInsightsProductView setEffectiveness(java.lang.String effectiveness) {
    this.effectiveness = effectiveness;
    return this;
  }

  /**
   * REST ID of the product, in the form of `channel~languageCode~feedLabel~offerId`. Can be used to
   * join data with the `product_view` table. Required in the `SELECT` clause.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * REST ID of the product, in the form of `channel~languageCode~feedLabel~offerId`. Can be used to
   * join data with the `product_view` table. Required in the `SELECT` clause.
   * @param id id or {@code null} for none
   */
  public PriceInsightsProductView setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Merchant-provided id of the product.
   * @return value or {@code null} for none
   */
  public java.lang.String getOfferId() {
    return offerId;
  }

  /**
   * Merchant-provided id of the product.
   * @param offerId offerId or {@code null} for none
   */
  public PriceInsightsProductView setOfferId(java.lang.String offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * Predicted change in clicks as a fraction after introducing the suggested price compared to
   * current active price. For example, 0.05 is a 5% predicted increase in clicks.
   * @return value or {@code null} for none
   */
  public java.lang.Double getPredictedClicksChangeFraction() {
    return predictedClicksChangeFraction;
  }

  /**
   * Predicted change in clicks as a fraction after introducing the suggested price compared to
   * current active price. For example, 0.05 is a 5% predicted increase in clicks.
   * @param predictedClicksChangeFraction predictedClicksChangeFraction or {@code null} for none
   */
  public PriceInsightsProductView setPredictedClicksChangeFraction(java.lang.Double predictedClicksChangeFraction) {
    this.predictedClicksChangeFraction = predictedClicksChangeFraction;
    return this;
  }

  /**
   * Predicted change in conversions as a fraction after introducing the suggested price compared to
   * current active price. For example, 0.05 is a 5% predicted increase in conversions).
   * @return value or {@code null} for none
   */
  public java.lang.Double getPredictedConversionsChangeFraction() {
    return predictedConversionsChangeFraction;
  }

  /**
   * Predicted change in conversions as a fraction after introducing the suggested price compared to
   * current active price. For example, 0.05 is a 5% predicted increase in conversions).
   * @param predictedConversionsChangeFraction predictedConversionsChangeFraction or {@code null} for none
   */
  public PriceInsightsProductView setPredictedConversionsChangeFraction(java.lang.Double predictedConversionsChangeFraction) {
    this.predictedConversionsChangeFraction = predictedConversionsChangeFraction;
    return this;
  }

  /**
   * Predicted change in impressions as a fraction after introducing the suggested price compared to
   * current active price. For example, 0.05 is a 5% predicted increase in impressions.
   * @return value or {@code null} for none
   */
  public java.lang.Double getPredictedImpressionsChangeFraction() {
    return predictedImpressionsChangeFraction;
  }

  /**
   * Predicted change in impressions as a fraction after introducing the suggested price compared to
   * current active price. For example, 0.05 is a 5% predicted increase in impressions.
   * @param predictedImpressionsChangeFraction predictedImpressionsChangeFraction or {@code null} for none
   */
  public PriceInsightsProductView setPredictedImpressionsChangeFraction(java.lang.Double predictedImpressionsChangeFraction) {
    this.predictedImpressionsChangeFraction = predictedImpressionsChangeFraction;
    return this;
  }

  /**
   * Current price of the product.
   * @return value or {@code null} for none
   */
  public Price getPrice() {
    return price;
  }

  /**
   * Current price of the product.
   * @param price price or {@code null} for none
   */
  public PriceInsightsProductView setPrice(Price price) {
    this.price = price;
    return this;
  }

  /**
   * Product type (1st level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * @return value or {@code null} for none
   */
  public java.lang.String getProductTypeL1() {
    return productTypeL1;
  }

  /**
   * Product type (1st level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * @param productTypeL1 productTypeL1 or {@code null} for none
   */
  public PriceInsightsProductView setProductTypeL1(java.lang.String productTypeL1) {
    this.productTypeL1 = productTypeL1;
    return this;
  }

  /**
   * Product type (2nd level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * @return value or {@code null} for none
   */
  public java.lang.String getProductTypeL2() {
    return productTypeL2;
  }

  /**
   * Product type (2nd level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * @param productTypeL2 productTypeL2 or {@code null} for none
   */
  public PriceInsightsProductView setProductTypeL2(java.lang.String productTypeL2) {
    this.productTypeL2 = productTypeL2;
    return this;
  }

  /**
   * Product type (3rd level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * @return value or {@code null} for none
   */
  public java.lang.String getProductTypeL3() {
    return productTypeL3;
  }

  /**
   * Product type (3rd level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * @param productTypeL3 productTypeL3 or {@code null} for none
   */
  public PriceInsightsProductView setProductTypeL3(java.lang.String productTypeL3) {
    this.productTypeL3 = productTypeL3;
    return this;
  }

  /**
   * Product type (4th level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * @return value or {@code null} for none
   */
  public java.lang.String getProductTypeL4() {
    return productTypeL4;
  }

  /**
   * Product type (4th level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * @param productTypeL4 productTypeL4 or {@code null} for none
   */
  public PriceInsightsProductView setProductTypeL4(java.lang.String productTypeL4) {
    this.productTypeL4 = productTypeL4;
    return this;
  }

  /**
   * Product type (5th level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * @return value or {@code null} for none
   */
  public java.lang.String getProductTypeL5() {
    return productTypeL5;
  }

  /**
   * Product type (5th level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * @param productTypeL5 productTypeL5 or {@code null} for none
   */
  public PriceInsightsProductView setProductTypeL5(java.lang.String productTypeL5) {
    this.productTypeL5 = productTypeL5;
    return this;
  }

  /**
   * Latest suggested price for the product.
   * @return value or {@code null} for none
   */
  public Price getSuggestedPrice() {
    return suggestedPrice;
  }

  /**
   * Latest suggested price for the product.
   * @param suggestedPrice suggestedPrice or {@code null} for none
   */
  public PriceInsightsProductView setSuggestedPrice(Price suggestedPrice) {
    this.suggestedPrice = suggestedPrice;
    return this;
  }

  /**
   * Title of the product.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Title of the product.
   * @param title title or {@code null} for none
   */
  public PriceInsightsProductView setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public PriceInsightsProductView set(String fieldName, Object value) {
    return (PriceInsightsProductView) super.set(fieldName, value);
  }

  @Override
  public PriceInsightsProductView clone() {
    return (PriceInsightsProductView) super.clone();
  }

}
