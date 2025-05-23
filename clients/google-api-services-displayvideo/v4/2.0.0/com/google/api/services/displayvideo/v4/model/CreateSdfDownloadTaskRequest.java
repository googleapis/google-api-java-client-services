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

package com.google.api.services.displayvideo.v4.model;

/**
 * Request message for [SdfDownloadTaskService.CreateSdfDownloadTask].
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateSdfDownloadTaskRequest extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the advertiser to download SDF for.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long advertiserId;

  /**
   * Filters on entities by their entity IDs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IdFilter idFilter;

  /**
   * Filters on Inventory Sources by their IDs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InventorySourceFilter inventorySourceFilter;

  /**
   * Filters on selected file types. The entities in each file are filtered by a chosen set of
   * filter entities. The filter entities must be the same type as, or a parent type of, the
   * selected file types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ParentEntityFilter parentEntityFilter;

  /**
   * The ID of the partner to download SDF for.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long partnerId;

  /**
   * Required. The SDF version of the downloaded file. If set to `SDF_VERSION_UNSPECIFIED`, this
   * will default to the version specified by the advertiser or partner identified by `root_id`. An
   * advertiser inherits its SDF version from its partner unless configured otherwise.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * The ID of the advertiser to download SDF for.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAdvertiserId() {
    return advertiserId;
  }

  /**
   * The ID of the advertiser to download SDF for.
   * @param advertiserId advertiserId or {@code null} for none
   */
  public CreateSdfDownloadTaskRequest setAdvertiserId(java.lang.Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  /**
   * Filters on entities by their entity IDs.
   * @return value or {@code null} for none
   */
  public IdFilter getIdFilter() {
    return idFilter;
  }

  /**
   * Filters on entities by their entity IDs.
   * @param idFilter idFilter or {@code null} for none
   */
  public CreateSdfDownloadTaskRequest setIdFilter(IdFilter idFilter) {
    this.idFilter = idFilter;
    return this;
  }

  /**
   * Filters on Inventory Sources by their IDs.
   * @return value or {@code null} for none
   */
  public InventorySourceFilter getInventorySourceFilter() {
    return inventorySourceFilter;
  }

  /**
   * Filters on Inventory Sources by their IDs.
   * @param inventorySourceFilter inventorySourceFilter or {@code null} for none
   */
  public CreateSdfDownloadTaskRequest setInventorySourceFilter(InventorySourceFilter inventorySourceFilter) {
    this.inventorySourceFilter = inventorySourceFilter;
    return this;
  }

  /**
   * Filters on selected file types. The entities in each file are filtered by a chosen set of
   * filter entities. The filter entities must be the same type as, or a parent type of, the
   * selected file types.
   * @return value or {@code null} for none
   */
  public ParentEntityFilter getParentEntityFilter() {
    return parentEntityFilter;
  }

  /**
   * Filters on selected file types. The entities in each file are filtered by a chosen set of
   * filter entities. The filter entities must be the same type as, or a parent type of, the
   * selected file types.
   * @param parentEntityFilter parentEntityFilter or {@code null} for none
   */
  public CreateSdfDownloadTaskRequest setParentEntityFilter(ParentEntityFilter parentEntityFilter) {
    this.parentEntityFilter = parentEntityFilter;
    return this;
  }

  /**
   * The ID of the partner to download SDF for.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPartnerId() {
    return partnerId;
  }

  /**
   * The ID of the partner to download SDF for.
   * @param partnerId partnerId or {@code null} for none
   */
  public CreateSdfDownloadTaskRequest setPartnerId(java.lang.Long partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  /**
   * Required. The SDF version of the downloaded file. If set to `SDF_VERSION_UNSPECIFIED`, this
   * will default to the version specified by the advertiser or partner identified by `root_id`. An
   * advertiser inherits its SDF version from its partner unless configured otherwise.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * Required. The SDF version of the downloaded file. If set to `SDF_VERSION_UNSPECIFIED`, this
   * will default to the version specified by the advertiser or partner identified by `root_id`. An
   * advertiser inherits its SDF version from its partner unless configured otherwise.
   * @param version version or {@code null} for none
   */
  public CreateSdfDownloadTaskRequest setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public CreateSdfDownloadTaskRequest set(String fieldName, Object value) {
    return (CreateSdfDownloadTaskRequest) super.set(fieldName, value);
  }

  @Override
  public CreateSdfDownloadTaskRequest clone() {
    return (CreateSdfDownloadTaskRequest) super.clone();
  }

}
