package com.bridgeit.objectOriented;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import com.bridgeit.Utility.Utility;

public class AddressBookImpl implements AddressBookInterface{
	static String firstName;
	static String lastName;
	static Person person;
	private static List<Person> listOfPerson=new ArrayList<Person>();
	
	
	static boolean flag=false;
	
	static Address add;
	public void adressBookOperation(ArrayList<Person> list) throws IOException 
	{
		listOfPerson=list;
		System.out.println(listOfPerson);
		AddressBookInterface addressbookdetail=new AddressBookImpl();
		
		Utility u=new Utility();
		int choice;
		while (true)
		{		
		System.out.println("1.Add New Person:");
		System.out.println("2.Edit Information of Person:");
		System.out.println("3.Delete the Person:");
		System.out.println("4.Sort by Last Name");
		System.out.println("5.Sort by zip");
		System.out.println("6.Display Address Book");
		System.out.println("7.exit");
		System.out.println("Select option");
		choice=Utility.inputInteger();
			
			switch(choice)
		{
		case 1:
			
			addressbookdetail.addPerson();
			break;
			
		case 2:
			addressbookdetail.editPersonDetail();
			break;
			
		case 3:
			addressbookdetail.deletePerson();
			break;
			
		case 4:
			addressbookdetail.sortBylastName();
			break;
			
		case 5:
			addressbookdetail.sortByZip();
			break;
			
		case 6:
			addressbookdetail.printAllEntry();
			break;
			
		case 7:
					
			return;
		}
	}
	}
@Override
public void addPerson() {
	try {
				
		System.out.println("Enter the first name");
		firstName=Utility.inputString();
		
		System.out.println("Enter the last name");
		lastName=Utility.inputString();
		System.out.println("Enter your Phone number");
		long phoneNumber=Utility.longInput();
		
		person=new Person(firstName,lastName);
		person.setPhoneNumber(phoneNumber);
		System.out.println("Enter the state");
		String state= Utility.inputString();
		System.out.println("Enter the city");
		String city=Utility.inputString();
		System.out.println("Enter the zip");
		String zip=Utility.inputString();
		
		add=new Address(state,zip,city);
	
		person.setAddress(add);
		listOfPerson.add(person);	
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	//System.out.println(addentries);
}
@Override
public void editPersonDetail()
{
		
		System.out.println("Enter your firstName ");
		firstName=Utility.inputString();
		System.out.println("Enter your lastName");
		lastName=Utility.inputString();
		System.out.print(listOfPerson);
		for(int i=0;i<listOfPerson.size();i++)
		{
			Person oneperson=listOfPerson.get(i);
			
		
			if(oneperson.getFirstName().equals(firstName) && (oneperson.getLastName().equals(lastName)))
			{
				Address editaddress=oneperson.getAddress();
				System.out.println("1.State");
				System.out.println("2.City");
				System.out.println("3.Phone Number");
				System.out.println("4.zip");
				System.out.println("5.exit");
				System.out.println("select what you want to update");
				try {
					int choice=Utility.inputInteger();
					switch(choice)
					{
					case 1: System.out.println("Enter the state");
					String state= Utility.inputString();
					break;
					case 3:System.out.println("Enter your Phone number");
					long phoneNumber=Utility.longInput();
					break;
					case 2:System.out.println("Enter the city");
					String city=Utility.inputString();
					break;
					case 4:System.out.println("Enter the zip");
					String zip=Utility.inputString();
					break;
					default:
						oneperson.setAddress(editaddress);
						listOfPerson.set(i, oneperson);
						flag=false;
						
					}
				}catch (IOException e) {
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
	firstName=Utility.inputString();
	System.out.println("Enter your last name");
	lastName=Utility.inputString();
	boolean check=false;
	for(int i=0;i<listOfPerson.size();i++)
	{
		Person oneperson=listOfPerson.get(i);
		//System.out.println(addentries);
	System.out.println(oneperson);
	if(oneperson.getFirstName().equals(firstName)&& oneperson.getLastName().equals(lastName))
	{
		listOfPerson.remove(i);
		System.out.println("Address Book deleted Successfully");
		check=true;
		break;
	}
	}
	
		
}

@Override
public void sortBylastName() {
	//System.out.println(addentries);
	// TODO Auto-generated method stub
	if(listOfPerson.isEmpty())
	{
		
		System.out.println("Address Book is empty");
	}
	else
	{
		//System.out.println(addentries);
	Collections.sort(listOfPerson,new SortByLastName());
	System.out.println(listOfPerson);
	flag=true;
}
	
}

@Override
public void sortByZip() {
	// TODO Auto-generated method stub
	if(listOfPerson.isEmpty())
	{
		System.out.println("Address Book is empty");
	}
	else
	{
	Collections.sort(listOfPerson,new sortByZip());
	System.out.println(listOfPerson);
	flag=true;
	}

	
}

@Override
public void printEntry() {
	// TODO Auto-generated method stub
	
	for(Person print : listOfPerson)
	{
		System.out.println(print);
		
	}
}
@Override
public void printAllEntry() {
	// TODO Auto-generated method stub
	Iterator<Person> listIterator=listOfPerson.listIterator();
	while(listIterator.hasNext())
	{
		Person oneperson=listIterator.next();
	System.out.println(oneperson);
	}
}
public  List<Person> list()
{
		return listOfPerson;
}



	

}



