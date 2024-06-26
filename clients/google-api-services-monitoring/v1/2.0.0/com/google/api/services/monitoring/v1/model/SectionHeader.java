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

package com.google.api.services.monitoring.v1.model;

/**
 * A widget that defines a new section header. Sections populate a table of contents and allow
 * easier navigation of long-form content.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SectionHeader extends com.google.api.client.json.GenericJson {

  /**
   * Whether to insert a divider below the section in the table of contents
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean dividerBelow;

  /**
   * The subtitle of the section
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subtitle;

  /**
   * Whether to insert a divider below the section in the table of contents
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDividerBelow() {
    return dividerBelow;
  }

  /**
   * Whether to insert a divider below the section in the table of contents
   * @param dividerBelow dividerBelow or {@code null} for none
   */
  public SectionHeader setDividerBelow(java.lang.Boolean dividerBelow) {
    this.dividerBelow = dividerBelow;
    return this;
  }

  /**
   * The subtitle of the section
   * @return value or {@code null} for none
   */
  public java.lang.String getSubtitle() {
    return subtitle;
  }

  /**
   * The subtitle of the section
   * @param subtitle subtitle or {@code null} for none
   */
  public SectionHeader setSubtitle(java.lang.String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

  @Override
  public SectionHeader set(String fieldName, Object value) {
    return (SectionHeader) super.set(fieldName, value);
  }

  @Override
  public SectionHeader clone() {
    return (SectionHeader) super.clone();
  }

}
