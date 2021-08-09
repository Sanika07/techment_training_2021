package com.techment.trainingAssign01;

import java.util.Scanner;

public class AccountLocked_Ex45 {

	public static void main(String[] args) {
int userEnteredPin,count=0,correctPin=12345;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the pin "); //taking pin no.
		userEnteredPin=scanner.nextInt();
		
		while(count!=2) { 
		if(userEnteredPin == correctPin) {  //checking pin is correct or not
			System.out.println("Accepted");
			break;
			}
		else {
			System.out.println("Incorrect pin, Enter pin again");
			userEnteredPin=scanner.nextInt();  //another chance to take i/p
			count++;
			}
		}
		if(count==2) //maximum attempt
			System.out.println("Account Locked");
scanner.close();
	}

}
