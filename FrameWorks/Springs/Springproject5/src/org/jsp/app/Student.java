package org.jsp.app;

public class Student 
{
	private int studentId;
	   private String studentName;
	   private Address address;
	
	public Student(int studentId, String studentName, Address address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address + "]";
	}
	
	
	   
}
