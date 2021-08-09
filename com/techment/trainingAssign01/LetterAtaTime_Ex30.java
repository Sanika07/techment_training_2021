package com.techment.trainingAssign01;

import java.util.Scanner;

public class LetterAtaTime_Ex30 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Write your message... ");
		String message = scanner.nextLine();

		System.out.println("Your message is " + message.length() + " characters long.");
		System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
		int lastpos = message.length() - 1; //last position of array
		
		System.out.println("The last character is at position " + lastpos + " and is '" + message.charAt(lastpos) + "'.");
		System.out.println("Here are all the characters, one at a time:\n");

		for ( int i=0; i<message.length(); i++ ){ //display each character
		System.out.println(i + " - '" + message.charAt(i) + "'");
		}

		int a_count = 0;

		for ( int i=0; i<message.length(); i++ ){
			char letter = message.charAt(i);
			if ( letter == 'a' || letter == 'A' ){ //counting no. of a
				a_count++;
			}
		}

		System.out.println("Your message contains the letter 'a' " + a_count );
scanner.close();
	}

}
