package org.jsp.app;

import java.sql.Driver;

public class Car1 
{
	private String carName;
	 private String carColour;
	 private double carCost;
	 private Driver driver;
	public Car1(String carName, String carColour, double carCost, Driver driver) {
		super();
		this.carName = carName;
		this.carColour = carColour;
		this.carCost = carCost;
		this.driver = driver;
	}
	@Override
	public String toString() {
		return "Car1 [carName=" + carName + ", carColour=" + carColour + ", carCost=" + carCost + ", driver=" + driver
				+ "]";
	}
	 
}
