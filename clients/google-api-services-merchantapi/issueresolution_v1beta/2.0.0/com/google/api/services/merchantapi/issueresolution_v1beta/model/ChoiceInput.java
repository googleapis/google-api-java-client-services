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

package com.google.api.services.merchantapi.issueresolution_v1beta.model;

/**
 * Choice input allows the business to select one of the offered choices. Some choices may be linked
 * to additional input fields that should be displayed under or next to the choice option. The value
 * for the additional input field needs to be provided only when the specific choice is selected by
 * the the business. For example, additional input field can be hidden or disabled until the
 * business selects the specific choice.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Merchant API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ChoiceInput extends com.google.api.client.json.GenericJson {

  /**
   * A list of choices. Only one option can be selected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ChoiceInputOption> options;

  /**
   * A list of choices. Only one option can be selected.
   * @return value or {@code null} for none
   */
  public java.util.List<ChoiceInputOption> getOptions() {
    return options;
  }

  /**
   * A list of choices. Only one option can be selected.
   * @param options options or {@code null} for none
   */
  public ChoiceInput setOptions(java.util.List<ChoiceInputOption> options) {
    this.options = options;
    return this;
  }

  @Override
  public ChoiceInput set(String fieldName, Object value) {
    return (ChoiceInput) super.set(fieldName, value);
  }

  @Override
  public ChoiceInput clone() {
    return (ChoiceInput) super.clone();
  }

}
