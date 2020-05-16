package com.appname.patientbusinesslogic;

public class Patient 
{
 private int patientId;
 private String patientName;
 private String patientDisease;
 private String patientGender;
 private int patientAge;
public Patient(int patientId, String patientName, String patientDisease, String patientGender, int patientAge) {
	super();
	this.patientId = patientId;
	this.patientName = patientName;
	this.patientDisease = patientDisease;
	this.patientGender = patientGender;
	this.patientAge = patientAge;
}

public int getPatientId() {
	return this.patientId;
}

public void setPatientId(int patientId) {
	this.patientId = patientId;
}

public String getPatientName() {
	return this.patientName;
}

public void setPatientName(String patientName) {
	this.patientName = patientName;
}

public String getPatientDisease() {
	return this.patientDisease;
}

public void setPatientDisease(String patientDisease) {
	this.patientDisease = patientDisease;
}

public String getPatientGender() {
	return this.patientGender;
}

public void setPatientGender(String patientGender) {
	this.patientGender = patientGender;
}

public int getPatientAge() {
	return this.patientAge;
}

public void setPatientAge(int patientAge) {
	this.patientAge = patientAge;
}

  @Override
public String toString() {
	return "Patient [patientId=" + this.patientId + ", patientName=" + this.patientName + ", patientDisease=" + this.patientDisease
			+ ", patientGender=" + this.patientGender + ", patientAge=" + this.patientAge + "]";
}

@Override
  public boolean equals (Object o1)
  {
	  Patient patient=(Patient)o1;
	  return this.patientAge==patient.patientAge;
  }
}




































