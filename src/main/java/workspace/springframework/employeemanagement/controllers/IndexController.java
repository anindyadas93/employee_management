package workspace.springframework.employeemanagement.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import workspace.springframework.employeemanagement.model.Employee;
import workspace.springframework.employeemanagement.repositories.EmployeeRepository;

import java.util.Optional;

@Controller
public class IndexController {
	
	private EmployeeRepository employeeRepository;
	
	public IndexController(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	@RequestMapping({"","/","/index"})
	public String getIndex() {
		Optional<Employee> employeeOptional = employeeRepository.findByFirstname("Anindya");
		System.out.println(employeeOptional.get().getId());
		return "Index";
	}

}
