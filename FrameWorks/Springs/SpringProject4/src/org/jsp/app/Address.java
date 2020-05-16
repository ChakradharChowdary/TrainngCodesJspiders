package org.jsp.app;

public class Address
{
 private int houseNum;
 private String area;
 private String location;
public int getHouseNum() {
	return houseNum;
}
public void setHouseNum(int houseNum) 
{
	this.houseNum = houseNum;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
@Override
public String toString() {
	return "Address [houseNum=" + houseNum + ", area=" + area + ", location=" + location + "]";
}
 
}
