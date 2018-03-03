package com.bridgeit.Algorithm;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter how many numbers to be sorted:");
		int  n=scanner.nextInt();
		int a[]=new int[n];
		Utility utility=new Utility();
					utility.BubbleSort(n, a);
					
					String str[]=new String[n];
			        int size=str.length;
			        String temp=null;
					System.out.println("Enter value for "+n+ " numbers:");
							for(int i=0;i<a.length;i++)       
							{
								a[i]=scanner.nextInt();		//taking input from user
							}
				        
				       
		

	}

}
