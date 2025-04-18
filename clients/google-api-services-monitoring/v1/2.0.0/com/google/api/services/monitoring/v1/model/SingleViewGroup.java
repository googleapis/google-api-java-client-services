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
 * A widget that groups the other widgets by using a dropdown menu. All widgets that are within the
 * area spanned by the grouping widget are considered member widgets.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SingleViewGroup extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Determines how the widget selector will be displayed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayType;

  /**
   * Optional. Determines how the widget selector will be displayed.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayType() {
    return displayType;
  }

  /**
   * Optional. Determines how the widget selector will be displayed.
   * @param displayType displayType or {@code null} for none
   */
  public SingleViewGroup setDisplayType(java.lang.String displayType) {
    this.displayType = displayType;
    return this;
  }

  @Override
  public SingleViewGroup set(String fieldName, Object value) {
    return (SingleViewGroup) super.set(fieldName, value);
  }

  @Override
  public SingleViewGroup clone() {
    return (SingleViewGroup) super.clone();
  }

}
