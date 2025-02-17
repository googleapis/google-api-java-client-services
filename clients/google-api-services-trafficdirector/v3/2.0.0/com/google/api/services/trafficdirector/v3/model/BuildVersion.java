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

package com.google.api.services.trafficdirector.v3.model;

/**
 * BuildVersion combines SemVer version of extension with free-form build information (i.e. 'alpha',
 * 'private-build') as a set of strings.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Traffic Director API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BuildVersion extends com.google.api.client.json.GenericJson {

  /**
   * Free-form build information. Envoy defines several well known keys in the
   * source/common/version/version.h file
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> metadata;

  /**
   * SemVer version of extension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SemanticVersion version;

  /**
   * Free-form build information. Envoy defines several well known keys in the
   * source/common/version/version.h file
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getMetadata() {
    return metadata;
  }

  /**
   * Free-form build information. Envoy defines several well known keys in the
   * source/common/version/version.h file
   * @param metadata metadata or {@code null} for none
   */
  public BuildVersion setMetadata(java.util.Map<String, java.lang.Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * SemVer version of extension.
   * @return value or {@code null} for none
   */
  public SemanticVersion getVersion() {
    return version;
  }

  /**
   * SemVer version of extension.
   * @param version version or {@code null} for none
   */
  public BuildVersion setVersion(SemanticVersion version) {
    this.version = version;
    return this;
  }

  @Override
  public BuildVersion set(String fieldName, Object value) {
    return (BuildVersion) super.set(fieldName, value);
  }

  @Override
  public BuildVersion clone() {
    return (BuildVersion) super.clone();
  }

}
