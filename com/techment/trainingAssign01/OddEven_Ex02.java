package com.techment.trainingAssign01;

import java.util.Scanner;

public class OddEven_Ex02 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter weekday day number (1-31) : ");
	        int n = sc.nextInt();
	        int value;
	        if(n % 2 == 0)
	        {
	            value = 0;
	        }
	        else
	        {
	            value = 1;
		}
	       if(n <= 31){
	        if(value == 1) {

	            System.out.println("Cars with Odd registration numbers are permitted today");

	        } else if(value == 0) {

	            System.out.println("Cars with Even registration numbers are permitted today");

	        }}
	        else
	        {        	System.out.println("invalid input");}
	       
	       sc.close();

	}

}
