package com.techment.trainingAssign01;

import java.util.Scanner;

public class Herons_Ex44 {

	public static void main(String[] args) {
		double s,area;
		System.out.println("Enter the 3 sides of a triangle as integer:");
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt(); //  i/p from user
		int b=scanner.nextInt();
		int c=scanner.nextInt();

		s = (a+b+c) / 2;  
		area = Math.sqrt( s*(s-a)*(s-b)*(s-c) );  
		System.out.println("Area of Tringle is "+area);
scanner.close();

	}

}
