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

package com.google.api.services.orgpolicy.v2.model;

/**
 * A constraint that is either enforced or not. For example, a constraint
 * `constraints/compute.disableSerialPortAccess`. If it is enforced on a VM instance, serial port
 * connections will not be opened to that instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Organization Policy API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudOrgpolicyV2ConstraintBooleanConstraint extends com.google.api.client.json.GenericJson {

  /**
   * Custom constraint definition. This is set only for Managed Constraints
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudOrgpolicyV2ConstraintCustomConstraintDefinition customConstraintDefinition;

  /**
   * Custom constraint definition. This is set only for Managed Constraints
   * @return value or {@code null} for none
   */
  public GoogleCloudOrgpolicyV2ConstraintCustomConstraintDefinition getCustomConstraintDefinition() {
    return customConstraintDefinition;
  }

  /**
   * Custom constraint definition. This is set only for Managed Constraints
   * @param customConstraintDefinition customConstraintDefinition or {@code null} for none
   */
  public GoogleCloudOrgpolicyV2ConstraintBooleanConstraint setCustomConstraintDefinition(GoogleCloudOrgpolicyV2ConstraintCustomConstraintDefinition customConstraintDefinition) {
    this.customConstraintDefinition = customConstraintDefinition;
    return this;
  }

  @Override
  public GoogleCloudOrgpolicyV2ConstraintBooleanConstraint set(String fieldName, Object value) {
    return (GoogleCloudOrgpolicyV2ConstraintBooleanConstraint) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudOrgpolicyV2ConstraintBooleanConstraint clone() {
    return (GoogleCloudOrgpolicyV2ConstraintBooleanConstraint) super.clone();
  }

}
