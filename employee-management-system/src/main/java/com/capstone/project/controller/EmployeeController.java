package com.capstone.project.controller;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capstone.project.exception.EmployeeNotFound;
import com.capstone.project.exception.InValidEmployeeID;
import com.capstone.project.service.EmployeeServiceImp;
import com.capstone.project.service.IEmployeeService;
import com.capstone.project.vo.EmployeeVo;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	
	@Autowired
	IEmployeeService employeeService;
	
	@GetMapping("/get/byempId/{employeeID}")
	public EmployeeVo getByEmployeeId(@PathVariable int employeeID)throws Exception{
		logger.info("Record of EmployeeID("+employeeID+")is called");
		return employeeService.getByEmployeeId(employeeID);
	}
	

	
	
	
	

}
