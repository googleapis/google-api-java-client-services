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

package com.google.api.services.discoveryengine.v1beta.model;

/**
 * Adjusts order of products in returned list.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1alphaControlBoostAction extends com.google.api.client.json.GenericJson {

  /**
   * Strength of the boost, which should be in [-1, 1]. Negative boost means demotion. Default is
   * 0.0 (No-op).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float boost;

  /**
   * Required. Specifies which data store's documents can be boosted by this control. Full data
   * store name e.g.
   * projects/123/locations/global/collections/default_collection/dataStores/default_data_store
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataStore;

  /**
   * Required. Specifies which products to apply the boost to. If no filter is provided all products
   * will be boosted (No-op). Syntax documentation: https://cloud.google.com/retail/docs/filter-and-
   * order Maximum length is 5000 characters. Otherwise an INVALID ARGUMENT error is thrown.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * Optional. Strength of the boost, which should be in [-1, 1]. Negative boost means demotion.
   * Default is 0.0 (No-op).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float fixedBoost;

  /**
   * Optional. Complex specification for custom ranking based on customer defined attribute value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaControlBoostActionInterpolationBoostSpec interpolationBoostSpec;

  /**
   * Strength of the boost, which should be in [-1, 1]. Negative boost means demotion. Default is
   * 0.0 (No-op).
   * @return value or {@code null} for none
   */
  public java.lang.Float getBoost() {
    return boost;
  }

  /**
   * Strength of the boost, which should be in [-1, 1]. Negative boost means demotion. Default is
   * 0.0 (No-op).
   * @param boost boost or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaControlBoostAction setBoost(java.lang.Float boost) {
    this.boost = boost;
    return this;
  }

  /**
   * Required. Specifies which data store's documents can be boosted by this control. Full data
   * store name e.g.
   * projects/123/locations/global/collections/default_collection/dataStores/default_data_store
   * @return value or {@code null} for none
   */
  public java.lang.String getDataStore() {
    return dataStore;
  }

  /**
   * Required. Specifies which data store's documents can be boosted by this control. Full data
   * store name e.g.
   * projects/123/locations/global/collections/default_collection/dataStores/default_data_store
   * @param dataStore dataStore or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaControlBoostAction setDataStore(java.lang.String dataStore) {
    this.dataStore = dataStore;
    return this;
  }

  /**
   * Required. Specifies which products to apply the boost to. If no filter is provided all products
   * will be boosted (No-op). Syntax documentation: https://cloud.google.com/retail/docs/filter-and-
   * order Maximum length is 5000 characters. Otherwise an INVALID ARGUMENT error is thrown.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * Required. Specifies which products to apply the boost to. If no filter is provided all products
   * will be boosted (No-op). Syntax documentation: https://cloud.google.com/retail/docs/filter-and-
   * order Maximum length is 5000 characters. Otherwise an INVALID ARGUMENT error is thrown.
   * @param filter filter or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaControlBoostAction setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Optional. Strength of the boost, which should be in [-1, 1]. Negative boost means demotion.
   * Default is 0.0 (No-op).
   * @return value or {@code null} for none
   */
  public java.lang.Float getFixedBoost() {
    return fixedBoost;
  }

  /**
   * Optional. Strength of the boost, which should be in [-1, 1]. Negative boost means demotion.
   * Default is 0.0 (No-op).
   * @param fixedBoost fixedBoost or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaControlBoostAction setFixedBoost(java.lang.Float fixedBoost) {
    this.fixedBoost = fixedBoost;
    return this;
  }

  /**
   * Optional. Complex specification for custom ranking based on customer defined attribute value.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaControlBoostActionInterpolationBoostSpec getInterpolationBoostSpec() {
    return interpolationBoostSpec;
  }

  /**
   * Optional. Complex specification for custom ranking based on customer defined attribute value.
   * @param interpolationBoostSpec interpolationBoostSpec or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaControlBoostAction setInterpolationBoostSpec(GoogleCloudDiscoveryengineV1alphaControlBoostActionInterpolationBoostSpec interpolationBoostSpec) {
    this.interpolationBoostSpec = interpolationBoostSpec;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaControlBoostAction set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1alphaControlBoostAction) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaControlBoostAction clone() {
    return (GoogleCloudDiscoveryengineV1alphaControlBoostAction) super.clone();
  }

}
