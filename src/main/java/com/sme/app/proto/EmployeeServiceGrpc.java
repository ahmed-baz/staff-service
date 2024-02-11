package com.sme.app.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;


@io.grpc.stub.annotations.GrpcGenerated
public final class EmployeeServiceGrpc {

    private EmployeeServiceGrpc() {
    }

    public static final String SERVICE_NAME = "com.sme.app.proto.EmployeeService";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<Employee,
            Employee> getGetEmployeeByIdMethod;

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "getEmployeeById",
            requestType = Employee.class,
            responseType = Employee.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<Employee,
            Employee> getGetEmployeeByIdMethod() {
        io.grpc.MethodDescriptor<Employee, Employee> getGetEmployeeByIdMethod;
        if ((getGetEmployeeByIdMethod = EmployeeServiceGrpc.getGetEmployeeByIdMethod) == null) {
            synchronized (EmployeeServiceGrpc.class) {
                if ((getGetEmployeeByIdMethod = EmployeeServiceGrpc.getGetEmployeeByIdMethod) == null) {
                    EmployeeServiceGrpc.getGetEmployeeByIdMethod = getGetEmployeeByIdMethod =
                            io.grpc.MethodDescriptor.<Employee, Employee>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getEmployeeById"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            Employee.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            Employee.getDefaultInstance()))
                                    .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("getEmployeeById"))
                                    .build();
                }
            }
        }
        return getGetEmployeeByIdMethod;
    }

    private static volatile io.grpc.MethodDescriptor<Employee,
            Employee> getGetEmployeeByEmailMethod;

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "getEmployeeByEmail",
            requestType = Employee.class,
            responseType = Employee.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<Employee,
            Employee> getGetEmployeeByEmailMethod() {
        io.grpc.MethodDescriptor<Employee, Employee> getGetEmployeeByEmailMethod;
        if ((getGetEmployeeByEmailMethod = EmployeeServiceGrpc.getGetEmployeeByEmailMethod) == null) {
            synchronized (EmployeeServiceGrpc.class) {
                if ((getGetEmployeeByEmailMethod = EmployeeServiceGrpc.getGetEmployeeByEmailMethod) == null) {
                    EmployeeServiceGrpc.getGetEmployeeByEmailMethod = getGetEmployeeByEmailMethod =
                            io.grpc.MethodDescriptor.<Employee, Employee>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getEmployeeByEmail"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            Employee.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            Employee.getDefaultInstance()))
                                    .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("getEmployeeByEmail"))
                                    .build();
                }
            }
        }
        return getGetEmployeeByEmailMethod;
    }

    private static volatile io.grpc.MethodDescriptor<Department,
            EmployeeList> getGetEmployeesByDepartmentIdMethod;

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "getEmployeesByDepartmentId",
            requestType = Department.class,
            responseType = EmployeeList.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<Department,
            EmployeeList> getGetEmployeesByDepartmentIdMethod() {
        io.grpc.MethodDescriptor<Department, EmployeeList> getGetEmployeesByDepartmentIdMethod;
        if ((getGetEmployeesByDepartmentIdMethod = EmployeeServiceGrpc.getGetEmployeesByDepartmentIdMethod) == null) {
            synchronized (EmployeeServiceGrpc.class) {
                if ((getGetEmployeesByDepartmentIdMethod = EmployeeServiceGrpc.getGetEmployeesByDepartmentIdMethod) == null) {
                    EmployeeServiceGrpc.getGetEmployeesByDepartmentIdMethod = getGetEmployeesByDepartmentIdMethod =
                            io.grpc.MethodDescriptor.<Department, EmployeeList>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getEmployeesByDepartmentId"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            Department.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            EmployeeList.getDefaultInstance()))
                                    .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("getEmployeesByDepartmentId"))
                                    .build();
                }
            }
        }
        return getGetEmployeesByDepartmentIdMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static EmployeeServiceStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceStub>() {
                    @Override
                    public EmployeeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                        return new EmployeeServiceStub(channel, callOptions);
                    }
                };
        return EmployeeServiceStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static EmployeeServiceBlockingStub newBlockingStub(
            io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceBlockingStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceBlockingStub>() {
                    @Override
                    public EmployeeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                        return new EmployeeServiceBlockingStub(channel, callOptions);
                    }
                };
        return EmployeeServiceBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static EmployeeServiceFutureStub newFutureStub(
            io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceFutureStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceFutureStub>() {
                    @Override
                    public EmployeeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                        return new EmployeeServiceFutureStub(channel, callOptions);
                    }
                };
        return EmployeeServiceFutureStub.newStub(factory, channel);
    }

    /**
     *
     */
    public interface AsyncService {

        /**
         * <pre>
         * unary - synchronous
         * </pre>
         */
        default void getEmployeeById(Employee request,
                                     io.grpc.stub.StreamObserver<Employee> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmployeeByIdMethod(), responseObserver);
        }

        /**
         *
         */
        default void getEmployeeByEmail(Employee request,
                                        io.grpc.stub.StreamObserver<Employee> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmployeeByEmailMethod(), responseObserver);
        }

        /**
         *
         */
        default void getEmployeesByDepartmentId(Department request,
                                                io.grpc.stub.StreamObserver<EmployeeList> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmployeesByDepartmentIdMethod(), responseObserver);
        }
    }

    /**
     * Base class for the server implementation of the service EmployeeService.
     */
    public static abstract class EmployeeServiceImplBase
            implements io.grpc.BindableService, AsyncService {

        @Override
        public final io.grpc.ServerServiceDefinition bindService() {
            return EmployeeServiceGrpc.bindService(this);
        }
    }

    /**
     * A stub to allow clients to do asynchronous rpc calls to service EmployeeService.
     */
    public static final class EmployeeServiceStub
            extends io.grpc.stub.AbstractAsyncStub<EmployeeServiceStub> {
        private EmployeeServiceStub(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @Override
        protected EmployeeServiceStub build(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new EmployeeServiceStub(channel, callOptions);
        }

        /**
         * <pre>
         * unary - synchronous
         * </pre>
         */
        public void getEmployeeById(Employee request,
                                    io.grpc.stub.StreamObserver<Employee> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(
                    getChannel().newCall(getGetEmployeeByIdMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         *
         */
        public void getEmployeeByEmail(Employee request,
                                       io.grpc.stub.StreamObserver<Employee> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(
                    getChannel().newCall(getGetEmployeeByEmailMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         *
         */
        public void getEmployeesByDepartmentId(Department request,
                                               io.grpc.stub.StreamObserver<EmployeeList> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(
                    getChannel().newCall(getGetEmployeesByDepartmentIdMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * A stub to allow clients to do synchronous rpc calls to service EmployeeService.
     */
    public static final class EmployeeServiceBlockingStub
            extends io.grpc.stub.AbstractBlockingStub<EmployeeServiceBlockingStub> {
        private EmployeeServiceBlockingStub(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @Override
        protected EmployeeServiceBlockingStub build(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new EmployeeServiceBlockingStub(channel, callOptions);
        }

        /**
         * <pre>
         * unary - synchronous
         * </pre>
         */
        public Employee getEmployeeById(Employee request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(
                    getChannel(), getGetEmployeeByIdMethod(), getCallOptions(), request);
        }

        /**
         *
         */
        public Employee getEmployeeByEmail(Employee request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(
                    getChannel(), getGetEmployeeByEmailMethod(), getCallOptions(), request);
        }

        /**
         *
         */
        public EmployeeList getEmployeesByDepartmentId(Department request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(
                    getChannel(), getGetEmployeesByDepartmentIdMethod(), getCallOptions(), request);
        }
    }

    /**
     * A stub to allow clients to do ListenableFuture-style rpc calls to service EmployeeService.
     */
    public static final class EmployeeServiceFutureStub
            extends io.grpc.stub.AbstractFutureStub<EmployeeServiceFutureStub> {
        private EmployeeServiceFutureStub(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @Override
        protected EmployeeServiceFutureStub build(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new EmployeeServiceFutureStub(channel, callOptions);
        }

        /**
         * <pre>
         * unary - synchronous
         * </pre>
         */
        public com.google.common.util.concurrent.ListenableFuture<Employee> getEmployeeById(
                Employee request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(
                    getChannel().newCall(getGetEmployeeByIdMethod(), getCallOptions()), request);
        }

        /**
         *
         */
        public com.google.common.util.concurrent.ListenableFuture<Employee> getEmployeeByEmail(
                Employee request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(
                    getChannel().newCall(getGetEmployeeByEmailMethod(), getCallOptions()), request);
        }

        /**
         *
         */
        public com.google.common.util.concurrent.ListenableFuture<EmployeeList> getEmployeesByDepartmentId(
                Department request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(
                    getChannel().newCall(getGetEmployeesByDepartmentIdMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_GET_EMPLOYEE_BY_ID = 0;
    private static final int METHODID_GET_EMPLOYEE_BY_EMAIL = 1;
    private static final int METHODID_GET_EMPLOYEES_BY_DEPARTMENT_ID = 2;

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
                case METHODID_GET_EMPLOYEE_BY_ID:
                    serviceImpl.getEmployeeById((Employee) request,
                            (io.grpc.stub.StreamObserver<Employee>) responseObserver);
                    break;
                case METHODID_GET_EMPLOYEE_BY_EMAIL:
                    serviceImpl.getEmployeeByEmail((Employee) request,
                            (io.grpc.stub.StreamObserver<Employee>) responseObserver);
                    break;
                case METHODID_GET_EMPLOYEES_BY_DEPARTMENT_ID:
                    serviceImpl.getEmployeesByDepartmentId((Department) request,
                            (io.grpc.stub.StreamObserver<EmployeeList>) responseObserver);
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
                        getGetEmployeeByIdMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<
                                        Employee,
                                        Employee>(
                                        service, METHODID_GET_EMPLOYEE_BY_ID)))
                .addMethod(
                        getGetEmployeeByEmailMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<
                                        Employee,
                                        Employee>(
                                        service, METHODID_GET_EMPLOYEE_BY_EMAIL)))
                .addMethod(
                        getGetEmployeesByDepartmentIdMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<
                                        Department,
                                        EmployeeList>(
                                        service, METHODID_GET_EMPLOYEES_BY_DEPARTMENT_ID)))
                .build();
    }

    private static abstract class EmployeeServiceBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
        EmployeeServiceBaseDescriptorSupplier() {
        }

        @Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return Sme.getDescriptor();
        }

        @Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("EmployeeService");
        }
    }

    private static final class EmployeeServiceFileDescriptorSupplier
            extends EmployeeServiceBaseDescriptorSupplier {
        EmployeeServiceFileDescriptorSupplier() {
        }
    }

    private static final class EmployeeServiceMethodDescriptorSupplier
            extends EmployeeServiceBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
        private final String methodName;

        EmployeeServiceMethodDescriptorSupplier(String methodName) {
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
            synchronized (EmployeeServiceGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                            .setSchemaDescriptor(new EmployeeServiceFileDescriptorSupplier())
                            .addMethod(getGetEmployeeByIdMethod())
                            .addMethod(getGetEmployeeByEmailMethod())
                            .addMethod(getGetEmployeesByDepartmentIdMethod())
                            .build();
                }
            }
        }
        return result;
    }
}
