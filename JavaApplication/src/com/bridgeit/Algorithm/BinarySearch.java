package com.bridgeit.Algorithm;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class BinarySearch {

	public static void main(String args[])
	{
		int number;
		int found=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		number=scanner.nextInt();
		int powerof=(int)Math.pow(2, number);
		System.out.println(powerof);
		int a[]=new int[powerof];
		for(int i=0;i<a.length;i++)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("Enter the number you want to search");
		int searchkey=scanner.nextInt();
		Utility utility=new Utility();
		utility.binarysearch(searchkey, found, a, number);
	}
	
}
