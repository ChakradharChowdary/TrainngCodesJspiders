package org.jsp.app;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Crop
 *
 */
@Entity

public class Crop implements Serializable {

	   
	@Id
	private String name;
	private int Months;
	private double cost;
	private static final long serialVersionUID = 1L;

	public Crop() {
		super();
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public int getMonths() {
		return this.Months;
	}

	public void setMonths(int Months) {
		this.Months = Months;
	}   
	public double getCost() {
		return this.cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
   
}
