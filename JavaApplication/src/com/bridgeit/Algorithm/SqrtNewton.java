package com.bridgeit.Algorithm;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class SqrtNewton {

	public static void main(String[] args) {
		Utility Utility=new Utility();
		
		double c;
		double epsilon=1e-15;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the non-negative number");
		c=scanner.nextDouble();
		Utility.sqrtNewton( c, epsilon);
		
		

	}

}
