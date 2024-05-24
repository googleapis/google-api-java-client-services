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

package com.google.api.services.spanner.v1.model;

/**
 * Message type for a single-region quorum.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SingleRegionQuorum extends com.google.api.client.json.GenericJson {

  /**
   * Required. The location of the serving region, e.g. "us-central1". The location must be one of
   * the regions within the dual region instance configuration of your database. The list of valid
   * locations is available via [GetInstanceConfig[InstanceAdmin.GetInstanceConfig] API. This should
   * only be used if you plan to change quorum in single-region quorum type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String servingLocation;

  /**
   * Required. The location of the serving region, e.g. "us-central1". The location must be one of
   * the regions within the dual region instance configuration of your database. The list of valid
   * locations is available via [GetInstanceConfig[InstanceAdmin.GetInstanceConfig] API. This should
   * only be used if you plan to change quorum in single-region quorum type.
   * @return value or {@code null} for none
   */
  public java.lang.String getServingLocation() {
    return servingLocation;
  }

  /**
   * Required. The location of the serving region, e.g. "us-central1". The location must be one of
   * the regions within the dual region instance configuration of your database. The list of valid
   * locations is available via [GetInstanceConfig[InstanceAdmin.GetInstanceConfig] API. This should
   * only be used if you plan to change quorum in single-region quorum type.
   * @param servingLocation servingLocation or {@code null} for none
   */
  public SingleRegionQuorum setServingLocation(java.lang.String servingLocation) {
    this.servingLocation = servingLocation;
    return this;
  }

  @Override
  public SingleRegionQuorum set(String fieldName, Object value) {
    return (SingleRegionQuorum) super.set(fieldName, value);
  }

  @Override
  public SingleRegionQuorum clone() {
    return (SingleRegionQuorum) super.clone();
  }

}