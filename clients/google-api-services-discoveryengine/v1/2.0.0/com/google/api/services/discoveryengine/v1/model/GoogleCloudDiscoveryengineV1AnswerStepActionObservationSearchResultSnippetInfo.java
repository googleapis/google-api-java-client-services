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

package com.google.api.services.discoveryengine.v1.model;

/**
 * Snippet information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1AnswerStepActionObservationSearchResultSnippetInfo extends com.google.api.client.json.GenericJson {

  /**
   * Snippet content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String snippet;

  /**
   * Status of the snippet defined by the search team.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String snippetStatus;

  /**
   * Snippet content.
   * @return value or {@code null} for none
   */
  public java.lang.String getSnippet() {
    return snippet;
  }

  /**
   * Snippet content.
   * @param snippet snippet or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1AnswerStepActionObservationSearchResultSnippetInfo setSnippet(java.lang.String snippet) {
    this.snippet = snippet;
    return this;
  }

  /**
   * Status of the snippet defined by the search team.
   * @return value or {@code null} for none
   */
  public java.lang.String getSnippetStatus() {
    return snippetStatus;
  }

  /**
   * Status of the snippet defined by the search team.
   * @param snippetStatus snippetStatus or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1AnswerStepActionObservationSearchResultSnippetInfo setSnippetStatus(java.lang.String snippetStatus) {
    this.snippetStatus = snippetStatus;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1AnswerStepActionObservationSearchResultSnippetInfo set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1AnswerStepActionObservationSearchResultSnippetInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1AnswerStepActionObservationSearchResultSnippetInfo clone() {
    return (GoogleCloudDiscoveryengineV1AnswerStepActionObservationSearchResultSnippetInfo) super.clone();
  }

}