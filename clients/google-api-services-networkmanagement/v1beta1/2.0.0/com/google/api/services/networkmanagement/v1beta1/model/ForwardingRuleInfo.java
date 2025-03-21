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

package com.google.api.services.networkmanagement.v1beta1.model;

/**
 * For display only. Metadata associated with a Compute Engine forwarding rule.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ForwardingRuleInfo extends com.google.api.client.json.GenericJson {

  /**
   * Name of the forwarding rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Name of the load balancer the forwarding rule belongs to. Empty for forwarding rules not
   * related to load balancers (like PSC forwarding rules).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String loadBalancerName;

  /**
   * Port range defined in the forwarding rule that matches the packet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String matchedPortRange;

  /**
   * Protocol defined in the forwarding rule that matches the packet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String matchedProtocol;

  /**
   * Network URI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkUri;

  /**
   * PSC Google API target this forwarding rule targets (if applicable).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pscGoogleApiTarget;

  /**
   * URI of the PSC service attachment this forwarding rule targets (if applicable).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pscServiceAttachmentUri;

  /**
   * Region of the forwarding rule. Set only for regional forwarding rules.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * Target type of the forwarding rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String target;

  /**
   * URI of the forwarding rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * VIP of the forwarding rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String vip;

  /**
   * Name of the forwarding rule.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Name of the forwarding rule.
   * @param displayName displayName or {@code null} for none
   */
  public ForwardingRuleInfo setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Name of the load balancer the forwarding rule belongs to. Empty for forwarding rules not
   * related to load balancers (like PSC forwarding rules).
   * @return value or {@code null} for none
   */
  public java.lang.String getLoadBalancerName() {
    return loadBalancerName;
  }

  /**
   * Name of the load balancer the forwarding rule belongs to. Empty for forwarding rules not
   * related to load balancers (like PSC forwarding rules).
   * @param loadBalancerName loadBalancerName or {@code null} for none
   */
  public ForwardingRuleInfo setLoadBalancerName(java.lang.String loadBalancerName) {
    this.loadBalancerName = loadBalancerName;
    return this;
  }

  /**
   * Port range defined in the forwarding rule that matches the packet.
   * @return value or {@code null} for none
   */
  public java.lang.String getMatchedPortRange() {
    return matchedPortRange;
  }

  /**
   * Port range defined in the forwarding rule that matches the packet.
   * @param matchedPortRange matchedPortRange or {@code null} for none
   */
  public ForwardingRuleInfo setMatchedPortRange(java.lang.String matchedPortRange) {
    this.matchedPortRange = matchedPortRange;
    return this;
  }

  /**
   * Protocol defined in the forwarding rule that matches the packet.
   * @return value or {@code null} for none
   */
  public java.lang.String getMatchedProtocol() {
    return matchedProtocol;
  }

  /**
   * Protocol defined in the forwarding rule that matches the packet.
   * @param matchedProtocol matchedProtocol or {@code null} for none
   */
  public ForwardingRuleInfo setMatchedProtocol(java.lang.String matchedProtocol) {
    this.matchedProtocol = matchedProtocol;
    return this;
  }

  /**
   * Network URI.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkUri() {
    return networkUri;
  }

  /**
   * Network URI.
   * @param networkUri networkUri or {@code null} for none
   */
  public ForwardingRuleInfo setNetworkUri(java.lang.String networkUri) {
    this.networkUri = networkUri;
    return this;
  }

  /**
   * PSC Google API target this forwarding rule targets (if applicable).
   * @return value or {@code null} for none
   */
  public java.lang.String getPscGoogleApiTarget() {
    return pscGoogleApiTarget;
  }

  /**
   * PSC Google API target this forwarding rule targets (if applicable).
   * @param pscGoogleApiTarget pscGoogleApiTarget or {@code null} for none
   */
  public ForwardingRuleInfo setPscGoogleApiTarget(java.lang.String pscGoogleApiTarget) {
    this.pscGoogleApiTarget = pscGoogleApiTarget;
    return this;
  }

  /**
   * URI of the PSC service attachment this forwarding rule targets (if applicable).
   * @return value or {@code null} for none
   */
  public java.lang.String getPscServiceAttachmentUri() {
    return pscServiceAttachmentUri;
  }

  /**
   * URI of the PSC service attachment this forwarding rule targets (if applicable).
   * @param pscServiceAttachmentUri pscServiceAttachmentUri or {@code null} for none
   */
  public ForwardingRuleInfo setPscServiceAttachmentUri(java.lang.String pscServiceAttachmentUri) {
    this.pscServiceAttachmentUri = pscServiceAttachmentUri;
    return this;
  }

  /**
   * Region of the forwarding rule. Set only for regional forwarding rules.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * Region of the forwarding rule. Set only for regional forwarding rules.
   * @param region region or {@code null} for none
   */
  public ForwardingRuleInfo setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * Target type of the forwarding rule.
   * @return value or {@code null} for none
   */
  public java.lang.String getTarget() {
    return target;
  }

  /**
   * Target type of the forwarding rule.
   * @param target target or {@code null} for none
   */
  public ForwardingRuleInfo setTarget(java.lang.String target) {
    this.target = target;
    return this;
  }

  /**
   * URI of the forwarding rule.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * URI of the forwarding rule.
   * @param uri uri or {@code null} for none
   */
  public ForwardingRuleInfo setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * VIP of the forwarding rule.
   * @return value or {@code null} for none
   */
  public java.lang.String getVip() {
    return vip;
  }

  /**
   * VIP of the forwarding rule.
   * @param vip vip or {@code null} for none
   */
  public ForwardingRuleInfo setVip(java.lang.String vip) {
    this.vip = vip;
    return this;
  }

  @Override
  public ForwardingRuleInfo set(String fieldName, Object value) {
    return (ForwardingRuleInfo) super.set(fieldName, value);
  }

  @Override
  public ForwardingRuleInfo clone() {
    return (ForwardingRuleInfo) super.clone();
  }

}
