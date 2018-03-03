package com.bridgeit.Algorithm;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class InsertionInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter how many numbers to be sorted:");
		int  n=scanner.nextInt();
		int str[]=new int[n];
       
        String temp=null;
		System.out.println("Enter value for "+n+ " numbers:");
				for(int i=0;i<n;i++)       
				{
					str[i]=scanner.nextInt();		//taking input from user
				}
				Utility utility=new Utility();
				utility.insertion_sort(n, str);
	}

}
