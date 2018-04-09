package com.bridgeit.objectOreinted;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import com.bridgeit.utility.Utility;

public class AddressBookMain implements AddressBookInterface{
		
		
		Utility util=new Utility();
		ArrayList<Person> al=new ArrayList<>();
	
	
	@Override
	public void addPerson() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the first name");
		String firstName=util.inputString();
		System.out.println("Enter the last name");
		String lastName=util.inputString();
		System.out.println("Enter your Phone number");
		long phoneNumber=util.longInput();
		Person person=new Person(firstName,lastName);
		System.out.println("Enter the state");
		String state= util.inputString();
		System.out.println("Enter the city");
		String city=util.inputString();
		System.out.println("Enter the zip");
		String zip=util.inputString();
		Address add=new Address();
		add.setCity(city);
		add.setState(state);
		add.setZip(zip);
		person.setAddress(add);
		al.add(person);	
	}
	
	@Override
	public void editPersonDetail()
	{
		System.out.println("Enter your firstName ");
		String firstName=util.inputString();
		System.out.println("Enter your lastName");
		String lastName=util.inputString();
		if(firstName.equals(firstName) && (lastName.equals(lastName)))
		{
		
		System.out.println("1.State");
		System.out.println("2.City");
		System.out.println("3.Phone Number");
		System.out.println("4.zip");
		System.out.println("select what you want to update");
		try {
			int  choice=util.inputInteger();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Enter the state");
		String state= util.inputString();
		System.out.println("Enter your Phone number");
		long phoneNumber=util.longInput();
		System.out.println("Enter the city");
		String city=util.inputString();
		System.out.println("Enter the zip");
		String zip=util.inputString();
	}
		
		else
		{
			System.out.println("firstname and lastname doesn't matched with existing record ");
		}
		Iterator<Person> iter=al.listIterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}

	@Override
	public void deletePerson() {
		// TODO Auto-generated method stub
		System.out.println("Enter your first name");
		String firstName=util.inputString();
		System.out.println("Enter your last name");
		String lastName=util.inputString();
		boolean check=false;
		if(firstName.equals(firstName)&& lastName.equals(lastName))
		{
			check=true;
			System.out.println("Address Book deleted Successfully");
		}
		else
		{
			 if(check==false)
			 {
				 System.out.println("Person does not exist in Address book");
			 }
		}		
	}

	@Override
	public void sortBylastName() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void sortByZip() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printEntry() {
		// TODO Auto-generated method stub
		
	}
				
	

	
	}
	

