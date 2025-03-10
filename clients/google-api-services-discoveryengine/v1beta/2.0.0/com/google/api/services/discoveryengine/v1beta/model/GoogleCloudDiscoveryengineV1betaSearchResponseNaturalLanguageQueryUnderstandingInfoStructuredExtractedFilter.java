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

package com.google.api.services.discoveryengine.v1beta.model;

/**
 * The filters that were extracted from the input query represented in a structured form.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1betaSearchResponseNaturalLanguageQueryUnderstandingInfoStructuredExtractedFilter extends com.google.api.client.json.GenericJson {

  /**
   * The expression denoting the filter that was extracted from the input query in a structured
   * form. It can be a simple expression denoting a single string, numerical or geolocation
   * constraint or a compound expression which is a combination of multiple expressions connected
   * using logical (OR and AND) operators.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1betaSearchResponseNaturalLanguageQueryUnderstandingInfoStructuredExtractedFilterExpression expression;

  /**
   * The expression denoting the filter that was extracted from the input query in a structured
   * form. It can be a simple expression denoting a single string, numerical or geolocation
   * constraint or a compound expression which is a combination of multiple expressions connected
   * using logical (OR and AND) operators.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaSearchResponseNaturalLanguageQueryUnderstandingInfoStructuredExtractedFilterExpression getExpression() {
    return expression;
  }

  /**
   * The expression denoting the filter that was extracted from the input query in a structured
   * form. It can be a simple expression denoting a single string, numerical or geolocation
   * constraint or a compound expression which is a combination of multiple expressions connected
   * using logical (OR and AND) operators.
   * @param expression expression or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaSearchResponseNaturalLanguageQueryUnderstandingInfoStructuredExtractedFilter setExpression(GoogleCloudDiscoveryengineV1betaSearchResponseNaturalLanguageQueryUnderstandingInfoStructuredExtractedFilterExpression expression) {
    this.expression = expression;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1betaSearchResponseNaturalLanguageQueryUnderstandingInfoStructuredExtractedFilter set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1betaSearchResponseNaturalLanguageQueryUnderstandingInfoStructuredExtractedFilter) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1betaSearchResponseNaturalLanguageQueryUnderstandingInfoStructuredExtractedFilter clone() {
    return (GoogleCloudDiscoveryengineV1betaSearchResponseNaturalLanguageQueryUnderstandingInfoStructuredExtractedFilter) super.clone();
  }

}
