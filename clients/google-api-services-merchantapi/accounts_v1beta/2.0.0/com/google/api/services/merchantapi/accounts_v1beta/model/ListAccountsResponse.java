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

package com.google.api.services.merchantapi.accounts_v1beta.model;

/**
 * Response message for the `accounts.list` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Merchant API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListAccountsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The accounts matching the `ListAccountsRequest`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Account> accounts;

  static {
    // hack to force ProGuard to consider Account used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Account.class);
  }

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The accounts matching the `ListAccountsRequest`.
   * @return value or {@code null} for none
   */
  public java.util.List<Account> getAccounts() {
    return accounts;
  }

  /**
   * The accounts matching the `ListAccountsRequest`.
   * @param accounts accounts or {@code null} for none
   */
  public ListAccountsResponse setAccounts(java.util.List<Account> accounts) {
    this.accounts = accounts;
    return this;
  }

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
  public ListAccountsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListAccountsResponse set(String fieldName, Object value) {
    return (ListAccountsResponse) super.set(fieldName, value);
  }

  @Override
  public ListAccountsResponse clone() {
    return (ListAccountsResponse) super.clone();
  }

}
