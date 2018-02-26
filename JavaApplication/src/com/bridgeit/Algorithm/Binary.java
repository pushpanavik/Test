package com.bridgeit.Algorithm;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class Binary {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number\t ");
		int number=scanner.nextInt();
		Utility utility=new Utility();
		utility.covertDecimalToBinary(number);
		}

}
