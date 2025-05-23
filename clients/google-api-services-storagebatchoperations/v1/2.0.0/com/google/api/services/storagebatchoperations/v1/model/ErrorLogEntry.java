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

package com.google.api.services.storagebatchoperations.v1.model;

/**
 * An entry describing an error that has occurred.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Storage Batch Operations API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ErrorLogEntry extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Output only. At most 5 error log entries are recorded for a given error code for a
   * job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> errorDetails;

  /**
   * Required. Output only. Object URL. e.g. gs://my_bucket/object.txt
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String objectUri;

  /**
   * Optional. Output only. At most 5 error log entries are recorded for a given error code for a
   * job.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getErrorDetails() {
    return errorDetails;
  }

  /**
   * Optional. Output only. At most 5 error log entries are recorded for a given error code for a
   * job.
   * @param errorDetails errorDetails or {@code null} for none
   */
  public ErrorLogEntry setErrorDetails(java.util.List<java.lang.String> errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Required. Output only. Object URL. e.g. gs://my_bucket/object.txt
   * @return value or {@code null} for none
   */
  public java.lang.String getObjectUri() {
    return objectUri;
  }

  /**
   * Required. Output only. Object URL. e.g. gs://my_bucket/object.txt
   * @param objectUri objectUri or {@code null} for none
   */
  public ErrorLogEntry setObjectUri(java.lang.String objectUri) {
    this.objectUri = objectUri;
    return this;
  }

  @Override
  public ErrorLogEntry set(String fieldName, Object value) {
    return (ErrorLogEntry) super.set(fieldName, value);
  }

  @Override
  public ErrorLogEntry clone() {
    return (ErrorLogEntry) super.clone();
  }

}
