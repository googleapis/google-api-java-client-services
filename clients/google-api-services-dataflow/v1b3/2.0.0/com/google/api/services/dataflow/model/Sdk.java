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

package com.google.api.services.dataflow.model;

/**
 * A structured representation of an SDK.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Sdk extends com.google.api.client.json.GenericJson {

  /**
   * The SDK harness id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sdkId;

  /**
   * The stacktraces for the processes running on the SDK harness.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Stack> stacks;

  /**
   * The SDK harness id.
   * @return value or {@code null} for none
   */
  public java.lang.String getSdkId() {
    return sdkId;
  }

  /**
   * The SDK harness id.
   * @param sdkId sdkId or {@code null} for none
   */
  public Sdk setSdkId(java.lang.String sdkId) {
    this.sdkId = sdkId;
    return this;
  }

  /**
   * The stacktraces for the processes running on the SDK harness.
   * @return value or {@code null} for none
   */
  public java.util.List<Stack> getStacks() {
    return stacks;
  }

  /**
   * The stacktraces for the processes running on the SDK harness.
   * @param stacks stacks or {@code null} for none
   */
  public Sdk setStacks(java.util.List<Stack> stacks) {
    this.stacks = stacks;
    return this;
  }

  @Override
  public Sdk set(String fieldName, Object value) {
    return (Sdk) super.set(fieldName, value);
  }

  @Override
  public Sdk clone() {
    return (Sdk) super.clone();
  }

}
