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
// source: google/dataflow/v1beta3/jobs.proto

package com.google.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * Additional information about how a Cloud Dataflow job will be executed that
 * isn't contained in the submitted job.
 * </pre>
 *
 * Protobuf type {@code google.dataflow.v1beta3.JobExecutionInfo}
 */
public final class JobExecutionInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.dataflow.v1beta3.JobExecutionInfo)
    JobExecutionInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use JobExecutionInfo.newBuilder() to construct.
  private JobExecutionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private JobExecutionInfo() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new JobExecutionInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private JobExecutionInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                stages_ =
                    com.google.protobuf.MapField.newMapField(StagesDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<
                      java.lang.String, com.google.dataflow.v1beta3.JobExecutionStageInfo>
                  stages__ =
                      input.readMessage(
                          StagesDefaultEntryHolder.defaultEntry.getParserForType(),
                          extensionRegistry);
              stages_.getMutableMap().put(stages__.getKey(), stages__.getValue());
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
    return com.google.dataflow.v1beta3.JobsProto
        .internal_static_google_dataflow_v1beta3_JobExecutionInfo_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 1:
        return internalGetStages();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.dataflow.v1beta3.JobsProto
        .internal_static_google_dataflow_v1beta3_JobExecutionInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.dataflow.v1beta3.JobExecutionInfo.class,
            com.google.dataflow.v1beta3.JobExecutionInfo.Builder.class);
  }

  public static final int STAGES_FIELD_NUMBER = 1;

  private static final class StagesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
            java.lang.String, com.google.dataflow.v1beta3.JobExecutionStageInfo>
        defaultEntry =
            com.google.protobuf.MapEntry
                .<java.lang.String, com.google.dataflow.v1beta3.JobExecutionStageInfo>
                    newDefaultInstance(
                        com.google.dataflow.v1beta3.JobsProto
                            .internal_static_google_dataflow_v1beta3_JobExecutionInfo_StagesEntry_descriptor,
                        com.google.protobuf.WireFormat.FieldType.STRING,
                        "",
                        com.google.protobuf.WireFormat.FieldType.MESSAGE,
                        com.google.dataflow.v1beta3.JobExecutionStageInfo.getDefaultInstance());
  }

  private com.google.protobuf.MapField<
          java.lang.String, com.google.dataflow.v1beta3.JobExecutionStageInfo>
      stages_;

  private com.google.protobuf.MapField<
          java.lang.String, com.google.dataflow.v1beta3.JobExecutionStageInfo>
      internalGetStages() {
    if (stages_ == null) {
      return com.google.protobuf.MapField.emptyMapField(StagesDefaultEntryHolder.defaultEntry);
    }
    return stages_;
  }

  public int getStagesCount() {
    return internalGetStages().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * A mapping from each stage to the information about that stage.
   * </pre>
   *
   * <code>map&lt;string, .google.dataflow.v1beta3.JobExecutionStageInfo&gt; stages = 1;</code>
   */
  @java.lang.Override
  public boolean containsStages(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    return internalGetStages().getMap().containsKey(key);
  }
  /** Use {@link #getStagesMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.dataflow.v1beta3.JobExecutionStageInfo>
      getStages() {
    return getStagesMap();
  }
  /**
   *
   *
   * <pre>
   * A mapping from each stage to the information about that stage.
   * </pre>
   *
   * <code>map&lt;string, .google.dataflow.v1beta3.JobExecutionStageInfo&gt; stages = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.google.dataflow.v1beta3.JobExecutionStageInfo>
      getStagesMap() {
    return internalGetStages().getMap();
  }
  /**
   *
   *
   * <pre>
   * A mapping from each stage to the information about that stage.
   * </pre>
   *
   * <code>map&lt;string, .google.dataflow.v1beta3.JobExecutionStageInfo&gt; stages = 1;</code>
   */
  @java.lang.Override
  public com.google.dataflow.v1beta3.JobExecutionStageInfo getStagesOrDefault(
      java.lang.String key, com.google.dataflow.v1beta3.JobExecutionStageInfo defaultValue) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, com.google.dataflow.v1beta3.JobExecutionStageInfo> map =
        internalGetStages().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * A mapping from each stage to the information about that stage.
   * </pre>
   *
   * <code>map&lt;string, .google.dataflow.v1beta3.JobExecutionStageInfo&gt; stages = 1;</code>
   */
  @java.lang.Override
  public com.google.dataflow.v1beta3.JobExecutionStageInfo getStagesOrThrow(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, com.google.dataflow.v1beta3.JobExecutionStageInfo> map =
        internalGetStages().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetStages(), StagesDefaultEntryHolder.defaultEntry, 1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, com.google.dataflow.v1beta3.JobExecutionStageInfo>
        entry : internalGetStages().getMap().entrySet()) {
      com.google.protobuf.MapEntry<
              java.lang.String, com.google.dataflow.v1beta3.JobExecutionStageInfo>
          stages__ =
              StagesDefaultEntryHolder.defaultEntry
                  .newBuilderForType()
                  .setKey(entry.getKey())
                  .setValue(entry.getValue())
                  .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, stages__);
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
    if (!(obj instanceof com.google.dataflow.v1beta3.JobExecutionInfo)) {
      return super.equals(obj);
    }
    com.google.dataflow.v1beta3.JobExecutionInfo other =
        (com.google.dataflow.v1beta3.JobExecutionInfo) obj;

    if (!internalGetStages().equals(other.internalGetStages())) return false;
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
    if (!internalGetStages().getMap().isEmpty()) {
      hash = (37 * hash) + STAGES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetStages().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.dataflow.v1beta3.JobExecutionInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.JobExecutionInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.JobExecutionInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.JobExecutionInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.JobExecutionInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.JobExecutionInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.JobExecutionInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.JobExecutionInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.JobExecutionInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.JobExecutionInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.JobExecutionInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.JobExecutionInfo parseFrom(
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

  public static Builder newBuilder(com.google.dataflow.v1beta3.JobExecutionInfo prototype) {
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
   * Additional information about how a Cloud Dataflow job will be executed that
   * isn't contained in the submitted job.
   * </pre>
   *
   * Protobuf type {@code google.dataflow.v1beta3.JobExecutionInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.dataflow.v1beta3.JobExecutionInfo)
      com.google.dataflow.v1beta3.JobExecutionInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.dataflow.v1beta3.JobsProto
          .internal_static_google_dataflow_v1beta3_JobExecutionInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 1:
          return internalGetStages();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 1:
          return internalGetMutableStages();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.dataflow.v1beta3.JobsProto
          .internal_static_google_dataflow_v1beta3_JobExecutionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.dataflow.v1beta3.JobExecutionInfo.class,
              com.google.dataflow.v1beta3.JobExecutionInfo.Builder.class);
    }

    // Construct using com.google.dataflow.v1beta3.JobExecutionInfo.newBuilder()
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
      internalGetMutableStages().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.dataflow.v1beta3.JobsProto
          .internal_static_google_dataflow_v1beta3_JobExecutionInfo_descriptor;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.JobExecutionInfo getDefaultInstanceForType() {
      return com.google.dataflow.v1beta3.JobExecutionInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.JobExecutionInfo build() {
      com.google.dataflow.v1beta3.JobExecutionInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.JobExecutionInfo buildPartial() {
      com.google.dataflow.v1beta3.JobExecutionInfo result =
          new com.google.dataflow.v1beta3.JobExecutionInfo(this);
      int from_bitField0_ = bitField0_;
      result.stages_ = internalGetStages();
      result.stages_.makeImmutable();
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
      if (other instanceof com.google.dataflow.v1beta3.JobExecutionInfo) {
        return mergeFrom((com.google.dataflow.v1beta3.JobExecutionInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.dataflow.v1beta3.JobExecutionInfo other) {
      if (other == com.google.dataflow.v1beta3.JobExecutionInfo.getDefaultInstance()) return this;
      internalGetMutableStages().mergeFrom(other.internalGetStages());
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
      com.google.dataflow.v1beta3.JobExecutionInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.dataflow.v1beta3.JobExecutionInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.MapField<
            java.lang.String, com.google.dataflow.v1beta3.JobExecutionStageInfo>
        stages_;

    private com.google.protobuf.MapField<
            java.lang.String, com.google.dataflow.v1beta3.JobExecutionStageInfo>
        internalGetStages() {
      if (stages_ == null) {
        return com.google.protobuf.MapField.emptyMapField(StagesDefaultEntryHolder.defaultEntry);
      }
      return stages_;
    }

    private com.google.protobuf.MapField<
            java.lang.String, com.google.dataflow.v1beta3.JobExecutionStageInfo>
        internalGetMutableStages() {
      onChanged();
      ;
      if (stages_ == null) {
        stages_ = com.google.protobuf.MapField.newMapField(StagesDefaultEntryHolder.defaultEntry);
      }
      if (!stages_.isMutable()) {
        stages_ = stages_.copy();
      }
      return stages_;
    }

    public int getStagesCount() {
      return internalGetStages().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * A mapping from each stage to the information about that stage.
     * </pre>
     *
     * <code>map&lt;string, .google.dataflow.v1beta3.JobExecutionStageInfo&gt; stages = 1;</code>
     */
    @java.lang.Override
    public boolean containsStages(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      return internalGetStages().getMap().containsKey(key);
    }
    /** Use {@link #getStagesMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.dataflow.v1beta3.JobExecutionStageInfo>
        getStages() {
      return getStagesMap();
    }
    /**
     *
     *
     * <pre>
     * A mapping from each stage to the information about that stage.
     * </pre>
     *
     * <code>map&lt;string, .google.dataflow.v1beta3.JobExecutionStageInfo&gt; stages = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.google.dataflow.v1beta3.JobExecutionStageInfo>
        getStagesMap() {
      return internalGetStages().getMap();
    }
    /**
     *
     *
     * <pre>
     * A mapping from each stage to the information about that stage.
     * </pre>
     *
     * <code>map&lt;string, .google.dataflow.v1beta3.JobExecutionStageInfo&gt; stages = 1;</code>
     */
    @java.lang.Override
    public com.google.dataflow.v1beta3.JobExecutionStageInfo getStagesOrDefault(
        java.lang.String key, com.google.dataflow.v1beta3.JobExecutionStageInfo defaultValue) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, com.google.dataflow.v1beta3.JobExecutionStageInfo> map =
          internalGetStages().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * A mapping from each stage to the information about that stage.
     * </pre>
     *
     * <code>map&lt;string, .google.dataflow.v1beta3.JobExecutionStageInfo&gt; stages = 1;</code>
     */
    @java.lang.Override
    public com.google.dataflow.v1beta3.JobExecutionStageInfo getStagesOrThrow(
        java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, com.google.dataflow.v1beta3.JobExecutionStageInfo> map =
          internalGetStages().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearStages() {
      internalGetMutableStages().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A mapping from each stage to the information about that stage.
     * </pre>
     *
     * <code>map&lt;string, .google.dataflow.v1beta3.JobExecutionStageInfo&gt; stages = 1;</code>
     */
    public Builder removeStages(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableStages().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.dataflow.v1beta3.JobExecutionStageInfo>
        getMutableStages() {
      return internalGetMutableStages().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * A mapping from each stage to the information about that stage.
     * </pre>
     *
     * <code>map&lt;string, .google.dataflow.v1beta3.JobExecutionStageInfo&gt; stages = 1;</code>
     */
    public Builder putStages(
        java.lang.String key, com.google.dataflow.v1beta3.JobExecutionStageInfo value) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      if (value == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableStages().getMutableMap().put(key, value);
      return this;
    }
    /**
     *
     *
     * <pre>
     * A mapping from each stage to the information about that stage.
     * </pre>
     *
     * <code>map&lt;string, .google.dataflow.v1beta3.JobExecutionStageInfo&gt; stages = 1;</code>
     */
    public Builder putAllStages(
        java.util.Map<java.lang.String, com.google.dataflow.v1beta3.JobExecutionStageInfo> values) {
      internalGetMutableStages().getMutableMap().putAll(values);
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

    // @@protoc_insertion_point(builder_scope:google.dataflow.v1beta3.JobExecutionInfo)
  }

  // @@protoc_insertion_point(class_scope:google.dataflow.v1beta3.JobExecutionInfo)
  private static final com.google.dataflow.v1beta3.JobExecutionInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.dataflow.v1beta3.JobExecutionInfo();
  }

  public static com.google.dataflow.v1beta3.JobExecutionInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JobExecutionInfo> PARSER =
      new com.google.protobuf.AbstractParser<JobExecutionInfo>() {
        @java.lang.Override
        public JobExecutionInfo parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new JobExecutionInfo(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<JobExecutionInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JobExecutionInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.dataflow.v1beta3.JobExecutionInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
