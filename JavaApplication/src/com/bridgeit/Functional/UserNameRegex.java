package com.bridgeit.Functional;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridegit.Utility.Utility;

/**
 * Purpose: To print User Input and Replace String Template “Hello <<UserName>>, How are you?” with  
 * @author Pushpakumari_Navik
 *
 */
public class UserNameRegex {
/*
 * take username as input and replace it with the <<username>>.
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter your name:");
		String regex = scanner.next();
		String msg="<<username>>";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(msg);
	Utility utility=new Utility();
	utility.regex(msg, regex);
	}

}
