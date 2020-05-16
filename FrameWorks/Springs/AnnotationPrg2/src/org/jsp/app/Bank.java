package org.jsp.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("b1")
public class Bank 
{
	@Value("SBI")
private String bankName;
	@Value("hyd")
private String bankLoc;
	@Autowired
private Account account;
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", bankLoc=" + bankLoc + ", account=" + account + "]";
	}
 
}
