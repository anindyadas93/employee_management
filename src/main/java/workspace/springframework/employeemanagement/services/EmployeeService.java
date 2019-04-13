package workspace.springframework.employeemanagement.services;

import java.util.Set;

import workspace.springframework.employeemanagement.model.Employee;

public interface EmployeeService {
	
	Set<Employee> getEmployees();

}
