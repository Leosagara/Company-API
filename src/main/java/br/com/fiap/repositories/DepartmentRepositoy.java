package br.com.fiap.repositories;

import br.com.fiap.model.Department;
import br.com.fiap.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepositoy extends JpaRepository<Department,Long> {
    @Query(value = "select d from Department d where d.department_name =:name",nativeQuery = false)
    Department findByName(@Param("name") String name);
}
