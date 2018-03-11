package com.im.customer.bo;

import java.util.List;

import com.im.customer.model.Customer;

public interface CustomerBo {
	void addCustomer(Customer customer);
	List<Customer> listCustomer();

}
