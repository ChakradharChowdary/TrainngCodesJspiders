package com.hospital.validation;
import java.util.regex.Pattern;
public class HospitalValidation 
{

	public static boolean validatepatientName(String patientName)
	{
		boolean b=Pattern.compile("[A-Za-z]+").matcher(patientName).matches();
		return b;
	}
	public static boolean validateDoctorName(String doctorName)
	{
		boolean b=Pattern.compile("[A-Za-z]+").matcher(doctorName).matches();
		return b;
	}
	public static boolean validateDiseaseName(String diseaseName)
	{
		boolean b=Pattern.compile("[A-Za-z]+").matcher(diseaseName).matches();
		return b;
	}
}
