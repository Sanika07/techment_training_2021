package com.techment.trainingAssign01;

import java.util.Scanner;

public class Pattern_Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Taking rows value from the user
		 
		System.out.println("How many rows you want in this pattern?");
		 
		int rows = sc.nextInt();
		
		for(int i=1;i<=rows;i++)   //iteration for row
		{
				for(int j=1;j<=rows-i;j++)  //iteration for space
					System.out.print(" ");
				
				for(int j=rows-i+1;j<=rows;j++)
					System.out.print(j);
				
				for(int j=rows-1;j>=rows-i+1;j--)
					System.out.print(j);
				
			System.out.println(); //for new line
			}
sc.close();
	}

}
