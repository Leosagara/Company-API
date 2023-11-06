package br.com.fiap.services.mapper;

import br.com.fiap.controllers.dto.EmployeeDTO;
import br.com.fiap.model.Department;
import br.com.fiap.model.Employee;
import br.com.fiap.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    @Autowired
    DepartmentService departmentService;
    public Employee toEntity(EmployeeDTO employeeDTO){
        Employee employee = new Employee();
        employee.setEmployee_name(employeeDTO.getEmployee_name());
        employee.setTitle(employeeDTO.getTitle());
        employee.setSalary(employeeDTO.getSalary());
        employee.setManager(employeeDTO.getManager());
        Department department = departmentService.finById(employeeDTO.getDepartment_id());
        employee.setDepartment(department);
        return employee;
    }

    public EmployeeDTO toDTO(Employee employee){
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmployee_name(employee.getEmployee_name());
        employeeDTO.setTitle(employee.getTitle());
        employeeDTO.setSalary(employee.getSalary());
        employeeDTO.setManager(employee.getManager());
        employeeDTO.setDepartment_id(employee.getDepartment().getId());
        return employeeDTO;
    }


}
