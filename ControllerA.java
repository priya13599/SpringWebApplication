package com.nucleus.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerA {
	
	@RequestMapping(value="/abc", method=RequestMethod.GET)
	public ModelAndView request1()
	{
		ModelAndView model=new ModelAndView("result");
		model.addObject("a","Hello");
		model.addObject("b","Hello...2");
		return model;
		//return new ModelAndView("result","a","Hello");
	}

	@RequestMapping("/xyz")
	public ModelAndView request2()
	{
		return new ModelAndView("result");
	}
	
	@RequestMapping("/pqr2")
	public ModelAndView request3(HttpServletRequest request)
	{
		String name=request.getParameter("name");
		return new ModelAndView("result","name",name);
	}
	
	@RequestMapping("/pqr")
	public ModelAndView request4(@RequestParam(defaultValue="abc", required=true, name="name")  String name)	
	{
		
		return new ModelAndView("result","name",name);
	}
}
