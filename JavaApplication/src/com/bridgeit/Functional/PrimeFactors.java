package com.bridgeit.Functional;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class PrimeFactors {
	public static void main(String args[])
	{
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number to find prime factors");
		n=scanner.nextInt();
		Utility utility=new Utility();
		utility.primefactors(n);
	}

}
