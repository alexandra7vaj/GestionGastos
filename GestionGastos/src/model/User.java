package model;

public class User {
	
	public String name;
	public int age;
	public String userName;
	public String password;
	public String email;
	public boolean isValidated;
	
	
	// Constructors
	
	public User() {
		
	}
	
	public User(String name, int age, String userName, String password, String email) {
		
		this.name = name;
		this.age = age;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	
	
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

	@Override
	public String toString() {
		return "User (name=" + name + ", age=" + age + ", userName=" + userName + ", password=" + password + ", email="
				+ email + ")";
	}


}