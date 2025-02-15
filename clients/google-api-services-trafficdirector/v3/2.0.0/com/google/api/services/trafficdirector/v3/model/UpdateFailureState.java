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

package com.google.api.services.trafficdirector.v3.model;

/**
 * Model definition for UpdateFailureState.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Traffic Director API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateFailureState extends com.google.api.client.json.GenericJson {

  /**
   * Details about the last failed update attempt.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String details;

  /**
   * What the component configuration would have been if the update had succeeded. This field may
   * not be populated by xDS clients due to storage overhead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> failedConfiguration;

  /**
   * Time of the latest failed update attempt.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastUpdateAttempt;

  /**
   * This is the version of the rejected resource. [#not-implemented-hide:]
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String versionInfo;

  /**
   * Details about the last failed update attempt.
   * @return value or {@code null} for none
   */
  public java.lang.String getDetails() {
    return details;
  }

  /**
   * Details about the last failed update attempt.
   * @param details details or {@code null} for none
   */
  public UpdateFailureState setDetails(java.lang.String details) {
    this.details = details;
    return this;
  }

  /**
   * What the component configuration would have been if the update had succeeded. This field may
   * not be populated by xDS clients due to storage overhead.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getFailedConfiguration() {
    return failedConfiguration;
  }

  /**
   * What the component configuration would have been if the update had succeeded. This field may
   * not be populated by xDS clients due to storage overhead.
   * @param failedConfiguration failedConfiguration or {@code null} for none
   */
  public UpdateFailureState setFailedConfiguration(java.util.Map<String, java.lang.Object> failedConfiguration) {
    this.failedConfiguration = failedConfiguration;
    return this;
  }

  /**
   * Time of the latest failed update attempt.
   * @return value or {@code null} for none
   */
  public String getLastUpdateAttempt() {
    return lastUpdateAttempt;
  }

  /**
   * Time of the latest failed update attempt.
   * @param lastUpdateAttempt lastUpdateAttempt or {@code null} for none
   */
  public UpdateFailureState setLastUpdateAttempt(String lastUpdateAttempt) {
    this.lastUpdateAttempt = lastUpdateAttempt;
    return this;
  }

  /**
   * This is the version of the rejected resource. [#not-implemented-hide:]
   * @return value or {@code null} for none
   */
  public java.lang.String getVersionInfo() {
    return versionInfo;
  }

  /**
   * This is the version of the rejected resource. [#not-implemented-hide:]
   * @param versionInfo versionInfo or {@code null} for none
   */
  public UpdateFailureState setVersionInfo(java.lang.String versionInfo) {
    this.versionInfo = versionInfo;
    return this;
  }

  @Override
  public UpdateFailureState set(String fieldName, Object value) {
    return (UpdateFailureState) super.set(fieldName, value);
  }

  @Override
  public UpdateFailureState clone() {
    return (UpdateFailureState) super.clone();
  }

}
