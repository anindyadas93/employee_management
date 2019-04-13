package workspace.springframework.employeemanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import workspace.springframework.employeemanagement.services.EmployeeService;

@Controller
public class IndexController {
	
	private final EmployeeService employeeService;
	
	public IndexController(EmployeeService employeeService) {
		//super();
		this.employeeService = employeeService;
	}

	@RequestMapping({"","/","/index"})
	public String getIndexPage(Model model) {
		model.addAttribute("employees", employeeService.getEmployees());
		return "Index";
	}

}
