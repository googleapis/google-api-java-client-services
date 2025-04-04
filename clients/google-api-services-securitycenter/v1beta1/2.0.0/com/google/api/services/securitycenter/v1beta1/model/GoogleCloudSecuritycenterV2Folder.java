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

package com.google.api.services.securitycenter.v1beta1.model;

/**
 * Message that contains the resource name and display name of a folder resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudSecuritycenterV2Folder extends com.google.api.client.json.GenericJson {

  /**
   * Full resource name of this folder. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceFolder;

  /**
   * The user defined display name for this folder.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceFolderDisplayName;

  /**
   * Full resource name of this folder. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceFolder() {
    return resourceFolder;
  }

  /**
   * Full resource name of this folder. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * @param resourceFolder resourceFolder or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Folder setResourceFolder(java.lang.String resourceFolder) {
    this.resourceFolder = resourceFolder;
    return this;
  }

  /**
   * The user defined display name for this folder.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceFolderDisplayName() {
    return resourceFolderDisplayName;
  }

  /**
   * The user defined display name for this folder.
   * @param resourceFolderDisplayName resourceFolderDisplayName or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Folder setResourceFolderDisplayName(java.lang.String resourceFolderDisplayName) {
    this.resourceFolderDisplayName = resourceFolderDisplayName;
    return this;
  }

  @Override
  public GoogleCloudSecuritycenterV2Folder set(String fieldName, Object value) {
    return (GoogleCloudSecuritycenterV2Folder) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudSecuritycenterV2Folder clone() {
    return (GoogleCloudSecuritycenterV2Folder) super.clone();
  }

}
