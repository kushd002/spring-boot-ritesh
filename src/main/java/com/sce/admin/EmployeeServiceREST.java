package com.sce.admin;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/employee")
public class EmployeeServiceREST {

	
	@GetMapping
	public String hello(HttpServletResponse response) {
		return "Hello Ritesh";
	}
}
