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

package com.google.api.services.backupdr.v1.model;

/**
 * Response message for List BackupPlanAssociation
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Backup and DR Service API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListBackupPlanAssociationsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The list of Backup Plan Associations in the project for the specified location. If the
   * `{location}` value in the request is "-", the response contains a list of instances from all
   * locations. In case any location is unreachable, the response will only return backup plan
   * associations in reachable locations and the 'unreachable' field will be populated with a list
   * of unreachable locations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BackupPlanAssociation> backupPlanAssociations;

  static {
    // hack to force ProGuard to consider BackupPlanAssociation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(BackupPlanAssociation.class);
  }

  /**
   * A token identifying a page of results the server should return.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Locations that could not be reached.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> unreachable;

  /**
   * The list of Backup Plan Associations in the project for the specified location. If the
   * `{location}` value in the request is "-", the response contains a list of instances from all
   * locations. In case any location is unreachable, the response will only return backup plan
   * associations in reachable locations and the 'unreachable' field will be populated with a list
   * of unreachable locations.
   * @return value or {@code null} for none
   */
  public java.util.List<BackupPlanAssociation> getBackupPlanAssociations() {
    return backupPlanAssociations;
  }

  /**
   * The list of Backup Plan Associations in the project for the specified location. If the
   * `{location}` value in the request is "-", the response contains a list of instances from all
   * locations. In case any location is unreachable, the response will only return backup plan
   * associations in reachable locations and the 'unreachable' field will be populated with a list
   * of unreachable locations.
   * @param backupPlanAssociations backupPlanAssociations or {@code null} for none
   */
  public ListBackupPlanAssociationsResponse setBackupPlanAssociations(java.util.List<BackupPlanAssociation> backupPlanAssociations) {
    this.backupPlanAssociations = backupPlanAssociations;
    return this;
  }

  /**
   * A token identifying a page of results the server should return.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token identifying a page of results the server should return.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListBackupPlanAssociationsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Locations that could not be reached.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUnreachable() {
    return unreachable;
  }

  /**
   * Locations that could not be reached.
   * @param unreachable unreachable or {@code null} for none
   */
  public ListBackupPlanAssociationsResponse setUnreachable(java.util.List<java.lang.String> unreachable) {
    this.unreachable = unreachable;
    return this;
  }

  @Override
  public ListBackupPlanAssociationsResponse set(String fieldName, Object value) {
    return (ListBackupPlanAssociationsResponse) super.set(fieldName, value);
  }

  @Override
  public ListBackupPlanAssociationsResponse clone() {
    return (ListBackupPlanAssociationsResponse) super.clone();
  }

}
