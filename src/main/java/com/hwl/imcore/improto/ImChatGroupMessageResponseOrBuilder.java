// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/hwl/imcore/protocol/im_message.proto

package com.hwl.imcore.improto;

public interface ImChatGroupMessageResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ImChatGroupMessageResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.ImChatGroupMessageContent chatGroupMessageContent = 1;</code>
   */
  boolean hasChatGroupMessageContent();
  /**
   * <code>.ImChatGroupMessageContent chatGroupMessageContent = 1;</code>
   */
  com.hwl.imcore.improto.ImChatGroupMessageContent getChatGroupMessageContent();
  /**
   * <code>.ImChatGroupMessageContent chatGroupMessageContent = 1;</code>
   */
  com.hwl.imcore.improto.ImChatGroupMessageContentOrBuilder getChatGroupMessageContentOrBuilder();

  /**
   * <code>uint64 buildTime = 2;</code>
   */
  long getBuildTime();
}