package org.jsp.app;

public class Car 
{
 private String carName;
 private String carColour;
 private double carCost;
 private Driver driver;
public String getCarName() {
	return carName;
}
public void setCarName(String carName) {
	this.carName = carName;
}
public String getCarColour() {
	return carColour;
}
public void setCarColour(String carColour) {
	this.carColour = carColour;
}
public double getCarCost() {
	return carCost;
}
public void setCarCost(double carCost) {
	this.carCost = carCost;
}
public Driver getDriver() {
	return driver;
}
public void setDriver(Driver driver) {
	this.driver = driver;
}
@Override
public String toString() {
	return "Car [carName=" + carName + ", carColour=" + carColour + ", carCost=" + carCost + ", driver=" + driver + "]";
}
 
}
