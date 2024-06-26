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

package com.google.api.services.securitycenter.v1.model;

/**
 * Possible test result.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SimulatedResult extends com.google.api.client.json.GenericJson {

  /**
   * Error encountered during the test.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status error;

  /**
   * Finding that would be published for the test case, if a violation is detected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Finding finding;

  /**
   * Indicates that the test case does not trigger any violation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Empty noViolation;

  /**
   * Error encountered during the test.
   * @return value or {@code null} for none
   */
  public Status getError() {
    return error;
  }

  /**
   * Error encountered during the test.
   * @param error error or {@code null} for none
   */
  public SimulatedResult setError(Status error) {
    this.error = error;
    return this;
  }

  /**
   * Finding that would be published for the test case, if a violation is detected.
   * @return value or {@code null} for none
   */
  public Finding getFinding() {
    return finding;
  }

  /**
   * Finding that would be published for the test case, if a violation is detected.
   * @param finding finding or {@code null} for none
   */
  public SimulatedResult setFinding(Finding finding) {
    this.finding = finding;
    return this;
  }

  /**
   * Indicates that the test case does not trigger any violation.
   * @return value or {@code null} for none
   */
  public Empty getNoViolation() {
    return noViolation;
  }

  /**
   * Indicates that the test case does not trigger any violation.
   * @param noViolation noViolation or {@code null} for none
   */
  public SimulatedResult setNoViolation(Empty noViolation) {
    this.noViolation = noViolation;
    return this;
  }

  @Override
  public SimulatedResult set(String fieldName, Object value) {
    return (SimulatedResult) super.set(fieldName, value);
  }

  @Override
  public SimulatedResult clone() {
    return (SimulatedResult) super.clone();
  }

}
