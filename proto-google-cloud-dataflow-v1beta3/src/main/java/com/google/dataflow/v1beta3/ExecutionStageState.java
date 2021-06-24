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
 * A message describing the state of a particular execution stage.
 * </pre>
 *
 * Protobuf type {@code google.dataflow.v1beta3.ExecutionStageState}
 */
public final class ExecutionStageState extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.dataflow.v1beta3.ExecutionStageState)
    ExecutionStageStateOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ExecutionStageState.newBuilder() to construct.
  private ExecutionStageState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExecutionStageState() {
    executionStageName_ = "";
    executionStageState_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ExecutionStageState();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ExecutionStageState(
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

              executionStageName_ = s;
              break;
            }
          case 16:
            {
              int rawValue = input.readEnum();

              executionStageState_ = rawValue;
              break;
            }
          case 26:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (currentStateTime_ != null) {
                subBuilder = currentStateTime_.toBuilder();
              }
              currentStateTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(currentStateTime_);
                currentStateTime_ = subBuilder.buildPartial();
              }

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
        .internal_static_google_dataflow_v1beta3_ExecutionStageState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.dataflow.v1beta3.JobsProto
        .internal_static_google_dataflow_v1beta3_ExecutionStageState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.dataflow.v1beta3.ExecutionStageState.class,
            com.google.dataflow.v1beta3.ExecutionStageState.Builder.class);
  }

  public static final int EXECUTION_STAGE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object executionStageName_;
  /**
   *
   *
   * <pre>
   * The name of the execution stage.
   * </pre>
   *
   * <code>string execution_stage_name = 1;</code>
   *
   * @return The executionStageName.
   */
  @java.lang.Override
  public java.lang.String getExecutionStageName() {
    java.lang.Object ref = executionStageName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      executionStageName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the execution stage.
   * </pre>
   *
   * <code>string execution_stage_name = 1;</code>
   *
   * @return The bytes for executionStageName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getExecutionStageNameBytes() {
    java.lang.Object ref = executionStageName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      executionStageName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXECUTION_STAGE_STATE_FIELD_NUMBER = 2;
  private int executionStageState_;
  /**
   *
   *
   * <pre>
   * Executions stage states allow the same set of values as JobState.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.JobState execution_stage_state = 2;</code>
   *
   * @return The enum numeric value on the wire for executionStageState.
   */
  @java.lang.Override
  public int getExecutionStageStateValue() {
    return executionStageState_;
  }
  /**
   *
   *
   * <pre>
   * Executions stage states allow the same set of values as JobState.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.JobState execution_stage_state = 2;</code>
   *
   * @return The executionStageState.
   */
  @java.lang.Override
  public com.google.dataflow.v1beta3.JobState getExecutionStageState() {
    @SuppressWarnings("deprecation")
    com.google.dataflow.v1beta3.JobState result =
        com.google.dataflow.v1beta3.JobState.valueOf(executionStageState_);
    return result == null ? com.google.dataflow.v1beta3.JobState.UNRECOGNIZED : result;
  }

  public static final int CURRENT_STATE_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp currentStateTime_;
  /**
   *
   *
   * <pre>
   * The time at which the stage transitioned to this state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp current_state_time = 3;</code>
   *
   * @return Whether the currentStateTime field is set.
   */
  @java.lang.Override
  public boolean hasCurrentStateTime() {
    return currentStateTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * The time at which the stage transitioned to this state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp current_state_time = 3;</code>
   *
   * @return The currentStateTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCurrentStateTime() {
    return currentStateTime_ == null
        ? com.google.protobuf.Timestamp.getDefaultInstance()
        : currentStateTime_;
  }
  /**
   *
   *
   * <pre>
   * The time at which the stage transitioned to this state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp current_state_time = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCurrentStateTimeOrBuilder() {
    return getCurrentStateTime();
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
    if (!getExecutionStageNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, executionStageName_);
    }
    if (executionStageState_
        != com.google.dataflow.v1beta3.JobState.JOB_STATE_UNKNOWN.getNumber()) {
      output.writeEnum(2, executionStageState_);
    }
    if (currentStateTime_ != null) {
      output.writeMessage(3, getCurrentStateTime());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getExecutionStageNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, executionStageName_);
    }
    if (executionStageState_
        != com.google.dataflow.v1beta3.JobState.JOB_STATE_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, executionStageState_);
    }
    if (currentStateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getCurrentStateTime());
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
    if (!(obj instanceof com.google.dataflow.v1beta3.ExecutionStageState)) {
      return super.equals(obj);
    }
    com.google.dataflow.v1beta3.ExecutionStageState other =
        (com.google.dataflow.v1beta3.ExecutionStageState) obj;

    if (!getExecutionStageName().equals(other.getExecutionStageName())) return false;
    if (executionStageState_ != other.executionStageState_) return false;
    if (hasCurrentStateTime() != other.hasCurrentStateTime()) return false;
    if (hasCurrentStateTime()) {
      if (!getCurrentStateTime().equals(other.getCurrentStateTime())) return false;
    }
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
    hash = (37 * hash) + EXECUTION_STAGE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getExecutionStageName().hashCode();
    hash = (37 * hash) + EXECUTION_STAGE_STATE_FIELD_NUMBER;
    hash = (53 * hash) + executionStageState_;
    if (hasCurrentStateTime()) {
      hash = (37 * hash) + CURRENT_STATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCurrentStateTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.dataflow.v1beta3.ExecutionStageState parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.ExecutionStageState parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.ExecutionStageState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.ExecutionStageState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.ExecutionStageState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.ExecutionStageState parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.ExecutionStageState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.ExecutionStageState parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.ExecutionStageState parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.ExecutionStageState parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.ExecutionStageState parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.ExecutionStageState parseFrom(
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

  public static Builder newBuilder(com.google.dataflow.v1beta3.ExecutionStageState prototype) {
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
   * A message describing the state of a particular execution stage.
   * </pre>
   *
   * Protobuf type {@code google.dataflow.v1beta3.ExecutionStageState}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.dataflow.v1beta3.ExecutionStageState)
      com.google.dataflow.v1beta3.ExecutionStageStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.dataflow.v1beta3.JobsProto
          .internal_static_google_dataflow_v1beta3_ExecutionStageState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.dataflow.v1beta3.JobsProto
          .internal_static_google_dataflow_v1beta3_ExecutionStageState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.dataflow.v1beta3.ExecutionStageState.class,
              com.google.dataflow.v1beta3.ExecutionStageState.Builder.class);
    }

    // Construct using com.google.dataflow.v1beta3.ExecutionStageState.newBuilder()
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
      executionStageName_ = "";

      executionStageState_ = 0;

      if (currentStateTimeBuilder_ == null) {
        currentStateTime_ = null;
      } else {
        currentStateTime_ = null;
        currentStateTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.dataflow.v1beta3.JobsProto
          .internal_static_google_dataflow_v1beta3_ExecutionStageState_descriptor;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.ExecutionStageState getDefaultInstanceForType() {
      return com.google.dataflow.v1beta3.ExecutionStageState.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.ExecutionStageState build() {
      com.google.dataflow.v1beta3.ExecutionStageState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.ExecutionStageState buildPartial() {
      com.google.dataflow.v1beta3.ExecutionStageState result =
          new com.google.dataflow.v1beta3.ExecutionStageState(this);
      result.executionStageName_ = executionStageName_;
      result.executionStageState_ = executionStageState_;
      if (currentStateTimeBuilder_ == null) {
        result.currentStateTime_ = currentStateTime_;
      } else {
        result.currentStateTime_ = currentStateTimeBuilder_.build();
      }
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
      if (other instanceof com.google.dataflow.v1beta3.ExecutionStageState) {
        return mergeFrom((com.google.dataflow.v1beta3.ExecutionStageState) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.dataflow.v1beta3.ExecutionStageState other) {
      if (other == com.google.dataflow.v1beta3.ExecutionStageState.getDefaultInstance())
        return this;
      if (!other.getExecutionStageName().isEmpty()) {
        executionStageName_ = other.executionStageName_;
        onChanged();
      }
      if (other.executionStageState_ != 0) {
        setExecutionStageStateValue(other.getExecutionStageStateValue());
      }
      if (other.hasCurrentStateTime()) {
        mergeCurrentStateTime(other.getCurrentStateTime());
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
      com.google.dataflow.v1beta3.ExecutionStageState parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.dataflow.v1beta3.ExecutionStageState) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object executionStageName_ = "";
    /**
     *
     *
     * <pre>
     * The name of the execution stage.
     * </pre>
     *
     * <code>string execution_stage_name = 1;</code>
     *
     * @return The executionStageName.
     */
    public java.lang.String getExecutionStageName() {
      java.lang.Object ref = executionStageName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        executionStageName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the execution stage.
     * </pre>
     *
     * <code>string execution_stage_name = 1;</code>
     *
     * @return The bytes for executionStageName.
     */
    public com.google.protobuf.ByteString getExecutionStageNameBytes() {
      java.lang.Object ref = executionStageName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        executionStageName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the execution stage.
     * </pre>
     *
     * <code>string execution_stage_name = 1;</code>
     *
     * @param value The executionStageName to set.
     * @return This builder for chaining.
     */
    public Builder setExecutionStageName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      executionStageName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the execution stage.
     * </pre>
     *
     * <code>string execution_stage_name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExecutionStageName() {

      executionStageName_ = getDefaultInstance().getExecutionStageName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the execution stage.
     * </pre>
     *
     * <code>string execution_stage_name = 1;</code>
     *
     * @param value The bytes for executionStageName to set.
     * @return This builder for chaining.
     */
    public Builder setExecutionStageNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      executionStageName_ = value;
      onChanged();
      return this;
    }

    private int executionStageState_ = 0;
    /**
     *
     *
     * <pre>
     * Executions stage states allow the same set of values as JobState.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.JobState execution_stage_state = 2;</code>
     *
     * @return The enum numeric value on the wire for executionStageState.
     */
    @java.lang.Override
    public int getExecutionStageStateValue() {
      return executionStageState_;
    }
    /**
     *
     *
     * <pre>
     * Executions stage states allow the same set of values as JobState.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.JobState execution_stage_state = 2;</code>
     *
     * @param value The enum numeric value on the wire for executionStageState to set.
     * @return This builder for chaining.
     */
    public Builder setExecutionStageStateValue(int value) {

      executionStageState_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Executions stage states allow the same set of values as JobState.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.JobState execution_stage_state = 2;</code>
     *
     * @return The executionStageState.
     */
    @java.lang.Override
    public com.google.dataflow.v1beta3.JobState getExecutionStageState() {
      @SuppressWarnings("deprecation")
      com.google.dataflow.v1beta3.JobState result =
          com.google.dataflow.v1beta3.JobState.valueOf(executionStageState_);
      return result == null ? com.google.dataflow.v1beta3.JobState.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Executions stage states allow the same set of values as JobState.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.JobState execution_stage_state = 2;</code>
     *
     * @param value The executionStageState to set.
     * @return This builder for chaining.
     */
    public Builder setExecutionStageState(com.google.dataflow.v1beta3.JobState value) {
      if (value == null) {
        throw new NullPointerException();
      }

      executionStageState_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Executions stage states allow the same set of values as JobState.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.JobState execution_stage_state = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExecutionStageState() {

      executionStageState_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp currentStateTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        currentStateTimeBuilder_;
    /**
     *
     *
     * <pre>
     * The time at which the stage transitioned to this state.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp current_state_time = 3;</code>
     *
     * @return Whether the currentStateTime field is set.
     */
    public boolean hasCurrentStateTime() {
      return currentStateTimeBuilder_ != null || currentStateTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * The time at which the stage transitioned to this state.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp current_state_time = 3;</code>
     *
     * @return The currentStateTime.
     */
    public com.google.protobuf.Timestamp getCurrentStateTime() {
      if (currentStateTimeBuilder_ == null) {
        return currentStateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : currentStateTime_;
      } else {
        return currentStateTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The time at which the stage transitioned to this state.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp current_state_time = 3;</code>
     */
    public Builder setCurrentStateTime(com.google.protobuf.Timestamp value) {
      if (currentStateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        currentStateTime_ = value;
        onChanged();
      } else {
        currentStateTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time at which the stage transitioned to this state.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp current_state_time = 3;</code>
     */
    public Builder setCurrentStateTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (currentStateTimeBuilder_ == null) {
        currentStateTime_ = builderForValue.build();
        onChanged();
      } else {
        currentStateTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time at which the stage transitioned to this state.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp current_state_time = 3;</code>
     */
    public Builder mergeCurrentStateTime(com.google.protobuf.Timestamp value) {
      if (currentStateTimeBuilder_ == null) {
        if (currentStateTime_ != null) {
          currentStateTime_ =
              com.google.protobuf.Timestamp.newBuilder(currentStateTime_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          currentStateTime_ = value;
        }
        onChanged();
      } else {
        currentStateTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time at which the stage transitioned to this state.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp current_state_time = 3;</code>
     */
    public Builder clearCurrentStateTime() {
      if (currentStateTimeBuilder_ == null) {
        currentStateTime_ = null;
        onChanged();
      } else {
        currentStateTime_ = null;
        currentStateTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time at which the stage transitioned to this state.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp current_state_time = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getCurrentStateTimeBuilder() {

      onChanged();
      return getCurrentStateTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The time at which the stage transitioned to this state.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp current_state_time = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCurrentStateTimeOrBuilder() {
      if (currentStateTimeBuilder_ != null) {
        return currentStateTimeBuilder_.getMessageOrBuilder();
      } else {
        return currentStateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : currentStateTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * The time at which the stage transitioned to this state.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp current_state_time = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getCurrentStateTimeFieldBuilder() {
      if (currentStateTimeBuilder_ == null) {
        currentStateTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getCurrentStateTime(), getParentForChildren(), isClean());
        currentStateTime_ = null;
      }
      return currentStateTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.dataflow.v1beta3.ExecutionStageState)
  }

  // @@protoc_insertion_point(class_scope:google.dataflow.v1beta3.ExecutionStageState)
  private static final com.google.dataflow.v1beta3.ExecutionStageState DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.dataflow.v1beta3.ExecutionStageState();
  }

  public static com.google.dataflow.v1beta3.ExecutionStageState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExecutionStageState> PARSER =
      new com.google.protobuf.AbstractParser<ExecutionStageState>() {
        @java.lang.Override
        public ExecutionStageState parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ExecutionStageState(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ExecutionStageState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExecutionStageState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.dataflow.v1beta3.ExecutionStageState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
