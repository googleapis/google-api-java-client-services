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

package com.google.api.services.searchads360.v0.model;

/**
 * Asset group asset combination data
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Search Ads 360 Reporting API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAdsSearchads360V0ResourcesAssetGroupAssetCombinationData extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Served assets.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAdsSearchads360V0CommonAssetUsage> assetCombinationServedAssets;

  static {
    // hack to force ProGuard to consider GoogleAdsSearchads360V0CommonAssetUsage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleAdsSearchads360V0CommonAssetUsage.class);
  }

  /**
   * Output only. Served assets.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAdsSearchads360V0CommonAssetUsage> getAssetCombinationServedAssets() {
    return assetCombinationServedAssets;
  }

  /**
   * Output only. Served assets.
   * @param assetCombinationServedAssets assetCombinationServedAssets or {@code null} for none
   */
  public GoogleAdsSearchads360V0ResourcesAssetGroupAssetCombinationData setAssetCombinationServedAssets(java.util.List<GoogleAdsSearchads360V0CommonAssetUsage> assetCombinationServedAssets) {
    this.assetCombinationServedAssets = assetCombinationServedAssets;
    return this;
  }

  @Override
  public GoogleAdsSearchads360V0ResourcesAssetGroupAssetCombinationData set(String fieldName, Object value) {
    return (GoogleAdsSearchads360V0ResourcesAssetGroupAssetCombinationData) super.set(fieldName, value);
  }

  @Override
  public GoogleAdsSearchads360V0ResourcesAssetGroupAssetCombinationData clone() {
    return (GoogleAdsSearchads360V0ResourcesAssetGroupAssetCombinationData) super.clone();
  }

}
