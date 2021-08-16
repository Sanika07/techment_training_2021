package com.techment.model;
public class Passenger {

	private String Name;
	private int Age;
	private String Gender;
	public Passenger(String name, int age, String gender) {
		super();
		Name = name;
		Age = age;
		Gender = gender;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	@Override
	public String toString() {
		return "Name :" + Name + "   Age:" + Age + "   Gender :" + Gender + "     Fare:";
	}
	
}