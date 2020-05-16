package org.jsp.app;

public class Address 
{
	private int houseNum;
	private String area;
	private String city;
	public int getHouseNum() {
		return houseNum;
	}
	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [houseNum=" + houseNum + ", area=" + area + ", city=" + city + "]";
	}
	

}
