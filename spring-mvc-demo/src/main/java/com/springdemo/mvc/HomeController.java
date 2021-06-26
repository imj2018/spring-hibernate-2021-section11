package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showPage() {
		
		// /WEB-INF/view/main-menu.jsp, spring does some magic
		return "main-menu";
	}
}
