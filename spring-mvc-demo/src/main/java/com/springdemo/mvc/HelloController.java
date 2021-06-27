package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// @Controller inherits from @Component
@Controller
public class HelloController {
	
	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		
		// /WEB-INF/view/hello-form.jsp, view name
		return "hello-form";
	}
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "hello";
	}
	
	// new controller method to read form data and
	// add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// read the request parameter from the HTML form
		String name = request.getParameter("studentName");
		
		// convert the data to all caps 
		name = name.toUpperCase();
		
		// create the message
		String result = "Yo!" + name;
		
		// add message to the model
		// name of attribute is message, value is result
		model.addAttribute("message", result);
		
		return "hello"; 
	}
	
}