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

package com.google.api.services.places.v1.model;

/**
 * Experimental: See https://developers.google.com/maps/documentation/places/web-
 * service/experimental/places-generative for more details. AI-generated summary of the area that
 * the place is in.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Places API (New). For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleMapsPlacesV1PlaceAreaSummary extends com.google.api.client.json.GenericJson {

  /**
   * Content blocks that compose the area summary. Each block has a separate topic about the area.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleMapsPlacesV1ContentBlock> contentBlocks;

  static {
    // hack to force ProGuard to consider GoogleMapsPlacesV1ContentBlock used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleMapsPlacesV1ContentBlock.class);
  }

  /**
   * Content blocks that compose the area summary. Each block has a separate topic about the area.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleMapsPlacesV1ContentBlock> getContentBlocks() {
    return contentBlocks;
  }

  /**
   * Content blocks that compose the area summary. Each block has a separate topic about the area.
   * @param contentBlocks contentBlocks or {@code null} for none
   */
  public GoogleMapsPlacesV1PlaceAreaSummary setContentBlocks(java.util.List<GoogleMapsPlacesV1ContentBlock> contentBlocks) {
    this.contentBlocks = contentBlocks;
    return this;
  }

  @Override
  public GoogleMapsPlacesV1PlaceAreaSummary set(String fieldName, Object value) {
    return (GoogleMapsPlacesV1PlaceAreaSummary) super.set(fieldName, value);
  }

  @Override
  public GoogleMapsPlacesV1PlaceAreaSummary clone() {
    return (GoogleMapsPlacesV1PlaceAreaSummary) super.clone();
  }

}