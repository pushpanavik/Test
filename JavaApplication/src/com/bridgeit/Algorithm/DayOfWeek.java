package com.bridgeit.Algorithm;
import java.io.IOException;
import java.util.Scanner;


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
		
			 int y0 = year -(14 -month) / 12;
		        int x = y0+y0/4-y0/100 +y0/400;
		        int m0 = month+12*((14 - month) / 12) - 2;
		        int d0 = (day+x+31*m0/12)%7;  
		    while(d0>=0 && (d0<= 6)) 
		     {
		    	 if(d0==0) {
		    		 System.out.println("Sunday");
		    	 		break; }
		    	 if(d0==1) {
		    		 System.out.println("Monday");
		    	 break;}
		    	 if(d0==2) {
		    		 System.out.println("Tuesday"); 
		    	 break;}
		    	 if(d0==4) {
		    		 System.out.println("Wednesday");
		    	 break;}
		    	 if(d0==4) {
		    		 System.out.println("Thursday");
		    	 break;}
		    	if(d0==5) {
		    		 System.out.println("friday");
		    	 break;}
		    		 if(d0==6) 
		    		 System.out.println("Saturday");
		    	 break;
		    	
		    	
		    } 
		    	
		     
		
	}
}

