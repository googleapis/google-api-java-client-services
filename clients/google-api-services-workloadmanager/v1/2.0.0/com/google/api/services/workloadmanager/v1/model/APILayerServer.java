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

package com.google.api.services.workloadmanager.v1.model;

/**
 * The API layer server
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Workload Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class APILayerServer extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The api layer name
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. OS information
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String osVersion;

  /**
   * Output only. resources in the component
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CloudResource> resources;

  /**
   * Output only. The api layer name
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The api layer name
   * @param name name or {@code null} for none
   */
  public APILayerServer setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. OS information
   * @return value or {@code null} for none
   */
  public java.lang.String getOsVersion() {
    return osVersion;
  }

  /**
   * Output only. OS information
   * @param osVersion osVersion or {@code null} for none
   */
  public APILayerServer setOsVersion(java.lang.String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  /**
   * Output only. resources in the component
   * @return value or {@code null} for none
   */
  public java.util.List<CloudResource> getResources() {
    return resources;
  }

  /**
   * Output only. resources in the component
   * @param resources resources or {@code null} for none
   */
  public APILayerServer setResources(java.util.List<CloudResource> resources) {
    this.resources = resources;
    return this;
  }

  @Override
  public APILayerServer set(String fieldName, Object value) {
    return (APILayerServer) super.set(fieldName, value);
  }

  @Override
  public APILayerServer clone() {
    return (APILayerServer) super.clone();
  }

}
