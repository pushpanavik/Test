package com.bridgeit.Functional;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class Euclidean {
	public static void main(String args[])
	{
		int x,x1,y,y1;;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the x coordinate point");
		x=scanner.nextInt();
		System.out.println("Enter the x1 coordinate point");
		x1=scanner.nextInt();
		
		System.out.println("Enter the y coordinate point");
		y=scanner.nextInt();
		System.out.println("Enter the y1 coordinate point");
		y1=scanner.nextInt();
		
		
		Utility utility=new Utility();
		int var=utility.euclidean(x, x1, y, y1);
		System.out.println(var);
		
	}
}
