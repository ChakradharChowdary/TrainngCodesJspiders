package org.jsp.app;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Festival
 *
 */
@Entity

public class Festival implements Serializable {

	   
	@Id
	private String FestivalName;
	private String FestivalDate;
	private String FestivalType;
	private static final long serialVersionUID = 1L;

	

	public Festival() {
		super();
	}   
	public String getFestivalName() {
		return this.FestivalName;
	}

	public void setFestivalName(String FestivalName) {
		this.FestivalName = FestivalName;
	}   
	public String getFestivalDate() {
		return this.FestivalDate;
	}

	public void setFestivalDate(String FestivalDate) {
		this.FestivalDate = FestivalDate;
	}   
	public String getFestivalType() {
		return this.FestivalType;
	}

	public void setFestivalType(String FestivalType) {
		this.FestivalType = FestivalType;
	}
   
}
