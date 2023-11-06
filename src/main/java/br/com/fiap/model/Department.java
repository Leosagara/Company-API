package br.com.fiap.model;

import br.com.fiap.model.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name="DEPARTMENT")
@AttributeOverride(name = "id", column = @Column(name = "department_id"))
public class Department extends BaseEntity {
    private String department_name;

    @OneToMany(mappedBy = "department")
    @JsonManagedReference
    private List<Employee> employeeList;

}
