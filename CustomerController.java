package com.nucleus.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nucleus.dao.ICustomerDao;
import com.nucleus.model.Customer;

@Controller
public class CustomerController {
	
	@Autowired
	ICustomerDao customerDao;
	
	@RequestMapping("/RegisterCustomer")	
	public ModelAndView request1(@ModelAttribute("customer2") Customer customer2)
	{
		//customer.setCustname("aaaa");
		return new ModelAndView("customerform");
	}
	
	@RequestMapping("/saveCustomer")
	public ModelAndView request2(@ModelAttribute("customer2") @Valid Customer customer, BindingResult result)
	{
		if(result.hasErrors())
		{
			return new ModelAndView("customerform");
		}
		customerDao.saveCustomer(customer);
		return new ModelAndView("result","cust",customer);
	}
}
