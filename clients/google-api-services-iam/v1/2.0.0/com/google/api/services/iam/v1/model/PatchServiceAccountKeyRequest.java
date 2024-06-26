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

package com.google.api.services.iam.v1.model;

/**
 * The service account key patch request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity and Access Management (IAM) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PatchServiceAccountKeyRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The service account key to update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ServiceAccountKey serviceAccountKey;

  /**
   * Required. The update mask to apply to the service account key. Only the following fields are
   * eligible for patching: - contact - description
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateMask;

  /**
   * Required. The service account key to update.
   * @return value or {@code null} for none
   */
  public ServiceAccountKey getServiceAccountKey() {
    return serviceAccountKey;
  }

  /**
   * Required. The service account key to update.
   * @param serviceAccountKey serviceAccountKey or {@code null} for none
   */
  public PatchServiceAccountKeyRequest setServiceAccountKey(ServiceAccountKey serviceAccountKey) {
    this.serviceAccountKey = serviceAccountKey;
    return this;
  }

  /**
   * Required. The update mask to apply to the service account key. Only the following fields are
   * eligible for patching: - contact - description
   * @return value or {@code null} for none
   */
  public String getUpdateMask() {
    return updateMask;
  }

  /**
   * Required. The update mask to apply to the service account key. Only the following fields are
   * eligible for patching: - contact - description
   * @param updateMask updateMask or {@code null} for none
   */
  public PatchServiceAccountKeyRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  @Override
  public PatchServiceAccountKeyRequest set(String fieldName, Object value) {
    return (PatchServiceAccountKeyRequest) super.set(fieldName, value);
  }

  @Override
  public PatchServiceAccountKeyRequest clone() {
    return (PatchServiceAccountKeyRequest) super.clone();
  }

}
