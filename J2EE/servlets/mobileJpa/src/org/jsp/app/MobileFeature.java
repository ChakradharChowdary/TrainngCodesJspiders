package org.jsp.app;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: MobileFeature
 *
 */
@Entity

public class MobileFeature implements Serializable {

	   
	@Id
	private String IMEI;
	private String colour;
	private double cost;
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "MobileFeature [IMEI=" + IMEI + ", colour=" + colour + ", cost=" + cost + "]";
	}
	public MobileFeature() {
		super();
	}   
	public String getIMEI() {
		return this.IMEI;
	}

	public void setIMEI(String IMEI) {
		this.IMEI = IMEI;
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
