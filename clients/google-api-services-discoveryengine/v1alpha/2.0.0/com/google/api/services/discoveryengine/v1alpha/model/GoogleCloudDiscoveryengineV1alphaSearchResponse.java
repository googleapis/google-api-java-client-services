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

package com.google.api.services.discoveryengine.v1alpha.model;

/**
 * Response message for SearchService.Search method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1alphaSearchResponse extends com.google.api.client.json.GenericJson {

  /**
   * Controls applied as part of the Control service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> appliedControls;

  /**
   * A unique search token. This should be included in the UserEvent logs resulting from this
   * search, which enables accurate attribution of search model performance. This also helps to
   * identify a request during the customer support scenarios.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String attributionToken;

  /**
   * Contains the spell corrected query, if found. If the spell correction type is AUTOMATIC, then
   * the search results are based on corrected_query. Otherwise the original query is used for
   * search.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String correctedQuery;

  /**
   * Results of facets requested by user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDiscoveryengineV1alphaSearchResponseFacet> facets;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDiscoveryengineV1alphaSearchResponseGeoSearchDebugInfo> geoSearchDebugInfo;

  /**
   * Guided search result.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaSearchResponseGuidedSearchResult guidedSearchResult;

  /**
   * Natural language query understanding information for the returned results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaSearchResponseNaturalLanguageQueryUnderstandingInfo naturalLanguageQueryUnderstandingInfo;

  /**
   * A token that can be sent as SearchRequest.page_token to retrieve the next page. If this field
   * is omitted, there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A list of One Box results. There can be multiple One Box results of different types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDiscoveryengineV1alphaSearchResponseOneBoxResult> oneBoxResults;

  /**
   * Query expansion information for the returned results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaSearchResponseQueryExpansionInfo queryExpansionInfo;

  /**
   * The URI of a customer-defined redirect page. If redirect action is triggered, no search is
   * performed, and only redirect_uri and attribution_token are set in the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String redirectUri;

  /**
   * A list of matched documents. The order represents the ranking.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDiscoveryengineV1alphaSearchResponseSearchResult> results;

  /**
   * Promotions for site search.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDiscoveryengineV1alphaSearchLinkPromotion> searchLinkPromotions;

  static {
    // hack to force ProGuard to consider GoogleCloudDiscoveryengineV1alphaSearchLinkPromotion used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDiscoveryengineV1alphaSearchLinkPromotion.class);
  }

  /**
   * Session information. Only set if SearchRequest.session is provided. See its description for
   * more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaSearchResponseSessionInfo sessionInfo;

  /**
   * Corrected query with low confidence, AKA did you mean query. Compared with corrected_query,
   * this field is set when SpellCorrector returned a response, but FPR(full page replacement) is
   * not triggered because the corrction is of low confidence(eg, reversed because there are matches
   * of the original query in document corpus).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String suggestedQuery;

  /**
   * A summary as part of the search results. This field is only returned if
   * SearchRequest.ContentSearchSpec.summary_spec is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaSearchResponseSummary summary;

  /**
   * The estimated total count of matched items irrespective of pagination. The count of results
   * returned by pagination may be less than the total_size that matches.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalSize;

  /**
   * Controls applied as part of the Control service.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAppliedControls() {
    return appliedControls;
  }

  /**
   * Controls applied as part of the Control service.
   * @param appliedControls appliedControls or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchResponse setAppliedControls(java.util.List<java.lang.String> appliedControls) {
    this.appliedControls = appliedControls;
    return this;
  }

  /**
   * A unique search token. This should be included in the UserEvent logs resulting from this
   * search, which enables accurate attribution of search model performance. This also helps to
   * identify a request during the customer support scenarios.
   * @return value or {@code null} for none
   */
  public java.lang.String getAttributionToken() {
    return attributionToken;
  }

  /**
   * A unique search token. This should be included in the UserEvent logs resulting from this
   * search, which enables accurate attribution of search model performance. This also helps to
   * identify a request during the customer support scenarios.
   * @param attributionToken attributionToken or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchResponse setAttributionToken(java.lang.String attributionToken) {
    this.attributionToken = attributionToken;
    return this;
  }

  /**
   * Contains the spell corrected query, if found. If the spell correction type is AUTOMATIC, then
   * the search results are based on corrected_query. Otherwise the original query is used for
   * search.
   * @return value or {@code null} for none
   */
  public java.lang.String getCorrectedQuery() {
    return correctedQuery;
  }

  /**
   * Contains the spell corrected query, if found. If the spell correction type is AUTOMATIC, then
   * the search results are based on corrected_query. Otherwise the original query is used for
   * search.
   * @param correctedQuery correctedQuery or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchResponse setCorrectedQuery(java.lang.String correctedQuery) {
    this.correctedQuery = correctedQuery;
    return this;
  }

  /**
   * Results of facets requested by user.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDiscoveryengineV1alphaSearchResponseFacet> getFacets() {
    return facets;
  }

  /**
   * Results of facets requested by user.
   * @param facets facets or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchResponse setFacets(java.util.List<GoogleCloudDiscoveryengineV1alphaSearchResponseFacet> facets) {
    this.facets = facets;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDiscoveryengineV1alphaSearchResponseGeoSearchDebugInfo> getGeoSearchDebugInfo() {
    return geoSearchDebugInfo;
  }

  /**
   * @param geoSearchDebugInfo geoSearchDebugInfo or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchResponse setGeoSearchDebugInfo(java.util.List<GoogleCloudDiscoveryengineV1alphaSearchResponseGeoSearchDebugInfo> geoSearchDebugInfo) {
    this.geoSearchDebugInfo = geoSearchDebugInfo;
    return this;
  }

  /**
   * Guided search result.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchResponseGuidedSearchResult getGuidedSearchResult() {
    return guidedSearchResult;
  }

  /**
   * Guided search result.
   * @param guidedSearchResult guidedSearchResult or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchResponse setGuidedSearchResult(GoogleCloudDiscoveryengineV1alphaSearchResponseGuidedSearchResult guidedSearchResult) {
    this.guidedSearchResult = guidedSearchResult;
    return this;
  }

  /**
   * Natural language query understanding information for the returned results.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchResponseNaturalLanguageQueryUnderstandingInfo getNaturalLanguageQueryUnderstandingInfo() {
    return naturalLanguageQueryUnderstandingInfo;
  }

  /**
   * Natural language query understanding information for the returned results.
   * @param naturalLanguageQueryUnderstandingInfo naturalLanguageQueryUnderstandingInfo or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchResponse setNaturalLanguageQueryUnderstandingInfo(GoogleCloudDiscoveryengineV1alphaSearchResponseNaturalLanguageQueryUnderstandingInfo naturalLanguageQueryUnderstandingInfo) {
    this.naturalLanguageQueryUnderstandingInfo = naturalLanguageQueryUnderstandingInfo;
    return this;
  }

  /**
   * A token that can be sent as SearchRequest.page_token to retrieve the next page. If this field
   * is omitted, there are no subsequent pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token that can be sent as SearchRequest.page_token to retrieve the next page. If this field
   * is omitted, there are no subsequent pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * A list of One Box results. There can be multiple One Box results of different types.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDiscoveryengineV1alphaSearchResponseOneBoxResult> getOneBoxResults() {
    return oneBoxResults;
  }

  /**
   * A list of One Box results. There can be multiple One Box results of different types.
   * @param oneBoxResults oneBoxResults or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchResponse setOneBoxResults(java.util.List<GoogleCloudDiscoveryengineV1alphaSearchResponseOneBoxResult> oneBoxResults) {
    this.oneBoxResults = oneBoxResults;
    return this;
  }

  /**
   * Query expansion information for the returned results.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchResponseQueryExpansionInfo getQueryExpansionInfo() {
    return queryExpansionInfo;
  }

  /**
   * Query expansion information for the returned results.
   * @param queryExpansionInfo queryExpansionInfo or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchResponse setQueryExpansionInfo(GoogleCloudDiscoveryengineV1alphaSearchResponseQueryExpansionInfo queryExpansionInfo) {
    this.queryExpansionInfo = queryExpansionInfo;
    return this;
  }

  /**
   * The URI of a customer-defined redirect page. If redirect action is triggered, no search is
   * performed, and only redirect_uri and attribution_token are set in the response.
   * @return value or {@code null} for none
   */
  public java.lang.String getRedirectUri() {
    return redirectUri;
  }

  /**
   * The URI of a customer-defined redirect page. If redirect action is triggered, no search is
   * performed, and only redirect_uri and attribution_token are set in the response.
   * @param redirectUri redirectUri or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchResponse setRedirectUri(java.lang.String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  /**
   * A list of matched documents. The order represents the ranking.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDiscoveryengineV1alphaSearchResponseSearchResult> getResults() {
    return results;
  }

  /**
   * A list of matched documents. The order represents the ranking.
   * @param results results or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchResponse setResults(java.util.List<GoogleCloudDiscoveryengineV1alphaSearchResponseSearchResult> results) {
    this.results = results;
    return this;
  }

  /**
   * Promotions for site search.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDiscoveryengineV1alphaSearchLinkPromotion> getSearchLinkPromotions() {
    return searchLinkPromotions;
  }

  /**
   * Promotions for site search.
   * @param searchLinkPromotions searchLinkPromotions or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchResponse setSearchLinkPromotions(java.util.List<GoogleCloudDiscoveryengineV1alphaSearchLinkPromotion> searchLinkPromotions) {
    this.searchLinkPromotions = searchLinkPromotions;
    return this;
  }

  /**
   * Session information. Only set if SearchRequest.session is provided. See its description for
   * more details.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchResponseSessionInfo getSessionInfo() {
    return sessionInfo;
  }

  /**
   * Session information. Only set if SearchRequest.session is provided. See its description for
   * more details.
   * @param sessionInfo sessionInfo or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchResponse setSessionInfo(GoogleCloudDiscoveryengineV1alphaSearchResponseSessionInfo sessionInfo) {
    this.sessionInfo = sessionInfo;
    return this;
  }

  /**
   * Corrected query with low confidence, AKA did you mean query. Compared with corrected_query,
   * this field is set when SpellCorrector returned a response, but FPR(full page replacement) is
   * not triggered because the corrction is of low confidence(eg, reversed because there are matches
   * of the original query in document corpus).
   * @return value or {@code null} for none
   */
  public java.lang.String getSuggestedQuery() {
    return suggestedQuery;
  }

  /**
   * Corrected query with low confidence, AKA did you mean query. Compared with corrected_query,
   * this field is set when SpellCorrector returned a response, but FPR(full page replacement) is
   * not triggered because the corrction is of low confidence(eg, reversed because there are matches
   * of the original query in document corpus).
   * @param suggestedQuery suggestedQuery or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchResponse setSuggestedQuery(java.lang.String suggestedQuery) {
    this.suggestedQuery = suggestedQuery;
    return this;
  }

  /**
   * A summary as part of the search results. This field is only returned if
   * SearchRequest.ContentSearchSpec.summary_spec is set.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchResponseSummary getSummary() {
    return summary;
  }

  /**
   * A summary as part of the search results. This field is only returned if
   * SearchRequest.ContentSearchSpec.summary_spec is set.
   * @param summary summary or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchResponse setSummary(GoogleCloudDiscoveryengineV1alphaSearchResponseSummary summary) {
    this.summary = summary;
    return this;
  }

  /**
   * The estimated total count of matched items irrespective of pagination. The count of results
   * returned by pagination may be less than the total_size that matches.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalSize() {
    return totalSize;
  }

  /**
   * The estimated total count of matched items irrespective of pagination. The count of results
   * returned by pagination may be less than the total_size that matches.
   * @param totalSize totalSize or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchResponse setTotalSize(java.lang.Integer totalSize) {
    this.totalSize = totalSize;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaSearchResponse set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1alphaSearchResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaSearchResponse clone() {
    return (GoogleCloudDiscoveryengineV1alphaSearchResponse) super.clone();
  }

}
