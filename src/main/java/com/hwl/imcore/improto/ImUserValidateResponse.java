// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/hwl/imcore/protocol/im_message.proto

package com.hwl.imcore.improto;

/**
 * Protobuf type {@code ImUserValidateResponse}
 */
public  final class ImUserValidateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ImUserValidateResponse)
    ImUserValidateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImUserValidateResponse.newBuilder() to construct.
  private ImUserValidateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImUserValidateResponse() {
    isSuccess_ = false;
    message_ = "";
    isOnline_ = false;
    session_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ImUserValidateResponse(
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
          case 8: {

            isSuccess_ = input.readBool();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 24: {

            isOnline_ = input.readBool();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            session_ = s;
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
    return com.hwl.imcore.improto.ImMessage.internal_static_ImUserValidateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hwl.imcore.improto.ImMessage.internal_static_ImUserValidateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hwl.imcore.improto.ImUserValidateResponse.class, com.hwl.imcore.improto.ImUserValidateResponse.Builder.class);
  }

  public static final int ISSUCCESS_FIELD_NUMBER = 1;
  private boolean isSuccess_;
  /**
   * <code>bool isSuccess = 1;</code>
   */
  public boolean getIsSuccess() {
    return isSuccess_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 2;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ISONLINE_FIELD_NUMBER = 3;
  private boolean isOnline_;
  /**
   * <code>bool isOnline = 3;</code>
   */
  public boolean getIsOnline() {
    return isOnline_;
  }

  public static final int SESSION_FIELD_NUMBER = 4;
  private volatile java.lang.Object session_;
  /**
   * <code>string session = 4;</code>
   */
  public java.lang.String getSession() {
    java.lang.Object ref = session_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      session_ = s;
      return s;
    }
  }
  /**
   * <code>string session = 4;</code>
   */
  public com.google.protobuf.ByteString
      getSessionBytes() {
    java.lang.Object ref = session_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      session_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (isSuccess_ != false) {
      output.writeBool(1, isSuccess_);
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    if (isOnline_ != false) {
      output.writeBool(3, isOnline_);
    }
    if (!getSessionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, session_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isSuccess_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, isSuccess_);
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    if (isOnline_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isOnline_);
    }
    if (!getSessionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, session_);
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
    if (!(obj instanceof com.hwl.imcore.improto.ImUserValidateResponse)) {
      return super.equals(obj);
    }
    com.hwl.imcore.improto.ImUserValidateResponse other = (com.hwl.imcore.improto.ImUserValidateResponse) obj;

    boolean result = true;
    result = result && (getIsSuccess()
        == other.getIsSuccess());
    result = result && getMessage()
        .equals(other.getMessage());
    result = result && (getIsOnline()
        == other.getIsOnline());
    result = result && getSession()
        .equals(other.getSession());
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
    hash = (37 * hash) + ISSUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsSuccess());
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + ISONLINE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsOnline());
    hash = (37 * hash) + SESSION_FIELD_NUMBER;
    hash = (53 * hash) + getSession().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hwl.imcore.improto.ImUserValidateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hwl.imcore.improto.ImUserValidateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImUserValidateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hwl.imcore.improto.ImUserValidateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImUserValidateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hwl.imcore.improto.ImUserValidateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImUserValidateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hwl.imcore.improto.ImUserValidateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImUserValidateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hwl.imcore.improto.ImUserValidateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImUserValidateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hwl.imcore.improto.ImUserValidateResponse parseFrom(
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
  public static Builder newBuilder(com.hwl.imcore.improto.ImUserValidateResponse prototype) {
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
   * Protobuf type {@code ImUserValidateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ImUserValidateResponse)
      com.hwl.imcore.improto.ImUserValidateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hwl.imcore.improto.ImMessage.internal_static_ImUserValidateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hwl.imcore.improto.ImMessage.internal_static_ImUserValidateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hwl.imcore.improto.ImUserValidateResponse.class, com.hwl.imcore.improto.ImUserValidateResponse.Builder.class);
    }

    // Construct using com.hwl.imcore.improto.ImUserValidateResponse.newBuilder()
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
      isSuccess_ = false;

      message_ = "";

      isOnline_ = false;

      session_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hwl.imcore.improto.ImMessage.internal_static_ImUserValidateResponse_descriptor;
    }

    @java.lang.Override
    public com.hwl.imcore.improto.ImUserValidateResponse getDefaultInstanceForType() {
      return com.hwl.imcore.improto.ImUserValidateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.hwl.imcore.improto.ImUserValidateResponse build() {
      com.hwl.imcore.improto.ImUserValidateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hwl.imcore.improto.ImUserValidateResponse buildPartial() {
      com.hwl.imcore.improto.ImUserValidateResponse result = new com.hwl.imcore.improto.ImUserValidateResponse(this);
      result.isSuccess_ = isSuccess_;
      result.message_ = message_;
      result.isOnline_ = isOnline_;
      result.session_ = session_;
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
      if (other instanceof com.hwl.imcore.improto.ImUserValidateResponse) {
        return mergeFrom((com.hwl.imcore.improto.ImUserValidateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hwl.imcore.improto.ImUserValidateResponse other) {
      if (other == com.hwl.imcore.improto.ImUserValidateResponse.getDefaultInstance()) return this;
      if (other.getIsSuccess() != false) {
        setIsSuccess(other.getIsSuccess());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (other.getIsOnline() != false) {
        setIsOnline(other.getIsOnline());
      }
      if (!other.getSession().isEmpty()) {
        session_ = other.session_;
        onChanged();
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
      com.hwl.imcore.improto.ImUserValidateResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hwl.imcore.improto.ImUserValidateResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean isSuccess_ ;
    /**
     * <code>bool isSuccess = 1;</code>
     */
    public boolean getIsSuccess() {
      return isSuccess_;
    }
    /**
     * <code>bool isSuccess = 1;</code>
     */
    public Builder setIsSuccess(boolean value) {
      
      isSuccess_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isSuccess = 1;</code>
     */
    public Builder clearIsSuccess() {
      
      isSuccess_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 2;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private boolean isOnline_ ;
    /**
     * <code>bool isOnline = 3;</code>
     */
    public boolean getIsOnline() {
      return isOnline_;
    }
    /**
     * <code>bool isOnline = 3;</code>
     */
    public Builder setIsOnline(boolean value) {
      
      isOnline_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isOnline = 3;</code>
     */
    public Builder clearIsOnline() {
      
      isOnline_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object session_ = "";
    /**
     * <code>string session = 4;</code>
     */
    public java.lang.String getSession() {
      java.lang.Object ref = session_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        session_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string session = 4;</code>
     */
    public com.google.protobuf.ByteString
        getSessionBytes() {
      java.lang.Object ref = session_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        session_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string session = 4;</code>
     */
    public Builder setSession(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      session_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string session = 4;</code>
     */
    public Builder clearSession() {
      
      session_ = getDefaultInstance().getSession();
      onChanged();
      return this;
    }
    /**
     * <code>string session = 4;</code>
     */
    public Builder setSessionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      session_ = value;
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


    // @@protoc_insertion_point(builder_scope:ImUserValidateResponse)
  }

  // @@protoc_insertion_point(class_scope:ImUserValidateResponse)
  private static final com.hwl.imcore.improto.ImUserValidateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hwl.imcore.improto.ImUserValidateResponse();
  }

  public static com.hwl.imcore.improto.ImUserValidateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImUserValidateResponse>
      PARSER = new com.google.protobuf.AbstractParser<ImUserValidateResponse>() {
    @java.lang.Override
    public ImUserValidateResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ImUserValidateResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ImUserValidateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImUserValidateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hwl.imcore.improto.ImUserValidateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

