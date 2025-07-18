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

package com.google.api.services.backupdr.v1.model;

/**
 * DiskTargetEnvironment represents the target environment for the disk.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Backup and DR Service API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DiskTargetEnvironment extends com.google.api.client.json.GenericJson {

  /**
   * Required. Target project for the disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String project;

  /**
   * Required. Target zone for the disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * Required. Target project for the disk.
   * @return value or {@code null} for none
   */
  public java.lang.String getProject() {
    return project;
  }

  /**
   * Required. Target project for the disk.
   * @param project project or {@code null} for none
   */
  public DiskTargetEnvironment setProject(java.lang.String project) {
    this.project = project;
    return this;
  }

  /**
   * Required. Target zone for the disk.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * Required. Target zone for the disk.
   * @param zone zone or {@code null} for none
   */
  public DiskTargetEnvironment setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public DiskTargetEnvironment set(String fieldName, Object value) {
    return (DiskTargetEnvironment) super.set(fieldName, value);
  }

  @Override
  public DiskTargetEnvironment clone() {
    return (DiskTargetEnvironment) super.clone();
  }

}
