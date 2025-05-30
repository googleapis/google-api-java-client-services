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

package com.google.api.services.displayvideo.v4.model;

/**
 * Assigned third party verifier targeting option details. This will be populated in the details
 * field of an AssignedTargetingOption when targeting_type is `TARGETING_TYPE_THIRD_PARTY_VERIFIER`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ThirdPartyVerifierAssignedTargetingOptionDetails extends com.google.api.client.json.GenericJson {

  /**
   * Third party brand verifier -- Scope3 (previously known as Adloox).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Adloox adloox;

  /**
   * Third party brand verifier -- DoubleVerify.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DoubleVerify doubleVerify;

  /**
   * Third party brand verifier -- Integral Ad Science.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IntegralAdScience integralAdScience;

  /**
   * Third party brand verifier -- Scope3 (previously known as Adloox).
   * @return value or {@code null} for none
   */
  public Adloox getAdloox() {
    return adloox;
  }

  /**
   * Third party brand verifier -- Scope3 (previously known as Adloox).
   * @param adloox adloox or {@code null} for none
   */
  public ThirdPartyVerifierAssignedTargetingOptionDetails setAdloox(Adloox adloox) {
    this.adloox = adloox;
    return this;
  }

  /**
   * Third party brand verifier -- DoubleVerify.
   * @return value or {@code null} for none
   */
  public DoubleVerify getDoubleVerify() {
    return doubleVerify;
  }

  /**
   * Third party brand verifier -- DoubleVerify.
   * @param doubleVerify doubleVerify or {@code null} for none
   */
  public ThirdPartyVerifierAssignedTargetingOptionDetails setDoubleVerify(DoubleVerify doubleVerify) {
    this.doubleVerify = doubleVerify;
    return this;
  }

  /**
   * Third party brand verifier -- Integral Ad Science.
   * @return value or {@code null} for none
   */
  public IntegralAdScience getIntegralAdScience() {
    return integralAdScience;
  }

  /**
   * Third party brand verifier -- Integral Ad Science.
   * @param integralAdScience integralAdScience or {@code null} for none
   */
  public ThirdPartyVerifierAssignedTargetingOptionDetails setIntegralAdScience(IntegralAdScience integralAdScience) {
    this.integralAdScience = integralAdScience;
    return this;
  }

  @Override
  public ThirdPartyVerifierAssignedTargetingOptionDetails set(String fieldName, Object value) {
    return (ThirdPartyVerifierAssignedTargetingOptionDetails) super.set(fieldName, value);
  }

  @Override
  public ThirdPartyVerifierAssignedTargetingOptionDetails clone() {
    return (ThirdPartyVerifierAssignedTargetingOptionDetails) super.clone();
  }

}
