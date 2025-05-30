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

package com.google.api.services.metastore.v1beta.model;

/**
 * Network configuration for the Dataproc Metastore service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataproc Metastore API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworkConfig extends com.google.api.client.json.GenericJson {

  /**
   * Immutable. The consumer-side network configuration for the Dataproc Metastore instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Consumer> consumers;

  static {
    // hack to force ProGuard to consider Consumer used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Consumer.class);
  }

  /**
   * Optional. Enables custom routes to be imported and exported for the Dataproc Metastore
   * service's peered VPC network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean customRoutesEnabled;

  /**
   * Immutable. The consumer-side network configuration for the Dataproc Metastore instance.
   * @return value or {@code null} for none
   */
  public java.util.List<Consumer> getConsumers() {
    return consumers;
  }

  /**
   * Immutable. The consumer-side network configuration for the Dataproc Metastore instance.
   * @param consumers consumers or {@code null} for none
   */
  public NetworkConfig setConsumers(java.util.List<Consumer> consumers) {
    this.consumers = consumers;
    return this;
  }

  /**
   * Optional. Enables custom routes to be imported and exported for the Dataproc Metastore
   * service's peered VPC network.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCustomRoutesEnabled() {
    return customRoutesEnabled;
  }

  /**
   * Optional. Enables custom routes to be imported and exported for the Dataproc Metastore
   * service's peered VPC network.
   * @param customRoutesEnabled customRoutesEnabled or {@code null} for none
   */
  public NetworkConfig setCustomRoutesEnabled(java.lang.Boolean customRoutesEnabled) {
    this.customRoutesEnabled = customRoutesEnabled;
    return this;
  }

  @Override
  public NetworkConfig set(String fieldName, Object value) {
    return (NetworkConfig) super.set(fieldName, value);
  }

  @Override
  public NetworkConfig clone() {
    return (NetworkConfig) super.clone();
  }

}
