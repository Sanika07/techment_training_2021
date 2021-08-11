package CodingPracticeTest01;

class nameException extends Exception
{
	nameException(String s)
	{
		super(s);
	}
}
class Employee
{
	private String firstName;
    private String lastName;

	public Employee() {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

  static void Validation(String firstName, String lastName) throws NullPointerException
  {
		  if (firstName==null && lastName==null)
			  throw new NullPointerException("Entry Missing");	
}
  static void ValidateLength(String firstName, String lastName) throws nameException
  {
	  		if(firstName.trim().length()<3 && lastName.trim().length()<3)
	  			throw new nameException("name should be minimum 3 characters");
  }
}

public class Employ {

	public static void main(String[] args) {
	try{
		Employee emp = new Employee();
		emp.Validation("josh", "smith");
		emp.ValidateLength("joe", "tim");
	}
	catch(Exception m)
	{
		System.out.println("Exception Occured:" + m);
	}

	}

}

