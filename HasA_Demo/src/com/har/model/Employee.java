package com.har.model;

public class Employee {
	int empId;
	String empName;
	double salary;
	Address address;
	public Employee(int empId, String empName, double salary, Address address) {
		
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}