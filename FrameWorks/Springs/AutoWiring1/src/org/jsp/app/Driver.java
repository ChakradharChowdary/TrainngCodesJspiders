package org.jsp.app;

public class Driver 
{
 private String driverName;
 private String mobileNum;
public String getDriverName() {
	return driverName;
}
public void setDriverName(String driverName) {
	this.driverName = driverName;
}
public String getMobileNum() {
	return mobileNum;
}
public void setMobileNum(String mobileNum) {
	this.mobileNum = mobileNum;
}
@Override
public String toString() {
	return "Driver [driverName=" + driverName + ", mobileNum=" + mobileNum + "]";
}
 
}
