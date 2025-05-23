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

package com.google.api.services.analyticshub.v1beta1.model;

/**
 * Model definition for DestinationDatasetReference.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Analytics Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DestinationDatasetReference extends com.google.api.client.json.GenericJson {

  /**
   * Required. A unique ID for this dataset, without the project name. The ID must contain only
   * letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String datasetId;

  /**
   * Required. The ID of the project containing this dataset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Required. A unique ID for this dataset, without the project name. The ID must contain only
   * letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatasetId() {
    return datasetId;
  }

  /**
   * Required. A unique ID for this dataset, without the project name. The ID must contain only
   * letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters.
   * @param datasetId datasetId or {@code null} for none
   */
  public DestinationDatasetReference setDatasetId(java.lang.String datasetId) {
    this.datasetId = datasetId;
    return this;
  }

  /**
   * Required. The ID of the project containing this dataset.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Required. The ID of the project containing this dataset.
   * @param projectId projectId or {@code null} for none
   */
  public DestinationDatasetReference setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  @Override
  public DestinationDatasetReference set(String fieldName, Object value) {
    return (DestinationDatasetReference) super.set(fieldName, value);
  }

  @Override
  public DestinationDatasetReference clone() {
    return (DestinationDatasetReference) super.clone();
  }

}
