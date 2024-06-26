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

package com.google.api.services.firestore.v1.model;

/**
 * The request message for FirestoreAdmin.RestoreDatabase.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirestoreAdminV1RestoreDatabaseRequest extends com.google.api.client.json.GenericJson {

  /**
   * Backup to restore from. Must be from the same project as the parent. Format is:
   * `projects/{project_id}/locations/{location}/backups/{backup}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String backup;

  /**
   * Required. The ID to use for the database, which will become the final component of the
   * database's resource name. This database id must not be associated with an existing database.
   * This value should be 4-63 characters. Valid characters are /a-z-/ with first character a letter
   * and the last a letter or a number. Must not be UUID-like
   * /[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}/. "(default)" database id is also valid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String databaseId;

  /**
   * Use Customer Managed Encryption Keys (CMEK) for encryption. Only keys in the same location as
   * this database are allowed to be used for encryption. For Firestore's nam5 multi-region, this
   * corresponds to Cloud KMS multi-region us. For Firestore's eur3 multi-region, this corresponds
   * to Cloud KMS multi-region europe. See https://cloud.google.com/kms/docs/locations. The expected
   * format is
   * `projects/{project_id}/locations/{kms_location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsKeyName;

  /**
   * The restored database will use the same encryption configuration as the backup. This is the
   * default option when no `encryption_config` is specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Empty useBackupEncryption;

  /**
   * Use Google default encryption.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Empty useGoogleDefaultEncryption;

  /**
   * Backup to restore from. Must be from the same project as the parent. Format is:
   * `projects/{project_id}/locations/{location}/backups/{backup}`
   * @return value or {@code null} for none
   */
  public java.lang.String getBackup() {
    return backup;
  }

  /**
   * Backup to restore from. Must be from the same project as the parent. Format is:
   * `projects/{project_id}/locations/{location}/backups/{backup}`
   * @param backup backup or {@code null} for none
   */
  public GoogleFirestoreAdminV1RestoreDatabaseRequest setBackup(java.lang.String backup) {
    this.backup = backup;
    return this;
  }

  /**
   * Required. The ID to use for the database, which will become the final component of the
   * database's resource name. This database id must not be associated with an existing database.
   * This value should be 4-63 characters. Valid characters are /a-z-/ with first character a letter
   * and the last a letter or a number. Must not be UUID-like
   * /[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}/. "(default)" database id is also valid.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatabaseId() {
    return databaseId;
  }

  /**
   * Required. The ID to use for the database, which will become the final component of the
   * database's resource name. This database id must not be associated with an existing database.
   * This value should be 4-63 characters. Valid characters are /a-z-/ with first character a letter
   * and the last a letter or a number. Must not be UUID-like
   * /[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}/. "(default)" database id is also valid.
   * @param databaseId databaseId or {@code null} for none
   */
  public GoogleFirestoreAdminV1RestoreDatabaseRequest setDatabaseId(java.lang.String databaseId) {
    this.databaseId = databaseId;
    return this;
  }

  /**
   * Use Customer Managed Encryption Keys (CMEK) for encryption. Only keys in the same location as
   * this database are allowed to be used for encryption. For Firestore's nam5 multi-region, this
   * corresponds to Cloud KMS multi-region us. For Firestore's eur3 multi-region, this corresponds
   * to Cloud KMS multi-region europe. See https://cloud.google.com/kms/docs/locations. The expected
   * format is
   * `projects/{project_id}/locations/{kms_location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsKeyName() {
    return kmsKeyName;
  }

  /**
   * Use Customer Managed Encryption Keys (CMEK) for encryption. Only keys in the same location as
   * this database are allowed to be used for encryption. For Firestore's nam5 multi-region, this
   * corresponds to Cloud KMS multi-region us. For Firestore's eur3 multi-region, this corresponds
   * to Cloud KMS multi-region europe. See https://cloud.google.com/kms/docs/locations. The expected
   * format is
   * `projects/{project_id}/locations/{kms_location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
   * @param kmsKeyName kmsKeyName or {@code null} for none
   */
  public GoogleFirestoreAdminV1RestoreDatabaseRequest setKmsKeyName(java.lang.String kmsKeyName) {
    this.kmsKeyName = kmsKeyName;
    return this;
  }

  /**
   * The restored database will use the same encryption configuration as the backup. This is the
   * default option when no `encryption_config` is specified.
   * @return value or {@code null} for none
   */
  public Empty getUseBackupEncryption() {
    return useBackupEncryption;
  }

  /**
   * The restored database will use the same encryption configuration as the backup. This is the
   * default option when no `encryption_config` is specified.
   * @param useBackupEncryption useBackupEncryption or {@code null} for none
   */
  public GoogleFirestoreAdminV1RestoreDatabaseRequest setUseBackupEncryption(Empty useBackupEncryption) {
    this.useBackupEncryption = useBackupEncryption;
    return this;
  }

  /**
   * Use Google default encryption.
   * @return value or {@code null} for none
   */
  public Empty getUseGoogleDefaultEncryption() {
    return useGoogleDefaultEncryption;
  }

  /**
   * Use Google default encryption.
   * @param useGoogleDefaultEncryption useGoogleDefaultEncryption or {@code null} for none
   */
  public GoogleFirestoreAdminV1RestoreDatabaseRequest setUseGoogleDefaultEncryption(Empty useGoogleDefaultEncryption) {
    this.useGoogleDefaultEncryption = useGoogleDefaultEncryption;
    return this;
  }

  @Override
  public GoogleFirestoreAdminV1RestoreDatabaseRequest set(String fieldName, Object value) {
    return (GoogleFirestoreAdminV1RestoreDatabaseRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleFirestoreAdminV1RestoreDatabaseRequest clone() {
    return (GoogleFirestoreAdminV1RestoreDatabaseRequest) super.clone();
  }

}
