package org.jsp.app;

import java.util.List;
import java.util.Set;

public class Student 
{
private List<String> name;
private Set<String> phone;
private double marks;
public List<String> getName() {
	return name;
}
public void setName(List<String> name) {
	this.name = name;
}
public Set<String> getPhone() {
	return phone;
}
public void setPhone(Set<String> phone) {
	this.phone = phone;
}
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [name=" + name + ", phone=" + phone + ", marks=" + marks + "]";
}

}
