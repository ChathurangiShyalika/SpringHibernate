package com.im.customer.bo;

import java.util.List;

import com.im.customer.model.Customer;
import com.im.customer.dao.CustomerDao;

public class CustomerBoImpl implements CustomerBo{
	
	CustomerDao CustomerDao;
	//DI via Spring
	public void setCustomerDao(CustomerDao customerDao) {
		this.CustomerDao = customerDao;
	}

	//call DAO to save customer
	public void addCustomer(Customer customer){
		CustomerDao.addCustomer(customer);
	}
	
	//call DAO to return customers
	public List<Customer> listCustomer(){
		return CustomerDao.listCustomer();
	}
}
