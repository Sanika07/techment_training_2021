package com.techment.trainingAssign01;

import java.util.Random;

public class RandomNum_Ex26 {

	public static void main(String[] args) {
		Random r = new Random();  //Random object creating

		int num1 = 1 + r.nextInt(10);
		int num2 = 1 + r.nextInt(10);

		System.out.println("First Random Number="+num1);
		System.out.println("Second Random Number="+num2);
		
		if ( num1 == num2 ) //checking for same
			System.out.println( "The random numbers were the same!" );
		else if ( num1 != num2 )
			System.out.println( "The random numbers were different!" );
	}

}
