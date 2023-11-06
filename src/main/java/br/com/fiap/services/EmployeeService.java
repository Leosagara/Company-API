package br.com.fiap.services;

import br.com.fiap.model.Employee;
import br.com.fiap.repositories.EmployeeRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @PersistenceContext
    private EntityManager entityManager;

    @Getter
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    public Employee finById(Long id){
        return employeeRepository.findById(id).get();
    }

    public List<Employee> findBySalary(Float minSalary, Float maxSalary){
        return employeeRepository.findBySalary(minSalary,maxSalary);
    }

    public List<Object[]> findAverageSalary(){
        return employeeRepository.findAverageSalary();
    }

    public Employee create(Employee employee){
        return employeeRepository.save(employee);
    }

    public void deleteById(Long id){
        employeeRepository.deleteById(id);
    }
}
