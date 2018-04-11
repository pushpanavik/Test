package com.bridgeit.Utility;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Utility {
	
	static Scanner scanner=new Scanner(System.in);
	public static int inputInteger() throws IOException{
		try{	
			return scanner.nextInt();
		}
		catch(Exception e){
			System.out.println(e.toString());	
		}
		return 0;
	}
	
	public static long longInput() 
	{
		try 
		{
			return scanner.nextLong();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		return 0;
	}

	public  double doubleInput() 
	{
		try 
		{
			return scanner.nextDouble();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		return 0.0;
	}

	public float floatInput() 
	{
		try 
		{
			return scanner.nextFloat();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		return 0.0f;
	}

	 public String inputStringLine() 
	 {
		 try 
		 {
			 return scanner.nextLine();
		 }
		 catch(Exception e) 
		 {
			 System.out.println(e.toString());
		 }
		 return null;
	 }
	 
	 public static String inputString() 
	 {
		 try 
		 {
			 return scanner.next();
		 }
		 catch(Exception e) 
		 {
			 System.out.println(e.toString());
		 }
		 return null;
	 }

		
		
		
}
