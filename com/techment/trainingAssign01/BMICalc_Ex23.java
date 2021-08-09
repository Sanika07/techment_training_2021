package com.techment.trainingAssign01;

import java.util.Scanner;

public class BMICalc_Ex23 {

	public static void main(String[] args) {
		float height,weight,bmi,heightMeter;  //variable
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter height in cm and weight in Kgs");
		height=scanner.nextInt();
		weight=scanner.nextInt(); //store i/p
		
		heightMeter=height/100;
		bmi=weight/(heightMeter*heightMeter); //calculating
		
		if(bmi < 18.5 )	 
			System.out.println("Underweight");
		else if(bmi>=18.5 && bmi<25)
			System.out.println("Normal");
		else if(bmi>=25 && bmi<30)
			System.out.println("Over Weight");
		else if(bmi>30)
			System.out.println("Obese");

		scanner.close();
	}

}
