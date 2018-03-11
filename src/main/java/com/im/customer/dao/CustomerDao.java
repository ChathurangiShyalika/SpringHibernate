package com.im.customer.dao;

import java.util.List;

import com.im.customer.model.Customer;

public interface CustomerDao {
	void addCustomer(Customer customer);
	List<Customer> listCustomer();	
}
