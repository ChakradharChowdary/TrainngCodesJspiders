package org.employee.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController 
{
 ModelAndView modelAndView=null;
 
 
 @RequestMapping(value = { "/","/admin"},method = RequestMethod.GET)
 public ModelAndView home()
 {
	 modelAndView=new ModelAndView("admin.html");
	 return modelAndView;
 }
 
 
 @RequestMapping(value = "/add",method = RequestMethod.GET)
 public ModelAndView addPage()
 {
	 modelAndView=new ModelAndView("add.html");
	 return modelAndView;
 }
 

 
 @RequestMapping(value = "/removePage",method = RequestMethod.GET)
 public ModelAndView removePage1()
 {
	 modelAndView=new ModelAndView("remove.html");
	 return modelAndView;
 }
 
 
 @RequestMapping(value = "/emp",method = RequestMethod.POST)
 public ModelAndView emp(@RequestParam("name")String name,
		                 @RequestParam("date")String date,
		                  @RequestParam("email")String emailId,
		                  @RequestParam("number")String phoneNumber,
		                  @RequestParam("address")String address,
		                  @RequestParam("hiredate")String hireDate,
		                  @RequestParam("designation")String designation,
		                  @RequestParam("salary")String salary,
		                  @RequestParam("bloodGroup")String bloodGroup)
 {
	 Employee employee =new Employee();
	 employee.setName(name);
	 employee.setEmailId(emailId);
	 employee.setPhoneNumber(phoneNumber);
	 employee.setAddress(address);
	 employee.setHireDate(hireDate);
	 employee.setDesignation(designation);
	 employee.setSalary(salary);
	 employee.setBloodGroup(bloodGroup);
	 employee.setDateOfBirth(date);
	 
	 EmployeePersistance.add1(employee);
	 modelAndView=new ModelAndView("empSys.html");
	 return modelAndView;
 }

 
 @RequestMapping(value = "/remove",method = RequestMethod.POST)
 public ModelAndView remove(@RequestParam("number")String phoneNumber)
 {
	 Employee employee =new Employee();
	 employee.setPhoneNumber(phoneNumber);
	 EmployeePersistance.remove1(employee);
	 modelAndView=new ModelAndView("empRemove.html");
	 return modelAndView;
 }
 
}
