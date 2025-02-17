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

package com.google.api.services.bigquery.model;

/**
 * Model definition for ModelDefinition.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ModelDefinition extends com.google.api.client.json.GenericJson {

  /**
   * Deprecated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ModelOptions modelOptions;

  /**
   * Deprecated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BqmlTrainingRun> trainingRuns;

  static {
    // hack to force ProGuard to consider BqmlTrainingRun used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(BqmlTrainingRun.class);
  }

  /**
   * Deprecated.
   * @return value or {@code null} for none
   */
  public ModelOptions getModelOptions() {
    return modelOptions;
  }

  /**
   * Deprecated.
   * @param modelOptions modelOptions or {@code null} for none
   */
  public ModelDefinition setModelOptions(ModelOptions modelOptions) {
    this.modelOptions = modelOptions;
    return this;
  }

  /**
   * Deprecated.
   * @return value or {@code null} for none
   */
  public java.util.List<BqmlTrainingRun> getTrainingRuns() {
    return trainingRuns;
  }

  /**
   * Deprecated.
   * @param trainingRuns trainingRuns or {@code null} for none
   */
  public ModelDefinition setTrainingRuns(java.util.List<BqmlTrainingRun> trainingRuns) {
    this.trainingRuns = trainingRuns;
    return this;
  }

  @Override
  public ModelDefinition set(String fieldName, Object value) {
    return (ModelDefinition) super.set(fieldName, value);
  }

  @Override
  public ModelDefinition clone() {
    return (ModelDefinition) super.clone();
  }

  /**
   * Deprecated.
   */
  public static final class ModelOptions extends com.google.api.client.json.GenericJson {

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> labels;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String lossType;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String modelType;

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<java.lang.String> getLabels() {
      return labels;
    }

    /**
     * @param labels labels or {@code null} for none
     */
    public ModelOptions setLabels(java.util.List<java.lang.String> labels) {
      this.labels = labels;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getLossType() {
      return lossType;
    }

    /**
     * @param lossType lossType or {@code null} for none
     */
    public ModelOptions setLossType(java.lang.String lossType) {
      this.lossType = lossType;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getModelType() {
      return modelType;
    }

    /**
     * @param modelType modelType or {@code null} for none
     */
    public ModelOptions setModelType(java.lang.String modelType) {
      this.modelType = modelType;
      return this;
    }

    @Override
    public ModelOptions set(String fieldName, Object value) {
      return (ModelOptions) super.set(fieldName, value);
    }

    @Override
    public ModelOptions clone() {
      return (ModelOptions) super.clone();
    }

  }

}
