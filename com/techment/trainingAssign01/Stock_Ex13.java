package com.techment.trainingAssign01;

public class Stock_Ex13 {

	public static void main(String[] args) {
		int[] products = {10,5,70,1000,500,250,75,280,350,1200};
		int maxQuantity=products[0];
		for(int i=0;i<10;i++) {
			if(maxQuantity< products[i])
				maxQuantity=products[i];
		}
		System.out.println("Mr. Ram Babu, maximum quatity in your stock market is "+maxQuantity);

	}

}
