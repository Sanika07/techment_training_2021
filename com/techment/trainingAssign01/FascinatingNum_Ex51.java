package com.techment.trainingAssign01;

import java.util.Scanner;

public class FascinatingNum_Ex51 {
	public static void fascinatingNum(int n) {  //fascinating number method
		int count=0;
		String val=""+n +(n*2)+(3*n);
		
		for(int i=1;i<=9;i++) {
			int pos=val.indexOf(i);
			if (val.substring(pos+1).indexOf(i) >= 0) //checking for duplicate
				count++;
		}
		
		if(count ==0)
			System.out.println(n +"is a fascinating number!");
		else
			System.out.println(n +"is NOT a fascinating number!");
	}
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter 3 digit number: ");
		n=scanner.nextInt();  //taking i/p from user
		
		if(n>=100 && n<=999)
			fascinatingNum(n); //calling method
		else
			System.out.println("Entered number is not 3 digit number");
scanner.close();
	}

}
