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

package com.google.api.services.osconfig.v2.model;

/**
 * VM inventory details.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OSPolicyAssignmentInstanceFilterInventory extends com.google.api.client.json.GenericJson {

  /**
   * Required. The OS short name
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String osShortName;

  /**
   * The OS version Prefix matches are supported if asterisk(*) is provided as the last character.
   * For example, to match all versions with a major version of `7`, specify the following value for
   * this field `7.*` An empty string matches all OS versions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String osVersion;

  /**
   * Required. The OS short name
   * @return value or {@code null} for none
   */
  public java.lang.String getOsShortName() {
    return osShortName;
  }

  /**
   * Required. The OS short name
   * @param osShortName osShortName or {@code null} for none
   */
  public OSPolicyAssignmentInstanceFilterInventory setOsShortName(java.lang.String osShortName) {
    this.osShortName = osShortName;
    return this;
  }

  /**
   * The OS version Prefix matches are supported if asterisk(*) is provided as the last character.
   * For example, to match all versions with a major version of `7`, specify the following value for
   * this field `7.*` An empty string matches all OS versions.
   * @return value or {@code null} for none
   */
  public java.lang.String getOsVersion() {
    return osVersion;
  }

  /**
   * The OS version Prefix matches are supported if asterisk(*) is provided as the last character.
   * For example, to match all versions with a major version of `7`, specify the following value for
   * this field `7.*` An empty string matches all OS versions.
   * @param osVersion osVersion or {@code null} for none
   */
  public OSPolicyAssignmentInstanceFilterInventory setOsVersion(java.lang.String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  @Override
  public OSPolicyAssignmentInstanceFilterInventory set(String fieldName, Object value) {
    return (OSPolicyAssignmentInstanceFilterInventory) super.set(fieldName, value);
  }

  @Override
  public OSPolicyAssignmentInstanceFilterInventory clone() {
    return (OSPolicyAssignmentInstanceFilterInventory) super.clone();
  }

}
