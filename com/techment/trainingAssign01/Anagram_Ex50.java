package com.techment.trainingAssign01;

import java.util.Scanner;
import java.lang.Math;

public class Anagram_Ex50 {
	int number;
	static int count=0;
	
	public static void checkNumber(int n)   //check number is 3 digit or not
	{
		do {
			n/=10;
			count++;
		}while(n!=0);
	}
	
	public static void armstrongNumber(int n)
	{
		if(count != 3)
			System.out.println("Enter number is not 3 digit number");
		else {
			int digit,number,sum=0;
			number=n;
			for(int i=1;i<=3;i++)   //check number is armstrong or not
			{
				digit=number%10;
				number/=10;
				sum+=Math.pow(digit,3.0);
			}
		if(n == sum)
			System.out.println("Number is Armstrong");
		else
			System.out.println("Number is Not Armstrong");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 3 digit number");
		int number = scanner.nextInt();    //taking the input from user
		
		checkNumber(number);
		armstrongNumber(number);
scanner.close();
	}

}
