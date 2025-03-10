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

package com.google.api.services.connectors.v2.model;

/**
 * The status of the connector.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Connectors API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CheckStatusResponse extends com.google.api.client.json.GenericJson {

  /**
   * When the connector is not in ACTIVE state, the description must be populated to specify the
   * reason why it's not in ACTIVE state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * State of the connector.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * When the connector is not in ACTIVE state, the description must be populated to specify the
   * reason why it's not in ACTIVE state.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * When the connector is not in ACTIVE state, the description must be populated to specify the
   * reason why it's not in ACTIVE state.
   * @param description description or {@code null} for none
   */
  public CheckStatusResponse setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * State of the connector.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * State of the connector.
   * @param state state or {@code null} for none
   */
  public CheckStatusResponse setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public CheckStatusResponse set(String fieldName, Object value) {
    return (CheckStatusResponse) super.set(fieldName, value);
  }

  @Override
  public CheckStatusResponse clone() {
    return (CheckStatusResponse) super.clone();
  }

}
