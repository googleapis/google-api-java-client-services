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

package com.google.api.services.workstations.v1.model;

/**
 * An EphemeralDirectory is backed by a Compute Engine persistent disk.
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
public final class GcePersistentDisk extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Type of the disk to use. Defaults to `"pd-standard"`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String diskType;

  /**
   * Optional. Whether the disk is read only. If true, the disk may be shared by multiple VMs and
   * source_snapshot must be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean readOnly;

  /**
   * Optional. Name of the disk image to use as the source for the disk. Must be empty if
   * source_snapshot is set. Updating source_image will update content in the ephemeral directory
   * after the workstation is restarted. Only file systems supported by Container-Optimized OS (COS)
   * are explicitly supported. For a list of supported file systems, please refer to the [COS
   * documentation](https://cloud.google.com/container-optimized-os/docs/concepts/supported-
   * filesystems). This field is mutable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceImage;

  /**
   * Optional. Name of the snapshot to use as the source for the disk. Must be empty if source_image
   * is set. Must be empty if read_only is false. Updating source_snapshot will update content in
   * the ephemeral directory after the workstation is restarted. Only file systems supported by
   * Container-Optimized OS (COS) are explicitly supported. For a list of supported file systems,
   * see [the filesystems available in Container-Optimized OS](https://cloud.google.com/container-
   * optimized-os/docs/concepts/supported-filesystems). This field is mutable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceSnapshot;

  /**
   * Optional. Type of the disk to use. Defaults to `"pd-standard"`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDiskType() {
    return diskType;
  }

  /**
   * Optional. Type of the disk to use. Defaults to `"pd-standard"`.
   * @param diskType diskType or {@code null} for none
   */
  public GcePersistentDisk setDiskType(java.lang.String diskType) {
    this.diskType = diskType;
    return this;
  }

  /**
   * Optional. Whether the disk is read only. If true, the disk may be shared by multiple VMs and
   * source_snapshot must be set.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReadOnly() {
    return readOnly;
  }

  /**
   * Optional. Whether the disk is read only. If true, the disk may be shared by multiple VMs and
   * source_snapshot must be set.
   * @param readOnly readOnly or {@code null} for none
   */
  public GcePersistentDisk setReadOnly(java.lang.Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * Optional. Name of the disk image to use as the source for the disk. Must be empty if
   * source_snapshot is set. Updating source_image will update content in the ephemeral directory
   * after the workstation is restarted. Only file systems supported by Container-Optimized OS (COS)
   * are explicitly supported. For a list of supported file systems, please refer to the [COS
   * documentation](https://cloud.google.com/container-optimized-os/docs/concepts/supported-
   * filesystems). This field is mutable.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceImage() {
    return sourceImage;
  }

  /**
   * Optional. Name of the disk image to use as the source for the disk. Must be empty if
   * source_snapshot is set. Updating source_image will update content in the ephemeral directory
   * after the workstation is restarted. Only file systems supported by Container-Optimized OS (COS)
   * are explicitly supported. For a list of supported file systems, please refer to the [COS
   * documentation](https://cloud.google.com/container-optimized-os/docs/concepts/supported-
   * filesystems). This field is mutable.
   * @param sourceImage sourceImage or {@code null} for none
   */
  public GcePersistentDisk setSourceImage(java.lang.String sourceImage) {
    this.sourceImage = sourceImage;
    return this;
  }

  /**
   * Optional. Name of the snapshot to use as the source for the disk. Must be empty if source_image
   * is set. Must be empty if read_only is false. Updating source_snapshot will update content in
   * the ephemeral directory after the workstation is restarted. Only file systems supported by
   * Container-Optimized OS (COS) are explicitly supported. For a list of supported file systems,
   * see [the filesystems available in Container-Optimized OS](https://cloud.google.com/container-
   * optimized-os/docs/concepts/supported-filesystems). This field is mutable.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceSnapshot() {
    return sourceSnapshot;
  }

  /**
   * Optional. Name of the snapshot to use as the source for the disk. Must be empty if source_image
   * is set. Must be empty if read_only is false. Updating source_snapshot will update content in
   * the ephemeral directory after the workstation is restarted. Only file systems supported by
   * Container-Optimized OS (COS) are explicitly supported. For a list of supported file systems,
   * see [the filesystems available in Container-Optimized OS](https://cloud.google.com/container-
   * optimized-os/docs/concepts/supported-filesystems). This field is mutable.
   * @param sourceSnapshot sourceSnapshot or {@code null} for none
   */
  public GcePersistentDisk setSourceSnapshot(java.lang.String sourceSnapshot) {
    this.sourceSnapshot = sourceSnapshot;
    return this;
  }

  @Override
  public GcePersistentDisk set(String fieldName, Object value) {
    return (GcePersistentDisk) super.set(fieldName, value);
  }

  @Override
  public GcePersistentDisk clone() {
    return (GcePersistentDisk) super.clone();
  }

}
