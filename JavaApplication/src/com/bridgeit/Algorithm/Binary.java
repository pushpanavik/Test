package com.bridgeit.Algorithm;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number\t ");
		int number=scanner.nextInt();
		
		String c=Integer.toBinaryString(number);
		System.out.println("decimal to binary conversion of giver number=" +" " +c);
		
				
			

	}

}
