package OopsAssignment;

import java.util.Random;
import java.util.Scanner;

abstract class Medicine 
{
	
int price;
int expDate;



public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getExpDate() {
	return expDate;
}

public void setExpDate(int expDate) {
	this.expDate = expDate;
}

public void GetDetails()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the price :");
	int price =sc.nextInt();
	System.out.println("Enter expiry date :");
	int expDate= sc.nextInt();
	
	System.out.println("price :"+price);
	System.out.println("Expiry date :"+expDate);
	
}

abstract void displayLabel();
}
class Tablet extends  Medicine
{

	int quantity=30;
	@Override
	void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("tablet Quantity :"+quantity);
		System.out.println("tablet price :"+price);
		System.out.println("tablet Expiry date :"+expDate);
		System.out.println("\n Additional information of medicine : Store in a cool dry place");
		
	}
	
}

class Syrup extends Medicine
{

	int quantity =55;
	@Override
	void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Syrup Quantity :"+quantity);
		System.out.println("Syrup price :"+price);
		System.out.println("Syrup Expiry date :"+expDate);
		System.out.println("\n Additional information of medicine : take it as per doctor discription and"
				+ " store it in cold and dry place");
		
	}
	
}


class Ointment extends Medicine
{

	int quantity=15;
	
	@Override
	void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Ointment Quantity :"+quantity);
		System.out.println("Ointment price :"+price);
		System.out.println("Ointment Expiry date :"+expDate);
		System.out.println("\n Additional information of medicine : it is for external use only");
		
	}
	
}
public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Medicine a[] = new Medicine [5];
		
		Medicine t = new Tablet();
		Medicine s = new Syrup();
		Medicine o = new Ointment();
		
		Random random = new Random();
		if(random.nextInt(3)==3)
		{
			a[3]= new Ointment();
			o.setPrice(1200);
			o.setExpDate(2022);
			o.GetDetails();
			o.displayLabel();
			System.out.println(o.getExpDate());
			System.out.println(o.getPrice());
		
			
		}
		else if(random.nextInt(2)==2) {
			a[2]= new Syrup();
			s.setPrice(500);
			s.setExpDate(2024);
			s.GetDetails();
			s.displayLabel();
			System.out.println(s.getExpDate());
			System.out.println(s.getPrice());
		}
		else if(random.nextInt(1)==1)
		{
			a[1]= new Tablet();
			t.setPrice(2500);
			t.setExpDate(2025);
			t.GetDetails();
			t.displayLabel();
			System.out.println(t.getExpDate());
			System.out.println(t.getPrice());
		}
		
	}

}
