package com.bridgeit.Algorithm;

import java.util.ArrayList;
import java.util.Scanner;
import com.bridegit.Utility.Utility;


public class BankCustomer {

	public static void main(String[] args) {
		//
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter how many people you want to add in the queue");
		int number=scanner.nextInt();
		int customer[]=new int[number];
		int customerDetails[]=new int[number];
		for(int i=0;i<number;i++)
		{
			System.out.println("Enter your Account Number");
			int	Accountnumber=scanner.nextInt();
			
			System.out.println("Enter Initial Balance");
			double initialbal=scanner.nextDouble();
			
		}
		while(customer.length!=0)
		{
			for(int i=0;i<customer.length;i++)
			{	
				System.out.println(customerDetails[i] );
			}
			break;
		}
		
		 
		
		/*int deposit;
		int withdraw;
		do 
		{
			System.out.println("Enter your Choice");
			System.out.println("1.Deposit Cash");
			System.out.println("2.Withdraw Cash");
			System.out.println("3.Balance Status");
			
			int choice=scanner.nextInt();
		
		switch(choice)
		{
		case 1: 
				System.out.println("Enter the amount you want to deposit");
				deposit=scanner.nextInt();
				break;		
				
		case 2: 
				 System.out.println("Enter the amount you want to withdraw");
				withdraw=scanner.nextInt();
				break;
		case 3:
				System.out.println("Your Available Balance is");
				break;
		case 4:default: System.out.println("Invalid choice");
				
		}
	}while(choice!=5)*/


	
		
	}
}
