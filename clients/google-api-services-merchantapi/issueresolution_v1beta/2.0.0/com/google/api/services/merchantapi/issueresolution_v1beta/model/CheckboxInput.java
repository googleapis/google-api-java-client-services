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
 * Checkbox input allows the business to provide a boolean value. Corresponds to the [html input
 * type=checkbox](https://www.w3.org/TR/2012/WD-html-
 * markup-20121025/input.checkbox.html#input.checkbox). If the business checks the box, the input
 * value for the field is `true`, otherwise it is `false`. This type of input is often used as a
 * confirmation that the business completed required steps before they are allowed to start the
 * action. In such a case, the input field is marked as required and the button to trigger the
 * action should stay disabled until the business checks the box.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Merchant API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CheckboxInput extends com.google.api.client.json.GenericJson {

  @Override
  public CheckboxInput set(String fieldName, Object value) {
    return (CheckboxInput) super.set(fieldName, value);
  }

  @Override
  public CheckboxInput clone() {
    return (CheckboxInput) super.clone();
  }

}
