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

package com.google.api.services.privateca.v1.model;

/**
 * Response message for CertificateAuthorityService.ListCertificates.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Certificate Authority API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListCertificatesResponse extends com.google.api.client.json.GenericJson {

  /**
   * The list of Certificates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Certificate> certificates;

  static {
    // hack to force ProGuard to consider Certificate used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Certificate.class);
  }

  /**
   * A token to retrieve next page of results. Pass this value in ListCertificatesRequest.page_token
   * to retrieve the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A list of locations (e.g. "us-west1") that could not be reached.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> unreachable;

  /**
   * The list of Certificates.
   * @return value or {@code null} for none
   */
  public java.util.List<Certificate> getCertificates() {
    return certificates;
  }

  /**
   * The list of Certificates.
   * @param certificates certificates or {@code null} for none
   */
  public ListCertificatesResponse setCertificates(java.util.List<Certificate> certificates) {
    this.certificates = certificates;
    return this;
  }

  /**
   * A token to retrieve next page of results. Pass this value in ListCertificatesRequest.page_token
   * to retrieve the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token to retrieve next page of results. Pass this value in ListCertificatesRequest.page_token
   * to retrieve the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListCertificatesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * A list of locations (e.g. "us-west1") that could not be reached.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUnreachable() {
    return unreachable;
  }

  /**
   * A list of locations (e.g. "us-west1") that could not be reached.
   * @param unreachable unreachable or {@code null} for none
   */
  public ListCertificatesResponse setUnreachable(java.util.List<java.lang.String> unreachable) {
    this.unreachable = unreachable;
    return this;
  }

  @Override
  public ListCertificatesResponse set(String fieldName, Object value) {
    return (ListCertificatesResponse) super.set(fieldName, value);
  }

  @Override
  public ListCertificatesResponse clone() {
    return (ListCertificatesResponse) super.clone();
  }

}
