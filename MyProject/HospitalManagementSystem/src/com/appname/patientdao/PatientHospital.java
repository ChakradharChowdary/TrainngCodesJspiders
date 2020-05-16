package com.appname.patientdao;

public class PatientHospital
{
 public static PatientDAO getPatientDAO()
 {
	PatientDAO dao=new PatientDAOImplementation();
	 return dao;
 }
}
