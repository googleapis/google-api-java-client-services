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

package com.google.api.services.docs.v1.model;

/**
 * Replaces the contents of the specified NamedRange or NamedRanges with the given replacement
 * content. Note that an individual NamedRange may consist of multiple discontinuous ranges. In this
 * case, only the content in the first range will be replaced. The other ranges and their content
 * will be deleted. In cases where replacing or deleting any ranges would result in an invalid
 * document structure, a 400 bad request error is returned.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReplaceNamedRangeContentRequest extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the named range whose content will be replaced. If there is no named range with the
   * given ID a 400 bad request error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String namedRangeId;

  /**
   * The name of the NamedRanges whose content will be replaced. If there are multiple named ranges
   * with the given name, then the content of each one will be replaced. If there are no named
   * ranges with the given name, then the request will be a no-op.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String namedRangeName;

  /**
   * Optional. The criteria used to specify in which tabs the replacement occurs. When omitted, the
   * replacement applies to all tabs. In a document containing a single tab: - If provided, must
   * match the singular tab's ID. - If omitted, the replacement applies to the singular tab. In a
   * document containing multiple tabs: - If provided, the replacement applies to the specified
   * tabs. - If omitted, the replacement applies to all tabs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TabsCriteria tabsCriteria;

  /**
   * Replaces the content of the specified named range(s) with the given text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * The ID of the named range whose content will be replaced. If there is no named range with the
   * given ID a 400 bad request error is returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getNamedRangeId() {
    return namedRangeId;
  }

  /**
   * The ID of the named range whose content will be replaced. If there is no named range with the
   * given ID a 400 bad request error is returned.
   * @param namedRangeId namedRangeId or {@code null} for none
   */
  public ReplaceNamedRangeContentRequest setNamedRangeId(java.lang.String namedRangeId) {
    this.namedRangeId = namedRangeId;
    return this;
  }

  /**
   * The name of the NamedRanges whose content will be replaced. If there are multiple named ranges
   * with the given name, then the content of each one will be replaced. If there are no named
   * ranges with the given name, then the request will be a no-op.
   * @return value or {@code null} for none
   */
  public java.lang.String getNamedRangeName() {
    return namedRangeName;
  }

  /**
   * The name of the NamedRanges whose content will be replaced. If there are multiple named ranges
   * with the given name, then the content of each one will be replaced. If there are no named
   * ranges with the given name, then the request will be a no-op.
   * @param namedRangeName namedRangeName or {@code null} for none
   */
  public ReplaceNamedRangeContentRequest setNamedRangeName(java.lang.String namedRangeName) {
    this.namedRangeName = namedRangeName;
    return this;
  }

  /**
   * Optional. The criteria used to specify in which tabs the replacement occurs. When omitted, the
   * replacement applies to all tabs. In a document containing a single tab: - If provided, must
   * match the singular tab's ID. - If omitted, the replacement applies to the singular tab. In a
   * document containing multiple tabs: - If provided, the replacement applies to the specified
   * tabs. - If omitted, the replacement applies to all tabs.
   * @return value or {@code null} for none
   */
  public TabsCriteria getTabsCriteria() {
    return tabsCriteria;
  }

  /**
   * Optional. The criteria used to specify in which tabs the replacement occurs. When omitted, the
   * replacement applies to all tabs. In a document containing a single tab: - If provided, must
   * match the singular tab's ID. - If omitted, the replacement applies to the singular tab. In a
   * document containing multiple tabs: - If provided, the replacement applies to the specified
   * tabs. - If omitted, the replacement applies to all tabs.
   * @param tabsCriteria tabsCriteria or {@code null} for none
   */
  public ReplaceNamedRangeContentRequest setTabsCriteria(TabsCriteria tabsCriteria) {
    this.tabsCriteria = tabsCriteria;
    return this;
  }

  /**
   * Replaces the content of the specified named range(s) with the given text.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * Replaces the content of the specified named range(s) with the given text.
   * @param text text or {@code null} for none
   */
  public ReplaceNamedRangeContentRequest setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  @Override
  public ReplaceNamedRangeContentRequest set(String fieldName, Object value) {
    return (ReplaceNamedRangeContentRequest) super.set(fieldName, value);
  }

  @Override
  public ReplaceNamedRangeContentRequest clone() {
    return (ReplaceNamedRangeContentRequest) super.clone();
  }

}
