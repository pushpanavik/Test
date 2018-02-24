package com.bridgeit.Algorithm;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Principal Amount\t");
		double principalamount=scanner.nextDouble();
		System.out.println("Enter the rate of interest\t");
		double rateofinterest=scanner.nextDouble();
		System.out.println("Enter the number of years");
		double years=scanner.nextDouble();
		Utility utility=new Utility();
		utility.monthlyPayment(rateofinterest, years, principalamount);
	}

}
