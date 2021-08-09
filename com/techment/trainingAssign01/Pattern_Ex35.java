package com.techment.trainingAssign01;

import java.util.Scanner;

public class Pattern_Ex35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Taking rows value from the user
		 
		System.out.println("How many rows you want in this pattern?");
		 
		int rows = sc.nextInt();
		
		for(int i=1;i<=rows;i++) { //first upper pattern
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
		for(int i=1;i<=rows-1;i++) {  //half lower pattern
			for(int j=1;j<=rows-i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
sc.close();
	}

}
