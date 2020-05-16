package org.jsp.app;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Mobile
 *
 */
@Entity

public class Mobile implements Serializable {

	   
	@Id
	private String EIMI;
	private String colour;
	private double cost;
	private static final long serialVersionUID = 1L;

	public Mobile() {
		super();
	}   
	public String getEIMI() {
		return this.EIMI;
	}

	public void setEIMI(String EIMI) {
		this.EIMI = EIMI;
	}   
	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}   
	public double getCost() {
		return this.cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
   
}
