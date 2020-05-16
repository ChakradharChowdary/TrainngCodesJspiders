package org.java.springjdbc;



import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx =new ClassPathXmlApplicationContext("Beans.xml");
		EmployeeService employeeService=ctx.getBean("employeeService", EmployeeServiceImpl.class);
		Employee employee=new Employee();
		employee.setEmail("java@gmail.com");
		employee.setEmpName("java");
		employee.setGender("male");
		employee.setSalary(9000.00);
		employeeService.addEmployee(employee);
		
		ctx.close();
	}

}
