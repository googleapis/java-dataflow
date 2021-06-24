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
// source: google/dataflow/v1beta3/streaming.proto

package com.google.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * Streaming appliance snapshot configuration.
 * </pre>
 *
 * Protobuf type {@code google.dataflow.v1beta3.StreamingApplianceSnapshotConfig}
 */
public final class StreamingApplianceSnapshotConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.dataflow.v1beta3.StreamingApplianceSnapshotConfig)
    StreamingApplianceSnapshotConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StreamingApplianceSnapshotConfig.newBuilder() to construct.
  private StreamingApplianceSnapshotConfig(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StreamingApplianceSnapshotConfig() {
    snapshotId_ = "";
    importStateEndpoint_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StreamingApplianceSnapshotConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private StreamingApplianceSnapshotConfig(
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

              snapshotId_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              importStateEndpoint_ = s;
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
    return com.google.dataflow.v1beta3.StreamingProto
        .internal_static_google_dataflow_v1beta3_StreamingApplianceSnapshotConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.dataflow.v1beta3.StreamingProto
        .internal_static_google_dataflow_v1beta3_StreamingApplianceSnapshotConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig.class,
            com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig.Builder.class);
  }

  public static final int SNAPSHOT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object snapshotId_;
  /**
   *
   *
   * <pre>
   * If set, indicates the snapshot id for the snapshot being performed.
   * </pre>
   *
   * <code>string snapshot_id = 1;</code>
   *
   * @return The snapshotId.
   */
  @java.lang.Override
  public java.lang.String getSnapshotId() {
    java.lang.Object ref = snapshotId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      snapshotId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * If set, indicates the snapshot id for the snapshot being performed.
   * </pre>
   *
   * <code>string snapshot_id = 1;</code>
   *
   * @return The bytes for snapshotId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSnapshotIdBytes() {
    java.lang.Object ref = snapshotId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      snapshotId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IMPORT_STATE_ENDPOINT_FIELD_NUMBER = 2;
  private volatile java.lang.Object importStateEndpoint_;
  /**
   *
   *
   * <pre>
   * Indicates which endpoint is used to import appliance state.
   * </pre>
   *
   * <code>string import_state_endpoint = 2;</code>
   *
   * @return The importStateEndpoint.
   */
  @java.lang.Override
  public java.lang.String getImportStateEndpoint() {
    java.lang.Object ref = importStateEndpoint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      importStateEndpoint_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Indicates which endpoint is used to import appliance state.
   * </pre>
   *
   * <code>string import_state_endpoint = 2;</code>
   *
   * @return The bytes for importStateEndpoint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getImportStateEndpointBytes() {
    java.lang.Object ref = importStateEndpoint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      importStateEndpoint_ = b;
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
    if (!getSnapshotIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, snapshotId_);
    }
    if (!getImportStateEndpointBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, importStateEndpoint_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSnapshotIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, snapshotId_);
    }
    if (!getImportStateEndpointBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, importStateEndpoint_);
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
    if (!(obj instanceof com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig)) {
      return super.equals(obj);
    }
    com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig other =
        (com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig) obj;

    if (!getSnapshotId().equals(other.getSnapshotId())) return false;
    if (!getImportStateEndpoint().equals(other.getImportStateEndpoint())) return false;
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
    hash = (37 * hash) + SNAPSHOT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSnapshotId().hashCode();
    hash = (37 * hash) + IMPORT_STATE_ENDPOINT_FIELD_NUMBER;
    hash = (53 * hash) + getImportStateEndpoint().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig parseFrom(
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
      com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig prototype) {
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
   * Streaming appliance snapshot configuration.
   * </pre>
   *
   * Protobuf type {@code google.dataflow.v1beta3.StreamingApplianceSnapshotConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.dataflow.v1beta3.StreamingApplianceSnapshotConfig)
      com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.dataflow.v1beta3.StreamingProto
          .internal_static_google_dataflow_v1beta3_StreamingApplianceSnapshotConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.dataflow.v1beta3.StreamingProto
          .internal_static_google_dataflow_v1beta3_StreamingApplianceSnapshotConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig.class,
              com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig.Builder.class);
    }

    // Construct using com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig.newBuilder()
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
      snapshotId_ = "";

      importStateEndpoint_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.dataflow.v1beta3.StreamingProto
          .internal_static_google_dataflow_v1beta3_StreamingApplianceSnapshotConfig_descriptor;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig
        getDefaultInstanceForType() {
      return com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig build() {
      com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig buildPartial() {
      com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig result =
          new com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig(this);
      result.snapshotId_ = snapshotId_;
      result.importStateEndpoint_ = importStateEndpoint_;
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
      if (other instanceof com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig) {
        return mergeFrom((com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig other) {
      if (other
          == com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig.getDefaultInstance())
        return this;
      if (!other.getSnapshotId().isEmpty()) {
        snapshotId_ = other.snapshotId_;
        onChanged();
      }
      if (!other.getImportStateEndpoint().isEmpty()) {
        importStateEndpoint_ = other.importStateEndpoint_;
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
      com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object snapshotId_ = "";
    /**
     *
     *
     * <pre>
     * If set, indicates the snapshot id for the snapshot being performed.
     * </pre>
     *
     * <code>string snapshot_id = 1;</code>
     *
     * @return The snapshotId.
     */
    public java.lang.String getSnapshotId() {
      java.lang.Object ref = snapshotId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        snapshotId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If set, indicates the snapshot id for the snapshot being performed.
     * </pre>
     *
     * <code>string snapshot_id = 1;</code>
     *
     * @return The bytes for snapshotId.
     */
    public com.google.protobuf.ByteString getSnapshotIdBytes() {
      java.lang.Object ref = snapshotId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        snapshotId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If set, indicates the snapshot id for the snapshot being performed.
     * </pre>
     *
     * <code>string snapshot_id = 1;</code>
     *
     * @param value The snapshotId to set.
     * @return This builder for chaining.
     */
    public Builder setSnapshotId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      snapshotId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If set, indicates the snapshot id for the snapshot being performed.
     * </pre>
     *
     * <code>string snapshot_id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSnapshotId() {

      snapshotId_ = getDefaultInstance().getSnapshotId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If set, indicates the snapshot id for the snapshot being performed.
     * </pre>
     *
     * <code>string snapshot_id = 1;</code>
     *
     * @param value The bytes for snapshotId to set.
     * @return This builder for chaining.
     */
    public Builder setSnapshotIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      snapshotId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object importStateEndpoint_ = "";
    /**
     *
     *
     * <pre>
     * Indicates which endpoint is used to import appliance state.
     * </pre>
     *
     * <code>string import_state_endpoint = 2;</code>
     *
     * @return The importStateEndpoint.
     */
    public java.lang.String getImportStateEndpoint() {
      java.lang.Object ref = importStateEndpoint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        importStateEndpoint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Indicates which endpoint is used to import appliance state.
     * </pre>
     *
     * <code>string import_state_endpoint = 2;</code>
     *
     * @return The bytes for importStateEndpoint.
     */
    public com.google.protobuf.ByteString getImportStateEndpointBytes() {
      java.lang.Object ref = importStateEndpoint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        importStateEndpoint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Indicates which endpoint is used to import appliance state.
     * </pre>
     *
     * <code>string import_state_endpoint = 2;</code>
     *
     * @param value The importStateEndpoint to set.
     * @return This builder for chaining.
     */
    public Builder setImportStateEndpoint(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      importStateEndpoint_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates which endpoint is used to import appliance state.
     * </pre>
     *
     * <code>string import_state_endpoint = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearImportStateEndpoint() {

      importStateEndpoint_ = getDefaultInstance().getImportStateEndpoint();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates which endpoint is used to import appliance state.
     * </pre>
     *
     * <code>string import_state_endpoint = 2;</code>
     *
     * @param value The bytes for importStateEndpoint to set.
     * @return This builder for chaining.
     */
    public Builder setImportStateEndpointBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      importStateEndpoint_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.dataflow.v1beta3.StreamingApplianceSnapshotConfig)
  }

  // @@protoc_insertion_point(class_scope:google.dataflow.v1beta3.StreamingApplianceSnapshotConfig)
  private static final com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig();
  }

  public static com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamingApplianceSnapshotConfig> PARSER =
      new com.google.protobuf.AbstractParser<StreamingApplianceSnapshotConfig>() {
        @java.lang.Override
        public StreamingApplianceSnapshotConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new StreamingApplianceSnapshotConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<StreamingApplianceSnapshotConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamingApplianceSnapshotConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.dataflow.v1beta3.StreamingApplianceSnapshotConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
