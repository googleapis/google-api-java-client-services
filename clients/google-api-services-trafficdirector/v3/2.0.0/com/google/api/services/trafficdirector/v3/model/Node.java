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

package com.google.api.services.trafficdirector.v3.model;

/**
 * Identifies a specific Envoy instance. The node identifier is presented to the management server,
 * which may use this identifier to distinguish per Envoy configuration for serving. [#next-free-
 * field: 13]
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Traffic Director API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Node extends com.google.api.client.json.GenericJson {

  /**
   * Client feature support list. These are well known features described in the Envoy API
   * repository for a given major version of an API. Client features use reverse DNS naming scheme,
   * for example ``com.acme.feature``. See :ref:`the list of features ` that xDS client may support.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> clientFeatures;

  /**
   * Defines the local service cluster name where Envoy is running. Though optional, it should be
   * set if any of the following features are used: :ref:`statsd `, :ref:`health check cluster
   * verification `, :ref:`runtime override directory `, :ref:`user agent addition `, :ref:`HTTP
   * global rate limiting `, :ref:`CDS `, and :ref:`HTTP tracing `, either in this message or via
   * :option:`--service-cluster`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cluster;

  /**
   * Map from xDS resource type URL to dynamic context parameters. These may vary at runtime (unlike
   * other fields in this message). For example, the xDS client may have a shard identifier that
   * changes during the lifetime of the xDS client. In Envoy, this would be achieved by updating the
   * dynamic context on the Server::Instance's LocalInfo context provider. The shard ID dynamic
   * parameter then appears in this field during future discovery requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, ContextParams> dynamicParameters;

  static {
    // hack to force ProGuard to consider ContextParams used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ContextParams.class);
  }

  /**
   * List of extensions and their versions supported by the node.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Extension> extensions;

  static {
    // hack to force ProGuard to consider Extension used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Extension.class);
  }

  /**
   * An opaque node identifier for the Envoy node. This also provides the local service node name.
   * It should be set if any of the following features are used: :ref:`statsd `, :ref:`CDS `, and
   * :ref:`HTTP tracing `, either in this message or via :option:`--service-node`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Known listening ports on the node as a generic hint to the management server for filtering
   * :ref:`listeners ` to be returned. For example, if there is a listener bound to port 80, the
   * list can optionally contain the SocketAddress ``(0.0.0.0,80)``. The field is optional and just
   * a hint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Address> listeningAddresses;

  static {
    // hack to force ProGuard to consider Address used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Address.class);
  }

  /**
   * Locality specifying where the Envoy instance is running.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Locality locality;

  /**
   * Opaque metadata extending the node identifier. Envoy will pass this directly to the management
   * server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> metadata;

  /**
   * Structured version of the entity requesting config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BuildVersion userAgentBuildVersion;

  /**
   * Free-form string that identifies the entity requesting config. E.g. "envoy" or "grpc"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userAgentName;

  /**
   * Free-form string that identifies the version of the entity requesting config. E.g. "1.12.2" or
   * "abcd1234", or "SpecialEnvoyBuild"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userAgentVersion;

  /**
   * Client feature support list. These are well known features described in the Envoy API
   * repository for a given major version of an API. Client features use reverse DNS naming scheme,
   * for example ``com.acme.feature``. See :ref:`the list of features ` that xDS client may support.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getClientFeatures() {
    return clientFeatures;
  }

  /**
   * Client feature support list. These are well known features described in the Envoy API
   * repository for a given major version of an API. Client features use reverse DNS naming scheme,
   * for example ``com.acme.feature``. See :ref:`the list of features ` that xDS client may support.
   * @param clientFeatures clientFeatures or {@code null} for none
   */
  public Node setClientFeatures(java.util.List<java.lang.String> clientFeatures) {
    this.clientFeatures = clientFeatures;
    return this;
  }

  /**
   * Defines the local service cluster name where Envoy is running. Though optional, it should be
   * set if any of the following features are used: :ref:`statsd `, :ref:`health check cluster
   * verification `, :ref:`runtime override directory `, :ref:`user agent addition `, :ref:`HTTP
   * global rate limiting `, :ref:`CDS `, and :ref:`HTTP tracing `, either in this message or via
   * :option:`--service-cluster`.
   * @return value or {@code null} for none
   */
  public java.lang.String getCluster() {
    return cluster;
  }

  /**
   * Defines the local service cluster name where Envoy is running. Though optional, it should be
   * set if any of the following features are used: :ref:`statsd `, :ref:`health check cluster
   * verification `, :ref:`runtime override directory `, :ref:`user agent addition `, :ref:`HTTP
   * global rate limiting `, :ref:`CDS `, and :ref:`HTTP tracing `, either in this message or via
   * :option:`--service-cluster`.
   * @param cluster cluster or {@code null} for none
   */
  public Node setCluster(java.lang.String cluster) {
    this.cluster = cluster;
    return this;
  }

  /**
   * Map from xDS resource type URL to dynamic context parameters. These may vary at runtime (unlike
   * other fields in this message). For example, the xDS client may have a shard identifier that
   * changes during the lifetime of the xDS client. In Envoy, this would be achieved by updating the
   * dynamic context on the Server::Instance's LocalInfo context provider. The shard ID dynamic
   * parameter then appears in this field during future discovery requests.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, ContextParams> getDynamicParameters() {
    return dynamicParameters;
  }

  /**
   * Map from xDS resource type URL to dynamic context parameters. These may vary at runtime (unlike
   * other fields in this message). For example, the xDS client may have a shard identifier that
   * changes during the lifetime of the xDS client. In Envoy, this would be achieved by updating the
   * dynamic context on the Server::Instance's LocalInfo context provider. The shard ID dynamic
   * parameter then appears in this field during future discovery requests.
   * @param dynamicParameters dynamicParameters or {@code null} for none
   */
  public Node setDynamicParameters(java.util.Map<String, ContextParams> dynamicParameters) {
    this.dynamicParameters = dynamicParameters;
    return this;
  }

  /**
   * List of extensions and their versions supported by the node.
   * @return value or {@code null} for none
   */
  public java.util.List<Extension> getExtensions() {
    return extensions;
  }

  /**
   * List of extensions and their versions supported by the node.
   * @param extensions extensions or {@code null} for none
   */
  public Node setExtensions(java.util.List<Extension> extensions) {
    this.extensions = extensions;
    return this;
  }

  /**
   * An opaque node identifier for the Envoy node. This also provides the local service node name.
   * It should be set if any of the following features are used: :ref:`statsd `, :ref:`CDS `, and
   * :ref:`HTTP tracing `, either in this message or via :option:`--service-node`.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * An opaque node identifier for the Envoy node. This also provides the local service node name.
   * It should be set if any of the following features are used: :ref:`statsd `, :ref:`CDS `, and
   * :ref:`HTTP tracing `, either in this message or via :option:`--service-node`.
   * @param id id or {@code null} for none
   */
  public Node setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Known listening ports on the node as a generic hint to the management server for filtering
   * :ref:`listeners ` to be returned. For example, if there is a listener bound to port 80, the
   * list can optionally contain the SocketAddress ``(0.0.0.0,80)``. The field is optional and just
   * a hint.
   * @return value or {@code null} for none
   */
  public java.util.List<Address> getListeningAddresses() {
    return listeningAddresses;
  }

  /**
   * Known listening ports on the node as a generic hint to the management server for filtering
   * :ref:`listeners ` to be returned. For example, if there is a listener bound to port 80, the
   * list can optionally contain the SocketAddress ``(0.0.0.0,80)``. The field is optional and just
   * a hint.
   * @param listeningAddresses listeningAddresses or {@code null} for none
   */
  public Node setListeningAddresses(java.util.List<Address> listeningAddresses) {
    this.listeningAddresses = listeningAddresses;
    return this;
  }

  /**
   * Locality specifying where the Envoy instance is running.
   * @return value or {@code null} for none
   */
  public Locality getLocality() {
    return locality;
  }

  /**
   * Locality specifying where the Envoy instance is running.
   * @param locality locality or {@code null} for none
   */
  public Node setLocality(Locality locality) {
    this.locality = locality;
    return this;
  }

  /**
   * Opaque metadata extending the node identifier. Envoy will pass this directly to the management
   * server.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getMetadata() {
    return metadata;
  }

  /**
   * Opaque metadata extending the node identifier. Envoy will pass this directly to the management
   * server.
   * @param metadata metadata or {@code null} for none
   */
  public Node setMetadata(java.util.Map<String, java.lang.Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Structured version of the entity requesting config.
   * @return value or {@code null} for none
   */
  public BuildVersion getUserAgentBuildVersion() {
    return userAgentBuildVersion;
  }

  /**
   * Structured version of the entity requesting config.
   * @param userAgentBuildVersion userAgentBuildVersion or {@code null} for none
   */
  public Node setUserAgentBuildVersion(BuildVersion userAgentBuildVersion) {
    this.userAgentBuildVersion = userAgentBuildVersion;
    return this;
  }

  /**
   * Free-form string that identifies the entity requesting config. E.g. "envoy" or "grpc"
   * @return value or {@code null} for none
   */
  public java.lang.String getUserAgentName() {
    return userAgentName;
  }

  /**
   * Free-form string that identifies the entity requesting config. E.g. "envoy" or "grpc"
   * @param userAgentName userAgentName or {@code null} for none
   */
  public Node setUserAgentName(java.lang.String userAgentName) {
    this.userAgentName = userAgentName;
    return this;
  }

  /**
   * Free-form string that identifies the version of the entity requesting config. E.g. "1.12.2" or
   * "abcd1234", or "SpecialEnvoyBuild"
   * @return value or {@code null} for none
   */
  public java.lang.String getUserAgentVersion() {
    return userAgentVersion;
  }

  /**
   * Free-form string that identifies the version of the entity requesting config. E.g. "1.12.2" or
   * "abcd1234", or "SpecialEnvoyBuild"
   * @param userAgentVersion userAgentVersion or {@code null} for none
   */
  public Node setUserAgentVersion(java.lang.String userAgentVersion) {
    this.userAgentVersion = userAgentVersion;
    return this;
  }

  @Override
  public Node set(String fieldName, Object value) {
    return (Node) super.set(fieldName, value);
  }

  @Override
  public Node clone() {
    return (Node) super.clone();
  }

}
