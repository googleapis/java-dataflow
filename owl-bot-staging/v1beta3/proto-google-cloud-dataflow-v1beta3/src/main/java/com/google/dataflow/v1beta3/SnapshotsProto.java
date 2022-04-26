// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/snapshots.proto

package com.google.dataflow.v1beta3;

public final class SnapshotsProto {
  private SnapshotsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_dataflow_v1beta3_PubsubSnapshotMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_PubsubSnapshotMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_dataflow_v1beta3_Snapshot_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_Snapshot_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_dataflow_v1beta3_GetSnapshotRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_GetSnapshotRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_dataflow_v1beta3_DeleteSnapshotRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_DeleteSnapshotRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_dataflow_v1beta3_DeleteSnapshotResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_DeleteSnapshotResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_dataflow_v1beta3_ListSnapshotsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_ListSnapshotsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_dataflow_v1beta3_ListSnapshotsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_ListSnapshotsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'google/dataflow/v1beta3/snapshots.prot" +
      "o\022\027google.dataflow.v1beta3\032\034google/api/a" +
      "nnotations.proto\032\027google/api/client.prot" +
      "o\032\036google/protobuf/duration.proto\032\037googl" +
      "e/protobuf/timestamp.proto\"t\n\026PubsubSnap" +
      "shotMetadata\022\022\n\ntopic_name\030\001 \001(\t\022\025\n\rsnap" +
      "shot_name\030\002 \001(\t\022/\n\013expire_time\030\003 \001(\0132\032.g" +
      "oogle.protobuf.Timestamp\"\333\002\n\010Snapshot\022\n\n" +
      "\002id\030\001 \001(\t\022\022\n\nproject_id\030\002 \001(\t\022\025\n\rsource_" +
      "job_id\030\003 \001(\t\0221\n\rcreation_time\030\004 \001(\0132\032.go" +
      "ogle.protobuf.Timestamp\022&\n\003ttl\030\005 \001(\0132\031.g" +
      "oogle.protobuf.Duration\0225\n\005state\030\006 \001(\0162&" +
      ".google.dataflow.v1beta3.SnapshotState\022H" +
      "\n\017pubsub_metadata\030\007 \003(\0132/.google.dataflo" +
      "w.v1beta3.PubsubSnapshotMetadata\022\023\n\013desc" +
      "ription\030\010 \001(\t\022\027\n\017disk_size_bytes\030\t \001(\003\022\016" +
      "\n\006region\030\n \001(\t\"O\n\022GetSnapshotRequest\022\022\n\n" +
      "project_id\030\001 \001(\t\022\023\n\013snapshot_id\030\002 \001(\t\022\020\n" +
      "\010location\030\003 \001(\t\"R\n\025DeleteSnapshotRequest" +
      "\022\022\n\nproject_id\030\001 \001(\t\022\023\n\013snapshot_id\030\002 \001(" +
      "\t\022\020\n\010location\030\003 \001(\t\"\030\n\026DeleteSnapshotRes" +
      "ponse\"L\n\024ListSnapshotsRequest\022\022\n\nproject" +
      "_id\030\001 \001(\t\022\016\n\006job_id\030\003 \001(\t\022\020\n\010location\030\002 " +
      "\001(\t\"M\n\025ListSnapshotsResponse\0224\n\tsnapshot" +
      "s\030\001 \003(\0132!.google.dataflow.v1beta3.Snapsh" +
      "ot*i\n\rSnapshotState\022\032\n\026UNKNOWN_SNAPSHOT_" +
      "STATE\020\000\022\013\n\007PENDING\020\001\022\013\n\007RUNNING\020\002\022\t\n\005REA" +
      "DY\020\003\022\n\n\006FAILED\020\004\022\013\n\007DELETED\020\0052\357\007\n\020Snapsh" +
      "otsV1Beta3\022\350\001\n\013GetSnapshot\022+.google.data" +
      "flow.v1beta3.GetSnapshotRequest\032!.google" +
      ".dataflow.v1beta3.Snapshot\"\210\001\202\323\344\223\002\201\001\022H/v" +
      "1b3/projects/{project_id}/locations/{loc" +
      "ation}/snapshots/{snapshot_id}Z5\0223/v1b3/" +
      "projects/{project_id}/snapshots/{snapsho" +
      "t_id}\022\354\001\n\016DeleteSnapshot\022..google.datafl" +
      "ow.v1beta3.DeleteSnapshotRequest\032/.googl" +
      "e.dataflow.v1beta3.DeleteSnapshotRespons" +
      "e\"y\202\323\344\223\002s*H/v1b3/projects/{project_id}/l" +
      "ocations/{location}/snapshots/{snapshot_" +
      "id}Z\'*%/v1b3/projects/{project_id}/snaps" +
      "hots\022\251\002\n\rListSnapshots\022-.google.dataflow" +
      ".v1beta3.ListSnapshotsRequest\032..google.d" +
      "ataflow.v1beta3.ListSnapshotsResponse\"\270\001" +
      "\202\323\344\223\002\261\001\022H/v1b3/projects/{project_id}/loc" +
      "ations/{location}/jobs/{job_id}/snapshot" +
      "sZ<\022:/v1b3/projects/{project_id}/locatio" +
      "ns/{location}/snapshotsZ\'\022%/v1b3/project" +
      "s/{project_id}/snapshots\032\324\001\312A\027dataflow.g" +
      "oogleapis.com\322A\266\001https://www.googleapis." +
      "com/auth/cloud-platform,https://www.goog" +
      "leapis.com/auth/compute,https://www.goog" +
      "leapis.com/auth/compute.readonly,https:/" +
      "/www.googleapis.com/auth/userinfo.emailB" +
      "\323\001\n\033com.google.dataflow.v1beta3B\016Snapsho" +
      "tsProtoP\001Z?google.golang.org/genproto/go" +
      "ogleapis/dataflow/v1beta3;dataflow\252\002\035Goo" +
      "gle.Cloud.Dataflow.V1Beta3\312\002\035Google\\Clou" +
      "d\\Dataflow\\V1beta3\352\002 Google::Cloud::Data" +
      "flow::V1beta3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_dataflow_v1beta3_PubsubSnapshotMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_dataflow_v1beta3_PubsubSnapshotMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_dataflow_v1beta3_PubsubSnapshotMetadata_descriptor,
        new java.lang.String[] { "TopicName", "SnapshotName", "ExpireTime", });
    internal_static_google_dataflow_v1beta3_Snapshot_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_dataflow_v1beta3_Snapshot_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_dataflow_v1beta3_Snapshot_descriptor,
        new java.lang.String[] { "Id", "ProjectId", "SourceJobId", "CreationTime", "Ttl", "State", "PubsubMetadata", "Description", "DiskSizeBytes", "Region", });
    internal_static_google_dataflow_v1beta3_GetSnapshotRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_dataflow_v1beta3_GetSnapshotRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_dataflow_v1beta3_GetSnapshotRequest_descriptor,
        new java.lang.String[] { "ProjectId", "SnapshotId", "Location", });
    internal_static_google_dataflow_v1beta3_DeleteSnapshotRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_dataflow_v1beta3_DeleteSnapshotRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_dataflow_v1beta3_DeleteSnapshotRequest_descriptor,
        new java.lang.String[] { "ProjectId", "SnapshotId", "Location", });
    internal_static_google_dataflow_v1beta3_DeleteSnapshotResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_dataflow_v1beta3_DeleteSnapshotResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_dataflow_v1beta3_DeleteSnapshotResponse_descriptor,
        new java.lang.String[] { });
    internal_static_google_dataflow_v1beta3_ListSnapshotsRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_dataflow_v1beta3_ListSnapshotsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_dataflow_v1beta3_ListSnapshotsRequest_descriptor,
        new java.lang.String[] { "ProjectId", "JobId", "Location", });
    internal_static_google_dataflow_v1beta3_ListSnapshotsResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_dataflow_v1beta3_ListSnapshotsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_dataflow_v1beta3_ListSnapshotsResponse_descriptor,
        new java.lang.String[] { "Snapshots", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
