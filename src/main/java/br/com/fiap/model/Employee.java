package br.com.fiap.model;

import br.com.fiap.model.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@Setter
@ToString
@Entity
@Table(name="EMPLOYEE")
@AttributeOverride(name = "id", column = @Column(name = "employee_id"))
public class Employee extends BaseEntity {

    private String employee_name;
    private String title;
    private Float salary;
    private String manager;


    @ManyToOne
    @JoinColumn(name="department_id")
    @JsonBackReference
    private Department department;
}
