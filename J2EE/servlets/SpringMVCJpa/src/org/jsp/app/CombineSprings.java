package org.jsp.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CombineSprings
{
	ModelAndView modelAndView=null;
	@RequestMapping("/fest")
	public ModelAndView fest(@RequestParam("fn")String festName,
			@RequestParam("fd")String festDate,
			@RequestParam("ft")String festType)
	{
		JpaSpring jpaSpring=new JpaSpring();
		jpaSpring.setFestivalName(festName);
		jpaSpring.setFestivalDate(festDate);
		jpaSpring.setFestivalType(festType);

		JpaClass.add1(jpaSpring);

		modelAndView=new ModelAndView("SJpa", "chakri", "Sucessfully Inserted");
		return modelAndView;

	}


}
