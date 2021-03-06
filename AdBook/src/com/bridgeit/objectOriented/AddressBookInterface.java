package com.bridgeit.objectOriented;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

interface  AddressBookInterface {
	
	public void addPerson();
	public void editPersonDetail();
	public void deletePerson();
	public void sortBylastName();
	public void sortByZip();
	public void printAllEntry();
	public void printEntry();
	public  List<Person> list();
	public void adressBookOperation(ArrayList<Person> list) throws IOException;
	
	
}