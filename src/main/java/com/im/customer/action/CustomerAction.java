package com.im.customer.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.im.customer.bo.CustomerBo;
import com.im.customer.model.Customer;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerAction implements ModelDriven{
	Customer customer = new Customer();
	List<Customer> customerList = new ArrayList<Customer>();
	CustomerBo customerBo; 
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	public CustomerBo getCustomerBo() {
		return customerBo;
	}
	public void setCustomerBo(CustomerBo customerBo) {
		this.customerBo = customerBo;
	}
	//Getters & Setters Here
	public Object getModel() {
		return customer;
	}
	public String addCustomer() throws Exception{
		customer.setCreatedDate(new Date());
		customerBo.addCustomer(customer);
	 	customerList = customerBo.listCustomer();
		return "success";
	}
	
	public String listCustomer() throws Exception{
		customerList = customerBo.listCustomer();
		return "success";
	}
	
}
