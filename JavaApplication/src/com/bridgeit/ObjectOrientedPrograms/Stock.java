package com.bridgeit.ObjectOrientedPrograms;

import java.io.IOException;

import com.bridegit.Utility.Utility;

public class Stock {
	
	public static void main(String [] args) throws IOException
	{
		Utility util=new Utility();
		System.out.println("1. Create User");
		System.out.println("2. Buy Shares");
		System.out.println("3.Sell shares");
		System.out.println("4.Display");
		System.out.println("Enter Choice");
		int ch=util.inputInteger();
		
		switch(ch)
		{
		case 1: util.createUser();
		case 2: System.out.println("Enter the number of share you want to buy");
				int number_of_share=util.inputInteger();
		case 3: System.out.println("Enter the number of shares you want to sell");
				int sell=
				
		}
		
	}

}
