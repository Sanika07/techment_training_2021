package javaCodingTest;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class WWE
{
	private String firstName;
	private String lastName;
	private int weight;
	
	public WWE(String firstName, String lastName, int weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
	}

	public WWE() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "WWE [firstName=" + firstName + ", lastName=" + lastName + ", weight=" + weight + "]";
	}
	
}
public class WWEWrestlerImplementation {

	public static void main(String[] args) {
		ArrayList<WWE> wrestler = new ArrayList<WWE>();
		wrestler.add(new WWE("John","legend",148));
		wrestler.add(new WWE("mike", "cena", 284));
		wrestler.add(new WWE("Joe","legend",248));
		wrestler.add(new WWE("laree", "cena", 184));
		
		WWE w = new WWE();
		WWEWrestlerImplementation wImplementation = new WWEWrestlerImplementation();
		
		//counts the total no. of wrestlers
		System.out.println("Total no. of wrestlers: " + wrestler.size());  
		
		//)sum of all weight of all wrestlers whose weight is above 200
		int sum = wrestler.stream().filter(o -> o.getWeight() > 200).mapToInt(o -> o.getWeight()).sum();
		System.out.println("Weight of wrestlers: " + sum);
		
		//printing minimum weight 
		System.out.println("minimum weight: "+wImplementation.minWeight(wrestler));
		
		
		//printing the first name of all wrestlers
		System.out.println("The First Name of all wrestlers is: ");
		for (WWE wwe: wrestler) {
		    System.out.println(wwe.getFirstName());
		}
	}
	 //method to display minimum weight
	int minWeight(ArrayList<WWE> wwe)
	{
		int minw = wwe.stream().collect(Collectors.summarizingInt(WWE::getWeight)).getMin();
		return minw;
	}

}


