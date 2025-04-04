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

package com.google.api.services.language.v2.model;

/**
 * Map from color to display name. Will only be used by Image Segmentation for uCAIP.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Natural Language API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class XPSColorMap extends com.google.api.client.json.GenericJson {

  /**
   * Should be used during training.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String annotationSpecIdToken;

  /**
   * This type is deprecated in favor of the IntColor below. This is because google.type.Color
   * represent color has a float which semantically does not reflect discrete classes/categories
   * concept. Moreover, to handle it well we need to have some tolerance when converting to a
   * discretized color. As such, the recommendation is to have API surface still use
   * google.type.Color while internally IntColor is used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Color color;

  /**
   * Should be used during preprocessing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private XPSColorMapIntColor intColor;

  /**
   * Should be used during training.
   * @return value or {@code null} for none
   */
  public java.lang.String getAnnotationSpecIdToken() {
    return annotationSpecIdToken;
  }

  /**
   * Should be used during training.
   * @param annotationSpecIdToken annotationSpecIdToken or {@code null} for none
   */
  public XPSColorMap setAnnotationSpecIdToken(java.lang.String annotationSpecIdToken) {
    this.annotationSpecIdToken = annotationSpecIdToken;
    return this;
  }

  /**
   * This type is deprecated in favor of the IntColor below. This is because google.type.Color
   * represent color has a float which semantically does not reflect discrete classes/categories
   * concept. Moreover, to handle it well we need to have some tolerance when converting to a
   * discretized color. As such, the recommendation is to have API surface still use
   * google.type.Color while internally IntColor is used.
   * @return value or {@code null} for none
   */
  public Color getColor() {
    return color;
  }

  /**
   * This type is deprecated in favor of the IntColor below. This is because google.type.Color
   * represent color has a float which semantically does not reflect discrete classes/categories
   * concept. Moreover, to handle it well we need to have some tolerance when converting to a
   * discretized color. As such, the recommendation is to have API surface still use
   * google.type.Color while internally IntColor is used.
   * @param color color or {@code null} for none
   */
  public XPSColorMap setColor(Color color) {
    this.color = color;
    return this;
  }

  /**
   * Should be used during preprocessing.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Should be used during preprocessing.
   * @param displayName displayName or {@code null} for none
   */
  public XPSColorMap setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public XPSColorMapIntColor getIntColor() {
    return intColor;
  }

  /**
   * @param intColor intColor or {@code null} for none
   */
  public XPSColorMap setIntColor(XPSColorMapIntColor intColor) {
    this.intColor = intColor;
    return this;
  }

  @Override
  public XPSColorMap set(String fieldName, Object value) {
    return (XPSColorMap) super.set(fieldName, value);
  }

  @Override
  public XPSColorMap clone() {
    return (XPSColorMap) super.clone();
  }

}
