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
// source: google/dataflow/v1beta3/snapshots.proto

package com.google.dataflow.v1beta3;

public interface GetSnapshotRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.GetSnapshotRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The ID of the Cloud Platform project that the snapshot belongs to.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * The ID of the Cloud Platform project that the snapshot belongs to.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * The ID of the snapshot.
   * </pre>
   *
   * <code>string snapshot_id = 2;</code>
   *
   * @return The snapshotId.
   */
  java.lang.String getSnapshotId();
  /**
   *
   *
   * <pre>
   * The ID of the snapshot.
   * </pre>
   *
   * <code>string snapshot_id = 2;</code>
   *
   * @return The bytes for snapshotId.
   */
  com.google.protobuf.ByteString getSnapshotIdBytes();

  /**
   *
   *
   * <pre>
   * The location that contains this snapshot.
   * </pre>
   *
   * <code>string location = 3;</code>
   *
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   *
   *
   * <pre>
   * The location that contains this snapshot.
   * </pre>
   *
   * <code>string location = 3;</code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();
}