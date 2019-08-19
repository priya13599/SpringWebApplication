package com.nucleus.model;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

public class Customer {
@Min(value=100, message="Minimum value for customerid is 100")
private int customerid;

@Length(min=3, max=10)
//@Email
private String custname;
public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
public String getCustname() {
	return custname;
}
public void setCustname(String custname) {
	this.custname = custname;
}

}
