// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/snapshots.proto

package com.google.dataflow.v1beta3;

public interface ListSnapshotsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.ListSnapshotsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Returned snapshots.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
   */
  java.util.List<com.google.dataflow.v1beta3.Snapshot> 
      getSnapshotsList();
  /**
   * <pre>
   * Returned snapshots.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
   */
  com.google.dataflow.v1beta3.Snapshot getSnapshots(int index);
  /**
   * <pre>
   * Returned snapshots.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
   */
  int getSnapshotsCount();
  /**
   * <pre>
   * Returned snapshots.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
   */
  java.util.List<? extends com.google.dataflow.v1beta3.SnapshotOrBuilder> 
      getSnapshotsOrBuilderList();
  /**
   * <pre>
   * Returned snapshots.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
   */
  com.google.dataflow.v1beta3.SnapshotOrBuilder getSnapshotsOrBuilder(
      int index);
}