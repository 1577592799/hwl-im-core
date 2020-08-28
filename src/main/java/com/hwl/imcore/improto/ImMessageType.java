// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/hwl/imcore/protocol/im_message.proto

package com.hwl.imcore.improto;

/**
 * Protobuf enum {@code ImMessageType}
 */
public enum ImMessageType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>Base = 0;</code>
   */
  Base(0),
  /**
   * <code>UserValidate = 1;</code>
   */
  UserValidate(1),
  /**
   * <code>ChatUser = 2;</code>
   */
  ChatUser(2),
  /**
   * <code>ChatGroup = 3;</code>
   */
  ChatGroup(3),
  /**
   * <code>HeartBeat = 4;</code>
   */
  HeartBeat(4),
  /**
   * <code>AddFriend = 5;</code>
   */
  AddFriend(5),
  /**
   * <code>TestConnection = 6;</code>
   */
  TestConnection(6),
  /**
   * <code>ClientAckMessage = 7;</code>
   */
  ClientAckMessage(7),
  /**
   * <code>ChatSetting = 8;</code>
   */
  ChatSetting(8),
  /**
   * <code>GroupOperate = 9;</code>
   */
  GroupOperate(9),
  /**
   * <code>NearCircleOperate = 10;</code>
   */
  NearCircleOperate(10),
  /**
   * <code>CircleOperate = 11;</code>
   */
  CircleOperate(11),
  /**
   * <code>SystemMessage = 12;</code>
   */
  SystemMessage(12),
  /**
   * <code>AppVersion = 13;</code>
   */
  AppVersion(13),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>Base = 0;</code>
   */
  public static final int Base_VALUE = 0;
  /**
   * <code>UserValidate = 1;</code>
   */
  public static final int UserValidate_VALUE = 1;
  /**
   * <code>ChatUser = 2;</code>
   */
  public static final int ChatUser_VALUE = 2;
  /**
   * <code>ChatGroup = 3;</code>
   */
  public static final int ChatGroup_VALUE = 3;
  /**
   * <code>HeartBeat = 4;</code>
   */
  public static final int HeartBeat_VALUE = 4;
  /**
   * <code>AddFriend = 5;</code>
   */
  public static final int AddFriend_VALUE = 5;
  /**
   * <code>TestConnection = 6;</code>
   */
  public static final int TestConnection_VALUE = 6;
  /**
   * <code>ClientAckMessage = 7;</code>
   */
  public static final int ClientAckMessage_VALUE = 7;
  /**
   * <code>ChatSetting = 8;</code>
   */
  public static final int ChatSetting_VALUE = 8;
  /**
   * <code>GroupOperate = 9;</code>
   */
  public static final int GroupOperate_VALUE = 9;
  /**
   * <code>NearCircleOperate = 10;</code>
   */
  public static final int NearCircleOperate_VALUE = 10;
  /**
   * <code>CircleOperate = 11;</code>
   */
  public static final int CircleOperate_VALUE = 11;
  /**
   * <code>SystemMessage = 12;</code>
   */
  public static final int SystemMessage_VALUE = 12;
  /**
   * <code>AppVersion = 13;</code>
   */
  public static final int AppVersion_VALUE = 13;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ImMessageType valueOf(int value) {
    return forNumber(value);
  }

  public static ImMessageType forNumber(int value) {
    switch (value) {
      case 0: return Base;
      case 1: return UserValidate;
      case 2: return ChatUser;
      case 3: return ChatGroup;
      case 4: return HeartBeat;
      case 5: return AddFriend;
      case 6: return TestConnection;
      case 7: return ClientAckMessage;
      case 8: return ChatSetting;
      case 9: return GroupOperate;
      case 10: return NearCircleOperate;
      case 11: return CircleOperate;
      case 12: return SystemMessage;
      case 13: return AppVersion;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ImMessageType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ImMessageType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ImMessageType>() {
          public ImMessageType findValueByNumber(int number) {
            return ImMessageType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.hwl.imcore.improto.ImMessage.getDescriptor().getEnumTypes().get(0);
  }

  private static final ImMessageType[] VALUES = values();

  public static ImMessageType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ImMessageType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:ImMessageType)
}

