package com.bridgeit.Algorithm;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String");
		String number=scanner.nextLine();
		String temp=number;
		Utility utility =new Utility();
		utility.palindrome(number, temp);
			}

}
