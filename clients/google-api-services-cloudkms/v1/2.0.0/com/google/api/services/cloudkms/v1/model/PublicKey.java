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

package com.google.api.services.cloudkms.v1.model;

/**
 * The public keys for a given CryptoKeyVersion. Obtained via GetPublicKey.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Key Management Service (KMS) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PublicKey extends com.google.api.client.json.GenericJson {

  /**
   * The Algorithm associated with this key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String algorithm;

  /**
   * The name of the CryptoKeyVersion public key. Provided here for verification. NOTE: This field
   * is in Beta.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The public key, encoded in PEM format. For more information, see the [RFC
   * 7468](https://tools.ietf.org/html/rfc7468) sections for [General
   * Considerations](https://tools.ietf.org/html/rfc7468#section-2) and [Textual Encoding of Subject
   * Public Key Info] (https://tools.ietf.org/html/rfc7468#section-13).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pem;

  /**
   * Integrity verification field. A CRC32C checksum of the returned PublicKey.pem. An integrity
   * check of PublicKey.pem can be performed by computing the CRC32C checksum of PublicKey.pem and
   * comparing your results to this field. Discard the response in case of non-matching checksum
   * values, and perform a limited number of retries. A persistent mismatch may indicate an issue in
   * your computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of
   * compatibility across different languages. However, it is a non-negative integer, which will
   * never exceed `2^32-1`, and can be safely downconverted to uint32 in languages that support this
   * type. NOTE: This field is in Beta.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long pemCrc32c;

  /**
   * The ProtectionLevel of the CryptoKeyVersion public key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String protectionLevel;

  /**
   * This field contains the public key (with integrity verification), formatted according to the
   * public_key_format field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ChecksummedData publicKey;

  /**
   * The PublicKey format specified by the customer through the public_key_format field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String publicKeyFormat;

  /**
   * The Algorithm associated with this key.
   * @return value or {@code null} for none
   */
  public java.lang.String getAlgorithm() {
    return algorithm;
  }

  /**
   * The Algorithm associated with this key.
   * @param algorithm algorithm or {@code null} for none
   */
  public PublicKey setAlgorithm(java.lang.String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

  /**
   * The name of the CryptoKeyVersion public key. Provided here for verification. NOTE: This field
   * is in Beta.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the CryptoKeyVersion public key. Provided here for verification. NOTE: This field
   * is in Beta.
   * @param name name or {@code null} for none
   */
  public PublicKey setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The public key, encoded in PEM format. For more information, see the [RFC
   * 7468](https://tools.ietf.org/html/rfc7468) sections for [General
   * Considerations](https://tools.ietf.org/html/rfc7468#section-2) and [Textual Encoding of Subject
   * Public Key Info] (https://tools.ietf.org/html/rfc7468#section-13).
   * @return value or {@code null} for none
   */
  public java.lang.String getPem() {
    return pem;
  }

  /**
   * The public key, encoded in PEM format. For more information, see the [RFC
   * 7468](https://tools.ietf.org/html/rfc7468) sections for [General
   * Considerations](https://tools.ietf.org/html/rfc7468#section-2) and [Textual Encoding of Subject
   * Public Key Info] (https://tools.ietf.org/html/rfc7468#section-13).
   * @param pem pem or {@code null} for none
   */
  public PublicKey setPem(java.lang.String pem) {
    this.pem = pem;
    return this;
  }

  /**
   * Integrity verification field. A CRC32C checksum of the returned PublicKey.pem. An integrity
   * check of PublicKey.pem can be performed by computing the CRC32C checksum of PublicKey.pem and
   * comparing your results to this field. Discard the response in case of non-matching checksum
   * values, and perform a limited number of retries. A persistent mismatch may indicate an issue in
   * your computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of
   * compatibility across different languages. However, it is a non-negative integer, which will
   * never exceed `2^32-1`, and can be safely downconverted to uint32 in languages that support this
   * type. NOTE: This field is in Beta.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPemCrc32c() {
    return pemCrc32c;
  }

  /**
   * Integrity verification field. A CRC32C checksum of the returned PublicKey.pem. An integrity
   * check of PublicKey.pem can be performed by computing the CRC32C checksum of PublicKey.pem and
   * comparing your results to this field. Discard the response in case of non-matching checksum
   * values, and perform a limited number of retries. A persistent mismatch may indicate an issue in
   * your computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of
   * compatibility across different languages. However, it is a non-negative integer, which will
   * never exceed `2^32-1`, and can be safely downconverted to uint32 in languages that support this
   * type. NOTE: This field is in Beta.
   * @param pemCrc32c pemCrc32c or {@code null} for none
   */
  public PublicKey setPemCrc32c(java.lang.Long pemCrc32c) {
    this.pemCrc32c = pemCrc32c;
    return this;
  }

  /**
   * The ProtectionLevel of the CryptoKeyVersion public key.
   * @return value or {@code null} for none
   */
  public java.lang.String getProtectionLevel() {
    return protectionLevel;
  }

  /**
   * The ProtectionLevel of the CryptoKeyVersion public key.
   * @param protectionLevel protectionLevel or {@code null} for none
   */
  public PublicKey setProtectionLevel(java.lang.String protectionLevel) {
    this.protectionLevel = protectionLevel;
    return this;
  }

  /**
   * This field contains the public key (with integrity verification), formatted according to the
   * public_key_format field.
   * @return value or {@code null} for none
   */
  public ChecksummedData getPublicKey() {
    return publicKey;
  }

  /**
   * This field contains the public key (with integrity verification), formatted according to the
   * public_key_format field.
   * @param publicKey publicKey or {@code null} for none
   */
  public PublicKey setPublicKey(ChecksummedData publicKey) {
    this.publicKey = publicKey;
    return this;
  }

  /**
   * The PublicKey format specified by the customer through the public_key_format field.
   * @return value or {@code null} for none
   */
  public java.lang.String getPublicKeyFormat() {
    return publicKeyFormat;
  }

  /**
   * The PublicKey format specified by the customer through the public_key_format field.
   * @param publicKeyFormat publicKeyFormat or {@code null} for none
   */
  public PublicKey setPublicKeyFormat(java.lang.String publicKeyFormat) {
    this.publicKeyFormat = publicKeyFormat;
    return this;
  }

  @Override
  public PublicKey set(String fieldName, Object value) {
    return (PublicKey) super.set(fieldName, value);
  }

  @Override
  public PublicKey clone() {
    return (PublicKey) super.clone();
  }

}
