package com.seleniumexpress.mvcpractive.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

	// @ResponseBody
	@GetMapping("/home")
	public String showStudentHomePage() {
		// return "now you are seeing a student home page";
		return "home-page";
	}
}
