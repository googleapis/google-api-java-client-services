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
 * [Output only] Represents status related to the future reservation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FutureReservationStatus extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] The current status of the requested amendment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String amendmentStatus;

  /**
   * Fully qualified urls of the automatically created reservations at start_time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> autoCreatedReservations;

  /**
   * [Output Only] Represents the existing matching usage for the future reservation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FutureReservationStatusExistingMatchingUsageInfo existingMatchingUsageInfo;

  /**
   * This count indicates the fulfilled capacity so far. This is set during "PROVISIONING" state.
   * This count also includes capacity delivered as part of existing matching reservations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long fulfilledCount;

  /**
   * [Output Only] This field represents the future reservation before an amendment was requested.
   * If the amendment is declined, the Future Reservation will be reverted to the last known good
   * state. The last known good state is not set when updating a future reservation whose
   * Procurement Status is DRAFTING.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FutureReservationStatusLastKnownGoodState lastKnownGoodState;

  /**
   * Time when Future Reservation would become LOCKED, after which no modifications to Future
   * Reservation will be allowed. Applicable only after the Future Reservation is in the APPROVED
   * state. The lock_time is an RFC3339 string. The procurement_status will transition to PROCURING
   * state at this time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lockTime;

  /**
   * Current state of this Future Reservation
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String procurementStatus;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FutureReservationStatusSpecificSKUProperties specificSkuProperties;

  /**
   * [Output Only] The current status of the requested amendment.
   * @return value or {@code null} for none
   */
  public java.lang.String getAmendmentStatus() {
    return amendmentStatus;
  }

  /**
   * [Output Only] The current status of the requested amendment.
   * @param amendmentStatus amendmentStatus or {@code null} for none
   */
  public FutureReservationStatus setAmendmentStatus(java.lang.String amendmentStatus) {
    this.amendmentStatus = amendmentStatus;
    return this;
  }

  /**
   * Fully qualified urls of the automatically created reservations at start_time.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAutoCreatedReservations() {
    return autoCreatedReservations;
  }

  /**
   * Fully qualified urls of the automatically created reservations at start_time.
   * @param autoCreatedReservations autoCreatedReservations or {@code null} for none
   */
  public FutureReservationStatus setAutoCreatedReservations(java.util.List<java.lang.String> autoCreatedReservations) {
    this.autoCreatedReservations = autoCreatedReservations;
    return this;
  }

  /**
   * [Output Only] Represents the existing matching usage for the future reservation.
   * @return value or {@code null} for none
   */
  public FutureReservationStatusExistingMatchingUsageInfo getExistingMatchingUsageInfo() {
    return existingMatchingUsageInfo;
  }

  /**
   * [Output Only] Represents the existing matching usage for the future reservation.
   * @param existingMatchingUsageInfo existingMatchingUsageInfo or {@code null} for none
   */
  public FutureReservationStatus setExistingMatchingUsageInfo(FutureReservationStatusExistingMatchingUsageInfo existingMatchingUsageInfo) {
    this.existingMatchingUsageInfo = existingMatchingUsageInfo;
    return this;
  }

  /**
   * This count indicates the fulfilled capacity so far. This is set during "PROVISIONING" state.
   * This count also includes capacity delivered as part of existing matching reservations.
   * @return value or {@code null} for none
   */
  public java.lang.Long getFulfilledCount() {
    return fulfilledCount;
  }

  /**
   * This count indicates the fulfilled capacity so far. This is set during "PROVISIONING" state.
   * This count also includes capacity delivered as part of existing matching reservations.
   * @param fulfilledCount fulfilledCount or {@code null} for none
   */
  public FutureReservationStatus setFulfilledCount(java.lang.Long fulfilledCount) {
    this.fulfilledCount = fulfilledCount;
    return this;
  }

  /**
   * [Output Only] This field represents the future reservation before an amendment was requested.
   * If the amendment is declined, the Future Reservation will be reverted to the last known good
   * state. The last known good state is not set when updating a future reservation whose
   * Procurement Status is DRAFTING.
   * @return value or {@code null} for none
   */
  public FutureReservationStatusLastKnownGoodState getLastKnownGoodState() {
    return lastKnownGoodState;
  }

  /**
   * [Output Only] This field represents the future reservation before an amendment was requested.
   * If the amendment is declined, the Future Reservation will be reverted to the last known good
   * state. The last known good state is not set when updating a future reservation whose
   * Procurement Status is DRAFTING.
   * @param lastKnownGoodState lastKnownGoodState or {@code null} for none
   */
  public FutureReservationStatus setLastKnownGoodState(FutureReservationStatusLastKnownGoodState lastKnownGoodState) {
    this.lastKnownGoodState = lastKnownGoodState;
    return this;
  }

  /**
   * Time when Future Reservation would become LOCKED, after which no modifications to Future
   * Reservation will be allowed. Applicable only after the Future Reservation is in the APPROVED
   * state. The lock_time is an RFC3339 string. The procurement_status will transition to PROCURING
   * state at this time.
   * @return value or {@code null} for none
   */
  public java.lang.String getLockTime() {
    return lockTime;
  }

  /**
   * Time when Future Reservation would become LOCKED, after which no modifications to Future
   * Reservation will be allowed. Applicable only after the Future Reservation is in the APPROVED
   * state. The lock_time is an RFC3339 string. The procurement_status will transition to PROCURING
   * state at this time.
   * @param lockTime lockTime or {@code null} for none
   */
  public FutureReservationStatus setLockTime(java.lang.String lockTime) {
    this.lockTime = lockTime;
    return this;
  }

  /**
   * Current state of this Future Reservation
   * @return value or {@code null} for none
   */
  public java.lang.String getProcurementStatus() {
    return procurementStatus;
  }

  /**
   * Current state of this Future Reservation
   * @param procurementStatus procurementStatus or {@code null} for none
   */
  public FutureReservationStatus setProcurementStatus(java.lang.String procurementStatus) {
    this.procurementStatus = procurementStatus;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public FutureReservationStatusSpecificSKUProperties getSpecificSkuProperties() {
    return specificSkuProperties;
  }

  /**
   * @param specificSkuProperties specificSkuProperties or {@code null} for none
   */
  public FutureReservationStatus setSpecificSkuProperties(FutureReservationStatusSpecificSKUProperties specificSkuProperties) {
    this.specificSkuProperties = specificSkuProperties;
    return this;
  }

  @Override
  public FutureReservationStatus set(String fieldName, Object value) {
    return (FutureReservationStatus) super.set(fieldName, value);
  }

  @Override
  public FutureReservationStatus clone() {
    return (FutureReservationStatus) super.clone();
  }

}
