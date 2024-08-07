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
 * A ProductPurchase resource indicates the status of a user's inapp product purchase.
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
public final class ProductPurchase extends com.google.api.client.json.GenericJson {

  /**
   * The acknowledgement state of the inapp product. Possible values are: 0. Yet to be acknowledged
   * 1. Acknowledged
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer acknowledgementState;

  /**
   * The consumption state of the inapp product. Possible values are: 0. Yet to be consumed 1.
   * Consumed
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer consumptionState;

  /**
   * A developer-specified string that contains supplemental information about an order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String developerPayload;

  /**
   * This kind represents an inappPurchase object in the androidpublisher service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * An obfuscated version of the id that is uniquely associated with the user's account in your
   * app. Only present if specified using https://developer.android.com/reference/com/android/billin
   * gclient/api/BillingFlowParams.Builder#setobfuscatedaccountid when the purchase was made.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String obfuscatedExternalAccountId;

  /**
   * An obfuscated version of the id that is uniquely associated with the user's profile in your
   * app. Only present if specified using https://developer.android.com/reference/com/android/billin
   * gclient/api/BillingFlowParams.Builder#setobfuscatedprofileid when the purchase was made.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String obfuscatedExternalProfileId;

  /**
   * The order id associated with the purchase of the inapp product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orderId;

  /**
   * The inapp product SKU. May not be present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productId;

  /**
   * The purchase state of the order. Possible values are: 0. Purchased 1. Canceled 2. Pending
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer purchaseState;

  /**
   * The time the product was purchased, in milliseconds since the epoch (Jan 1, 1970).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long purchaseTimeMillis;

  /**
   * The purchase token generated to identify this purchase. May not be present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String purchaseToken;

  /**
   * The type of purchase of the inapp product. This field is only set if this purchase was not made
   * using the standard in-app billing flow. Possible values are: 0. Test (i.e. purchased from a
   * license testing account) 1. Promo (i.e. purchased using a promo code). Does not include Play
   * Points purchases. 2. Rewarded (i.e. from watching a video ad instead of paying)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer purchaseType;

  /**
   * The quantity associated with the purchase of the inapp product. If not present, the quantity is
   * 1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer quantity;

  /**
   * The quantity eligible for refund, i.e. quantity that hasn't been refunded. The value reflects
   * quantity-based partial refunds and full refunds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer refundableQuantity;

  /**
   * ISO 3166-1 alpha-2 billing region code of the user at the time the product was granted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String regionCode;

  /**
   * The acknowledgement state of the inapp product. Possible values are: 0. Yet to be acknowledged
   * 1. Acknowledged
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAcknowledgementState() {
    return acknowledgementState;
  }

  /**
   * The acknowledgement state of the inapp product. Possible values are: 0. Yet to be acknowledged
   * 1. Acknowledged
   * @param acknowledgementState acknowledgementState or {@code null} for none
   */
  public ProductPurchase setAcknowledgementState(java.lang.Integer acknowledgementState) {
    this.acknowledgementState = acknowledgementState;
    return this;
  }

  /**
   * The consumption state of the inapp product. Possible values are: 0. Yet to be consumed 1.
   * Consumed
   * @return value or {@code null} for none
   */
  public java.lang.Integer getConsumptionState() {
    return consumptionState;
  }

  /**
   * The consumption state of the inapp product. Possible values are: 0. Yet to be consumed 1.
   * Consumed
   * @param consumptionState consumptionState or {@code null} for none
   */
  public ProductPurchase setConsumptionState(java.lang.Integer consumptionState) {
    this.consumptionState = consumptionState;
    return this;
  }

  /**
   * A developer-specified string that contains supplemental information about an order.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeveloperPayload() {
    return developerPayload;
  }

  /**
   * A developer-specified string that contains supplemental information about an order.
   * @param developerPayload developerPayload or {@code null} for none
   */
  public ProductPurchase setDeveloperPayload(java.lang.String developerPayload) {
    this.developerPayload = developerPayload;
    return this;
  }

  /**
   * This kind represents an inappPurchase object in the androidpublisher service.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This kind represents an inappPurchase object in the androidpublisher service.
   * @param kind kind or {@code null} for none
   */
  public ProductPurchase setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * An obfuscated version of the id that is uniquely associated with the user's account in your
   * app. Only present if specified using https://developer.android.com/reference/com/android/billin
   * gclient/api/BillingFlowParams.Builder#setobfuscatedaccountid when the purchase was made.
   * @return value or {@code null} for none
   */
  public java.lang.String getObfuscatedExternalAccountId() {
    return obfuscatedExternalAccountId;
  }

  /**
   * An obfuscated version of the id that is uniquely associated with the user's account in your
   * app. Only present if specified using https://developer.android.com/reference/com/android/billin
   * gclient/api/BillingFlowParams.Builder#setobfuscatedaccountid when the purchase was made.
   * @param obfuscatedExternalAccountId obfuscatedExternalAccountId or {@code null} for none
   */
  public ProductPurchase setObfuscatedExternalAccountId(java.lang.String obfuscatedExternalAccountId) {
    this.obfuscatedExternalAccountId = obfuscatedExternalAccountId;
    return this;
  }

  /**
   * An obfuscated version of the id that is uniquely associated with the user's profile in your
   * app. Only present if specified using https://developer.android.com/reference/com/android/billin
   * gclient/api/BillingFlowParams.Builder#setobfuscatedprofileid when the purchase was made.
   * @return value or {@code null} for none
   */
  public java.lang.String getObfuscatedExternalProfileId() {
    return obfuscatedExternalProfileId;
  }

  /**
   * An obfuscated version of the id that is uniquely associated with the user's profile in your
   * app. Only present if specified using https://developer.android.com/reference/com/android/billin
   * gclient/api/BillingFlowParams.Builder#setobfuscatedprofileid when the purchase was made.
   * @param obfuscatedExternalProfileId obfuscatedExternalProfileId or {@code null} for none
   */
  public ProductPurchase setObfuscatedExternalProfileId(java.lang.String obfuscatedExternalProfileId) {
    this.obfuscatedExternalProfileId = obfuscatedExternalProfileId;
    return this;
  }

  /**
   * The order id associated with the purchase of the inapp product.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrderId() {
    return orderId;
  }

  /**
   * The order id associated with the purchase of the inapp product.
   * @param orderId orderId or {@code null} for none
   */
  public ProductPurchase setOrderId(java.lang.String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * The inapp product SKU. May not be present.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductId() {
    return productId;
  }

  /**
   * The inapp product SKU. May not be present.
   * @param productId productId or {@code null} for none
   */
  public ProductPurchase setProductId(java.lang.String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The purchase state of the order. Possible values are: 0. Purchased 1. Canceled 2. Pending
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPurchaseState() {
    return purchaseState;
  }

  /**
   * The purchase state of the order. Possible values are: 0. Purchased 1. Canceled 2. Pending
   * @param purchaseState purchaseState or {@code null} for none
   */
  public ProductPurchase setPurchaseState(java.lang.Integer purchaseState) {
    this.purchaseState = purchaseState;
    return this;
  }

  /**
   * The time the product was purchased, in milliseconds since the epoch (Jan 1, 1970).
   * @return value or {@code null} for none
   */
  public java.lang.Long getPurchaseTimeMillis() {
    return purchaseTimeMillis;
  }

  /**
   * The time the product was purchased, in milliseconds since the epoch (Jan 1, 1970).
   * @param purchaseTimeMillis purchaseTimeMillis or {@code null} for none
   */
  public ProductPurchase setPurchaseTimeMillis(java.lang.Long purchaseTimeMillis) {
    this.purchaseTimeMillis = purchaseTimeMillis;
    return this;
  }

  /**
   * The purchase token generated to identify this purchase. May not be present.
   * @return value or {@code null} for none
   */
  public java.lang.String getPurchaseToken() {
    return purchaseToken;
  }

  /**
   * The purchase token generated to identify this purchase. May not be present.
   * @param purchaseToken purchaseToken or {@code null} for none
   */
  public ProductPurchase setPurchaseToken(java.lang.String purchaseToken) {
    this.purchaseToken = purchaseToken;
    return this;
  }

  /**
   * The type of purchase of the inapp product. This field is only set if this purchase was not made
   * using the standard in-app billing flow. Possible values are: 0. Test (i.e. purchased from a
   * license testing account) 1. Promo (i.e. purchased using a promo code). Does not include Play
   * Points purchases. 2. Rewarded (i.e. from watching a video ad instead of paying)
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPurchaseType() {
    return purchaseType;
  }

  /**
   * The type of purchase of the inapp product. This field is only set if this purchase was not made
   * using the standard in-app billing flow. Possible values are: 0. Test (i.e. purchased from a
   * license testing account) 1. Promo (i.e. purchased using a promo code). Does not include Play
   * Points purchases. 2. Rewarded (i.e. from watching a video ad instead of paying)
   * @param purchaseType purchaseType or {@code null} for none
   */
  public ProductPurchase setPurchaseType(java.lang.Integer purchaseType) {
    this.purchaseType = purchaseType;
    return this;
  }

  /**
   * The quantity associated with the purchase of the inapp product. If not present, the quantity is
   * 1.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getQuantity() {
    return quantity;
  }

  /**
   * The quantity associated with the purchase of the inapp product. If not present, the quantity is
   * 1.
   * @param quantity quantity or {@code null} for none
   */
  public ProductPurchase setQuantity(java.lang.Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The quantity eligible for refund, i.e. quantity that hasn't been refunded. The value reflects
   * quantity-based partial refunds and full refunds.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRefundableQuantity() {
    return refundableQuantity;
  }

  /**
   * The quantity eligible for refund, i.e. quantity that hasn't been refunded. The value reflects
   * quantity-based partial refunds and full refunds.
   * @param refundableQuantity refundableQuantity or {@code null} for none
   */
  public ProductPurchase setRefundableQuantity(java.lang.Integer refundableQuantity) {
    this.refundableQuantity = refundableQuantity;
    return this;
  }

  /**
   * ISO 3166-1 alpha-2 billing region code of the user at the time the product was granted.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegionCode() {
    return regionCode;
  }

  /**
   * ISO 3166-1 alpha-2 billing region code of the user at the time the product was granted.
   * @param regionCode regionCode or {@code null} for none
   */
  public ProductPurchase setRegionCode(java.lang.String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

  @Override
  public ProductPurchase set(String fieldName, Object value) {
    return (ProductPurchase) super.set(fieldName, value);
  }

  @Override
  public ProductPurchase clone() {
    return (ProductPurchase) super.clone();
  }

}
