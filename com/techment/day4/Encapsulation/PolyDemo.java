package com.techment.day4.Encapsulation;

	//POLYMORPHISM EXAMPLE

		//OVERLOADING
		class Hello
		{
			public void write (int num){
				System.out.println("number is:" + num);
			}
			public void write (String msg){
				System.out.println("message is:" + msg);
			}
		}

		//OVERRIDING
		class Animal {
			  public void animalSound() {
			    System.out.println("The animal makes a sound");
			  }
			}

			class Pig extends Animal {
			  public void animalSound() {
			    System.out.println("The pig says: wee wee");
			  }
			}

			class Dog extends Animal {
			  public void animalSound() {
			    System.out.println("The dog says: bow wow");
			  }
			}

		public class PolyDemo {
			
			public static void main(String[] args) {
				Hello hello = new Hello();
				hello.write(3);
				
				 Animal myAnimal = new Animal();  // Create a Animal object
				    Animal myPig = new Pig();  // Create a Pig object
				    Animal myDog = new Dog();  // Create a Dog object
				    myAnimal.animalSound();
				    myPig.animalSound();
				    myDog.animalSound();
			}
		}
