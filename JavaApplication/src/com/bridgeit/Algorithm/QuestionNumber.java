package com.bridgeit.Algorithm;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class QuestionNumber {

	public static void main(String args[])
	{
		int number;
		int found=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number ");
		number=scanner.nextInt();
		int a[]=new int[number];
		int powerof=(int)Math.sqrt(number);
		for(int i=0;i<number;i++)
		{
				a[i]=scanner.nextInt();
				
		}
		System.out.println();
		System.out.println("Enter yes if your number is between 1-50 Or No if your number is between 50-100");
		
	}

}