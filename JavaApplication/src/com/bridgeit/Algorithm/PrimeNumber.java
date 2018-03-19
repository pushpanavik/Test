package com.bridgeit.Algorithm;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
	int number=scanner.nextInt();
	int array[]=new int[number];
		Utility utility=new Utility();
		utility.primenumber(number);
		/*boolean found=utility.isPrime(number);
		if(found==true)
		{
			for(int i=2;i<number;i++)
			{
				System.out.println(i + " ");
			}
			
		}
		*/
		
		
	}
}
