package org.jsp.app;

public class Driver1
{
	private String driverName;
	 private String mobileNum;
	public Driver1(String driverName, String mobileNum) {
		super();
		this.driverName = driverName;
		this.mobileNum = mobileNum;
	}
	@Override
	public String toString() {
		return "Driver1 [driverName=" + driverName + ", mobileNum=" + mobileNum + "]";
	}
	 
}
