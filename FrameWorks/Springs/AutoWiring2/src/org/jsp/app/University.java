package org.jsp.app;

public class University 
{
 private String universityName;
 private String universityLoc;
 private College college;
public String getUniversityName() {
	return universityName;
}
public void setUniversityName(String universityName) {
	this.universityName = universityName;
}
public String getUniversityLoc() {
	return universityLoc;
}
public void setUniversityLoc(String universityLoc) {
	this.universityLoc = universityLoc;
}
public College getCollege() {
	return college;
}
public void setCollege(College college) {
	this.college = college;
}
@Override
public String toString() {
	return "University [universityName=" + universityName + ", universityLoc=" + universityLoc + ", college=" + college
			+ "]";
}

}
