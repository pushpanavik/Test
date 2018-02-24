package com.bridgeit.Algorithm;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class BinarySearch {

	public static void main(String args[])
	{
		int number;
		int found=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number ");
		number=scanner.nextInt();
		int powerof=(int)Math.sqrt(number);
		System.out.println("root of a number is:" +powerof);
		
		
		for(int i=0;i<number;i++)
		{
			System.out.print(i+ " ");
		}
		System.out.println("Enter your choice");
		System.out.println("1.Enter the  number is between 1-30");
		return true;
		switch(ch)
		{
		case1 :
		}
		
		int last=number-1;
		
		Utility utility=new Utility();
		utility.binarysearch(searchkey, found, a, number,last);
	}
	public int insertionsort(String string[])
	{
		int i,j;
		String key=string[i];
	j=i+1;;
		for(i=0;i<string.length;i++)
		{
			if(string[i].compareTo(string[j]))
			{
				
				
			}
		}
		return j;
	}

}