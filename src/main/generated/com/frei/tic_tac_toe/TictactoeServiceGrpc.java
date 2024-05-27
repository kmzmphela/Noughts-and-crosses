package com.frei.tic_tac_toe;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: TicTacToe.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TictactoeServiceGrpc {

  private TictactoeServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "tic_tac_toe.TictactoeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.frei.tic_tac_toe.StartRequest,
      com.frei.tic_tac_toe.StartResponse> getStartGameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartGame",
      requestType = com.frei.tic_tac_toe.StartRequest.class,
      responseType = com.frei.tic_tac_toe.StartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.frei.tic_tac_toe.StartRequest,
      com.frei.tic_tac_toe.StartResponse> getStartGameMethod() {
    io.grpc.MethodDescriptor<com.frei.tic_tac_toe.StartRequest, com.frei.tic_tac_toe.StartResponse> getStartGameMethod;
    if ((getStartGameMethod = TictactoeServiceGrpc.getStartGameMethod) == null) {
      synchronized (TictactoeServiceGrpc.class) {
        if ((getStartGameMethod = TictactoeServiceGrpc.getStartGameMethod) == null) {
          TictactoeServiceGrpc.getStartGameMethod = getStartGameMethod =
              io.grpc.MethodDescriptor.<com.frei.tic_tac_toe.StartRequest, com.frei.tic_tac_toe.StartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartGame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.frei.tic_tac_toe.StartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.frei.tic_tac_toe.StartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TictactoeServiceMethodDescriptorSupplier("StartGame"))
              .build();
        }
      }
    }
    return getStartGameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.frei.tic_tac_toe.MoveRequest,
      com.frei.tic_tac_toe.StartResponse> getMakeMoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MakeMove",
      requestType = com.frei.tic_tac_toe.MoveRequest.class,
      responseType = com.frei.tic_tac_toe.StartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.frei.tic_tac_toe.MoveRequest,
      com.frei.tic_tac_toe.StartResponse> getMakeMoveMethod() {
    io.grpc.MethodDescriptor<com.frei.tic_tac_toe.MoveRequest, com.frei.tic_tac_toe.StartResponse> getMakeMoveMethod;
    if ((getMakeMoveMethod = TictactoeServiceGrpc.getMakeMoveMethod) == null) {
      synchronized (TictactoeServiceGrpc.class) {
        if ((getMakeMoveMethod = TictactoeServiceGrpc.getMakeMoveMethod) == null) {
          TictactoeServiceGrpc.getMakeMoveMethod = getMakeMoveMethod =
              io.grpc.MethodDescriptor.<com.frei.tic_tac_toe.MoveRequest, com.frei.tic_tac_toe.StartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MakeMove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.frei.tic_tac_toe.MoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.frei.tic_tac_toe.StartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TictactoeServiceMethodDescriptorSupplier("MakeMove"))
              .build();
        }
      }
    }
    return getMakeMoveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TictactoeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TictactoeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TictactoeServiceStub>() {
        @java.lang.Override
        public TictactoeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TictactoeServiceStub(channel, callOptions);
        }
      };
    return TictactoeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TictactoeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TictactoeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TictactoeServiceBlockingStub>() {
        @java.lang.Override
        public TictactoeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TictactoeServiceBlockingStub(channel, callOptions);
        }
      };
    return TictactoeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TictactoeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TictactoeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TictactoeServiceFutureStub>() {
        @java.lang.Override
        public TictactoeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TictactoeServiceFutureStub(channel, callOptions);
        }
      };
    return TictactoeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    default void startGame(com.frei.tic_tac_toe.StartRequest request,
        io.grpc.stub.StreamObserver<com.frei.tic_tac_toe.StartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartGameMethod(), responseObserver);
    }

    /**
     */
    default void makeMove(com.frei.tic_tac_toe.MoveRequest request,
        io.grpc.stub.StreamObserver<com.frei.tic_tac_toe.StartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMakeMoveMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TictactoeService.
   */
  public static abstract class TictactoeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TictactoeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TictactoeService.
   */
  public static final class TictactoeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TictactoeServiceStub> {
    private TictactoeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TictactoeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TictactoeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void startGame(com.frei.tic_tac_toe.StartRequest request,
        io.grpc.stub.StreamObserver<com.frei.tic_tac_toe.StartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void makeMove(com.frei.tic_tac_toe.MoveRequest request,
        io.grpc.stub.StreamObserver<com.frei.tic_tac_toe.StartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMakeMoveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TictactoeService.
   */
  public static final class TictactoeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TictactoeServiceBlockingStub> {
    private TictactoeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TictactoeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TictactoeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.frei.tic_tac_toe.StartResponse startGame(com.frei.tic_tac_toe.StartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartGameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.frei.tic_tac_toe.StartResponse makeMove(com.frei.tic_tac_toe.MoveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMakeMoveMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TictactoeService.
   */
  public static final class TictactoeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TictactoeServiceFutureStub> {
    private TictactoeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TictactoeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TictactoeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.frei.tic_tac_toe.StartResponse> startGame(
        com.frei.tic_tac_toe.StartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartGameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.frei.tic_tac_toe.StartResponse> makeMove(
        com.frei.tic_tac_toe.MoveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMakeMoveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START_GAME = 0;
  private static final int METHODID_MAKE_MOVE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_START_GAME:
          serviceImpl.startGame((com.frei.tic_tac_toe.StartRequest) request,
              (io.grpc.stub.StreamObserver<com.frei.tic_tac_toe.StartResponse>) responseObserver);
          break;
        case METHODID_MAKE_MOVE:
          serviceImpl.makeMove((com.frei.tic_tac_toe.MoveRequest) request,
              (io.grpc.stub.StreamObserver<com.frei.tic_tac_toe.StartResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getStartGameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.frei.tic_tac_toe.StartRequest,
              com.frei.tic_tac_toe.StartResponse>(
                service, METHODID_START_GAME)))
        .addMethod(
          getMakeMoveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.frei.tic_tac_toe.MoveRequest,
              com.frei.tic_tac_toe.StartResponse>(
                service, METHODID_MAKE_MOVE)))
        .build();
  }

  private static abstract class TictactoeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TictactoeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.frei.tic_tac_toe.Tictactoe.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TictactoeService");
    }
  }

  private static final class TictactoeServiceFileDescriptorSupplier
      extends TictactoeServiceBaseDescriptorSupplier {
    TictactoeServiceFileDescriptorSupplier() {}
  }

  private static final class TictactoeServiceMethodDescriptorSupplier
      extends TictactoeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TictactoeServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TictactoeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TictactoeServiceFileDescriptorSupplier())
              .addMethod(getStartGameMethod())
              .addMethod(getMakeMoveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
