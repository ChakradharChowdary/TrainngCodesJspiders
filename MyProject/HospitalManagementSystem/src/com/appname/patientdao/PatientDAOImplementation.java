package com.appname.patientdao;
import com.appname.patientbusinesslogic.Patient;
import com.appname.patientexception.PatientNotFoundException;




public class PatientDAOImplementation implements PatientDAO
{
 public static final ArrayList<Patient>patientList=new ArrayList<Patient>();
 @Override
 public Patient addPatient(Patient patient)
 {
	 patientList.add(patient);
	 return patient;
 }
 @Override
 public Patient searchPatientBasedOnName(String patientName)
 {
	 Patient p=null;
	 String storedName=null;
	 boolean status=false;
	 for(int i=0;i<=patientList.size()-1;i++)
	 {
		 p=patientList.get(i);
		 storedName=p.getPatientName();
		 status=patientName.equals(storedName);
		 if(status)
		 {
			 break;
		 }
	 }
	 if(status)
	 {
		 return p;
	 }
	 else 
	 {
			 throw new PatientNotFoundException();
	}
	 }
 @Override
	 public int noOfPatients(int patientId)
	 {
		 Patient p=null;
		 int storedId=0;
		 return patientId;
 }
}

