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

package com.google.api.services.dialogflow.v3.model;

/**
 * The response message for EntityTypes.ExportEntityTypes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1ExportEntityTypesResponse extends com.google.api.client.json.GenericJson {

  /**
   * Uncompressed byte content for entity types. This field is populated only if
   * `entity_types_content_inline` is set to true in ExportEntityTypesRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1InlineDestination entityTypesContent;

  /**
   * The URI to a file containing the exported entity types. This field is populated only if
   * `entity_types_uri` is specified in ExportEntityTypesRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityTypesUri;

  /**
   * Uncompressed byte content for entity types. This field is populated only if
   * `entity_types_content_inline` is set to true in ExportEntityTypesRequest.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1InlineDestination getEntityTypesContent() {
    return entityTypesContent;
  }

  /**
   * Uncompressed byte content for entity types. This field is populated only if
   * `entity_types_content_inline` is set to true in ExportEntityTypesRequest.
   * @param entityTypesContent entityTypesContent or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ExportEntityTypesResponse setEntityTypesContent(GoogleCloudDialogflowCxV3beta1InlineDestination entityTypesContent) {
    this.entityTypesContent = entityTypesContent;
    return this;
  }

  /**
   * The URI to a file containing the exported entity types. This field is populated only if
   * `entity_types_uri` is specified in ExportEntityTypesRequest.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntityTypesUri() {
    return entityTypesUri;
  }

  /**
   * The URI to a file containing the exported entity types. This field is populated only if
   * `entity_types_uri` is specified in ExportEntityTypesRequest.
   * @param entityTypesUri entityTypesUri or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ExportEntityTypesResponse setEntityTypesUri(java.lang.String entityTypesUri) {
    this.entityTypesUri = entityTypesUri;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1ExportEntityTypesResponse set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1ExportEntityTypesResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1ExportEntityTypesResponse clone() {
    return (GoogleCloudDialogflowCxV3beta1ExportEntityTypesResponse) super.clone();
  }

}
