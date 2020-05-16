package com.appname.patientvalidate;

import java.util.regex.Pattern;

public class PatientValidation 
{
 public static boolean validatePaitentId(int patientId)
 {
	 if(patientId>99 && patientId<=999)
	 {
		 return true;
	 }
	 else
	 {
		 return false;
	 }
 }
 public static boolean validatepatientName(String patientName)
 {
	 boolean status =Pattern.compile("[A-Za-z]+").matcher(patientName).matches();
	 return status;
 }
 public static boolean validatepatientDisease(String patientDisease)
 {
	 boolean status =Pattern.compile("[A-Za-z]+").matcher(patientDisease).matches();
	 return status;
 }
 public static boolean validatepatientGender(String patientGender)
 {
	 boolean status =Pattern.compile("[A-Za-z]+").matcher(patientGender).matches();
	 return status;
 }
 public static boolean validatePatientAge(int patientAge)
 {
	 if(patientAge>0 && patientAge<=100)
	 {
		 return true;
	 }
	 else
	 {
		 return false;
	 }
 }
}
