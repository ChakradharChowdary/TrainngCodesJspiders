package org.jsp.app;

public class College 
{
 private String collegeName;
 private String collegeLoc;
public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
public String getCollegeLoc() {
	return collegeLoc;
}
public void setCollegeLoc(String collegeLoc) {
	this.collegeLoc = collegeLoc;
}
@Override
public String toString() {
	return "College [collegeName=" + collegeName + ", collegeLoc=" + collegeLoc + "]";
}
 
}
