package com.hospital.hospitaldao;

import com.hospital.bussinesslogic.Hospital;

public interface HospitalDAO 
{
	Hospital addPatient(Hospital h);
	Hospital searchPatientBasedDisease(String diseaseName);
	Hospital searchpatientBasedOnDoctor(String doctorName);
	int patientCount();
}
