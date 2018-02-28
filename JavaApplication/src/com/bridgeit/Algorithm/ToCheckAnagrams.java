package com.bridgeit.Algorithm;

import java.util.Arrays;
import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class ToCheckAnagrams {

	private static boolean status;

	public static void main(String args[])
	{
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the first string:=");
		String	firstString=scanner.nextLine();
		System.out.println("enter the second string:=");
		String secondString=scanner.nextLine();
		Utility utility=new Utility();
		utility.isAnagram(firstString, secondString);
		
	}
			
	
		
	
}
