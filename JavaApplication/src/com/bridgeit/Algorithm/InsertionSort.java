package com.bridgeit.Algorithm;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	
		System.out.println("Enter the number of String in the array");
		int number=scanner.nextInt();
		String[] str=new String[number];
		System.out.println("Enter the String");
		for(int i=0;i<str.length;i++)
		{	
			str[i]=scanner.next();
		}
		Utility utility=new Utility();
		utility.Insertionsort(str);
	}
}
