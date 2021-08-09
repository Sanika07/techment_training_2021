package com.techment.trainingAssign01;

public class Sorting_Ex22 {

	public static void main(String[] args) {
		for(int i=0; i<args.length; i++) {
			 for (int j =i+1; j < args.length; j++) { 
	                if (args[i].compareTo(args[j])>0) 
	                {
	                   String temp = args[i];
	                    args[i] = args[j];
	                    args[j] = temp;
	                }
	            }
			}
		System.out.println("Sorted order: ");
		for(int i=0;i<args.length;i++) {
			System.out.print(args[i] +" ");
		}

	}

}
