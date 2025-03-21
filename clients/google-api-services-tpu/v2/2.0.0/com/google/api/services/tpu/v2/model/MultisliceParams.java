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

package com.google.api.services.tpu.v2.model;

/**
 * Parameters to specify for multislice QueuedResource requests. This message must be populated in
 * case of multislice requests instead of node_id.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud TPU API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MultisliceParams extends com.google.api.client.json.GenericJson {

  /**
   * Required. Number of nodes with this spec. The system will attempt to provision "node_count"
   * nodes as part of the request. This needs to be > 1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer nodeCount;

  /**
   * Optional. Prefix of node_ids in case of multislice request. Should follow the
   * `^[A-Za-z0-9_.~+%-]+$` regex format. If node_count = 3 and node_id_prefix = "np", node ids of
   * nodes created will be "np-0", "np-1", "np-2". If this field is not provided we use
   * queued_resource_id as the node_id_prefix.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nodeIdPrefix;

  /**
   * Required. Number of nodes with this spec. The system will attempt to provision "node_count"
   * nodes as part of the request. This needs to be > 1.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNodeCount() {
    return nodeCount;
  }

  /**
   * Required. Number of nodes with this spec. The system will attempt to provision "node_count"
   * nodes as part of the request. This needs to be > 1.
   * @param nodeCount nodeCount or {@code null} for none
   */
  public MultisliceParams setNodeCount(java.lang.Integer nodeCount) {
    this.nodeCount = nodeCount;
    return this;
  }

  /**
   * Optional. Prefix of node_ids in case of multislice request. Should follow the
   * `^[A-Za-z0-9_.~+%-]+$` regex format. If node_count = 3 and node_id_prefix = "np", node ids of
   * nodes created will be "np-0", "np-1", "np-2". If this field is not provided we use
   * queued_resource_id as the node_id_prefix.
   * @return value or {@code null} for none
   */
  public java.lang.String getNodeIdPrefix() {
    return nodeIdPrefix;
  }

  /**
   * Optional. Prefix of node_ids in case of multislice request. Should follow the
   * `^[A-Za-z0-9_.~+%-]+$` regex format. If node_count = 3 and node_id_prefix = "np", node ids of
   * nodes created will be "np-0", "np-1", "np-2". If this field is not provided we use
   * queued_resource_id as the node_id_prefix.
   * @param nodeIdPrefix nodeIdPrefix or {@code null} for none
   */
  public MultisliceParams setNodeIdPrefix(java.lang.String nodeIdPrefix) {
    this.nodeIdPrefix = nodeIdPrefix;
    return this;
  }

  @Override
  public MultisliceParams set(String fieldName, Object value) {
    return (MultisliceParams) super.set(fieldName, value);
  }

  @Override
  public MultisliceParams clone() {
    return (MultisliceParams) super.clone();
  }

}
