// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/hwl/imcore/protocol/im_message.proto

package com.hwl.imcore.improto;

public interface ImNearCircleOperateMessageContentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ImNearCircleOperateMessageContent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.ImCircleOperateType operateType = 1;</code>
   */
  int getOperateTypeValue();
  /**
   * <code>.ImCircleOperateType operateType = 1;</code>
   */
  com.hwl.imcore.improto.ImCircleOperateType getOperateType();

  /**
   * <code>.ImUserContent postUser = 2;</code>
   */
  boolean hasPostUser();
  /**
   * <code>.ImUserContent postUser = 2;</code>
   */
  com.hwl.imcore.improto.ImUserContent getPostUser();
  /**
   * <code>.ImUserContent postUser = 2;</code>
   */
  com.hwl.imcore.improto.ImUserContentOrBuilder getPostUserOrBuilder();

  /**
   * <code>.ImUserContent originUser = 3;</code>
   */
  boolean hasOriginUser();
  /**
   * <code>.ImUserContent originUser = 3;</code>
   */
  com.hwl.imcore.improto.ImUserContent getOriginUser();
  /**
   * <code>.ImUserContent originUser = 3;</code>
   */
  com.hwl.imcore.improto.ImUserContentOrBuilder getOriginUserOrBuilder();

  /**
   * <code>.ImUserContent replyUser = 4;</code>
   */
  boolean hasReplyUser();
  /**
   * <code>.ImUserContent replyUser = 4;</code>
   */
  com.hwl.imcore.improto.ImUserContent getReplyUser();
  /**
   * <code>.ImUserContent replyUser = 4;</code>
   */
  com.hwl.imcore.improto.ImUserContentOrBuilder getReplyUserOrBuilder();

  /**
   * <code>uint64 nearCircleId = 5;</code>
   */
  long getNearCircleId();

  /**
   * <code>uint64 commentId = 6;</code>
   */
  long getCommentId();

  /**
   * <code>string commentCont = 7;</code>
   */
  java.lang.String getCommentCont();
  /**
   * <code>string commentCont = 7;</code>
   */
  com.google.protobuf.ByteString
      getCommentContBytes();
}
