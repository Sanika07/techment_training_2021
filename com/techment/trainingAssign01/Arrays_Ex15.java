package com.techment.trainingAssign01;

import java.util.Scanner;

public class Arrays_Ex15 {

	public static void main(String[] args) {
		int n,flag=0;
		int[] array1 = new int[15];
		int[] array2 = new int[15];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("No. of element in array");
		n=scanner.nextInt();
		
		System.out.println("Enter first array elelment ");
		for(int i=0;i<n;i++) {    //taking i/p from user to array1
			array1[i]=scanner.nextInt();	
		}
		System.out.println("Enter second array elelment ");
		for(int i=0;i<n;i++) {    //taking i/p from user to array2
			array2[i]=scanner.nextInt();	
		}
		
		for(int i=0;i<n;i++) {
			if(array1[i] != array2[i]) {  //checking array is same or not
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("Array is same");
		else
			System.out.println("Array is diffrent");

		scanner.close();
	}

}
