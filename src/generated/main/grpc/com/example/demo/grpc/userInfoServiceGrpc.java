package com.example.demo.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: UserInfo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class userInfoServiceGrpc {

  private userInfoServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "userInfo.userInfoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.demo.grpc.GetUserInfoRequest,
      com.example.demo.grpc.UserInfoRsponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = com.example.demo.grpc.GetUserInfoRequest.class,
      responseType = com.example.demo.grpc.UserInfoRsponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.grpc.GetUserInfoRequest,
      com.example.demo.grpc.UserInfoRsponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.example.demo.grpc.GetUserInfoRequest, com.example.demo.grpc.UserInfoRsponse> getGetMethod;
    if ((getGetMethod = userInfoServiceGrpc.getGetMethod) == null) {
      synchronized (userInfoServiceGrpc.class) {
        if ((getGetMethod = userInfoServiceGrpc.getGetMethod) == null) {
          userInfoServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.example.demo.grpc.GetUserInfoRequest, com.example.demo.grpc.UserInfoRsponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.GetUserInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.UserInfoRsponse.getDefaultInstance()))
              .setSchemaDescriptor(new userInfoServiceMethodDescriptorSupplier("get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static userInfoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<userInfoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<userInfoServiceStub>() {
        @java.lang.Override
        public userInfoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new userInfoServiceStub(channel, callOptions);
        }
      };
    return userInfoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userInfoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<userInfoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<userInfoServiceBlockingStub>() {
        @java.lang.Override
        public userInfoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new userInfoServiceBlockingStub(channel, callOptions);
        }
      };
    return userInfoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static userInfoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<userInfoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<userInfoServiceFutureStub>() {
        @java.lang.Override
        public userInfoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new userInfoServiceFutureStub(channel, callOptions);
        }
      };
    return userInfoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void get(com.example.demo.grpc.GetUserInfoRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.grpc.UserInfoRsponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service userInfoService.
   */
  public static abstract class userInfoServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return userInfoServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service userInfoService.
   */
  public static final class userInfoServiceStub
      extends io.grpc.stub.AbstractAsyncStub<userInfoServiceStub> {
    private userInfoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userInfoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new userInfoServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(com.example.demo.grpc.GetUserInfoRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.grpc.UserInfoRsponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service userInfoService.
   */
  public static final class userInfoServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<userInfoServiceBlockingStub> {
    private userInfoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userInfoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new userInfoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.demo.grpc.UserInfoRsponse get(com.example.demo.grpc.GetUserInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service userInfoService.
   */
  public static final class userInfoServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<userInfoServiceFutureStub> {
    private userInfoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userInfoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new userInfoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.grpc.UserInfoRsponse> get(
        com.example.demo.grpc.GetUserInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;

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
        case METHODID_GET:
          serviceImpl.get((com.example.demo.grpc.GetUserInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.grpc.UserInfoRsponse>) responseObserver);
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
          getGetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.demo.grpc.GetUserInfoRequest,
              com.example.demo.grpc.UserInfoRsponse>(
                service, METHODID_GET)))
        .build();
  }

  private static abstract class userInfoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    userInfoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.demo.grpc.UserInfo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("userInfoService");
    }
  }

  private static final class userInfoServiceFileDescriptorSupplier
      extends userInfoServiceBaseDescriptorSupplier {
    userInfoServiceFileDescriptorSupplier() {}
  }

  private static final class userInfoServiceMethodDescriptorSupplier
      extends userInfoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    userInfoServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (userInfoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userInfoServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
