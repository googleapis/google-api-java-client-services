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

package com.google.api.services.youtube.model;

/**
 * Pings that the app shall fire (authenticated by biscotti cookie). Each ping has a context, in
 * which the app must fire the ping, and a url identifying the ping.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ChannelConversionPing extends com.google.api.client.json.GenericJson {

  /**
   * Defines the context of the ping.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String context;

  /**
   * The url (without the schema) that the player shall send the ping to. It's at caller's
   * descretion to decide which schema to use (http vs https) Example of a returned url:
   * //googleads.g.doubleclick.net/pagead/
   * viewthroughconversion/962985656/?data=path%3DtHe_path%3Btype%3D
   * cview%3Butuid%3DGISQtTNGYqaYl4sKxoVvKA&labe=default The caller must append biscotti
   * authentication (ms param in case of mobile, for example) to this ping.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String conversionUrl;

  /**
   * Defines the context of the ping.
   * @return value or {@code null} for none
   */
  public java.lang.String getContext() {
    return context;
  }

  /**
   * Defines the context of the ping.
   * @param context context or {@code null} for none
   */
  public ChannelConversionPing setContext(java.lang.String context) {
    this.context = context;
    return this;
  }

  /**
   * The url (without the schema) that the player shall send the ping to. It's at caller's
   * descretion to decide which schema to use (http vs https) Example of a returned url:
   * //googleads.g.doubleclick.net/pagead/
   * viewthroughconversion/962985656/?data=path%3DtHe_path%3Btype%3D
   * cview%3Butuid%3DGISQtTNGYqaYl4sKxoVvKA&labe=default The caller must append biscotti
   * authentication (ms param in case of mobile, for example) to this ping.
   * @return value or {@code null} for none
   */
  public java.lang.String getConversionUrl() {
    return conversionUrl;
  }

  /**
   * The url (without the schema) that the player shall send the ping to. It's at caller's
   * descretion to decide which schema to use (http vs https) Example of a returned url:
   * //googleads.g.doubleclick.net/pagead/
   * viewthroughconversion/962985656/?data=path%3DtHe_path%3Btype%3D
   * cview%3Butuid%3DGISQtTNGYqaYl4sKxoVvKA&labe=default The caller must append biscotti
   * authentication (ms param in case of mobile, for example) to this ping.
   * @param conversionUrl conversionUrl or {@code null} for none
   */
  public ChannelConversionPing setConversionUrl(java.lang.String conversionUrl) {
    this.conversionUrl = conversionUrl;
    return this;
  }

  @Override
  public ChannelConversionPing set(String fieldName, Object value) {
    return (ChannelConversionPing) super.set(fieldName, value);
  }

  @Override
  public ChannelConversionPing clone() {
    return (ChannelConversionPing) super.clone();
  }

}
