package com.bridgeit.Functional;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Temperatrure(in fahrenheit:=");
		double t=scanner.nextInt();
		System.out.println("Enter the speed(in miles per hour:=");
		double v=scanner.nextInt();
		Utility utility=new Utility();
		int weather=utility.weathercast(t, v);
		
	}

}
