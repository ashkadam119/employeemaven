package com.capstone.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.project.entity.Employee;
import com.capstone.project.exception.EmployeeNotFound;
import com.capstone.project.repository.EmployeeRepo;


@Service
public class EmployeeServiceImp  implements IEmployeeService{
	
	@Autowired
	EmployeeRepo repo;

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return repo.save(employee);
	}

	@Override
	public Employee getEmployeeById(long employeeId) throws EmployeeNotFound{
		
		if(!repo.existsById(employeeId)) {
			
			throw new EmployeeNotFound("emp not found");
		}
		
		
			
			return repo.findById(employeeId).orElse(null);
		
	}
		
	
}
