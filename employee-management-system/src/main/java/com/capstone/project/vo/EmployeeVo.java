package com.capstone.project.vo;






public class EmployeeVo {
	
	private long employeeId;
	private String employeeName;
	private String dateOfBirth;
	public EmployeeVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeVo(long employeeId, String employeeName, String dateOfBirth) {
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
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "EmployeeVo [employeeId=" + employeeId + ", employeeName=" + employeeName + ", dateOfBirth="
				+ dateOfBirth + "]";
	}
	
	

}
