package com.techment.trainingAssign01;

import java.util.Scanner;

public class MirrorMatrix_Ex40 {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter matrix size n");
		n=scanner.nextInt();
		
		int array[][][] = new int[n][n][2];
		
		System.out.println("Enter matrix["+n+"]["+n+"]" +"in row major order");
		
		for(int i=0;i<n;i++) {  //store first matrix in array
			for(int j=0;j<n;j++)
				array[i][j][0]=scanner.nextInt();
		}
		
		for(int i=n-1,k=0;i>=0;i--,k++) {
			for(int j=0; j<n;j++) {
				array[j][k][1]=array[j][i][0];  //mirror matrix
			}
		}
		System.out.println("Mirror matrix["+n+"]["+n+"]" +"is :");
		for(int i=0;i<n;i++)   
		{
			for(int j=0;j<n;j++)
				System.out.print(array[i][j][1] +" ");
			System.out.println();
		}
scanner.close();
	}

}
