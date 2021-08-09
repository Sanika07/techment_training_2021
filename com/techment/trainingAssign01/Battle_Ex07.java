package com.techment.trainingAssign01;

import java.util.Scanner;

public class Battle_Ex07 {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int first=scanner.nextInt();
		System.out.println("Enter last number:");
		int last=scanner.nextInt();

		for(int i=first;i<=last;i++)
		{
		System.out.println(i);
		}
		scanner.close();

	}

}
