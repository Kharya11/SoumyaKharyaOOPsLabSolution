package com.supportAdmin.model;

public class Employee {
	// Getter and setter methods for private variable
	private String firstname;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private String lastName;

	// Parameterized Constructor
	public Employee(String firstName, String lastname) {
		this.firstname = firstName;
		this.lastName = lastname;

	}

}
