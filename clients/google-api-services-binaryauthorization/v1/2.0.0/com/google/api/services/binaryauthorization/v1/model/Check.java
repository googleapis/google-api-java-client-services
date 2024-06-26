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

package com.google.api.services.binaryauthorization.v1.model;

/**
 * A single check to perform against a Pod. Checks are grouped into `CheckSet` objects, which are
 * defined by the top-level policy.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Binary Authorization API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Check extends com.google.api.client.json.GenericJson {

  /**
   * Optional. A special-case check that always denies. Note that this still only applies when the
   * scope of the `CheckSet` applies and the image isn't exempted by an image allowlist. This check
   * is primarily useful for testing, or to set the default behavior for all unmatched scopes to
   * "deny".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean alwaysDeny;

  /**
   * Optional. A user-provided name for this check. This field has no effect on the policy
   * evaluation behavior except to improve readability of messages in evaluation results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Optional. Images exempted from this check. If any of the patterns match the image url, the
   * check will not be evaluated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ImageAllowlist imageAllowlist;

  /**
   * Optional. Require that an image is no older than a configured expiration time. Image age is
   * determined by its upload time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ImageFreshnessCheck imageFreshnessCheck;

  /**
   * Optional. Require that an image was signed by Cosign with a trusted key. This check requires
   * that both the image and signature are stored in Artifact Registry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SigstoreSignatureCheck sigstoreSignatureCheck;

  /**
   * Optional. Require a SimpleSigning-type attestation for every image in the deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SimpleSigningAttestationCheck simpleSigningAttestationCheck;

  /**
   * Optional. Require that an image was built by a trusted builder (such as Google Cloud Build),
   * meets requirements for Supply chain Levels for Software Artifacts (SLSA), and was built from a
   * trusted source code repostitory.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SlsaCheck slsaCheck;

  /**
   * Optional. Require that an image lives in a trusted directory.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TrustedDirectoryCheck trustedDirectoryCheck;

  /**
   * Optional. Require that an image does not contain vulnerabilities that violate the configured
   * rules, such as based on severity levels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VulnerabilityCheck vulnerabilityCheck;

  /**
   * Optional. A special-case check that always denies. Note that this still only applies when the
   * scope of the `CheckSet` applies and the image isn't exempted by an image allowlist. This check
   * is primarily useful for testing, or to set the default behavior for all unmatched scopes to
   * "deny".
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAlwaysDeny() {
    return alwaysDeny;
  }

  /**
   * Optional. A special-case check that always denies. Note that this still only applies when the
   * scope of the `CheckSet` applies and the image isn't exempted by an image allowlist. This check
   * is primarily useful for testing, or to set the default behavior for all unmatched scopes to
   * "deny".
   * @param alwaysDeny alwaysDeny or {@code null} for none
   */
  public Check setAlwaysDeny(java.lang.Boolean alwaysDeny) {
    this.alwaysDeny = alwaysDeny;
    return this;
  }

  /**
   * Optional. A user-provided name for this check. This field has no effect on the policy
   * evaluation behavior except to improve readability of messages in evaluation results.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Optional. A user-provided name for this check. This field has no effect on the policy
   * evaluation behavior except to improve readability of messages in evaluation results.
   * @param displayName displayName or {@code null} for none
   */
  public Check setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional. Images exempted from this check. If any of the patterns match the image url, the
   * check will not be evaluated.
   * @return value or {@code null} for none
   */
  public ImageAllowlist getImageAllowlist() {
    return imageAllowlist;
  }

  /**
   * Optional. Images exempted from this check. If any of the patterns match the image url, the
   * check will not be evaluated.
   * @param imageAllowlist imageAllowlist or {@code null} for none
   */
  public Check setImageAllowlist(ImageAllowlist imageAllowlist) {
    this.imageAllowlist = imageAllowlist;
    return this;
  }

  /**
   * Optional. Require that an image is no older than a configured expiration time. Image age is
   * determined by its upload time.
   * @return value or {@code null} for none
   */
  public ImageFreshnessCheck getImageFreshnessCheck() {
    return imageFreshnessCheck;
  }

  /**
   * Optional. Require that an image is no older than a configured expiration time. Image age is
   * determined by its upload time.
   * @param imageFreshnessCheck imageFreshnessCheck or {@code null} for none
   */
  public Check setImageFreshnessCheck(ImageFreshnessCheck imageFreshnessCheck) {
    this.imageFreshnessCheck = imageFreshnessCheck;
    return this;
  }

  /**
   * Optional. Require that an image was signed by Cosign with a trusted key. This check requires
   * that both the image and signature are stored in Artifact Registry.
   * @return value or {@code null} for none
   */
  public SigstoreSignatureCheck getSigstoreSignatureCheck() {
    return sigstoreSignatureCheck;
  }

  /**
   * Optional. Require that an image was signed by Cosign with a trusted key. This check requires
   * that both the image and signature are stored in Artifact Registry.
   * @param sigstoreSignatureCheck sigstoreSignatureCheck or {@code null} for none
   */
  public Check setSigstoreSignatureCheck(SigstoreSignatureCheck sigstoreSignatureCheck) {
    this.sigstoreSignatureCheck = sigstoreSignatureCheck;
    return this;
  }

  /**
   * Optional. Require a SimpleSigning-type attestation for every image in the deployment.
   * @return value or {@code null} for none
   */
  public SimpleSigningAttestationCheck getSimpleSigningAttestationCheck() {
    return simpleSigningAttestationCheck;
  }

  /**
   * Optional. Require a SimpleSigning-type attestation for every image in the deployment.
   * @param simpleSigningAttestationCheck simpleSigningAttestationCheck or {@code null} for none
   */
  public Check setSimpleSigningAttestationCheck(SimpleSigningAttestationCheck simpleSigningAttestationCheck) {
    this.simpleSigningAttestationCheck = simpleSigningAttestationCheck;
    return this;
  }

  /**
   * Optional. Require that an image was built by a trusted builder (such as Google Cloud Build),
   * meets requirements for Supply chain Levels for Software Artifacts (SLSA), and was built from a
   * trusted source code repostitory.
   * @return value or {@code null} for none
   */
  public SlsaCheck getSlsaCheck() {
    return slsaCheck;
  }

  /**
   * Optional. Require that an image was built by a trusted builder (such as Google Cloud Build),
   * meets requirements for Supply chain Levels for Software Artifacts (SLSA), and was built from a
   * trusted source code repostitory.
   * @param slsaCheck slsaCheck or {@code null} for none
   */
  public Check setSlsaCheck(SlsaCheck slsaCheck) {
    this.slsaCheck = slsaCheck;
    return this;
  }

  /**
   * Optional. Require that an image lives in a trusted directory.
   * @return value or {@code null} for none
   */
  public TrustedDirectoryCheck getTrustedDirectoryCheck() {
    return trustedDirectoryCheck;
  }

  /**
   * Optional. Require that an image lives in a trusted directory.
   * @param trustedDirectoryCheck trustedDirectoryCheck or {@code null} for none
   */
  public Check setTrustedDirectoryCheck(TrustedDirectoryCheck trustedDirectoryCheck) {
    this.trustedDirectoryCheck = trustedDirectoryCheck;
    return this;
  }

  /**
   * Optional. Require that an image does not contain vulnerabilities that violate the configured
   * rules, such as based on severity levels.
   * @return value or {@code null} for none
   */
  public VulnerabilityCheck getVulnerabilityCheck() {
    return vulnerabilityCheck;
  }

  /**
   * Optional. Require that an image does not contain vulnerabilities that violate the configured
   * rules, such as based on severity levels.
   * @param vulnerabilityCheck vulnerabilityCheck or {@code null} for none
   */
  public Check setVulnerabilityCheck(VulnerabilityCheck vulnerabilityCheck) {
    this.vulnerabilityCheck = vulnerabilityCheck;
    return this;
  }

  @Override
  public Check set(String fieldName, Object value) {
    return (Check) super.set(fieldName, value);
  }

  @Override
  public Check clone() {
    return (Check) super.clone();
  }

}
