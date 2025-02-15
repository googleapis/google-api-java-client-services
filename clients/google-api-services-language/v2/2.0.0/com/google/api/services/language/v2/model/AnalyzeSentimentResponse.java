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

package com.google.api.services.language.v2.model;

/**
 * The sentiment analysis response message.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Natural Language API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AnalyzeSentimentResponse extends com.google.api.client.json.GenericJson {

  /**
   * The overall sentiment of the input document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Sentiment documentSentiment;

  /**
   * The language of the text, which will be the same as the language specified in the request or,
   * if not specified, the automatically-detected language. See Document.language_code field for
   * more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * Whether the language is officially supported. The API may still return a response when the
   * language is not supported, but it is on a best effort basis.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean languageSupported;

  /**
   * The sentiment for all the sentences in the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Sentence> sentences;

  /**
   * The overall sentiment of the input document.
   * @return value or {@code null} for none
   */
  public Sentiment getDocumentSentiment() {
    return documentSentiment;
  }

  /**
   * The overall sentiment of the input document.
   * @param documentSentiment documentSentiment or {@code null} for none
   */
  public AnalyzeSentimentResponse setDocumentSentiment(Sentiment documentSentiment) {
    this.documentSentiment = documentSentiment;
    return this;
  }

  /**
   * The language of the text, which will be the same as the language specified in the request or,
   * if not specified, the automatically-detected language. See Document.language_code field for
   * more details.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * The language of the text, which will be the same as the language specified in the request or,
   * if not specified, the automatically-detected language. See Document.language_code field for
   * more details.
   * @param languageCode languageCode or {@code null} for none
   */
  public AnalyzeSentimentResponse setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Whether the language is officially supported. The API may still return a response when the
   * language is not supported, but it is on a best effort basis.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLanguageSupported() {
    return languageSupported;
  }

  /**
   * Whether the language is officially supported. The API may still return a response when the
   * language is not supported, but it is on a best effort basis.
   * @param languageSupported languageSupported or {@code null} for none
   */
  public AnalyzeSentimentResponse setLanguageSupported(java.lang.Boolean languageSupported) {
    this.languageSupported = languageSupported;
    return this;
  }

  /**
   * The sentiment for all the sentences in the document.
   * @return value or {@code null} for none
   */
  public java.util.List<Sentence> getSentences() {
    return sentences;
  }

  /**
   * The sentiment for all the sentences in the document.
   * @param sentences sentences or {@code null} for none
   */
  public AnalyzeSentimentResponse setSentences(java.util.List<Sentence> sentences) {
    this.sentences = sentences;
    return this;
  }

  @Override
  public AnalyzeSentimentResponse set(String fieldName, Object value) {
    return (AnalyzeSentimentResponse) super.set(fieldName, value);
  }

  @Override
  public AnalyzeSentimentResponse clone() {
    return (AnalyzeSentimentResponse) super.clone();
  }

}
