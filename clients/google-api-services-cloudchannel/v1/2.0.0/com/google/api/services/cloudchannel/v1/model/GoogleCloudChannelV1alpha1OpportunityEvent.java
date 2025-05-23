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

package com.google.api.services.cloudchannel.v1.model;

/**
 * Represents Pub/Sub message content describing opportunity updates.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Channel API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudChannelV1alpha1OpportunityEvent extends com.google.api.client.json.GenericJson {

  /**
   * Type of event which happened for the opportunity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventType;

  /**
   * Resource name of the opportunity. Format: opportunities/{opportunity}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String opportunity;

  /**
   * Resource name of the partner. Format: partners/{partner}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String partner;

  /**
   * Type of event which happened for the opportunity.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventType() {
    return eventType;
  }

  /**
   * Type of event which happened for the opportunity.
   * @param eventType eventType or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1OpportunityEvent setEventType(java.lang.String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Resource name of the opportunity. Format: opportunities/{opportunity}
   * @return value or {@code null} for none
   */
  public java.lang.String getOpportunity() {
    return opportunity;
  }

  /**
   * Resource name of the opportunity. Format: opportunities/{opportunity}
   * @param opportunity opportunity or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1OpportunityEvent setOpportunity(java.lang.String opportunity) {
    this.opportunity = opportunity;
    return this;
  }

  /**
   * Resource name of the partner. Format: partners/{partner}
   * @return value or {@code null} for none
   */
  public java.lang.String getPartner() {
    return partner;
  }

  /**
   * Resource name of the partner. Format: partners/{partner}
   * @param partner partner or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1OpportunityEvent setPartner(java.lang.String partner) {
    this.partner = partner;
    return this;
  }

  @Override
  public GoogleCloudChannelV1alpha1OpportunityEvent set(String fieldName, Object value) {
    return (GoogleCloudChannelV1alpha1OpportunityEvent) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudChannelV1alpha1OpportunityEvent clone() {
    return (GoogleCloudChannelV1alpha1OpportunityEvent) super.clone();
  }

}
