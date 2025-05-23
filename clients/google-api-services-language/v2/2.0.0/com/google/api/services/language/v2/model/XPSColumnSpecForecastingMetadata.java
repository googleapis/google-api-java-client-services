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
 * Model definition for XPSColumnSpecForecastingMetadata.
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
public final class XPSColumnSpecForecastingMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The type of the column for FORECASTING model training purposes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String columnType;

  /**
   * The type of the column for FORECASTING model training purposes.
   * @return value or {@code null} for none
   */
  public java.lang.String getColumnType() {
    return columnType;
  }

  /**
   * The type of the column for FORECASTING model training purposes.
   * @param columnType columnType or {@code null} for none
   */
  public XPSColumnSpecForecastingMetadata setColumnType(java.lang.String columnType) {
    this.columnType = columnType;
    return this;
  }

  @Override
  public XPSColumnSpecForecastingMetadata set(String fieldName, Object value) {
    return (XPSColumnSpecForecastingMetadata) super.set(fieldName, value);
  }

  @Override
  public XPSColumnSpecForecastingMetadata clone() {
    return (XPSColumnSpecForecastingMetadata) super.clone();
  }

}
