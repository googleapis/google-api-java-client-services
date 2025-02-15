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

package com.google.api.services.compute.model;

/**
 * Specify bandwidth percentages [1-100] for various traffic classes in BandwidthPercentagePolicy.
 * The sum of all percentages must equal 100. All traffic classes must have a percentage value
 * specified.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InterconnectApplicationAwareInterconnectBandwidthPercentage extends com.google.api.client.json.GenericJson {

  /**
   * Bandwidth percentage for a specific traffic class.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long percentage;

  /**
   * TrafficClass whose bandwidth percentage is being specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trafficClass;

  /**
   * Bandwidth percentage for a specific traffic class.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPercentage() {
    return percentage;
  }

  /**
   * Bandwidth percentage for a specific traffic class.
   * @param percentage percentage or {@code null} for none
   */
  public InterconnectApplicationAwareInterconnectBandwidthPercentage setPercentage(java.lang.Long percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * TrafficClass whose bandwidth percentage is being specified.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrafficClass() {
    return trafficClass;
  }

  /**
   * TrafficClass whose bandwidth percentage is being specified.
   * @param trafficClass trafficClass or {@code null} for none
   */
  public InterconnectApplicationAwareInterconnectBandwidthPercentage setTrafficClass(java.lang.String trafficClass) {
    this.trafficClass = trafficClass;
    return this;
  }

  @Override
  public InterconnectApplicationAwareInterconnectBandwidthPercentage set(String fieldName, Object value) {
    return (InterconnectApplicationAwareInterconnectBandwidthPercentage) super.set(fieldName, value);
  }

  @Override
  public InterconnectApplicationAwareInterconnectBandwidthPercentage clone() {
    return (InterconnectApplicationAwareInterconnectBandwidthPercentage) super.clone();
  }

}
