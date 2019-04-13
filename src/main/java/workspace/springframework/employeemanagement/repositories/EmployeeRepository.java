package workspace.springframework.employeemanagement.repositories;

import org.springframework.data.repository.CrudRepository;

import workspace.springframework.employeemanagement.model.Employee;
import java.util.*;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	
	Optional<Employee> findByFirstname(String firstname);

}
