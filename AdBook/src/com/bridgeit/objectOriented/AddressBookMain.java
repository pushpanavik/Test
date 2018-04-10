package com.bridgeit.objectOriented;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgeit.Utility.Utility;

public class AddressBookMain implements AddressBookInterface{
	
	
	Utility util=new Utility();
	static ArrayList<Person> al=new ArrayList<>();
	static boolean flag=false;
	

@Override
public void addPerson() {
	// TODO Auto-generated method stub
	try {
		
	
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
	Address add=new Address(state,zip,city);
	add.setCity(city);
	add.setState(state);
	add.setZip(zip);
	person.setAddress(add);
	al.add(person);	
	System.out.println("File successfully created");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

@Override
public void editPersonDetail()
{
	
	
	
		System.out.println("Enter your firstName ");
		String firstName=util.inputString();
		System.out.println("Enter your lastName");
		String lastName=util.inputString();
		for(Person traverse :al)
		{
		if(traverse.getFirstName().equals(firstName) && (traverse.getLastName().equals(lastName)))
		{
		System.out.println("1.State");
		System.out.println("2.City");
		System.out.println("3.Phone Number");
		System.out.println("4.zip");
		System.out.println("select what you want to update");
		try {
			int choice=util.inputInteger();
			switch(choice)
			{
			case 1: System.out.println("Enter the state");
					String state= util.inputString();
					break;
			case 3:System.out.println("Enter your Phone number");
					long phoneNumber=util.longInput();
					break;
			case 2:System.out.println("Enter the city");
					String city=util.inputString();
					break;
			case 4:System.out.println("Enter the zip");
					String zip=util.inputString();
					break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		else
		{
			System.out.println("firstname and lastname doesn't matched with existing record ");
		}
	}
	
		
	}
	


@Override
public void deletePerson () {
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
	if(al.isEmpty())
	{
		System.out.println("Address Book is empty");
	}
	else
	{
	Collections.sort(al,new SortByLastName());
	flag=true;
}
}

@Override
public void sortByZip() {
	// TODO Auto-generated method stub
	if(al.isEmpty())
	{
		System.out.println("Address Book is empty");
	}
	else
	{
	Collections.sort(al,new sortByZip());
	flag=true;
	}
	
}

@Override
public void printEntry() {
	// TODO Auto-generated method stub
	int count=1;
	for(Person print : al)
	{
		System.out.print("Person First Name" +print.getFirstName());
		System.out.print("Person Last Name" +print.getLastName());
		System.out.print("Person Phone Number"+print.getPhoneNumber());
		System.out.print("********Person Address**************" );
		System.out.print(" city" +print.getAddress().getCity());
		System.out.println("state"+print.getAddress().getState());
		System.out.println("zip"+print.getAddress().getZip());
		count++;
	}
	
}
			



}