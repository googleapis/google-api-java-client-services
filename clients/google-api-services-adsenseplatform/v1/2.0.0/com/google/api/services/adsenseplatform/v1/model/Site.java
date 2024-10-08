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

package com.google.api.services.adsenseplatform.v1.model;

/**
 * Representation of a Site.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdSense Platform API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Site extends com.google.api.client.json.GenericJson {

  /**
   * Domain/sub-domain of the site. Must be a valid domain complying with [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt) and formatted as punycode [RFC
   * 3492](https://www.ietf.org/rfc/rfc3492.txt) in case the domain contains unicode characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String domain;

  /**
   * Output only. Resource name of a site. Format:
   * platforms/{platform}/accounts/{account}/sites/{site}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. State of a site.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Domain/sub-domain of the site. Must be a valid domain complying with [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt) and formatted as punycode [RFC
   * 3492](https://www.ietf.org/rfc/rfc3492.txt) in case the domain contains unicode characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDomain() {
    return domain;
  }

  /**
   * Domain/sub-domain of the site. Must be a valid domain complying with [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt) and formatted as punycode [RFC
   * 3492](https://www.ietf.org/rfc/rfc3492.txt) in case the domain contains unicode characters.
   * @param domain domain or {@code null} for none
   */
  public Site setDomain(java.lang.String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Output only. Resource name of a site. Format:
   * platforms/{platform}/accounts/{account}/sites/{site}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of a site. Format:
   * platforms/{platform}/accounts/{account}/sites/{site}
   * @param name name or {@code null} for none
   */
  public Site setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. State of a site.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. State of a site.
   * @param state state or {@code null} for none
   */
  public Site setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public Site set(String fieldName, Object value) {
    return (Site) super.set(fieldName, value);
  }

  @Override
  public Site clone() {
    return (Site) super.clone();
  }

}
