/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/templates.proto

package com.google.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * Params which should be passed when launching a dynamic template.
 * </pre>
 *
 * Protobuf type {@code google.dataflow.v1beta3.DynamicTemplateLaunchParams}
 */
public final class DynamicTemplateLaunchParams extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.dataflow.v1beta3.DynamicTemplateLaunchParams)
    DynamicTemplateLaunchParamsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DynamicTemplateLaunchParams.newBuilder() to construct.
  private DynamicTemplateLaunchParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DynamicTemplateLaunchParams() {
    gcsPath_ = "";
    stagingLocation_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DynamicTemplateLaunchParams();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private DynamicTemplateLaunchParams(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              gcsPath_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              stagingLocation_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.dataflow.v1beta3.TemplatesProto
        .internal_static_google_dataflow_v1beta3_DynamicTemplateLaunchParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.dataflow.v1beta3.TemplatesProto
        .internal_static_google_dataflow_v1beta3_DynamicTemplateLaunchParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.dataflow.v1beta3.DynamicTemplateLaunchParams.class,
            com.google.dataflow.v1beta3.DynamicTemplateLaunchParams.Builder.class);
  }

  public static final int GCS_PATH_FIELD_NUMBER = 1;
  private volatile java.lang.Object gcsPath_;
  /**
   *
   *
   * <pre>
   * Path to dynamic template spec file on Cloud Storage.
   * The file must be a Json serialized DynamicTemplateFieSpec object.
   * </pre>
   *
   * <code>string gcs_path = 1;</code>
   *
   * @return The gcsPath.
   */
  @java.lang.Override
  public java.lang.String getGcsPath() {
    java.lang.Object ref = gcsPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gcsPath_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Path to dynamic template spec file on Cloud Storage.
   * The file must be a Json serialized DynamicTemplateFieSpec object.
   * </pre>
   *
   * <code>string gcs_path = 1;</code>
   *
   * @return The bytes for gcsPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getGcsPathBytes() {
    java.lang.Object ref = gcsPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      gcsPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STAGING_LOCATION_FIELD_NUMBER = 2;
  private volatile java.lang.Object stagingLocation_;
  /**
   *
   *
   * <pre>
   * Cloud Storage path for staging dependencies.
   * Must be a valid Cloud Storage URL, beginning with `gs://`.
   * </pre>
   *
   * <code>string staging_location = 2;</code>
   *
   * @return The stagingLocation.
   */
  @java.lang.Override
  public java.lang.String getStagingLocation() {
    java.lang.Object ref = stagingLocation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stagingLocation_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Cloud Storage path for staging dependencies.
   * Must be a valid Cloud Storage URL, beginning with `gs://`.
   * </pre>
   *
   * <code>string staging_location = 2;</code>
   *
   * @return The bytes for stagingLocation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getStagingLocationBytes() {
    java.lang.Object ref = stagingLocation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      stagingLocation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getGcsPathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, gcsPath_);
    }
    if (!getStagingLocationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, stagingLocation_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getGcsPathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, gcsPath_);
    }
    if (!getStagingLocationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, stagingLocation_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.dataflow.v1beta3.DynamicTemplateLaunchParams)) {
      return super.equals(obj);
    }
    com.google.dataflow.v1beta3.DynamicTemplateLaunchParams other =
        (com.google.dataflow.v1beta3.DynamicTemplateLaunchParams) obj;

    if (!getGcsPath().equals(other.getGcsPath())) return false;
    if (!getStagingLocation().equals(other.getStagingLocation())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + GCS_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getGcsPath().hashCode();
    hash = (37 * hash) + STAGING_LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getStagingLocation().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.dataflow.v1beta3.DynamicTemplateLaunchParams parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.DynamicTemplateLaunchParams parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.DynamicTemplateLaunchParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.DynamicTemplateLaunchParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.DynamicTemplateLaunchParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.DynamicTemplateLaunchParams parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.DynamicTemplateLaunchParams parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.DynamicTemplateLaunchParams parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.DynamicTemplateLaunchParams parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.DynamicTemplateLaunchParams parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.DynamicTemplateLaunchParams parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.DynamicTemplateLaunchParams parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.dataflow.v1beta3.DynamicTemplateLaunchParams prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Params which should be passed when launching a dynamic template.
   * </pre>
   *
   * Protobuf type {@code google.dataflow.v1beta3.DynamicTemplateLaunchParams}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.dataflow.v1beta3.DynamicTemplateLaunchParams)
      com.google.dataflow.v1beta3.DynamicTemplateLaunchParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.dataflow.v1beta3.TemplatesProto
          .internal_static_google_dataflow_v1beta3_DynamicTemplateLaunchParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.dataflow.v1beta3.TemplatesProto
          .internal_static_google_dataflow_v1beta3_DynamicTemplateLaunchParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.dataflow.v1beta3.DynamicTemplateLaunchParams.class,
              com.google.dataflow.v1beta3.DynamicTemplateLaunchParams.Builder.class);
    }

    // Construct using com.google.dataflow.v1beta3.DynamicTemplateLaunchParams.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      gcsPath_ = "";

      stagingLocation_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.dataflow.v1beta3.TemplatesProto
          .internal_static_google_dataflow_v1beta3_DynamicTemplateLaunchParams_descriptor;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.DynamicTemplateLaunchParams getDefaultInstanceForType() {
      return com.google.dataflow.v1beta3.DynamicTemplateLaunchParams.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.DynamicTemplateLaunchParams build() {
      com.google.dataflow.v1beta3.DynamicTemplateLaunchParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.DynamicTemplateLaunchParams buildPartial() {
      com.google.dataflow.v1beta3.DynamicTemplateLaunchParams result =
          new com.google.dataflow.v1beta3.DynamicTemplateLaunchParams(this);
      result.gcsPath_ = gcsPath_;
      result.stagingLocation_ = stagingLocation_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.dataflow.v1beta3.DynamicTemplateLaunchParams) {
        return mergeFrom((com.google.dataflow.v1beta3.DynamicTemplateLaunchParams) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.dataflow.v1beta3.DynamicTemplateLaunchParams other) {
      if (other == com.google.dataflow.v1beta3.DynamicTemplateLaunchParams.getDefaultInstance())
        return this;
      if (!other.getGcsPath().isEmpty()) {
        gcsPath_ = other.gcsPath_;
        onChanged();
      }
      if (!other.getStagingLocation().isEmpty()) {
        stagingLocation_ = other.stagingLocation_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.dataflow.v1beta3.DynamicTemplateLaunchParams parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.dataflow.v1beta3.DynamicTemplateLaunchParams) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object gcsPath_ = "";
    /**
     *
     *
     * <pre>
     * Path to dynamic template spec file on Cloud Storage.
     * The file must be a Json serialized DynamicTemplateFieSpec object.
     * </pre>
     *
     * <code>string gcs_path = 1;</code>
     *
     * @return The gcsPath.
     */
    public java.lang.String getGcsPath() {
      java.lang.Object ref = gcsPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gcsPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Path to dynamic template spec file on Cloud Storage.
     * The file must be a Json serialized DynamicTemplateFieSpec object.
     * </pre>
     *
     * <code>string gcs_path = 1;</code>
     *
     * @return The bytes for gcsPath.
     */
    public com.google.protobuf.ByteString getGcsPathBytes() {
      java.lang.Object ref = gcsPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        gcsPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Path to dynamic template spec file on Cloud Storage.
     * The file must be a Json serialized DynamicTemplateFieSpec object.
     * </pre>
     *
     * <code>string gcs_path = 1;</code>
     *
     * @param value The gcsPath to set.
     * @return This builder for chaining.
     */
    public Builder setGcsPath(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      gcsPath_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Path to dynamic template spec file on Cloud Storage.
     * The file must be a Json serialized DynamicTemplateFieSpec object.
     * </pre>
     *
     * <code>string gcs_path = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGcsPath() {

      gcsPath_ = getDefaultInstance().getGcsPath();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Path to dynamic template spec file on Cloud Storage.
     * The file must be a Json serialized DynamicTemplateFieSpec object.
     * </pre>
     *
     * <code>string gcs_path = 1;</code>
     *
     * @param value The bytes for gcsPath to set.
     * @return This builder for chaining.
     */
    public Builder setGcsPathBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      gcsPath_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object stagingLocation_ = "";
    /**
     *
     *
     * <pre>
     * Cloud Storage path for staging dependencies.
     * Must be a valid Cloud Storage URL, beginning with `gs://`.
     * </pre>
     *
     * <code>string staging_location = 2;</code>
     *
     * @return The stagingLocation.
     */
    public java.lang.String getStagingLocation() {
      java.lang.Object ref = stagingLocation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stagingLocation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage path for staging dependencies.
     * Must be a valid Cloud Storage URL, beginning with `gs://`.
     * </pre>
     *
     * <code>string staging_location = 2;</code>
     *
     * @return The bytes for stagingLocation.
     */
    public com.google.protobuf.ByteString getStagingLocationBytes() {
      java.lang.Object ref = stagingLocation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        stagingLocation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage path for staging dependencies.
     * Must be a valid Cloud Storage URL, beginning with `gs://`.
     * </pre>
     *
     * <code>string staging_location = 2;</code>
     *
     * @param value The stagingLocation to set.
     * @return This builder for chaining.
     */
    public Builder setStagingLocation(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      stagingLocation_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage path for staging dependencies.
     * Must be a valid Cloud Storage URL, beginning with `gs://`.
     * </pre>
     *
     * <code>string staging_location = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStagingLocation() {

      stagingLocation_ = getDefaultInstance().getStagingLocation();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage path for staging dependencies.
     * Must be a valid Cloud Storage URL, beginning with `gs://`.
     * </pre>
     *
     * <code>string staging_location = 2;</code>
     *
     * @param value The bytes for stagingLocation to set.
     * @return This builder for chaining.
     */
    public Builder setStagingLocationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      stagingLocation_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.dataflow.v1beta3.DynamicTemplateLaunchParams)
  }

  // @@protoc_insertion_point(class_scope:google.dataflow.v1beta3.DynamicTemplateLaunchParams)
  private static final com.google.dataflow.v1beta3.DynamicTemplateLaunchParams DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.dataflow.v1beta3.DynamicTemplateLaunchParams();
  }

  public static com.google.dataflow.v1beta3.DynamicTemplateLaunchParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DynamicTemplateLaunchParams> PARSER =
      new com.google.protobuf.AbstractParser<DynamicTemplateLaunchParams>() {
        @java.lang.Override
        public DynamicTemplateLaunchParams parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new DynamicTemplateLaunchParams(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<DynamicTemplateLaunchParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DynamicTemplateLaunchParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.dataflow.v1beta3.DynamicTemplateLaunchParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
