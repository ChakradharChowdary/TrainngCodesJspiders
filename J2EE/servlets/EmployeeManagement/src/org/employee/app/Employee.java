package org.employee.app;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity(name = "employeesystem")
public class Employee implements Serializable{
    
	
	@Id
	private String phoneNumber;
	private String name;
	private String emailId;
	private String dateOfBirth;
	private String address;
	private String hireDate;
	private String designation;
	private String salary;
	private String bloodGroup;
	private static final long serialaVersionUID=1L;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	@Override
	public String toString() {
		return "EmployeeSystem [phoneNumber=" + phoneNumber + ", name=" + name + ", emailId=" + emailId
				+ ", dateOfBirth=" + dateOfBirth + ", address=" + address + ", hireDate=" + hireDate + ", designation="
				+ designation + ", salary=" + salary + ", bloodGroup=" + bloodGroup + "]";
	}
	
}
