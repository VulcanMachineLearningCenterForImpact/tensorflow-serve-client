// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/worker.proto

package org.tensorflow.distruntime;

public interface ExecutorOptsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.ExecutorOpts)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool record_costs = 1;</code>
   */
  boolean getRecordCosts();

  /**
   * <code>bool record_timeline = 3;</code>
   */
  boolean getRecordTimeline();

  /**
   * <code>bool record_partition_graphs = 4;</code>
   */
  boolean getRecordPartitionGraphs();

  /**
   * <code>bool report_tensor_allocations_upon_oom = 5;</code>
   */
  boolean getReportTensorAllocationsUponOom();
}