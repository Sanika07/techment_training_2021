package com.techment.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.CustomerDto;
import com.techment.entity.Customer;
import com.techment.exception.IdNotFoundException;
import com.techment.service.ICustomerService;

@RestController
@RequestMapping(value = "/customerController")
public class CustomerController {

	@Autowired
	ICustomerService service;
	
	@GetMapping(value = "/viewAllcustomers")
	public List<CustomerDto> viewCustomer()
	{
		return service.viewAllCustomer();
	}
	
	@PostMapping(value = "/InsertCustomers")
	public String addnewcustomers(@RequestBody CustomerDto customer) {
		service.addCustomer(customer);
		return "Insertion done";
	}
	
	@GetMapping(value = "/customerByid/{id}")
	public CustomerDto getById(@PathVariable Long id)
	{
		//CustomerDto customer = service.viewCustomerById(id);
		//return customer;
		
		try
		{
			return service.viewCustomerById(id);
		}
		catch (NoSuchElementException e)
		{
			throw new IdNotFoundException("no present to get it");
		}
	}

	@ExceptionHandler(value=IdNotFoundException.class)
	public ResponseEntity<Object> myException(IdNotFoundException exception)
	{
	return new ResponseEntity<Object> (exception.getMsg(), HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping(value = "deleteCustomerByid/{id}")
	public String deleteCustomer(@PathVariable Long id) {
		try
		{
			return service.deleteCustomerById(id);
		}
		catch (NoSuchElementException e)
		{
			throw new IdNotFoundException("no present to get it");
		}
	}
	
	@PutMapping(value = "/updateCustomers")
	public String updateCustomer(@RequestBody CustomerDto customer) {
		try
		{
			return service.updateCustomer(customer);
		}
		catch (NoSuchElementException e)
		{
			throw new IdNotFoundException("no present to get it");
		}
	}
}