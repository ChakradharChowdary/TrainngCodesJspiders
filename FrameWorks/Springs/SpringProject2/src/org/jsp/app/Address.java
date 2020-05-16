package org.jsp.app;

public class Address {
	private int houseNum;
	private String area;
	private String city;
	public Address(int houseNum, String area, String city)
	{
		super();
		this.houseNum = houseNum;
		this.area = area;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [houseNum=" + houseNum + ", area=" + area + ", city=" + city + "]";
	}

}
