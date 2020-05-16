package org.jsp.app;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Student
 *
 */
@Entity

public class Student implements Serializable {

	   
	@Id
	private int regNum;
	private String studentName;
	private double marks;
	private static final long serialVersionUID = 1L;

	public Student() {
		super();
	}   
	public int getRegNum() {
		return this.regNum;
	}

	public void setRegNum(int regNum) {
		this.regNum = regNum;
	}   
	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}   
	public double getMarks() {
		return this.marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
   
}
