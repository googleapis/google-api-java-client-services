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

package com.google.api.services.networkconnectivity.v1.model;

/**
 * Policy-based routes route L4 network traffic based on not just destination IP address, but also
 * source IP address, protocol, and more. If a policy-based route conflicts with other types of
 * routes, the policy-based route always takes precedence.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Connectivity API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PolicyBasedRoute extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Time when the policy-based route was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. An optional description of this resource. Provide this field when you create the
   * resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Required. The filter to match L4 traffic.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Filter filter;

  /**
   * Optional. The interconnect attachments that this policy-based route applies to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InterconnectAttachment interconnectAttachment;

  /**
   * Output only. Type of this resource. Always networkconnectivity#policyBasedRoute for policy-
   * based Route resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * User-defined labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Immutable. A unique name of the resource in the form of
   * `projects/{project_number}/locations/global/PolicyBasedRoutes/{policy_based_route_id}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Fully-qualified URL of the network that this route applies to, for example:
   * projects/my-project/global/networks/my-network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * Optional. The IP address of a global-access-enabled L4 ILB that is the next hop for matching
   * packets. For this version, only nextHopIlbIp is supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextHopIlbIp;

  /**
   * Optional. Other routes that will be referenced to determine the next hop of the packet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextHopOtherRoutes;

  /**
   * Optional. The priority of this policy-based route. Priority is used to break ties in cases
   * where there are more than one matching policy-based routes found. In cases where multiple
   * policy-based routes are matched, the one with the lowest-numbered priority value wins. The
   * default value is 1000. The priority value must be from 1 to 65535, inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer priority;

  /**
   * Output only. Server-defined fully-qualified URL for this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * Output only. Time when the policy-based route was updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Optional. VM instances that this policy-based route applies to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VirtualMachine virtualMachine;

  /**
   * Output only. If potential misconfigurations are detected for this route, this field will be
   * populated with warning messages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Warnings> warnings;

  /**
   * Output only. Time when the policy-based route was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Time when the policy-based route was created.
   * @param createTime createTime or {@code null} for none
   */
  public PolicyBasedRoute setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. An optional description of this resource. Provide this field when you create the
   * resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. An optional description of this resource. Provide this field when you create the
   * resource.
   * @param description description or {@code null} for none
   */
  public PolicyBasedRoute setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Required. The filter to match L4 traffic.
   * @return value or {@code null} for none
   */
  public Filter getFilter() {
    return filter;
  }

  /**
   * Required. The filter to match L4 traffic.
   * @param filter filter or {@code null} for none
   */
  public PolicyBasedRoute setFilter(Filter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Optional. The interconnect attachments that this policy-based route applies to.
   * @return value or {@code null} for none
   */
  public InterconnectAttachment getInterconnectAttachment() {
    return interconnectAttachment;
  }

  /**
   * Optional. The interconnect attachments that this policy-based route applies to.
   * @param interconnectAttachment interconnectAttachment or {@code null} for none
   */
  public PolicyBasedRoute setInterconnectAttachment(InterconnectAttachment interconnectAttachment) {
    this.interconnectAttachment = interconnectAttachment;
    return this;
  }

  /**
   * Output only. Type of this resource. Always networkconnectivity#policyBasedRoute for policy-
   * based Route resources.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Output only. Type of this resource. Always networkconnectivity#policyBasedRoute for policy-
   * based Route resources.
   * @param kind kind or {@code null} for none
   */
  public PolicyBasedRoute setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * User-defined labels.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * User-defined labels.
   * @param labels labels or {@code null} for none
   */
  public PolicyBasedRoute setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Immutable. A unique name of the resource in the form of
   * `projects/{project_number}/locations/global/PolicyBasedRoutes/{policy_based_route_id}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Immutable. A unique name of the resource in the form of
   * `projects/{project_number}/locations/global/PolicyBasedRoutes/{policy_based_route_id}`
   * @param name name or {@code null} for none
   */
  public PolicyBasedRoute setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. Fully-qualified URL of the network that this route applies to, for example:
   * projects/my-project/global/networks/my-network.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * Required. Fully-qualified URL of the network that this route applies to, for example:
   * projects/my-project/global/networks/my-network.
   * @param network network or {@code null} for none
   */
  public PolicyBasedRoute setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * Optional. The IP address of a global-access-enabled L4 ILB that is the next hop for matching
   * packets. For this version, only nextHopIlbIp is supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextHopIlbIp() {
    return nextHopIlbIp;
  }

  /**
   * Optional. The IP address of a global-access-enabled L4 ILB that is the next hop for matching
   * packets. For this version, only nextHopIlbIp is supported.
   * @param nextHopIlbIp nextHopIlbIp or {@code null} for none
   */
  public PolicyBasedRoute setNextHopIlbIp(java.lang.String nextHopIlbIp) {
    this.nextHopIlbIp = nextHopIlbIp;
    return this;
  }

  /**
   * Optional. Other routes that will be referenced to determine the next hop of the packet.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextHopOtherRoutes() {
    return nextHopOtherRoutes;
  }

  /**
   * Optional. Other routes that will be referenced to determine the next hop of the packet.
   * @param nextHopOtherRoutes nextHopOtherRoutes or {@code null} for none
   */
  public PolicyBasedRoute setNextHopOtherRoutes(java.lang.String nextHopOtherRoutes) {
    this.nextHopOtherRoutes = nextHopOtherRoutes;
    return this;
  }

  /**
   * Optional. The priority of this policy-based route. Priority is used to break ties in cases
   * where there are more than one matching policy-based routes found. In cases where multiple
   * policy-based routes are matched, the one with the lowest-numbered priority value wins. The
   * default value is 1000. The priority value must be from 1 to 65535, inclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPriority() {
    return priority;
  }

  /**
   * Optional. The priority of this policy-based route. Priority is used to break ties in cases
   * where there are more than one matching policy-based routes found. In cases where multiple
   * policy-based routes are matched, the one with the lowest-numbered priority value wins. The
   * default value is 1000. The priority value must be from 1 to 65535, inclusive.
   * @param priority priority or {@code null} for none
   */
  public PolicyBasedRoute setPriority(java.lang.Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Output only. Server-defined fully-qualified URL for this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * Output only. Server-defined fully-qualified URL for this resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public PolicyBasedRoute setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Output only. Time when the policy-based route was updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Time when the policy-based route was updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public PolicyBasedRoute setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Optional. VM instances that this policy-based route applies to.
   * @return value or {@code null} for none
   */
  public VirtualMachine getVirtualMachine() {
    return virtualMachine;
  }

  /**
   * Optional. VM instances that this policy-based route applies to.
   * @param virtualMachine virtualMachine or {@code null} for none
   */
  public PolicyBasedRoute setVirtualMachine(VirtualMachine virtualMachine) {
    this.virtualMachine = virtualMachine;
    return this;
  }

  /**
   * Output only. If potential misconfigurations are detected for this route, this field will be
   * populated with warning messages.
   * @return value or {@code null} for none
   */
  public java.util.List<Warnings> getWarnings() {
    return warnings;
  }

  /**
   * Output only. If potential misconfigurations are detected for this route, this field will be
   * populated with warning messages.
   * @param warnings warnings or {@code null} for none
   */
  public PolicyBasedRoute setWarnings(java.util.List<Warnings> warnings) {
    this.warnings = warnings;
    return this;
  }

  @Override
  public PolicyBasedRoute set(String fieldName, Object value) {
    return (PolicyBasedRoute) super.set(fieldName, value);
  }

  @Override
  public PolicyBasedRoute clone() {
    return (PolicyBasedRoute) super.clone();
  }

}
