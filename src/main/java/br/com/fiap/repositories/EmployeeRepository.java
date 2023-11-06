package br.com.fiap.repositories;

import br.com.fiap.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    @Query(value = "SELECT e FROM br.com.fiap.model.Employee e WHERE e.salary BETWEEN :minSalary AND :maxSalary",nativeQuery = false)
    List<Employee> findBySalary(@Param("minSalary") Float minSalary,@Param("maxSalary") Float maxSalary);

    @Query(value = "SELECT department_id, AVG(salary) as average_salary FROM employee GROUP BY department_id",nativeQuery = true)
    List<Object[]> findAverageSalary();
}
