package org.jsp.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("d1")
public class Doctor
{
	@Value("chinna")
 private String docName;
	@Value("xyz")
 private String specliation;
	@Override
	public String toString() {
		return "Doctor [docName=" + docName + ", specliation=" + specliation + "]";
	}
	
}
