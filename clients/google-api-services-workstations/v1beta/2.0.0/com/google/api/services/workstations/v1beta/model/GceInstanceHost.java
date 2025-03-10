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

package com.google.api.services.workstations.v1beta.model;

/**
 * The Compute Engine instance host.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Workstations API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GceInstanceHost extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Output only. The ID of the Compute Engine instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Optional. Output only. The name of the Compute Engine instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. Output only. The zone of the Compute Engine instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * Optional. Output only. The ID of the Compute Engine instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Optional. Output only. The ID of the Compute Engine instance.
   * @param id id or {@code null} for none
   */
  public GceInstanceHost setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Optional. Output only. The name of the Compute Engine instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Optional. Output only. The name of the Compute Engine instance.
   * @param name name or {@code null} for none
   */
  public GceInstanceHost setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. Output only. The zone of the Compute Engine instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * Optional. Output only. The zone of the Compute Engine instance.
   * @param zone zone or {@code null} for none
   */
  public GceInstanceHost setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public GceInstanceHost set(String fieldName, Object value) {
    return (GceInstanceHost) super.set(fieldName, value);
  }

  @Override
  public GceInstanceHost clone() {
    return (GceInstanceHost) super.clone();
  }

}
