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

package com.google.api.services.networksecurity.v1beta1.model;

/**
 * Key to be shared with SSE service provider to establish global handshake.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Security API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SACRealmPairingKey extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Timestamp in UTC of when this resource is considered expired. It expires 7 days
   * after creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expireTime;

  /**
   * Output only. Key value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * Output only. Timestamp in UTC of when this resource is considered expired. It expires 7 days
   * after creation.
   * @return value or {@code null} for none
   */
  public String getExpireTime() {
    return expireTime;
  }

  /**
   * Output only. Timestamp in UTC of when this resource is considered expired. It expires 7 days
   * after creation.
   * @param expireTime expireTime or {@code null} for none
   */
  public SACRealmPairingKey setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  /**
   * Output only. Key value.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * Output only. Key value.
   * @param key key or {@code null} for none
   */
  public SACRealmPairingKey setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  @Override
  public SACRealmPairingKey set(String fieldName, Object value) {
    return (SACRealmPairingKey) super.set(fieldName, value);
  }

  @Override
  public SACRealmPairingKey clone() {
    return (SACRealmPairingKey) super.clone();
  }

}
