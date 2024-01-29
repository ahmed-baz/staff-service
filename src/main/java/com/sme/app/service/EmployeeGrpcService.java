package com.sme.app.service;


import com.sme.app.mapper.EmployeeMapper;
import com.sme.app.proto.Employee;
import com.sme.app.repo.EmployeeRepo;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;


@GrpcService
@RequiredArgsConstructor
public class EmployeeGrpcService {

    private final EmployeeRepo employeeRepo;
    private final EmployeeMapper employeeBeanMapper;

    public void getEmployeeById(Employee request, StreamObserver<Employee> responseObserver) {
        int id = request.getId();
        employeeRepo.findById((long) id)
                .map(employeeBeanMapper::entityToDto)
                .ifPresent(responseObserver::onNext);
        responseObserver.onCompleted();
    }
}
