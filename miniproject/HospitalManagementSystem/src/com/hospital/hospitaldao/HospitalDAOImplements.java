package com.hospital.hospitaldao;
import java.util.ArrayList;

import com.hospital.bussinesslogic.Hospital;
import com.hospital.exception.PatientNameNotFoundException;
public class HospitalDAOImplements implements HospitalDAO
{
	public static final ArrayList<Hospital> hospitalList=new ArrayList<Hospital>();
	@Override
	public Hospital addPatient(Hospital h)
	{
		hospitalList.add(h);
		return h;
	}
	public 	Hospital searchPatientBasedDisease(String diseaseName)
	{
		Hospital h=null;
		int count=0;
		String storedDisease=null;
		boolean status=false;
		for(int i=0;i<=hospitalList.size()-1;i++)
		{
			h=hospitalList.get(i);
			storedDisease=h.getDiseaseName();
			status=storedDisease.equals(diseaseName);
			if(status)
			{
				System.out.println(h);
				count++;
			}		
		}
		if(count>=1)
		{
			return h;
		}
		else
		{
			throw new PatientNameNotFoundException();
		}
	}
	public Hospital searchpatientBasedOnDoctor(String doctorName)
	{
		Hospital h=null;
		String storedDoctorName=null;
		boolean status=false;
		int count=0;
		for(int i=0;i<=hospitalList.size()-1;i++)
		{
			h=hospitalList.get(i);
			storedDoctorName=h.getDoctorName();
			status=storedDoctorName.equals(doctorName);
			if(status)
			{
				System.out.println(h);
				count++;
			}	
		}
		if(count>=1)
		{
			return h;
		}
		else
		{
			throw new PatientNameNotFoundException();
		}
		
	}
	public int patientCount()
	{
		int a=hospitalList.size();
		return a;
	}
}
