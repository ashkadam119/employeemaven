package com.capstone.project.exception;

public class EmployeeNotFound extends Exception {
	public EmployeeNotFound(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		return "employee not Found ";
	}
}
