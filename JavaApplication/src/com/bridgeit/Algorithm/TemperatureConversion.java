package com.bridgeit.Algorithm;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Temperature :=");
		double temperature=scanner.nextInt();
		Utility utility=new Utility();
		utility.temperatureConversion(temperature);
		
	}

}
