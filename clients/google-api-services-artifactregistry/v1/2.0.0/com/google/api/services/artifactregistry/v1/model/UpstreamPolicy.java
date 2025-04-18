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

package com.google.api.services.artifactregistry.v1.model;

/**
 * Artifact policy configuration for the repository contents.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Artifact Registry API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpstreamPolicy extends com.google.api.client.json.GenericJson {

  /**
   * The user-provided ID of the upstream policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Entries with a greater priority value take precedence in the pull order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer priority;

  /**
   * A reference to the repository resource, for example: `projects/p1/locations/us-
   * central1/repositories/repo1`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String repository;

  /**
   * The user-provided ID of the upstream policy.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The user-provided ID of the upstream policy.
   * @param id id or {@code null} for none
   */
  public UpstreamPolicy setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Entries with a greater priority value take precedence in the pull order.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPriority() {
    return priority;
  }

  /**
   * Entries with a greater priority value take precedence in the pull order.
   * @param priority priority or {@code null} for none
   */
  public UpstreamPolicy setPriority(java.lang.Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * A reference to the repository resource, for example: `projects/p1/locations/us-
   * central1/repositories/repo1`.
   * @return value or {@code null} for none
   */
  public java.lang.String getRepository() {
    return repository;
  }

  /**
   * A reference to the repository resource, for example: `projects/p1/locations/us-
   * central1/repositories/repo1`.
   * @param repository repository or {@code null} for none
   */
  public UpstreamPolicy setRepository(java.lang.String repository) {
    this.repository = repository;
    return this;
  }

  @Override
  public UpstreamPolicy set(String fieldName, Object value) {
    return (UpstreamPolicy) super.set(fieldName, value);
  }

  @Override
  public UpstreamPolicy clone() {
    return (UpstreamPolicy) super.clone();
  }

}
