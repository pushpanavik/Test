package com.bridgeit.objectOriented;

import java.io.File;
import java.io.IOException;

import com.bridgeit.Utility.Utility;

public class AddressBookManager {
	public static void main(String args[]) throws IOException
	{
		
		AddressBookManag manag=new AddressBookManag();
		int choice;
		do {
					
		Utility u=new Utility();
		System.out.println("1. create address book");
		System.out.println("2. open address book");
		System.out.println("3. close address book");
		System.out.println("4. save ");
		System.out.println("5 Save As");
		System.out.println("6.quit");
		System.out.println("Enter your choice");
		 choice=u.inputInteger();
		switch(choice)
		{
		case 1: manag.createAddressBook();
				break;
			
		case 2: 
				manag.openAddressBook();
				break;
				
		
		case 3:manag.closeAddressBook();
				break;
				
		case 4: manag.saveAddressBook();
				break;
		case 5:manag.saveAs();
				break;
		case 6:manag.quit();
		break;
			
		
	}
	}while(choice<=6);
	}

}
