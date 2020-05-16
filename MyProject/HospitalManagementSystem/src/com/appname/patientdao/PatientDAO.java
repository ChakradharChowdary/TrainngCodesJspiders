package com.appname.patientdao;

import com.appname.patientbusinesslogic.Patient;

public interface PatientDAO 
{
 Patient addPatient(Patient patient);
 Patient searchPatientBasedOnName(String  patientName);
 int noOfPatients(int patientId);
}
