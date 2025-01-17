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

package com.google.api.services.firebaseappdistribution.v1alpha.model;

/**
 * Response message for `UploadRelease`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase App Distribution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirebaseAppdistroV1UploadReleaseResponse extends com.google.api.client.json.GenericJson {

  /**
   * Release associated with the uploaded binary.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleFirebaseAppdistroV1Release release;

  /**
   * Result of upload release.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String result;

  /**
   * Release associated with the uploaded binary.
   * @return value or {@code null} for none
   */
  public GoogleFirebaseAppdistroV1Release getRelease() {
    return release;
  }

  /**
   * Release associated with the uploaded binary.
   * @param release release or {@code null} for none
   */
  public GoogleFirebaseAppdistroV1UploadReleaseResponse setRelease(GoogleFirebaseAppdistroV1Release release) {
    this.release = release;
    return this;
  }

  /**
   * Result of upload release.
   * @return value or {@code null} for none
   */
  public java.lang.String getResult() {
    return result;
  }

  /**
   * Result of upload release.
   * @param result result or {@code null} for none
   */
  public GoogleFirebaseAppdistroV1UploadReleaseResponse setResult(java.lang.String result) {
    this.result = result;
    return this;
  }

  @Override
  public GoogleFirebaseAppdistroV1UploadReleaseResponse set(String fieldName, Object value) {
    return (GoogleFirebaseAppdistroV1UploadReleaseResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleFirebaseAppdistroV1UploadReleaseResponse clone() {
    return (GoogleFirebaseAppdistroV1UploadReleaseResponse) super.clone();
  }

}
