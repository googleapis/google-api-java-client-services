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

package com.google.api.services.metastore.v1alpha.model;

/**
 * Request message for DataprocMetastore.StartMigration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataproc Metastore API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StartMigrationRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The configuration details for the migration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MigrationExecution migrationExecution;

  /**
   * Optional. A request ID. Specify a unique request ID to allow the server to ignore the request
   * if it has completed. The server will ignore subsequent requests that provide a duplicate
   * request ID for at least 60 minutes after the first request.For example, if an initial request
   * times out, followed by another request with the same request ID, the server ignores the second
   * request to prevent the creation of duplicate commitments.The request ID must be a valid UUID
   * (https://en.wikipedia.org/wiki/Universally_unique_identifier#Format) A zero UUID
   * (00000000-0000-0000-0000-000000000000) is not supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestId;

  /**
   * Required. The configuration details for the migration.
   * @return value or {@code null} for none
   */
  public MigrationExecution getMigrationExecution() {
    return migrationExecution;
  }

  /**
   * Required. The configuration details for the migration.
   * @param migrationExecution migrationExecution or {@code null} for none
   */
  public StartMigrationRequest setMigrationExecution(MigrationExecution migrationExecution) {
    this.migrationExecution = migrationExecution;
    return this;
  }

  /**
   * Optional. A request ID. Specify a unique request ID to allow the server to ignore the request
   * if it has completed. The server will ignore subsequent requests that provide a duplicate
   * request ID for at least 60 minutes after the first request.For example, if an initial request
   * times out, followed by another request with the same request ID, the server ignores the second
   * request to prevent the creation of duplicate commitments.The request ID must be a valid UUID
   * (https://en.wikipedia.org/wiki/Universally_unique_identifier#Format) A zero UUID
   * (00000000-0000-0000-0000-000000000000) is not supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestId() {
    return requestId;
  }

  /**
   * Optional. A request ID. Specify a unique request ID to allow the server to ignore the request
   * if it has completed. The server will ignore subsequent requests that provide a duplicate
   * request ID for at least 60 minutes after the first request.For example, if an initial request
   * times out, followed by another request with the same request ID, the server ignores the second
   * request to prevent the creation of duplicate commitments.The request ID must be a valid UUID
   * (https://en.wikipedia.org/wiki/Universally_unique_identifier#Format) A zero UUID
   * (00000000-0000-0000-0000-000000000000) is not supported.
   * @param requestId requestId or {@code null} for none
   */
  public StartMigrationRequest setRequestId(java.lang.String requestId) {
    this.requestId = requestId;
    return this;
  }

  @Override
  public StartMigrationRequest set(String fieldName, Object value) {
    return (StartMigrationRequest) super.set(fieldName, value);
  }

  @Override
  public StartMigrationRequest clone() {
    return (StartMigrationRequest) super.clone();
  }

}
