package org.jsp.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("a1")
public class Account 
{
	@Value("chinna")
 private String accName;
	@Value("SBI12345")
 private String accNum;
	@Override
	public String toString() {
		return "Account [accName=" + accName + ", accNum=" + accNum + "]";
	}
	
}
