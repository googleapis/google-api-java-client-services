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

package com.google.api.services.gkehub.v2beta.model;

/**
 * BundleInstallSpec is the specification configuration for a single managed bundle.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PolicyControllerBundleInstallSpec extends com.google.api.client.json.GenericJson {

  /**
   * the set of namespaces to be exempted from the bundle
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> exemptedNamespaces;

  /**
   * the set of namespaces to be exempted from the bundle
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExemptedNamespaces() {
    return exemptedNamespaces;
  }

  /**
   * the set of namespaces to be exempted from the bundle
   * @param exemptedNamespaces exemptedNamespaces or {@code null} for none
   */
  public PolicyControllerBundleInstallSpec setExemptedNamespaces(java.util.List<java.lang.String> exemptedNamespaces) {
    this.exemptedNamespaces = exemptedNamespaces;
    return this;
  }

  @Override
  public PolicyControllerBundleInstallSpec set(String fieldName, Object value) {
    return (PolicyControllerBundleInstallSpec) super.set(fieldName, value);
  }

  @Override
  public PolicyControllerBundleInstallSpec clone() {
    return (PolicyControllerBundleInstallSpec) super.clone();
  }

}
