package com.hospital.hospitaldao;

public class HospitalDetails
{
	public static HospitalDAO getHospitalDAO()
	{
		HospitalDAO dao=new HospitalDAOImplements();
		return dao;
	}
}
