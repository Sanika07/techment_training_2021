package com.techment.ExceptionAssign;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class InvalidInputException extends Exception
{
	public InvalidInputException(String msg)
	{
		super(msg);
	}
}

class Customer
{
	private String custNo;
	private String custName;
	private String category;
	public Customer(String custNo, String custName, String category) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.category = category;
	}
	public Customer(Object[] array) {
		// TODO Auto-generated constructor stub
	}
	public String getCustNo() {
		return custNo;
	}
	public String getCustName() {
		return custName;
	}
	public String getCategory() {
		return category;
	}
	
	void Validations(String custNo, String custName, String category) throws InvalidInputException
	{
		if((custNo.startsWith("c") || custNo.startsWith("C")) && custName.length()>=4 && (category.equals("Platinum") || category.equalsIgnoreCase("Gold") || category.equalsIgnoreCase("Silver")))
			System.out.println("Details of customer:" + "\n" + custNo + "  " + custName + "  " + category);
		else 
			throw new InvalidInputException("Required Validations didn't fullfilled");
	}
}



public class TestCustomer {

	public static void main(String[] args) {
		   List custList=new ArrayList();
           System.out.println("Enter the customer details:");
           Scanner input=new Scanner(System.in);

            String custData =input.nextLine();
            custList.add(custData);
            
            Customer customer = new Customer(custList.toArray(new String[0]));
	}

}
