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

package com.google.api.services.securitycenter.v1beta2.model;

/**
 * Represents an access event.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudSecuritycenterV2Access extends com.google.api.client.json.GenericJson {

  /**
   * Caller's IP address, such as "1.1.1.1".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String callerIp;

  /**
   * The caller IP's geolocation, which identifies where the call came from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudSecuritycenterV2Geolocation callerIpGeo;

  /**
   * The method that the service account called, e.g. "SetIamPolicy".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String methodName;

  /**
   * Associated email, such as "foo@google.com". The email address of the authenticated user or a
   * service account acting on behalf of a third party principal making the request. For third party
   * identity callers, the `principal_subject` field is populated instead of this field. For privacy
   * reasons, the principal email address is sometimes redacted. For more information, see [Caller
   * identities in audit logs](https://cloud.google.com/logging/docs/audit#user-id).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String principalEmail;

  /**
   * A string that represents the principal_subject that is associated with the identity. Unlike
   * `principal_email`, `principal_subject` supports principals that aren't associated with email
   * addresses, such as third party principals. For most identities, the format is
   * `principal://iam.googleapis.com/{identity pool name}/subject/{subject}`. Some GKE identities,
   * such as GKE_WORKLOAD, FREEFORM, and GKE_HUB_WORKLOAD, still use the legacy format
   * `serviceAccount:{identity pool name}[{subject}]`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String principalSubject;

  /**
   * The identity delegation history of an authenticated service account that made the request. The
   * `serviceAccountDelegationInfo[]` object contains information about the real authorities that
   * try to access Google Cloud resources by delegating on a service account. When multiple
   * authorities are present, they are guaranteed to be sorted based on the original ordering of the
   * identity delegation events.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudSecuritycenterV2ServiceAccountDelegationInfo> serviceAccountDelegationInfo;

  /**
   * The name of the service account key that was used to create or exchange credentials when
   * authenticating the service account that made the request. This is a scheme-less URI full
   * resource name. For example:
   * "//iam.googleapis.com/projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccountKeyName;

  /**
   * This is the API service that the service account made a call to, e.g. "iam.googleapis.com"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceName;

  /**
   * The caller's user agent string associated with the finding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userAgent;

  /**
   * Type of user agent associated with the finding. For example, an operating system shell or an
   * embedded or standalone application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userAgentFamily;

  /**
   * A string that represents a username. The username provided depends on the type of the finding
   * and is likely not an IAM principal. For example, this can be a system username if the finding
   * is related to a virtual machine, or it can be an application login username.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userName;

  /**
   * Caller's IP address, such as "1.1.1.1".
   * @return value or {@code null} for none
   */
  public java.lang.String getCallerIp() {
    return callerIp;
  }

  /**
   * Caller's IP address, such as "1.1.1.1".
   * @param callerIp callerIp or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Access setCallerIp(java.lang.String callerIp) {
    this.callerIp = callerIp;
    return this;
  }

  /**
   * The caller IP's geolocation, which identifies where the call came from.
   * @return value or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Geolocation getCallerIpGeo() {
    return callerIpGeo;
  }

  /**
   * The caller IP's geolocation, which identifies where the call came from.
   * @param callerIpGeo callerIpGeo or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Access setCallerIpGeo(GoogleCloudSecuritycenterV2Geolocation callerIpGeo) {
    this.callerIpGeo = callerIpGeo;
    return this;
  }

  /**
   * The method that the service account called, e.g. "SetIamPolicy".
   * @return value or {@code null} for none
   */
  public java.lang.String getMethodName() {
    return methodName;
  }

  /**
   * The method that the service account called, e.g. "SetIamPolicy".
   * @param methodName methodName or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Access setMethodName(java.lang.String methodName) {
    this.methodName = methodName;
    return this;
  }

  /**
   * Associated email, such as "foo@google.com". The email address of the authenticated user or a
   * service account acting on behalf of a third party principal making the request. For third party
   * identity callers, the `principal_subject` field is populated instead of this field. For privacy
   * reasons, the principal email address is sometimes redacted. For more information, see [Caller
   * identities in audit logs](https://cloud.google.com/logging/docs/audit#user-id).
   * @return value or {@code null} for none
   */
  public java.lang.String getPrincipalEmail() {
    return principalEmail;
  }

  /**
   * Associated email, such as "foo@google.com". The email address of the authenticated user or a
   * service account acting on behalf of a third party principal making the request. For third party
   * identity callers, the `principal_subject` field is populated instead of this field. For privacy
   * reasons, the principal email address is sometimes redacted. For more information, see [Caller
   * identities in audit logs](https://cloud.google.com/logging/docs/audit#user-id).
   * @param principalEmail principalEmail or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Access setPrincipalEmail(java.lang.String principalEmail) {
    this.principalEmail = principalEmail;
    return this;
  }

  /**
   * A string that represents the principal_subject that is associated with the identity. Unlike
   * `principal_email`, `principal_subject` supports principals that aren't associated with email
   * addresses, such as third party principals. For most identities, the format is
   * `principal://iam.googleapis.com/{identity pool name}/subject/{subject}`. Some GKE identities,
   * such as GKE_WORKLOAD, FREEFORM, and GKE_HUB_WORKLOAD, still use the legacy format
   * `serviceAccount:{identity pool name}[{subject}]`.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrincipalSubject() {
    return principalSubject;
  }

  /**
   * A string that represents the principal_subject that is associated with the identity. Unlike
   * `principal_email`, `principal_subject` supports principals that aren't associated with email
   * addresses, such as third party principals. For most identities, the format is
   * `principal://iam.googleapis.com/{identity pool name}/subject/{subject}`. Some GKE identities,
   * such as GKE_WORKLOAD, FREEFORM, and GKE_HUB_WORKLOAD, still use the legacy format
   * `serviceAccount:{identity pool name}[{subject}]`.
   * @param principalSubject principalSubject or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Access setPrincipalSubject(java.lang.String principalSubject) {
    this.principalSubject = principalSubject;
    return this;
  }

  /**
   * The identity delegation history of an authenticated service account that made the request. The
   * `serviceAccountDelegationInfo[]` object contains information about the real authorities that
   * try to access Google Cloud resources by delegating on a service account. When multiple
   * authorities are present, they are guaranteed to be sorted based on the original ordering of the
   * identity delegation events.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudSecuritycenterV2ServiceAccountDelegationInfo> getServiceAccountDelegationInfo() {
    return serviceAccountDelegationInfo;
  }

  /**
   * The identity delegation history of an authenticated service account that made the request. The
   * `serviceAccountDelegationInfo[]` object contains information about the real authorities that
   * try to access Google Cloud resources by delegating on a service account. When multiple
   * authorities are present, they are guaranteed to be sorted based on the original ordering of the
   * identity delegation events.
   * @param serviceAccountDelegationInfo serviceAccountDelegationInfo or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Access setServiceAccountDelegationInfo(java.util.List<GoogleCloudSecuritycenterV2ServiceAccountDelegationInfo> serviceAccountDelegationInfo) {
    this.serviceAccountDelegationInfo = serviceAccountDelegationInfo;
    return this;
  }

  /**
   * The name of the service account key that was used to create or exchange credentials when
   * authenticating the service account that made the request. This is a scheme-less URI full
   * resource name. For example:
   * "//iam.googleapis.com/projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}".
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccountKeyName() {
    return serviceAccountKeyName;
  }

  /**
   * The name of the service account key that was used to create or exchange credentials when
   * authenticating the service account that made the request. This is a scheme-less URI full
   * resource name. For example:
   * "//iam.googleapis.com/projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}".
   * @param serviceAccountKeyName serviceAccountKeyName or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Access setServiceAccountKeyName(java.lang.String serviceAccountKeyName) {
    this.serviceAccountKeyName = serviceAccountKeyName;
    return this;
  }

  /**
   * This is the API service that the service account made a call to, e.g. "iam.googleapis.com"
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceName() {
    return serviceName;
  }

  /**
   * This is the API service that the service account made a call to, e.g. "iam.googleapis.com"
   * @param serviceName serviceName or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Access setServiceName(java.lang.String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * The caller's user agent string associated with the finding.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserAgent() {
    return userAgent;
  }

  /**
   * The caller's user agent string associated with the finding.
   * @param userAgent userAgent or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Access setUserAgent(java.lang.String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  /**
   * Type of user agent associated with the finding. For example, an operating system shell or an
   * embedded or standalone application.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserAgentFamily() {
    return userAgentFamily;
  }

  /**
   * Type of user agent associated with the finding. For example, an operating system shell or an
   * embedded or standalone application.
   * @param userAgentFamily userAgentFamily or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Access setUserAgentFamily(java.lang.String userAgentFamily) {
    this.userAgentFamily = userAgentFamily;
    return this;
  }

  /**
   * A string that represents a username. The username provided depends on the type of the finding
   * and is likely not an IAM principal. For example, this can be a system username if the finding
   * is related to a virtual machine, or it can be an application login username.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserName() {
    return userName;
  }

  /**
   * A string that represents a username. The username provided depends on the type of the finding
   * and is likely not an IAM principal. For example, this can be a system username if the finding
   * is related to a virtual machine, or it can be an application login username.
   * @param userName userName or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Access setUserName(java.lang.String userName) {
    this.userName = userName;
    return this;
  }

  @Override
  public GoogleCloudSecuritycenterV2Access set(String fieldName, Object value) {
    return (GoogleCloudSecuritycenterV2Access) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudSecuritycenterV2Access clone() {
    return (GoogleCloudSecuritycenterV2Access) super.clone();
  }

}
