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
 * Groups a time series query definition.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PieChartDataSet extends com.google.api.client.json.GenericJson {

  /**
   * A dimension is a structured label, class, or category for a set of measurements in your data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Dimension> dimensions;

  static {
    // hack to force ProGuard to consider Dimension used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Dimension.class);
  }

  /**
   * A measure is a measured value of a property in your data. For example, rainfall in inches,
   * number of units sold, revenue gained, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Measure> measures;

  static {
    // hack to force ProGuard to consider Measure used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Measure.class);
  }

  /**
   * Optional. The lower bound on data point frequency for this data set, implemented by specifying
   * the minimum alignment period to use in a time series query. For example, if the data is
   * published once every 10 minutes, the min_alignment_period should be at least 10 minutes. It
   * would not make sense to fetch and align data at one minute intervals.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String minAlignmentPeriod;

  /**
   * Optional. A template for the name of the slice. This name will be displayed in the legend and
   * the tooltip of the pie chart. It replaces the auto-generated names for the slices. For example,
   * if the template is set to ${resource.labels.zone}, the zone's value will be used for the name
   * instead of the default name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sliceNameTemplate;

  /**
   * Required. The query for the PieChart. See, google.monitoring.dashboard.v1.TimeSeriesQuery.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeSeriesQuery timeSeriesQuery;

  /**
   * A dimension is a structured label, class, or category for a set of measurements in your data.
   * @return value or {@code null} for none
   */
  public java.util.List<Dimension> getDimensions() {
    return dimensions;
  }

  /**
   * A dimension is a structured label, class, or category for a set of measurements in your data.
   * @param dimensions dimensions or {@code null} for none
   */
  public PieChartDataSet setDimensions(java.util.List<Dimension> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  /**
   * A measure is a measured value of a property in your data. For example, rainfall in inches,
   * number of units sold, revenue gained, etc.
   * @return value or {@code null} for none
   */
  public java.util.List<Measure> getMeasures() {
    return measures;
  }

  /**
   * A measure is a measured value of a property in your data. For example, rainfall in inches,
   * number of units sold, revenue gained, etc.
   * @param measures measures or {@code null} for none
   */
  public PieChartDataSet setMeasures(java.util.List<Measure> measures) {
    this.measures = measures;
    return this;
  }

  /**
   * Optional. The lower bound on data point frequency for this data set, implemented by specifying
   * the minimum alignment period to use in a time series query. For example, if the data is
   * published once every 10 minutes, the min_alignment_period should be at least 10 minutes. It
   * would not make sense to fetch and align data at one minute intervals.
   * @return value or {@code null} for none
   */
  public String getMinAlignmentPeriod() {
    return minAlignmentPeriod;
  }

  /**
   * Optional. The lower bound on data point frequency for this data set, implemented by specifying
   * the minimum alignment period to use in a time series query. For example, if the data is
   * published once every 10 minutes, the min_alignment_period should be at least 10 minutes. It
   * would not make sense to fetch and align data at one minute intervals.
   * @param minAlignmentPeriod minAlignmentPeriod or {@code null} for none
   */
  public PieChartDataSet setMinAlignmentPeriod(String minAlignmentPeriod) {
    this.minAlignmentPeriod = minAlignmentPeriod;
    return this;
  }

  /**
   * Optional. A template for the name of the slice. This name will be displayed in the legend and
   * the tooltip of the pie chart. It replaces the auto-generated names for the slices. For example,
   * if the template is set to ${resource.labels.zone}, the zone's value will be used for the name
   * instead of the default name.
   * @return value or {@code null} for none
   */
  public java.lang.String getSliceNameTemplate() {
    return sliceNameTemplate;
  }

  /**
   * Optional. A template for the name of the slice. This name will be displayed in the legend and
   * the tooltip of the pie chart. It replaces the auto-generated names for the slices. For example,
   * if the template is set to ${resource.labels.zone}, the zone's value will be used for the name
   * instead of the default name.
   * @param sliceNameTemplate sliceNameTemplate or {@code null} for none
   */
  public PieChartDataSet setSliceNameTemplate(java.lang.String sliceNameTemplate) {
    this.sliceNameTemplate = sliceNameTemplate;
    return this;
  }

  /**
   * Required. The query for the PieChart. See, google.monitoring.dashboard.v1.TimeSeriesQuery.
   * @return value or {@code null} for none
   */
  public TimeSeriesQuery getTimeSeriesQuery() {
    return timeSeriesQuery;
  }

  /**
   * Required. The query for the PieChart. See, google.monitoring.dashboard.v1.TimeSeriesQuery.
   * @param timeSeriesQuery timeSeriesQuery or {@code null} for none
   */
  public PieChartDataSet setTimeSeriesQuery(TimeSeriesQuery timeSeriesQuery) {
    this.timeSeriesQuery = timeSeriesQuery;
    return this;
  }

  @Override
  public PieChartDataSet set(String fieldName, Object value) {
    return (PieChartDataSet) super.set(fieldName, value);
  }

  @Override
  public PieChartDataSet clone() {
    return (PieChartDataSet) super.clone();
  }

}
