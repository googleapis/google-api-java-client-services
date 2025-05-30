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

package com.google.api.services.slides.v1.model;

/**
 * The autofit properties of a Shape. This property is only set for shapes that allow text.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Autofit extends com.google.api.client.json.GenericJson {

  /**
   * The autofit type of the shape. If the autofit type is AUTOFIT_TYPE_UNSPECIFIED, the autofit
   * type is inherited from a parent placeholder if it exists. The field is automatically set to
   * NONE if a request is made that might affect text fitting within its bounding text box. In this
   * case, the font_scale is applied to the font_size and the line_spacing_reduction is applied to
   * the line_spacing. Both properties are also reset to default values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String autofitType;

  /**
   * The font scale applied to the shape. For shapes with autofit_type NONE or SHAPE_AUTOFIT, this
   * value is the default value of 1. For TEXT_AUTOFIT, this value multiplied by the font_size gives
   * the font size that's rendered in the editor. This property is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float fontScale;

  /**
   * The line spacing reduction applied to the shape. For shapes with autofit_type NONE or
   * SHAPE_AUTOFIT, this value is the default value of 0. For TEXT_AUTOFIT, this value subtracted
   * from the line_spacing gives the line spacing that's rendered in the editor. This property is
   * read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float lineSpacingReduction;

  /**
   * The autofit type of the shape. If the autofit type is AUTOFIT_TYPE_UNSPECIFIED, the autofit
   * type is inherited from a parent placeholder if it exists. The field is automatically set to
   * NONE if a request is made that might affect text fitting within its bounding text box. In this
   * case, the font_scale is applied to the font_size and the line_spacing_reduction is applied to
   * the line_spacing. Both properties are also reset to default values.
   * @return value or {@code null} for none
   */
  public java.lang.String getAutofitType() {
    return autofitType;
  }

  /**
   * The autofit type of the shape. If the autofit type is AUTOFIT_TYPE_UNSPECIFIED, the autofit
   * type is inherited from a parent placeholder if it exists. The field is automatically set to
   * NONE if a request is made that might affect text fitting within its bounding text box. In this
   * case, the font_scale is applied to the font_size and the line_spacing_reduction is applied to
   * the line_spacing. Both properties are also reset to default values.
   * @param autofitType autofitType or {@code null} for none
   */
  public Autofit setAutofitType(java.lang.String autofitType) {
    this.autofitType = autofitType;
    return this;
  }

  /**
   * The font scale applied to the shape. For shapes with autofit_type NONE or SHAPE_AUTOFIT, this
   * value is the default value of 1. For TEXT_AUTOFIT, this value multiplied by the font_size gives
   * the font size that's rendered in the editor. This property is read-only.
   * @return value or {@code null} for none
   */
  public java.lang.Float getFontScale() {
    return fontScale;
  }

  /**
   * The font scale applied to the shape. For shapes with autofit_type NONE or SHAPE_AUTOFIT, this
   * value is the default value of 1. For TEXT_AUTOFIT, this value multiplied by the font_size gives
   * the font size that's rendered in the editor. This property is read-only.
   * @param fontScale fontScale or {@code null} for none
   */
  public Autofit setFontScale(java.lang.Float fontScale) {
    this.fontScale = fontScale;
    return this;
  }

  /**
   * The line spacing reduction applied to the shape. For shapes with autofit_type NONE or
   * SHAPE_AUTOFIT, this value is the default value of 0. For TEXT_AUTOFIT, this value subtracted
   * from the line_spacing gives the line spacing that's rendered in the editor. This property is
   * read-only.
   * @return value or {@code null} for none
   */
  public java.lang.Float getLineSpacingReduction() {
    return lineSpacingReduction;
  }

  /**
   * The line spacing reduction applied to the shape. For shapes with autofit_type NONE or
   * SHAPE_AUTOFIT, this value is the default value of 0. For TEXT_AUTOFIT, this value subtracted
   * from the line_spacing gives the line spacing that's rendered in the editor. This property is
   * read-only.
   * @param lineSpacingReduction lineSpacingReduction or {@code null} for none
   */
  public Autofit setLineSpacingReduction(java.lang.Float lineSpacingReduction) {
    this.lineSpacingReduction = lineSpacingReduction;
    return this;
  }

  @Override
  public Autofit set(String fieldName, Object value) {
    return (Autofit) super.set(fieldName, value);
  }

  @Override
  public Autofit clone() {
    return (Autofit) super.clone();
  }

}
