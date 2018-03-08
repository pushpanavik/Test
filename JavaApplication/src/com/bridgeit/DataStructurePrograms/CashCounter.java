package com.bridgeit.DataStructurePrograms;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class CashCounter {
	public static void main(String args[])
	{ 
		Scanner sc=new Scanner(System.in);
        Utility u=new Utility();
        System.out.println("enter the size of queue");
        int queuesize=sc.nextInt();
        CashCounterQueue que=new CashCounterQueue(queuesize);
		int ch = 0;
		do
		{ 
			System.out.println();
		   	System.out.println("------------Banking Cash Counter-----------");
		   	System.out.println("1.Deposit");
		   	System.out.println("2.Withdraw");
		   	System.out.println("3. Balance Status");
		   	System.out.println("4.Number of people in the Queue");
		   	System.out.println("5. Invalid choice");
		   	System.out.println("Enter your choice: ");
		   	int choice=sc.nextInt();
		   	switch (choice) 
		   	{
		   	case 1:
			   		System.out.println("Enter the amount you want to Deposit");
			   		int  deposit=sc.nextInt();  		 
			   		que.enqueue(deposit);
			   		que.display();
			   		break;
			   	
		   	case 2:
			   		System.out.println("Enter the amount you want to Withdraw ");
			   		int withdraw=sc.nextInt();
					que.dequeue(withdraw);
					que.display();
					break;
			   		
		   	case 3:	System.out.println(" Your Available Balance is: "); 
			   		que.display();
			   		break;
			   		
			
		   	case 4:	
		   			System.out.println("The Number of People in Queue is: " +que.getSize());	
		   			break;
			   		
		   	default: 
			   		System.out.println("Invalid please try another option");
			   		break;
		   	}
	   	}
		while(ch<5);
	}		
}
