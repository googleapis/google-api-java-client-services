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

package com.google.api.services.spanner.v1.model;

/**
 * A heartbeat record is returned as a progress indicator, when there are no data changes or any
 * other partition record types in the change stream partition.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HeartbeatRecord extends com.google.api.client.json.GenericJson {

  /**
   * Indicates the timestamp at which the query has returned all the records in the change stream
   * partition with timestamp <= heartbeat timestamp. The heartbeat timestamp will not be the same
   * as the timestamps of other record types in the same partition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timestamp;

  /**
   * Indicates the timestamp at which the query has returned all the records in the change stream
   * partition with timestamp <= heartbeat timestamp. The heartbeat timestamp will not be the same
   * as the timestamps of other record types in the same partition.
   * @return value or {@code null} for none
   */
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * Indicates the timestamp at which the query has returned all the records in the change stream
   * partition with timestamp <= heartbeat timestamp. The heartbeat timestamp will not be the same
   * as the timestamps of other record types in the same partition.
   * @param timestamp timestamp or {@code null} for none
   */
  public HeartbeatRecord setTimestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  @Override
  public HeartbeatRecord set(String fieldName, Object value) {
    return (HeartbeatRecord) super.set(fieldName, value);
  }

  @Override
  public HeartbeatRecord clone() {
    return (HeartbeatRecord) super.clone();
  }

}
