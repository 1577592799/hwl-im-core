// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/hwl/imcore/protocol/im_message.proto

package com.hwl.imcore.improto;

public interface ImAppVersionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ImAppVersionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.ImAppVersionContent appVersionContent = 1;</code>
   */
  boolean hasAppVersionContent();
  /**
   * <code>.ImAppVersionContent appVersionContent = 1;</code>
   */
  com.hwl.imcore.improto.ImAppVersionContent getAppVersionContent();
  /**
   * <code>.ImAppVersionContent appVersionContent = 1;</code>
   */
  com.hwl.imcore.improto.ImAppVersionContentOrBuilder getAppVersionContentOrBuilder();

  /**
   * <code>uint64 buildTime = 2;</code>
   */
  long getBuildTime();
}
