package workspace.springframework.employeemanagement.services;

import java.util.HashSet;
import java.util.Set;

import workspace.springframework.employeemanagement.model.Employee;
import workspace.springframework.employeemanagement.repositories.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService{

	private final EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}



	@Override
	public Set<Employee> getEmployees() {
		Set<Employee> employeeSet = new HashSet<>();
		employeeRepository.findAll().iterator().forEachRemaining(employeeSet::add);
		return employeeSet;
	}
	
	

}
