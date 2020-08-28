// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/hwl/imcore/protocol/im_message.proto

package com.hwl.imcore.improto;

/**
 * Protobuf type {@code ImGroupOperateMessageResponse}
 */
public  final class ImGroupOperateMessageResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ImGroupOperateMessageResponse)
    ImGroupOperateMessageResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImGroupOperateMessageResponse.newBuilder() to construct.
  private ImGroupOperateMessageResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImGroupOperateMessageResponse() {
    buildTime_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ImGroupOperateMessageResponse(
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
          case 10: {
            com.hwl.imcore.improto.ImGroupOperateMessageContent.Builder subBuilder = null;
            if (groupOperateMessageContent_ != null) {
              subBuilder = groupOperateMessageContent_.toBuilder();
            }
            groupOperateMessageContent_ = input.readMessage(com.hwl.imcore.improto.ImGroupOperateMessageContent.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(groupOperateMessageContent_);
              groupOperateMessageContent_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            buildTime_ = input.readUInt64();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
    return com.hwl.imcore.improto.ImMessage.internal_static_ImGroupOperateMessageResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hwl.imcore.improto.ImMessage.internal_static_ImGroupOperateMessageResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hwl.imcore.improto.ImGroupOperateMessageResponse.class, com.hwl.imcore.improto.ImGroupOperateMessageResponse.Builder.class);
  }

  public static final int GROUPOPERATEMESSAGECONTENT_FIELD_NUMBER = 1;
  private com.hwl.imcore.improto.ImGroupOperateMessageContent groupOperateMessageContent_;
  /**
   * <code>.ImGroupOperateMessageContent groupOperateMessageContent = 1;</code>
   */
  public boolean hasGroupOperateMessageContent() {
    return groupOperateMessageContent_ != null;
  }
  /**
   * <code>.ImGroupOperateMessageContent groupOperateMessageContent = 1;</code>
   */
  public com.hwl.imcore.improto.ImGroupOperateMessageContent getGroupOperateMessageContent() {
    return groupOperateMessageContent_ == null ? com.hwl.imcore.improto.ImGroupOperateMessageContent.getDefaultInstance() : groupOperateMessageContent_;
  }
  /**
   * <code>.ImGroupOperateMessageContent groupOperateMessageContent = 1;</code>
   */
  public com.hwl.imcore.improto.ImGroupOperateMessageContentOrBuilder getGroupOperateMessageContentOrBuilder() {
    return getGroupOperateMessageContent();
  }

  public static final int BUILDTIME_FIELD_NUMBER = 2;
  private long buildTime_;
  /**
   * <code>uint64 buildTime = 2;</code>
   */
  public long getBuildTime() {
    return buildTime_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (groupOperateMessageContent_ != null) {
      output.writeMessage(1, getGroupOperateMessageContent());
    }
    if (buildTime_ != 0L) {
      output.writeUInt64(2, buildTime_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (groupOperateMessageContent_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGroupOperateMessageContent());
    }
    if (buildTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, buildTime_);
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
    if (!(obj instanceof com.hwl.imcore.improto.ImGroupOperateMessageResponse)) {
      return super.equals(obj);
    }
    com.hwl.imcore.improto.ImGroupOperateMessageResponse other = (com.hwl.imcore.improto.ImGroupOperateMessageResponse) obj;

    boolean result = true;
    result = result && (hasGroupOperateMessageContent() == other.hasGroupOperateMessageContent());
    if (hasGroupOperateMessageContent()) {
      result = result && getGroupOperateMessageContent()
          .equals(other.getGroupOperateMessageContent());
    }
    result = result && (getBuildTime()
        == other.getBuildTime());
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
    if (hasGroupOperateMessageContent()) {
      hash = (37 * hash) + GROUPOPERATEMESSAGECONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getGroupOperateMessageContent().hashCode();
    }
    hash = (37 * hash) + BUILDTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBuildTime());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hwl.imcore.improto.ImGroupOperateMessageResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hwl.imcore.improto.ImGroupOperateMessageResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImGroupOperateMessageResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hwl.imcore.improto.ImGroupOperateMessageResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImGroupOperateMessageResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hwl.imcore.improto.ImGroupOperateMessageResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImGroupOperateMessageResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hwl.imcore.improto.ImGroupOperateMessageResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImGroupOperateMessageResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hwl.imcore.improto.ImGroupOperateMessageResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImGroupOperateMessageResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hwl.imcore.improto.ImGroupOperateMessageResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.hwl.imcore.improto.ImGroupOperateMessageResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code ImGroupOperateMessageResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ImGroupOperateMessageResponse)
      com.hwl.imcore.improto.ImGroupOperateMessageResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hwl.imcore.improto.ImMessage.internal_static_ImGroupOperateMessageResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hwl.imcore.improto.ImMessage.internal_static_ImGroupOperateMessageResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hwl.imcore.improto.ImGroupOperateMessageResponse.class, com.hwl.imcore.improto.ImGroupOperateMessageResponse.Builder.class);
    }

    // Construct using com.hwl.imcore.improto.ImGroupOperateMessageResponse.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (groupOperateMessageContentBuilder_ == null) {
        groupOperateMessageContent_ = null;
      } else {
        groupOperateMessageContent_ = null;
        groupOperateMessageContentBuilder_ = null;
      }
      buildTime_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hwl.imcore.improto.ImMessage.internal_static_ImGroupOperateMessageResponse_descriptor;
    }

    @java.lang.Override
    public com.hwl.imcore.improto.ImGroupOperateMessageResponse getDefaultInstanceForType() {
      return com.hwl.imcore.improto.ImGroupOperateMessageResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.hwl.imcore.improto.ImGroupOperateMessageResponse build() {
      com.hwl.imcore.improto.ImGroupOperateMessageResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hwl.imcore.improto.ImGroupOperateMessageResponse buildPartial() {
      com.hwl.imcore.improto.ImGroupOperateMessageResponse result = new com.hwl.imcore.improto.ImGroupOperateMessageResponse(this);
      if (groupOperateMessageContentBuilder_ == null) {
        result.groupOperateMessageContent_ = groupOperateMessageContent_;
      } else {
        result.groupOperateMessageContent_ = groupOperateMessageContentBuilder_.build();
      }
      result.buildTime_ = buildTime_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hwl.imcore.improto.ImGroupOperateMessageResponse) {
        return mergeFrom((com.hwl.imcore.improto.ImGroupOperateMessageResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hwl.imcore.improto.ImGroupOperateMessageResponse other) {
      if (other == com.hwl.imcore.improto.ImGroupOperateMessageResponse.getDefaultInstance()) return this;
      if (other.hasGroupOperateMessageContent()) {
        mergeGroupOperateMessageContent(other.getGroupOperateMessageContent());
      }
      if (other.getBuildTime() != 0L) {
        setBuildTime(other.getBuildTime());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.hwl.imcore.improto.ImGroupOperateMessageResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hwl.imcore.improto.ImGroupOperateMessageResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.hwl.imcore.improto.ImGroupOperateMessageContent groupOperateMessageContent_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.hwl.imcore.improto.ImGroupOperateMessageContent, com.hwl.imcore.improto.ImGroupOperateMessageContent.Builder, com.hwl.imcore.improto.ImGroupOperateMessageContentOrBuilder> groupOperateMessageContentBuilder_;
    /**
     * <code>.ImGroupOperateMessageContent groupOperateMessageContent = 1;</code>
     */
    public boolean hasGroupOperateMessageContent() {
      return groupOperateMessageContentBuilder_ != null || groupOperateMessageContent_ != null;
    }
    /**
     * <code>.ImGroupOperateMessageContent groupOperateMessageContent = 1;</code>
     */
    public com.hwl.imcore.improto.ImGroupOperateMessageContent getGroupOperateMessageContent() {
      if (groupOperateMessageContentBuilder_ == null) {
        return groupOperateMessageContent_ == null ? com.hwl.imcore.improto.ImGroupOperateMessageContent.getDefaultInstance() : groupOperateMessageContent_;
      } else {
        return groupOperateMessageContentBuilder_.getMessage();
      }
    }
    /**
     * <code>.ImGroupOperateMessageContent groupOperateMessageContent = 1;</code>
     */
    public Builder setGroupOperateMessageContent(com.hwl.imcore.improto.ImGroupOperateMessageContent value) {
      if (groupOperateMessageContentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        groupOperateMessageContent_ = value;
        onChanged();
      } else {
        groupOperateMessageContentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ImGroupOperateMessageContent groupOperateMessageContent = 1;</code>
     */
    public Builder setGroupOperateMessageContent(
        com.hwl.imcore.improto.ImGroupOperateMessageContent.Builder builderForValue) {
      if (groupOperateMessageContentBuilder_ == null) {
        groupOperateMessageContent_ = builderForValue.build();
        onChanged();
      } else {
        groupOperateMessageContentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ImGroupOperateMessageContent groupOperateMessageContent = 1;</code>
     */
    public Builder mergeGroupOperateMessageContent(com.hwl.imcore.improto.ImGroupOperateMessageContent value) {
      if (groupOperateMessageContentBuilder_ == null) {
        if (groupOperateMessageContent_ != null) {
          groupOperateMessageContent_ =
            com.hwl.imcore.improto.ImGroupOperateMessageContent.newBuilder(groupOperateMessageContent_).mergeFrom(value).buildPartial();
        } else {
          groupOperateMessageContent_ = value;
        }
        onChanged();
      } else {
        groupOperateMessageContentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ImGroupOperateMessageContent groupOperateMessageContent = 1;</code>
     */
    public Builder clearGroupOperateMessageContent() {
      if (groupOperateMessageContentBuilder_ == null) {
        groupOperateMessageContent_ = null;
        onChanged();
      } else {
        groupOperateMessageContent_ = null;
        groupOperateMessageContentBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ImGroupOperateMessageContent groupOperateMessageContent = 1;</code>
     */
    public com.hwl.imcore.improto.ImGroupOperateMessageContent.Builder getGroupOperateMessageContentBuilder() {
      
      onChanged();
      return getGroupOperateMessageContentFieldBuilder().getBuilder();
    }
    /**
     * <code>.ImGroupOperateMessageContent groupOperateMessageContent = 1;</code>
     */
    public com.hwl.imcore.improto.ImGroupOperateMessageContentOrBuilder getGroupOperateMessageContentOrBuilder() {
      if (groupOperateMessageContentBuilder_ != null) {
        return groupOperateMessageContentBuilder_.getMessageOrBuilder();
      } else {
        return groupOperateMessageContent_ == null ?
            com.hwl.imcore.improto.ImGroupOperateMessageContent.getDefaultInstance() : groupOperateMessageContent_;
      }
    }
    /**
     * <code>.ImGroupOperateMessageContent groupOperateMessageContent = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.hwl.imcore.improto.ImGroupOperateMessageContent, com.hwl.imcore.improto.ImGroupOperateMessageContent.Builder, com.hwl.imcore.improto.ImGroupOperateMessageContentOrBuilder> 
        getGroupOperateMessageContentFieldBuilder() {
      if (groupOperateMessageContentBuilder_ == null) {
        groupOperateMessageContentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.hwl.imcore.improto.ImGroupOperateMessageContent, com.hwl.imcore.improto.ImGroupOperateMessageContent.Builder, com.hwl.imcore.improto.ImGroupOperateMessageContentOrBuilder>(
                getGroupOperateMessageContent(),
                getParentForChildren(),
                isClean());
        groupOperateMessageContent_ = null;
      }
      return groupOperateMessageContentBuilder_;
    }

    private long buildTime_ ;
    /**
     * <code>uint64 buildTime = 2;</code>
     */
    public long getBuildTime() {
      return buildTime_;
    }
    /**
     * <code>uint64 buildTime = 2;</code>
     */
    public Builder setBuildTime(long value) {
      
      buildTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 buildTime = 2;</code>
     */
    public Builder clearBuildTime() {
      
      buildTime_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ImGroupOperateMessageResponse)
  }

  // @@protoc_insertion_point(class_scope:ImGroupOperateMessageResponse)
  private static final com.hwl.imcore.improto.ImGroupOperateMessageResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hwl.imcore.improto.ImGroupOperateMessageResponse();
  }

  public static com.hwl.imcore.improto.ImGroupOperateMessageResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImGroupOperateMessageResponse>
      PARSER = new com.google.protobuf.AbstractParser<ImGroupOperateMessageResponse>() {
    @java.lang.Override
    public ImGroupOperateMessageResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ImGroupOperateMessageResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ImGroupOperateMessageResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImGroupOperateMessageResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hwl.imcore.improto.ImGroupOperateMessageResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

