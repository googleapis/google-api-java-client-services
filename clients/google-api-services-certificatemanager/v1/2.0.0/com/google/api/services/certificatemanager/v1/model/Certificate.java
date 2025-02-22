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

package com.google.api.services.certificatemanager.v1.model;

/**
 * Defines TLS certificate.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Certificate Manager API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Certificate extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The creation timestamp of a Certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. One or more paragraphs of text description of a certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Output only. The expiry timestamp of a Certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expireTime;

  /**
   * Optional. Set of labels associated with a Certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * If set, contains configuration and state of a managed certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ManagedCertificate managed;

  /**
   * Identifier. A user-defined name of the certificate. Certificate names must be unique globally
   * and match pattern `projects/locations/certificates`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The PEM-encoded certificate chain.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pemCertificate;

  /**
   * Output only. The list of Subject Alternative Names of dnsName type defined in the certificate
   * (see RFC 5280 4.2.1.6). Managed certificates that haven't been provisioned yet have this field
   * populated with a value of the managed.domains field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> sanDnsnames;

  /**
   * Optional. Immutable. The scope of the certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scope;

  /**
   * If set, defines data of a self-managed certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SelfManagedCertificate selfManaged;

  /**
   * Output only. The last update timestamp of a Certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The list of resources that use this Certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<UsedBy> usedBy;

  /**
   * Output only. The creation timestamp of a Certificate.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The creation timestamp of a Certificate.
   * @param createTime createTime or {@code null} for none
   */
  public Certificate setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. One or more paragraphs of text description of a certificate.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. One or more paragraphs of text description of a certificate.
   * @param description description or {@code null} for none
   */
  public Certificate setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Output only. The expiry timestamp of a Certificate.
   * @return value or {@code null} for none
   */
  public String getExpireTime() {
    return expireTime;
  }

  /**
   * Output only. The expiry timestamp of a Certificate.
   * @param expireTime expireTime or {@code null} for none
   */
  public Certificate setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  /**
   * Optional. Set of labels associated with a Certificate.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Set of labels associated with a Certificate.
   * @param labels labels or {@code null} for none
   */
  public Certificate setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * If set, contains configuration and state of a managed certificate.
   * @return value or {@code null} for none
   */
  public ManagedCertificate getManaged() {
    return managed;
  }

  /**
   * If set, contains configuration and state of a managed certificate.
   * @param managed managed or {@code null} for none
   */
  public Certificate setManaged(ManagedCertificate managed) {
    this.managed = managed;
    return this;
  }

  /**
   * Identifier. A user-defined name of the certificate. Certificate names must be unique globally
   * and match pattern `projects/locations/certificates`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. A user-defined name of the certificate. Certificate names must be unique globally
   * and match pattern `projects/locations/certificates`.
   * @param name name or {@code null} for none
   */
  public Certificate setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The PEM-encoded certificate chain.
   * @return value or {@code null} for none
   */
  public java.lang.String getPemCertificate() {
    return pemCertificate;
  }

  /**
   * Output only. The PEM-encoded certificate chain.
   * @param pemCertificate pemCertificate or {@code null} for none
   */
  public Certificate setPemCertificate(java.lang.String pemCertificate) {
    this.pemCertificate = pemCertificate;
    return this;
  }

  /**
   * Output only. The list of Subject Alternative Names of dnsName type defined in the certificate
   * (see RFC 5280 4.2.1.6). Managed certificates that haven't been provisioned yet have this field
   * populated with a value of the managed.domains field.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSanDnsnames() {
    return sanDnsnames;
  }

  /**
   * Output only. The list of Subject Alternative Names of dnsName type defined in the certificate
   * (see RFC 5280 4.2.1.6). Managed certificates that haven't been provisioned yet have this field
   * populated with a value of the managed.domains field.
   * @param sanDnsnames sanDnsnames or {@code null} for none
   */
  public Certificate setSanDnsnames(java.util.List<java.lang.String> sanDnsnames) {
    this.sanDnsnames = sanDnsnames;
    return this;
  }

  /**
   * Optional. Immutable. The scope of the certificate.
   * @return value or {@code null} for none
   */
  public java.lang.String getScope() {
    return scope;
  }

  /**
   * Optional. Immutable. The scope of the certificate.
   * @param scope scope or {@code null} for none
   */
  public Certificate setScope(java.lang.String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * If set, defines data of a self-managed certificate.
   * @return value or {@code null} for none
   */
  public SelfManagedCertificate getSelfManaged() {
    return selfManaged;
  }

  /**
   * If set, defines data of a self-managed certificate.
   * @param selfManaged selfManaged or {@code null} for none
   */
  public Certificate setSelfManaged(SelfManagedCertificate selfManaged) {
    this.selfManaged = selfManaged;
    return this;
  }

  /**
   * Output only. The last update timestamp of a Certificate.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The last update timestamp of a Certificate.
   * @param updateTime updateTime or {@code null} for none
   */
  public Certificate setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Output only. The list of resources that use this Certificate.
   * @return value or {@code null} for none
   */
  public java.util.List<UsedBy> getUsedBy() {
    return usedBy;
  }

  /**
   * Output only. The list of resources that use this Certificate.
   * @param usedBy usedBy or {@code null} for none
   */
  public Certificate setUsedBy(java.util.List<UsedBy> usedBy) {
    this.usedBy = usedBy;
    return this;
  }

  @Override
  public Certificate set(String fieldName, Object value) {
    return (Certificate) super.set(fieldName, value);
  }

  @Override
  public Certificate clone() {
    return (Certificate) super.clone();
  }

}
