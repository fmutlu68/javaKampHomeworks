package nLayeredHomeworkECommerceSystem.entities.concretes;

import nLayeredHomeworkECommerceSystem.core.entities.Entity;

public class User implements Entity{
	private int id;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private boolean status;
	
	public User() {
		
	}
	
	public User(String email, String password, String firstName, String lastName, boolean status) {
		super();
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
