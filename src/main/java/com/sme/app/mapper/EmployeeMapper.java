package com.sme.app.mapper;

import com.sme.app.entity.EmployeeEntity;
import com.sme.app.proto.Employee;
import org.mapstruct.Mapper;

@Mapper
public interface EmployeeMapper {

    Employee employeeEntityToEmployee(EmployeeEntity e);

}
