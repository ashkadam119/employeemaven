package com.capstone.project.exception;

public class InValidEmployeeID extends Exception {
	
	public InValidEmployeeID(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		return "invalid employee id ";
	}

}
