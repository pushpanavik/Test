/***************************************************************************************
 * Purpose:
 
 *@author  Pushpakumari_Navik
 *@version 1.0
 *@since   05-03-2018
****************************************************************************************/
package com.bridgeit.DataStructurePrograms;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

/**
 * Purpose: To take input year and month from user and display  2D Calendar in the array.
 * @author Pushpakumari_Navik
 *@version 1.0
 *@since: 08-03-2018
 */
public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u=new Utility();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the month");
		int month=scanner.nextInt();
		System.out.println("Enter the year ");
		int year=scanner.nextInt();
		
		System.out.println("month\t"+month+ " "+"year\t"+year+ " ");
		
		String []mon=new String[] {"","January","February","March","April","May","June","July","August","September","October","November","December"};
		int [] dayofmonth=new int[] {0,31,28,31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int d=u.day(month, 1, year);
		
		boolean leap= u.leap(year);
		if(month==2 && leap==true) dayofmonth[month]=29;
		
		System.out.println(" " + dayofmonth[month] + "\t " + year);
		System.out.println();
		
		String daysOfWeek[]=new String [] {"Sun","Mon","Tue","Wed","Thur","Fri","Sat"};
		for(int i=0;i<=6;i++) {
			for(int j=0;j<=6;j++)
			if(i==0 && j==0)
			{
				System.out.print("Sun\t");
			}
			else if(i==0 && j==1)
			{
				System.out.print("Mon\t");
			}
			else if(i==0 && j==2 )
			{
			
				System.out.print("Tue\t");
			}
			else if(i==0 && j==3)
			{
				System.out.print("Wed\t");
			}
			else if(i==0 && j==4)
			{
			
				System.out.print("Thu\t");
			}
			else if(i==0 && j==5)
			{
				System.out.print("Fri\t");
			}
			else if(i==0 && j==6)
			{
				System.out.print("Sat\t");
			}
		}
		 System.out.println();
		       for (int i = 0; i <d; i++)
		          System.out.print("        ");
		        for (int i = 1; i<= dayofmonth[month]; i++) {
		        	
		           System.out.printf( "%2d\t",i);
		            if (((i+d)%7 == 0)||(i==dayofmonth[month]))
		            	{
		            	System.out.println();
		            	}
		        }
		 
	    }
			
	
}

