package com.techment.trainingAssign01;

import java.util.Scanner;

public class ArithmeticException_Ex18 {

	public static void main(String[] args) {
		int number1,number2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two number ");
		number1=scanner.nextInt();  //taking i/p from user
		number2=scanner.nextInt();
		
		try {
			if(number2 <= 0)    //throw exception
				throw new ArithmeticException("Can not divisible by zero");
			else
				System.out.println("Division is " +(number1/number2));
		}
		catch(ArithmeticException e){   //caught exception
			System.out.println(e.getMessage());
		}
		finally { //finally block
			System.out.println("Inside finally block");
		}
scanner.close();
	}

}
