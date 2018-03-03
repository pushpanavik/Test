package com.bridgeit.Algorithm;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class InsertionInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter how many numbers to be sorted:");
		int  number=scanner.nextInt();
		int a[]=new int[number];
       
        String temp=null;
		System.out.println("Enter value for "+number+ " numbers:");
				for(int i=0;i<number;i++)       
				{
					a[i]=scanner.nextInt();		//taking input from user
				}
				Utility utility=new Utility();
				utility.insertion_sort(number, a);
	}

}
