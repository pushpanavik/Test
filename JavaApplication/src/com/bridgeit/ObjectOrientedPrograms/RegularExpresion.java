package com.bridgeit.ObjectOrientedPrograms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpresion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Pattern pattern;
		Matcher matcher;
		String input="  Hello <<name>>, We have your full name as <<full name>> in our system"+" your contact number is 91-xxxxxxxxxx" + "Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2017."; 
		
		System.out.println("Enter Name");
		String username=scanner.nextLine();
		/*boolean flag;
		while(!username.matches("[a-zA-Z]"))
		{
			System.out.println("Name must contains only alphabets(a-zA-Z).please enter valid name");
			flag=false;
			
		}*/
		
		System.out.println("Enter fullName");
		String surname=scanner.nextLine();
		String fullname=surname.substring(0, surname.length());
		/*if(fullname.matches("[a-zA-Z]"))	
		{
			flag=true;
		}
		else
		{
			System.out.println("fullName must contains only alphabets(a-zA-Z).please enter valid name");
			
		}
		*/
		
		System.out.println("Enter Contact Number  ");
		String contactNo=scanner.nextLine();
		
		 pattern=Pattern.compile(input); 
		 matcher=pattern.matcher(username);
		 String Name=matcher.replaceAll("<<name>>");
		 
		 pattern=Pattern.compile(input); 
		 matcher=pattern.matcher(fullname);
		 String fullName=matcher.replaceAll("<<full name>>");
		 
		 pattern=Pattern.compile(input); 
		 matcher=pattern.matcher(contactNo);
		 String Date=matcher.replaceAll("<<91-xxxxxxxxxx>>");
		
		
		System.out.println("  Hello\t" + Name+ ",We have your full name as" +fullName+ " in our system\t" + "your contact number is "+contactNo+  "Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2017.");
		
		
		
		
		
		
		
	}

}
