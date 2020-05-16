package org.jsp.app;

public class Hospital 
{
 private String hospName;
 private String hospLoc;
 private Doctor doctor;
public Hospital(String hospName, String hospLoc, Doctor doctor) {
	super();
	this.hospName = hospName;
	this.hospLoc = hospLoc;
	this.doctor = doctor;
}
@Override
public String toString() {
	return "Hospital [hospName=" + hospName + ", hospLoc=" + hospLoc + ", doctor=" + doctor + "]";
}
 
}
