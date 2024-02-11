package com.sme.app.service;

import com.sme.app.entity.EmployeeEntity;
import com.sme.app.mapper.EmployeeMapper;
import com.sme.app.proto.Employee;
import com.sme.app.proto.EmployeeServiceGrpc;
import com.sme.app.repo.EmployeeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceRPCImpl extends EmployeeServiceGrpc.EmployeeServiceImplBase implements EmployeeServiceRPC {


    private final EmployeeRepo employeeRepo;
    private final EmployeeMapper employeeMapper;

    @Override
    public Employee findById(Long id) {
        Optional<EmployeeEntity> employeeEntity = employeeRepo.findById(id);
        return employeeEntity.map(employeeMapper::employeeEntityToEmployee).orElse(null);
    }

    @Override
    public List<Employee> findList() {
        return null;
    }

    @Override
    public Employee findByEmail(String email) {
        return null;
    }

    @Override
    public Employee createEmployee(String smeCode, Employee Employee) {
        return null;
    }

    @Override
    public boolean deleteEmployee(Long id) {
        return false;
    }

    @Override
    public Employee updateEmployee(Employee Employee) {
        return null;
    }
}
