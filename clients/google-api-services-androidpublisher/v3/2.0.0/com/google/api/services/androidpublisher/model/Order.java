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
 * The Order resource encapsulates comprehensive information about a transaction made on Google
 * Play. It includes a variety of attributes that provide details about the order itself, the
 * products purchased, and the history of events related to the order. The Orders APIs provide real-
 * time access to your order data within the Google Play ecosystem. You can retrieve detailed
 * information and metadata for both one-time and recurring orders, including transaction details
 * like charges, taxes, and refunds, as well as metadata such as pricing phases for subscriptions.
 * The Orders APIs let you automate tasks related to order management, reducing the need for manual
 * checks via the Play Developer Console. The following are some of the use cases for this API: +
 * Real-time order data retrieval - Get order details and metadata immediately after a purchase
 * using an order ID. + Order update synchronization - Periodically sync order updates to maintain
 * an up-to-date record of order information. Note: + The Orders API calls count towards your Play
 * Developer API quota, which defaults to 200K daily, and may be insufficient to sync extensive
 * order histories. + A maximum of 1000 orders can be retrieved per call. Using larger page sizes is
 * recommended to minimize quota usage. Check your quota in the Cloud Console and request more if
 * required.
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
public final class Order extends com.google.api.client.json.GenericJson {

  /**
   * Address information for the customer, for use in tax computation. When Google is the Merchant
   * of Record for the order, only country is shown.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BuyerAddress buyerAddress;

  /**
   * The time when the order was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Your revenue for this order in the buyer's currency, including deductions of partial refunds,
   * taxes and fees. Google deducts standard transaction and third party fees from each sale,
   * including VAT in some regions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Money developerRevenueInBuyerCurrency;

  /**
   * The time of the last event that occurred on the order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastEventTime;

  /**
   * The individual line items making up this order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LineItem> lineItems;

  static {
    // hack to force ProGuard to consider LineItem used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(LineItem.class);
  }

  /**
   * Detailed information about the order at creation time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OrderDetails orderDetails;

  /**
   * Details about events which modified the order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OrderHistory orderHistory;

  /**
   * The order ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orderId;

  /**
   * Play points applied to the order, including offer information, discount rate and point values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PointsDetails pointsDetails;

  /**
   * The token provided to the user's device when the subscription or item was purchased.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String purchaseToken;

  /**
   * The state of the order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The total tax paid as a part of this order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Money tax;

  /**
   * The final amount paid by the customer, taking into account discounts and taxes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Money total;

  /**
   * Address information for the customer, for use in tax computation. When Google is the Merchant
   * of Record for the order, only country is shown.
   * @return value or {@code null} for none
   */
  public BuyerAddress getBuyerAddress() {
    return buyerAddress;
  }

  /**
   * Address information for the customer, for use in tax computation. When Google is the Merchant
   * of Record for the order, only country is shown.
   * @param buyerAddress buyerAddress or {@code null} for none
   */
  public Order setBuyerAddress(BuyerAddress buyerAddress) {
    this.buyerAddress = buyerAddress;
    return this;
  }

  /**
   * The time when the order was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The time when the order was created.
   * @param createTime createTime or {@code null} for none
   */
  public Order setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Your revenue for this order in the buyer's currency, including deductions of partial refunds,
   * taxes and fees. Google deducts standard transaction and third party fees from each sale,
   * including VAT in some regions.
   * @return value or {@code null} for none
   */
  public Money getDeveloperRevenueInBuyerCurrency() {
    return developerRevenueInBuyerCurrency;
  }

  /**
   * Your revenue for this order in the buyer's currency, including deductions of partial refunds,
   * taxes and fees. Google deducts standard transaction and third party fees from each sale,
   * including VAT in some regions.
   * @param developerRevenueInBuyerCurrency developerRevenueInBuyerCurrency or {@code null} for none
   */
  public Order setDeveloperRevenueInBuyerCurrency(Money developerRevenueInBuyerCurrency) {
    this.developerRevenueInBuyerCurrency = developerRevenueInBuyerCurrency;
    return this;
  }

  /**
   * The time of the last event that occurred on the order.
   * @return value or {@code null} for none
   */
  public String getLastEventTime() {
    return lastEventTime;
  }

  /**
   * The time of the last event that occurred on the order.
   * @param lastEventTime lastEventTime or {@code null} for none
   */
  public Order setLastEventTime(String lastEventTime) {
    this.lastEventTime = lastEventTime;
    return this;
  }

  /**
   * The individual line items making up this order.
   * @return value or {@code null} for none
   */
  public java.util.List<LineItem> getLineItems() {
    return lineItems;
  }

  /**
   * The individual line items making up this order.
   * @param lineItems lineItems or {@code null} for none
   */
  public Order setLineItems(java.util.List<LineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  /**
   * Detailed information about the order at creation time.
   * @return value or {@code null} for none
   */
  public OrderDetails getOrderDetails() {
    return orderDetails;
  }

  /**
   * Detailed information about the order at creation time.
   * @param orderDetails orderDetails or {@code null} for none
   */
  public Order setOrderDetails(OrderDetails orderDetails) {
    this.orderDetails = orderDetails;
    return this;
  }

  /**
   * Details about events which modified the order.
   * @return value or {@code null} for none
   */
  public OrderHistory getOrderHistory() {
    return orderHistory;
  }

  /**
   * Details about events which modified the order.
   * @param orderHistory orderHistory or {@code null} for none
   */
  public Order setOrderHistory(OrderHistory orderHistory) {
    this.orderHistory = orderHistory;
    return this;
  }

  /**
   * The order ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrderId() {
    return orderId;
  }

  /**
   * The order ID.
   * @param orderId orderId or {@code null} for none
   */
  public Order setOrderId(java.lang.String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Play points applied to the order, including offer information, discount rate and point values.
   * @return value or {@code null} for none
   */
  public PointsDetails getPointsDetails() {
    return pointsDetails;
  }

  /**
   * Play points applied to the order, including offer information, discount rate and point values.
   * @param pointsDetails pointsDetails or {@code null} for none
   */
  public Order setPointsDetails(PointsDetails pointsDetails) {
    this.pointsDetails = pointsDetails;
    return this;
  }

  /**
   * The token provided to the user's device when the subscription or item was purchased.
   * @return value or {@code null} for none
   */
  public java.lang.String getPurchaseToken() {
    return purchaseToken;
  }

  /**
   * The token provided to the user's device when the subscription or item was purchased.
   * @param purchaseToken purchaseToken or {@code null} for none
   */
  public Order setPurchaseToken(java.lang.String purchaseToken) {
    this.purchaseToken = purchaseToken;
    return this;
  }

  /**
   * The state of the order.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The state of the order.
   * @param state state or {@code null} for none
   */
  public Order setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * The total tax paid as a part of this order.
   * @return value or {@code null} for none
   */
  public Money getTax() {
    return tax;
  }

  /**
   * The total tax paid as a part of this order.
   * @param tax tax or {@code null} for none
   */
  public Order setTax(Money tax) {
    this.tax = tax;
    return this;
  }

  /**
   * The final amount paid by the customer, taking into account discounts and taxes.
   * @return value or {@code null} for none
   */
  public Money getTotal() {
    return total;
  }

  /**
   * The final amount paid by the customer, taking into account discounts and taxes.
   * @param total total or {@code null} for none
   */
  public Order setTotal(Money total) {
    this.total = total;
    return this;
  }

  @Override
  public Order set(String fieldName, Object value) {
    return (Order) super.set(fieldName, value);
  }

  @Override
  public Order clone() {
    return (Order) super.clone();
  }

}
