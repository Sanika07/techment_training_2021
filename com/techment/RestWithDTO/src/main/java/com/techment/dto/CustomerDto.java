package com.techment.dto;

public class CustomerDto {

		private int id;
		private String name;
		private int age;
		private String email;
		private String phone;
		
		
		
		public CustomerDto(int id, String name, int age) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
		}


		public CustomerDto(int id, String name, int age, String email, String phone) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.email = email;
			this.phone = phone;
		}
		
		
		public CustomerDto() {
			super();
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
			
}
