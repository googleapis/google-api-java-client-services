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

package com.google.api.services.deploymentmanager.model;

/**
 * Model definition for ResourceUpdate.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Deployment Manager V2 API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResourceUpdate extends com.google.api.client.json.GenericJson {

  /**
   * The Access Control Policy to set on this resource after updating the resource itself.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResourceAccessControl accessControl;

  /**
   * Output only. The credential that will be used creating/updating this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Credential credential;

  /**
   * Output only. If errors are generated during update of the resource, this field will be
   * populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Error error;

  /**
   * Output only. The expanded properties of the resource with reference values expanded. Returned
   * as serialized YAML.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String finalProperties;

  /**
   * Output only. The intent of the resource: `PREVIEW`, `UPDATE`, or `CANCEL`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String intent;

  /**
   * Output only. URL of the manifest representing the update configuration of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String manifest;

  /**
   * Output only. The set of updated properties for this resource, before references are expanded.
   * Returned as serialized YAML.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String properties;

  /**
   * Output only. In case this is an action, it will show the runtimePolicies that this action will
   * have after updating the deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> runtimePolicies;

  /**
   * Output only. The state of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. If warning messages are generated during processing of this resource, this field
   * will be populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Warnings> warnings;

  static {
    // hack to force ProGuard to consider Warnings used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Warnings.class);
  }

  /**
   * The Access Control Policy to set on this resource after updating the resource itself.
   * @return value or {@code null} for none
   */
  public ResourceAccessControl getAccessControl() {
    return accessControl;
  }

  /**
   * The Access Control Policy to set on this resource after updating the resource itself.
   * @param accessControl accessControl or {@code null} for none
   */
  public ResourceUpdate setAccessControl(ResourceAccessControl accessControl) {
    this.accessControl = accessControl;
    return this;
  }

  /**
   * Output only. The credential that will be used creating/updating this resource.
   * @return value or {@code null} for none
   */
  public Credential getCredential() {
    return credential;
  }

  /**
   * Output only. The credential that will be used creating/updating this resource.
   * @param credential credential or {@code null} for none
   */
  public ResourceUpdate setCredential(Credential credential) {
    this.credential = credential;
    return this;
  }

  /**
   * Output only. If errors are generated during update of the resource, this field will be
   * populated.
   * @return value or {@code null} for none
   */
  public Error getError() {
    return error;
  }

  /**
   * Output only. If errors are generated during update of the resource, this field will be
   * populated.
   * @param error error or {@code null} for none
   */
  public ResourceUpdate setError(Error error) {
    this.error = error;
    return this;
  }

  /**
   * Output only. The expanded properties of the resource with reference values expanded. Returned
   * as serialized YAML.
   * @return value or {@code null} for none
   */
  public java.lang.String getFinalProperties() {
    return finalProperties;
  }

  /**
   * Output only. The expanded properties of the resource with reference values expanded. Returned
   * as serialized YAML.
   * @param finalProperties finalProperties or {@code null} for none
   */
  public ResourceUpdate setFinalProperties(java.lang.String finalProperties) {
    this.finalProperties = finalProperties;
    return this;
  }

  /**
   * Output only. The intent of the resource: `PREVIEW`, `UPDATE`, or `CANCEL`.
   * @return value or {@code null} for none
   */
  public java.lang.String getIntent() {
    return intent;
  }

  /**
   * Output only. The intent of the resource: `PREVIEW`, `UPDATE`, or `CANCEL`.
   * @param intent intent or {@code null} for none
   */
  public ResourceUpdate setIntent(java.lang.String intent) {
    this.intent = intent;
    return this;
  }

  /**
   * Output only. URL of the manifest representing the update configuration of this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getManifest() {
    return manifest;
  }

  /**
   * Output only. URL of the manifest representing the update configuration of this resource.
   * @param manifest manifest or {@code null} for none
   */
  public ResourceUpdate setManifest(java.lang.String manifest) {
    this.manifest = manifest;
    return this;
  }

  /**
   * Output only. The set of updated properties for this resource, before references are expanded.
   * Returned as serialized YAML.
   * @return value or {@code null} for none
   */
  public java.lang.String getProperties() {
    return properties;
  }

  /**
   * Output only. The set of updated properties for this resource, before references are expanded.
   * Returned as serialized YAML.
   * @param properties properties or {@code null} for none
   */
  public ResourceUpdate setProperties(java.lang.String properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Output only. In case this is an action, it will show the runtimePolicies that this action will
   * have after updating the deployment.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRuntimePolicies() {
    return runtimePolicies;
  }

  /**
   * Output only. In case this is an action, it will show the runtimePolicies that this action will
   * have after updating the deployment.
   * @param runtimePolicies runtimePolicies or {@code null} for none
   */
  public ResourceUpdate setRuntimePolicies(java.util.List<java.lang.String> runtimePolicies) {
    this.runtimePolicies = runtimePolicies;
    return this;
  }

  /**
   * Output only. The state of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The state of the resource.
   * @param state state or {@code null} for none
   */
  public ResourceUpdate setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. If warning messages are generated during processing of this resource, this field
   * will be populated.
   * @return value or {@code null} for none
   */
  public java.util.List<Warnings> getWarnings() {
    return warnings;
  }

  /**
   * Output only. If warning messages are generated during processing of this resource, this field
   * will be populated.
   * @param warnings warnings or {@code null} for none
   */
  public ResourceUpdate setWarnings(java.util.List<Warnings> warnings) {
    this.warnings = warnings;
    return this;
  }

  @Override
  public ResourceUpdate set(String fieldName, Object value) {
    return (ResourceUpdate) super.set(fieldName, value);
  }

  @Override
  public ResourceUpdate clone() {
    return (ResourceUpdate) super.clone();
  }

  /**
   * Output only. If errors are generated during update of the resource, this field will be populated.
   */
  public static final class Error extends com.google.api.client.json.GenericJson {

    /**
     * [Output Only] The array of errors encountered while processing this operation.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<Errors> errors;

    static {
      // hack to force ProGuard to consider Errors used, since otherwise it would be stripped out
      // see https://github.com/google/google-api-java-client/issues/543
      com.google.api.client.util.Data.nullOf(Errors.class);
    }

    /**
     * [Output Only] The array of errors encountered while processing this operation.
     * @return value or {@code null} for none
     */
    public java.util.List<Errors> getErrors() {
      return errors;
    }

    /**
     * [Output Only] The array of errors encountered while processing this operation.
     * @param errors errors or {@code null} for none
     */
    public Error setErrors(java.util.List<Errors> errors) {
      this.errors = errors;
      return this;
    }

    @Override
    public Error set(String fieldName, Object value) {
      return (Error) super.set(fieldName, value);
    }

    @Override
    public Error clone() {
      return (Error) super.clone();
    }

    /**
     * Model definition for ResourceUpdateErrorErrors.
     */
    public static final class Errors extends com.google.api.client.json.GenericJson {

      /**
       * [Output Only] Optional error details WARNING: DO NOT MAKE VISIBLE This is for internal use-only
       * (like componentization) (thus the visibility "none") and in case of public exposure it is
       * strongly recommended to follow pattern of: https://aip.dev/193 and expose as details field.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.util.List<java.lang.String> arguments;

      /**
       * [Output Only] The error type identifier for this error.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String code;

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private DebugInfo debugInfo;

      /**
       * [Output Only] An optional list of messages that contain the error details. There is a set of
       * defined message types to use for providing details.The syntax depends on the error code. For
       * example, QuotaExceededInfo will have details when the error code is QUOTA_EXCEEDED.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.util.List<ErrorDetails> errorDetails;

      static {
        // hack to force ProGuard to consider ErrorDetails used, since otherwise it would be stripped out
        // see https://github.com/google/google-api-java-client/issues/543
        com.google.api.client.util.Data.nullOf(ErrorDetails.class);
      }

      /**
       * [Output Only] Indicates the field in the request that caused the error. This property is
       * optional.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String location;

      /**
       * [Output Only] An optional, human-readable error message.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String message;

      /**
       * [Output Only] Optional error details WARNING: DO NOT MAKE VISIBLE This is for internal use-only
       * (like componentization) (thus the visibility "none") and in case of public exposure it is
       * strongly recommended to follow pattern of: https://aip.dev/193 and expose as details field.
       * @return value or {@code null} for none
       */
      public java.util.List<java.lang.String> getArguments() {
        return arguments;
      }

      /**
       * [Output Only] Optional error details WARNING: DO NOT MAKE VISIBLE This is for internal use-only
       * (like componentization) (thus the visibility "none") and in case of public exposure it is
       * strongly recommended to follow pattern of: https://aip.dev/193 and expose as details field.
       * @param arguments arguments or {@code null} for none
       */
      public Errors setArguments(java.util.List<java.lang.String> arguments) {
        this.arguments = arguments;
        return this;
      }

      /**
       * [Output Only] The error type identifier for this error.
       * @return value or {@code null} for none
       */
      public java.lang.String getCode() {
        return code;
      }

      /**
       * [Output Only] The error type identifier for this error.
       * @param code code or {@code null} for none
       */
      public Errors setCode(java.lang.String code) {
        this.code = code;
        return this;
      }

      /**
       * @return value or {@code null} for none
       */
      public DebugInfo getDebugInfo() {
        return debugInfo;
      }

      /**
       * @param debugInfo debugInfo or {@code null} for none
       */
      public Errors setDebugInfo(DebugInfo debugInfo) {
        this.debugInfo = debugInfo;
        return this;
      }

      /**
       * [Output Only] An optional list of messages that contain the error details. There is a set of
       * defined message types to use for providing details.The syntax depends on the error code. For
       * example, QuotaExceededInfo will have details when the error code is QUOTA_EXCEEDED.
       * @return value or {@code null} for none
       */
      public java.util.List<ErrorDetails> getErrorDetails() {
        return errorDetails;
      }

      /**
       * [Output Only] An optional list of messages that contain the error details. There is a set of
       * defined message types to use for providing details.The syntax depends on the error code. For
       * example, QuotaExceededInfo will have details when the error code is QUOTA_EXCEEDED.
       * @param errorDetails errorDetails or {@code null} for none
       */
      public Errors setErrorDetails(java.util.List<ErrorDetails> errorDetails) {
        this.errorDetails = errorDetails;
        return this;
      }

      /**
       * [Output Only] Indicates the field in the request that caused the error. This property is
       * optional.
       * @return value or {@code null} for none
       */
      public java.lang.String getLocation() {
        return location;
      }

      /**
       * [Output Only] Indicates the field in the request that caused the error. This property is
       * optional.
       * @param location location or {@code null} for none
       */
      public Errors setLocation(java.lang.String location) {
        this.location = location;
        return this;
      }

      /**
       * [Output Only] An optional, human-readable error message.
       * @return value or {@code null} for none
       */
      public java.lang.String getMessage() {
        return message;
      }

      /**
       * [Output Only] An optional, human-readable error message.
       * @param message message or {@code null} for none
       */
      public Errors setMessage(java.lang.String message) {
        this.message = message;
        return this;
      }

      @Override
      public Errors set(String fieldName, Object value) {
        return (Errors) super.set(fieldName, value);
      }

      @Override
      public Errors clone() {
        return (Errors) super.clone();
      }

      /**
       * Model definition for ResourceUpdateErrorErrorsErrorDetails.
       */
      public static final class ErrorDetails extends com.google.api.client.json.GenericJson {

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private ErrorInfo errorInfo;

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private Help help;

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private LocalizedMessage localizedMessage;

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private QuotaExceededInfo quotaInfo;

        /**
         * @return value or {@code null} for none
         */
        public ErrorInfo getErrorInfo() {
          return errorInfo;
        }

        /**
         * @param errorInfo errorInfo or {@code null} for none
         */
        public ErrorDetails setErrorInfo(ErrorInfo errorInfo) {
          this.errorInfo = errorInfo;
          return this;
        }

        /**
         * @return value or {@code null} for none
         */
        public Help getHelp() {
          return help;
        }

        /**
         * @param help help or {@code null} for none
         */
        public ErrorDetails setHelp(Help help) {
          this.help = help;
          return this;
        }

        /**
         * @return value or {@code null} for none
         */
        public LocalizedMessage getLocalizedMessage() {
          return localizedMessage;
        }

        /**
         * @param localizedMessage localizedMessage or {@code null} for none
         */
        public ErrorDetails setLocalizedMessage(LocalizedMessage localizedMessage) {
          this.localizedMessage = localizedMessage;
          return this;
        }

        /**
         * @return value or {@code null} for none
         */
        public QuotaExceededInfo getQuotaInfo() {
          return quotaInfo;
        }

        /**
         * @param quotaInfo quotaInfo or {@code null} for none
         */
        public ErrorDetails setQuotaInfo(QuotaExceededInfo quotaInfo) {
          this.quotaInfo = quotaInfo;
          return this;
        }

        @Override
        public ErrorDetails set(String fieldName, Object value) {
          return (ErrorDetails) super.set(fieldName, value);
        }

        @Override
        public ErrorDetails clone() {
          return (ErrorDetails) super.clone();
        }

      }
    }
  }

  /**
   * Model definition for ResourceUpdateWarnings.
   */
  public static final class Warnings extends com.google.api.client.json.GenericJson {

    /**
     * [Output Only] A warning code, if applicable. For example, Compute Engine returns
     * NO_RESULTS_ON_PAGE if there are no results in the response.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String code;

    /**
     * [Output Only] Metadata about this warning in key: value format. For example: "data": [ { "key":
     * "scope", "value": "zones/us-east1-d" }
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<Data> data;

    static {
      // hack to force ProGuard to consider Data used, since otherwise it would be stripped out
      // see https://github.com/google/google-api-java-client/issues/543
      com.google.api.client.util.Data.nullOf(Data.class);
    }

    /**
     * [Output Only] A human-readable description of the warning code.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String message;

    /**
     * [Output Only] A warning code, if applicable. For example, Compute Engine returns
     * NO_RESULTS_ON_PAGE if there are no results in the response.
     * @return value or {@code null} for none
     */
    public java.lang.String getCode() {
      return code;
    }

    /**
     * [Output Only] A warning code, if applicable. For example, Compute Engine returns
     * NO_RESULTS_ON_PAGE if there are no results in the response.
     * @param code code or {@code null} for none
     */
    public Warnings setCode(java.lang.String code) {
      this.code = code;
      return this;
    }

    /**
     * [Output Only] Metadata about this warning in key: value format. For example: "data": [ { "key":
     * "scope", "value": "zones/us-east1-d" }
     * @return value or {@code null} for none
     */
    public java.util.List<Data> getData() {
      return data;
    }

    /**
     * [Output Only] Metadata about this warning in key: value format. For example: "data": [ { "key":
     * "scope", "value": "zones/us-east1-d" }
     * @param data data or {@code null} for none
     */
    public Warnings setData(java.util.List<Data> data) {
      this.data = data;
      return this;
    }

    /**
     * [Output Only] A human-readable description of the warning code.
     * @return value or {@code null} for none
     */
    public java.lang.String getMessage() {
      return message;
    }

    /**
     * [Output Only] A human-readable description of the warning code.
     * @param message message or {@code null} for none
     */
    public Warnings setMessage(java.lang.String message) {
      this.message = message;
      return this;
    }

    @Override
    public Warnings set(String fieldName, Object value) {
      return (Warnings) super.set(fieldName, value);
    }

    @Override
    public Warnings clone() {
      return (Warnings) super.clone();
    }

    /**
     * Model definition for ResourceUpdateWarningsData.
     */
    public static final class Data extends com.google.api.client.json.GenericJson {

      /**
       * [Output Only] A key that provides more detail on the warning being returned. For example, for
       * warnings where there are no results in a list request for a particular zone, this key might be
       * scope and the key value might be the zone name. Other examples might be a key indicating a
       * deprecated resource and a suggested replacement, or a warning about invalid network settings
       * (for example, if an instance attempts to perform IP forwarding but is not enabled for IP
       * forwarding).
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String key;

      /**
       * [Output Only] A warning data value corresponding to the key.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String value;

      /**
       * [Output Only] A key that provides more detail on the warning being returned. For example, for
       * warnings where there are no results in a list request for a particular zone, this key might be
       * scope and the key value might be the zone name. Other examples might be a key indicating a
       * deprecated resource and a suggested replacement, or a warning about invalid network settings
       * (for example, if an instance attempts to perform IP forwarding but is not enabled for IP
       * forwarding).
       * @return value or {@code null} for none
       */
      public java.lang.String getKey() {
        return key;
      }

      /**
       * [Output Only] A key that provides more detail on the warning being returned. For example, for
       * warnings where there are no results in a list request for a particular zone, this key might be
       * scope and the key value might be the zone name. Other examples might be a key indicating a
       * deprecated resource and a suggested replacement, or a warning about invalid network settings
       * (for example, if an instance attempts to perform IP forwarding but is not enabled for IP
       * forwarding).
       * @param key key or {@code null} for none
       */
      public Data setKey(java.lang.String key) {
        this.key = key;
        return this;
      }

      /**
       * [Output Only] A warning data value corresponding to the key.
       * @return value or {@code null} for none
       */
      public java.lang.String getValue() {
        return value;
      }

      /**
       * [Output Only] A warning data value corresponding to the key.
       * @param value value or {@code null} for none
       */
      public Data setValue(java.lang.String value) {
        this.value = value;
        return this;
      }

      @Override
      public Data set(String fieldName, Object value) {
        return (Data) super.set(fieldName, value);
      }

      @Override
      public Data clone() {
        return (Data) super.clone();
      }

    }
  }

}
