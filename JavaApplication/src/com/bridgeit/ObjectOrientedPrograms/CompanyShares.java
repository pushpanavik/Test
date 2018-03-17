package com.bridgeit.ObjectOrientedPrograms;


import java.text.DateFormat;
import java.util.Date;
import java.util.LinkedList;


import com.bridegit.Utility.Utility;

/**
 *
 * @author PUSHPA
 */
public class CompanyShares {
	
	public static void main(String[] args) {

		LinkedList list=new LinkedList();
		
		Utility utility = new Utility();
		System.out.println();
		System.out.println("********* Company Shares ********");
		while(true)
		{
			System.out.println();
			System.out.println("1. add the shares");
			System.out.println("2. remove the shares");
			System.out.println("3. Display the shares");
			System.out.println("4. total shares");
			
			System.out.println("5. Exit");
			int choice = utility.inputInteger();          
			switch (choice)
			{
			case 1 : 
				System.out.println("Enter element to insert");
				list.add(utility.inputInteger());
				list.add(DateFormat.getDateTimeInstance().format(new Date(0)));
				break;      

			case 2 : 
				System.out.println("Enter position");
				int position =utility.inputInteger();
				list.delete(position);
				System.out.println("remove successfuly");
				break;
				
			case 3:
				System.out.print("Shares are: ");
				list.printList();
			
				break;                  
			case 4 : 
				System.out.println("Size = "+ list.size() +" \n");
				break;   
			case 5: System.exit(0);
			default : 
				System.out.println("Wrong Entry \n ");
				break;   
			}

		}              
	}

}