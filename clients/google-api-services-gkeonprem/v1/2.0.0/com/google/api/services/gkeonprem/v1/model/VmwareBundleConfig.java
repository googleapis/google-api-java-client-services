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

package com.google.api.services.gkeonprem.v1.model;

/**
 * VmwareBundleConfig represents configuration for the bundle.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE On-Prem API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VmwareBundleConfig extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Resource status for the bundle.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResourceStatus status;

  /**
   * The version of the bundle.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * Output only. Resource status for the bundle.
   * @return value or {@code null} for none
   */
  public ResourceStatus getStatus() {
    return status;
  }

  /**
   * Output only. Resource status for the bundle.
   * @param status status or {@code null} for none
   */
  public VmwareBundleConfig setStatus(ResourceStatus status) {
    this.status = status;
    return this;
  }

  /**
   * The version of the bundle.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * The version of the bundle.
   * @param version version or {@code null} for none
   */
  public VmwareBundleConfig setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public VmwareBundleConfig set(String fieldName, Object value) {
    return (VmwareBundleConfig) super.set(fieldName, value);
  }

  @Override
  public VmwareBundleConfig clone() {
    return (VmwareBundleConfig) super.clone();
  }

}
