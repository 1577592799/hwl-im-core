// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/hwl/imcore/protocol/im_message.proto

package com.hwl.imcore.improto;

/**
 * Protobuf type {@code ImChatUserMessageContent}
 */
public  final class ImChatUserMessageContent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ImChatUserMessageContent)
    ImChatUserMessageContentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImChatUserMessageContent.newBuilder() to construct.
  private ImChatUserMessageContent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImChatUserMessageContent() {
    fromUserId_ = 0L;
    fromUserName_ = "";
    fromUserImage_ = "";
    toUserId_ = 0L;
    contentType_ = 0;
    content_ = "";
    previewUrl_ = "";
    imageWidth_ = 0;
    imageHeight_ = 0;
    size_ = 0;
    playTime_ = 0;
    isFriend_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ImChatUserMessageContent(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            fromUserId_ = input.readUInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            fromUserName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            fromUserImage_ = s;
            break;
          }
          case 32: {

            toUserId_ = input.readUInt64();
            break;
          }
          case 40: {

            contentType_ = input.readUInt32();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            content_ = s;
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            previewUrl_ = s;
            break;
          }
          case 64: {

            imageWidth_ = input.readUInt32();
            break;
          }
          case 72: {

            imageHeight_ = input.readUInt32();
            break;
          }
          case 80: {

            size_ = input.readUInt32();
            break;
          }
          case 88: {

            playTime_ = input.readUInt32();
            break;
          }
          case 96: {

            isFriend_ = input.readBool();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hwl.imcore.improto.ImMessage.internal_static_ImChatUserMessageContent_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hwl.imcore.improto.ImMessage.internal_static_ImChatUserMessageContent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hwl.imcore.improto.ImChatUserMessageContent.class, com.hwl.imcore.improto.ImChatUserMessageContent.Builder.class);
  }

  public static final int FROMUSERID_FIELD_NUMBER = 1;
  private long fromUserId_;
  /**
   * <code>uint64 fromUserId = 1;</code>
   */
  public long getFromUserId() {
    return fromUserId_;
  }

  public static final int FROMUSERNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object fromUserName_;
  /**
   * <code>string fromUserName = 2;</code>
   */
  public java.lang.String getFromUserName() {
    java.lang.Object ref = fromUserName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fromUserName_ = s;
      return s;
    }
  }
  /**
   * <code>string fromUserName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getFromUserNameBytes() {
    java.lang.Object ref = fromUserName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fromUserName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FROMUSERIMAGE_FIELD_NUMBER = 3;
  private volatile java.lang.Object fromUserImage_;
  /**
   * <code>string fromUserImage = 3;</code>
   */
  public java.lang.String getFromUserImage() {
    java.lang.Object ref = fromUserImage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fromUserImage_ = s;
      return s;
    }
  }
  /**
   * <code>string fromUserImage = 3;</code>
   */
  public com.google.protobuf.ByteString
      getFromUserImageBytes() {
    java.lang.Object ref = fromUserImage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fromUserImage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOUSERID_FIELD_NUMBER = 4;
  private long toUserId_;
  /**
   * <code>uint64 toUserId = 4;</code>
   */
  public long getToUserId() {
    return toUserId_;
  }

  public static final int CONTENTTYPE_FIELD_NUMBER = 5;
  private int contentType_;
  /**
   * <code>uint32 contentType = 5;</code>
   */
  public int getContentType() {
    return contentType_;
  }

  public static final int CONTENT_FIELD_NUMBER = 6;
  private volatile java.lang.Object content_;
  /**
   * <code>string content = 6;</code>
   */
  public java.lang.String getContent() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      content_ = s;
      return s;
    }
  }
  /**
   * <code>string content = 6;</code>
   */
  public com.google.protobuf.ByteString
      getContentBytes() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      content_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PREVIEWURL_FIELD_NUMBER = 7;
  private volatile java.lang.Object previewUrl_;
  /**
   * <code>string previewUrl = 7;</code>
   */
  public java.lang.String getPreviewUrl() {
    java.lang.Object ref = previewUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      previewUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string previewUrl = 7;</code>
   */
  public com.google.protobuf.ByteString
      getPreviewUrlBytes() {
    java.lang.Object ref = previewUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      previewUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IMAGEWIDTH_FIELD_NUMBER = 8;
  private int imageWidth_;
  /**
   * <code>uint32 imageWidth = 8;</code>
   */
  public int getImageWidth() {
    return imageWidth_;
  }

  public static final int IMAGEHEIGHT_FIELD_NUMBER = 9;
  private int imageHeight_;
  /**
   * <code>uint32 imageHeight = 9;</code>
   */
  public int getImageHeight() {
    return imageHeight_;
  }

  public static final int SIZE_FIELD_NUMBER = 10;
  private int size_;
  /**
   * <code>uint32 size = 10;</code>
   */
  public int getSize() {
    return size_;
  }

  public static final int PLAYTIME_FIELD_NUMBER = 11;
  private int playTime_;
  /**
   * <code>uint32 playTime = 11;</code>
   */
  public int getPlayTime() {
    return playTime_;
  }

  public static final int ISFRIEND_FIELD_NUMBER = 12;
  private boolean isFriend_;
  /**
   * <code>bool isFriend = 12;</code>
   */
  public boolean getIsFriend() {
    return isFriend_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (fromUserId_ != 0L) {
      output.writeUInt64(1, fromUserId_);
    }
    if (!getFromUserNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fromUserName_);
    }
    if (!getFromUserImageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, fromUserImage_);
    }
    if (toUserId_ != 0L) {
      output.writeUInt64(4, toUserId_);
    }
    if (contentType_ != 0) {
      output.writeUInt32(5, contentType_);
    }
    if (!getContentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, content_);
    }
    if (!getPreviewUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, previewUrl_);
    }
    if (imageWidth_ != 0) {
      output.writeUInt32(8, imageWidth_);
    }
    if (imageHeight_ != 0) {
      output.writeUInt32(9, imageHeight_);
    }
    if (size_ != 0) {
      output.writeUInt32(10, size_);
    }
    if (playTime_ != 0) {
      output.writeUInt32(11, playTime_);
    }
    if (isFriend_ != false) {
      output.writeBool(12, isFriend_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fromUserId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, fromUserId_);
    }
    if (!getFromUserNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fromUserName_);
    }
    if (!getFromUserImageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, fromUserImage_);
    }
    if (toUserId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, toUserId_);
    }
    if (contentType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, contentType_);
    }
    if (!getContentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, content_);
    }
    if (!getPreviewUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, previewUrl_);
    }
    if (imageWidth_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(8, imageWidth_);
    }
    if (imageHeight_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(9, imageHeight_);
    }
    if (size_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(10, size_);
    }
    if (playTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(11, playTime_);
    }
    if (isFriend_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(12, isFriend_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.hwl.imcore.improto.ImChatUserMessageContent)) {
      return super.equals(obj);
    }
    com.hwl.imcore.improto.ImChatUserMessageContent other = (com.hwl.imcore.improto.ImChatUserMessageContent) obj;

    boolean result = true;
    result = result && (getFromUserId()
        == other.getFromUserId());
    result = result && getFromUserName()
        .equals(other.getFromUserName());
    result = result && getFromUserImage()
        .equals(other.getFromUserImage());
    result = result && (getToUserId()
        == other.getToUserId());
    result = result && (getContentType()
        == other.getContentType());
    result = result && getContent()
        .equals(other.getContent());
    result = result && getPreviewUrl()
        .equals(other.getPreviewUrl());
    result = result && (getImageWidth()
        == other.getImageWidth());
    result = result && (getImageHeight()
        == other.getImageHeight());
    result = result && (getSize()
        == other.getSize());
    result = result && (getPlayTime()
        == other.getPlayTime());
    result = result && (getIsFriend()
        == other.getIsFriend());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FROMUSERID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFromUserId());
    hash = (37 * hash) + FROMUSERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getFromUserName().hashCode();
    hash = (37 * hash) + FROMUSERIMAGE_FIELD_NUMBER;
    hash = (53 * hash) + getFromUserImage().hashCode();
    hash = (37 * hash) + TOUSERID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getToUserId());
    hash = (37 * hash) + CONTENTTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getContentType();
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    hash = (37 * hash) + PREVIEWURL_FIELD_NUMBER;
    hash = (53 * hash) + getPreviewUrl().hashCode();
    hash = (37 * hash) + IMAGEWIDTH_FIELD_NUMBER;
    hash = (53 * hash) + getImageWidth();
    hash = (37 * hash) + IMAGEHEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getImageHeight();
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getSize();
    hash = (37 * hash) + PLAYTIME_FIELD_NUMBER;
    hash = (53 * hash) + getPlayTime();
    hash = (37 * hash) + ISFRIEND_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsFriend());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hwl.imcore.improto.ImChatUserMessageContent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hwl.imcore.improto.ImChatUserMessageContent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImChatUserMessageContent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hwl.imcore.improto.ImChatUserMessageContent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImChatUserMessageContent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hwl.imcore.improto.ImChatUserMessageContent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImChatUserMessageContent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hwl.imcore.improto.ImChatUserMessageContent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImChatUserMessageContent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hwl.imcore.improto.ImChatUserMessageContent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImChatUserMessageContent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hwl.imcore.improto.ImChatUserMessageContent parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.hwl.imcore.improto.ImChatUserMessageContent prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ImChatUserMessageContent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ImChatUserMessageContent)
      com.hwl.imcore.improto.ImChatUserMessageContentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hwl.imcore.improto.ImMessage.internal_static_ImChatUserMessageContent_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hwl.imcore.improto.ImMessage.internal_static_ImChatUserMessageContent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hwl.imcore.improto.ImChatUserMessageContent.class, com.hwl.imcore.improto.ImChatUserMessageContent.Builder.class);
    }

    // Construct using com.hwl.imcore.improto.ImChatUserMessageContent.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      fromUserId_ = 0L;

      fromUserName_ = "";

      fromUserImage_ = "";

      toUserId_ = 0L;

      contentType_ = 0;

      content_ = "";

      previewUrl_ = "";

      imageWidth_ = 0;

      imageHeight_ = 0;

      size_ = 0;

      playTime_ = 0;

      isFriend_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hwl.imcore.improto.ImMessage.internal_static_ImChatUserMessageContent_descriptor;
    }

    public com.hwl.imcore.improto.ImChatUserMessageContent getDefaultInstanceForType() {
      return com.hwl.imcore.improto.ImChatUserMessageContent.getDefaultInstance();
    }

    public com.hwl.imcore.improto.ImChatUserMessageContent build() {
      com.hwl.imcore.improto.ImChatUserMessageContent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.hwl.imcore.improto.ImChatUserMessageContent buildPartial() {
      com.hwl.imcore.improto.ImChatUserMessageContent result = new com.hwl.imcore.improto.ImChatUserMessageContent(this);
      result.fromUserId_ = fromUserId_;
      result.fromUserName_ = fromUserName_;
      result.fromUserImage_ = fromUserImage_;
      result.toUserId_ = toUserId_;
      result.contentType_ = contentType_;
      result.content_ = content_;
      result.previewUrl_ = previewUrl_;
      result.imageWidth_ = imageWidth_;
      result.imageHeight_ = imageHeight_;
      result.size_ = size_;
      result.playTime_ = playTime_;
      result.isFriend_ = isFriend_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hwl.imcore.improto.ImChatUserMessageContent) {
        return mergeFrom((com.hwl.imcore.improto.ImChatUserMessageContent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hwl.imcore.improto.ImChatUserMessageContent other) {
      if (other == com.hwl.imcore.improto.ImChatUserMessageContent.getDefaultInstance()) return this;
      if (other.getFromUserId() != 0L) {
        setFromUserId(other.getFromUserId());
      }
      if (!other.getFromUserName().isEmpty()) {
        fromUserName_ = other.fromUserName_;
        onChanged();
      }
      if (!other.getFromUserImage().isEmpty()) {
        fromUserImage_ = other.fromUserImage_;
        onChanged();
      }
      if (other.getToUserId() != 0L) {
        setToUserId(other.getToUserId());
      }
      if (other.getContentType() != 0) {
        setContentType(other.getContentType());
      }
      if (!other.getContent().isEmpty()) {
        content_ = other.content_;
        onChanged();
      }
      if (!other.getPreviewUrl().isEmpty()) {
        previewUrl_ = other.previewUrl_;
        onChanged();
      }
      if (other.getImageWidth() != 0) {
        setImageWidth(other.getImageWidth());
      }
      if (other.getImageHeight() != 0) {
        setImageHeight(other.getImageHeight());
      }
      if (other.getSize() != 0) {
        setSize(other.getSize());
      }
      if (other.getPlayTime() != 0) {
        setPlayTime(other.getPlayTime());
      }
      if (other.getIsFriend() != false) {
        setIsFriend(other.getIsFriend());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.hwl.imcore.improto.ImChatUserMessageContent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hwl.imcore.improto.ImChatUserMessageContent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long fromUserId_ ;
    /**
     * <code>uint64 fromUserId = 1;</code>
     */
    public long getFromUserId() {
      return fromUserId_;
    }
    /**
     * <code>uint64 fromUserId = 1;</code>
     */
    public Builder setFromUserId(long value) {
      
      fromUserId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 fromUserId = 1;</code>
     */
    public Builder clearFromUserId() {
      
      fromUserId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object fromUserName_ = "";
    /**
     * <code>string fromUserName = 2;</code>
     */
    public java.lang.String getFromUserName() {
      java.lang.Object ref = fromUserName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fromUserName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fromUserName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFromUserNameBytes() {
      java.lang.Object ref = fromUserName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fromUserName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fromUserName = 2;</code>
     */
    public Builder setFromUserName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fromUserName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fromUserName = 2;</code>
     */
    public Builder clearFromUserName() {
      
      fromUserName_ = getDefaultInstance().getFromUserName();
      onChanged();
      return this;
    }
    /**
     * <code>string fromUserName = 2;</code>
     */
    public Builder setFromUserNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fromUserName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object fromUserImage_ = "";
    /**
     * <code>string fromUserImage = 3;</code>
     */
    public java.lang.String getFromUserImage() {
      java.lang.Object ref = fromUserImage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fromUserImage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fromUserImage = 3;</code>
     */
    public com.google.protobuf.ByteString
        getFromUserImageBytes() {
      java.lang.Object ref = fromUserImage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fromUserImage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fromUserImage = 3;</code>
     */
    public Builder setFromUserImage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fromUserImage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fromUserImage = 3;</code>
     */
    public Builder clearFromUserImage() {
      
      fromUserImage_ = getDefaultInstance().getFromUserImage();
      onChanged();
      return this;
    }
    /**
     * <code>string fromUserImage = 3;</code>
     */
    public Builder setFromUserImageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fromUserImage_ = value;
      onChanged();
      return this;
    }

    private long toUserId_ ;
    /**
     * <code>uint64 toUserId = 4;</code>
     */
    public long getToUserId() {
      return toUserId_;
    }
    /**
     * <code>uint64 toUserId = 4;</code>
     */
    public Builder setToUserId(long value) {
      
      toUserId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 toUserId = 4;</code>
     */
    public Builder clearToUserId() {
      
      toUserId_ = 0L;
      onChanged();
      return this;
    }

    private int contentType_ ;
    /**
     * <code>uint32 contentType = 5;</code>
     */
    public int getContentType() {
      return contentType_;
    }
    /**
     * <code>uint32 contentType = 5;</code>
     */
    public Builder setContentType(int value) {
      
      contentType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 contentType = 5;</code>
     */
    public Builder clearContentType() {
      
      contentType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object content_ = "";
    /**
     * <code>string content = 6;</code>
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string content = 6;</code>
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string content = 6;</code>
     */
    public Builder setContent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      content_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string content = 6;</code>
     */
    public Builder clearContent() {
      
      content_ = getDefaultInstance().getContent();
      onChanged();
      return this;
    }
    /**
     * <code>string content = 6;</code>
     */
    public Builder setContentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      content_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object previewUrl_ = "";
    /**
     * <code>string previewUrl = 7;</code>
     */
    public java.lang.String getPreviewUrl() {
      java.lang.Object ref = previewUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        previewUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string previewUrl = 7;</code>
     */
    public com.google.protobuf.ByteString
        getPreviewUrlBytes() {
      java.lang.Object ref = previewUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        previewUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string previewUrl = 7;</code>
     */
    public Builder setPreviewUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      previewUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string previewUrl = 7;</code>
     */
    public Builder clearPreviewUrl() {
      
      previewUrl_ = getDefaultInstance().getPreviewUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string previewUrl = 7;</code>
     */
    public Builder setPreviewUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      previewUrl_ = value;
      onChanged();
      return this;
    }

    private int imageWidth_ ;
    /**
     * <code>uint32 imageWidth = 8;</code>
     */
    public int getImageWidth() {
      return imageWidth_;
    }
    /**
     * <code>uint32 imageWidth = 8;</code>
     */
    public Builder setImageWidth(int value) {
      
      imageWidth_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 imageWidth = 8;</code>
     */
    public Builder clearImageWidth() {
      
      imageWidth_ = 0;
      onChanged();
      return this;
    }

    private int imageHeight_ ;
    /**
     * <code>uint32 imageHeight = 9;</code>
     */
    public int getImageHeight() {
      return imageHeight_;
    }
    /**
     * <code>uint32 imageHeight = 9;</code>
     */
    public Builder setImageHeight(int value) {
      
      imageHeight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 imageHeight = 9;</code>
     */
    public Builder clearImageHeight() {
      
      imageHeight_ = 0;
      onChanged();
      return this;
    }

    private int size_ ;
    /**
     * <code>uint32 size = 10;</code>
     */
    public int getSize() {
      return size_;
    }
    /**
     * <code>uint32 size = 10;</code>
     */
    public Builder setSize(int value) {
      
      size_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 size = 10;</code>
     */
    public Builder clearSize() {
      
      size_ = 0;
      onChanged();
      return this;
    }

    private int playTime_ ;
    /**
     * <code>uint32 playTime = 11;</code>
     */
    public int getPlayTime() {
      return playTime_;
    }
    /**
     * <code>uint32 playTime = 11;</code>
     */
    public Builder setPlayTime(int value) {
      
      playTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 playTime = 11;</code>
     */
    public Builder clearPlayTime() {
      
      playTime_ = 0;
      onChanged();
      return this;
    }

    private boolean isFriend_ ;
    /**
     * <code>bool isFriend = 12;</code>
     */
    public boolean getIsFriend() {
      return isFriend_;
    }
    /**
     * <code>bool isFriend = 12;</code>
     */
    public Builder setIsFriend(boolean value) {
      
      isFriend_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isFriend = 12;</code>
     */
    public Builder clearIsFriend() {
      
      isFriend_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ImChatUserMessageContent)
  }

  // @@protoc_insertion_point(class_scope:ImChatUserMessageContent)
  private static final com.hwl.imcore.improto.ImChatUserMessageContent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hwl.imcore.improto.ImChatUserMessageContent();
  }

  public static com.hwl.imcore.improto.ImChatUserMessageContent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImChatUserMessageContent>
      PARSER = new com.google.protobuf.AbstractParser<ImChatUserMessageContent>() {
    public ImChatUserMessageContent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ImChatUserMessageContent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ImChatUserMessageContent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImChatUserMessageContent> getParserForType() {
    return PARSER;
  }

  public com.hwl.imcore.improto.ImChatUserMessageContent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

