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

package com.google.api.services.gkehub.v1.model;

/**
 * List of MembershipBindings.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListMembershipBindingsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The list of membership_bindings
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MembershipBinding> membershipBindings;

  /**
   * A token to request the next page of resources from the `ListMembershipBindings` method. The
   * value of an empty string means that there are no more resources to return.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of locations that could not be reached while fetching this list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> unreachable;

  /**
   * The list of membership_bindings
   * @return value or {@code null} for none
   */
  public java.util.List<MembershipBinding> getMembershipBindings() {
    return membershipBindings;
  }

  /**
   * The list of membership_bindings
   * @param membershipBindings membershipBindings or {@code null} for none
   */
  public ListMembershipBindingsResponse setMembershipBindings(java.util.List<MembershipBinding> membershipBindings) {
    this.membershipBindings = membershipBindings;
    return this;
  }

  /**
   * A token to request the next page of resources from the `ListMembershipBindings` method. The
   * value of an empty string means that there are no more resources to return.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token to request the next page of resources from the `ListMembershipBindings` method. The
   * value of an empty string means that there are no more resources to return.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListMembershipBindingsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * List of locations that could not be reached while fetching this list.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUnreachable() {
    return unreachable;
  }

  /**
   * List of locations that could not be reached while fetching this list.
   * @param unreachable unreachable or {@code null} for none
   */
  public ListMembershipBindingsResponse setUnreachable(java.util.List<java.lang.String> unreachable) {
    this.unreachable = unreachable;
    return this;
  }

  @Override
  public ListMembershipBindingsResponse set(String fieldName, Object value) {
    return (ListMembershipBindingsResponse) super.set(fieldName, value);
  }

  @Override
  public ListMembershipBindingsResponse clone() {
    return (ListMembershipBindingsResponse) super.clone();
  }

}
