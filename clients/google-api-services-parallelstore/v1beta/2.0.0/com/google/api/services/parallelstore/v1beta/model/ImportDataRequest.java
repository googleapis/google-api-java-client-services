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

package com.google.api.services.parallelstore.v1beta.model;

/**
 * Import data from Cloud Storage into a Parallelstore instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Parallelstore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImportDataRequest extends com.google.api.client.json.GenericJson {

  /**
   * Parallelstore destination.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DestinationParallelstore destinationParallelstore;

  /**
   * Optional. The transfer metadata options for the import data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TransferMetadataOptions metadataOptions;

  /**
   * Optional. An optional request ID to identify requests. Specify a unique request ID so that if
   * you must retry your request, the server will know to ignore the request if it has already been
   * completed. The server will guarantee that for at least 60 minutes since the first request. For
   * example, consider a situation where you make an initial request and the request times out. If
   * you make the request again with the same request ID, the server can check if original operation
   * with the same request ID was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments. The request ID must be a valid UUID
   * with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestId;

  /**
   * Optional. User-specified service account credentials to be used when performing the transfer.
   * Use one of the following formats: * `{EMAIL_ADDRESS_OR_UNIQUE_ID}` *
   * `projects/{PROJECT_ID_OR_NUMBER}/serviceAccounts/{EMAIL_ADDRESS_OR_UNIQUE_ID}` *
   * `projects/-/serviceAccounts/{EMAIL_ADDRESS_OR_UNIQUE_ID}` If unspecified, the Parallelstore
   * service agent is used: `service-@gcp-sa-parallelstore.iam.gserviceaccount.com`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * The Cloud Storage source bucket and, optionally, path inside the bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SourceGcsBucket sourceGcsBucket;

  /**
   * Parallelstore destination.
   * @return value or {@code null} for none
   */
  public DestinationParallelstore getDestinationParallelstore() {
    return destinationParallelstore;
  }

  /**
   * Parallelstore destination.
   * @param destinationParallelstore destinationParallelstore or {@code null} for none
   */
  public ImportDataRequest setDestinationParallelstore(DestinationParallelstore destinationParallelstore) {
    this.destinationParallelstore = destinationParallelstore;
    return this;
  }

  /**
   * Optional. The transfer metadata options for the import data.
   * @return value or {@code null} for none
   */
  public TransferMetadataOptions getMetadataOptions() {
    return metadataOptions;
  }

  /**
   * Optional. The transfer metadata options for the import data.
   * @param metadataOptions metadataOptions or {@code null} for none
   */
  public ImportDataRequest setMetadataOptions(TransferMetadataOptions metadataOptions) {
    this.metadataOptions = metadataOptions;
    return this;
  }

  /**
   * Optional. An optional request ID to identify requests. Specify a unique request ID so that if
   * you must retry your request, the server will know to ignore the request if it has already been
   * completed. The server will guarantee that for at least 60 minutes since the first request. For
   * example, consider a situation where you make an initial request and the request times out. If
   * you make the request again with the same request ID, the server can check if original operation
   * with the same request ID was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments. The request ID must be a valid UUID
   * with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestId() {
    return requestId;
  }

  /**
   * Optional. An optional request ID to identify requests. Specify a unique request ID so that if
   * you must retry your request, the server will know to ignore the request if it has already been
   * completed. The server will guarantee that for at least 60 minutes since the first request. For
   * example, consider a situation where you make an initial request and the request times out. If
   * you make the request again with the same request ID, the server can check if original operation
   * with the same request ID was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments. The request ID must be a valid UUID
   * with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
   * @param requestId requestId or {@code null} for none
   */
  public ImportDataRequest setRequestId(java.lang.String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Optional. User-specified service account credentials to be used when performing the transfer.
   * Use one of the following formats: * `{EMAIL_ADDRESS_OR_UNIQUE_ID}` *
   * `projects/{PROJECT_ID_OR_NUMBER}/serviceAccounts/{EMAIL_ADDRESS_OR_UNIQUE_ID}` *
   * `projects/-/serviceAccounts/{EMAIL_ADDRESS_OR_UNIQUE_ID}` If unspecified, the Parallelstore
   * service agent is used: `service-@gcp-sa-parallelstore.iam.gserviceaccount.com`
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * Optional. User-specified service account credentials to be used when performing the transfer.
   * Use one of the following formats: * `{EMAIL_ADDRESS_OR_UNIQUE_ID}` *
   * `projects/{PROJECT_ID_OR_NUMBER}/serviceAccounts/{EMAIL_ADDRESS_OR_UNIQUE_ID}` *
   * `projects/-/serviceAccounts/{EMAIL_ADDRESS_OR_UNIQUE_ID}` If unspecified, the Parallelstore
   * service agent is used: `service-@gcp-sa-parallelstore.iam.gserviceaccount.com`
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public ImportDataRequest setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * The Cloud Storage source bucket and, optionally, path inside the bucket.
   * @return value or {@code null} for none
   */
  public SourceGcsBucket getSourceGcsBucket() {
    return sourceGcsBucket;
  }

  /**
   * The Cloud Storage source bucket and, optionally, path inside the bucket.
   * @param sourceGcsBucket sourceGcsBucket or {@code null} for none
   */
  public ImportDataRequest setSourceGcsBucket(SourceGcsBucket sourceGcsBucket) {
    this.sourceGcsBucket = sourceGcsBucket;
    return this;
  }

  @Override
  public ImportDataRequest set(String fieldName, Object value) {
    return (ImportDataRequest) super.set(fieldName, value);
  }

  @Override
  public ImportDataRequest clone() {
    return (ImportDataRequest) super.clone();
  }

}
