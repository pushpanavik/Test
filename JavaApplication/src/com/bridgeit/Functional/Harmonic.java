package com.bridgeit.Functional;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class Harmonic {
public static void main(String args[])
{
	int n;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the Harmonic value of N");
	n=scanner.nextInt();
	Utility utility=new Utility();
	utility.harmonic(n);
}
}
