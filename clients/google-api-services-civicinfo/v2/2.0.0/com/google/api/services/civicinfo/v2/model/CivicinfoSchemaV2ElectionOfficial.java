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

package com.google.api.services.civicinfo.v2.model;

/**
 * Information about individual election officials.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Civic Information API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CivicinfoSchemaV2ElectionOfficial extends com.google.api.client.json.GenericJson {

  /**
   * The email address of the election official.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String emailAddress;

  /**
   * The fax number of the election official.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String faxNumber;

  /**
   * The full name of the election official.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The office phone number of the election official.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String officePhoneNumber;

  /**
   * The title of the election official.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The email address of the election official.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmailAddress() {
    return emailAddress;
  }

  /**
   * The email address of the election official.
   * @param emailAddress emailAddress or {@code null} for none
   */
  public CivicinfoSchemaV2ElectionOfficial setEmailAddress(java.lang.String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * The fax number of the election official.
   * @return value or {@code null} for none
   */
  public java.lang.String getFaxNumber() {
    return faxNumber;
  }

  /**
   * The fax number of the election official.
   * @param faxNumber faxNumber or {@code null} for none
   */
  public CivicinfoSchemaV2ElectionOfficial setFaxNumber(java.lang.String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

  /**
   * The full name of the election official.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The full name of the election official.
   * @param name name or {@code null} for none
   */
  public CivicinfoSchemaV2ElectionOfficial setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The office phone number of the election official.
   * @return value or {@code null} for none
   */
  public java.lang.String getOfficePhoneNumber() {
    return officePhoneNumber;
  }

  /**
   * The office phone number of the election official.
   * @param officePhoneNumber officePhoneNumber or {@code null} for none
   */
  public CivicinfoSchemaV2ElectionOfficial setOfficePhoneNumber(java.lang.String officePhoneNumber) {
    this.officePhoneNumber = officePhoneNumber;
    return this;
  }

  /**
   * The title of the election official.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of the election official.
   * @param title title or {@code null} for none
   */
  public CivicinfoSchemaV2ElectionOfficial setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public CivicinfoSchemaV2ElectionOfficial set(String fieldName, Object value) {
    return (CivicinfoSchemaV2ElectionOfficial) super.set(fieldName, value);
  }

  @Override
  public CivicinfoSchemaV2ElectionOfficial clone() {
    return (CivicinfoSchemaV2ElectionOfficial) super.clone();
  }

}
