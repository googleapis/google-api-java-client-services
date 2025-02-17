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
 * Represents an SSL Policy resource. Use SSL policies to control SSL features, such as versions and
 * cipher suites, that are offered by Application Load Balancers and proxy Network Load Balancers.
 * For more information, read SSL policies overview.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SslPolicy extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * A list of features enabled when the selected profile is CUSTOM. The method returns the set of
   * features that can be specified in this list. This field must be empty if the profile is not
   * CUSTOM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> customFeatures;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] The list of features enabled in the SSL policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> enabledFeatures;

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a SslPolicy. An up-to-date
   * fingerprint must be provided in order to update the SslPolicy, otherwise the request will fail
   * with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve
   * an SslPolicy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fingerprint;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output only] Type of the resource. Always compute#sslPolicyfor SSL policies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The minimum version of SSL protocol that can be used by the clients to establish a connection
   * with the load balancer. This can be one of TLS_1_0, TLS_1_1, TLS_1_2.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String minTlsVersion;

  /**
   * Name of the resource. The name must be 1-63 characters long, and comply with RFC1035.
   * Specifically, the name must be 1-63 characters long and match the regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and
   * all following characters must be a dash, lowercase letter, or digit, except the last character,
   * which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Profile specifies the set of SSL features that can be used by the load balancer when
   * negotiating SSL with clients. This can be one of COMPATIBLE, MODERN, RESTRICTED, or CUSTOM. If
   * using CUSTOM, the set of SSL features to enable must be specified in the customFeatures field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String profile;

  /**
   * [Output Only] URL of the region where the regional SSL policy resides. This field is not
   * applicable to global SSL policies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLinkWithId;

  /**
   * Security settings for the proxy. This field is only applicable to a global backend service with
   * the loadBalancingScheme set to INTERNAL_SELF_MANAGED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ServerTlsSettings tlsSettings;

  /**
   * [Output Only] If potential misconfigurations are detected for this SSL policy, this field will
   * be populated with warning messages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Warnings> warnings;

  static {
    // hack to force ProGuard to consider Warnings used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Warnings.class);
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public SslPolicy setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * A list of features enabled when the selected profile is CUSTOM. The method returns the set of
   * features that can be specified in this list. This field must be empty if the profile is not
   * CUSTOM.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCustomFeatures() {
    return customFeatures;
  }

  /**
   * A list of features enabled when the selected profile is CUSTOM. The method returns the set of
   * features that can be specified in this list. This field must be empty if the profile is not
   * CUSTOM.
   * @param customFeatures customFeatures or {@code null} for none
   */
  public SslPolicy setCustomFeatures(java.util.List<java.lang.String> customFeatures) {
    this.customFeatures = customFeatures;
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
  public SslPolicy setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] The list of features enabled in the SSL policy.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEnabledFeatures() {
    return enabledFeatures;
  }

  /**
   * [Output Only] The list of features enabled in the SSL policy.
   * @param enabledFeatures enabledFeatures or {@code null} for none
   */
  public SslPolicy setEnabledFeatures(java.util.List<java.lang.String> enabledFeatures) {
    this.enabledFeatures = enabledFeatures;
    return this;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a SslPolicy. An up-to-date
   * fingerprint must be provided in order to update the SslPolicy, otherwise the request will fail
   * with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve
   * an SslPolicy.
   * @see #decodeFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getFingerprint() {
    return fingerprint;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a SslPolicy. An up-to-date
   * fingerprint must be provided in order to update the SslPolicy, otherwise the request will fail
   * with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve
   * an SslPolicy.
   * @see #getFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(fingerprint);
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a SslPolicy. An up-to-date
   * fingerprint must be provided in order to update the SslPolicy, otherwise the request will fail
   * with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve
   * an SslPolicy.
   * @see #encodeFingerprint()
   * @param fingerprint fingerprint or {@code null} for none
   */
  public SslPolicy setFingerprint(java.lang.String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a SslPolicy. An up-to-date
   * fingerprint must be provided in order to update the SslPolicy, otherwise the request will fail
   * with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve
   * an SslPolicy.
   * @see #setFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public SslPolicy encodeFingerprint(byte[] fingerprint) {
    this.fingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(fingerprint);
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public SslPolicy setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output only] Type of the resource. Always compute#sslPolicyfor SSL policies.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output only] Type of the resource. Always compute#sslPolicyfor SSL policies.
   * @param kind kind or {@code null} for none
   */
  public SslPolicy setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The minimum version of SSL protocol that can be used by the clients to establish a connection
   * with the load balancer. This can be one of TLS_1_0, TLS_1_1, TLS_1_2.
   * @return value or {@code null} for none
   */
  public java.lang.String getMinTlsVersion() {
    return minTlsVersion;
  }

  /**
   * The minimum version of SSL protocol that can be used by the clients to establish a connection
   * with the load balancer. This can be one of TLS_1_0, TLS_1_1, TLS_1_2.
   * @param minTlsVersion minTlsVersion or {@code null} for none
   */
  public SslPolicy setMinTlsVersion(java.lang.String minTlsVersion) {
    this.minTlsVersion = minTlsVersion;
    return this;
  }

  /**
   * Name of the resource. The name must be 1-63 characters long, and comply with RFC1035.
   * Specifically, the name must be 1-63 characters long and match the regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and
   * all following characters must be a dash, lowercase letter, or digit, except the last character,
   * which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource. The name must be 1-63 characters long, and comply with RFC1035.
   * Specifically, the name must be 1-63 characters long and match the regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and
   * all following characters must be a dash, lowercase letter, or digit, except the last character,
   * which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public SslPolicy setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Profile specifies the set of SSL features that can be used by the load balancer when
   * negotiating SSL with clients. This can be one of COMPATIBLE, MODERN, RESTRICTED, or CUSTOM. If
   * using CUSTOM, the set of SSL features to enable must be specified in the customFeatures field.
   * @return value or {@code null} for none
   */
  public java.lang.String getProfile() {
    return profile;
  }

  /**
   * Profile specifies the set of SSL features that can be used by the load balancer when
   * negotiating SSL with clients. This can be one of COMPATIBLE, MODERN, RESTRICTED, or CUSTOM. If
   * using CUSTOM, the set of SSL features to enable must be specified in the customFeatures field.
   * @param profile profile or {@code null} for none
   */
  public SslPolicy setProfile(java.lang.String profile) {
    this.profile = profile;
    return this;
  }

  /**
   * [Output Only] URL of the region where the regional SSL policy resides. This field is not
   * applicable to global SSL policies.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] URL of the region where the regional SSL policy resides. This field is not
   * applicable to global SSL policies.
   * @param region region or {@code null} for none
   */
  public SslPolicy setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public SslPolicy setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLinkWithId() {
    return selfLinkWithId;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @param selfLinkWithId selfLinkWithId or {@code null} for none
   */
  public SslPolicy setSelfLinkWithId(java.lang.String selfLinkWithId) {
    this.selfLinkWithId = selfLinkWithId;
    return this;
  }

  /**
   * Security settings for the proxy. This field is only applicable to a global backend service with
   * the loadBalancingScheme set to INTERNAL_SELF_MANAGED.
   * @return value or {@code null} for none
   */
  public ServerTlsSettings getTlsSettings() {
    return tlsSettings;
  }

  /**
   * Security settings for the proxy. This field is only applicable to a global backend service with
   * the loadBalancingScheme set to INTERNAL_SELF_MANAGED.
   * @param tlsSettings tlsSettings or {@code null} for none
   */
  public SslPolicy setTlsSettings(ServerTlsSettings tlsSettings) {
    this.tlsSettings = tlsSettings;
    return this;
  }

  /**
   * [Output Only] If potential misconfigurations are detected for this SSL policy, this field will
   * be populated with warning messages.
   * @return value or {@code null} for none
   */
  public java.util.List<Warnings> getWarnings() {
    return warnings;
  }

  /**
   * [Output Only] If potential misconfigurations are detected for this SSL policy, this field will
   * be populated with warning messages.
   * @param warnings warnings or {@code null} for none
   */
  public SslPolicy setWarnings(java.util.List<Warnings> warnings) {
    this.warnings = warnings;
    return this;
  }

  @Override
  public SslPolicy set(String fieldName, Object value) {
    return (SslPolicy) super.set(fieldName, value);
  }

  @Override
  public SslPolicy clone() {
    return (SslPolicy) super.clone();
  }

  /**
   * Model definition for SslPolicyWarnings.
   */
  public static final class Warnings extends com.google.api.client.json.GenericJson {

    /**
     * [Output Only] A warning code, if applicable. For example, Compute Engine returns
     * NO_RESULTS_ON_PAGE if there are no results in the response.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String code;

    /**
     * [Output Only] Metadata about this warning in key: value format. For example: "data": [ { "key":
     * "scope", "value": "zones/us-east1-d" }
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<Data> data;

    static {
      // hack to force ProGuard to consider Data used, since otherwise it would be stripped out
      // see https://github.com/google/google-api-java-client/issues/543
      com.google.api.client.util.Data.nullOf(Data.class);
    }

    /**
     * [Output Only] A human-readable description of the warning code.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String message;

    /**
     * [Output Only] A warning code, if applicable. For example, Compute Engine returns
     * NO_RESULTS_ON_PAGE if there are no results in the response.
     * @return value or {@code null} for none
     */
    public java.lang.String getCode() {
      return code;
    }

    /**
     * [Output Only] A warning code, if applicable. For example, Compute Engine returns
     * NO_RESULTS_ON_PAGE if there are no results in the response.
     * @param code code or {@code null} for none
     */
    public Warnings setCode(java.lang.String code) {
      this.code = code;
      return this;
    }

    /**
     * [Output Only] Metadata about this warning in key: value format. For example: "data": [ { "key":
     * "scope", "value": "zones/us-east1-d" }
     * @return value or {@code null} for none
     */
    public java.util.List<Data> getData() {
      return data;
    }

    /**
     * [Output Only] Metadata about this warning in key: value format. For example: "data": [ { "key":
     * "scope", "value": "zones/us-east1-d" }
     * @param data data or {@code null} for none
     */
    public Warnings setData(java.util.List<Data> data) {
      this.data = data;
      return this;
    }

    /**
     * [Output Only] A human-readable description of the warning code.
     * @return value or {@code null} for none
     */
    public java.lang.String getMessage() {
      return message;
    }

    /**
     * [Output Only] A human-readable description of the warning code.
     * @param message message or {@code null} for none
     */
    public Warnings setMessage(java.lang.String message) {
      this.message = message;
      return this;
    }

    @Override
    public Warnings set(String fieldName, Object value) {
      return (Warnings) super.set(fieldName, value);
    }

    @Override
    public Warnings clone() {
      return (Warnings) super.clone();
    }

    /**
     * Model definition for SslPolicyWarningsData.
     */
    public static final class Data extends com.google.api.client.json.GenericJson {

      /**
       * [Output Only] A key that provides more detail on the warning being returned. For example, for
       * warnings where there are no results in a list request for a particular zone, this key might be
       * scope and the key value might be the zone name. Other examples might be a key indicating a
       * deprecated resource and a suggested replacement, or a warning about invalid network settings
       * (for example, if an instance attempts to perform IP forwarding but is not enabled for IP
       * forwarding).
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String key;

      /**
       * [Output Only] A warning data value corresponding to the key.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String value;

      /**
       * [Output Only] A key that provides more detail on the warning being returned. For example, for
       * warnings where there are no results in a list request for a particular zone, this key might be
       * scope and the key value might be the zone name. Other examples might be a key indicating a
       * deprecated resource and a suggested replacement, or a warning about invalid network settings
       * (for example, if an instance attempts to perform IP forwarding but is not enabled for IP
       * forwarding).
       * @return value or {@code null} for none
       */
      public java.lang.String getKey() {
        return key;
      }

      /**
       * [Output Only] A key that provides more detail on the warning being returned. For example, for
       * warnings where there are no results in a list request for a particular zone, this key might be
       * scope and the key value might be the zone name. Other examples might be a key indicating a
       * deprecated resource and a suggested replacement, or a warning about invalid network settings
       * (for example, if an instance attempts to perform IP forwarding but is not enabled for IP
       * forwarding).
       * @param key key or {@code null} for none
       */
      public Data setKey(java.lang.String key) {
        this.key = key;
        return this;
      }

      /**
       * [Output Only] A warning data value corresponding to the key.
       * @return value or {@code null} for none
       */
      public java.lang.String getValue() {
        return value;
      }

      /**
       * [Output Only] A warning data value corresponding to the key.
       * @param value value or {@code null} for none
       */
      public Data setValue(java.lang.String value) {
        this.value = value;
        return this;
      }

      @Override
      public Data set(String fieldName, Object value) {
        return (Data) super.set(fieldName, value);
      }

      @Override
      public Data clone() {
        return (Data) super.clone();
      }

    }
  }

}
