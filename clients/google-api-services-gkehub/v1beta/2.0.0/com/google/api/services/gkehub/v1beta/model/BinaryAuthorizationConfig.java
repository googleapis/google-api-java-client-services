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

package com.google.api.services.gkehub.v1beta.model;

/**
 * BinaryAuthorizationConfig defines the fleet level configuration of binary authorization feature.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BinaryAuthorizationConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Mode of operation for binauthz policy evaluation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String evaluationMode;

  /**
   * Optional. Binauthz policies that apply to this cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PolicyBinding> policyBindings;

  /**
   * Optional. Mode of operation for binauthz policy evaluation.
   * @return value or {@code null} for none
   */
  public java.lang.String getEvaluationMode() {
    return evaluationMode;
  }

  /**
   * Optional. Mode of operation for binauthz policy evaluation.
   * @param evaluationMode evaluationMode or {@code null} for none
   */
  public BinaryAuthorizationConfig setEvaluationMode(java.lang.String evaluationMode) {
    this.evaluationMode = evaluationMode;
    return this;
  }

  /**
   * Optional. Binauthz policies that apply to this cluster.
   * @return value or {@code null} for none
   */
  public java.util.List<PolicyBinding> getPolicyBindings() {
    return policyBindings;
  }

  /**
   * Optional. Binauthz policies that apply to this cluster.
   * @param policyBindings policyBindings or {@code null} for none
   */
  public BinaryAuthorizationConfig setPolicyBindings(java.util.List<PolicyBinding> policyBindings) {
    this.policyBindings = policyBindings;
    return this;
  }

  @Override
  public BinaryAuthorizationConfig set(String fieldName, Object value) {
    return (BinaryAuthorizationConfig) super.set(fieldName, value);
  }

  @Override
  public BinaryAuthorizationConfig clone() {
    return (BinaryAuthorizationConfig) super.clone();
  }

}
