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

package com.google.api.services.containeranalysis.v1alpha1.model;

/**
 * A compliance check that is a CIS benchmark.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CisBenchmark extends com.google.api.client.json.GenericJson {

  /**
   * The profile level of this CIS benchmark check.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer profileLevel;

  /**
   * The severity level of this CIS benchmark check.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String severity;

  /**
   * The profile level of this CIS benchmark check.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getProfileLevel() {
    return profileLevel;
  }

  /**
   * The profile level of this CIS benchmark check.
   * @param profileLevel profileLevel or {@code null} for none
   */
  public CisBenchmark setProfileLevel(java.lang.Integer profileLevel) {
    this.profileLevel = profileLevel;
    return this;
  }

  /**
   * The severity level of this CIS benchmark check.
   * @return value or {@code null} for none
   */
  public java.lang.String getSeverity() {
    return severity;
  }

  /**
   * The severity level of this CIS benchmark check.
   * @param severity severity or {@code null} for none
   */
  public CisBenchmark setSeverity(java.lang.String severity) {
    this.severity = severity;
    return this;
  }

  @Override
  public CisBenchmark set(String fieldName, Object value) {
    return (CisBenchmark) super.set(fieldName, value);
  }

  @Override
  public CisBenchmark clone() {
    return (CisBenchmark) super.clone();
  }

}
