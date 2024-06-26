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

package com.google.api.services.run.v2.model;

/**
 * Request message for exporting Cloud Run image.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRunV2ExportImageRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The export destination url (the Artifact Registry repo).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destinationRepo;

  /**
   * Required. The export destination url (the Artifact Registry repo).
   * @return value or {@code null} for none
   */
  public java.lang.String getDestinationRepo() {
    return destinationRepo;
  }

  /**
   * Required. The export destination url (the Artifact Registry repo).
   * @param destinationRepo destinationRepo or {@code null} for none
   */
  public GoogleCloudRunV2ExportImageRequest setDestinationRepo(java.lang.String destinationRepo) {
    this.destinationRepo = destinationRepo;
    return this;
  }

  @Override
  public GoogleCloudRunV2ExportImageRequest set(String fieldName, Object value) {
    return (GoogleCloudRunV2ExportImageRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRunV2ExportImageRequest clone() {
    return (GoogleCloudRunV2ExportImageRequest) super.clone();
  }

}
