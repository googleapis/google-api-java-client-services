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

package com.google.api.services.authorizedbuyersmarketplace.v1.model;

/**
 * A deal represents a segment of inventory for displaying ads that contains the terms and targeting
 * information that is used for serving as well as the deal stats and status. Note: A proposal may
 * contain multiple deals.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Authorized Buyers Marketplace API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Deal extends com.google.api.client.json.GenericJson {

  /**
   * Output only. When the client field is populated, this field refers to the buyer who creates and
   * manages the client buyer and gets billed on behalf of the client buyer; when the buyer field is
   * populated, this field is the same value as buyer; when the deal belongs to a media planner
   * account, this field will be empty. Format : `buyers/{buyerAccountId}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String billedBuyer;

  /**
   * Output only. Refers to a buyer in Real-time Bidding API's Buyer resource. Format:
   * `buyers/{buyerAccountId}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String buyer;

  /**
   * Output only. The buyer permission type of the deal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String buyerPermissionType;

  /**
   * Output only. Refers to a Client. Format: `buyers/{buyerAccountId}/clients/{clientAccountid}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String client;

  /**
   * Output only. The time of the deal creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. Metadata about the creatives of this deal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CreativeRequirements creativeRequirements;

  /**
   * Output only. Type of deal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dealType;

  /**
   * Output only. Specifies the pacing set by the publisher.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeliveryControl deliveryControl;

  /**
   * Output only. Free text description for the deal terms.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Output only. The name of the deal. Maximum length of 255 unicode characters is allowed. Control
   * characters are not allowed. Buyers cannot update this field. Note: Not to be confused with
   * name, which is a unique identifier of the deal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. If set, this field contains the list of DSP specific seat ids set by media
   * planners that are eligible to transact on this deal. The seat ID is in the calling DSP's
   * namespace.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> eligibleSeatIds;

  /**
   * Specified by buyers in request for proposal (RFP) to notify publisher the total estimated spend
   * for the proposal. Publishers will receive this information and send back proposed deals
   * accordingly.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Money estimatedGrossSpend;

  /**
   * Proposed flight end time of the deal. This will generally be stored in a granularity of a
   * second. A value is not necessary for Private Auction deals.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String flightEndTime;

  /**
   * Proposed flight start time of the deal. This will generally be stored in the granularity of one
   * second since deal serving starts at seconds boundary. Any time specified with more granularity
   * (for example, in milliseconds) will be truncated towards the start of time in seconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String flightStartTime;

  /**
   * Output only. Refers to a buyer in Real-time Bidding API's Buyer resource. This field represents
   * a media planner (For example, agency or big advertiser).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MediaPlanner mediaPlanner;

  /**
   * Immutable. The unique identifier of the deal. Auto-generated by the server when a deal is
   * created. Format: buyers/{accountId}/proposals/{proposalId}/deals/{dealId}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The terms for preferred deals.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PreferredDealTerms preferredDealTerms;

  /**
   * The terms for private auction deals.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PrivateAuctionTerms privateAuctionTerms;

  /**
   * The terms for programmatic guaranteed deals.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ProgrammaticGuaranteedTerms programmaticGuaranteedTerms;

  /**
   * Output only. The revision number for the proposal and is the same value as
   * proposal.proposal_revision. Each update to deal causes the proposal revision number to auto-
   * increment. The buyer keeps track of the last revision number they know of and pass it in when
   * making an update. If the head revision number on the server has since incremented, then an
   * ABORTED error is returned during the update operation to let the buyer know that a subsequent
   * update was made.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long proposalRevision;

  /**
   * Immutable. Reference to the seller on the deal. Format:
   * `buyers/{buyerAccountId}/publisherProfiles/{publisherProfileId}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String publisherProfile;

  /**
   * Output only. Time zone of the seller used to mark the boundaries of a day for daypart targeting
   * and CPD billing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeZone sellerTimeZone;

  /**
   * Specifies the subset of inventory targeted by the deal. Can be updated by the buyer before the
   * deal is finalized.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MarketplaceTargeting targeting;

  /**
   * Output only. The time when the deal was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. When the client field is populated, this field refers to the buyer who creates and
   * manages the client buyer and gets billed on behalf of the client buyer; when the buyer field is
   * populated, this field is the same value as buyer; when the deal belongs to a media planner
   * account, this field will be empty. Format : `buyers/{buyerAccountId}`
   * @return value or {@code null} for none
   */
  public java.lang.String getBilledBuyer() {
    return billedBuyer;
  }

  /**
   * Output only. When the client field is populated, this field refers to the buyer who creates and
   * manages the client buyer and gets billed on behalf of the client buyer; when the buyer field is
   * populated, this field is the same value as buyer; when the deal belongs to a media planner
   * account, this field will be empty. Format : `buyers/{buyerAccountId}`
   * @param billedBuyer billedBuyer or {@code null} for none
   */
  public Deal setBilledBuyer(java.lang.String billedBuyer) {
    this.billedBuyer = billedBuyer;
    return this;
  }

  /**
   * Output only. Refers to a buyer in Real-time Bidding API's Buyer resource. Format:
   * `buyers/{buyerAccountId}`
   * @return value or {@code null} for none
   */
  public java.lang.String getBuyer() {
    return buyer;
  }

  /**
   * Output only. Refers to a buyer in Real-time Bidding API's Buyer resource. Format:
   * `buyers/{buyerAccountId}`
   * @param buyer buyer or {@code null} for none
   */
  public Deal setBuyer(java.lang.String buyer) {
    this.buyer = buyer;
    return this;
  }

  /**
   * Output only. The buyer permission type of the deal.
   * @return value or {@code null} for none
   */
  public java.lang.String getBuyerPermissionType() {
    return buyerPermissionType;
  }

  /**
   * Output only. The buyer permission type of the deal.
   * @param buyerPermissionType buyerPermissionType or {@code null} for none
   */
  public Deal setBuyerPermissionType(java.lang.String buyerPermissionType) {
    this.buyerPermissionType = buyerPermissionType;
    return this;
  }

  /**
   * Output only. Refers to a Client. Format: `buyers/{buyerAccountId}/clients/{clientAccountid}`
   * @return value or {@code null} for none
   */
  public java.lang.String getClient() {
    return client;
  }

  /**
   * Output only. Refers to a Client. Format: `buyers/{buyerAccountId}/clients/{clientAccountid}`
   * @param client client or {@code null} for none
   */
  public Deal setClient(java.lang.String client) {
    this.client = client;
    return this;
  }

  /**
   * Output only. The time of the deal creation.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time of the deal creation.
   * @param createTime createTime or {@code null} for none
   */
  public Deal setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. Metadata about the creatives of this deal.
   * @return value or {@code null} for none
   */
  public CreativeRequirements getCreativeRequirements() {
    return creativeRequirements;
  }

  /**
   * Output only. Metadata about the creatives of this deal.
   * @param creativeRequirements creativeRequirements or {@code null} for none
   */
  public Deal setCreativeRequirements(CreativeRequirements creativeRequirements) {
    this.creativeRequirements = creativeRequirements;
    return this;
  }

  /**
   * Output only. Type of deal.
   * @return value or {@code null} for none
   */
  public java.lang.String getDealType() {
    return dealType;
  }

  /**
   * Output only. Type of deal.
   * @param dealType dealType or {@code null} for none
   */
  public Deal setDealType(java.lang.String dealType) {
    this.dealType = dealType;
    return this;
  }

  /**
   * Output only. Specifies the pacing set by the publisher.
   * @return value or {@code null} for none
   */
  public DeliveryControl getDeliveryControl() {
    return deliveryControl;
  }

  /**
   * Output only. Specifies the pacing set by the publisher.
   * @param deliveryControl deliveryControl or {@code null} for none
   */
  public Deal setDeliveryControl(DeliveryControl deliveryControl) {
    this.deliveryControl = deliveryControl;
    return this;
  }

  /**
   * Output only. Free text description for the deal terms.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Output only. Free text description for the deal terms.
   * @param description description or {@code null} for none
   */
  public Deal setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Output only. The name of the deal. Maximum length of 255 unicode characters is allowed. Control
   * characters are not allowed. Buyers cannot update this field. Note: Not to be confused with
   * name, which is a unique identifier of the deal.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Output only. The name of the deal. Maximum length of 255 unicode characters is allowed. Control
   * characters are not allowed. Buyers cannot update this field. Note: Not to be confused with
   * name, which is a unique identifier of the deal.
   * @param displayName displayName or {@code null} for none
   */
  public Deal setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. If set, this field contains the list of DSP specific seat ids set by media
   * planners that are eligible to transact on this deal. The seat ID is in the calling DSP's
   * namespace.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEligibleSeatIds() {
    return eligibleSeatIds;
  }

  /**
   * Output only. If set, this field contains the list of DSP specific seat ids set by media
   * planners that are eligible to transact on this deal. The seat ID is in the calling DSP's
   * namespace.
   * @param eligibleSeatIds eligibleSeatIds or {@code null} for none
   */
  public Deal setEligibleSeatIds(java.util.List<java.lang.String> eligibleSeatIds) {
    this.eligibleSeatIds = eligibleSeatIds;
    return this;
  }

  /**
   * Specified by buyers in request for proposal (RFP) to notify publisher the total estimated spend
   * for the proposal. Publishers will receive this information and send back proposed deals
   * accordingly.
   * @return value or {@code null} for none
   */
  public Money getEstimatedGrossSpend() {
    return estimatedGrossSpend;
  }

  /**
   * Specified by buyers in request for proposal (RFP) to notify publisher the total estimated spend
   * for the proposal. Publishers will receive this information and send back proposed deals
   * accordingly.
   * @param estimatedGrossSpend estimatedGrossSpend or {@code null} for none
   */
  public Deal setEstimatedGrossSpend(Money estimatedGrossSpend) {
    this.estimatedGrossSpend = estimatedGrossSpend;
    return this;
  }

  /**
   * Proposed flight end time of the deal. This will generally be stored in a granularity of a
   * second. A value is not necessary for Private Auction deals.
   * @return value or {@code null} for none
   */
  public String getFlightEndTime() {
    return flightEndTime;
  }

  /**
   * Proposed flight end time of the deal. This will generally be stored in a granularity of a
   * second. A value is not necessary for Private Auction deals.
   * @param flightEndTime flightEndTime or {@code null} for none
   */
  public Deal setFlightEndTime(String flightEndTime) {
    this.flightEndTime = flightEndTime;
    return this;
  }

  /**
   * Proposed flight start time of the deal. This will generally be stored in the granularity of one
   * second since deal serving starts at seconds boundary. Any time specified with more granularity
   * (for example, in milliseconds) will be truncated towards the start of time in seconds.
   * @return value or {@code null} for none
   */
  public String getFlightStartTime() {
    return flightStartTime;
  }

  /**
   * Proposed flight start time of the deal. This will generally be stored in the granularity of one
   * second since deal serving starts at seconds boundary. Any time specified with more granularity
   * (for example, in milliseconds) will be truncated towards the start of time in seconds.
   * @param flightStartTime flightStartTime or {@code null} for none
   */
  public Deal setFlightStartTime(String flightStartTime) {
    this.flightStartTime = flightStartTime;
    return this;
  }

  /**
   * Output only. Refers to a buyer in Real-time Bidding API's Buyer resource. This field represents
   * a media planner (For example, agency or big advertiser).
   * @return value or {@code null} for none
   */
  public MediaPlanner getMediaPlanner() {
    return mediaPlanner;
  }

  /**
   * Output only. Refers to a buyer in Real-time Bidding API's Buyer resource. This field represents
   * a media planner (For example, agency or big advertiser).
   * @param mediaPlanner mediaPlanner or {@code null} for none
   */
  public Deal setMediaPlanner(MediaPlanner mediaPlanner) {
    this.mediaPlanner = mediaPlanner;
    return this;
  }

  /**
   * Immutable. The unique identifier of the deal. Auto-generated by the server when a deal is
   * created. Format: buyers/{accountId}/proposals/{proposalId}/deals/{dealId}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Immutable. The unique identifier of the deal. Auto-generated by the server when a deal is
   * created. Format: buyers/{accountId}/proposals/{proposalId}/deals/{dealId}
   * @param name name or {@code null} for none
   */
  public Deal setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The terms for preferred deals.
   * @return value or {@code null} for none
   */
  public PreferredDealTerms getPreferredDealTerms() {
    return preferredDealTerms;
  }

  /**
   * The terms for preferred deals.
   * @param preferredDealTerms preferredDealTerms or {@code null} for none
   */
  public Deal setPreferredDealTerms(PreferredDealTerms preferredDealTerms) {
    this.preferredDealTerms = preferredDealTerms;
    return this;
  }

  /**
   * The terms for private auction deals.
   * @return value or {@code null} for none
   */
  public PrivateAuctionTerms getPrivateAuctionTerms() {
    return privateAuctionTerms;
  }

  /**
   * The terms for private auction deals.
   * @param privateAuctionTerms privateAuctionTerms or {@code null} for none
   */
  public Deal setPrivateAuctionTerms(PrivateAuctionTerms privateAuctionTerms) {
    this.privateAuctionTerms = privateAuctionTerms;
    return this;
  }

  /**
   * The terms for programmatic guaranteed deals.
   * @return value or {@code null} for none
   */
  public ProgrammaticGuaranteedTerms getProgrammaticGuaranteedTerms() {
    return programmaticGuaranteedTerms;
  }

  /**
   * The terms for programmatic guaranteed deals.
   * @param programmaticGuaranteedTerms programmaticGuaranteedTerms or {@code null} for none
   */
  public Deal setProgrammaticGuaranteedTerms(ProgrammaticGuaranteedTerms programmaticGuaranteedTerms) {
    this.programmaticGuaranteedTerms = programmaticGuaranteedTerms;
    return this;
  }

  /**
   * Output only. The revision number for the proposal and is the same value as
   * proposal.proposal_revision. Each update to deal causes the proposal revision number to auto-
   * increment. The buyer keeps track of the last revision number they know of and pass it in when
   * making an update. If the head revision number on the server has since incremented, then an
   * ABORTED error is returned during the update operation to let the buyer know that a subsequent
   * update was made.
   * @return value or {@code null} for none
   */
  public java.lang.Long getProposalRevision() {
    return proposalRevision;
  }

  /**
   * Output only. The revision number for the proposal and is the same value as
   * proposal.proposal_revision. Each update to deal causes the proposal revision number to auto-
   * increment. The buyer keeps track of the last revision number they know of and pass it in when
   * making an update. If the head revision number on the server has since incremented, then an
   * ABORTED error is returned during the update operation to let the buyer know that a subsequent
   * update was made.
   * @param proposalRevision proposalRevision or {@code null} for none
   */
  public Deal setProposalRevision(java.lang.Long proposalRevision) {
    this.proposalRevision = proposalRevision;
    return this;
  }

  /**
   * Immutable. Reference to the seller on the deal. Format:
   * `buyers/{buyerAccountId}/publisherProfiles/{publisherProfileId}`
   * @return value or {@code null} for none
   */
  public java.lang.String getPublisherProfile() {
    return publisherProfile;
  }

  /**
   * Immutable. Reference to the seller on the deal. Format:
   * `buyers/{buyerAccountId}/publisherProfiles/{publisherProfileId}`
   * @param publisherProfile publisherProfile or {@code null} for none
   */
  public Deal setPublisherProfile(java.lang.String publisherProfile) {
    this.publisherProfile = publisherProfile;
    return this;
  }

  /**
   * Output only. Time zone of the seller used to mark the boundaries of a day for daypart targeting
   * and CPD billing.
   * @return value or {@code null} for none
   */
  public TimeZone getSellerTimeZone() {
    return sellerTimeZone;
  }

  /**
   * Output only. Time zone of the seller used to mark the boundaries of a day for daypart targeting
   * and CPD billing.
   * @param sellerTimeZone sellerTimeZone or {@code null} for none
   */
  public Deal setSellerTimeZone(TimeZone sellerTimeZone) {
    this.sellerTimeZone = sellerTimeZone;
    return this;
  }

  /**
   * Specifies the subset of inventory targeted by the deal. Can be updated by the buyer before the
   * deal is finalized.
   * @return value or {@code null} for none
   */
  public MarketplaceTargeting getTargeting() {
    return targeting;
  }

  /**
   * Specifies the subset of inventory targeted by the deal. Can be updated by the buyer before the
   * deal is finalized.
   * @param targeting targeting or {@code null} for none
   */
  public Deal setTargeting(MarketplaceTargeting targeting) {
    this.targeting = targeting;
    return this;
  }

  /**
   * Output only. The time when the deal was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time when the deal was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public Deal setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Deal set(String fieldName, Object value) {
    return (Deal) super.set(fieldName, value);
  }

  @Override
  public Deal clone() {
    return (Deal) super.clone();
  }

}
