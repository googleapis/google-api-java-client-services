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
 * The inner VLAN-to-Appliance mapping.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InterconnectAttachmentL2ForwardingApplianceMappingInnerVlanToApplianceMapping extends com.google.api.client.json.GenericJson {

  /**
   * Required in this object. A single IPv4 or IPv6 address used as the destination IP address for
   * ingress packets that match on both VLAN tags.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String innerApplianceIpAddress;

  /**
   * Required in this object. Used to match the inner VLAN tag on the packet. Each entry can be a
   * single number or a range of numbers in the range of 1 to 4094, e.g., ["1", "4001-4094"] is
   * valid. Non-empty and Non-overlapping VLAN tag ranges are enforced, and violating operations
   * will be rejected. The inner VLAN tags must have an ethertype value of 0x8100.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> innerVlanTags;

  /**
   * Required in this object. A single IPv4 or IPv6 address used as the destination IP address for
   * ingress packets that match on both VLAN tags.
   * @return value or {@code null} for none
   */
  public java.lang.String getInnerApplianceIpAddress() {
    return innerApplianceIpAddress;
  }

  /**
   * Required in this object. A single IPv4 or IPv6 address used as the destination IP address for
   * ingress packets that match on both VLAN tags.
   * @param innerApplianceIpAddress innerApplianceIpAddress or {@code null} for none
   */
  public InterconnectAttachmentL2ForwardingApplianceMappingInnerVlanToApplianceMapping setInnerApplianceIpAddress(java.lang.String innerApplianceIpAddress) {
    this.innerApplianceIpAddress = innerApplianceIpAddress;
    return this;
  }

  /**
   * Required in this object. Used to match the inner VLAN tag on the packet. Each entry can be a
   * single number or a range of numbers in the range of 1 to 4094, e.g., ["1", "4001-4094"] is
   * valid. Non-empty and Non-overlapping VLAN tag ranges are enforced, and violating operations
   * will be rejected. The inner VLAN tags must have an ethertype value of 0x8100.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getInnerVlanTags() {
    return innerVlanTags;
  }

  /**
   * Required in this object. Used to match the inner VLAN tag on the packet. Each entry can be a
   * single number or a range of numbers in the range of 1 to 4094, e.g., ["1", "4001-4094"] is
   * valid. Non-empty and Non-overlapping VLAN tag ranges are enforced, and violating operations
   * will be rejected. The inner VLAN tags must have an ethertype value of 0x8100.
   * @param innerVlanTags innerVlanTags or {@code null} for none
   */
  public InterconnectAttachmentL2ForwardingApplianceMappingInnerVlanToApplianceMapping setInnerVlanTags(java.util.List<java.lang.String> innerVlanTags) {
    this.innerVlanTags = innerVlanTags;
    return this;
  }

  @Override
  public InterconnectAttachmentL2ForwardingApplianceMappingInnerVlanToApplianceMapping set(String fieldName, Object value) {
    return (InterconnectAttachmentL2ForwardingApplianceMappingInnerVlanToApplianceMapping) super.set(fieldName, value);
  }

  @Override
  public InterconnectAttachmentL2ForwardingApplianceMappingInnerVlanToApplianceMapping clone() {
    return (InterconnectAttachmentL2ForwardingApplianceMappingInnerVlanToApplianceMapping) super.clone();
  }

}
