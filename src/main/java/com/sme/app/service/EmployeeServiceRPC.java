package com.sme.app.service;

import com.sme.app.proto.Employee;

import java.util.List;

public interface EmployeeServiceRPC {

    Employee findById(Long id);

    List<Employee> findList();

    Employee findByEmail(String email);

    Employee createEmployee(String smeCode, Employee employee);

    boolean deleteEmployee(Long id);

    Employee updateEmployee(Employee employee);

}
