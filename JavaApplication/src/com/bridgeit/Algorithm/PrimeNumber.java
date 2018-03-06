package com.bridgeit.Algorithm;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
	int number=scanner.nextInt();
	
		Utility utility=new Utility();
		utility.primenumber(number);
		
		
	}
}
