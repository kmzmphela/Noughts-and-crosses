// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TicTacToe.proto

package com.frei.tic_tac_toe;

/**
 * <pre>
 * The response message containing the greetings.
 * </pre>
 *
 * Protobuf type {@code tic_tac_toe.StartResponse}
 */
public  final class StartResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tic_tac_toe.StartResponse)
    StartResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StartResponse.newBuilder() to construct.
  private StartResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StartResponse() {
    num_ = "";
    a_ = "";
    aL_ = "";
    b_ = "";
    bL_ = "";
    c_ = "";
    result_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StartResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StartResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            java.lang.String s = input.readStringRequireUtf8();

            num_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            a_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            aL_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            b_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            bL_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            c_ = s;
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            result_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
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
    return com.frei.tic_tac_toe.Tictactoe.internal_static_tic_tac_toe_StartResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.frei.tic_tac_toe.Tictactoe.internal_static_tic_tac_toe_StartResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.frei.tic_tac_toe.StartResponse.class, com.frei.tic_tac_toe.StartResponse.Builder.class);
  }

  public static final int NUM_FIELD_NUMBER = 1;
  private volatile java.lang.Object num_;
  /**
   * <code>string num = 1;</code>
   * @return The num.
   */
  public java.lang.String getNum() {
    java.lang.Object ref = num_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      num_ = s;
      return s;
    }
  }
  /**
   * <code>string num = 1;</code>
   * @return The bytes for num.
   */
  public com.google.protobuf.ByteString
      getNumBytes() {
    java.lang.Object ref = num_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      num_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int A_FIELD_NUMBER = 2;
  private volatile java.lang.Object a_;
  /**
   * <code>string A = 2;</code>
   * @return The a.
   */
  public java.lang.String getA() {
    java.lang.Object ref = a_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      a_ = s;
      return s;
    }
  }
  /**
   * <code>string A = 2;</code>
   * @return The bytes for a.
   */
  public com.google.protobuf.ByteString
      getABytes() {
    java.lang.Object ref = a_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      a_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AL_FIELD_NUMBER = 3;
  private volatile java.lang.Object aL_;
  /**
   * <code>string AL = 3;</code>
   * @return The aL.
   */
  public java.lang.String getAL() {
    java.lang.Object ref = aL_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      aL_ = s;
      return s;
    }
  }
  /**
   * <code>string AL = 3;</code>
   * @return The bytes for aL.
   */
  public com.google.protobuf.ByteString
      getALBytes() {
    java.lang.Object ref = aL_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      aL_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int B_FIELD_NUMBER = 4;
  private volatile java.lang.Object b_;
  /**
   * <code>string B = 4;</code>
   * @return The b.
   */
  public java.lang.String getB() {
    java.lang.Object ref = b_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      b_ = s;
      return s;
    }
  }
  /**
   * <code>string B = 4;</code>
   * @return The bytes for b.
   */
  public com.google.protobuf.ByteString
      getBBytes() {
    java.lang.Object ref = b_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      b_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BL_FIELD_NUMBER = 5;
  private volatile java.lang.Object bL_;
  /**
   * <code>string BL = 5;</code>
   * @return The bL.
   */
  public java.lang.String getBL() {
    java.lang.Object ref = bL_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bL_ = s;
      return s;
    }
  }
  /**
   * <code>string BL = 5;</code>
   * @return The bytes for bL.
   */
  public com.google.protobuf.ByteString
      getBLBytes() {
    java.lang.Object ref = bL_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bL_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int C_FIELD_NUMBER = 6;
  private volatile java.lang.Object c_;
  /**
   * <code>string C = 6;</code>
   * @return The c.
   */
  public java.lang.String getC() {
    java.lang.Object ref = c_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      c_ = s;
      return s;
    }
  }
  /**
   * <code>string C = 6;</code>
   * @return The bytes for c.
   */
  public com.google.protobuf.ByteString
      getCBytes() {
    java.lang.Object ref = c_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      c_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESULT_FIELD_NUMBER = 7;
  private volatile java.lang.Object result_;
  /**
   * <code>string result = 7;</code>
   * @return The result.
   */
  public java.lang.String getResult() {
    java.lang.Object ref = result_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      result_ = s;
      return s;
    }
  }
  /**
   * <code>string result = 7;</code>
   * @return The bytes for result.
   */
  public com.google.protobuf.ByteString
      getResultBytes() {
    java.lang.Object ref = result_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      result_ = b;
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
    if (!getNumBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, num_);
    }
    if (!getABytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, a_);
    }
    if (!getALBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, aL_);
    }
    if (!getBBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, b_);
    }
    if (!getBLBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, bL_);
    }
    if (!getCBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, c_);
    }
    if (!getResultBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, result_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNumBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, num_);
    }
    if (!getABytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, a_);
    }
    if (!getALBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, aL_);
    }
    if (!getBBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, b_);
    }
    if (!getBLBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, bL_);
    }
    if (!getCBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, c_);
    }
    if (!getResultBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, result_);
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
    if (!(obj instanceof com.frei.tic_tac_toe.StartResponse)) {
      return super.equals(obj);
    }
    com.frei.tic_tac_toe.StartResponse other = (com.frei.tic_tac_toe.StartResponse) obj;

    if (!getNum()
        .equals(other.getNum())) return false;
    if (!getA()
        .equals(other.getA())) return false;
    if (!getAL()
        .equals(other.getAL())) return false;
    if (!getB()
        .equals(other.getB())) return false;
    if (!getBL()
        .equals(other.getBL())) return false;
    if (!getC()
        .equals(other.getC())) return false;
    if (!getResult()
        .equals(other.getResult())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NUM_FIELD_NUMBER;
    hash = (53 * hash) + getNum().hashCode();
    hash = (37 * hash) + A_FIELD_NUMBER;
    hash = (53 * hash) + getA().hashCode();
    hash = (37 * hash) + AL_FIELD_NUMBER;
    hash = (53 * hash) + getAL().hashCode();
    hash = (37 * hash) + B_FIELD_NUMBER;
    hash = (53 * hash) + getB().hashCode();
    hash = (37 * hash) + BL_FIELD_NUMBER;
    hash = (53 * hash) + getBL().hashCode();
    hash = (37 * hash) + C_FIELD_NUMBER;
    hash = (53 * hash) + getC().hashCode();
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + getResult().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.frei.tic_tac_toe.StartResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.frei.tic_tac_toe.StartResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.frei.tic_tac_toe.StartResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.frei.tic_tac_toe.StartResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.frei.tic_tac_toe.StartResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.frei.tic_tac_toe.StartResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.frei.tic_tac_toe.StartResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.frei.tic_tac_toe.StartResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.frei.tic_tac_toe.StartResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.frei.tic_tac_toe.StartResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.frei.tic_tac_toe.StartResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.frei.tic_tac_toe.StartResponse parseFrom(
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
  public static Builder newBuilder(com.frei.tic_tac_toe.StartResponse prototype) {
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
   * <pre>
   * The response message containing the greetings.
   * </pre>
   *
   * Protobuf type {@code tic_tac_toe.StartResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tic_tac_toe.StartResponse)
      com.frei.tic_tac_toe.StartResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.frei.tic_tac_toe.Tictactoe.internal_static_tic_tac_toe_StartResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.frei.tic_tac_toe.Tictactoe.internal_static_tic_tac_toe_StartResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.frei.tic_tac_toe.StartResponse.class, com.frei.tic_tac_toe.StartResponse.Builder.class);
    }

    // Construct using com.frei.tic_tac_toe.StartResponse.newBuilder()
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
      num_ = "";

      a_ = "";

      aL_ = "";

      b_ = "";

      bL_ = "";

      c_ = "";

      result_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.frei.tic_tac_toe.Tictactoe.internal_static_tic_tac_toe_StartResponse_descriptor;
    }

    @java.lang.Override
    public com.frei.tic_tac_toe.StartResponse getDefaultInstanceForType() {
      return com.frei.tic_tac_toe.StartResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.frei.tic_tac_toe.StartResponse build() {
      com.frei.tic_tac_toe.StartResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.frei.tic_tac_toe.StartResponse buildPartial() {
      com.frei.tic_tac_toe.StartResponse result = new com.frei.tic_tac_toe.StartResponse(this);
      result.num_ = num_;
      result.a_ = a_;
      result.aL_ = aL_;
      result.b_ = b_;
      result.bL_ = bL_;
      result.c_ = c_;
      result.result_ = result_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.frei.tic_tac_toe.StartResponse) {
        return mergeFrom((com.frei.tic_tac_toe.StartResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.frei.tic_tac_toe.StartResponse other) {
      if (other == com.frei.tic_tac_toe.StartResponse.getDefaultInstance()) return this;
      if (!other.getNum().isEmpty()) {
        num_ = other.num_;
        onChanged();
      }
      if (!other.getA().isEmpty()) {
        a_ = other.a_;
        onChanged();
      }
      if (!other.getAL().isEmpty()) {
        aL_ = other.aL_;
        onChanged();
      }
      if (!other.getB().isEmpty()) {
        b_ = other.b_;
        onChanged();
      }
      if (!other.getBL().isEmpty()) {
        bL_ = other.bL_;
        onChanged();
      }
      if (!other.getC().isEmpty()) {
        c_ = other.c_;
        onChanged();
      }
      if (!other.getResult().isEmpty()) {
        result_ = other.result_;
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
      com.frei.tic_tac_toe.StartResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.frei.tic_tac_toe.StartResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object num_ = "";
    /**
     * <code>string num = 1;</code>
     * @return The num.
     */
    public java.lang.String getNum() {
      java.lang.Object ref = num_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        num_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string num = 1;</code>
     * @return The bytes for num.
     */
    public com.google.protobuf.ByteString
        getNumBytes() {
      java.lang.Object ref = num_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        num_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string num = 1;</code>
     * @param value The num to set.
     * @return This builder for chaining.
     */
    public Builder setNum(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      num_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string num = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNum() {
      
      num_ = getDefaultInstance().getNum();
      onChanged();
      return this;
    }
    /**
     * <code>string num = 1;</code>
     * @param value The bytes for num to set.
     * @return This builder for chaining.
     */
    public Builder setNumBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      num_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object a_ = "";
    /**
     * <code>string A = 2;</code>
     * @return The a.
     */
    public java.lang.String getA() {
      java.lang.Object ref = a_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        a_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string A = 2;</code>
     * @return The bytes for a.
     */
    public com.google.protobuf.ByteString
        getABytes() {
      java.lang.Object ref = a_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        a_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string A = 2;</code>
     * @param value The a to set.
     * @return This builder for chaining.
     */
    public Builder setA(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      a_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string A = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearA() {
      
      a_ = getDefaultInstance().getA();
      onChanged();
      return this;
    }
    /**
     * <code>string A = 2;</code>
     * @param value The bytes for a to set.
     * @return This builder for chaining.
     */
    public Builder setABytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      a_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object aL_ = "";
    /**
     * <code>string AL = 3;</code>
     * @return The aL.
     */
    public java.lang.String getAL() {
      java.lang.Object ref = aL_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        aL_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string AL = 3;</code>
     * @return The bytes for aL.
     */
    public com.google.protobuf.ByteString
        getALBytes() {
      java.lang.Object ref = aL_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        aL_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string AL = 3;</code>
     * @param value The aL to set.
     * @return This builder for chaining.
     */
    public Builder setAL(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      aL_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string AL = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAL() {
      
      aL_ = getDefaultInstance().getAL();
      onChanged();
      return this;
    }
    /**
     * <code>string AL = 3;</code>
     * @param value The bytes for aL to set.
     * @return This builder for chaining.
     */
    public Builder setALBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      aL_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object b_ = "";
    /**
     * <code>string B = 4;</code>
     * @return The b.
     */
    public java.lang.String getB() {
      java.lang.Object ref = b_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        b_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string B = 4;</code>
     * @return The bytes for b.
     */
    public com.google.protobuf.ByteString
        getBBytes() {
      java.lang.Object ref = b_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        b_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string B = 4;</code>
     * @param value The b to set.
     * @return This builder for chaining.
     */
    public Builder setB(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      b_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string B = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearB() {
      
      b_ = getDefaultInstance().getB();
      onChanged();
      return this;
    }
    /**
     * <code>string B = 4;</code>
     * @param value The bytes for b to set.
     * @return This builder for chaining.
     */
    public Builder setBBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      b_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object bL_ = "";
    /**
     * <code>string BL = 5;</code>
     * @return The bL.
     */
    public java.lang.String getBL() {
      java.lang.Object ref = bL_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bL_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string BL = 5;</code>
     * @return The bytes for bL.
     */
    public com.google.protobuf.ByteString
        getBLBytes() {
      java.lang.Object ref = bL_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bL_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string BL = 5;</code>
     * @param value The bL to set.
     * @return This builder for chaining.
     */
    public Builder setBL(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bL_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string BL = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearBL() {
      
      bL_ = getDefaultInstance().getBL();
      onChanged();
      return this;
    }
    /**
     * <code>string BL = 5;</code>
     * @param value The bytes for bL to set.
     * @return This builder for chaining.
     */
    public Builder setBLBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bL_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object c_ = "";
    /**
     * <code>string C = 6;</code>
     * @return The c.
     */
    public java.lang.String getC() {
      java.lang.Object ref = c_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        c_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string C = 6;</code>
     * @return The bytes for c.
     */
    public com.google.protobuf.ByteString
        getCBytes() {
      java.lang.Object ref = c_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        c_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string C = 6;</code>
     * @param value The c to set.
     * @return This builder for chaining.
     */
    public Builder setC(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      c_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string C = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearC() {
      
      c_ = getDefaultInstance().getC();
      onChanged();
      return this;
    }
    /**
     * <code>string C = 6;</code>
     * @param value The bytes for c to set.
     * @return This builder for chaining.
     */
    public Builder setCBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      c_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object result_ = "";
    /**
     * <code>string result = 7;</code>
     * @return The result.
     */
    public java.lang.String getResult() {
      java.lang.Object ref = result_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        result_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string result = 7;</code>
     * @return The bytes for result.
     */
    public com.google.protobuf.ByteString
        getResultBytes() {
      java.lang.Object ref = result_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        result_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string result = 7;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string result = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = getDefaultInstance().getResult();
      onChanged();
      return this;
    }
    /**
     * <code>string result = 7;</code>
     * @param value The bytes for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      result_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tic_tac_toe.StartResponse)
  }

  // @@protoc_insertion_point(class_scope:tic_tac_toe.StartResponse)
  private static final com.frei.tic_tac_toe.StartResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.frei.tic_tac_toe.StartResponse();
  }

  public static com.frei.tic_tac_toe.StartResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StartResponse>
      PARSER = new com.google.protobuf.AbstractParser<StartResponse>() {
    @java.lang.Override
    public StartResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StartResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StartResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StartResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.frei.tic_tac_toe.StartResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

