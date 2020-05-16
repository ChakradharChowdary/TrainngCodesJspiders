package com.hospital.exception;

public class PatientNameNotFoundException extends RuntimeException
{
	@Override
	public String toString()
	{
		return "Patient details not Found";
	}
}
