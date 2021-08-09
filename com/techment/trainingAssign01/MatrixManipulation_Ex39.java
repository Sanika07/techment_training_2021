package com.techment.trainingAssign01;

import java.util.Scanner;

public class MatrixManipulation_Ex39 {

	public static void matrixAddition(int arr[][][], int n){
		for(int i=0;i<n;i++)  {
			for(int j=0;j<n;j++)
				arr[i][j][2]=arr[i][j][0]+arr[i][j][1];  //matrix addition
		}
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter matrix size n");
		n=scanner.nextInt();
		
		int array[][][] = new int[n][n][3];
		
		System.out.println("Enter first matrix["+n+"]["+n+"]" +"in row major order");
		
		for(int i=0;i<n;i++) {  //store first matrix in array
			for(int j=0;j<n;j++)
				array[i][j][0]=scanner.nextInt();
		}
		
		System.out.println("Enter second matrix["+n+"]["+n+"]" +"in row major order");
		
		for(int i=0;i<n;i++) {    //store first matrix in array
			for(int j=0;j<n;j++)
				array[i][j][1]=scanner.nextInt();
		}
		
		matrixAddition(array,n);
		
		System.out.println("Addition of matrix["+n+"]["+n+"]" +"is :");
		for(int i=0;i<n;i++)   
		{
			for(int j=0;j<n;j++)
				System.out.print(array[i][j][2] +" ");
			System.out.println();
		}

	}

}
