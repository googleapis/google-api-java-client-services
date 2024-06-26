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

package com.google.api.services.aiplatform.v1.model;

/**
 * Represents the spec of persistent disk options.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1PersistentDiskSpec extends com.google.api.client.json.GenericJson {

  /**
   * Size in GB of the disk (default is 100GB).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long diskSizeGb;

  /**
   * Type of the disk (default is "pd-standard"). Valid values: "pd-ssd" (Persistent Disk Solid
   * State Drive) "pd-standard" (Persistent Disk Hard Disk Drive) "pd-balanced" (Balanced Persistent
   * Disk) "pd-extreme" (Extreme Persistent Disk)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String diskType;

  /**
   * Size in GB of the disk (default is 100GB).
   * @return value or {@code null} for none
   */
  public java.lang.Long getDiskSizeGb() {
    return diskSizeGb;
  }

  /**
   * Size in GB of the disk (default is 100GB).
   * @param diskSizeGb diskSizeGb or {@code null} for none
   */
  public GoogleCloudAiplatformV1PersistentDiskSpec setDiskSizeGb(java.lang.Long diskSizeGb) {
    this.diskSizeGb = diskSizeGb;
    return this;
  }

  /**
   * Type of the disk (default is "pd-standard"). Valid values: "pd-ssd" (Persistent Disk Solid
   * State Drive) "pd-standard" (Persistent Disk Hard Disk Drive) "pd-balanced" (Balanced Persistent
   * Disk) "pd-extreme" (Extreme Persistent Disk)
   * @return value or {@code null} for none
   */
  public java.lang.String getDiskType() {
    return diskType;
  }

  /**
   * Type of the disk (default is "pd-standard"). Valid values: "pd-ssd" (Persistent Disk Solid
   * State Drive) "pd-standard" (Persistent Disk Hard Disk Drive) "pd-balanced" (Balanced Persistent
   * Disk) "pd-extreme" (Extreme Persistent Disk)
   * @param diskType diskType or {@code null} for none
   */
  public GoogleCloudAiplatformV1PersistentDiskSpec setDiskType(java.lang.String diskType) {
    this.diskType = diskType;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1PersistentDiskSpec set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1PersistentDiskSpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1PersistentDiskSpec clone() {
    return (GoogleCloudAiplatformV1PersistentDiskSpec) super.clone();
  }

}
