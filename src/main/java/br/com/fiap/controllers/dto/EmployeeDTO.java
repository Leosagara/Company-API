package br.com.fiap.controllers.dto;

import br.com.fiap.model.Employee;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
public class EmployeeDTO {

    private String employee_name;
    private String title;
    private Float salary;
    private String manager;
    private Long department_id;


}
