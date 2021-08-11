package CodingPracticeTest01;

class Animal {
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Cat extends Animal {
	  public void animalSound() {
	    System.out.println("The cat says: meow meow");
	  }
	}

	class Dog extends Animal {
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }
	}
public class AnimalPoly {

	public static void main(String[] args) {
		
		   Animal myAnimal = new Animal();  // Create a Animal object
		    Animal mycat = new Cat();  // Create a cat object
		    Animal myDog = new Dog();  // Create a Dog object
		    myAnimal.animalSound();
		    mycat.animalSound();
		    myDog.animalSound();
	}

}
