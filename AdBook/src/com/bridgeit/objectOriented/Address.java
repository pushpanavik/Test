package com.bridgeit.objectOriented;

public class Address {
	public String state;
	public String zip;
	public String city;

	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String state, String zip, String city) {
		super();
		this.state = state;
		this.zip = zip;
		this.city = city;
	}
	

}
