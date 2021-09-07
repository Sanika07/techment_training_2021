package com.techment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.ICustomerDao;
import com.techment.dto.CustomerDto;
import com.techment.entity.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	ICustomerDao Dao;

	@Override
	public String addCustomer(CustomerDto customerDto) {
		
		Customer customer = new Customer();
		customer.setName(customerDto.getName());
		customer.setAge(customerDto.getAge());
		customer.setEmail(customerDto.getEmail());
		customer.setPhone(customerDto.getPhone());
		Dao.save(customer);
		return "customer is added";
	}

	@Override
	public List<CustomerDto> viewAllCustomer() {
		
		List<Customer> customers = Dao.findAll();
		List<CustomerDto> customerDto = new ArrayList<CustomerDto>();
		
		for(Customer c : customers)
		{
			customerDto.add(new CustomerDto(c.getAge(),c.getName(),c.getId()));
		}
		return customerDto;
	}

	@Override
	public CustomerDto viewCustomerById(Long id) throws NoSuchElementException {
		Customer customer = new Customer(); 
				Dao.findById(id);
		CustomerDto customerDto = new CustomerDto(customer.getId(),customer.getEmail(), customer.getAge(), customer.getName(), customer.getPhone());
	
		return customerDto;
	}

	@Override
	public String updateCustomer(CustomerDto customerDto) {
		
		Customer customer = new Customer(); 
				Dao.save(customer);
		return "the record has been updated";
	}

	@Override
	public String deleteCustomerById(Long id) {
		
		Dao.deleteById(id);
		return "The record has been deleted";
	}
	
}
