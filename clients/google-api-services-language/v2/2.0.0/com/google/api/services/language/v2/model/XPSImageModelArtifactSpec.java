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
 * Stores the locations and related metadata of the model artifacts. Populated for uCAIP requests
 * only.
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
public final class XPSImageModelArtifactSpec extends com.google.api.client.json.GenericJson {

  /**
   * The Tensorflow checkpoint files. e.g. Used for resumable training.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private XPSModelArtifactItem checkpointArtifact;

  /**
   * The model binary files in different formats for model export.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<XPSModelArtifactItem> exportArtifact;

  /**
   * Google Cloud Storage URI of decoded labels file for model export 'dict.txt'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String labelGcsUri;

  /**
   * The default model binary file used for serving (e.g. online predict, batch predict) via public
   * Cloud AI Platform API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private XPSModelArtifactItem servingArtifact;

  /**
   * Google Cloud Storage URI prefix of Tensorflow JavaScript binary files 'groupX-shardXofX.bin'.
   * Deprecated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tfJsBinaryGcsPrefix;

  /**
   * Google Cloud Storage URI of Tensorflow Lite metadata 'tflite_metadata.json'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tfLiteMetadataGcsUri;

  /**
   * The Tensorflow checkpoint files. e.g. Used for resumable training.
   * @return value or {@code null} for none
   */
  public XPSModelArtifactItem getCheckpointArtifact() {
    return checkpointArtifact;
  }

  /**
   * The Tensorflow checkpoint files. e.g. Used for resumable training.
   * @param checkpointArtifact checkpointArtifact or {@code null} for none
   */
  public XPSImageModelArtifactSpec setCheckpointArtifact(XPSModelArtifactItem checkpointArtifact) {
    this.checkpointArtifact = checkpointArtifact;
    return this;
  }

  /**
   * The model binary files in different formats for model export.
   * @return value or {@code null} for none
   */
  public java.util.List<XPSModelArtifactItem> getExportArtifact() {
    return exportArtifact;
  }

  /**
   * The model binary files in different formats for model export.
   * @param exportArtifact exportArtifact or {@code null} for none
   */
  public XPSImageModelArtifactSpec setExportArtifact(java.util.List<XPSModelArtifactItem> exportArtifact) {
    this.exportArtifact = exportArtifact;
    return this;
  }

  /**
   * Google Cloud Storage URI of decoded labels file for model export 'dict.txt'.
   * @return value or {@code null} for none
   */
  public java.lang.String getLabelGcsUri() {
    return labelGcsUri;
  }

  /**
   * Google Cloud Storage URI of decoded labels file for model export 'dict.txt'.
   * @param labelGcsUri labelGcsUri or {@code null} for none
   */
  public XPSImageModelArtifactSpec setLabelGcsUri(java.lang.String labelGcsUri) {
    this.labelGcsUri = labelGcsUri;
    return this;
  }

  /**
   * The default model binary file used for serving (e.g. online predict, batch predict) via public
   * Cloud AI Platform API.
   * @return value or {@code null} for none
   */
  public XPSModelArtifactItem getServingArtifact() {
    return servingArtifact;
  }

  /**
   * The default model binary file used for serving (e.g. online predict, batch predict) via public
   * Cloud AI Platform API.
   * @param servingArtifact servingArtifact or {@code null} for none
   */
  public XPSImageModelArtifactSpec setServingArtifact(XPSModelArtifactItem servingArtifact) {
    this.servingArtifact = servingArtifact;
    return this;
  }

  /**
   * Google Cloud Storage URI prefix of Tensorflow JavaScript binary files 'groupX-shardXofX.bin'.
   * Deprecated.
   * @return value or {@code null} for none
   */
  public java.lang.String getTfJsBinaryGcsPrefix() {
    return tfJsBinaryGcsPrefix;
  }

  /**
   * Google Cloud Storage URI prefix of Tensorflow JavaScript binary files 'groupX-shardXofX.bin'.
   * Deprecated.
   * @param tfJsBinaryGcsPrefix tfJsBinaryGcsPrefix or {@code null} for none
   */
  public XPSImageModelArtifactSpec setTfJsBinaryGcsPrefix(java.lang.String tfJsBinaryGcsPrefix) {
    this.tfJsBinaryGcsPrefix = tfJsBinaryGcsPrefix;
    return this;
  }

  /**
   * Google Cloud Storage URI of Tensorflow Lite metadata 'tflite_metadata.json'.
   * @return value or {@code null} for none
   */
  public java.lang.String getTfLiteMetadataGcsUri() {
    return tfLiteMetadataGcsUri;
  }

  /**
   * Google Cloud Storage URI of Tensorflow Lite metadata 'tflite_metadata.json'.
   * @param tfLiteMetadataGcsUri tfLiteMetadataGcsUri or {@code null} for none
   */
  public XPSImageModelArtifactSpec setTfLiteMetadataGcsUri(java.lang.String tfLiteMetadataGcsUri) {
    this.tfLiteMetadataGcsUri = tfLiteMetadataGcsUri;
    return this;
  }

  @Override
  public XPSImageModelArtifactSpec set(String fieldName, Object value) {
    return (XPSImageModelArtifactSpec) super.set(fieldName, value);
  }

  @Override
  public XPSImageModelArtifactSpec clone() {
    return (XPSImageModelArtifactSpec) super.clone();
  }

}
