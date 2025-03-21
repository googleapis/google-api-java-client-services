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

package com.google.api.services.discoveryengine.v1.model;

/**
 * `BucketOptions` describes the bucket boundaries used to create a histogram for the distribution.
 * The buckets can be in a linear sequence, an exponential sequence, or each bucket can be specified
 * explicitly. `BucketOptions` does not include the number of values in each bucket. A bucket has an
 * inclusive lower bound and exclusive upper bound for the values that are counted for that bucket.
 * The upper bound of a bucket must be strictly greater than the lower bound. The sequence of N
 * buckets for a distribution consists of an underflow bucket (number 0), zero or more finite
 * buckets (number 1 through N - 2) and an overflow bucket (number N - 1). The buckets are
 * contiguous: the lower bound of bucket i (i > 0) is the same as the upper bound of bucket i - 1.
 * The buckets span the whole range of finite values: lower bound of the underflow bucket is
 * -infinity and the upper bound of the overflow bucket is +infinity. The finite buckets are so-
 * called because both bounds are finite.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleApiDistributionBucketOptions extends com.google.api.client.json.GenericJson {

  /**
   * The explicit buckets.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleApiDistributionBucketOptionsExplicit explicitBuckets;

  /**
   * The exponential buckets.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleApiDistributionBucketOptionsExponential exponentialBuckets;

  /**
   * The linear bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleApiDistributionBucketOptionsLinear linearBuckets;

  /**
   * The explicit buckets.
   * @return value or {@code null} for none
   */
  public GoogleApiDistributionBucketOptionsExplicit getExplicitBuckets() {
    return explicitBuckets;
  }

  /**
   * The explicit buckets.
   * @param explicitBuckets explicitBuckets or {@code null} for none
   */
  public GoogleApiDistributionBucketOptions setExplicitBuckets(GoogleApiDistributionBucketOptionsExplicit explicitBuckets) {
    this.explicitBuckets = explicitBuckets;
    return this;
  }

  /**
   * The exponential buckets.
   * @return value or {@code null} for none
   */
  public GoogleApiDistributionBucketOptionsExponential getExponentialBuckets() {
    return exponentialBuckets;
  }

  /**
   * The exponential buckets.
   * @param exponentialBuckets exponentialBuckets or {@code null} for none
   */
  public GoogleApiDistributionBucketOptions setExponentialBuckets(GoogleApiDistributionBucketOptionsExponential exponentialBuckets) {
    this.exponentialBuckets = exponentialBuckets;
    return this;
  }

  /**
   * The linear bucket.
   * @return value or {@code null} for none
   */
  public GoogleApiDistributionBucketOptionsLinear getLinearBuckets() {
    return linearBuckets;
  }

  /**
   * The linear bucket.
   * @param linearBuckets linearBuckets or {@code null} for none
   */
  public GoogleApiDistributionBucketOptions setLinearBuckets(GoogleApiDistributionBucketOptionsLinear linearBuckets) {
    this.linearBuckets = linearBuckets;
    return this;
  }

  @Override
  public GoogleApiDistributionBucketOptions set(String fieldName, Object value) {
    return (GoogleApiDistributionBucketOptions) super.set(fieldName, value);
  }

  @Override
  public GoogleApiDistributionBucketOptions clone() {
    return (GoogleApiDistributionBucketOptions) super.clone();
  }

}
