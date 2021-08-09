package com.techment.trainingAssign01;

import java.util.Scanner;

public class Traingle_Ex52 {
	public static void triangle(int a,int b,int c) {
		
		if(a > b+c)   //checking the side for triangle
			System.out.println("Triangle can be formed!");
		else if(b > a+c)
			System.out.println("Triangle can be formed!");
		else if(c > b+a)
			System.out.println("Triangle can be formed!");
		else
			System.out.println("Triangle can not be formed!");
}
	public static void main(String[] args) {
		int a,b,c;
		Scanner scanner = new Scanner(System.in);  //scanner class object
		
		//taking input of all 3 sides of tringle
		System.out.println("Enter the first side of triangle");
		a=scanner.nextInt();
		System.out.println("Enter the second side of triangle");
		b=scanner.nextInt();
		System.out.println("Enter the third side of triangle");
		c=scanner.nextInt();
		
		triangle(a,b,c);
scanner.close();
	}

}
