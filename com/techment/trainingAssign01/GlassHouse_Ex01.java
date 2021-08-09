package com.techment.trainingAssign01;

import java.util.Scanner;

class Ex1{
	
	int input;
	Scanner scannerObject = new Scanner(System.in); //creating Scanner class object
	
	
	public void input()
	{
		System.out.println("Enter the two number");
		
			input = scannerObject.nextInt();  //taking first number from user
			
				
	}
	
	public void check()
	{
			
		int lastDigit= (input%10);
		int firstDigit = (input/10);
		int houseNumber=firstDigit+lastDigit;
		System.out.println("the glass house number"+houseNumber);
		
	}
}
public class GlassHouse_Ex01 {

	public static void main(String[] args) {
		Ex1 object1 = new Ex1();  //creating object
		object1.input();             //calling input() method
		object1.check();      //calling check() method

	}

}
