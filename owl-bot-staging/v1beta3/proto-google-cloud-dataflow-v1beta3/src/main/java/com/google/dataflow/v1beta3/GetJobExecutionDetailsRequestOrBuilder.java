// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/metrics.proto

package com.google.dataflow.v1beta3;

public interface GetJobExecutionDetailsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.GetJobExecutionDetailsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A project id.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * A project id.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * The job to get execution details for.
   * </pre>
   *
   * <code>string job_id = 2;</code>
   * @return The jobId.
   */
  java.lang.String getJobId();
  /**
   * <pre>
   * The job to get execution details for.
   * </pre>
   *
   * <code>string job_id = 2;</code>
   * @return The bytes for jobId.
   */
  com.google.protobuf.ByteString
      getJobIdBytes();

  /**
   * <pre>
   * The [regional endpoint]
   * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
   * contains the job specified by job_id.
   * </pre>
   *
   * <code>string location = 3;</code>
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   * <pre>
   * The [regional endpoint]
   * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
   * contains the job specified by job_id.
   * </pre>
   *
   * <code>string location = 3;</code>
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString
      getLocationBytes();

  /**
   * <pre>
   * If specified, determines the maximum number of stages to
   * return.  If unspecified, the service may choose an appropriate
   * default, or may return an arbitrarily large number of results.
   * </pre>
   *
   * <code>int32 page_size = 4;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * If supplied, this should be the value of next_page_token returned
   * by an earlier call. This will cause the next page of results to
   * be returned.
   * </pre>
   *
   * <code>string page_token = 5;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * If supplied, this should be the value of next_page_token returned
   * by an earlier call. This will cause the next page of results to
   * be returned.
   * </pre>
   *
   * <code>string page_token = 5;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}