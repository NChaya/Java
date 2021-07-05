package com.phani.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.phani.model.RequestObject;
import com.phani.model.ResponseObject;
import com.phani.services.MyService;


//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HomeController {
	
	@Autowired 
	RequestObject requestObject;
	@Autowired ResponseObject responseObject;
	@Autowired MyService myService;
	// home - // http://localhost:8080/
	@GetMapping
	public String home() {
		return "Welcome Home";
	}
	
	// http://localhost:8080/test?name=Satya - query parameters
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String requestParam(@RequestParam(value="name")String name) {
		return "Welcome "+ name;
	}
	
	// http://localhost:8080/test/name  - path parameters
	@RequestMapping(value="/test/{name}", method=RequestMethod.GET)
	public String pathParam(@PathVariable String name) {
		return "Welcome "+ name;
	}
	
	// http://localhost:8080/test/name/city  - two parameters
	@RequestMapping(value="/test/{name}/{city}", method=RequestMethod.GET)
	public String pathParams(@PathVariable String name, @PathVariable String city) {
		return "Welcome "+ name + " from " + city ;
	}
	
	// http://localhost:8080/test with request object and POST method

	@RequestMapping(value="/test-post", method= RequestMethod.POST, produces = { "application/json" })
	public Object requestObject(@RequestBody RequestObject requestObject) {
		responseObject.setResponseList(requestObject);
		System.out.println("Post Method");
		return responseObject.getResponseList();
	}
	
	// http://localhost:8080/fullName/{firstName}/{lastName} with path parameters
	// calling a service that calls another service file
	@RequestMapping(value="/fullName/{firstName}/{lastName}")
	public String getFullName(@PathVariable String firstName, @PathVariable String lastName) throws SQLException {
		System.out.println("Hi Narayana");
		return myService.getFullName(firstName, lastName);
	}
}
