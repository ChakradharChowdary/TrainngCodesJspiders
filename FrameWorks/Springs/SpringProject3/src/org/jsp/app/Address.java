package org.jsp.app;

public class Address 
{
 private int houseNum;
 private String area;
 private String jobLocation;
 private String city;
public Address(int houseNum, String area, String jobLocation, String city) {
	super();
	this.houseNum = houseNum;
	this.area = area;
	this.jobLocation = jobLocation;
	this.city = city;
}
@Override
public String toString() {
	return "Address [houseNum=" + houseNum + ", area=" + area + ", jobLocation=" + jobLocation + ", city=" + city + "]";
}
 
}
