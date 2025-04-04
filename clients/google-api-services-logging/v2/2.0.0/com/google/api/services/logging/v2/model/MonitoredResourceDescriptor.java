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

package com.google.api.services.logging.v2.model;

/**
 * An object that describes the schema of a MonitoredResource object using a type name and a set of
 * labels. For example, the monitored resource descriptor for Google Compute Engine VM instances has
 * a type of "gce_instance" and specifies the use of the labels "instance_id" and "zone" to identify
 * particular VM instances.Different APIs can support different monitored resource types. APIs
 * generally provide a list method that returns the monitored resource descriptors used by the API.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Logging API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MonitoredResourceDescriptor extends com.google.api.client.json.GenericJson {

  /**
   * Optional. A detailed description of the monitored resource type that might be used in
   * documentation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. A concise name for the monitored resource type that might be displayed in user
   * interfaces. It should be a Title Cased Noun Phrase, without any article or other determiners.
   * For example, "Google Cloud SQL Database".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Required. A set of labels used to describe instances of this monitored resource type. For
   * example, an individual Google Cloud SQL database is identified by values for the labels
   * "database_id" and "zone".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LabelDescriptor> labels;

  static {
    // hack to force ProGuard to consider LabelDescriptor used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(LabelDescriptor.class);
  }

  /**
   * Optional. The launch stage of the monitored resource definition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String launchStage;

  /**
   * Optional. The resource name of the monitored resource descriptor:
   * "projects/{project_id}/monitoredResourceDescriptors/{type}" where {type} is the value of the
   * type field in this object and {project_id} is a project ID that provides API-specific context
   * for accessing the type. APIs that do not use project information can use the resource name
   * format "monitoredResourceDescriptors/{type}".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The monitored resource type. For example, the type "cloudsql_database" represents
   * databases in Google Cloud SQL. For a list of types, see Monitored resource types
   * (https://cloud.google.com/monitoring/api/resources) and Logging resource types
   * (https://cloud.google.com/logging/docs/api/v2/resource-list).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Optional. A detailed description of the monitored resource type that might be used in
   * documentation.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. A detailed description of the monitored resource type that might be used in
   * documentation.
   * @param description description or {@code null} for none
   */
  public MonitoredResourceDescriptor setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. A concise name for the monitored resource type that might be displayed in user
   * interfaces. It should be a Title Cased Noun Phrase, without any article or other determiners.
   * For example, "Google Cloud SQL Database".
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Optional. A concise name for the monitored resource type that might be displayed in user
   * interfaces. It should be a Title Cased Noun Phrase, without any article or other determiners.
   * For example, "Google Cloud SQL Database".
   * @param displayName displayName or {@code null} for none
   */
  public MonitoredResourceDescriptor setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Required. A set of labels used to describe instances of this monitored resource type. For
   * example, an individual Google Cloud SQL database is identified by values for the labels
   * "database_id" and "zone".
   * @return value or {@code null} for none
   */
  public java.util.List<LabelDescriptor> getLabels() {
    return labels;
  }

  /**
   * Required. A set of labels used to describe instances of this monitored resource type. For
   * example, an individual Google Cloud SQL database is identified by values for the labels
   * "database_id" and "zone".
   * @param labels labels or {@code null} for none
   */
  public MonitoredResourceDescriptor setLabels(java.util.List<LabelDescriptor> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Optional. The launch stage of the monitored resource definition.
   * @return value or {@code null} for none
   */
  public java.lang.String getLaunchStage() {
    return launchStage;
  }

  /**
   * Optional. The launch stage of the monitored resource definition.
   * @param launchStage launchStage or {@code null} for none
   */
  public MonitoredResourceDescriptor setLaunchStage(java.lang.String launchStage) {
    this.launchStage = launchStage;
    return this;
  }

  /**
   * Optional. The resource name of the monitored resource descriptor:
   * "projects/{project_id}/monitoredResourceDescriptors/{type}" where {type} is the value of the
   * type field in this object and {project_id} is a project ID that provides API-specific context
   * for accessing the type. APIs that do not use project information can use the resource name
   * format "monitoredResourceDescriptors/{type}".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Optional. The resource name of the monitored resource descriptor:
   * "projects/{project_id}/monitoredResourceDescriptors/{type}" where {type} is the value of the
   * type field in this object and {project_id} is a project ID that provides API-specific context
   * for accessing the type. APIs that do not use project information can use the resource name
   * format "monitoredResourceDescriptors/{type}".
   * @param name name or {@code null} for none
   */
  public MonitoredResourceDescriptor setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. The monitored resource type. For example, the type "cloudsql_database" represents
   * databases in Google Cloud SQL. For a list of types, see Monitored resource types
   * (https://cloud.google.com/monitoring/api/resources) and Logging resource types
   * (https://cloud.google.com/logging/docs/api/v2/resource-list).
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Required. The monitored resource type. For example, the type "cloudsql_database" represents
   * databases in Google Cloud SQL. For a list of types, see Monitored resource types
   * (https://cloud.google.com/monitoring/api/resources) and Logging resource types
   * (https://cloud.google.com/logging/docs/api/v2/resource-list).
   * @param type type or {@code null} for none
   */
  public MonitoredResourceDescriptor setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public MonitoredResourceDescriptor set(String fieldName, Object value) {
    return (MonitoredResourceDescriptor) super.set(fieldName, value);
  }

  @Override
  public MonitoredResourceDescriptor clone() {
    return (MonitoredResourceDescriptor) super.clone();
  }

}
