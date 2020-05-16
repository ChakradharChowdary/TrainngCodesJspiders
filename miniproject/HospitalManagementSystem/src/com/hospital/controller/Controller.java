package com.hospital.controller;
import java.util.Scanner;

import com.hospital.bussinesslogic.Hospital;
import com.hospital.exception.PatientNameNotFoundException;
import com.hospital.hospitaldao.HospitalDAO;
import com.hospital.hospitaldao.HospitalDetails;
import com.hospital.validation.HospitalValidation;

public class Controller extends Thread
{

	private static Scanner scanner=new Scanner(System.in);
	
	@Override
	public void run()
	{
		int choice=0;
		do
		{
		access();
		System.out.println("Press 1: to continue");
		System.out.println("Press 0: to stop");
		System.out.println("Enter your choice");
		 choice=scanner.nextInt();
		}while(choice==1);
		System.out.println("Thank you for visiting");
	}
	public void access()
	{
		HospitalDAO dao=HospitalDetails.getHospitalDAO();
		String patientName=null;
		Hospital h=null;
		String doctorName=null;
		String diseaseName=null;
		boolean status=false;
		System.out.println("Press 1:To Add a Patient");
		System.out.println("Press 2:To Search a Patient ");
		System.out.println("Press 3:To Search a Doctor");
		System.out.println("Press 4:To Display how many patients");
		int option=scanner.nextInt();
		switch(option)
		{
		case 1:
				System.out.println("Enter Patient Details");
				do
				{
					System.out.println("Enter Patient Name");
					patientName=scanner.next();
					status=HospitalValidation.validatepatientName(patientName);
				}while(!status);
				
				do
				{
					System.out.println("Enter Doctor Name");
					doctorName=scanner.next();
					status=HospitalValidation.validateDoctorName(doctorName);
				}while(!status);
				
				do
				{
					System.out.println("Enter Disease Name");
					diseaseName=scanner.next();
					status=HospitalValidation.validateDiseaseName(diseaseName);
				}while(!status);
				
				h=new Hospital(patientName, doctorName, diseaseName);
				Hospital returnHospital=dao.addPatient(h);
				System.out.println("Patient Added Successfully");
				System.out.println(returnHospital);
				break;
		case 2:
			do
			{
				System.out.println("Enter Disease to search patients");
				diseaseName=scanner.next();
				status=HospitalValidation.validateDiseaseName(diseaseName);
			}while(!status);
			try
			{
				Hospital searchedHospital=dao.searchPatientBasedDisease(diseaseName);
			}
			catch(PatientNameNotFoundException pnf)
			{
				System.out.println(pnf);
			}
			break;
		case 3:
			do
			{
				System.out.println("Enter Doctor Name to Search Patients");
				doctorName=scanner.next();
				status=HospitalValidation.validateDoctorName(doctorName);
			}while(!status);
			
			try
			{
				Hospital searchedDoctor=dao.searchpatientBasedOnDoctor(doctorName);
			}
			catch(PatientNameNotFoundException pnf)
			{
				System.out.println(pnf);
			}
				break;
		case 4:
				int e=dao.patientCount();
			System.out.println("The Number of patients are "+e);
			break;
		
				
		}
		
	}
}
