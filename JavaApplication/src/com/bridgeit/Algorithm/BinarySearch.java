package com.bridgeit.Algorithm;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String args[])
	{
		int number;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		number=scanner.nextInt();
		int powerof=(int)Math.pow(2, number);
		System.out.println(powerof);
		for(int i=0;i<powerof;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Enter the number you want to search");
		int searchvalue=scanner.nextInt();
	}
	
}
