package CodingPracticeTest01;


class Employee
{
	private String firstName;
    private String lastName;

	public Employee() {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

  void Validation(String FName, String Lname) throws NullPointerException
  {
	/*  int tmp1 = firstName.length();
	  int tmp2 = lastName.length();*/
		  if (firstName==null && lastName==null)
			  throw new NullPointerException("Entry Missing");
	/*		try {
					if(tmp1<3  &&  tmp2<3)
						
			} catch (Exception e) {
				
			}*/
	  System.out.println("The name entered is:" + firstName + " " + lastName);
		
}
}

public class Employ {

	public static void main(String[] args) {
	
Employee emp = new Employee();
		emp.Validation("josh", "smith");
     
	}

}
