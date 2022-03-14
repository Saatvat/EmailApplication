package com.greatlearning.model;

import java.util.Scanner;

public class Employee {
	
	private String firstName;
	private String lastName;
	private int department;
	
	Scanner sc = new Scanner(System.in);

	public Employee(String firstName, String lastName) {
		this.setfirstName(firstName);
		this.setlastName(lastName);
	}
	
	void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public String getlastName() {
		return lastName;
	}

	public void employee(int department) {
		this.setDepartment(department);
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public int getDepartment() {
		return department;
	}
}
