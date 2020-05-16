package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the employeemangementsystem database table.
 * 
 */
@Entity
@NamedQuery(name="Employeemangementsystem.findAll", query="SELECT e FROM Employeemangementsystem e")
public class Employeemangementsystem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String phoneNumber;

	private String address;

	private String bloodGroup;

	private String designation;

	private String emailId;

	private String hireDate;

	private String name;

	private String salary;

	public Employeemangementsystem() {
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBloodGroup() {
		return this.bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getHireDate() {
		return this.hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return this.salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

}