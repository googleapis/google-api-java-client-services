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

package com.google.api.services.cloudscheduler.v1.model;

/**
 * App Engine target. The job will be pushed to a job handler by means of an HTTP request via an
 * http_method such as HTTP POST, HTTP GET, etc. The job is acknowledged by means of an HTTP
 * response code in the range [200 - 299]. Error 503 is considered an App Engine system error
 * instead of an application error. Requests returning error 503 will be retried regardless of retry
 * configuration and not counted against retry counts. Any other response code, or a failure to
 * receive a response before the deadline, constitutes a failed attempt.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Scheduler API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppEngineHttpTarget extends com.google.api.client.json.GenericJson {

  /**
   * App Engine Routing setting for the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppEngineRouting appEngineRouting;

  /**
   * Body. HTTP request body. A request body is allowed only if the HTTP method is POST or PUT. It
   * will result in invalid argument error to set a body on a job with an incompatible HttpMethod.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String body;

  /**
   * HTTP request headers. This map contains the header field names and values. Headers can be set
   * when the job is created. Cloud Scheduler sets some headers to default values: * `User-Agent`:
   * By default, this header is `"AppEngine-Google; (+http://code.google.com/appengine)"`. This
   * header can be modified, but Cloud Scheduler will append `"AppEngine-Google;
   * (+http://code.google.com/appengine)"` to the modified `User-Agent`. * `X-CloudScheduler`: This
   * header will be set to true. * `X-CloudScheduler-JobName`: This header will contain the job
   * name. * `X-CloudScheduler-ScheduleTime`: For Cloud Scheduler jobs specified in the unix-cron
   * format, this header will contain the job schedule as an offset of UTC parsed according to
   * RFC3339. If the job has a body and the following headers are not set by the user, Cloud
   * Scheduler sets default values: * `Content-Type`: This will be set to `"application/octet-
   * stream"`. You can override this default by explicitly setting `Content-Type` to a particular
   * media type when creating the job. For example, you can set `Content-Type` to
   * `"application/json"`. The headers below are output only. They cannot be set or overridden: *
   * `Content-Length`: This is computed by Cloud Scheduler. * `X-Google-*`: For Google internal use
   * only. * `X-AppEngine-*`: For Google internal use only. In addition, some App Engine headers,
   * which contain job-specific information, are also be sent to the job handler.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> headers;

  /**
   * The HTTP method to use for the request. PATCH and OPTIONS are not permitted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String httpMethod;

  /**
   * The relative URI. The relative URL must begin with "/" and must be a valid HTTP relative URL.
   * It can contain a path, query string arguments, and `#` fragments. If the relative URL is empty,
   * then the root path "/" will be used. No spaces are allowed, and the maximum length allowed is
   * 2083 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String relativeUri;

  /**
   * App Engine Routing setting for the job.
   * @return value or {@code null} for none
   */
  public AppEngineRouting getAppEngineRouting() {
    return appEngineRouting;
  }

  /**
   * App Engine Routing setting for the job.
   * @param appEngineRouting appEngineRouting or {@code null} for none
   */
  public AppEngineHttpTarget setAppEngineRouting(AppEngineRouting appEngineRouting) {
    this.appEngineRouting = appEngineRouting;
    return this;
  }

  /**
   * Body. HTTP request body. A request body is allowed only if the HTTP method is POST or PUT. It
   * will result in invalid argument error to set a body on a job with an incompatible HttpMethod.
   * @see #decodeBody()
   * @return value or {@code null} for none
   */
  public java.lang.String getBody() {
    return body;
  }

  /**
   * Body. HTTP request body. A request body is allowed only if the HTTP method is POST or PUT. It
   * will result in invalid argument error to set a body on a job with an incompatible HttpMethod.
   * @see #getBody()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeBody() {
    return com.google.api.client.util.Base64.decodeBase64(body);
  }

  /**
   * Body. HTTP request body. A request body is allowed only if the HTTP method is POST or PUT. It
   * will result in invalid argument error to set a body on a job with an incompatible HttpMethod.
   * @see #encodeBody()
   * @param body body or {@code null} for none
   */
  public AppEngineHttpTarget setBody(java.lang.String body) {
    this.body = body;
    return this;
  }

  /**
   * Body. HTTP request body. A request body is allowed only if the HTTP method is POST or PUT. It
   * will result in invalid argument error to set a body on a job with an incompatible HttpMethod.
   * @see #setBody()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public AppEngineHttpTarget encodeBody(byte[] body) {
    this.body = com.google.api.client.util.Base64.encodeBase64URLSafeString(body);
    return this;
  }

  /**
   * HTTP request headers. This map contains the header field names and values. Headers can be set
   * when the job is created. Cloud Scheduler sets some headers to default values: * `User-Agent`:
   * By default, this header is `"AppEngine-Google; (+http://code.google.com/appengine)"`. This
   * header can be modified, but Cloud Scheduler will append `"AppEngine-Google;
   * (+http://code.google.com/appengine)"` to the modified `User-Agent`. * `X-CloudScheduler`: This
   * header will be set to true. * `X-CloudScheduler-JobName`: This header will contain the job
   * name. * `X-CloudScheduler-ScheduleTime`: For Cloud Scheduler jobs specified in the unix-cron
   * format, this header will contain the job schedule as an offset of UTC parsed according to
   * RFC3339. If the job has a body and the following headers are not set by the user, Cloud
   * Scheduler sets default values: * `Content-Type`: This will be set to `"application/octet-
   * stream"`. You can override this default by explicitly setting `Content-Type` to a particular
   * media type when creating the job. For example, you can set `Content-Type` to
   * `"application/json"`. The headers below are output only. They cannot be set or overridden: *
   * `Content-Length`: This is computed by Cloud Scheduler. * `X-Google-*`: For Google internal use
   * only. * `X-AppEngine-*`: For Google internal use only. In addition, some App Engine headers,
   * which contain job-specific information, are also be sent to the job handler.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getHeaders() {
    return headers;
  }

  /**
   * HTTP request headers. This map contains the header field names and values. Headers can be set
   * when the job is created. Cloud Scheduler sets some headers to default values: * `User-Agent`:
   * By default, this header is `"AppEngine-Google; (+http://code.google.com/appengine)"`. This
   * header can be modified, but Cloud Scheduler will append `"AppEngine-Google;
   * (+http://code.google.com/appengine)"` to the modified `User-Agent`. * `X-CloudScheduler`: This
   * header will be set to true. * `X-CloudScheduler-JobName`: This header will contain the job
   * name. * `X-CloudScheduler-ScheduleTime`: For Cloud Scheduler jobs specified in the unix-cron
   * format, this header will contain the job schedule as an offset of UTC parsed according to
   * RFC3339. If the job has a body and the following headers are not set by the user, Cloud
   * Scheduler sets default values: * `Content-Type`: This will be set to `"application/octet-
   * stream"`. You can override this default by explicitly setting `Content-Type` to a particular
   * media type when creating the job. For example, you can set `Content-Type` to
   * `"application/json"`. The headers below are output only. They cannot be set or overridden: *
   * `Content-Length`: This is computed by Cloud Scheduler. * `X-Google-*`: For Google internal use
   * only. * `X-AppEngine-*`: For Google internal use only. In addition, some App Engine headers,
   * which contain job-specific information, are also be sent to the job handler.
   * @param headers headers or {@code null} for none
   */
  public AppEngineHttpTarget setHeaders(java.util.Map<String, java.lang.String> headers) {
    this.headers = headers;
    return this;
  }

  /**
   * The HTTP method to use for the request. PATCH and OPTIONS are not permitted.
   * @return value or {@code null} for none
   */
  public java.lang.String getHttpMethod() {
    return httpMethod;
  }

  /**
   * The HTTP method to use for the request. PATCH and OPTIONS are not permitted.
   * @param httpMethod httpMethod or {@code null} for none
   */
  public AppEngineHttpTarget setHttpMethod(java.lang.String httpMethod) {
    this.httpMethod = httpMethod;
    return this;
  }

  /**
   * The relative URI. The relative URL must begin with "/" and must be a valid HTTP relative URL.
   * It can contain a path, query string arguments, and `#` fragments. If the relative URL is empty,
   * then the root path "/" will be used. No spaces are allowed, and the maximum length allowed is
   * 2083 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getRelativeUri() {
    return relativeUri;
  }

  /**
   * The relative URI. The relative URL must begin with "/" and must be a valid HTTP relative URL.
   * It can contain a path, query string arguments, and `#` fragments. If the relative URL is empty,
   * then the root path "/" will be used. No spaces are allowed, and the maximum length allowed is
   * 2083 characters.
   * @param relativeUri relativeUri or {@code null} for none
   */
  public AppEngineHttpTarget setRelativeUri(java.lang.String relativeUri) {
    this.relativeUri = relativeUri;
    return this;
  }

  @Override
  public AppEngineHttpTarget set(String fieldName, Object value) {
    return (AppEngineHttpTarget) super.set(fieldName, value);
  }

  @Override
  public AppEngineHttpTarget clone() {
    return (AppEngineHttpTarget) super.clone();
  }

}
