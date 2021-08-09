package com.techment.trainingAssign01;

import java.util.Scanner;

public class BinaryDecimal_Ex48 {
	public static int binaryToDecimal(int binary) {
		
		 int decimal=0,power=0;

		 while(true){
		     if(binary == 0)  //if binary no. is zero then return
		          break;
		     else {
		    	  int tmp = binary%10; //getting last digit
		          decimal += tmp*Math.pow(2, power);  //multiply with power of 2
		          binary = binary/10;    //getting binary with removing last digit
		          power++;  //increment power
		          }
		 }
		return decimal;       
	}
	public static void main(String[] args) {
		
Scanner scanner =new Scanner(System.in);
		
        System.out.println("Enter the binary number");
        int binary=scanner.nextInt();  //taking i/p from user side
        
        System.out.println("Decimal="+binaryToDecimal(binary));
scanner.close();
	}

}
