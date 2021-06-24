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
// source: google/dataflow/v1beta3/metrics.proto

package com.google.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * Information about the workers and work items within a stage.
 * </pre>
 *
 * Protobuf type {@code google.dataflow.v1beta3.StageExecutionDetails}
 */
public final class StageExecutionDetails extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.dataflow.v1beta3.StageExecutionDetails)
    StageExecutionDetailsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StageExecutionDetails.newBuilder() to construct.
  private StageExecutionDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StageExecutionDetails() {
    workers_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StageExecutionDetails();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private StageExecutionDetails(
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
                workers_ = new java.util.ArrayList<com.google.dataflow.v1beta3.WorkerDetails>();
                mutable_bitField0_ |= 0x00000001;
              }
              workers_.add(
                  input.readMessage(
                      com.google.dataflow.v1beta3.WorkerDetails.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        workers_ = java.util.Collections.unmodifiableList(workers_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.dataflow.v1beta3.MetricsProto
        .internal_static_google_dataflow_v1beta3_StageExecutionDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.dataflow.v1beta3.MetricsProto
        .internal_static_google_dataflow_v1beta3_StageExecutionDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.dataflow.v1beta3.StageExecutionDetails.class,
            com.google.dataflow.v1beta3.StageExecutionDetails.Builder.class);
  }

  public static final int WORKERS_FIELD_NUMBER = 1;
  private java.util.List<com.google.dataflow.v1beta3.WorkerDetails> workers_;
  /**
   *
   *
   * <pre>
   * Workers that have done work on the stage.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.WorkerDetails workers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.dataflow.v1beta3.WorkerDetails> getWorkersList() {
    return workers_;
  }
  /**
   *
   *
   * <pre>
   * Workers that have done work on the stage.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.WorkerDetails workers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.dataflow.v1beta3.WorkerDetailsOrBuilder>
      getWorkersOrBuilderList() {
    return workers_;
  }
  /**
   *
   *
   * <pre>
   * Workers that have done work on the stage.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.WorkerDetails workers = 1;</code>
   */
  @java.lang.Override
  public int getWorkersCount() {
    return workers_.size();
  }
  /**
   *
   *
   * <pre>
   * Workers that have done work on the stage.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.WorkerDetails workers = 1;</code>
   */
  @java.lang.Override
  public com.google.dataflow.v1beta3.WorkerDetails getWorkers(int index) {
    return workers_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Workers that have done work on the stage.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.WorkerDetails workers = 1;</code>
   */
  @java.lang.Override
  public com.google.dataflow.v1beta3.WorkerDetailsOrBuilder getWorkersOrBuilder(int index) {
    return workers_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * If present, this response does not contain all requested tasks.  To obtain
   * the next page of results, repeat the request with page_token set to this
   * value.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * If present, this response does not contain all requested tasks.  To obtain
   * the next page of results, repeat the request with page_token set to this
   * value.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < workers_.size(); i++) {
      output.writeMessage(1, workers_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < workers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, workers_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.dataflow.v1beta3.StageExecutionDetails)) {
      return super.equals(obj);
    }
    com.google.dataflow.v1beta3.StageExecutionDetails other =
        (com.google.dataflow.v1beta3.StageExecutionDetails) obj;

    if (!getWorkersList().equals(other.getWorkersList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getWorkersCount() > 0) {
      hash = (37 * hash) + WORKERS_FIELD_NUMBER;
      hash = (53 * hash) + getWorkersList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.dataflow.v1beta3.StageExecutionDetails parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.StageExecutionDetails parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.StageExecutionDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.StageExecutionDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.StageExecutionDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.StageExecutionDetails parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.StageExecutionDetails parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.StageExecutionDetails parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.StageExecutionDetails parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.StageExecutionDetails parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.StageExecutionDetails parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.StageExecutionDetails parseFrom(
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

  public static Builder newBuilder(com.google.dataflow.v1beta3.StageExecutionDetails prototype) {
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
   * Information about the workers and work items within a stage.
   * </pre>
   *
   * Protobuf type {@code google.dataflow.v1beta3.StageExecutionDetails}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.dataflow.v1beta3.StageExecutionDetails)
      com.google.dataflow.v1beta3.StageExecutionDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.dataflow.v1beta3.MetricsProto
          .internal_static_google_dataflow_v1beta3_StageExecutionDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.dataflow.v1beta3.MetricsProto
          .internal_static_google_dataflow_v1beta3_StageExecutionDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.dataflow.v1beta3.StageExecutionDetails.class,
              com.google.dataflow.v1beta3.StageExecutionDetails.Builder.class);
    }

    // Construct using com.google.dataflow.v1beta3.StageExecutionDetails.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getWorkersFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (workersBuilder_ == null) {
        workers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        workersBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.dataflow.v1beta3.MetricsProto
          .internal_static_google_dataflow_v1beta3_StageExecutionDetails_descriptor;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.StageExecutionDetails getDefaultInstanceForType() {
      return com.google.dataflow.v1beta3.StageExecutionDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.StageExecutionDetails build() {
      com.google.dataflow.v1beta3.StageExecutionDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.StageExecutionDetails buildPartial() {
      com.google.dataflow.v1beta3.StageExecutionDetails result =
          new com.google.dataflow.v1beta3.StageExecutionDetails(this);
      int from_bitField0_ = bitField0_;
      if (workersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          workers_ = java.util.Collections.unmodifiableList(workers_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.workers_ = workers_;
      } else {
        result.workers_ = workersBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.dataflow.v1beta3.StageExecutionDetails) {
        return mergeFrom((com.google.dataflow.v1beta3.StageExecutionDetails) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.dataflow.v1beta3.StageExecutionDetails other) {
      if (other == com.google.dataflow.v1beta3.StageExecutionDetails.getDefaultInstance())
        return this;
      if (workersBuilder_ == null) {
        if (!other.workers_.isEmpty()) {
          if (workers_.isEmpty()) {
            workers_ = other.workers_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWorkersIsMutable();
            workers_.addAll(other.workers_);
          }
          onChanged();
        }
      } else {
        if (!other.workers_.isEmpty()) {
          if (workersBuilder_.isEmpty()) {
            workersBuilder_.dispose();
            workersBuilder_ = null;
            workers_ = other.workers_;
            bitField0_ = (bitField0_ & ~0x00000001);
            workersBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getWorkersFieldBuilder()
                    : null;
          } else {
            workersBuilder_.addAllMessages(other.workers_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.dataflow.v1beta3.StageExecutionDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.dataflow.v1beta3.StageExecutionDetails) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.dataflow.v1beta3.WorkerDetails> workers_ =
        java.util.Collections.emptyList();

    private void ensureWorkersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        workers_ = new java.util.ArrayList<com.google.dataflow.v1beta3.WorkerDetails>(workers_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.dataflow.v1beta3.WorkerDetails,
            com.google.dataflow.v1beta3.WorkerDetails.Builder,
            com.google.dataflow.v1beta3.WorkerDetailsOrBuilder>
        workersBuilder_;

    /**
     *
     *
     * <pre>
     * Workers that have done work on the stage.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.WorkerDetails workers = 1;</code>
     */
    public java.util.List<com.google.dataflow.v1beta3.WorkerDetails> getWorkersList() {
      if (workersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(workers_);
      } else {
        return workersBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Workers that have done work on the stage.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.WorkerDetails workers = 1;</code>
     */
    public int getWorkersCount() {
      if (workersBuilder_ == null) {
        return workers_.size();
      } else {
        return workersBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Workers that have done work on the stage.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.WorkerDetails workers = 1;</code>
     */
    public com.google.dataflow.v1beta3.WorkerDetails getWorkers(int index) {
      if (workersBuilder_ == null) {
        return workers_.get(index);
      } else {
        return workersBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Workers that have done work on the stage.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.WorkerDetails workers = 1;</code>
     */
    public Builder setWorkers(int index, com.google.dataflow.v1beta3.WorkerDetails value) {
      if (workersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorkersIsMutable();
        workers_.set(index, value);
        onChanged();
      } else {
        workersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Workers that have done work on the stage.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.WorkerDetails workers = 1;</code>
     */
    public Builder setWorkers(
        int index, com.google.dataflow.v1beta3.WorkerDetails.Builder builderForValue) {
      if (workersBuilder_ == null) {
        ensureWorkersIsMutable();
        workers_.set(index, builderForValue.build());
        onChanged();
      } else {
        workersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Workers that have done work on the stage.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.WorkerDetails workers = 1;</code>
     */
    public Builder addWorkers(com.google.dataflow.v1beta3.WorkerDetails value) {
      if (workersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorkersIsMutable();
        workers_.add(value);
        onChanged();
      } else {
        workersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Workers that have done work on the stage.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.WorkerDetails workers = 1;</code>
     */
    public Builder addWorkers(int index, com.google.dataflow.v1beta3.WorkerDetails value) {
      if (workersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorkersIsMutable();
        workers_.add(index, value);
        onChanged();
      } else {
        workersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Workers that have done work on the stage.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.WorkerDetails workers = 1;</code>
     */
    public Builder addWorkers(com.google.dataflow.v1beta3.WorkerDetails.Builder builderForValue) {
      if (workersBuilder_ == null) {
        ensureWorkersIsMutable();
        workers_.add(builderForValue.build());
        onChanged();
      } else {
        workersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Workers that have done work on the stage.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.WorkerDetails workers = 1;</code>
     */
    public Builder addWorkers(
        int index, com.google.dataflow.v1beta3.WorkerDetails.Builder builderForValue) {
      if (workersBuilder_ == null) {
        ensureWorkersIsMutable();
        workers_.add(index, builderForValue.build());
        onChanged();
      } else {
        workersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Workers that have done work on the stage.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.WorkerDetails workers = 1;</code>
     */
    public Builder addAllWorkers(
        java.lang.Iterable<? extends com.google.dataflow.v1beta3.WorkerDetails> values) {
      if (workersBuilder_ == null) {
        ensureWorkersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, workers_);
        onChanged();
      } else {
        workersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Workers that have done work on the stage.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.WorkerDetails workers = 1;</code>
     */
    public Builder clearWorkers() {
      if (workersBuilder_ == null) {
        workers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        workersBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Workers that have done work on the stage.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.WorkerDetails workers = 1;</code>
     */
    public Builder removeWorkers(int index) {
      if (workersBuilder_ == null) {
        ensureWorkersIsMutable();
        workers_.remove(index);
        onChanged();
      } else {
        workersBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Workers that have done work on the stage.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.WorkerDetails workers = 1;</code>
     */
    public com.google.dataflow.v1beta3.WorkerDetails.Builder getWorkersBuilder(int index) {
      return getWorkersFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Workers that have done work on the stage.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.WorkerDetails workers = 1;</code>
     */
    public com.google.dataflow.v1beta3.WorkerDetailsOrBuilder getWorkersOrBuilder(int index) {
      if (workersBuilder_ == null) {
        return workers_.get(index);
      } else {
        return workersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Workers that have done work on the stage.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.WorkerDetails workers = 1;</code>
     */
    public java.util.List<? extends com.google.dataflow.v1beta3.WorkerDetailsOrBuilder>
        getWorkersOrBuilderList() {
      if (workersBuilder_ != null) {
        return workersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(workers_);
      }
    }
    /**
     *
     *
     * <pre>
     * Workers that have done work on the stage.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.WorkerDetails workers = 1;</code>
     */
    public com.google.dataflow.v1beta3.WorkerDetails.Builder addWorkersBuilder() {
      return getWorkersFieldBuilder()
          .addBuilder(com.google.dataflow.v1beta3.WorkerDetails.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Workers that have done work on the stage.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.WorkerDetails workers = 1;</code>
     */
    public com.google.dataflow.v1beta3.WorkerDetails.Builder addWorkersBuilder(int index) {
      return getWorkersFieldBuilder()
          .addBuilder(index, com.google.dataflow.v1beta3.WorkerDetails.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Workers that have done work on the stage.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.WorkerDetails workers = 1;</code>
     */
    public java.util.List<com.google.dataflow.v1beta3.WorkerDetails.Builder>
        getWorkersBuilderList() {
      return getWorkersFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.dataflow.v1beta3.WorkerDetails,
            com.google.dataflow.v1beta3.WorkerDetails.Builder,
            com.google.dataflow.v1beta3.WorkerDetailsOrBuilder>
        getWorkersFieldBuilder() {
      if (workersBuilder_ == null) {
        workersBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.dataflow.v1beta3.WorkerDetails,
                com.google.dataflow.v1beta3.WorkerDetails.Builder,
                com.google.dataflow.v1beta3.WorkerDetailsOrBuilder>(
                workers_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        workers_ = null;
      }
      return workersBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * If present, this response does not contain all requested tasks.  To obtain
     * the next page of results, repeat the request with page_token set to this
     * value.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If present, this response does not contain all requested tasks.  To obtain
     * the next page of results, repeat the request with page_token set to this
     * value.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If present, this response does not contain all requested tasks.  To obtain
     * the next page of results, repeat the request with page_token set to this
     * value.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If present, this response does not contain all requested tasks.  To obtain
     * the next page of results, repeat the request with page_token set to this
     * value.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If present, this response does not contain all requested tasks.  To obtain
     * the next page of results, repeat the request with page_token set to this
     * value.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.dataflow.v1beta3.StageExecutionDetails)
  }

  // @@protoc_insertion_point(class_scope:google.dataflow.v1beta3.StageExecutionDetails)
  private static final com.google.dataflow.v1beta3.StageExecutionDetails DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.dataflow.v1beta3.StageExecutionDetails();
  }

  public static com.google.dataflow.v1beta3.StageExecutionDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StageExecutionDetails> PARSER =
      new com.google.protobuf.AbstractParser<StageExecutionDetails>() {
        @java.lang.Override
        public StageExecutionDetails parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new StageExecutionDetails(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<StageExecutionDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StageExecutionDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.dataflow.v1beta3.StageExecutionDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
