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
 * Boost configuration for this workstation. This object is populated from the parent workstation
 * configuration.
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
public final class WorkstationBoostConfig extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Boost configuration ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Output only. Whether or not the current workstation is actively boosted with this id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean running;

  /**
   * Output only. Boost configuration ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Output only. Boost configuration ID.
   * @param id id or {@code null} for none
   */
  public WorkstationBoostConfig setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Output only. Whether or not the current workstation is actively boosted with this id.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRunning() {
    return running;
  }

  /**
   * Output only. Whether or not the current workstation is actively boosted with this id.
   * @param running running or {@code null} for none
   */
  public WorkstationBoostConfig setRunning(java.lang.Boolean running) {
    this.running = running;
    return this;
  }

  @Override
  public WorkstationBoostConfig set(String fieldName, Object value) {
    return (WorkstationBoostConfig) super.set(fieldName, value);
  }

  @Override
  public WorkstationBoostConfig clone() {
    return (WorkstationBoostConfig) super.clone();
  }

}
