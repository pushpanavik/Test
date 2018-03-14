package com.bridgeit.Algorithm;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class BubbleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter how many numbers to be sorted:");
			int  number=scanner.nextInt();
			String s[]=new String[number];
	       
	        String temp=null;
			System.out.println("Enter value for "+number+ " numbers:");
					for(int i=0;i<number;i++)       
					{
						s[i]=scanner.next();		//taking input from user
					}
					
					Utility utility=new Utility();
					utility.bubbleString(number, s, temp);
	}

}
