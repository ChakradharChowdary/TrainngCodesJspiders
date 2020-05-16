package org.java.springjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

public class EmployeeDaoImp implements EmployeeDao {
	private DataSource dataSource;

	

	public void setDatasource(DataSource datasource) {
		this.dataSource = dataSource;
	}

	@Override
	public void createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement  preparedStatement=null;
		 try {
			 connection=dataSource.getConnection();
			 String sql="INSERT INTO test.employeejdbc(empName,email,salary,gender) VALUES(?,?,?,?)";
			 preparedStatement=connection.prepareStatement(sql);
			 preparedStatement.setString(1, employee.getEmpName());
			 preparedStatement.setString(2, employee.getEmail());
			 preparedStatement.setDouble(3, employee.getSalary());
			 preparedStatement.setString(4, employee.getGender());
			 int executeUpdate=preparedStatement.executeUpdate();
			 if(executeUpdate>0) {
				 System.out.println("Employee is created...");
			 }
				 
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(connection !=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		 

	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEmployeeEmailById(String newEmail, int employeeId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Employee> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
