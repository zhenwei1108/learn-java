package com.github.zhenwei.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: grpc-random.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RandomGeneratorGrpc {

  private RandomGeneratorGrpc() {}

  public static final String SERVICE_NAME = "com.github.zhenwei.grpc.RandomGenerator";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.zhenwei.grpc.GrpcRandom.RpcDataRequest,
      com.github.zhenwei.grpc.GrpcRandom.RpcDataResponse> getGenRandomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenRandom",
      requestType = com.github.zhenwei.grpc.GrpcRandom.RpcDataRequest.class,
      responseType = com.github.zhenwei.grpc.GrpcRandom.RpcDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.zhenwei.grpc.GrpcRandom.RpcDataRequest,
      com.github.zhenwei.grpc.GrpcRandom.RpcDataResponse> getGenRandomMethod() {
    io.grpc.MethodDescriptor<com.github.zhenwei.grpc.GrpcRandom.RpcDataRequest, com.github.zhenwei.grpc.GrpcRandom.RpcDataResponse> getGenRandomMethod;
    if ((getGenRandomMethod = RandomGeneratorGrpc.getGenRandomMethod) == null) {
      synchronized (RandomGeneratorGrpc.class) {
        if ((getGenRandomMethod = RandomGeneratorGrpc.getGenRandomMethod) == null) {
          RandomGeneratorGrpc.getGenRandomMethod = getGenRandomMethod =
              io.grpc.MethodDescriptor.<com.github.zhenwei.grpc.GrpcRandom.RpcDataRequest, com.github.zhenwei.grpc.GrpcRandom.RpcDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenRandom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.zhenwei.grpc.GrpcRandom.RpcDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.zhenwei.grpc.GrpcRandom.RpcDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RandomGeneratorMethodDescriptorSupplier("GenRandom"))
              .build();
        }
      }
    }
    return getGenRandomMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RandomGeneratorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RandomGeneratorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RandomGeneratorStub>() {
        @Override
        public RandomGeneratorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RandomGeneratorStub(channel, callOptions);
        }
      };
    return RandomGeneratorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RandomGeneratorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RandomGeneratorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RandomGeneratorBlockingStub>() {
        @Override
        public RandomGeneratorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RandomGeneratorBlockingStub(channel, callOptions);
        }
      };
    return RandomGeneratorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RandomGeneratorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RandomGeneratorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RandomGeneratorFutureStub>() {
        @Override
        public RandomGeneratorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RandomGeneratorFutureStub(channel, callOptions);
        }
      };
    return RandomGeneratorFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void genRandom(com.github.zhenwei.grpc.GrpcRandom.RpcDataRequest request,
        io.grpc.stub.StreamObserver<com.github.zhenwei.grpc.GrpcRandom.RpcDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenRandomMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RandomGenerator.
   */
  public static abstract class RandomGeneratorImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return RandomGeneratorGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RandomGenerator.
   */
  public static final class RandomGeneratorStub
      extends io.grpc.stub.AbstractAsyncStub<RandomGeneratorStub> {
    private RandomGeneratorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected RandomGeneratorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RandomGeneratorStub(channel, callOptions);
    }

    /**
     */
    public void genRandom(com.github.zhenwei.grpc.GrpcRandom.RpcDataRequest request,
        io.grpc.stub.StreamObserver<com.github.zhenwei.grpc.GrpcRandom.RpcDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenRandomMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RandomGenerator.
   */
  public static final class RandomGeneratorBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RandomGeneratorBlockingStub> {
    private RandomGeneratorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected RandomGeneratorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RandomGeneratorBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.github.zhenwei.grpc.GrpcRandom.RpcDataResponse genRandom(com.github.zhenwei.grpc.GrpcRandom.RpcDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenRandomMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RandomGenerator.
   */
  public static final class RandomGeneratorFutureStub
      extends io.grpc.stub.AbstractFutureStub<RandomGeneratorFutureStub> {
    private RandomGeneratorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected RandomGeneratorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RandomGeneratorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.zhenwei.grpc.GrpcRandom.RpcDataResponse> genRandom(
        com.github.zhenwei.grpc.GrpcRandom.RpcDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenRandomMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GEN_RANDOM = 0;

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

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GEN_RANDOM:
          serviceImpl.genRandom((com.github.zhenwei.grpc.GrpcRandom.RpcDataRequest) request,
              (io.grpc.stub.StreamObserver<com.github.zhenwei.grpc.GrpcRandom.RpcDataResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
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
          getGenRandomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.zhenwei.grpc.GrpcRandom.RpcDataRequest,
              com.github.zhenwei.grpc.GrpcRandom.RpcDataResponse>(
                service, METHODID_GEN_RANDOM)))
        .build();
  }

  private static abstract class RandomGeneratorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RandomGeneratorBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.zhenwei.grpc.GrpcRandom.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RandomGenerator");
    }
  }

  private static final class RandomGeneratorFileDescriptorSupplier
      extends RandomGeneratorBaseDescriptorSupplier {
    RandomGeneratorFileDescriptorSupplier() {}
  }

  private static final class RandomGeneratorMethodDescriptorSupplier
      extends RandomGeneratorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RandomGeneratorMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RandomGeneratorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RandomGeneratorFileDescriptorSupplier())
              .addMethod(getGenRandomMethod())
              .build();
        }
      }
    }
    return result;
  }
}
