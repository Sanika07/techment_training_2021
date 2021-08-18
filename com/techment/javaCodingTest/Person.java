package javaCodingTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PersonDetailsException extends Exception
{
	public PersonDetailsException(String msg)
	{
		super(msg);
	}
}

class PersonDetails
{
	int id, age;
	String name;

	void PersonDetailsCheck(int id, String name, int age) throws PersonDetailsException
	{
		if(id==0)
			throw new PersonDetailsException("Person ID can't be null.");
		else if(age<=15)
			throw new PersonDetailsException("Age must be greater than 15");
		else if(name.length()<3)
			throw new PersonDetailsException("Name of person can't be less than 3 characters");
		else
			System.out.println("Person Details are: "+ "\n" + "Person ID: " + id + "\n" + "Person Name: " + name + "\n" + "Person Age: " + age);
	}
}

public class Person {
	
	public static void main(String[] args) {
		int id1, age1;
		String name1;
Scanner input = new Scanner(System.in);
System.out.println("Enter the Person Details: ");
id1 = input.nextInt();
name1 = input.next();
age1 = input.nextInt();


		PersonDetails person = new PersonDetails();
		try {
			person.PersonDetailsCheck(id1, name1, age1);
		} catch (PersonDetailsException e) {
			System.out.println(e.getMessage());
		}

	}

}
