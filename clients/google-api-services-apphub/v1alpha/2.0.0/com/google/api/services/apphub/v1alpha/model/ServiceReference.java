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

package com.google.api.services.apphub.v1alpha.model;

/**
 * Reference to an underlying networking resource that can comprise a Service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServiceReference extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Additional path under the resource URI (demultiplexing one resource URI into
   * multiple entries). Smallest unit a policy can be attached to. Examples: URL Map path entry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * Output only. The underlying resource URI. For example, URI of Forwarding Rule, URL Map, and
   * Backend Service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Output only. Additional path under the resource URI (demultiplexing one resource URI into
   * multiple entries). Smallest unit a policy can be attached to. Examples: URL Map path entry.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * Output only. Additional path under the resource URI (demultiplexing one resource URI into
   * multiple entries). Smallest unit a policy can be attached to. Examples: URL Map path entry.
   * @param path path or {@code null} for none
   */
  public ServiceReference setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  /**
   * Output only. The underlying resource URI. For example, URI of Forwarding Rule, URL Map, and
   * Backend Service.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Output only. The underlying resource URI. For example, URI of Forwarding Rule, URL Map, and
   * Backend Service.
   * @param uri uri or {@code null} for none
   */
  public ServiceReference setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public ServiceReference set(String fieldName, Object value) {
    return (ServiceReference) super.set(fieldName, value);
  }

  @Override
  public ServiceReference clone() {
    return (ServiceReference) super.clone();
  }

}
