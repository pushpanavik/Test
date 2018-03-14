package com.bridgeit.DataStructurePrograms;

import java.util.LinkedList;
import java.util.Scanner;

import com.bridegit.Utility.MethodUtil;
import com.bridegit.Utility.Utility;

public class Customer {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodUtil util=new MethodUtil();
		Utility u=new Utility();
		CashCounterQueue cash=new CashCounterQueue();
		Scanner scanner=new Scanner(System.in);
		int count=0;
		int count1=count;                                                                                                         
	 int initialbal=1000;
		int  accountnumber;
		int current_bal=0;
		String name;
		System.out.println("Enter the number of people waiting in queue");
		int number=scanner.nextInt();
		for(int i=0;i<number;i++)
		{		
		/*LinkedList<String> q=new LinkedList<String>();*/
		
		System.out.println("Enter Name");
		name=util.inputString();
		cash.setName(name);		
		System.out.println("Enter Account Number");
		accountnumber=util.integerInput();
		cash.setAccountnumber(accountnumber);
		System.out.println("Enter initial balance");
		initialbal=util.integerInput();
		cash.setInitialbal(initialbal);
		
		}
		String customer[]=new String[number];
		for(int i=0;i<number;i++)
		{
			customer[i]=cash.getName();
		}
		count++;
		
		for(int i=0;i<number;i++)
		{
			int index=i;
			System.out.println(cash.getName()+ "\tplease choose from list of options ");
			while(number!=0)
			{
				System.out.println("Enter your choice");
	
				System.out.println("1. 	deposit amount\"");
				System.out.println("2.  withdraw amount");
				System.out.println("3.  check balance");
				System.out.println("4.  check the number of people in queue");
				System.out.println("5. 	exit");
				int choice=scanner.nextInt();
				switch(choice)
				{
				case 1:	System.out.println("enter amount");
						int deposit_amount=scanner.nextInt();
						current_bal=u.updateDeposit(deposit_amount, initialbal);
						break;
				case 2: System.out.println("enter amount to withdraw");
						int withdraw=scanner.nextInt();
						break;
				case 3: System.out.println("your current balance is" +current_bal);
						break;
				case 4: System.out.println("number of people in queue is"+count);
						break;
				default: System.out.println("Invalid choice ");
				}
				
				
			}


		}
	
	}
	
}
