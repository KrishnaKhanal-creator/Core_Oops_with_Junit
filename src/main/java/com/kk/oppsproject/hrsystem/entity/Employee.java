package com.kk.oppsproject.hrsystem.entity;

import java.util.List;

public class Employee{
	
	private int id;
	private String firstName;
	private String lastName;
	private Phone phoneNumber;//can have a max of one phone
	private Address address; //can have a max of one address
	private Role[] employeeRoles; //can have many roles
	private Boolean isAContractor;//can be of two types Contractor and Full time
	private Boolean isAFullTime;
	
	public Employee() {
	}

	public Employee(int id, String firstName, String lastName, Phone phoneNumber, Address address, Role[] employeeRoles, Boolean isAContractor, Boolean isAFullTime) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.employeeRoles = employeeRoles;
		this.isAContractor = isAContractor;
		this.isAFullTime = isAFullTime;
	}

	public void setEmployeeRoles(Role[] employeeRoles) {
		this.employeeRoles = employeeRoles;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Phone getPhoneNumber() {
		return phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public Role[] getEmployeeRoles() {
		return employeeRoles;
	}

	public Boolean getAContractor() {
		return isAContractor;
	}

	public Boolean getAFullTime() {
		return isAFullTime;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				",\n phoneNumber=" + phoneNumber +
				",\n address=" + address +
				",\n employeeRoles=" + employeeRoles +
				",\n isAContractor=" + isAContractor +
				", isAFullTime=" + isAFullTime +
				'}';
	}
}
