package org.jsp.app;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: EmpDetails
 *
 */
@Entity

public class EmpDetails implements Serializable {

	
	private String empName;
	private String empId;
	private double empSal;
	private static final long serialVersionUID = 1L;

	public EmpDetails() {
		super();
	} 
	
	@Override
	public String toString() {
		return "EmpDetails [empName=" + empName + ", empId=" + empId + ", empSal=" + empSal + "]";
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}   
	public String getEmpId() {
		return this.empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}   
	public double getEmpSal() {
		return this.empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
   
}
