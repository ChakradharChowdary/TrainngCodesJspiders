package org.java.springjdbc;

import java.util.List;

public interface EmployeeDao {
	public abstract void createEmployee(Employee employee);
   public abstract Employee getEmployeeById(int employeeId);
   public abstract void deleteEmployeeById(int employeeId);
   public abstract void updateEmployeeEmailById(String newEmail,int employeeId);
   public abstract List<Employee>getAllEmployeeDetails();
}
