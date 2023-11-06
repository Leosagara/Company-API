package br.com.fiap.services.mapper;

import br.com.fiap.controllers.dto.DepartmentDTO;
import br.com.fiap.controllers.dto.EmployeeDTO;
import br.com.fiap.model.Department;
import br.com.fiap.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class DepartmentMapper {
    public Department toEntity(DepartmentDTO departmentDTO){
        Department department = new Department();
        department.setDepartment_name(departmentDTO.getDepartment_name());
        return department;
    }

    public DepartmentDTO toDTO(Department department){
        DepartmentDTO departmentDTO = new DepartmentDTO();
        departmentDTO.setDepartment_name(department.getDepartment_name());
        return departmentDTO;
    }
}
