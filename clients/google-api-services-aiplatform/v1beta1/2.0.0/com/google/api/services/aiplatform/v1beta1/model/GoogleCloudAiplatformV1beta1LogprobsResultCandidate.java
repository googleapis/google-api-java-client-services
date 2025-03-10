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

package com.google.api.services.aiplatform.v1beta1.model;

/**
 * Candidate for the logprobs token and score.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1LogprobsResultCandidate extends com.google.api.client.json.GenericJson {

  /**
   * The candidate's log probability.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float logProbability;

  /**
   * The candidate's token string value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String token;

  /**
   * The candidate's token id value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer tokenId;

  /**
   * The candidate's log probability.
   * @return value or {@code null} for none
   */
  public java.lang.Float getLogProbability() {
    return logProbability;
  }

  /**
   * The candidate's log probability.
   * @param logProbability logProbability or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1LogprobsResultCandidate setLogProbability(java.lang.Float logProbability) {
    this.logProbability = logProbability;
    return this;
  }

  /**
   * The candidate's token string value.
   * @return value or {@code null} for none
   */
  public java.lang.String getToken() {
    return token;
  }

  /**
   * The candidate's token string value.
   * @param token token or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1LogprobsResultCandidate setToken(java.lang.String token) {
    this.token = token;
    return this;
  }

  /**
   * The candidate's token id value.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTokenId() {
    return tokenId;
  }

  /**
   * The candidate's token id value.
   * @param tokenId tokenId or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1LogprobsResultCandidate setTokenId(java.lang.Integer tokenId) {
    this.tokenId = tokenId;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1LogprobsResultCandidate set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1LogprobsResultCandidate) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1LogprobsResultCandidate clone() {
    return (GoogleCloudAiplatformV1beta1LogprobsResultCandidate) super.clone();
  }

}
