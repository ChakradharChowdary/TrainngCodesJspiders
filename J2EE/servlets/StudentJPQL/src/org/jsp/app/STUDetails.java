package org.jsp.app;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: STUDetails
 *
 */
@Entity

public class STUDetails implements Serializable {

	   
	@Id
	private int regNum;

	private String name;

	private double marks;
	private static final long serialVersionUID = 1L;
	

	@Override
	public String toString() {
		return "STUDetails [regNum=" + regNum + ", name=" + name + ", marks=" + marks + "]";
	}
	public STUDetails() {
		super();
	}   
	public int getRegNum() {
		return this.regNum;
	}

	public void setRegNum(int regNum) {
		this.regNum = regNum;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public double getMarks() {
		return this.marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
   
}
