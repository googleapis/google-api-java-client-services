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

package com.google.api.services.aiplatform.v1beta1.model;

/**
 * Google Distributed Cloud (GDC) config.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1GdcConfig extends com.google.api.client.json.GenericJson {

  /**
   * GDC zone. A cluster will be designated for the Vertex AI workload in this zone.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * GDC zone. A cluster will be designated for the Vertex AI workload in this zone.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * GDC zone. A cluster will be designated for the Vertex AI workload in this zone.
   * @param zone zone or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1GdcConfig setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1GdcConfig set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1GdcConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1GdcConfig clone() {
    return (GoogleCloudAiplatformV1beta1GdcConfig) super.clone();
  }

}
