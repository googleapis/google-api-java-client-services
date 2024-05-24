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
 * Step information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1AnswerStep extends com.google.api.client.json.GenericJson {

  /**
   * Actions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDiscoveryengineV1AnswerStepAction> actions;

  /**
   * The description of the step.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The state of the step.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The thought of the step.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String thought;

  /**
   * Actions.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDiscoveryengineV1AnswerStepAction> getActions() {
    return actions;
  }

  /**
   * Actions.
   * @param actions actions or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1AnswerStep setActions(java.util.List<GoogleCloudDiscoveryengineV1AnswerStepAction> actions) {
    this.actions = actions;
    return this;
  }

  /**
   * The description of the step.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description of the step.
   * @param description description or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1AnswerStep setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The state of the step.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The state of the step.
   * @param state state or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1AnswerStep setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * The thought of the step.
   * @return value or {@code null} for none
   */
  public java.lang.String getThought() {
    return thought;
  }

  /**
   * The thought of the step.
   * @param thought thought or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1AnswerStep setThought(java.lang.String thought) {
    this.thought = thought;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1AnswerStep set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1AnswerStep) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1AnswerStep clone() {
    return (GoogleCloudDiscoveryengineV1AnswerStep) super.clone();
  }

}