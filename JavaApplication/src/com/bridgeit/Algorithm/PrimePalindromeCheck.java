package com.bridgeit.Algorithm;


import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class PrimePalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number");
		int number=scanner.nextInt();
		System.out.println("Prime number between 0-1000");
		utility.isPrime(number);
		utility.primeAnagram();
		utility.printPrimePalindrome();
	}	
		
	}


