package com.capstone.project.entity;



import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Employee {
	
	 @Id
	 @Column(name = "employee_Id")
	private long employeeId;
	 @Column(name = "employee_Name")
	private String employeeName;
	 @Column(name = "date_Of_Birth")
	private LocalDate dateOfBirth;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(long employeeId, String employeeName, LocalDate dateOfBirth) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateOfBirth = dateOfBirth;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", dateOfBirth=" + dateOfBirth
				+ "]";
	}
	
	

}
