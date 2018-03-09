package com.bridgeit.DataStructurePrograms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class CashCounter {
	public static void main(String args[])
	{ 
		Scanner sc=new Scanner(System.in);
        Utility u=new Utility();
        Queue<Integer> q = new LinkedList<>();
        System.out.println("enter the number of people you want to add in the queue");
        int numberOfPeople=sc.nextInt();
        int count=0;
        int withdraw=0;
        int deposit=0;
        int initialbal=0;
        for(int i=0;i<numberOfPeople;i++)
        {
        	System.out.println("Enter the name of the Account holder");
        	String name=sc.next();
        	System.out.println("Enter the account number ");
        	int accountnumber=sc.nextInt(); 
       
        	System.out.println("Enter Initial Balance is:" );
        	initialbal=sc.nextInt();
        	System.out.println(" "+name+ "\t" +accountnumber+  "\t" +initialbal+ "\t ");
        
       
        
        //String customer[]=new String[numberOfPeople];
     
		
		while(numberOfPeople!=0)
			System.out.println();
		   	System.out.println("------------Banking Cash Counter-----------");
		   	
		   	System.out.println("1.Deposit");
		   	System.out.println("2.Withdraw");
		   	System.out.println("3. Balance Status");
		   	System.out.println("4.Number of people in the Queue");
		   	System.out.println("5. exit");
		   	System.out.println(+name+ "\t Enter your choice: ");
		   	int choice=sc.nextInt();
		   	
		   	switch (choice) 
		   	{
		   	case 1:
			   		System.out.println("Enter the amount you want to Deposit");
			   		deposit=sc.nextInt();  		 
			   		q.add(deposit);
			   		break;
			   				   	
		   	case 2:
			   		System.out.println("Enter the amount you want to Withdraw ");
			   		withdraw=sc.nextInt();
			   		break;
					
			   		
		   	case 3:	
		   			int current_balance=(initialbal+ deposit)-withdraw;
		   			System.out.println(" Your Available Balance is: " +current_balance); 
		   			count=numberOfPeople--;
			   		break;
			   		
			
		   	case 4:	
		   			System.out.println("The Number of People in Queue is: " +count);	
		   			break;
			   		
		   	default: 
			   		System.exit(0);
			   		break;
		   	}
        }
	   	}
        
	}		

