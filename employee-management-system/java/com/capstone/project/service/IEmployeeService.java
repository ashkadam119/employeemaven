package com.capstone.project.service;

import java.util.List;

import com.capstone.project.entity.Employee;
import com.capstone.project.exception.EmployeeNotFound;






public interface IEmployeeService {
	
	public Employee addEmployee(Employee employee);
	
	
	public Employee getEmployeeById(long employeeId) throws EmployeeNotFound;


	
	


}
