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

package com.google.api.services.apphub.v1alpha.model;

/**
 * Perimeter is a boundary that describes application management on a `perimeter_node` (currently
 * limited to an app-enabled folder).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Perimeter extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Create time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Identifier. Name of the Perimeter resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Immutable. Cloud Resource Manager node that determines the perimeter. Only
   * `folders/{folder_number}` is currently supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String perimeterNode;

  /**
   * Output only. Perimeter state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Update time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Create time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Create time.
   * @param createTime createTime or {@code null} for none
   */
  public Perimeter setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Identifier. Name of the Perimeter resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. Name of the Perimeter resource.
   * @param name name or {@code null} for none
   */
  public Perimeter setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Immutable. Cloud Resource Manager node that determines the perimeter. Only
   * `folders/{folder_number}` is currently supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getPerimeterNode() {
    return perimeterNode;
  }

  /**
   * Immutable. Cloud Resource Manager node that determines the perimeter. Only
   * `folders/{folder_number}` is currently supported.
   * @param perimeterNode perimeterNode or {@code null} for none
   */
  public Perimeter setPerimeterNode(java.lang.String perimeterNode) {
    this.perimeterNode = perimeterNode;
    return this;
  }

  /**
   * Output only. Perimeter state.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. Perimeter state.
   * @param state state or {@code null} for none
   */
  public Perimeter setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Update time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Update time.
   * @param updateTime updateTime or {@code null} for none
   */
  public Perimeter setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Perimeter set(String fieldName, Object value) {
    return (Perimeter) super.set(fieldName, value);
  }

  @Override
  public Perimeter clone() {
    return (Perimeter) super.clone();
  }

}
