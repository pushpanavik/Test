package com.bridgeit.Functional;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		Utility utility = new Utility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the year to check if it is leap year or not");
		year= scanner.nextInt();
		
		boolean found =utility.leap(year);
		if(found==true)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not leap year");
		}
}
}