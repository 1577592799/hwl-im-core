// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/hwl/im/protocol/im_message.proto

package com.hwl.im.improto;

public interface ImMessageResponseHeadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ImMessageResponseHead)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 code = 1;</code>
   */
  int getCode();

  /**
   * <code>string message = 2;</code>
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>.ImMessageSourcePosition source = 3;</code>
   */
  int getSourceValue();
  /**
   * <code>.ImMessageSourcePosition source = 3;</code>
   */
  com.hwl.im.improto.ImMessageSourcePosition getSource();
}
