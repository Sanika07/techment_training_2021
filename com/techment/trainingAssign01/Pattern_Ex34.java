package com.techment.trainingAssign01;

import java.util.Scanner;

public class Pattern_Ex34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Taking rows value from the user
		 
		System.out.println("How many rows you want in this pattern?");
		 
		int rows = sc.nextInt();
		
		for(int i=rows;i>=1;i--) {
			for(int j=rows;j>=rows-i+1;j--) {
				System.out.print(j);  //print pattern
			}
			System.out.println();  //next line
		}
sc.close();
	}

}
