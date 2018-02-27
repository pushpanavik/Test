package com.bridgeit.Functional;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class PowerOf {
public static void main(String args[]) {
	int n;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the Power value of N");
	n=scanner.nextInt();
	Utility utility =new Utility();
	utility.power(n);
			
}
}
