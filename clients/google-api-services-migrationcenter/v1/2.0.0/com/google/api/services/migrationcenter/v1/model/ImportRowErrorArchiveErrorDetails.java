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

package com.google.api.services.migrationcenter.v1.model;

/**
 * Error details for an archive file.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Migration Center API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImportRowErrorArchiveErrorDetails extends com.google.api.client.json.GenericJson {

  /**
   * Error details for a CSV file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ImportRowErrorCsvErrorDetails csvError;

  /**
   * Output only. The file path inside the archive where the error was detected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filePath;

  /**
   * Error details for a CSV file.
   * @return value or {@code null} for none
   */
  public ImportRowErrorCsvErrorDetails getCsvError() {
    return csvError;
  }

  /**
   * Error details for a CSV file.
   * @param csvError csvError or {@code null} for none
   */
  public ImportRowErrorArchiveErrorDetails setCsvError(ImportRowErrorCsvErrorDetails csvError) {
    this.csvError = csvError;
    return this;
  }

  /**
   * Output only. The file path inside the archive where the error was detected.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilePath() {
    return filePath;
  }

  /**
   * Output only. The file path inside the archive where the error was detected.
   * @param filePath filePath or {@code null} for none
   */
  public ImportRowErrorArchiveErrorDetails setFilePath(java.lang.String filePath) {
    this.filePath = filePath;
    return this;
  }

  @Override
  public ImportRowErrorArchiveErrorDetails set(String fieldName, Object value) {
    return (ImportRowErrorArchiveErrorDetails) super.set(fieldName, value);
  }

  @Override
  public ImportRowErrorArchiveErrorDetails clone() {
    return (ImportRowErrorArchiveErrorDetails) super.clone();
  }

}
