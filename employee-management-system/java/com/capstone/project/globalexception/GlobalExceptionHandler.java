package com.capstone.project.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capstone.project.exception.EmployeeNotFound;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(EmployeeNotFound.class)
	public ResponseEntity<String> handleE(EmployeeNotFound exception){
		return new ResponseEntity<String>("employee not found",HttpStatus.BAD_REQUEST);

}
}
