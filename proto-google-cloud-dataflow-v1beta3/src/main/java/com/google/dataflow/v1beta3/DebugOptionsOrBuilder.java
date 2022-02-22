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
// source: google/dataflow/v1beta3/environment.proto

package com.google.dataflow.v1beta3;

public interface DebugOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.DebugOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * When true, enables the logging of the literal hot key to the user's Cloud
   * Logging.
   * </pre>
   *
   * <code>bool enable_hot_key_logging = 1;</code>
   *
   * @return The enableHotKeyLogging.
   */
  boolean getEnableHotKeyLogging();
}
