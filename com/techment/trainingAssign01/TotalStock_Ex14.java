package com.techment.trainingAssign01;

import java.util.Scanner;

public class TotalStock_Ex14 {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("No. of product in super market");
		n=scanner.nextInt();
		int[] products = new int[n];
		System.out.println("Enter each product quatity ");
		
		for(int i=0;i<products.length;i++) {
			products[i]=scanner.nextInt();
			sum+=products[i];
		}
		
		System.out.println("Mr. Ram Babu, sum of quatity in your stock market is "+sum);
scanner.close();
	}

}
