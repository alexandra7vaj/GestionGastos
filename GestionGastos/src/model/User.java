package model;

import java.util.HashMap;

public class User {
	public String name;
	public int age;
	public String userName;
	public String password;
	public String email;
	public HashMap<String, Expense> expenses;
	public boolean isValidated;
	
	
	// Constructors
	
	public User() {
		
		this.expenses = new HashMap<String, Expense>();
	}
	
	public User(String name, int age, String userName, String password, String email, HashMap<String, Expense>expenses) {
		
		this.name = name;
		this.age = age;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.expenses = new HashMap<String, Expense>();
	}
	
	//
	//Getters and setters

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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public  HashMap<String, Expense> getExpenses() {
		return expenses;
	}

	public void setExpenses(HashMap<String, Expense> expenses) {
		expenses = expenses;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", userName=" + userName + ", password=" + password + ", email="
				+ email + "]";
	}

}
