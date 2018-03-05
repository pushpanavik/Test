/***************************************************************************************
 * Purpose:To prints the Euclidean distance from the point (x, y) to the origin (0, 0). .
 
 *@author  Pushpakumari_Navik
 *@version 1.0
 *@since   05-03-2018
****************************************************************************************/
package com.bridgeit.DataStructurePrograms;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the month");
		int month=scanner.nextInt();
		
		System.out.println("Enter the year ");
		int year=scanner.nextInt();
		System.out.println("month"+month+ " "+"year"+year+ " ");
		 Utility u=new Utility();
			boolean leap= u.leap(year);
		if(month==2 && leap==true) days[month]=29;
		String []mon=new String[] {"","January","February","March","April","May","June","July","August","September","October","November","December"};
		int [] dayofmonth=new int[] {0,31,29,31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
				
		
			 int days=u.dayOfWeek(year, month,day);
			 
			 int d = day(month, 1, year);

		        // print the calendar
		        for (int i = 0; i < d; i++)
		           System.out.println("   ");
		        for (int i = 1; i <= days[month]; i++) {
		           System.out.println("%2d ", i);
		            if (((i + d) % 7 == 0) || (i == days[month])) System.out.println();
		        }
			
	}

}
