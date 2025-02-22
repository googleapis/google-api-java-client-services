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

package com.google.api.services.dfareporting.model;

/**
 * Represents a response to the queryCompatibleFields method. Next ID: 10
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Campaign Manager 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CompatibleFields extends com.google.api.client.json.GenericJson {

  /**
   * Contains items that are compatible to be selected for a report of type "CROSS_DIMENSION_REACH".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CrossDimensionReachReportCompatibleFields crossDimensionReachReportCompatibleFields;

  /**
   * Contains items that are compatible to be selected for a report of type "CROSS_MEDIA_REACH".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CrossMediaReachReportCompatibleFields crossMediaReachReportCompatibleFields;

  /**
   * Contains items that are compatible to be selected for a report of type "FLOODLIGHT".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FloodlightReportCompatibleFields floodlightReportCompatibleFields;

  /**
   * The kind of resource this is, in this case dfareporting#compatibleFields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Contains items that are compatible to be selected for a report of type "PATH_TO_CONVERSION".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PathToConversionReportCompatibleFields pathToConversionReportCompatibleFields;

  /**
   * Contains items that are compatible to be selected for a report of type "REACH".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ReachReportCompatibleFields reachReportCompatibleFields;

  /**
   * Contains items that are compatible to be selected for a report of type "STANDARD".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ReportCompatibleFields reportCompatibleFields;

  /**
   * Contains items that are compatible to be selected for a report of type "CROSS_DIMENSION_REACH".
   * @return value or {@code null} for none
   */
  public CrossDimensionReachReportCompatibleFields getCrossDimensionReachReportCompatibleFields() {
    return crossDimensionReachReportCompatibleFields;
  }

  /**
   * Contains items that are compatible to be selected for a report of type "CROSS_DIMENSION_REACH".
   * @param crossDimensionReachReportCompatibleFields crossDimensionReachReportCompatibleFields or {@code null} for none
   */
  public CompatibleFields setCrossDimensionReachReportCompatibleFields(CrossDimensionReachReportCompatibleFields crossDimensionReachReportCompatibleFields) {
    this.crossDimensionReachReportCompatibleFields = crossDimensionReachReportCompatibleFields;
    return this;
  }

  /**
   * Contains items that are compatible to be selected for a report of type "CROSS_MEDIA_REACH".
   * @return value or {@code null} for none
   */
  public CrossMediaReachReportCompatibleFields getCrossMediaReachReportCompatibleFields() {
    return crossMediaReachReportCompatibleFields;
  }

  /**
   * Contains items that are compatible to be selected for a report of type "CROSS_MEDIA_REACH".
   * @param crossMediaReachReportCompatibleFields crossMediaReachReportCompatibleFields or {@code null} for none
   */
  public CompatibleFields setCrossMediaReachReportCompatibleFields(CrossMediaReachReportCompatibleFields crossMediaReachReportCompatibleFields) {
    this.crossMediaReachReportCompatibleFields = crossMediaReachReportCompatibleFields;
    return this;
  }

  /**
   * Contains items that are compatible to be selected for a report of type "FLOODLIGHT".
   * @return value or {@code null} for none
   */
  public FloodlightReportCompatibleFields getFloodlightReportCompatibleFields() {
    return floodlightReportCompatibleFields;
  }

  /**
   * Contains items that are compatible to be selected for a report of type "FLOODLIGHT".
   * @param floodlightReportCompatibleFields floodlightReportCompatibleFields or {@code null} for none
   */
  public CompatibleFields setFloodlightReportCompatibleFields(FloodlightReportCompatibleFields floodlightReportCompatibleFields) {
    this.floodlightReportCompatibleFields = floodlightReportCompatibleFields;
    return this;
  }

  /**
   * The kind of resource this is, in this case dfareporting#compatibleFields.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of resource this is, in this case dfareporting#compatibleFields.
   * @param kind kind or {@code null} for none
   */
  public CompatibleFields setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Contains items that are compatible to be selected for a report of type "PATH_TO_CONVERSION".
   * @return value or {@code null} for none
   */
  public PathToConversionReportCompatibleFields getPathToConversionReportCompatibleFields() {
    return pathToConversionReportCompatibleFields;
  }

  /**
   * Contains items that are compatible to be selected for a report of type "PATH_TO_CONVERSION".
   * @param pathToConversionReportCompatibleFields pathToConversionReportCompatibleFields or {@code null} for none
   */
  public CompatibleFields setPathToConversionReportCompatibleFields(PathToConversionReportCompatibleFields pathToConversionReportCompatibleFields) {
    this.pathToConversionReportCompatibleFields = pathToConversionReportCompatibleFields;
    return this;
  }

  /**
   * Contains items that are compatible to be selected for a report of type "REACH".
   * @return value or {@code null} for none
   */
  public ReachReportCompatibleFields getReachReportCompatibleFields() {
    return reachReportCompatibleFields;
  }

  /**
   * Contains items that are compatible to be selected for a report of type "REACH".
   * @param reachReportCompatibleFields reachReportCompatibleFields or {@code null} for none
   */
  public CompatibleFields setReachReportCompatibleFields(ReachReportCompatibleFields reachReportCompatibleFields) {
    this.reachReportCompatibleFields = reachReportCompatibleFields;
    return this;
  }

  /**
   * Contains items that are compatible to be selected for a report of type "STANDARD".
   * @return value or {@code null} for none
   */
  public ReportCompatibleFields getReportCompatibleFields() {
    return reportCompatibleFields;
  }

  /**
   * Contains items that are compatible to be selected for a report of type "STANDARD".
   * @param reportCompatibleFields reportCompatibleFields or {@code null} for none
   */
  public CompatibleFields setReportCompatibleFields(ReportCompatibleFields reportCompatibleFields) {
    this.reportCompatibleFields = reportCompatibleFields;
    return this;
  }

  @Override
  public CompatibleFields set(String fieldName, Object value) {
    return (CompatibleFields) super.set(fieldName, value);
  }

  @Override
  public CompatibleFields clone() {
    return (CompatibleFields) super.clone();
  }

}
