package com.restservices.Hello;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class UserDetails {
	
	
	
	private String firstName;
	
	private String lastName;
	
	private String city;

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "UserDetails [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + "]";
	}

	public UserDetails(String firstName, String lastName, String city) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
	}

	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	
	
	

}
