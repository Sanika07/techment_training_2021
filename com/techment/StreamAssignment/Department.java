package com.techment.StreamAssignment;

import java.util.Arrays;
import java.util.List;
//import com.techment.StreamAssignment.Employee;

public class  Department {

	private int departmentId;
	private String departmentName;
	private int managerId;
	public Department(int departmentId, String departmentName, int managerId) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.managerId = managerId;
	}
	
	//getters and setters
	
	  public int getDepartmentId() {
			return departmentId;
		}
		public void setDepartmentId(int departmentId) {
			this.departmentId = departmentId;
		}
		public String getDepartmentName() {
			return departmentName;
		}
		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}
		public int getManagerId() {
			return managerId;
		}
		public void setManagerId(int managerId) {
			this.managerId = managerId;
		}

	
	Department account = new Department(1, "Account", 75); 
	Department hr = new Department(2, "HR", 50);
    Department ops = new Department(3, "OP", 25);
    Department tech = new Department(4, "Tech", 150);          
 
   
}
