package com.appname.patientexception;

public class PatientNotFoundException extends RuntimeException
{
@Override
public String toString()
{
	return "Patient Not Found In Hospital";
}
}
