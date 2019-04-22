package com.mvcdemo.model.pojo;

public class Employee {
	private String fullName;
	//private int empID;
	private String email;
	private int workedHours;
	private float paybleSalary;
	private int saleAmount;
	private String employeeType;
	
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/*public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}*/
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getWorkedHours() {
		return workedHours;
	}
	public void setWorkedHours(int workedHours) {
		this.workedHours = workedHours;
	}
	public float getPaybleSalary() {
		return paybleSalary;
	}
	public void setPaybleSalary(float paybleSalary) {
		this.paybleSalary = paybleSalary;
	}
	public int getSaleAmount() {
		return saleAmount;
	}
	public void setSaleAmount(int saleAmount) {
		this.saleAmount = saleAmount;
	}
	
	
	
}
