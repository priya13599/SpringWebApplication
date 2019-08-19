package com.nucleus.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nucleus.model.Customer;
@Repository
public class CustomerDaoImpl implements ICustomerDao 
{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void saveCustomer(Customer customer) {
		Object obj[]={customer.getCustomerid(),customer.getCustname()};
		jdbcTemplate.update("insert into cust0 values(?,?)",obj);
	}

}
