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

package com.google.api.services.merchantapi.products_v1beta.model;

/**
 * Response message for the ListProducts method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Merchant API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListProductsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The processed products from the specified account. These are your processed products after
   * applying rules and supplemental data sources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Product> products;

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListProductsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The processed products from the specified account. These are your processed products after
   * applying rules and supplemental data sources.
   * @return value or {@code null} for none
   */
  public java.util.List<Product> getProducts() {
    return products;
  }

  /**
   * The processed products from the specified account. These are your processed products after
   * applying rules and supplemental data sources.
   * @param products products or {@code null} for none
   */
  public ListProductsResponse setProducts(java.util.List<Product> products) {
    this.products = products;
    return this;
  }

  @Override
  public ListProductsResponse set(String fieldName, Object value) {
    return (ListProductsResponse) super.set(fieldName, value);
  }

  @Override
  public ListProductsResponse clone() {
    return (ListProductsResponse) super.clone();
  }

}
