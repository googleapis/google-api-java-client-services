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

package com.google.api.services.discovery.model;

/**
 * Model definition for RestResource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the API Discovery Service. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RestResource extends com.google.api.client.json.GenericJson {

  /**
   * Whether this resource is deprecated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean deprecated;

  /**
   * Methods on this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, RestMethod> methods;

  static {
    // hack to force ProGuard to consider RestMethod used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(RestMethod.class);
  }

  /**
   * Sub-resources on this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, RestResource> resources;

  /**
   * Whether this resource is deprecated.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDeprecated() {
    return deprecated;
  }

  /**
   * Whether this resource is deprecated.
   * @param deprecated deprecated or {@code null} for none
   */
  public RestResource setDeprecated(java.lang.Boolean deprecated) {
    this.deprecated = deprecated;
    return this;
  }

  /**
   * Methods on this resource.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, RestMethod> getMethods() {
    return methods;
  }

  /**
   * Methods on this resource.
   * @param methods methods or {@code null} for none
   */
  public RestResource setMethods(java.util.Map<String, RestMethod> methods) {
    this.methods = methods;
    return this;
  }

  /**
   * Sub-resources on this resource.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, RestResource> getResources() {
    return resources;
  }

  /**
   * Sub-resources on this resource.
   * @param resources resources or {@code null} for none
   */
  public RestResource setResources(java.util.Map<String, RestResource> resources) {
    this.resources = resources;
    return this;
  }

  @Override
  public RestResource set(String fieldName, Object value) {
    return (RestResource) super.set(fieldName, value);
  }

  @Override
  public RestResource clone() {
    return (RestResource) super.clone();
  }

}
