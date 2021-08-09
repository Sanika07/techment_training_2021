package com.techment.trainingAssign01;

import java.util.Scanner;

class InvaliAgeException extends Exception  //user define exception
{
	InvaliAgeException(String s) {
		super(s);
	}
}
public class InvalidAge_Ex17 {

	public static void main(String[] args) {
		int age;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter age ");
		age=scanner.nextInt();  //taking i/p from user
		
		try {
			if(age>=18)  //check for vote
				System.out.println("Welcome to Vote");
			else
				throw new InvaliAgeException("Invalid Age"); //throw exception
		}
		catch(InvaliAgeException e)
		{
			System.out.println(e.getMessage());  //print message
		}
scanner.close();

	}

}
