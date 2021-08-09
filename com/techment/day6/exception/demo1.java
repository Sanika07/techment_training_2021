package com.techment.day6.exception;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		int num1=4, num2=2, dat;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the data:");
	dat = sc.nextInt();
	
try  
{  
 int tmp = num1/dat; //may throw exception  
}  
    //handling the exception  
catch(Exception e)  
{  
    System.out.println("can't input zero as data");  
}  
System.out.println(num1/num2);
sc.close();
	}

}
