// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/hwl/imcore/protocol/im_message.proto

package com.hwl.imcore.improto;

/**
 * Protobuf type {@code ImSystemMessageRequest}
 */
public  final class ImSystemMessageRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ImSystemMessageRequest)
    ImSystemMessageRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImSystemMessageRequest.newBuilder() to construct.
  private ImSystemMessageRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImSystemMessageRequest() {
    toUserId_ = 0L;
    toGroupGuid_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ImSystemMessageRequest(
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

            toUserId_ = input.readUInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            toGroupGuid_ = s;
            break;
          }
          case 26: {
            com.hwl.imcore.improto.ImSystemMessageContent.Builder subBuilder = null;
            if (systemMessageContent_ != null) {
              subBuilder = systemMessageContent_.toBuilder();
            }
            systemMessageContent_ = input.readMessage(com.hwl.imcore.improto.ImSystemMessageContent.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(systemMessageContent_);
              systemMessageContent_ = subBuilder.buildPartial();
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
    return com.hwl.imcore.improto.ImMessage.internal_static_ImSystemMessageRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hwl.imcore.improto.ImMessage.internal_static_ImSystemMessageRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hwl.imcore.improto.ImSystemMessageRequest.class, com.hwl.imcore.improto.ImSystemMessageRequest.Builder.class);
  }

  public static final int TOUSERID_FIELD_NUMBER = 1;
  private long toUserId_;
  /**
   * <code>uint64 toUserId = 1;</code>
   */
  public long getToUserId() {
    return toUserId_;
  }

  public static final int TOGROUPGUID_FIELD_NUMBER = 2;
  private volatile java.lang.Object toGroupGuid_;
  /**
   * <code>string toGroupGuid = 2;</code>
   */
  public java.lang.String getToGroupGuid() {
    java.lang.Object ref = toGroupGuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      toGroupGuid_ = s;
      return s;
    }
  }
  /**
   * <code>string toGroupGuid = 2;</code>
   */
  public com.google.protobuf.ByteString
      getToGroupGuidBytes() {
    java.lang.Object ref = toGroupGuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      toGroupGuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SYSTEMMESSAGECONTENT_FIELD_NUMBER = 3;
  private com.hwl.imcore.improto.ImSystemMessageContent systemMessageContent_;
  /**
   * <code>.ImSystemMessageContent systemMessageContent = 3;</code>
   */
  public boolean hasSystemMessageContent() {
    return systemMessageContent_ != null;
  }
  /**
   * <code>.ImSystemMessageContent systemMessageContent = 3;</code>
   */
  public com.hwl.imcore.improto.ImSystemMessageContent getSystemMessageContent() {
    return systemMessageContent_ == null ? com.hwl.imcore.improto.ImSystemMessageContent.getDefaultInstance() : systemMessageContent_;
  }
  /**
   * <code>.ImSystemMessageContent systemMessageContent = 3;</code>
   */
  public com.hwl.imcore.improto.ImSystemMessageContentOrBuilder getSystemMessageContentOrBuilder() {
    return getSystemMessageContent();
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
    if (toUserId_ != 0L) {
      output.writeUInt64(1, toUserId_);
    }
    if (!getToGroupGuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, toGroupGuid_);
    }
    if (systemMessageContent_ != null) {
      output.writeMessage(3, getSystemMessageContent());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (toUserId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, toUserId_);
    }
    if (!getToGroupGuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, toGroupGuid_);
    }
    if (systemMessageContent_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSystemMessageContent());
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
    if (!(obj instanceof com.hwl.imcore.improto.ImSystemMessageRequest)) {
      return super.equals(obj);
    }
    com.hwl.imcore.improto.ImSystemMessageRequest other = (com.hwl.imcore.improto.ImSystemMessageRequest) obj;

    boolean result = true;
    result = result && (getToUserId()
        == other.getToUserId());
    result = result && getToGroupGuid()
        .equals(other.getToGroupGuid());
    result = result && (hasSystemMessageContent() == other.hasSystemMessageContent());
    if (hasSystemMessageContent()) {
      result = result && getSystemMessageContent()
          .equals(other.getSystemMessageContent());
    }
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
    hash = (37 * hash) + TOUSERID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getToUserId());
    hash = (37 * hash) + TOGROUPGUID_FIELD_NUMBER;
    hash = (53 * hash) + getToGroupGuid().hashCode();
    if (hasSystemMessageContent()) {
      hash = (37 * hash) + SYSTEMMESSAGECONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getSystemMessageContent().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hwl.imcore.improto.ImSystemMessageRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hwl.imcore.improto.ImSystemMessageRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImSystemMessageRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hwl.imcore.improto.ImSystemMessageRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImSystemMessageRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hwl.imcore.improto.ImSystemMessageRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImSystemMessageRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hwl.imcore.improto.ImSystemMessageRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImSystemMessageRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hwl.imcore.improto.ImSystemMessageRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImSystemMessageRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hwl.imcore.improto.ImSystemMessageRequest parseFrom(
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
  public static Builder newBuilder(com.hwl.imcore.improto.ImSystemMessageRequest prototype) {
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
   * Protobuf type {@code ImSystemMessageRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ImSystemMessageRequest)
      com.hwl.imcore.improto.ImSystemMessageRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hwl.imcore.improto.ImMessage.internal_static_ImSystemMessageRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hwl.imcore.improto.ImMessage.internal_static_ImSystemMessageRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hwl.imcore.improto.ImSystemMessageRequest.class, com.hwl.imcore.improto.ImSystemMessageRequest.Builder.class);
    }

    // Construct using com.hwl.imcore.improto.ImSystemMessageRequest.newBuilder()
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
      toUserId_ = 0L;

      toGroupGuid_ = "";

      if (systemMessageContentBuilder_ == null) {
        systemMessageContent_ = null;
      } else {
        systemMessageContent_ = null;
        systemMessageContentBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hwl.imcore.improto.ImMessage.internal_static_ImSystemMessageRequest_descriptor;
    }

    public com.hwl.imcore.improto.ImSystemMessageRequest getDefaultInstanceForType() {
      return com.hwl.imcore.improto.ImSystemMessageRequest.getDefaultInstance();
    }

    public com.hwl.imcore.improto.ImSystemMessageRequest build() {
      com.hwl.imcore.improto.ImSystemMessageRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.hwl.imcore.improto.ImSystemMessageRequest buildPartial() {
      com.hwl.imcore.improto.ImSystemMessageRequest result = new com.hwl.imcore.improto.ImSystemMessageRequest(this);
      result.toUserId_ = toUserId_;
      result.toGroupGuid_ = toGroupGuid_;
      if (systemMessageContentBuilder_ == null) {
        result.systemMessageContent_ = systemMessageContent_;
      } else {
        result.systemMessageContent_ = systemMessageContentBuilder_.build();
      }
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
      if (other instanceof com.hwl.imcore.improto.ImSystemMessageRequest) {
        return mergeFrom((com.hwl.imcore.improto.ImSystemMessageRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hwl.imcore.improto.ImSystemMessageRequest other) {
      if (other == com.hwl.imcore.improto.ImSystemMessageRequest.getDefaultInstance()) return this;
      if (other.getToUserId() != 0L) {
        setToUserId(other.getToUserId());
      }
      if (!other.getToGroupGuid().isEmpty()) {
        toGroupGuid_ = other.toGroupGuid_;
        onChanged();
      }
      if (other.hasSystemMessageContent()) {
        mergeSystemMessageContent(other.getSystemMessageContent());
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
      com.hwl.imcore.improto.ImSystemMessageRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hwl.imcore.improto.ImSystemMessageRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long toUserId_ ;
    /**
     * <code>uint64 toUserId = 1;</code>
     */
    public long getToUserId() {
      return toUserId_;
    }
    /**
     * <code>uint64 toUserId = 1;</code>
     */
    public Builder setToUserId(long value) {
      
      toUserId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 toUserId = 1;</code>
     */
    public Builder clearToUserId() {
      
      toUserId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object toGroupGuid_ = "";
    /**
     * <code>string toGroupGuid = 2;</code>
     */
    public java.lang.String getToGroupGuid() {
      java.lang.Object ref = toGroupGuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        toGroupGuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string toGroupGuid = 2;</code>
     */
    public com.google.protobuf.ByteString
        getToGroupGuidBytes() {
      java.lang.Object ref = toGroupGuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        toGroupGuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string toGroupGuid = 2;</code>
     */
    public Builder setToGroupGuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      toGroupGuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string toGroupGuid = 2;</code>
     */
    public Builder clearToGroupGuid() {
      
      toGroupGuid_ = getDefaultInstance().getToGroupGuid();
      onChanged();
      return this;
    }
    /**
     * <code>string toGroupGuid = 2;</code>
     */
    public Builder setToGroupGuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      toGroupGuid_ = value;
      onChanged();
      return this;
    }

    private com.hwl.imcore.improto.ImSystemMessageContent systemMessageContent_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.hwl.imcore.improto.ImSystemMessageContent, com.hwl.imcore.improto.ImSystemMessageContent.Builder, com.hwl.imcore.improto.ImSystemMessageContentOrBuilder> systemMessageContentBuilder_;
    /**
     * <code>.ImSystemMessageContent systemMessageContent = 3;</code>
     */
    public boolean hasSystemMessageContent() {
      return systemMessageContentBuilder_ != null || systemMessageContent_ != null;
    }
    /**
     * <code>.ImSystemMessageContent systemMessageContent = 3;</code>
     */
    public com.hwl.imcore.improto.ImSystemMessageContent getSystemMessageContent() {
      if (systemMessageContentBuilder_ == null) {
        return systemMessageContent_ == null ? com.hwl.imcore.improto.ImSystemMessageContent.getDefaultInstance() : systemMessageContent_;
      } else {
        return systemMessageContentBuilder_.getMessage();
      }
    }
    /**
     * <code>.ImSystemMessageContent systemMessageContent = 3;</code>
     */
    public Builder setSystemMessageContent(com.hwl.imcore.improto.ImSystemMessageContent value) {
      if (systemMessageContentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        systemMessageContent_ = value;
        onChanged();
      } else {
        systemMessageContentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ImSystemMessageContent systemMessageContent = 3;</code>
     */
    public Builder setSystemMessageContent(
        com.hwl.imcore.improto.ImSystemMessageContent.Builder builderForValue) {
      if (systemMessageContentBuilder_ == null) {
        systemMessageContent_ = builderForValue.build();
        onChanged();
      } else {
        systemMessageContentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ImSystemMessageContent systemMessageContent = 3;</code>
     */
    public Builder mergeSystemMessageContent(com.hwl.imcore.improto.ImSystemMessageContent value) {
      if (systemMessageContentBuilder_ == null) {
        if (systemMessageContent_ != null) {
          systemMessageContent_ =
            com.hwl.imcore.improto.ImSystemMessageContent.newBuilder(systemMessageContent_).mergeFrom(value).buildPartial();
        } else {
          systemMessageContent_ = value;
        }
        onChanged();
      } else {
        systemMessageContentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ImSystemMessageContent systemMessageContent = 3;</code>
     */
    public Builder clearSystemMessageContent() {
      if (systemMessageContentBuilder_ == null) {
        systemMessageContent_ = null;
        onChanged();
      } else {
        systemMessageContent_ = null;
        systemMessageContentBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ImSystemMessageContent systemMessageContent = 3;</code>
     */
    public com.hwl.imcore.improto.ImSystemMessageContent.Builder getSystemMessageContentBuilder() {
      
      onChanged();
      return getSystemMessageContentFieldBuilder().getBuilder();
    }
    /**
     * <code>.ImSystemMessageContent systemMessageContent = 3;</code>
     */
    public com.hwl.imcore.improto.ImSystemMessageContentOrBuilder getSystemMessageContentOrBuilder() {
      if (systemMessageContentBuilder_ != null) {
        return systemMessageContentBuilder_.getMessageOrBuilder();
      } else {
        return systemMessageContent_ == null ?
            com.hwl.imcore.improto.ImSystemMessageContent.getDefaultInstance() : systemMessageContent_;
      }
    }
    /**
     * <code>.ImSystemMessageContent systemMessageContent = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.hwl.imcore.improto.ImSystemMessageContent, com.hwl.imcore.improto.ImSystemMessageContent.Builder, com.hwl.imcore.improto.ImSystemMessageContentOrBuilder> 
        getSystemMessageContentFieldBuilder() {
      if (systemMessageContentBuilder_ == null) {
        systemMessageContentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.hwl.imcore.improto.ImSystemMessageContent, com.hwl.imcore.improto.ImSystemMessageContent.Builder, com.hwl.imcore.improto.ImSystemMessageContentOrBuilder>(
                getSystemMessageContent(),
                getParentForChildren(),
                isClean());
        systemMessageContent_ = null;
      }
      return systemMessageContentBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ImSystemMessageRequest)
  }

  // @@protoc_insertion_point(class_scope:ImSystemMessageRequest)
  private static final com.hwl.imcore.improto.ImSystemMessageRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hwl.imcore.improto.ImSystemMessageRequest();
  }

  public static com.hwl.imcore.improto.ImSystemMessageRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImSystemMessageRequest>
      PARSER = new com.google.protobuf.AbstractParser<ImSystemMessageRequest>() {
    public ImSystemMessageRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ImSystemMessageRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ImSystemMessageRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImSystemMessageRequest> getParserForType() {
    return PARSER;
  }

  public com.hwl.imcore.improto.ImSystemMessageRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
