package com.bridgeit.Algorithm;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class InsertionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter how many numbers to be sorted:");
		int  n=scanner.nextInt();
		String str[]=new String[n];
       
        String temp=null;
		System.out.println("Enter value for "+n+ " numbers:");
				for(int i=0;i<n;i++)       
				{
					str[i]=scanner.nextLine();		//taking input from user
				}
				Utility utility=new Utility();
				utility.insertionString(n, str, temp);
						
	}

}
