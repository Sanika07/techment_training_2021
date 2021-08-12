package com.techment.CollectionAssignment;

import java.io.*;
import java.util.*;

public class States {

	public static void main(String[] args) throws Exception {
		
		File file = new File("E:\\TECHMENT_TRAINING\\states.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		 LinkedHashSet<String> linkedset = new LinkedHashSet<String>();  
		 
		 String st;
		  while ((st = br.readLine()) != null)
		  {
			  linkedset.add(br.readLine());
		  }
		 
		  ArrayList<String> array = new ArrayList<>(linkedset);
		  Collections.sort(array);
		  
		System.out.println("Displaying all states:" + "\n" +  linkedset);
		System.out.println("Total no. of states:"+ "\n" + linkedset.size());
		System.out.println("Removing Delhi from States List: "+ "\n" + linkedset.remove("Delhi"));
		System.out.println("Displaying Sorted List of States: " + "\n" + array);
		
	}

}
