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

package com.google.api.services.cloudasset.v1.model;

/**
 * Attached resource representation, which is defined by the corresponding service provider. It
 * represents an attached resource's payload.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AttachedResource extends com.google.api.client.json.GenericJson {

  /**
   * The type of this attached resource. Example: `osconfig.googleapis.com/Inventory` You can find
   * the supported attached asset types of each resource in this table:
   * `https://cloud.google.com/asset-inventory/docs/supported-asset-types`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String assetType;

  /**
   * Versioned resource representations of this attached resource. This is repeated because there
   * could be multiple versions of the attached resource representations during version migration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<VersionedResource> versionedResources;

  /**
   * The type of this attached resource. Example: `osconfig.googleapis.com/Inventory` You can find
   * the supported attached asset types of each resource in this table:
   * `https://cloud.google.com/asset-inventory/docs/supported-asset-types`
   * @return value or {@code null} for none
   */
  public java.lang.String getAssetType() {
    return assetType;
  }

  /**
   * The type of this attached resource. Example: `osconfig.googleapis.com/Inventory` You can find
   * the supported attached asset types of each resource in this table:
   * `https://cloud.google.com/asset-inventory/docs/supported-asset-types`
   * @param assetType assetType or {@code null} for none
   */
  public AttachedResource setAssetType(java.lang.String assetType) {
    this.assetType = assetType;
    return this;
  }

  /**
   * Versioned resource representations of this attached resource. This is repeated because there
   * could be multiple versions of the attached resource representations during version migration.
   * @return value or {@code null} for none
   */
  public java.util.List<VersionedResource> getVersionedResources() {
    return versionedResources;
  }

  /**
   * Versioned resource representations of this attached resource. This is repeated because there
   * could be multiple versions of the attached resource representations during version migration.
   * @param versionedResources versionedResources or {@code null} for none
   */
  public AttachedResource setVersionedResources(java.util.List<VersionedResource> versionedResources) {
    this.versionedResources = versionedResources;
    return this;
  }

  @Override
  public AttachedResource set(String fieldName, Object value) {
    return (AttachedResource) super.set(fieldName, value);
  }

  @Override
  public AttachedResource clone() {
    return (AttachedResource) super.clone();
  }

}
