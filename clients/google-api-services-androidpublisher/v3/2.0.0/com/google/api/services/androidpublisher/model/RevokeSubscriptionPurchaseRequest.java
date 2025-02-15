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
 * Request for the purchases.subscriptionsv2.revoke API.
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
public final class RevokeSubscriptionPurchaseRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. Additional details around the subscription revocation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RevocationContext revocationContext;

  /**
   * Required. Additional details around the subscription revocation.
   * @return value or {@code null} for none
   */
  public RevocationContext getRevocationContext() {
    return revocationContext;
  }

  /**
   * Required. Additional details around the subscription revocation.
   * @param revocationContext revocationContext or {@code null} for none
   */
  public RevokeSubscriptionPurchaseRequest setRevocationContext(RevocationContext revocationContext) {
    this.revocationContext = revocationContext;
    return this;
  }

  @Override
  public RevokeSubscriptionPurchaseRequest set(String fieldName, Object value) {
    return (RevokeSubscriptionPurchaseRequest) super.set(fieldName, value);
  }

  @Override
  public RevokeSubscriptionPurchaseRequest clone() {
    return (RevokeSubscriptionPurchaseRequest) super.clone();
  }

}
