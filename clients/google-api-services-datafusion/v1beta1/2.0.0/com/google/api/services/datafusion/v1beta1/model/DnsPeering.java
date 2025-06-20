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

package com.google.api.services.datafusion.v1beta1.model;

/**
 * DNS peering configuration. These configurations are used to create DNS peering with the customer
 * Cloud DNS.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Fusion API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DnsPeering extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Optional description of the dns zone.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Required. The dns name suffix of the zone.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String domain;

  /**
   * Identifier. The resource name of the dns peering zone. Format:
   * projects/{project}/locations/{location}/instances/{instance}/dnsPeerings/{dns_peering}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. Optional target network to which dns peering should happen.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetNetwork;

  /**
   * Optional. Optional target project to which dns peering should happen.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetProject;

  /**
   * Optional. Optional description of the dns zone.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. Optional description of the dns zone.
   * @param description description or {@code null} for none
   */
  public DnsPeering setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Required. The dns name suffix of the zone.
   * @return value or {@code null} for none
   */
  public java.lang.String getDomain() {
    return domain;
  }

  /**
   * Required. The dns name suffix of the zone.
   * @param domain domain or {@code null} for none
   */
  public DnsPeering setDomain(java.lang.String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Identifier. The resource name of the dns peering zone. Format:
   * projects/{project}/locations/{location}/instances/{instance}/dnsPeerings/{dns_peering}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The resource name of the dns peering zone. Format:
   * projects/{project}/locations/{location}/instances/{instance}/dnsPeerings/{dns_peering}
   * @param name name or {@code null} for none
   */
  public DnsPeering setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. Optional target network to which dns peering should happen.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetNetwork() {
    return targetNetwork;
  }

  /**
   * Optional. Optional target network to which dns peering should happen.
   * @param targetNetwork targetNetwork or {@code null} for none
   */
  public DnsPeering setTargetNetwork(java.lang.String targetNetwork) {
    this.targetNetwork = targetNetwork;
    return this;
  }

  /**
   * Optional. Optional target project to which dns peering should happen.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetProject() {
    return targetProject;
  }

  /**
   * Optional. Optional target project to which dns peering should happen.
   * @param targetProject targetProject or {@code null} for none
   */
  public DnsPeering setTargetProject(java.lang.String targetProject) {
    this.targetProject = targetProject;
    return this;
  }

  @Override
  public DnsPeering set(String fieldName, Object value) {
    return (DnsPeering) super.set(fieldName, value);
  }

  @Override
  public DnsPeering clone() {
    return (DnsPeering) super.clone();
  }

}
