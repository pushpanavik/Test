package com.bridgeit.objectOreinted;

public class Person {
	private String firstName;
	private String lastName;
	private long phoneNumber;
	private Address address;
	
	public void setAddress(Address address){
		this.address=address;
	}
	public Address getAddress(){
		return address;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Person(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
}
