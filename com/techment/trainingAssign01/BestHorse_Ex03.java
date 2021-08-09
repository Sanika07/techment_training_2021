package com.techment.trainingAssign01;

import java.util.Scanner;

class Ex3 {
	Scanner scannerObject = new Scanner(System.in); //creating Scanner class object
	int horseWeight[] = new int[3];					//creating array for horse weight
	
	public void input()
	{
		System.out.println("Enter the horse weight");
		for(int i=0;i<3;i++)
		{
			horseWeight[i] = scannerObject.nextInt();  
		}
		for(int i=0; i<3;i++)
		{
			for(int j=i+1;j<3;j++)
			{
				if(horseWeight[i]==horseWeight[j])
				{
					System.out.println("Entered weights are not distinct values");
					break;
				}
			}
		}
			
	}
	
	public void checkWeight()
	{
		if(horseWeight[0]>horseWeight[1] && horseWeight[0]>horseWeight[2])
				
				System.out.println("Best Horse is"+horseWeight[0]);
		
			else if(horseWeight[1]>horseWeight[2])
					System.out.println("Best Horse is"+horseWeight[1]);

			else
				System.out.println("Best Horse is"+horseWeight[2]);

}
}
public class BestHorse_Ex03 {
	public static void main(String[] args) {
		Ex3 object3 = new Ex3();  //creating object
		object3.input();             //calling input() method
		object3.checkWeight();
	}
}
