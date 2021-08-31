package com.techment.StreamAssignment;

//import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private int phoneNumber;
//	private String hireDate;
	private String designation;
	private double salary;
	private int managerId;
	Department department;
	
	public Employee(int employeeId, String firstName, String lastName,
			String email, int phoneNumber,String designation, double salary, int managerId,
			Department department) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	//	this.hireDate = hireDate;
		this.designation = designation;
		this.salary = salary;
		this.managerId = managerId;
		this.department = department;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// getters and setters
	
	 public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/*public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}*/

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}



	 public static void main(String args[])
	 {
			ArrayList<Employee1> employees = new ArrayList<Employee1>();
			employees.add(new Employee1(1, "nishita","kumari ","12gmail","2222","software developer","it developer", 20000, 22));
			employees.add(new Employee1(2, "arvind","kumar ","22gmail","25552","jr software developer","it developer", 25000, 22));
			employees.add(new Employee1(3, "kumar","ram ","24gmail","4444","hr","hr dept", 20000, 50));
			employees.add(new Employee1(5, "john","smith ","85gmail","9878","sr software developer","it developer", 40000, 44));
			employees.add(new Employee1(6, "sam","nag ","s65gmail","7796","hr","hr dept000", 35000, 50));
			
			ArrayList<Department> department = new ArrayList<Department>();
			department.add(new Department(1,"Hr Department",20));
			department.add(new Department(2,"Front end",25));
			department.add(new Department(3,"Back end",30));
			department.add(new Department(4,"consultancy",35));
			
		 Employee emp = new Employee();
		 
		System.out.println();

	 }
		void EmployeeDetails(ArrayList<Employee1> employees)
		{
			// sum of all salary of employees
			double total = (double) employees.stream().collect(
					Collectors.summingDouble(Employee1::getSalary));
			System.out.println("Total Employees Salary : " + total);

			//List out department names and count of employees in each department. 
			/*employees.stream()
			.map(e -> e.getDepartment().getDepartmentName())
			.distinct()
			.forEach(System.out::println);*/
		//return total;

		        }



}








