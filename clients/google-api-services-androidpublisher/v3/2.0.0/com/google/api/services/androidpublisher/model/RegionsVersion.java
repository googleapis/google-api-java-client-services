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

package com.google.api.services.androidpublisher.model;

/**
 * The version of the available regions being used for the specified resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Android Developer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RegionsVersion extends com.google.api.client.json.GenericJson {

  /**
   * Required. A string representing the version of available regions being used for the specified
   * resource. Regional prices and latest supported version for the resource have to be specified
   * according to the information published in [this
   * article](https://support.google.com/googleplay/android-developer/answer/10532353). Each time
   * the supported locations substantially change, the version will be incremented. Using this field
   * will ensure that creating and updating the resource with an older region's version and set of
   * regional prices and currencies will succeed even though a new version is available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * Required. A string representing the version of available regions being used for the specified
   * resource. Regional prices and latest supported version for the resource have to be specified
   * according to the information published in [this
   * article](https://support.google.com/googleplay/android-developer/answer/10532353). Each time
   * the supported locations substantially change, the version will be incremented. Using this field
   * will ensure that creating and updating the resource with an older region's version and set of
   * regional prices and currencies will succeed even though a new version is available.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * Required. A string representing the version of available regions being used for the specified
   * resource. Regional prices and latest supported version for the resource have to be specified
   * according to the information published in [this
   * article](https://support.google.com/googleplay/android-developer/answer/10532353). Each time
   * the supported locations substantially change, the version will be incremented. Using this field
   * will ensure that creating and updating the resource with an older region's version and set of
   * regional prices and currencies will succeed even though a new version is available.
   * @param version version or {@code null} for none
   */
  public RegionsVersion setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public RegionsVersion set(String fieldName, Object value) {
    return (RegionsVersion) super.set(fieldName, value);
  }

  @Override
  public RegionsVersion clone() {
    return (RegionsVersion) super.clone();
  }

}
