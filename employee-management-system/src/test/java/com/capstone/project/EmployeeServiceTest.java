package com.capstone.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capstone.project.exception.InValidEmployeeID;
import com.capstone.project.service.IEmployeeService;
import com.capstone.project.vo.EmployeeVo;

@SpringBootTest
public class EmployeeServiceTest {


	@Autowired
	IEmployeeService service;


	@Test
	void testGetByEmployeeId() throws Exception {

		EmployeeVo employee = service.getByEmployeeId(1001);
		assertEquals("Ashwini kadam", employee.getEmployeeName());
		
	}
	
	@Test
	public void testGetInvalidEmployeeById() throws InValidEmployeeID {

		assertThrows(InValidEmployeeID.class, () -> service.getByEmployeeId(1007));
	}


	}


