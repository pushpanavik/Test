package com.bridgeit.Functional;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class Permutation {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the string");
	String input=scanner.next();
	String Permutation=" ";
	Utility utility=new Utility();
	String c=utility.permutationofstring(input, Permutation);;
}
}
