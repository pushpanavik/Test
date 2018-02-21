package com.bridgeit.Functional;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class Distance {
	public static void main(String args[])
	{
		int x,x1,y,y1;;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the x coordinate point");
		x=scanner.nextInt();
		
		System.out.println("Enter the y coordinate point");
		y=scanner.nextInt();
		
		
		Utility utility=new Utility();
		utility.distance(x, y);
		
		
	}
}
