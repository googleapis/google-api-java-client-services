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

package com.google.api.services.authorizedbuyersmarketplace.v1alpha.model;

/**
 * Defines an identifier for a segment of inventory that can be targeted by curators or media
 * planners in the deals or auction packages UI. Curation of inventory is done by curators on
 * external platforms.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Authorized Buyers Marketplace API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DataSegment extends com.google.api.client.json.GenericJson {

  /**
   * Required. This will be charged when other accounts use this data segment. For example, when
   * other accounts add this data segment to a deal or auction package. Once set, the currency code
   * cannot be changed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Money cpmFee;

  /**
   * Output only. Time the data segment was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Immutable. Identifier. The unique identifier for the data segment. Account ID corresponds to
   * the account ID that created the segment. v1alpha format:
   * `buyers/{accountId}/dataSegments/{curatorDataSegmentId}` v1beta format:
   * `curators/{curatorAccountId}/dataSegments/{curatorDataSegmentId}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The state of the data segment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Time the data segment was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Required. This will be charged when other accounts use this data segment. For example, when
   * other accounts add this data segment to a deal or auction package. Once set, the currency code
   * cannot be changed.
   * @return value or {@code null} for none
   */
  public Money getCpmFee() {
    return cpmFee;
  }

  /**
   * Required. This will be charged when other accounts use this data segment. For example, when
   * other accounts add this data segment to a deal or auction package. Once set, the currency code
   * cannot be changed.
   * @param cpmFee cpmFee or {@code null} for none
   */
  public DataSegment setCpmFee(Money cpmFee) {
    this.cpmFee = cpmFee;
    return this;
  }

  /**
   * Output only. Time the data segment was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Time the data segment was created.
   * @param createTime createTime or {@code null} for none
   */
  public DataSegment setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Immutable. Identifier. The unique identifier for the data segment. Account ID corresponds to
   * the account ID that created the segment. v1alpha format:
   * `buyers/{accountId}/dataSegments/{curatorDataSegmentId}` v1beta format:
   * `curators/{curatorAccountId}/dataSegments/{curatorDataSegmentId}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Immutable. Identifier. The unique identifier for the data segment. Account ID corresponds to
   * the account ID that created the segment. v1alpha format:
   * `buyers/{accountId}/dataSegments/{curatorDataSegmentId}` v1beta format:
   * `curators/{curatorAccountId}/dataSegments/{curatorDataSegmentId}`
   * @param name name or {@code null} for none
   */
  public DataSegment setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The state of the data segment.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The state of the data segment.
   * @param state state or {@code null} for none
   */
  public DataSegment setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Time the data segment was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Time the data segment was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public DataSegment setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public DataSegment set(String fieldName, Object value) {
    return (DataSegment) super.set(fieldName, value);
  }

  @Override
  public DataSegment clone() {
    return (DataSegment) super.clone();
  }

}
