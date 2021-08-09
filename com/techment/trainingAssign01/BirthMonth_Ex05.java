package com.techment.trainingAssign01;

import java.util.Scanner;

public class BirthMonth_Ex05 {

	public static void main(String[] args) {
		int birthMonth;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the birth month");
		birthMonth = scanner.nextInt();
		switch(birthMonth)
		{
		case 1: 
			System.out.println("Your Birth Month January");
			break;
		case 2: 
			System.out.println("Your Birth Month Februray");
			break;
		case 3: 
			System.out.println("Your Birth Month March");
			break;
		case 4: 
			System.out.println("Your Birth Month April");
			break;
		case 5: 
			System.out.println("Your Birth Month May");
			break;
		case 6: 
			System.out.println("Your Birth Month June");
			break;
		case 7: 
			System.out.println("Your Birth Month July");
			break;
		case 8: 
			System.out.println("Your Birth Month August");
			break;
		case 9: 
			System.out.println("Your Birth Month September");
			break;
		case 10: 
			System.out.println("Your Birth Month October");
			break;
		case 11: 
			System.out.println("Your Birth Month November");
			break;
		case 12: 
			System.out.println("Your Birth Month December");
			break;
		default : 
			System.out.println("Invalid Input");
		}
		scanner.close();

	}

}
