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

package com.google.api.services.healthcare.v1.model;

/**
 * Configures de-id options specific to different types of content. Each submessage customizes the
 * handling of an https://tools.ietf.org/html/rfc6838 media type or subtype. Configs are applied in
 * a nested manner at runtime.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeidentifyConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Configures de-id of application/DICOM content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DicomConfig dicom;

  /**
   * Optional. Configures de-id of application/FHIR content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FhirConfig fhir;

  /**
   * Optional. Configures de-identification of image pixels wherever they are found in the
   * source_dataset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ImageConfig image;

  /**
   * Optional. Configures de-identification of text wherever it is found in the source_dataset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextConfig text;

  /**
   * Optional. Ensures in-flight data remains in the region of origin during de-identification. The
   * default value is false. Using this option results in a significant reduction of throughput, and
   * is not compatible with `LOCATION` or `ORGANIZATION_NAME` infoTypes. `LOCATION` must be excluded
   * within TextConfig, and must also be excluded within ImageConfig if image redaction is required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useRegionalDataProcessing;

  /**
   * Optional. Configures de-id of application/DICOM content.
   * @return value or {@code null} for none
   */
  public DicomConfig getDicom() {
    return dicom;
  }

  /**
   * Optional. Configures de-id of application/DICOM content.
   * @param dicom dicom or {@code null} for none
   */
  public DeidentifyConfig setDicom(DicomConfig dicom) {
    this.dicom = dicom;
    return this;
  }

  /**
   * Optional. Configures de-id of application/FHIR content.
   * @return value or {@code null} for none
   */
  public FhirConfig getFhir() {
    return fhir;
  }

  /**
   * Optional. Configures de-id of application/FHIR content.
   * @param fhir fhir or {@code null} for none
   */
  public DeidentifyConfig setFhir(FhirConfig fhir) {
    this.fhir = fhir;
    return this;
  }

  /**
   * Optional. Configures de-identification of image pixels wherever they are found in the
   * source_dataset.
   * @return value or {@code null} for none
   */
  public ImageConfig getImage() {
    return image;
  }

  /**
   * Optional. Configures de-identification of image pixels wherever they are found in the
   * source_dataset.
   * @param image image or {@code null} for none
   */
  public DeidentifyConfig setImage(ImageConfig image) {
    this.image = image;
    return this;
  }

  /**
   * Optional. Configures de-identification of text wherever it is found in the source_dataset.
   * @return value or {@code null} for none
   */
  public TextConfig getText() {
    return text;
  }

  /**
   * Optional. Configures de-identification of text wherever it is found in the source_dataset.
   * @param text text or {@code null} for none
   */
  public DeidentifyConfig setText(TextConfig text) {
    this.text = text;
    return this;
  }

  /**
   * Optional. Ensures in-flight data remains in the region of origin during de-identification. The
   * default value is false. Using this option results in a significant reduction of throughput, and
   * is not compatible with `LOCATION` or `ORGANIZATION_NAME` infoTypes. `LOCATION` must be excluded
   * within TextConfig, and must also be excluded within ImageConfig if image redaction is required.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseRegionalDataProcessing() {
    return useRegionalDataProcessing;
  }

  /**
   * Optional. Ensures in-flight data remains in the region of origin during de-identification. The
   * default value is false. Using this option results in a significant reduction of throughput, and
   * is not compatible with `LOCATION` or `ORGANIZATION_NAME` infoTypes. `LOCATION` must be excluded
   * within TextConfig, and must also be excluded within ImageConfig if image redaction is required.
   * @param useRegionalDataProcessing useRegionalDataProcessing or {@code null} for none
   */
  public DeidentifyConfig setUseRegionalDataProcessing(java.lang.Boolean useRegionalDataProcessing) {
    this.useRegionalDataProcessing = useRegionalDataProcessing;
    return this;
  }

  @Override
  public DeidentifyConfig set(String fieldName, Object value) {
    return (DeidentifyConfig) super.set(fieldName, value);
  }

  @Override
  public DeidentifyConfig clone() {
    return (DeidentifyConfig) super.clone();
  }

}
