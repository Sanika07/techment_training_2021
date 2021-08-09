package com.techment.trainingAssign01;

import java.util.Scanner;

class Product{
	private int id;
	private String name;
	private float price;
	
	
	public void setId(int id) { //setter
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getId() { //getter
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
}
public class ProductCatalogue_Ex21 {

	public static void main(String[] args) {
		int id; //variables
		String nm;
		float pr;
		boolean flag=false;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many product you wan to add");
		int n=scanner.nextInt();
		Product p[] = new Product[n];
		
		for(int i=0;i<n;i++) {
			p[i]= new Product(); //array of object
			
			System.out.println("Enter the product id, name and price");
			id=scanner.nextInt();
			nm=scanner.nextLine();
			pr=scanner.nextFloat();
			
			System.out.println(id +nm +pr);
			p[i].setId(id);
			p[i].setName(nm);
			p[i].setPrice(pr);
		}
		System.out.println("Enter the product id to get details");
		id=scanner.nextInt();
		
		for(int i=0;i<n;i++) {
			 flag = (id == p[i].getId());//getting the pid
			if(flag == true) {
				System.out.println("Details found: \n ID: "+p[i].getId());
				System.out.println("Name: "+p[i].getName());
				System.out.println("Price: "+p[i].getPrice());
				break;
			}
		}
scanner.close();
	}

}
