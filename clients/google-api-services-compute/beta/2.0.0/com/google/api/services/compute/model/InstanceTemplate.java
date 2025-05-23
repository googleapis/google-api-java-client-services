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

package com.google.api.services.compute.model;

/**
 * Represents an Instance Template resource. Google Compute Engine has two Instance Template
 * resources: * [Global](/compute/docs/reference/rest/beta/instanceTemplates) *
 * [Regional](/compute/docs/reference/rest/beta/regionInstanceTemplates) You can reuse a global
 * instance template in different regions whereas you can use a regional instance template in a
 * specified region only. If you want to reduce cross-region dependency or achieve data residency,
 * use a regional instance template. To create VMs, managed instance groups, and reservations, you
 * can use either global or regional instance templates. For more information, read Instance
 * Templates.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstanceTemplate extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] The creation timestamp for this instance template in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] A unique identifier for this instance template. The server defines this
   * identifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] The resource type, which is always compute#instanceTemplate for instance
   * templates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of the resource; provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The instance properties for this instance template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InstanceProperties properties;

  /**
   * [Output Only] URL of the region where the instance template resides. Only applicable for
   * regional resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * [Output Only] The URL for this instance template. The server defines this URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * The source instance used to create the template. You can provide this as a partial or full URL
   * to the resource. For example, the following are valid values: -
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance -
   * projects/project/zones/zone/instances/instance
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceInstance;

  /**
   * The source instance params to use to create this instance template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SourceInstanceParams sourceInstanceParams;

  /**
   * [Output Only] The creation timestamp for this instance template in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] The creation timestamp for this instance template in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public InstanceTemplate setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public InstanceTemplate setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] A unique identifier for this instance template. The server defines this
   * identifier.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] A unique identifier for this instance template. The server defines this
   * identifier.
   * @param id id or {@code null} for none
   */
  public InstanceTemplate setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] The resource type, which is always compute#instanceTemplate for instance
   * templates.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] The resource type, which is always compute#instanceTemplate for instance
   * templates.
   * @param kind kind or {@code null} for none
   */
  public InstanceTemplate setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of the resource; provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource; provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public InstanceTemplate setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The instance properties for this instance template.
   * @return value or {@code null} for none
   */
  public InstanceProperties getProperties() {
    return properties;
  }

  /**
   * The instance properties for this instance template.
   * @param properties properties or {@code null} for none
   */
  public InstanceTemplate setProperties(InstanceProperties properties) {
    this.properties = properties;
    return this;
  }

  /**
   * [Output Only] URL of the region where the instance template resides. Only applicable for
   * regional resources.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] URL of the region where the instance template resides. Only applicable for
   * regional resources.
   * @param region region or {@code null} for none
   */
  public InstanceTemplate setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * [Output Only] The URL for this instance template. The server defines this URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] The URL for this instance template. The server defines this URL.
   * @param selfLink selfLink or {@code null} for none
   */
  public InstanceTemplate setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * The source instance used to create the template. You can provide this as a partial or full URL
   * to the resource. For example, the following are valid values: -
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance -
   * projects/project/zones/zone/instances/instance
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceInstance() {
    return sourceInstance;
  }

  /**
   * The source instance used to create the template. You can provide this as a partial or full URL
   * to the resource. For example, the following are valid values: -
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance -
   * projects/project/zones/zone/instances/instance
   * @param sourceInstance sourceInstance or {@code null} for none
   */
  public InstanceTemplate setSourceInstance(java.lang.String sourceInstance) {
    this.sourceInstance = sourceInstance;
    return this;
  }

  /**
   * The source instance params to use to create this instance template.
   * @return value or {@code null} for none
   */
  public SourceInstanceParams getSourceInstanceParams() {
    return sourceInstanceParams;
  }

  /**
   * The source instance params to use to create this instance template.
   * @param sourceInstanceParams sourceInstanceParams or {@code null} for none
   */
  public InstanceTemplate setSourceInstanceParams(SourceInstanceParams sourceInstanceParams) {
    this.sourceInstanceParams = sourceInstanceParams;
    return this;
  }

  @Override
  public InstanceTemplate set(String fieldName, Object value) {
    return (InstanceTemplate) super.set(fieldName, value);
  }

  @Override
  public InstanceTemplate clone() {
    return (InstanceTemplate) super.clone();
  }

}
