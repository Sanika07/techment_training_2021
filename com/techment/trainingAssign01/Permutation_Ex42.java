package com.techment.trainingAssign01;

import java.util.Scanner;

public class Permutation_Ex42 {
	  public static void permutation(String str, int l, int r)  { 
	        if (l == r) 
	            System.out.println(str); 
	        else { 
	            for (int i = l; i <= r; i++) { 
	                str = swap(str, l, i); 
	                permutation(str, l + 1, r); 
	                str = swap(str, l, i); 
	            } 
	        } 
	    } 
	  
	    public static String swap(String a, int i, int j)  { 
	         
	        char[] charArray = a.toCharArray(); 
	        char temp = charArray[i]; 
	        charArray[i] = charArray[j]; 
	        charArray[j] = temp; 
	        return String.valueOf(charArray); 
	    } 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter String");
        String str=scanner.next();  //taking i/p
        
        int n = str.length();  //length of string
        
        permutation(str, 0, n - 1); 
scanner.close();
	}

}
