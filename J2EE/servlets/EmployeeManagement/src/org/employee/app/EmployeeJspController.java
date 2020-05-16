package org.employee.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeJspController 
{
	 ModelAndView modelAndView=null;
 
	 @RequestMapping(value = "/searchPage",method = RequestMethod.GET)
	 public ModelAndView searchPage()
	 {
		 modelAndView=new ModelAndView("search.html");
		 return modelAndView;
	 }
	 
	 

	 @RequestMapping(value = "/empn",method = RequestMethod.POST)
	 public ModelAndView search(@RequestParam("number")String phoneNumber1)
	 {
		 Employee employee =new Employee();
		 employee.setPhoneNumber(phoneNumber1);
		 
		 EmployeePersistance.search1(employee);
		 
		 modelAndView=new ModelAndView("empSearch.jsp", "chinna", "SearchedSucessfully");
		 return modelAndView;
	 }
}
