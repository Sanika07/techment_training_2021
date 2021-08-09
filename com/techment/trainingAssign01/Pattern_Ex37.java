package com.techment.trainingAssign01;

import java.util.Scanner;

public class Pattern_Ex37 {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);

	//Taking rows value from the user
	 
	System.out.println("How many rows you want in this pattern?");
	 
	int rows = sc.nextInt();
	for(int i=1;i<=rows;i++) {  //first triangle
		for(int j=rows-i;j>=1;j--)  //space
			System.out.print(" ");
			
		int j;
		for(j=i;j>=1;j--)
			System.out.print(j);
		
		for(int k=2;k<=i;k++)
			System.out.print(k);
		
		System.out.println();
	}
	for(int i=1;i<=rows;i++) {  //second triangle
		for(int j=1;j<=i;j++)  //space
			System.out.print(" ");
			
		int j;
		for(j=rows-i;j>=1;j--)
			System.out.print(j);
		
		for(int k=2;k<=rows-i;k++)
			System.out.print(k);
		
		System.out.println();
	}
	sc.close();
}
}
