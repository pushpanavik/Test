package com.bridgeit.Algorithm;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.text.Utilities;

import com.bridegit.Utility.Utility;

public class DayOfWeek {
		

	public static void main(String[] args) throws IOException {
				
		Scanner scanner=new Scanner(System.in);
		
		/*while(true)
		{*/
			System.out.println("Enter the month");
			int month=scanner.nextInt();
			/*if (month < 1 || month > 12) {
		           System.out.println("Months are between 1 and 12");
		           continue;
			}*/
			
			System.out.println("Enter the day ");
			int  day=scanner.nextInt();
			/*if (day< 1 || day > 31) {
	            System.out.println("Days are between 1 and 31");
	            continue;
	         }*/
			
			System.out.println("Enter the year ");
			int year=scanner.nextInt();
			/*if (year < -10000 || year > 10000) {
	            System.out.println("Years are between -10000 and 10000");
	            continue;
			}*/

			 int y0 = year -(14 -month) / 12;
		        int x = y0+y0/4-y0/100 +y0/400;
		        int m0 = month+12*((14 - month) / 12) - 2;
		        int d0 = (day+x+31*m0/12)%7;  
		       boolean c = 0 <= d0 && d0 <= 6;

		          if (c) {
		            String b = "Sunday";
		          } else {
		            if (c) {
		              String b = "Monday";
		            } else {
		              if (c) {
		                String b = "Tuesday";
		            } else {
		              if (c) {
		                String b = "Wednesday";
		              } else {
		                if (c) {
		                  String b = "Thursday";
		                } else {
		                  if (c) {
		                    String b = "Friday";
		                  } else {
		                    if (c) {
		                      String b = "Saturday";
		                     
		                    }                 
		                   }
		                  }
		               }
		             }
		             }
		          } 
		          System.out.println("The day of the week is " + b);
		       }
		    //}


	}	
	}


