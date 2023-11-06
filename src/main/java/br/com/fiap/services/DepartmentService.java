package br.com.fiap.services;

import br.com.fiap.model.Department;
import br.com.fiap.model.Employee;
import br.com.fiap.repositories.DepartmentRepositoy;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    DepartmentRepositoy departmentRepositoy;

    public List<Department> findAll(){
        return departmentRepositoy.findAll();
    }

    public Department finById(Long id){
        return departmentRepositoy.findById(id).get();
    }

    /*public Department findByName(String name){
        TypedQuery<Department> query=entityManager.createQuery(
                        "SELECT e FROM br.com.fiap.model.Department e WHERE e.department_name=:name", Department.class).

                setParameter("name", name);
        return query.getSingleResult();
    }*/

    public Department findByName(String name){
        return departmentRepositoy.findByName(name);
    }


    public Department create(Department department){
        return departmentRepositoy.save(department);
    }

    public void deleteById(Long id){
        departmentRepositoy.deleteById(id);
    }
}
