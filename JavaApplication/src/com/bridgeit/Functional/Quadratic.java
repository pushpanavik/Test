package com.bridgeit.Functional;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
	double a,b,c;
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the value of a:=");
	a=scanner.nextDouble();
	System.out.println("Enter the value of b:=");
	b=scanner.nextDouble();
	System.out.println("Enter the value of c:=");
	c=scanner.nextDouble();
	Utility utility=new Utility();
		utility.quadratic(a, b, c);	
	
	}

}
