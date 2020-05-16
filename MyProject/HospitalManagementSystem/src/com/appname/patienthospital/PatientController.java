package com.appname.patienthospital;
import java.util.Scanner;
import com.appname.patientbusinesslogic.Patient;
import com.appname.patientdao.PatientDAO;
import com.appname.patientdao.PatientHospital;
import com.appname.patientexception.PatientNotFoundException;
import com.appname.patientvalidate.PatientValidation;

public class PatientController extends Thread
{
private Scanner scan=new Scanner(System.in);
@Override
public void run()
{
	System.out.println("Welcome To Hospital......");
	int choice=0;
	do
	{
		access();
		System.out.println("Press 0 To Stop");
		System.out.println("Press 1 To Continue");
		System.out.println("Enter Your Choice");
		choice=scan.nextInt();
	}
	while(choice==1);
		System.out.println("Thank You......");
}
public void access()
{
	PatientDAO patientaccess=PatientHospital.getPatientDAO();
	Patient patientObj=null;
	int patientId=0;
	String patientName=null;
	String patientDisease=null;
	String patientGender=null;
	int patientAge=0;
	boolean status=false;
	System.out.println("Press 1: To add a patient");
	System.out.println("Press 2: To search a patient");
	System.out.println("Press 3: Number of patient");
	System.out.println("Enter Your option");
	int option=scan.nextInt();
	switch(option)
	{
	case 1:
		System.out.println("Enter Patient Info");
		do
		{
			System.out.println("Enter the patientId");
			patientId=scan.nextInt();
			status=PatientValidation.validatePaitentId(patientId);
		}while(!status);
		do
		{
			System.out.println("Enter the patientName");
			patientName=scan.next();
			status=PatientValidation.validatepatientName(patientName);
		}while(!status);
		do
		{
			System.out.println("Enter the patientDisease");
			patientDisease=scan.next();
			status=PatientValidation.validatepatientDisease(patientDisease);
		}while(!status);
		do
		{
			System.out.println("Enter the patientGender");
			patientGender=scan.next();
			status=PatientValidation.validatepatientGender(patientGender);
		}while(!status);
		do
		{
			System.out.println("Enter the patient age");
			patientAge=scan.nextInt();
			status=PatientValidation.validatePatientAge(patientAge);
		}while(!status);
		patientObj=new Patient(patientId,patientName,patientDisease,patientGender,patientAge);
		Patient returnedPatient=patientaccess.addPatient(patientObj);
		System.out.println("Patient added Successfully");
		System.out.println(returnedPatient);
		break;
	case 2:
		do
		{
			System.out.println("Enter PatientName to search.....");
			patientName=scan.next();
			status=PatientValidation.validatepatientName(patientName);
		}
		while(!status);
		try
		{
			Patient serachedPatient= patientaccess.searchPatientBasedOnName( patientName);
			System.out.println("Patient Found");
			System.out.println("searchedPatient");
		}
	
	catch(PatientNotFoundException patient)
	{
		System.out.println(patient);
	}
	break;
	case 3:
		do
		{
			System.out.println("Enter Number Of Patients in Hospital.....");
			patientDisease=scan.next();
			status=PatientValidation.validatePaitentId(patientId);
		}
		while(!status);
		try
		{
		     int searchedPatient= patientaccess.noOfPatients( patientId);
			System.out.println("Patients Found");
			System.out.println("searchedPatients");
		}
	
	catch(PatientNotFoundException patient)
	{
		System.out.println(patient);
	}
	break;
	default:System.out.println("Invalid Option");
}
}
}
