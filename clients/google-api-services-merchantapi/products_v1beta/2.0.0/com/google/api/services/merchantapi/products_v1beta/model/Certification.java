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

package com.google.api.services.merchantapi.products_v1beta.model;

/**
 * Product [certification](https://support.google.com/merchants/answer/13528839), initially
 * introduced for EU energy efficiency labeling compliance using the EU EPREL database.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Merchant API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Certification extends com.google.api.client.json.GenericJson {

  /**
   * The certification authority, for example "European_Commission". Maximum length is 2000
   * characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String certificationAuthority;

  /**
   * The certification code. Maximum length is 2000 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String certificationCode;

  /**
   * The name of the certification, for example "EPREL". Maximum length is 2000 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String certificationName;

  /**
   * The certification value (also known as class, level or grade), for example "A+", "C", "gold".
   * Maximum length is 2000 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String certificationValue;

  /**
   * The certification authority, for example "European_Commission". Maximum length is 2000
   * characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getCertificationAuthority() {
    return certificationAuthority;
  }

  /**
   * The certification authority, for example "European_Commission". Maximum length is 2000
   * characters.
   * @param certificationAuthority certificationAuthority or {@code null} for none
   */
  public Certification setCertificationAuthority(java.lang.String certificationAuthority) {
    this.certificationAuthority = certificationAuthority;
    return this;
  }

  /**
   * The certification code. Maximum length is 2000 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getCertificationCode() {
    return certificationCode;
  }

  /**
   * The certification code. Maximum length is 2000 characters.
   * @param certificationCode certificationCode or {@code null} for none
   */
  public Certification setCertificationCode(java.lang.String certificationCode) {
    this.certificationCode = certificationCode;
    return this;
  }

  /**
   * The name of the certification, for example "EPREL". Maximum length is 2000 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getCertificationName() {
    return certificationName;
  }

  /**
   * The name of the certification, for example "EPREL". Maximum length is 2000 characters.
   * @param certificationName certificationName or {@code null} for none
   */
  public Certification setCertificationName(java.lang.String certificationName) {
    this.certificationName = certificationName;
    return this;
  }

  /**
   * The certification value (also known as class, level or grade), for example "A+", "C", "gold".
   * Maximum length is 2000 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getCertificationValue() {
    return certificationValue;
  }

  /**
   * The certification value (also known as class, level or grade), for example "A+", "C", "gold".
   * Maximum length is 2000 characters.
   * @param certificationValue certificationValue or {@code null} for none
   */
  public Certification setCertificationValue(java.lang.String certificationValue) {
    this.certificationValue = certificationValue;
    return this;
  }

  @Override
  public Certification set(String fieldName, Object value) {
    return (Certification) super.set(fieldName, value);
  }

  @Override
  public Certification clone() {
    return (Certification) super.clone();
  }

}
