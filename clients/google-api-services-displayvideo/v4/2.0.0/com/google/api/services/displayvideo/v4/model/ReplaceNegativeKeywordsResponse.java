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

package com.google.api.services.displayvideo.v4.model;

/**
 * Response message for NegativeKeywordService.ReplaceNegativeKeywords.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReplaceNegativeKeywordsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The full list of negative keywords now present in the negative keyword list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NegativeKeyword> negativeKeywords;

  static {
    // hack to force ProGuard to consider NegativeKeyword used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(NegativeKeyword.class);
  }

  /**
   * The full list of negative keywords now present in the negative keyword list.
   * @return value or {@code null} for none
   */
  public java.util.List<NegativeKeyword> getNegativeKeywords() {
    return negativeKeywords;
  }

  /**
   * The full list of negative keywords now present in the negative keyword list.
   * @param negativeKeywords negativeKeywords or {@code null} for none
   */
  public ReplaceNegativeKeywordsResponse setNegativeKeywords(java.util.List<NegativeKeyword> negativeKeywords) {
    this.negativeKeywords = negativeKeywords;
    return this;
  }

  @Override
  public ReplaceNegativeKeywordsResponse set(String fieldName, Object value) {
    return (ReplaceNegativeKeywordsResponse) super.set(fieldName, value);
  }

  @Override
  public ReplaceNegativeKeywordsResponse clone() {
    return (ReplaceNegativeKeywordsResponse) super.clone();
  }

}
