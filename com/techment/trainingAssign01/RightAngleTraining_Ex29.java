package com.techment.trainingAssign01;

import java.util.Scanner;

public class RightAngleTraining_Ex29 {

	public static void main(String[] args) {
 int a,b,c;
	     
	     Scanner scanner = new Scanner(System.in);
	     
	     System.out.println("Enter the value of the sides\n");
	     System.out.print("Side 1 : ");
	     a=scanner.nextInt();
	     
	     System.out.print("Side 2 : ");
	     b=scanner.nextInt();
	     
	     System.out.print("Side 3 : ");
	     c=scanner.nextInt();
	     
	     if(a>b&&a>c) {
	         if((a*a)==(b*b)+(c*c))
	        	 System.out.println("It is a right-angled triangle");
	         else 
	        	 System.out.println("It is not a right-angled triangle");
	        } else if(b>c&&b>a) {
	            if((b*b)==(c*c)+(a*a))
	            	System.out.println("It is a right-angled triangle");
	            else
	            	System.out.println("It is not a right-angled triangle");
	        } else if(c>a&&c>b) {
	            if((c*c)==(a*a)+(b*b))
	            	System.out.println("It is a right-angled triangle");
	            else
	            	System.out.println("It is not a right-angled triangle");
	        }
scanner.close();
	}

}
