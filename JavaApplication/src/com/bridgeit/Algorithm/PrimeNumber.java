package com.bridgeit.Algorithm;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		/*int lowestlimit;
		int highestlimit;
		
		System.out.println("Enter the lowest limit");
		lowestlimit=scanner.nextInt();
		System.out.println("Enter the highest limit");
		highestlimit=scanner.nextInt();
		Utility utility=new Utility();
		utility.primenumber(lowestlimit, highestlimit);
		*/
		System.out.println("Enter the number");
		int number=scanner.nextInt();
		boolean found=false;
		for(int i=0;i<number;i++)
		{
			for(int j=2;j<=i/2;j++)
			{
				if(i%2==0) 
				{
					found=true;	
					break;
				}
				else
				{
					found=false;
				}
				if(found==false)
				{
					System.out.println(i);
				}
			}
	}
	}
}
