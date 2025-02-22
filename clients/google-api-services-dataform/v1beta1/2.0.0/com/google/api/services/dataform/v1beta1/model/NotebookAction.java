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

package com.google.api.services.dataform.v1beta1.model;

/**
 * Represents a workflow action that will run against a Notebook runtime.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataform API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NotebookAction extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The code contents of a Notebook to be run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contents;

  /**
   * Output only. The ID of the Vertex job that executed the notebook in contents and also the ID
   * used for the outputs created in Google Cloud Storage buckets. Only set once the job has started
   * to run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jobId;

  /**
   * Output only. The code contents of a Notebook to be run.
   * @return value or {@code null} for none
   */
  public java.lang.String getContents() {
    return contents;
  }

  /**
   * Output only. The code contents of a Notebook to be run.
   * @param contents contents or {@code null} for none
   */
  public NotebookAction setContents(java.lang.String contents) {
    this.contents = contents;
    return this;
  }

  /**
   * Output only. The ID of the Vertex job that executed the notebook in contents and also the ID
   * used for the outputs created in Google Cloud Storage buckets. Only set once the job has started
   * to run.
   * @return value or {@code null} for none
   */
  public java.lang.String getJobId() {
    return jobId;
  }

  /**
   * Output only. The ID of the Vertex job that executed the notebook in contents and also the ID
   * used for the outputs created in Google Cloud Storage buckets. Only set once the job has started
   * to run.
   * @param jobId jobId or {@code null} for none
   */
  public NotebookAction setJobId(java.lang.String jobId) {
    this.jobId = jobId;
    return this;
  }

  @Override
  public NotebookAction set(String fieldName, Object value) {
    return (NotebookAction) super.set(fieldName, value);
  }

  @Override
  public NotebookAction clone() {
    return (NotebookAction) super.clone();
  }

}
