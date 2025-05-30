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

package com.google.api.services.games.model;

/**
 * A third party application verification response resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Games Services API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApplicationVerifyResponse extends com.google.api.client.json.GenericJson {

  /**
   * An alternate ID that was once used for the player that was issued the auth token used in this
   * request. (This field is not normally populated.)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("alternate_player_id")
  private java.lang.String alternatePlayerId;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `games#applicationVerifyResponse`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The ID of the player that was issued the auth token used in this request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("player_id")
  private java.lang.String playerId;

  /**
   * An alternate ID that was once used for the player that was issued the auth token used in this
   * request. (This field is not normally populated.)
   * @return value or {@code null} for none
   */
  public java.lang.String getAlternatePlayerId() {
    return alternatePlayerId;
  }

  /**
   * An alternate ID that was once used for the player that was issued the auth token used in this
   * request. (This field is not normally populated.)
   * @param alternatePlayerId alternatePlayerId or {@code null} for none
   */
  public ApplicationVerifyResponse setAlternatePlayerId(java.lang.String alternatePlayerId) {
    this.alternatePlayerId = alternatePlayerId;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `games#applicationVerifyResponse`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `games#applicationVerifyResponse`.
   * @param kind kind or {@code null} for none
   */
  public ApplicationVerifyResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The ID of the player that was issued the auth token used in this request.
   * @return value or {@code null} for none
   */
  public java.lang.String getPlayerId() {
    return playerId;
  }

  /**
   * The ID of the player that was issued the auth token used in this request.
   * @param playerId playerId or {@code null} for none
   */
  public ApplicationVerifyResponse setPlayerId(java.lang.String playerId) {
    this.playerId = playerId;
    return this;
  }

  @Override
  public ApplicationVerifyResponse set(String fieldName, Object value) {
    return (ApplicationVerifyResponse) super.set(fieldName, value);
  }

  @Override
  public ApplicationVerifyResponse clone() {
    return (ApplicationVerifyResponse) super.clone();
  }

}
