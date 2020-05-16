package org.jsp.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("h2")
public class Hospital
{
	@Value("xyz")
  private String hopName;
	@Value("hyd")
  private String hopLoc;
	@Autowired
  private Doctor doctor;
	@Override
	public String toString() {
		return "Hospital [hopName=" + hopName + ", hopLoc=" + hopLoc + ", doctor=" + doctor + "]";
	}
	
}
