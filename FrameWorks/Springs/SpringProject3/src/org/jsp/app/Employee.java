package org.jsp.app;

public class Employee 
{
  private int empId;
  private double empSal;
  private Address address;
public Employee(int empId, double empSal, Address address) {
	super();
	this.empId = empId;
	this.empSal = empSal;
	this.address = address;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empSal=" + empSal + ", address=" + address + "]";
}
  
}
