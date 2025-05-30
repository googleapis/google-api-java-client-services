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

package com.google.api.services.firebaseapphosting.v1.model;

/**
 * Message for response to list domains.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase App Hosting API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListDomainsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The list of domains.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Domain> domains;

  static {
    // hack to force ProGuard to consider Domain used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Domain.class);
  }

  /**
   * Output only. A token identifying the next page of results the server should return.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Output only. Locations that could not be reached.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> unreachable;

  /**
   * Output only. The list of domains.
   * @return value or {@code null} for none
   */
  public java.util.List<Domain> getDomains() {
    return domains;
  }

  /**
   * Output only. The list of domains.
   * @param domains domains or {@code null} for none
   */
  public ListDomainsResponse setDomains(java.util.List<Domain> domains) {
    this.domains = domains;
    return this;
  }

  /**
   * Output only. A token identifying the next page of results the server should return.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Output only. A token identifying the next page of results the server should return.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListDomainsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Output only. Locations that could not be reached.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUnreachable() {
    return unreachable;
  }

  /**
   * Output only. Locations that could not be reached.
   * @param unreachable unreachable or {@code null} for none
   */
  public ListDomainsResponse setUnreachable(java.util.List<java.lang.String> unreachable) {
    this.unreachable = unreachable;
    return this;
  }

  @Override
  public ListDomainsResponse set(String fieldName, Object value) {
    return (ListDomainsResponse) super.set(fieldName, value);
  }

  @Override
  public ListDomainsResponse clone() {
    return (ListDomainsResponse) super.clone();
  }

}
