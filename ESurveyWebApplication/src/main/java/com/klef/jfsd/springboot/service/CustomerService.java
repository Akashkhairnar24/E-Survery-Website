package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.Customer;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer);
	public Customer checkcustomerlogin(String uname,String pwd);
	
	
}
