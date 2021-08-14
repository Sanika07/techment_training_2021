package com.techment.CollectionAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class ScoreAnalyzer
{
	private	LinkedList<Integer> runsData = new LinkedList<Integer> ();
	
		public LinkedList getRunsData() {
		return runsData;
	}
	
	public void setRunsData(LinkedList runsData) {
		this.runsData = runsData;
	}
	
		public ScoreAnalyzer(LinkedList runsData)
		{
			super();
			this.runsData = runsData;
		}
	 
		public ScoreAnalyzer() {
			// TODO Auto-generated constructor stub
		}

		public void addRunsToList(int run)
		{
			
			runsData.add(run);
		}
	
	public void calcRunRate() 
	{
		double sum =0;
		double runRate;
		
		for(int j =0;j<runsData.size();j++)
		{
			sum =sum+(int)runsData.get(j);	
		}
		 runRate = sum/50;
		
		
		System.out.println("total run = "+sum);
		System.out.println("Run rate = "+runRate);

		
	}
	
	public void displayRuns()
	{	 
		
		System.out.print("Score: ");
		 int j=1;
		 for (Integer listElement : runsData)
		 {  System.out.print("Player"+j+"-"+listElement + "  ");
	            j++;
	     }		 
	}
	
	public void lowestRunsScored()
	{int min=0;
	int indexVal=0;
	
	 
	 min = Collections.min(runsData);
	
	for(int j =0;j<runsData.size();j++)
		{ if(min== runsData.get(j))
			{ indexVal = j;	
			System.out.println("Player"+(indexVal+1)+" Lowest score = "+min);
			}
		}
		
	}
	
}



public class TestScoreAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScoreAnalyzer scores = new ScoreAnalyzer();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many batsman run you want to enter =  ");
		int number = scanner.nextInt();
		
		
		if(number<=11)
		{		System.out.println("ok Total batsman is = "+number);
				System.out.println("========================================");
				System.out.println("Enter scores: ");
				Scanner scanRuns = new Scanner(System.in);
				
				for(int i=0;i<number;i++)
				{	System.out.print("Enter Score of  batsman "+(i+1)+" = ");
					scores.addRunsToList(scanRuns.nextInt());
				}
				System.out.println("========================================");
				scores.displayRuns();
				System.out.println("\n========================================");
				scores.calcRunRate();
				System.out.println("Total batsman is = "+number);
				scores.lowestRunsScored();
		}
		else 
		{
			System.out.println("In cricket match one teram has 11 player during match \nplease enter scores upto 11 player or less than 11 only!!");
			
		}
	}

}
