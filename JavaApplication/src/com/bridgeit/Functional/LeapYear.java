
package com.bridgeit.Functional;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

/**
 * Purpose: To Check Whether the given Year is Leap Year or Not.
 * @author Pushpakumari_Navik
 *@version 1.0
 *@since 20-08-2018
 */
public class LeapYear {
/*
 * to take year as input from the user and determine whether it is leap year or not.
 */
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