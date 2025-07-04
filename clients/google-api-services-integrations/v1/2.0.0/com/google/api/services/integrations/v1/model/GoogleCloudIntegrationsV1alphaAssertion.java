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

package com.google.api.services.integrations.v1.model;

/**
 * An assertion which will check for a condition over task execution status or an expression for
 * task output variables
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Application Integration API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudIntegrationsV1alphaAssertion extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The type of assertion to perform.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String assertionStrategy;

  /**
   * Optional. Standard filter expression for ASSERT_CONDITION to succeed
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String condition;

  /**
   * Optional. Key-value pair for ASSERT_EQUALS, ASSERT_NOT_EQUALS, ASSERT_CONTAINS to succeed
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudIntegrationsV1alphaEventParameter parameter;

  /**
   * Number of times given task should be retried in case of ASSERT_FAILED_EXECUTION
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer retryCount;

  /**
   * Optional. The type of assertion to perform.
   * @return value or {@code null} for none
   */
  public java.lang.String getAssertionStrategy() {
    return assertionStrategy;
  }

  /**
   * Optional. The type of assertion to perform.
   * @param assertionStrategy assertionStrategy or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaAssertion setAssertionStrategy(java.lang.String assertionStrategy) {
    this.assertionStrategy = assertionStrategy;
    return this;
  }

  /**
   * Optional. Standard filter expression for ASSERT_CONDITION to succeed
   * @return value or {@code null} for none
   */
  public java.lang.String getCondition() {
    return condition;
  }

  /**
   * Optional. Standard filter expression for ASSERT_CONDITION to succeed
   * @param condition condition or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaAssertion setCondition(java.lang.String condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Optional. Key-value pair for ASSERT_EQUALS, ASSERT_NOT_EQUALS, ASSERT_CONTAINS to succeed
   * @return value or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaEventParameter getParameter() {
    return parameter;
  }

  /**
   * Optional. Key-value pair for ASSERT_EQUALS, ASSERT_NOT_EQUALS, ASSERT_CONTAINS to succeed
   * @param parameter parameter or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaAssertion setParameter(GoogleCloudIntegrationsV1alphaEventParameter parameter) {
    this.parameter = parameter;
    return this;
  }

  /**
   * Number of times given task should be retried in case of ASSERT_FAILED_EXECUTION
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRetryCount() {
    return retryCount;
  }

  /**
   * Number of times given task should be retried in case of ASSERT_FAILED_EXECUTION
   * @param retryCount retryCount or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaAssertion setRetryCount(java.lang.Integer retryCount) {
    this.retryCount = retryCount;
    return this;
  }

  @Override
  public GoogleCloudIntegrationsV1alphaAssertion set(String fieldName, Object value) {
    return (GoogleCloudIntegrationsV1alphaAssertion) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIntegrationsV1alphaAssertion clone() {
    return (GoogleCloudIntegrationsV1alphaAssertion) super.clone();
  }

}
