package com.bridgeit.Algorithm;
import java.io.IOException;
import java.util.Scanner;

import com.bridegit.Utility.Utility;


public class DayOfWeek {
		

	public static void main(String[] args) throws IOException {
				
		Scanner scanner=new Scanner(System.in);
	
			System.out.println("Enter the month");
			int month=scanner.nextInt();
			if (month < 1 || month > 12) {
		           System.out.println("Months are between 1 and 12");
		           
			}
			
			System.out.println("Enter the day ");
			int  day=scanner.nextInt();
			if (day< 1 || day > 31) {
	            System.out.println("Days are between 1 and 31");
	           
	         }
			
			System.out.println("Enter the year ");
			int year=scanner.nextInt();
			if (year < -10000 || year > 10000) {
	            System.out.println("Years are between -10000 and 10000");
	           
			}
			Utility u=new Utility();
		int var=u.dayOfWeek(year, month, day);
			while(var>=0 && (var<= 6)) 
			{
				if(var==0) {
			 System.out.println("Sunday");
		 		break; }
				if(var==1) {
			 System.out.println("Monday");
			 break;}
				if(var==2) {
			 System.out.println("Tuesday"); 
			 break;}
				if(var==4) {
			 System.out.println("Wednesday");
			 break;}
				if(var==4) {
			System.out.println("Thursday");
			break;}
				if(var==5) {
			 System.out.println("friday");
			 break;}
			 if(var==6) {
			 System.out.println("Saturday");
			 break;}
			}	
		     
		
	}
}

