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

package com.google.api.services.networkmanagement.v1.model;

/**
 * Latency percentile rank and value.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LatencyPercentile extends com.google.api.client.json.GenericJson {

  /**
   * percent-th percentile of latency observed, in microseconds. Fraction of percent/100 of samples
   * have latency lower or equal to the value of this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long latencyMicros;

  /**
   * Percentage of samples this data point applies to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer percent;

  /**
   * percent-th percentile of latency observed, in microseconds. Fraction of percent/100 of samples
   * have latency lower or equal to the value of this field.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLatencyMicros() {
    return latencyMicros;
  }

  /**
   * percent-th percentile of latency observed, in microseconds. Fraction of percent/100 of samples
   * have latency lower or equal to the value of this field.
   * @param latencyMicros latencyMicros or {@code null} for none
   */
  public LatencyPercentile setLatencyMicros(java.lang.Long latencyMicros) {
    this.latencyMicros = latencyMicros;
    return this;
  }

  /**
   * Percentage of samples this data point applies to.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPercent() {
    return percent;
  }

  /**
   * Percentage of samples this data point applies to.
   * @param percent percent or {@code null} for none
   */
  public LatencyPercentile setPercent(java.lang.Integer percent) {
    this.percent = percent;
    return this;
  }

  @Override
  public LatencyPercentile set(String fieldName, Object value) {
    return (LatencyPercentile) super.set(fieldName, value);
  }

  @Override
  public LatencyPercentile clone() {
    return (LatencyPercentile) super.clone();
  }

}
