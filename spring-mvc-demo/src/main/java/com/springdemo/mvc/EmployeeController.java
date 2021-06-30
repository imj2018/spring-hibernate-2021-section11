package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class EmployeeController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		// create a student object
		Employee employee = new Employee();
		
		// add student object to the model 
		// name of the attribute is "employee", value of the attribute is employee created line 15
		model.addAttribute("employee", employee);
		
		return "employee-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(
			// bind to the model attribute passed in
			// the form data will populate the employee object to be accessible, spring handles
			// this instead of HttpServletRequest request/request.getParameter 
			@ModelAttribute("employee") Employee employee) {
		
		System.out.println("employee: " + employee.getFirstName() + " " + employee.getLastName());
		
		return "employee-confirmation";
	}
}
