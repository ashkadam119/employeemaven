package com.capstone.project.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capstone.project.entity.Employee;
import com.capstone.project.exception.EmployeeNotFound;
import com.capstone.project.service.IEmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {
	
	//private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	String baseUrl="https://localhost:8080/employee";
	
	@Autowired
	RestTemplate restTemplate;
	

	
	/*@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
		
		
	}*/
	
	/*@GetMapping("/getById/{employeeId}")
	public Employee getById(@PathVariable long employeeId) throws EmployeeNotFound {
		
		logger.info("Record of employeeId("+employeeId+")is called");
		
		return service.getEmployeeById(employeeId);
	}*/
	
	@GetMapping("/getById/{employeeId}")
	public ResponseEntity<Employee> getById(@PathVariable long employeeId){

		ResponseEntity<Employee> response = restTemplate.getForEntity(baseUrl+"/getById/"+employeeId, Employee.class);

		return response;
	}
	
	
	
	
	
	

}
