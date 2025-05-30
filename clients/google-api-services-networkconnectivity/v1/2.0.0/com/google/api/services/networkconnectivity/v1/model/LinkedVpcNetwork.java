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
 * An existing VPC network.
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
public final class LinkedVpcNetwork extends com.google.api.client.json.GenericJson {

  /**
   * Optional. IP ranges encompassing the subnets to be excluded from peering.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> excludeExportRanges;

  /**
   * Optional. IP ranges allowed to be included from peering.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> includeExportRanges;

  /**
   * Output only. The list of Producer VPC spokes that this VPC spoke is a service consumer VPC
   * spoke for. These producer VPCs are connected through VPC peering to this spoke's backing VPC
   * network. Because they are directly connected through VPC peering, NCC export filters do not
   * apply between the service consumer VPC spoke and any of its producer VPC spokes. This VPC spoke
   * cannot be deleted as long as any of these producer VPC spokes are connected to the NCC Hub.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> producerVpcSpokes;

  /**
   * Output only. The proposed exclude export IP ranges waiting for hub administration's approval.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> proposedExcludeExportRanges;

  /**
   * Output only. The proposed include export IP ranges waiting for hub administration's approval.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> proposedIncludeExportRanges;

  /**
   * Required. The URI of the VPC network resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Optional. IP ranges encompassing the subnets to be excluded from peering.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExcludeExportRanges() {
    return excludeExportRanges;
  }

  /**
   * Optional. IP ranges encompassing the subnets to be excluded from peering.
   * @param excludeExportRanges excludeExportRanges or {@code null} for none
   */
  public LinkedVpcNetwork setExcludeExportRanges(java.util.List<java.lang.String> excludeExportRanges) {
    this.excludeExportRanges = excludeExportRanges;
    return this;
  }

  /**
   * Optional. IP ranges allowed to be included from peering.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIncludeExportRanges() {
    return includeExportRanges;
  }

  /**
   * Optional. IP ranges allowed to be included from peering.
   * @param includeExportRanges includeExportRanges or {@code null} for none
   */
  public LinkedVpcNetwork setIncludeExportRanges(java.util.List<java.lang.String> includeExportRanges) {
    this.includeExportRanges = includeExportRanges;
    return this;
  }

  /**
   * Output only. The list of Producer VPC spokes that this VPC spoke is a service consumer VPC
   * spoke for. These producer VPCs are connected through VPC peering to this spoke's backing VPC
   * network. Because they are directly connected through VPC peering, NCC export filters do not
   * apply between the service consumer VPC spoke and any of its producer VPC spokes. This VPC spoke
   * cannot be deleted as long as any of these producer VPC spokes are connected to the NCC Hub.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProducerVpcSpokes() {
    return producerVpcSpokes;
  }

  /**
   * Output only. The list of Producer VPC spokes that this VPC spoke is a service consumer VPC
   * spoke for. These producer VPCs are connected through VPC peering to this spoke's backing VPC
   * network. Because they are directly connected through VPC peering, NCC export filters do not
   * apply between the service consumer VPC spoke and any of its producer VPC spokes. This VPC spoke
   * cannot be deleted as long as any of these producer VPC spokes are connected to the NCC Hub.
   * @param producerVpcSpokes producerVpcSpokes or {@code null} for none
   */
  public LinkedVpcNetwork setProducerVpcSpokes(java.util.List<java.lang.String> producerVpcSpokes) {
    this.producerVpcSpokes = producerVpcSpokes;
    return this;
  }

  /**
   * Output only. The proposed exclude export IP ranges waiting for hub administration's approval.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProposedExcludeExportRanges() {
    return proposedExcludeExportRanges;
  }

  /**
   * Output only. The proposed exclude export IP ranges waiting for hub administration's approval.
   * @param proposedExcludeExportRanges proposedExcludeExportRanges or {@code null} for none
   */
  public LinkedVpcNetwork setProposedExcludeExportRanges(java.util.List<java.lang.String> proposedExcludeExportRanges) {
    this.proposedExcludeExportRanges = proposedExcludeExportRanges;
    return this;
  }

  /**
   * Output only. The proposed include export IP ranges waiting for hub administration's approval.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProposedIncludeExportRanges() {
    return proposedIncludeExportRanges;
  }

  /**
   * Output only. The proposed include export IP ranges waiting for hub administration's approval.
   * @param proposedIncludeExportRanges proposedIncludeExportRanges or {@code null} for none
   */
  public LinkedVpcNetwork setProposedIncludeExportRanges(java.util.List<java.lang.String> proposedIncludeExportRanges) {
    this.proposedIncludeExportRanges = proposedIncludeExportRanges;
    return this;
  }

  /**
   * Required. The URI of the VPC network resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Required. The URI of the VPC network resource.
   * @param uri uri or {@code null} for none
   */
  public LinkedVpcNetwork setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public LinkedVpcNetwork set(String fieldName, Object value) {
    return (LinkedVpcNetwork) super.set(fieldName, value);
  }

  @Override
  public LinkedVpcNetwork clone() {
    return (LinkedVpcNetwork) super.clone();
  }

}
