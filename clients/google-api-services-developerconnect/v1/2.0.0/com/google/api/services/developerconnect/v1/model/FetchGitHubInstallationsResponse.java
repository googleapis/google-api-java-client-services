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

package com.google.api.services.developerconnect.v1.model;

/**
 * Response of fetching github installations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Developer Connect API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FetchGitHubInstallationsResponse extends com.google.api.client.json.GenericJson {

  /**
   * List of installations available to the OAuth user (for github.com) or all the installations
   * (for GitHub enterprise).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Installation> installations;

  /**
   * List of installations available to the OAuth user (for github.com) or all the installations
   * (for GitHub enterprise).
   * @return value or {@code null} for none
   */
  public java.util.List<Installation> getInstallations() {
    return installations;
  }

  /**
   * List of installations available to the OAuth user (for github.com) or all the installations
   * (for GitHub enterprise).
   * @param installations installations or {@code null} for none
   */
  public FetchGitHubInstallationsResponse setInstallations(java.util.List<Installation> installations) {
    this.installations = installations;
    return this;
  }

  @Override
  public FetchGitHubInstallationsResponse set(String fieldName, Object value) {
    return (FetchGitHubInstallationsResponse) super.set(fieldName, value);
  }

  @Override
  public FetchGitHubInstallationsResponse clone() {
    return (FetchGitHubInstallationsResponse) super.clone();
  }

}