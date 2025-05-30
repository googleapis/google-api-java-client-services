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

package com.google.api.services.slides.v1;

/**
 * Service definition for Slides (v1).
 *
 * <p>
 * Reads and writes Google Slides presentations.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.google.com/workspace/slides/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link SlidesRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Slides extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        (com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 32 ||
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION == 31 &&
        com.google.api.client.googleapis.GoogleUtils.BUGFIX_VERSION >= 1))) ||
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION >= 2,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.31.1 of google-api-client to run version " +
        "2.0.0 of the Google Slides API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://slides.googleapis.com/";

  /**
   * The default encoded mTLS root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.31
   */
  public static final String DEFAULT_MTLS_ROOT_URL = "https://slides.mtls.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Slides(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Slides(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Presentations collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Slides slides = new Slides(...);}
   *   {@code Slides.Presentations.List request = slides.presentations().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Presentations presentations() {
    return new Presentations();
  }

  /**
   * The "presentations" collection of methods.
   */
  public class Presentations {

    /**
     * Applies one or more updates to the presentation. Each request is validated before being applied.
     * If any request is not valid, then the entire request will fail and nothing will be applied. Some
     * requests have replies to give you some information about how they are applied. Other requests do
     * not need to return information; these each return an empty reply. The order of replies matches
     * that of the requests. For example, suppose you call batchUpdate with four updates, and only the
     * third one returns information. The response would have two empty replies: the reply to the third
     * request, and another empty reply, in that order. Because other users may be editing the
     * presentation, the presentation might not exactly reflect your changes: your changes may be
     * altered with respect to collaborator changes. If there are no collaborators, the presentation
     * should reflect your changes. In any case, the updates in your request are guaranteed to be
     * applied together atomically.
     *
     * Create a request for the method "presentations.batchUpdate".
     *
     * This request holds the parameters needed by the slides server.  After setting any optional
     * parameters, call the {@link BatchUpdate#execute()} method to invoke the remote operation.
     *
     * @param presentationId The presentation to apply the updates to.
     * @param content the {@link com.google.api.services.slides.v1.model.BatchUpdatePresentationRequest}
     * @return the request
     */
    public BatchUpdate batchUpdate(java.lang.String presentationId, com.google.api.services.slides.v1.model.BatchUpdatePresentationRequest content) throws java.io.IOException {
      BatchUpdate result = new BatchUpdate(presentationId, content);
      initialize(result);
      return result;
    }

    public class BatchUpdate extends SlidesRequest<com.google.api.services.slides.v1.model.BatchUpdatePresentationResponse> {

      private static final String REST_PATH = "v1/presentations/{presentationId}:batchUpdate";

      /**
       * Applies one or more updates to the presentation. Each request is validated before being
       * applied. If any request is not valid, then the entire request will fail and nothing will be
       * applied. Some requests have replies to give you some information about how they are applied.
       * Other requests do not need to return information; these each return an empty reply. The order
       * of replies matches that of the requests. For example, suppose you call batchUpdate with four
       * updates, and only the third one returns information. The response would have two empty replies:
       * the reply to the third request, and another empty reply, in that order. Because other users may
       * be editing the presentation, the presentation might not exactly reflect your changes: your
       * changes may be altered with respect to collaborator changes. If there are no collaborators, the
       * presentation should reflect your changes. In any case, the updates in your request are
       * guaranteed to be applied together atomically.
       *
       * Create a request for the method "presentations.batchUpdate".
       *
       * This request holds the parameters needed by the the slides server.  After setting any optional
       * parameters, call the {@link BatchUpdate#execute()} method to invoke the remote operation. <p>
       * {@link
       * BatchUpdate#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param presentationId The presentation to apply the updates to.
       * @param content the {@link com.google.api.services.slides.v1.model.BatchUpdatePresentationRequest}
       * @since 1.13
       */
      protected BatchUpdate(java.lang.String presentationId, com.google.api.services.slides.v1.model.BatchUpdatePresentationRequest content) {
        super(Slides.this, "POST", REST_PATH, content, com.google.api.services.slides.v1.model.BatchUpdatePresentationResponse.class);
        this.presentationId = com.google.api.client.util.Preconditions.checkNotNull(presentationId, "Required parameter presentationId must be specified.");
      }

      @Override
      public BatchUpdate set$Xgafv(java.lang.String $Xgafv) {
        return (BatchUpdate) super.set$Xgafv($Xgafv);
      }

      @Override
      public BatchUpdate setAccessToken(java.lang.String accessToken) {
        return (BatchUpdate) super.setAccessToken(accessToken);
      }

      @Override
      public BatchUpdate setAlt(java.lang.String alt) {
        return (BatchUpdate) super.setAlt(alt);
      }

      @Override
      public BatchUpdate setCallback(java.lang.String callback) {
        return (BatchUpdate) super.setCallback(callback);
      }

      @Override
      public BatchUpdate setFields(java.lang.String fields) {
        return (BatchUpdate) super.setFields(fields);
      }

      @Override
      public BatchUpdate setKey(java.lang.String key) {
        return (BatchUpdate) super.setKey(key);
      }

      @Override
      public BatchUpdate setOauthToken(java.lang.String oauthToken) {
        return (BatchUpdate) super.setOauthToken(oauthToken);
      }

      @Override
      public BatchUpdate setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (BatchUpdate) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public BatchUpdate setQuotaUser(java.lang.String quotaUser) {
        return (BatchUpdate) super.setQuotaUser(quotaUser);
      }

      @Override
      public BatchUpdate setUploadType(java.lang.String uploadType) {
        return (BatchUpdate) super.setUploadType(uploadType);
      }

      @Override
      public BatchUpdate setUploadProtocol(java.lang.String uploadProtocol) {
        return (BatchUpdate) super.setUploadProtocol(uploadProtocol);
      }

      /** The presentation to apply the updates to. */
      @com.google.api.client.util.Key
      private java.lang.String presentationId;

      /** The presentation to apply the updates to.
       */
      public java.lang.String getPresentationId() {
        return presentationId;
      }

      /** The presentation to apply the updates to. */
      public BatchUpdate setPresentationId(java.lang.String presentationId) {
        this.presentationId = presentationId;
        return this;
      }

      @Override
      public BatchUpdate set(String parameterName, Object value) {
        return (BatchUpdate) super.set(parameterName, value);
      }
    }
    /**
     * Creates a blank presentation using the title given in the request. If a `presentationId` is
     * provided, it is used as the ID of the new presentation. Otherwise, a new ID is generated. Other
     * fields in the request, including any provided content, are ignored. Returns the created
     * presentation.
     *
     * Create a request for the method "presentations.create".
     *
     * This request holds the parameters needed by the slides server.  After setting any optional
     * parameters, call the {@link Create#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.slides.v1.model.Presentation}
     * @return the request
     */
    public Create create(com.google.api.services.slides.v1.model.Presentation content) throws java.io.IOException {
      Create result = new Create(content);
      initialize(result);
      return result;
    }

    public class Create extends SlidesRequest<com.google.api.services.slides.v1.model.Presentation> {

      private static final String REST_PATH = "v1/presentations";

      /**
       * Creates a blank presentation using the title given in the request. If a `presentationId` is
       * provided, it is used as the ID of the new presentation. Otherwise, a new ID is generated. Other
       * fields in the request, including any provided content, are ignored. Returns the created
       * presentation.
       *
       * Create a request for the method "presentations.create".
       *
       * This request holds the parameters needed by the the slides server.  After setting any optional
       * parameters, call the {@link Create#execute()} method to invoke the remote operation. <p> {@link
       * Create#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.slides.v1.model.Presentation}
       * @since 1.13
       */
      protected Create(com.google.api.services.slides.v1.model.Presentation content) {
        super(Slides.this, "POST", REST_PATH, content, com.google.api.services.slides.v1.model.Presentation.class);
      }

      @Override
      public Create set$Xgafv(java.lang.String $Xgafv) {
        return (Create) super.set$Xgafv($Xgafv);
      }

      @Override
      public Create setAccessToken(java.lang.String accessToken) {
        return (Create) super.setAccessToken(accessToken);
      }

      @Override
      public Create setAlt(java.lang.String alt) {
        return (Create) super.setAlt(alt);
      }

      @Override
      public Create setCallback(java.lang.String callback) {
        return (Create) super.setCallback(callback);
      }

      @Override
      public Create setFields(java.lang.String fields) {
        return (Create) super.setFields(fields);
      }

      @Override
      public Create setKey(java.lang.String key) {
        return (Create) super.setKey(key);
      }

      @Override
      public Create setOauthToken(java.lang.String oauthToken) {
        return (Create) super.setOauthToken(oauthToken);
      }

      @Override
      public Create setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Create) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Create setQuotaUser(java.lang.String quotaUser) {
        return (Create) super.setQuotaUser(quotaUser);
      }

      @Override
      public Create setUploadType(java.lang.String uploadType) {
        return (Create) super.setUploadType(uploadType);
      }

      @Override
      public Create setUploadProtocol(java.lang.String uploadProtocol) {
        return (Create) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public Create set(String parameterName, Object value) {
        return (Create) super.set(parameterName, value);
      }
    }
    /**
     * Gets the latest version of the specified presentation.
     *
     * Create a request for the method "presentations.get".
     *
     * This request holds the parameters needed by the slides server.  After setting any optional
     * parameters, call the {@link Get#execute()} method to invoke the remote operation.
     *
     * @param presentationId The ID of the presentation to retrieve.
     * @return the request
     */
    public Get get(java.lang.String presentationId) throws java.io.IOException {
      Get result = new Get(presentationId);
      initialize(result);
      return result;
    }

    public class Get extends SlidesRequest<com.google.api.services.slides.v1.model.Presentation> {

      private static final String REST_PATH = "v1/presentations/{+presentationId}";

      private final java.util.regex.Pattern PRESENTATION_ID_PATTERN =
          java.util.regex.Pattern.compile("^[^/]+$");

      /**
       * Gets the latest version of the specified presentation.
       *
       * Create a request for the method "presentations.get".
       *
       * This request holds the parameters needed by the the slides server.  After setting any optional
       * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
       * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
       * called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param presentationId The ID of the presentation to retrieve.
       * @since 1.13
       */
      protected Get(java.lang.String presentationId) {
        super(Slides.this, "GET", REST_PATH, null, com.google.api.services.slides.v1.model.Presentation.class);
        this.presentationId = com.google.api.client.util.Preconditions.checkNotNull(presentationId, "Required parameter presentationId must be specified.");
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(PRESENTATION_ID_PATTERN.matcher(presentationId).matches(),
              "Parameter presentationId must conform to the pattern " +
              "^[^/]+$");
        }
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public Get set$Xgafv(java.lang.String $Xgafv) {
        return (Get) super.set$Xgafv($Xgafv);
      }

      @Override
      public Get setAccessToken(java.lang.String accessToken) {
        return (Get) super.setAccessToken(accessToken);
      }

      @Override
      public Get setAlt(java.lang.String alt) {
        return (Get) super.setAlt(alt);
      }

      @Override
      public Get setCallback(java.lang.String callback) {
        return (Get) super.setCallback(callback);
      }

      @Override
      public Get setFields(java.lang.String fields) {
        return (Get) super.setFields(fields);
      }

      @Override
      public Get setKey(java.lang.String key) {
        return (Get) super.setKey(key);
      }

      @Override
      public Get setOauthToken(java.lang.String oauthToken) {
        return (Get) super.setOauthToken(oauthToken);
      }

      @Override
      public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Get) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Get setQuotaUser(java.lang.String quotaUser) {
        return (Get) super.setQuotaUser(quotaUser);
      }

      @Override
      public Get setUploadType(java.lang.String uploadType) {
        return (Get) super.setUploadType(uploadType);
      }

      @Override
      public Get setUploadProtocol(java.lang.String uploadProtocol) {
        return (Get) super.setUploadProtocol(uploadProtocol);
      }

      /** The ID of the presentation to retrieve. */
      @com.google.api.client.util.Key
      private java.lang.String presentationId;

      /** The ID of the presentation to retrieve.
       */
      public java.lang.String getPresentationId() {
        return presentationId;
      }

      /** The ID of the presentation to retrieve. */
      public Get setPresentationId(java.lang.String presentationId) {
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(PRESENTATION_ID_PATTERN.matcher(presentationId).matches(),
              "Parameter presentationId must conform to the pattern " +
              "^[^/]+$");
        }
        this.presentationId = presentationId;
        return this;
      }

      @Override
      public Get set(String parameterName, Object value) {
        return (Get) super.set(parameterName, value);
      }
    }

    /**
     * An accessor for creating requests from the Pages collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code Slides slides = new Slides(...);}
     *   {@code Slides.Pages.List request = slides.pages().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Pages pages() {
      return new Pages();
    }

    /**
     * The "pages" collection of methods.
     */
    public class Pages {

      /**
       * Gets the latest version of the specified page in the presentation.
       *
       * Create a request for the method "pages.get".
       *
       * This request holds the parameters needed by the slides server.  After setting any optional
       * parameters, call the {@link Get#execute()} method to invoke the remote operation.
       *
       * @param presentationId The ID of the presentation to retrieve.
       * @param pageObjectId The object ID of the page to retrieve.
       * @return the request
       */
      public Get get(java.lang.String presentationId, java.lang.String pageObjectId) throws java.io.IOException {
        Get result = new Get(presentationId, pageObjectId);
        initialize(result);
        return result;
      }

      public class Get extends SlidesRequest<com.google.api.services.slides.v1.model.Page> {

        private static final String REST_PATH = "v1/presentations/{presentationId}/pages/{pageObjectId}";

        /**
         * Gets the latest version of the specified page in the presentation.
         *
         * Create a request for the method "pages.get".
         *
         * This request holds the parameters needed by the the slides server.  After setting any optional
         * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
         * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
         * called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param presentationId The ID of the presentation to retrieve.
         * @param pageObjectId The object ID of the page to retrieve.
         * @since 1.13
         */
        protected Get(java.lang.String presentationId, java.lang.String pageObjectId) {
          super(Slides.this, "GET", REST_PATH, null, com.google.api.services.slides.v1.model.Page.class);
          this.presentationId = com.google.api.client.util.Preconditions.checkNotNull(presentationId, "Required parameter presentationId must be specified.");
          this.pageObjectId = com.google.api.client.util.Preconditions.checkNotNull(pageObjectId, "Required parameter pageObjectId must be specified.");
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public Get set$Xgafv(java.lang.String $Xgafv) {
          return (Get) super.set$Xgafv($Xgafv);
        }

        @Override
        public Get setAccessToken(java.lang.String accessToken) {
          return (Get) super.setAccessToken(accessToken);
        }

        @Override
        public Get setAlt(java.lang.String alt) {
          return (Get) super.setAlt(alt);
        }

        @Override
        public Get setCallback(java.lang.String callback) {
          return (Get) super.setCallback(callback);
        }

        @Override
        public Get setFields(java.lang.String fields) {
          return (Get) super.setFields(fields);
        }

        @Override
        public Get setKey(java.lang.String key) {
          return (Get) super.setKey(key);
        }

        @Override
        public Get setOauthToken(java.lang.String oauthToken) {
          return (Get) super.setOauthToken(oauthToken);
        }

        @Override
        public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (Get) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Get setQuotaUser(java.lang.String quotaUser) {
          return (Get) super.setQuotaUser(quotaUser);
        }

        @Override
        public Get setUploadType(java.lang.String uploadType) {
          return (Get) super.setUploadType(uploadType);
        }

        @Override
        public Get setUploadProtocol(java.lang.String uploadProtocol) {
          return (Get) super.setUploadProtocol(uploadProtocol);
        }

        /** The ID of the presentation to retrieve. */
        @com.google.api.client.util.Key
        private java.lang.String presentationId;

        /** The ID of the presentation to retrieve.
         */
        public java.lang.String getPresentationId() {
          return presentationId;
        }

        /** The ID of the presentation to retrieve. */
        public Get setPresentationId(java.lang.String presentationId) {
          this.presentationId = presentationId;
          return this;
        }

        /** The object ID of the page to retrieve. */
        @com.google.api.client.util.Key
        private java.lang.String pageObjectId;

        /** The object ID of the page to retrieve.
         */
        public java.lang.String getPageObjectId() {
          return pageObjectId;
        }

        /** The object ID of the page to retrieve. */
        public Get setPageObjectId(java.lang.String pageObjectId) {
          this.pageObjectId = pageObjectId;
          return this;
        }

        @Override
        public Get set(String parameterName, Object value) {
          return (Get) super.set(parameterName, value);
        }
      }
      /**
       * Generates a thumbnail of the latest version of the specified page in the presentation and returns
       * a URL to the thumbnail image. This request counts as an [expensive read
       * request](https://developers.google.com/workspace/slides/limits) for quota purposes.
       *
       * Create a request for the method "pages.getThumbnail".
       *
       * This request holds the parameters needed by the slides server.  After setting any optional
       * parameters, call the {@link GetThumbnail#execute()} method to invoke the remote operation.
       *
       * @param presentationId The ID of the presentation to retrieve.
       * @param pageObjectId The object ID of the page whose thumbnail to retrieve.
       * @return the request
       */
      public GetThumbnail getThumbnail(java.lang.String presentationId, java.lang.String pageObjectId) throws java.io.IOException {
        GetThumbnail result = new GetThumbnail(presentationId, pageObjectId);
        initialize(result);
        return result;
      }

      public class GetThumbnail extends SlidesRequest<com.google.api.services.slides.v1.model.Thumbnail> {

        private static final String REST_PATH = "v1/presentations/{presentationId}/pages/{pageObjectId}/thumbnail";

        /**
         * Generates a thumbnail of the latest version of the specified page in the presentation and
         * returns a URL to the thumbnail image. This request counts as an [expensive read
         * request](https://developers.google.com/workspace/slides/limits) for quota purposes.
         *
         * Create a request for the method "pages.getThumbnail".
         *
         * This request holds the parameters needed by the the slides server.  After setting any optional
         * parameters, call the {@link GetThumbnail#execute()} method to invoke the remote operation. <p>
         * {@link
         * GetThumbnail#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
         * must be called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param presentationId The ID of the presentation to retrieve.
         * @param pageObjectId The object ID of the page whose thumbnail to retrieve.
         * @since 1.13
         */
        protected GetThumbnail(java.lang.String presentationId, java.lang.String pageObjectId) {
          super(Slides.this, "GET", REST_PATH, null, com.google.api.services.slides.v1.model.Thumbnail.class);
          this.presentationId = com.google.api.client.util.Preconditions.checkNotNull(presentationId, "Required parameter presentationId must be specified.");
          this.pageObjectId = com.google.api.client.util.Preconditions.checkNotNull(pageObjectId, "Required parameter pageObjectId must be specified.");
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public GetThumbnail set$Xgafv(java.lang.String $Xgafv) {
          return (GetThumbnail) super.set$Xgafv($Xgafv);
        }

        @Override
        public GetThumbnail setAccessToken(java.lang.String accessToken) {
          return (GetThumbnail) super.setAccessToken(accessToken);
        }

        @Override
        public GetThumbnail setAlt(java.lang.String alt) {
          return (GetThumbnail) super.setAlt(alt);
        }

        @Override
        public GetThumbnail setCallback(java.lang.String callback) {
          return (GetThumbnail) super.setCallback(callback);
        }

        @Override
        public GetThumbnail setFields(java.lang.String fields) {
          return (GetThumbnail) super.setFields(fields);
        }

        @Override
        public GetThumbnail setKey(java.lang.String key) {
          return (GetThumbnail) super.setKey(key);
        }

        @Override
        public GetThumbnail setOauthToken(java.lang.String oauthToken) {
          return (GetThumbnail) super.setOauthToken(oauthToken);
        }

        @Override
        public GetThumbnail setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (GetThumbnail) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public GetThumbnail setQuotaUser(java.lang.String quotaUser) {
          return (GetThumbnail) super.setQuotaUser(quotaUser);
        }

        @Override
        public GetThumbnail setUploadType(java.lang.String uploadType) {
          return (GetThumbnail) super.setUploadType(uploadType);
        }

        @Override
        public GetThumbnail setUploadProtocol(java.lang.String uploadProtocol) {
          return (GetThumbnail) super.setUploadProtocol(uploadProtocol);
        }

        /** The ID of the presentation to retrieve. */
        @com.google.api.client.util.Key
        private java.lang.String presentationId;

        /** The ID of the presentation to retrieve.
         */
        public java.lang.String getPresentationId() {
          return presentationId;
        }

        /** The ID of the presentation to retrieve. */
        public GetThumbnail setPresentationId(java.lang.String presentationId) {
          this.presentationId = presentationId;
          return this;
        }

        /** The object ID of the page whose thumbnail to retrieve. */
        @com.google.api.client.util.Key
        private java.lang.String pageObjectId;

        /** The object ID of the page whose thumbnail to retrieve.
         */
        public java.lang.String getPageObjectId() {
          return pageObjectId;
        }

        /** The object ID of the page whose thumbnail to retrieve. */
        public GetThumbnail setPageObjectId(java.lang.String pageObjectId) {
          this.pageObjectId = pageObjectId;
          return this;
        }

        /**
         * The optional mime type of the thumbnail image. If you don't specify the mime type, the
         * mime type defaults to PNG.
         */
        @com.google.api.client.util.Key("thumbnailProperties.mimeType")
        private java.lang.String thumbnailPropertiesMimeType;

        /** The optional mime type of the thumbnail image. If you don't specify the mime type, the mime type
       defaults to PNG.
         */
        public java.lang.String getThumbnailPropertiesMimeType() {
          return thumbnailPropertiesMimeType;
        }

        /**
         * The optional mime type of the thumbnail image. If you don't specify the mime type, the
         * mime type defaults to PNG.
         */
        public GetThumbnail setThumbnailPropertiesMimeType(java.lang.String thumbnailPropertiesMimeType) {
          this.thumbnailPropertiesMimeType = thumbnailPropertiesMimeType;
          return this;
        }

        /**
         * The optional thumbnail image size. If you don't specify the size, the server chooses a
         * default size of the image.
         */
        @com.google.api.client.util.Key("thumbnailProperties.thumbnailSize")
        private java.lang.String thumbnailPropertiesThumbnailSize;

        /** The optional thumbnail image size. If you don't specify the size, the server chooses a default size
       of the image.
         */
        public java.lang.String getThumbnailPropertiesThumbnailSize() {
          return thumbnailPropertiesThumbnailSize;
        }

        /**
         * The optional thumbnail image size. If you don't specify the size, the server chooses a
         * default size of the image.
         */
        public GetThumbnail setThumbnailPropertiesThumbnailSize(java.lang.String thumbnailPropertiesThumbnailSize) {
          this.thumbnailPropertiesThumbnailSize = thumbnailPropertiesThumbnailSize;
          return this;
        }

        @Override
        public GetThumbnail set(String parameterName, Object value) {
          return (GetThumbnail) super.set(parameterName, value);
        }
      }

    }
  }

  /**
   * Builder for {@link Slides}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    private static String chooseEndpoint(com.google.api.client.http.HttpTransport transport) {
      // If the GOOGLE_API_USE_MTLS_ENDPOINT environment variable value is "always", use mTLS endpoint.
      // If the env variable is "auto", use mTLS endpoint if and only if the transport is mTLS.
      // Use the regular endpoint for all other cases.
      String useMtlsEndpoint = System.getenv("GOOGLE_API_USE_MTLS_ENDPOINT");
      useMtlsEndpoint = useMtlsEndpoint == null ? "auto" : useMtlsEndpoint;
      if ("always".equals(useMtlsEndpoint) || ("auto".equals(useMtlsEndpoint) && transport != null && transport.isMtls())) {
        return DEFAULT_MTLS_ROOT_URL;
      }
      return DEFAULT_ROOT_URL;
    }

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          Builder.chooseEndpoint(transport),
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link Slides}. */
    @Override
    public Slides build() {
      return new Slides(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link SlidesRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setSlidesRequestInitializer(
        SlidesRequestInitializer slidesRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(slidesRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }

    @Override
    public Builder setUniverseDomain(String universeDomain) {
      return (Builder) super.setUniverseDomain(universeDomain);
    }
  }
}
