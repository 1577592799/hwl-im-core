// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/hwl/imcore/protocol/im_message.proto

package com.hwl.imcore.improto;

public interface ImMessageResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ImMessageResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.ImMessageResponseHead responseHead = 1;</code>
   */
  boolean hasResponseHead();
  /**
   * <code>.ImMessageResponseHead responseHead = 1;</code>
   */
  com.hwl.imcore.improto.ImMessageResponseHead getResponseHead();
  /**
   * <code>.ImMessageResponseHead responseHead = 1;</code>
   */
  com.hwl.imcore.improto.ImMessageResponseHeadOrBuilder getResponseHeadOrBuilder();

  /**
   * <code>.ImUserValidateResponse userValidateResponse = 2;</code>
   */
  boolean hasUserValidateResponse();
  /**
   * <code>.ImUserValidateResponse userValidateResponse = 2;</code>
   */
  com.hwl.imcore.improto.ImUserValidateResponse getUserValidateResponse();
  /**
   * <code>.ImUserValidateResponse userValidateResponse = 2;</code>
   */
  com.hwl.imcore.improto.ImUserValidateResponseOrBuilder getUserValidateResponseOrBuilder();

  /**
   * <code>.ImChatUserMessageResponse chatUserMessageResponse = 3;</code>
   */
  boolean hasChatUserMessageResponse();
  /**
   * <code>.ImChatUserMessageResponse chatUserMessageResponse = 3;</code>
   */
  com.hwl.imcore.improto.ImChatUserMessageResponse getChatUserMessageResponse();
  /**
   * <code>.ImChatUserMessageResponse chatUserMessageResponse = 3;</code>
   */
  com.hwl.imcore.improto.ImChatUserMessageResponseOrBuilder getChatUserMessageResponseOrBuilder();

  /**
   * <code>.ImChatGroupMessageResponse chatGroupMessageResponse = 4;</code>
   */
  boolean hasChatGroupMessageResponse();
  /**
   * <code>.ImChatGroupMessageResponse chatGroupMessageResponse = 4;</code>
   */
  com.hwl.imcore.improto.ImChatGroupMessageResponse getChatGroupMessageResponse();
  /**
   * <code>.ImChatGroupMessageResponse chatGroupMessageResponse = 4;</code>
   */
  com.hwl.imcore.improto.ImChatGroupMessageResponseOrBuilder getChatGroupMessageResponseOrBuilder();

  /**
   * <code>.ImAddFriendMessageResponse addFriendMessageResponse = 5;</code>
   */
  boolean hasAddFriendMessageResponse();
  /**
   * <code>.ImAddFriendMessageResponse addFriendMessageResponse = 5;</code>
   */
  com.hwl.imcore.improto.ImAddFriendMessageResponse getAddFriendMessageResponse();
  /**
   * <code>.ImAddFriendMessageResponse addFriendMessageResponse = 5;</code>
   */
  com.hwl.imcore.improto.ImAddFriendMessageResponseOrBuilder getAddFriendMessageResponseOrBuilder();

  /**
   * <code>.ImTestConnectionMessageResponse testConnectionMessageResponse = 6;</code>
   */
  boolean hasTestConnectionMessageResponse();
  /**
   * <code>.ImTestConnectionMessageResponse testConnectionMessageResponse = 6;</code>
   */
  com.hwl.imcore.improto.ImTestConnectionMessageResponse getTestConnectionMessageResponse();
  /**
   * <code>.ImTestConnectionMessageResponse testConnectionMessageResponse = 6;</code>
   */
  com.hwl.imcore.improto.ImTestConnectionMessageResponseOrBuilder getTestConnectionMessageResponseOrBuilder();

  /**
   * <code>.ImChatSettingMessageResponse chatSettingMessageResponse = 7;</code>
   */
  boolean hasChatSettingMessageResponse();
  /**
   * <code>.ImChatSettingMessageResponse chatSettingMessageResponse = 7;</code>
   */
  com.hwl.imcore.improto.ImChatSettingMessageResponse getChatSettingMessageResponse();
  /**
   * <code>.ImChatSettingMessageResponse chatSettingMessageResponse = 7;</code>
   */
  com.hwl.imcore.improto.ImChatSettingMessageResponseOrBuilder getChatSettingMessageResponseOrBuilder();

  /**
   * <code>.ImGroupOperateMessageResponse groupOperateMessageResponse = 8;</code>
   */
  boolean hasGroupOperateMessageResponse();
  /**
   * <code>.ImGroupOperateMessageResponse groupOperateMessageResponse = 8;</code>
   */
  com.hwl.imcore.improto.ImGroupOperateMessageResponse getGroupOperateMessageResponse();
  /**
   * <code>.ImGroupOperateMessageResponse groupOperateMessageResponse = 8;</code>
   */
  com.hwl.imcore.improto.ImGroupOperateMessageResponseOrBuilder getGroupOperateMessageResponseOrBuilder();

  public com.hwl.imcore.improto.ImMessageResponse.ResponseBodyCase getResponseBodyCase();
}
