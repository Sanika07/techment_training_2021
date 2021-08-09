package com.techment.day4.Encapsulation;


		class Employee{
			
		private	int id;
			private String name;
			

		       public int getId()  {
		    	   	return id;
		       }
		       public void setId(int id) {
		    	   	this.id = id;
		       }
		       public void setName(String name) {
		    	   this.name =name;
		       }
		       public String getName() {
		    	   return name;
		       }
		}
		public class Encapdemo {

			public static void main(String[] args) {
				
				Employee emp = new Employee();
				emp.setId(1);
				emp.setName("john");
				
				 System.out.println(emp.getId());
				 System.out.println(emp.getName());
			}
	}

