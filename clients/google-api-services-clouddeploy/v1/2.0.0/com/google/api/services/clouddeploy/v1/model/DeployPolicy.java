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

package com.google.api.services.clouddeploy.v1.model;

/**
 * A `DeployPolicy` resource in the Cloud Deploy API. A `DeployPolicy` inhibits manual or
 * automation-driven actions within a Delivery Pipeline or Target.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Deploy API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeployPolicy extends com.google.api.client.json.GenericJson {

  /**
   * Optional. User annotations. These attributes can only be set and used by the user, and not by
   * Cloud Deploy. Annotations must meet the following constraints: * Annotations are key/value
   * pairs. * Valid annotation keys have two segments: an optional prefix and name, separated by a
   * slash (`/`). * The name segment is required and must be 63 characters or less, beginning and
   * ending with an alphanumeric character (`[a-z0-9A-Z]`) with dashes (`-`), underscores (`_`),
   * dots (`.`), and alphanumerics between. * The prefix is optional. If specified, the prefix must
   * be a DNS subdomain: a series of DNS labels separated by dots(`.`), not longer than 253
   * characters in total, followed by a slash (`/`). See
   * https://kubernetes.io/docs/concepts/overview/working-with-objects/annotations/#syntax-and-
   * character-set for more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> annotations;

  /**
   * Output only. Time at which the deploy policy was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. Description of the `DeployPolicy`. Max length is 255 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The weak etag of the `DeployPolicy` resource. This checksum is computed by the server based on
   * the value of other fields, and may be sent on update and delete requests to ensure the client
   * has an up-to-date value before proceeding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Labels are attributes that can be set and used by both the user and by Cloud Deploy. Labels
   * must meet the following constraints: * Keys and values can contain only lowercase letters,
   * numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and
   * international characters are allowed. * Keys must start with a lowercase letter or
   * international character. * Each resource is limited to a maximum of 64 labels. Both keys and
   * values are additionally constrained to be <= 128 bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. Name of the `DeployPolicy`. Format is
   * `projects/{project}/locations/{location}/deployPolicies/{deployPolicy}`. The `deployPolicy`
   * component must match `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Rules to apply. At least one rule must be present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PolicyRule> rules;

  /**
   * Required. Selected resources to which the policy will be applied. At least one selector is
   * required. If one selector matches the resource the policy applies. For example, if there are
   * two selectors and the action being attempted matches one of them, the policy will apply to that
   * action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DeployPolicyResourceSelector> selectors;

  /**
   * Optional. When suspended, the policy will not prevent actions from occurring, even if the
   * action violates the policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean suspended;

  /**
   * Output only. Unique identifier of the `DeployPolicy`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * Output only. Most recent time at which the deploy policy was updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Optional. User annotations. These attributes can only be set and used by the user, and not by
   * Cloud Deploy. Annotations must meet the following constraints: * Annotations are key/value
   * pairs. * Valid annotation keys have two segments: an optional prefix and name, separated by a
   * slash (`/`). * The name segment is required and must be 63 characters or less, beginning and
   * ending with an alphanumeric character (`[a-z0-9A-Z]`) with dashes (`-`), underscores (`_`),
   * dots (`.`), and alphanumerics between. * The prefix is optional. If specified, the prefix must
   * be a DNS subdomain: a series of DNS labels separated by dots(`.`), not longer than 253
   * characters in total, followed by a slash (`/`). See
   * https://kubernetes.io/docs/concepts/overview/working-with-objects/annotations/#syntax-and-
   * character-set for more details.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAnnotations() {
    return annotations;
  }

  /**
   * Optional. User annotations. These attributes can only be set and used by the user, and not by
   * Cloud Deploy. Annotations must meet the following constraints: * Annotations are key/value
   * pairs. * Valid annotation keys have two segments: an optional prefix and name, separated by a
   * slash (`/`). * The name segment is required and must be 63 characters or less, beginning and
   * ending with an alphanumeric character (`[a-z0-9A-Z]`) with dashes (`-`), underscores (`_`),
   * dots (`.`), and alphanumerics between. * The prefix is optional. If specified, the prefix must
   * be a DNS subdomain: a series of DNS labels separated by dots(`.`), not longer than 253
   * characters in total, followed by a slash (`/`). See
   * https://kubernetes.io/docs/concepts/overview/working-with-objects/annotations/#syntax-and-
   * character-set for more details.
   * @param annotations annotations or {@code null} for none
   */
  public DeployPolicy setAnnotations(java.util.Map<String, java.lang.String> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * Output only. Time at which the deploy policy was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Time at which the deploy policy was created.
   * @param createTime createTime or {@code null} for none
   */
  public DeployPolicy setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. Description of the `DeployPolicy`. Max length is 255 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. Description of the `DeployPolicy`. Max length is 255 characters.
   * @param description description or {@code null} for none
   */
  public DeployPolicy setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The weak etag of the `DeployPolicy` resource. This checksum is computed by the server based on
   * the value of other fields, and may be sent on update and delete requests to ensure the client
   * has an up-to-date value before proceeding.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * The weak etag of the `DeployPolicy` resource. This checksum is computed by the server based on
   * the value of other fields, and may be sent on update and delete requests to ensure the client
   * has an up-to-date value before proceeding.
   * @param etag etag or {@code null} for none
   */
  public DeployPolicy setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Labels are attributes that can be set and used by both the user and by Cloud Deploy. Labels
   * must meet the following constraints: * Keys and values can contain only lowercase letters,
   * numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and
   * international characters are allowed. * Keys must start with a lowercase letter or
   * international character. * Each resource is limited to a maximum of 64 labels. Both keys and
   * values are additionally constrained to be <= 128 bytes.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels are attributes that can be set and used by both the user and by Cloud Deploy. Labels
   * must meet the following constraints: * Keys and values can contain only lowercase letters,
   * numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and
   * international characters are allowed. * Keys must start with a lowercase letter or
   * international character. * Each resource is limited to a maximum of 64 labels. Both keys and
   * values are additionally constrained to be <= 128 bytes.
   * @param labels labels or {@code null} for none
   */
  public DeployPolicy setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. Name of the `DeployPolicy`. Format is
   * `projects/{project}/locations/{location}/deployPolicies/{deployPolicy}`. The `deployPolicy`
   * component must match `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Name of the `DeployPolicy`. Format is
   * `projects/{project}/locations/{location}/deployPolicies/{deployPolicy}`. The `deployPolicy`
   * component must match `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`
   * @param name name or {@code null} for none
   */
  public DeployPolicy setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. Rules to apply. At least one rule must be present.
   * @return value or {@code null} for none
   */
  public java.util.List<PolicyRule> getRules() {
    return rules;
  }

  /**
   * Required. Rules to apply. At least one rule must be present.
   * @param rules rules or {@code null} for none
   */
  public DeployPolicy setRules(java.util.List<PolicyRule> rules) {
    this.rules = rules;
    return this;
  }

  /**
   * Required. Selected resources to which the policy will be applied. At least one selector is
   * required. If one selector matches the resource the policy applies. For example, if there are
   * two selectors and the action being attempted matches one of them, the policy will apply to that
   * action.
   * @return value or {@code null} for none
   */
  public java.util.List<DeployPolicyResourceSelector> getSelectors() {
    return selectors;
  }

  /**
   * Required. Selected resources to which the policy will be applied. At least one selector is
   * required. If one selector matches the resource the policy applies. For example, if there are
   * two selectors and the action being attempted matches one of them, the policy will apply to that
   * action.
   * @param selectors selectors or {@code null} for none
   */
  public DeployPolicy setSelectors(java.util.List<DeployPolicyResourceSelector> selectors) {
    this.selectors = selectors;
    return this;
  }

  /**
   * Optional. When suspended, the policy will not prevent actions from occurring, even if the
   * action violates the policy.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSuspended() {
    return suspended;
  }

  /**
   * Optional. When suspended, the policy will not prevent actions from occurring, even if the
   * action violates the policy.
   * @param suspended suspended or {@code null} for none
   */
  public DeployPolicy setSuspended(java.lang.Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * Output only. Unique identifier of the `DeployPolicy`.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Output only. Unique identifier of the `DeployPolicy`.
   * @param uid uid or {@code null} for none
   */
  public DeployPolicy setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Output only. Most recent time at which the deploy policy was updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Most recent time at which the deploy policy was updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public DeployPolicy setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public DeployPolicy set(String fieldName, Object value) {
    return (DeployPolicy) super.set(fieldName, value);
  }

  @Override
  public DeployPolicy clone() {
    return (DeployPolicy) super.clone();
  }

}
