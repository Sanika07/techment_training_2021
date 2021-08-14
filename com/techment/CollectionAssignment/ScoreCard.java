package com.techment.CollectionAssignment;

import java.util.*;

public class ScoreCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int TotalScore =0;	
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Rahul",35);
		hm.put("Dhoni",150);
		hm.put("Kohli",45);		
		hm.put("Rahane",20);
		hm.put("Rohit", 200);
				
		TreeMap<String,Integer> sorted = new TreeMap(hm);
		
		System.out.println("\nPlayers who batted: ");
		for (Map.Entry<String, Integer> entry : sorted.entrySet())
		{
			System.out.println(entry.getKey());
			
		}
		
		System.out.println("\nScores by players: ");
		for (Map.Entry<String, Integer> entry : sorted.entrySet())
		{	
			TotalScore = TotalScore+entry.getValue();
			System.out.println( entry.getKey()+":"+entry.getValue());
		}
		
		System.out.println("\nTotal Score : "+TotalScore);
		
		System.out.print("\nHighest Scorer : ");			
		Map.Entry<String, Integer> maxEntry = null;

		for (Map.Entry<String, Integer> entry : sorted.entrySet())
		{
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
		    {
		        maxEntry = entry;
		    }
		    
		}
		System.out.println(maxEntry.getKey());
	
		System.out.println("Runs Scored by Dhoni : "+ sorted.get("Dhoni"));
		
		
		
	}

}
