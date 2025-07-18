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

package com.google.api.services.directory.model;

/**
 * Managing your account's organizational units allows you to configure your users' access to
 * services and custom settings. For more information about common organizational unit tasks, see
 * the [Developer's Guide](https://developers.google.com/workspace/admin/directory/v1/guides/manage-
 * org-units.html). The customer's organizational unit hierarchy is limited to 35 levels of depth.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin SDK API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OrgUnit extends com.google.api.client.json.GenericJson {

  /**
   * This field is deprecated and setting its value has no effect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean blockInheritance;

  /**
   * Description of the organizational unit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * ETag of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The type of the API resource. For Orgunits resources, the value is `admin#directory#orgUnit`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The organizational unit's path name. For example, an organizational unit's name within the
   * /corp/support/sales_support parent path is sales_support. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The unique ID of the organizational unit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orgUnitId;

  /**
   * The full path to the organizational unit. The `orgUnitPath` is a derived property. When listed,
   * it is derived from `parentOrgunitPath` and organizational unit's `name`. For example, for an
   * organizational unit named 'apps' under parent organization '/engineering', the orgUnitPath is
   * '/engineering/apps'. In order to edit an `orgUnitPath`, either update the name of the
   * organization or the `parentOrgunitPath`. A user's organizational unit determines which Google
   * Workspace services the user has access to. If the user is moved to a new organization, the
   * user's access changes. For more information about organization structures, see the
   * [administration help center](https://support.google.com/a/answer/4352075). For more information
   * about moving a user to a different organization, see [Update a
   * user](https://developers.google.com/workspace/admin/directory/v1/guides/manage-
   * users.html#update_user).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orgUnitPath;

  /**
   * The unique ID of the parent organizational unit. Required, unless `parentOrgUnitPath` is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parentOrgUnitId;

  /**
   * The organizational unit's parent path. For example, /corp/sales is the parent path for
   * /corp/sales/sales_support organizational unit. Required, unless `parentOrgUnitId` is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parentOrgUnitPath;

  /**
   * This field is deprecated and setting its value has no effect.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBlockInheritance() {
    return blockInheritance;
  }

  /**
   * This field is deprecated and setting its value has no effect.
   * @param blockInheritance blockInheritance or {@code null} for none
   */
  public OrgUnit setBlockInheritance(java.lang.Boolean blockInheritance) {
    this.blockInheritance = blockInheritance;
    return this;
  }

  /**
   * Description of the organizational unit.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of the organizational unit.
   * @param description description or {@code null} for none
   */
  public OrgUnit setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * ETag of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * ETag of the resource.
   * @param etag etag or {@code null} for none
   */
  public OrgUnit setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The type of the API resource. For Orgunits resources, the value is `admin#directory#orgUnit`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The type of the API resource. For Orgunits resources, the value is `admin#directory#orgUnit`.
   * @param kind kind or {@code null} for none
   */
  public OrgUnit setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The organizational unit's path name. For example, an organizational unit's name within the
   * /corp/support/sales_support parent path is sales_support. Required.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The organizational unit's path name. For example, an organizational unit's name within the
   * /corp/support/sales_support parent path is sales_support. Required.
   * @param name name or {@code null} for none
   */
  public OrgUnit setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The unique ID of the organizational unit.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrgUnitId() {
    return orgUnitId;
  }

  /**
   * The unique ID of the organizational unit.
   * @param orgUnitId orgUnitId or {@code null} for none
   */
  public OrgUnit setOrgUnitId(java.lang.String orgUnitId) {
    this.orgUnitId = orgUnitId;
    return this;
  }

  /**
   * The full path to the organizational unit. The `orgUnitPath` is a derived property. When listed,
   * it is derived from `parentOrgunitPath` and organizational unit's `name`. For example, for an
   * organizational unit named 'apps' under parent organization '/engineering', the orgUnitPath is
   * '/engineering/apps'. In order to edit an `orgUnitPath`, either update the name of the
   * organization or the `parentOrgunitPath`. A user's organizational unit determines which Google
   * Workspace services the user has access to. If the user is moved to a new organization, the
   * user's access changes. For more information about organization structures, see the
   * [administration help center](https://support.google.com/a/answer/4352075). For more information
   * about moving a user to a different organization, see [Update a
   * user](https://developers.google.com/workspace/admin/directory/v1/guides/manage-
   * users.html#update_user).
   * @return value or {@code null} for none
   */
  public java.lang.String getOrgUnitPath() {
    return orgUnitPath;
  }

  /**
   * The full path to the organizational unit. The `orgUnitPath` is a derived property. When listed,
   * it is derived from `parentOrgunitPath` and organizational unit's `name`. For example, for an
   * organizational unit named 'apps' under parent organization '/engineering', the orgUnitPath is
   * '/engineering/apps'. In order to edit an `orgUnitPath`, either update the name of the
   * organization or the `parentOrgunitPath`. A user's organizational unit determines which Google
   * Workspace services the user has access to. If the user is moved to a new organization, the
   * user's access changes. For more information about organization structures, see the
   * [administration help center](https://support.google.com/a/answer/4352075). For more information
   * about moving a user to a different organization, see [Update a
   * user](https://developers.google.com/workspace/admin/directory/v1/guides/manage-
   * users.html#update_user).
   * @param orgUnitPath orgUnitPath or {@code null} for none
   */
  public OrgUnit setOrgUnitPath(java.lang.String orgUnitPath) {
    this.orgUnitPath = orgUnitPath;
    return this;
  }

  /**
   * The unique ID of the parent organizational unit. Required, unless `parentOrgUnitPath` is set.
   * @return value or {@code null} for none
   */
  public java.lang.String getParentOrgUnitId() {
    return parentOrgUnitId;
  }

  /**
   * The unique ID of the parent organizational unit. Required, unless `parentOrgUnitPath` is set.
   * @param parentOrgUnitId parentOrgUnitId or {@code null} for none
   */
  public OrgUnit setParentOrgUnitId(java.lang.String parentOrgUnitId) {
    this.parentOrgUnitId = parentOrgUnitId;
    return this;
  }

  /**
   * The organizational unit's parent path. For example, /corp/sales is the parent path for
   * /corp/sales/sales_support organizational unit. Required, unless `parentOrgUnitId` is set.
   * @return value or {@code null} for none
   */
  public java.lang.String getParentOrgUnitPath() {
    return parentOrgUnitPath;
  }

  /**
   * The organizational unit's parent path. For example, /corp/sales is the parent path for
   * /corp/sales/sales_support organizational unit. Required, unless `parentOrgUnitId` is set.
   * @param parentOrgUnitPath parentOrgUnitPath or {@code null} for none
   */
  public OrgUnit setParentOrgUnitPath(java.lang.String parentOrgUnitPath) {
    this.parentOrgUnitPath = parentOrgUnitPath;
    return this;
  }

  @Override
  public OrgUnit set(String fieldName, Object value) {
    return (OrgUnit) super.set(fieldName, value);
  }

  @Override
  public OrgUnit clone() {
    return (OrgUnit) super.clone();
  }

}
