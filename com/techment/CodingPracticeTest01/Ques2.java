package CodingPracticeTest01;

class Employees
{
	String firstName;
	String lastName;
	public Employees(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
}


public class Ques2 {

	public static void main(String[] args) {
	
			Employees emp = new Employees("matt", "roger");
			System.out.println(emp);
			System.out.println(emp.toString());
	}

}
