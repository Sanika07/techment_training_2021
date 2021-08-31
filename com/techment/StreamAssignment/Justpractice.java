package com.techment.StreamAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee1 {
	int employeeId;
	String firstname;
	String lastname;
	String email;
	String phoneNumber;
	String designation;
	String dept;
	double salary;
	int managerId;
	Department department;
	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @return the managerId
	 */
	public int getManagerId() {
		return managerId;
	}
	/**
	 * @param managerId the managerId to set
	 */
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}
	/**
	 * @param employeeId
	 * @param firstname
	 * @param lastname
	 * @param email
	 * @param phoneNumber
	 * @param designation
	 * @param dept
	 * @param salary
	 * @param managerId
	 */
	public Employee1(int employeeId, String firstname, String lastname, String email, String phoneNumber,
			String designation, String dept, double salary, int managerId) {
		super();
		this.employeeId = employeeId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.designation = designation;
		this.dept = dept;
		this.salary = salary;
		this.managerId = managerId;
		this.department = department;
	}
	//public Employee1(int i, String string, String string2, String string3, String string4, String string5,
		//	String string6, int j, int k) {
		// TODO Auto-generated constructor stub
	//}
	@Override
	public String toString() {
		return "Employee1 [employeeId=" + employeeId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", designation=" + designation + ", dept="
				+ dept + ", salary=" + salary + ", managerId=" + managerId + ", department=" + department
				+ ", getEmployeeId()=" + getEmployeeId() + ", getFirstname()=" + getFirstname() + ", getLastname()="
				+ getLastname() + ", getEmail()=" + getEmail() + ", getPhoneNumber()=" + getPhoneNumber()
				+ ", getDesignation()=" + getDesignation() + ", getDept()=" + getDept() + ", getSalary()=" + getSalary()
				+ ", getManagerId()=" + getManagerId() + ", getDepartment()=" + getDepartment() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}

class Department
{
	int departmentId;
	String departmentName;
	int managerId;
	/**
	 * @return the departmentId
	 */
	public int getDepartmentId() {
		return departmentId;
	}
	/**
	 * @param departmentId the departmentId to set
	 */
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}
	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	/**
	 * @return the managerId
	 */
	public int getManagerId() {
		return managerId;
	}
	/**
	 * @param managerId the managerId to set
	 */
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	/**
	 * @param departmentId
	 * @param departmentName
	 * @param managerId
	 */
	public Department(int departmentId, String departmentName, int managerId) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.managerId = managerId;
	}
	
	
}

public class Justpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee1> employees = new ArrayList<Employee1>();
	//	employees.add(10, "Ankit","prasad","ka0636114@email","7033380647","Software Developer","Application Development", 250000.0,51);
		employees.add(new Employee1(1, "nishita","kumari ","12gmail","2222","software developer","it developer", 20000, 22));
		employees.add(new Employee1(2, "arvind","kumar ","22gmail","25552","jr software developer","it developer", 25000, 22));
		employees.add(new Employee1(3, "kumar","ram ","24gmail","4444","hr","hr dept", 20000, 50));
		employees.add(new Employee1(5, "john","smith ","85gmail","9878","sr software developer","it developer", 40000, 44));
		employees.add(new Employee1(6, "sam","nag ","s65gmail","7796","hr","hr dept000", 35000, 50));
		System.out.println("list of employees :"+employees);
		
		ArrayList<Department> department = new ArrayList<Department>();
		department.add(new Department(1,"Hr Department",20));
		department.add(new Department(2,"Front end",25));
		department.add(new Department(3,"Back end",30));
		department.add(new Department(4,"consultancy",35));
		
		
		Justpractice assignment = new Justpractice();
		//assignment.sumSalaryEmp(employees);
		System.out.println(assignment.sumSalaryEmp(employees));
	
		System.out.println(assignment.noOfEmp(employees));
		System.out.println(assignment.deptName(department));
	}
	
	
	double sumSalaryEmp(ArrayList<Employee1> employees)
	{
		double sumSalary = employees.stream().collect(Collectors.summarizingDouble(Employee1::getSalary)).getSum();
		return sumSalary;
		
	}
	ArrayList<Department> deptName(ArrayList<Department> department)
	{
	 department.stream().map(Department::getDepartmentName).distinct().forEach(System.out::println);
	 return department;
	}

	Map<String, Long> noOfEmp(ArrayList<Employee1> employees)
	{
		Map<String, Long> noemp = employees.stream().collect(Collectors.groupingBy(Employee1::getDept,Collectors.counting()));
		return noemp;
	}

} 







