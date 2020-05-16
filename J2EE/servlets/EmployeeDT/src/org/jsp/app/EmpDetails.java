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

	
	private String empId;
	private String empName;
	private double empsal;
	private static final long serialVersionUID = 1L;

	public EmpDetails() {
		super();
	}   
	public String getEmpId() {
		return this.empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}   
	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}   
	public double getEmpsal() {
		return this.empsal;
	}

	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}
   
}
