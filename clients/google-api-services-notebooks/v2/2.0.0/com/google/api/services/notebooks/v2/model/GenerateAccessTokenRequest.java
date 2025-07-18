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

package com.google.api.services.notebooks.v2.model;

/**
 * Request message for generating an EUC for the instance owner.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Notebooks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GenerateAccessTokenRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The VM identity token (a JWT) for authenticating the VM.
   * https://cloud.google.com/compute/docs/instances/verifying-instance-identity
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String vmToken;

  /**
   * Required. The VM identity token (a JWT) for authenticating the VM.
   * https://cloud.google.com/compute/docs/instances/verifying-instance-identity
   * @return value or {@code null} for none
   */
  public java.lang.String getVmToken() {
    return vmToken;
  }

  /**
   * Required. The VM identity token (a JWT) for authenticating the VM.
   * https://cloud.google.com/compute/docs/instances/verifying-instance-identity
   * @param vmToken vmToken or {@code null} for none
   */
  public GenerateAccessTokenRequest setVmToken(java.lang.String vmToken) {
    this.vmToken = vmToken;
    return this;
  }

  @Override
  public GenerateAccessTokenRequest set(String fieldName, Object value) {
    return (GenerateAccessTokenRequest) super.set(fieldName, value);
  }

  @Override
  public GenerateAccessTokenRequest clone() {
    return (GenerateAccessTokenRequest) super.clone();
  }

}
