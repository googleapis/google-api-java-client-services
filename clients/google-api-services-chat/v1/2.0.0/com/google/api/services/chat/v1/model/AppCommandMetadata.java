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

package com.google.api.services.chat.v1.model;

/**
 * Metadata associated with app commands. App commands are a way for users to invoke and interact
 * with a Chat app. These can be slash commands typed in the compose box, or items directly selected
 * from the integration menu. For more information, see [Respond to quick
 * commands](https://developers.google.com/workspace/chat/quick-commands).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppCommandMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The command ID for the given app interaction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer appCommandId;

  /**
   * The type of the app command.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appCommandType;

  /**
   * The command ID for the given app interaction.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAppCommandId() {
    return appCommandId;
  }

  /**
   * The command ID for the given app interaction.
   * @param appCommandId appCommandId or {@code null} for none
   */
  public AppCommandMetadata setAppCommandId(java.lang.Integer appCommandId) {
    this.appCommandId = appCommandId;
    return this;
  }

  /**
   * The type of the app command.
   * @return value or {@code null} for none
   */
  public java.lang.String getAppCommandType() {
    return appCommandType;
  }

  /**
   * The type of the app command.
   * @param appCommandType appCommandType or {@code null} for none
   */
  public AppCommandMetadata setAppCommandType(java.lang.String appCommandType) {
    this.appCommandType = appCommandType;
    return this;
  }

  @Override
  public AppCommandMetadata set(String fieldName, Object value) {
    return (AppCommandMetadata) super.set(fieldName, value);
  }

  @Override
  public AppCommandMetadata clone() {
    return (AppCommandMetadata) super.clone();
  }

}
