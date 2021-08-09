package com.techment.trainingAssign01;

import java.util.Scanner;

public class Pattern_Ex36 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//Taking rows value from the user
		 
		System.out.println("How many rows you want in this pattern?");
		 
		int rows = sc.nextInt();
		
		for(int i=1;i<=rows;i++) {   //first half line print
			for(int j=1;j<=rows-i+1;j++) {
				System.out.print(j);
				
			}
			int count=0;   //counting the no. of space
			for(int j=rows-i+1;j>=1;j--) {
				
				if(j==5) {  //skip printing space if j=5
					System.out.print(j);
					continue;
				}
				else if(count==0 && i!=1) {  //print 1 time space
					System.out.print(" ");
					count++;
				}
				System.out.print(j);  //second half line
			}
			System.out.println();
		}
sc.close();
	}

}
