package com.har.model;

public class Department {
	private int deptId;
	private String deptName;
	private String deptLocation;
	Employee[] employee;
	
	public Department() {}

	public Department(int deptId, String deptName, String deptLocation, Employee[] employee) {
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptLocation = deptLocation;
		this.employee = employee;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptLocation() {
		return deptLocation;
	}

	public void setDeptLocation(String deptLocation) {
		this.deptLocation = deptLocation;
	}

	public Employee[] getEmployee() {
		return employee;
	}

	public void setEmployee(Employee[] employee) {
		this.employee = employee;
	}
	
	
	
}
