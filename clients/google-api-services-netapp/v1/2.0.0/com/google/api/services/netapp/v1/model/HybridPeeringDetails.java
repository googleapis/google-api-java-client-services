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

package com.google.api.services.netapp.v1.model;

/**
 * HybridPeeringDetails contains details about the hybrid peering.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the NetApp API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HybridPeeringDetails extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Copy-paste-able commands to be used on user's ONTAP to accept peering requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String command;

  /**
   * Optional. Expiration time for the peering command to be executed on user's ONTAP.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String commandExpiryTime;

  /**
   * Optional. Temporary passphrase generated to accept cluster peering command.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String passphrase;

  /**
   * Optional. Name of the user's local source cluster to be peered with the destination cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String peerClusterName;

  /**
   * Optional. Name of the user's local source vserver svm to be peered with the destination vserver
   * svm.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String peerSvmName;

  /**
   * Optional. Name of the user's local source volume to be peered with the destination volume.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String peerVolumeName;

  /**
   * Optional. IP address of the subnet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subnetIp;

  /**
   * Optional. Copy-paste-able commands to be used on user's ONTAP to accept peering requests.
   * @return value or {@code null} for none
   */
  public java.lang.String getCommand() {
    return command;
  }

  /**
   * Optional. Copy-paste-able commands to be used on user's ONTAP to accept peering requests.
   * @param command command or {@code null} for none
   */
  public HybridPeeringDetails setCommand(java.lang.String command) {
    this.command = command;
    return this;
  }

  /**
   * Optional. Expiration time for the peering command to be executed on user's ONTAP.
   * @return value or {@code null} for none
   */
  public String getCommandExpiryTime() {
    return commandExpiryTime;
  }

  /**
   * Optional. Expiration time for the peering command to be executed on user's ONTAP.
   * @param commandExpiryTime commandExpiryTime or {@code null} for none
   */
  public HybridPeeringDetails setCommandExpiryTime(String commandExpiryTime) {
    this.commandExpiryTime = commandExpiryTime;
    return this;
  }

  /**
   * Optional. Temporary passphrase generated to accept cluster peering command.
   * @return value or {@code null} for none
   */
  public java.lang.String getPassphrase() {
    return passphrase;
  }

  /**
   * Optional. Temporary passphrase generated to accept cluster peering command.
   * @param passphrase passphrase or {@code null} for none
   */
  public HybridPeeringDetails setPassphrase(java.lang.String passphrase) {
    this.passphrase = passphrase;
    return this;
  }

  /**
   * Optional. Name of the user's local source cluster to be peered with the destination cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getPeerClusterName() {
    return peerClusterName;
  }

  /**
   * Optional. Name of the user's local source cluster to be peered with the destination cluster.
   * @param peerClusterName peerClusterName or {@code null} for none
   */
  public HybridPeeringDetails setPeerClusterName(java.lang.String peerClusterName) {
    this.peerClusterName = peerClusterName;
    return this;
  }

  /**
   * Optional. Name of the user's local source vserver svm to be peered with the destination vserver
   * svm.
   * @return value or {@code null} for none
   */
  public java.lang.String getPeerSvmName() {
    return peerSvmName;
  }

  /**
   * Optional. Name of the user's local source vserver svm to be peered with the destination vserver
   * svm.
   * @param peerSvmName peerSvmName or {@code null} for none
   */
  public HybridPeeringDetails setPeerSvmName(java.lang.String peerSvmName) {
    this.peerSvmName = peerSvmName;
    return this;
  }

  /**
   * Optional. Name of the user's local source volume to be peered with the destination volume.
   * @return value or {@code null} for none
   */
  public java.lang.String getPeerVolumeName() {
    return peerVolumeName;
  }

  /**
   * Optional. Name of the user's local source volume to be peered with the destination volume.
   * @param peerVolumeName peerVolumeName or {@code null} for none
   */
  public HybridPeeringDetails setPeerVolumeName(java.lang.String peerVolumeName) {
    this.peerVolumeName = peerVolumeName;
    return this;
  }

  /**
   * Optional. IP address of the subnet.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubnetIp() {
    return subnetIp;
  }

  /**
   * Optional. IP address of the subnet.
   * @param subnetIp subnetIp or {@code null} for none
   */
  public HybridPeeringDetails setSubnetIp(java.lang.String subnetIp) {
    this.subnetIp = subnetIp;
    return this;
  }

  @Override
  public HybridPeeringDetails set(String fieldName, Object value) {
    return (HybridPeeringDetails) super.set(fieldName, value);
  }

  @Override
  public HybridPeeringDetails clone() {
    return (HybridPeeringDetails) super.clone();
  }

}
