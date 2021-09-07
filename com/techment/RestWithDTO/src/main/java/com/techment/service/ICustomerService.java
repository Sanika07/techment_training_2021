package com.techment.service;

import java.util.List;

import com.techment.dto.CustomerDto;
//import com.techment.entity.Customer;

public interface ICustomerService {

	String addCustomer(CustomerDto customerDto);
	List<CustomerDto> viewAllCustomer();
	CustomerDto viewCustomerById(Long id);
	String updateCustomer(CustomerDto customerDto);
	String deleteCustomerById(Long id);
}
