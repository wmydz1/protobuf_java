// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PersonMsg.proto

package com.logoocc.example;

public final class PersonMsg {
  private PersonMsg() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PersonOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Person)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 id = 1;</code>
     *
     * <pre>
     * ID（必需）
     * </pre>
     */
    boolean hasId();
    /**
     * <code>required int32 id = 1;</code>
     *
     * <pre>
     * ID（必需）
     * </pre>
     */
    int getId();

    /**
     * <code>required string name = 2;</code>
     *
     * <pre>
     * 姓名（必需）
     * </pre>
     */
    boolean hasName();
    /**
     * <code>required string name = 2;</code>
     *
     * <pre>
     * 姓名（必需）
     * </pre>
     */
    java.lang.String getName();
    /**
     * <code>required string name = 2;</code>
     *
     * <pre>
     * 姓名（必需）
     * </pre>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>optional string email = 3;</code>
     *
     * <pre>
     * email（可选）
     * </pre>
     */
    boolean hasEmail();
    /**
     * <code>optional string email = 3;</code>
     *
     * <pre>
     * email（可选）
     * </pre>
     */
    java.lang.String getEmail();
    /**
     * <code>optional string email = 3;</code>
     *
     * <pre>
     * email（可选）
     * </pre>
     */
    com.google.protobuf.ByteString
        getEmailBytes();

    /**
     * <code>repeated string friends = 4;</code>
     *
     * <pre>
     * 朋友（集合）
     * </pre>
     */
    com.google.protobuf.ProtocolStringList
        getFriendsList();
    /**
     * <code>repeated string friends = 4;</code>
     *
     * <pre>
     * 朋友（集合）
     * </pre>
     */
    int getFriendsCount();
    /**
     * <code>repeated string friends = 4;</code>
     *
     * <pre>
     * 朋友（集合）
     * </pre>
     */
    java.lang.String getFriends(int index);
    /**
     * <code>repeated string friends = 4;</code>
     *
     * <pre>
     * 朋友（集合）
     * </pre>
     */
    com.google.protobuf.ByteString
        getFriendsBytes(int index);
  }
  /**
   * Protobuf type {@code Person}
   */
  public static final class Person extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Person)
      PersonOrBuilder {
    // Use Person.newBuilder() to construct.
    private Person(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Person(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Person defaultInstance;
    public static Person getDefaultInstance() {
      return defaultInstance;
    }

    public Person getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Person(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              id_ = input.readInt32();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              name_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              email_ = bs;
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                friends_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000008;
              }
              friends_.add(bs);
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          friends_ = friends_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.logoocc.example.PersonMsg.internal_static_Person_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.logoocc.example.PersonMsg.internal_static_Person_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.logoocc.example.PersonMsg.Person.class, com.logoocc.example.PersonMsg.Person.Builder.class);
    }

    public static com.google.protobuf.Parser<Person> PARSER =
        new com.google.protobuf.AbstractParser<Person>() {
      public Person parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Person(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Person> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>required int32 id = 1;</code>
     *
     * <pre>
     * ID（必需）
     * </pre>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 id = 1;</code>
     *
     * <pre>
     * ID（必需）
     * </pre>
     */
    public int getId() {
      return id_;
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private java.lang.Object name_;
    /**
     * <code>required string name = 2;</code>
     *
     * <pre>
     * 姓名（必需）
     * </pre>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string name = 2;</code>
     *
     * <pre>
     * 姓名（必需）
     * </pre>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string name = 2;</code>
     *
     * <pre>
     * 姓名（必需）
     * </pre>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int EMAIL_FIELD_NUMBER = 3;
    private java.lang.Object email_;
    /**
     * <code>optional string email = 3;</code>
     *
     * <pre>
     * email（可选）
     * </pre>
     */
    public boolean hasEmail() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string email = 3;</code>
     *
     * <pre>
     * email（可选）
     * </pre>
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          email_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string email = 3;</code>
     *
     * <pre>
     * email（可选）
     * </pre>
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FRIENDS_FIELD_NUMBER = 4;
    private com.google.protobuf.LazyStringList friends_;
    /**
     * <code>repeated string friends = 4;</code>
     *
     * <pre>
     * 朋友（集合）
     * </pre>
     */
    public com.google.protobuf.ProtocolStringList
        getFriendsList() {
      return friends_;
    }
    /**
     * <code>repeated string friends = 4;</code>
     *
     * <pre>
     * 朋友（集合）
     * </pre>
     */
    public int getFriendsCount() {
      return friends_.size();
    }
    /**
     * <code>repeated string friends = 4;</code>
     *
     * <pre>
     * 朋友（集合）
     * </pre>
     */
    public java.lang.String getFriends(int index) {
      return friends_.get(index);
    }
    /**
     * <code>repeated string friends = 4;</code>
     *
     * <pre>
     * 朋友（集合）
     * </pre>
     */
    public com.google.protobuf.ByteString
        getFriendsBytes(int index) {
      return friends_.getByteString(index);
    }

    private void initFields() {
      id_ = 0;
      name_ = "";
      email_ = "";
      friends_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getEmailBytes());
      }
      for (int i = 0; i < friends_.size(); i++) {
        output.writeBytes(4, friends_.getByteString(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getEmailBytes());
      }
      {
        int dataSize = 0;
        for (int i = 0; i < friends_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(friends_.getByteString(i));
        }
        size += dataSize;
        size += 1 * getFriendsList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.logoocc.example.PersonMsg.Person parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.logoocc.example.PersonMsg.Person parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.logoocc.example.PersonMsg.Person parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.logoocc.example.PersonMsg.Person parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.logoocc.example.PersonMsg.Person parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.logoocc.example.PersonMsg.Person parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.logoocc.example.PersonMsg.Person parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.logoocc.example.PersonMsg.Person parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.logoocc.example.PersonMsg.Person parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.logoocc.example.PersonMsg.Person parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.logoocc.example.PersonMsg.Person prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Person}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Person)
        com.logoocc.example.PersonMsg.PersonOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.logoocc.example.PersonMsg.internal_static_Person_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.logoocc.example.PersonMsg.internal_static_Person_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.logoocc.example.PersonMsg.Person.class, com.logoocc.example.PersonMsg.Person.Builder.class);
      }

      // Construct using com.logoocc.example.PersonMsg.Person.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        email_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        friends_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.logoocc.example.PersonMsg.internal_static_Person_descriptor;
      }

      public com.logoocc.example.PersonMsg.Person getDefaultInstanceForType() {
        return com.logoocc.example.PersonMsg.Person.getDefaultInstance();
      }

      public com.logoocc.example.PersonMsg.Person build() {
        com.logoocc.example.PersonMsg.Person result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.logoocc.example.PersonMsg.Person buildPartial() {
        com.logoocc.example.PersonMsg.Person result = new com.logoocc.example.PersonMsg.Person(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.email_ = email_;
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          friends_ = friends_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.friends_ = friends_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.logoocc.example.PersonMsg.Person) {
          return mergeFrom((com.logoocc.example.PersonMsg.Person)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.logoocc.example.PersonMsg.Person other) {
        if (other == com.logoocc.example.PersonMsg.Person.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000002;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasEmail()) {
          bitField0_ |= 0x00000004;
          email_ = other.email_;
          onChanged();
        }
        if (!other.friends_.isEmpty()) {
          if (friends_.isEmpty()) {
            friends_ = other.friends_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureFriendsIsMutable();
            friends_.addAll(other.friends_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasId()) {
          
          return false;
        }
        if (!hasName()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.logoocc.example.PersonMsg.Person parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.logoocc.example.PersonMsg.Person) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int id_ ;
      /**
       * <code>required int32 id = 1;</code>
       *
       * <pre>
       * ID（必需）
       * </pre>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 id = 1;</code>
       *
       * <pre>
       * ID（必需）
       * </pre>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>required int32 id = 1;</code>
       *
       * <pre>
       * ID（必需）
       * </pre>
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 id = 1;</code>
       *
       * <pre>
       * ID（必需）
       * </pre>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>required string name = 2;</code>
       *
       * <pre>
       * 姓名（必需）
       * </pre>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string name = 2;</code>
       *
       * <pre>
       * 姓名（必需）
       * </pre>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string name = 2;</code>
       *
       * <pre>
       * 姓名（必需）
       * </pre>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string name = 2;</code>
       *
       * <pre>
       * 姓名（必需）
       * </pre>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 2;</code>
       *
       * <pre>
       * 姓名（必需）
       * </pre>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 2;</code>
       *
       * <pre>
       * 姓名（必需）
       * </pre>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object email_ = "";
      /**
       * <code>optional string email = 3;</code>
       *
       * <pre>
       * email（可选）
       * </pre>
       */
      public boolean hasEmail() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string email = 3;</code>
       *
       * <pre>
       * email（可选）
       * </pre>
       */
      public java.lang.String getEmail() {
        java.lang.Object ref = email_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            email_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string email = 3;</code>
       *
       * <pre>
       * email（可选）
       * </pre>
       */
      public com.google.protobuf.ByteString
          getEmailBytes() {
        java.lang.Object ref = email_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          email_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string email = 3;</code>
       *
       * <pre>
       * email（可选）
       * </pre>
       */
      public Builder setEmail(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        email_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string email = 3;</code>
       *
       * <pre>
       * email（可选）
       * </pre>
       */
      public Builder clearEmail() {
        bitField0_ = (bitField0_ & ~0x00000004);
        email_ = getDefaultInstance().getEmail();
        onChanged();
        return this;
      }
      /**
       * <code>optional string email = 3;</code>
       *
       * <pre>
       * email（可选）
       * </pre>
       */
      public Builder setEmailBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        email_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList friends_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureFriendsIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          friends_ = new com.google.protobuf.LazyStringArrayList(friends_);
          bitField0_ |= 0x00000008;
         }
      }
      /**
       * <code>repeated string friends = 4;</code>
       *
       * <pre>
       * 朋友（集合）
       * </pre>
       */
      public com.google.protobuf.ProtocolStringList
          getFriendsList() {
        return friends_.getUnmodifiableView();
      }
      /**
       * <code>repeated string friends = 4;</code>
       *
       * <pre>
       * 朋友（集合）
       * </pre>
       */
      public int getFriendsCount() {
        return friends_.size();
      }
      /**
       * <code>repeated string friends = 4;</code>
       *
       * <pre>
       * 朋友（集合）
       * </pre>
       */
      public java.lang.String getFriends(int index) {
        return friends_.get(index);
      }
      /**
       * <code>repeated string friends = 4;</code>
       *
       * <pre>
       * 朋友（集合）
       * </pre>
       */
      public com.google.protobuf.ByteString
          getFriendsBytes(int index) {
        return friends_.getByteString(index);
      }
      /**
       * <code>repeated string friends = 4;</code>
       *
       * <pre>
       * 朋友（集合）
       * </pre>
       */
      public Builder setFriends(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureFriendsIsMutable();
        friends_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string friends = 4;</code>
       *
       * <pre>
       * 朋友（集合）
       * </pre>
       */
      public Builder addFriends(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureFriendsIsMutable();
        friends_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string friends = 4;</code>
       *
       * <pre>
       * 朋友（集合）
       * </pre>
       */
      public Builder addAllFriends(
          java.lang.Iterable<java.lang.String> values) {
        ensureFriendsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, friends_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string friends = 4;</code>
       *
       * <pre>
       * 朋友（集合）
       * </pre>
       */
      public Builder clearFriends() {
        friends_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string friends = 4;</code>
       *
       * <pre>
       * 朋友（集合）
       * </pre>
       */
      public Builder addFriendsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureFriendsIsMutable();
        friends_.add(value);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Person)
    }

    static {
      defaultInstance = new Person(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Person)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Person_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Person_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017PersonMsg.proto\"B\n\006Person\022\n\n\002id\030\001 \002(\005\022" +
      "\014\n\004name\030\002 \002(\t\022\r\n\005email\030\003 \001(\t\022\017\n\007friends\030" +
      "\004 \003(\tB\025\n\023com.logoocc.example"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Person_descriptor,
        new java.lang.String[] { "Id", "Name", "Email", "Friends", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
