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

package com.google.api.services.storagebatchoperations.v1.model;

/**
 * Specifies the Cloud Logging behavior.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Storage Batch Operations API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LoggingConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. States in which Action are logged.If empty, no logs are generated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> logActionStates;

  /**
   * Required. Specifies the actions to be logged.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> logActions;

  /**
   * Required. States in which Action are logged.If empty, no logs are generated.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLogActionStates() {
    return logActionStates;
  }

  /**
   * Required. States in which Action are logged.If empty, no logs are generated.
   * @param logActionStates logActionStates or {@code null} for none
   */
  public LoggingConfig setLogActionStates(java.util.List<java.lang.String> logActionStates) {
    this.logActionStates = logActionStates;
    return this;
  }

  /**
   * Required. Specifies the actions to be logged.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLogActions() {
    return logActions;
  }

  /**
   * Required. Specifies the actions to be logged.
   * @param logActions logActions or {@code null} for none
   */
  public LoggingConfig setLogActions(java.util.List<java.lang.String> logActions) {
    this.logActions = logActions;
    return this;
  }

  @Override
  public LoggingConfig set(String fieldName, Object value) {
    return (LoggingConfig) super.set(fieldName, value);
  }

  @Override
  public LoggingConfig clone() {
    return (LoggingConfig) super.clone();
  }

}
