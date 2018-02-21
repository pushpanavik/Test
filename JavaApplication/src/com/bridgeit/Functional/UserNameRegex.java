package com.bridgeit.Functional;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class UserNameRegex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter your name:");
		String name = scanner.next();
		String msg="Hello <<username>>, How are you?";
		
		Utility.regex();

	}

}
