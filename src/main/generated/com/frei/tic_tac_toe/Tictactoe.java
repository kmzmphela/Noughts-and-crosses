// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TicTacToe.proto

package com.frei.tic_tac_toe;

public final class Tictactoe {
  private Tictactoe() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tic_tac_toe_StartRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tic_tac_toe_StartRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tic_tac_toe_StartResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tic_tac_toe_StartResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tic_tac_toe_MoveRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tic_tac_toe_MoveRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017TicTacToe.proto\022\013tic_tac_toe\"\034\n\014StartR" +
      "equest\022\014\n\004side\030\001 \001(\t\"e\n\rStartResponse\022\013\n" +
      "\003num\030\001 \001(\t\022\t\n\001A\030\002 \001(\t\022\n\n\002AL\030\003 \001(\t\022\t\n\001B\030\004" +
      " \001(\t\022\n\n\002BL\030\005 \001(\t\022\t\n\001C\030\006 \001(\t\022\016\n\006result\030\007 " +
      "\001(\t\"\'\n\013MoveRequest\022\013\n\003row\030\001 \001(\t\022\013\n\003col\030\002" +
      " \001(\t2\230\001\n\020TictactoeService\022B\n\tStartGame\022\031" +
      ".tic_tac_toe.StartRequest\032\032.tic_tac_toe." +
      "StartResponse\022@\n\010MakeMove\022\030.tic_tac_toe." +
      "MoveRequest\032\032.tic_tac_toe.StartResponseB" +
      "#\n\024com.frei.tic_tac_toeB\tTictactoeP\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_tic_tac_toe_StartRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tic_tac_toe_StartRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tic_tac_toe_StartRequest_descriptor,
        new java.lang.String[] { "Side", });
    internal_static_tic_tac_toe_StartResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tic_tac_toe_StartResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tic_tac_toe_StartResponse_descriptor,
        new java.lang.String[] { "Num", "A", "AL", "B", "BL", "C", "Result", });
    internal_static_tic_tac_toe_MoveRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tic_tac_toe_MoveRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tic_tac_toe_MoveRequest_descriptor,
        new java.lang.String[] { "Row", "Col", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
