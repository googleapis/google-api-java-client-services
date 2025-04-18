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

package com.google.api.services.migrationcenter.v1alpha1.model;

/**
 * Hosts content.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Migration Center API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HostsEntryList extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Hosts entries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<HostsEntry> entries;

  static {
    // hack to force ProGuard to consider HostsEntry used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(HostsEntry.class);
  }

  /**
   * Output only. Hosts entries.
   * @return value or {@code null} for none
   */
  public java.util.List<HostsEntry> getEntries() {
    return entries;
  }

  /**
   * Output only. Hosts entries.
   * @param entries entries or {@code null} for none
   */
  public HostsEntryList setEntries(java.util.List<HostsEntry> entries) {
    this.entries = entries;
    return this;
  }

  @Override
  public HostsEntryList set(String fieldName, Object value) {
    return (HostsEntryList) super.set(fieldName, value);
  }

  @Override
  public HostsEntryList clone() {
    return (HostsEntryList) super.clone();
  }

}
