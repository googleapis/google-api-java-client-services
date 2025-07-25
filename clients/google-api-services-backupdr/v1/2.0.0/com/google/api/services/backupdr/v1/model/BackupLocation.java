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
 * BackupLocation represents a cloud location where a backup can be stored.
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
public final class BackupLocation extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The id of the cloud location. Example: "us-central1"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locationId;

  /**
   * Output only. The type of the location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Output only. The id of the cloud location. Example: "us-central1"
   * @return value or {@code null} for none
   */
  public java.lang.String getLocationId() {
    return locationId;
  }

  /**
   * Output only. The id of the cloud location. Example: "us-central1"
   * @param locationId locationId or {@code null} for none
   */
  public BackupLocation setLocationId(java.lang.String locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * Output only. The type of the location.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Output only. The type of the location.
   * @param type type or {@code null} for none
   */
  public BackupLocation setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public BackupLocation set(String fieldName, Object value) {
    return (BackupLocation) super.set(fieldName, value);
  }

  @Override
  public BackupLocation clone() {
    return (BackupLocation) super.clone();
  }

}
