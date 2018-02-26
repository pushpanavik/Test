package com.bridgeit.Algorithm;
import java.util.Scanner;
import com.bridegit.Utility.Utility;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter how many numbers to be sorted:");
		int n=scanner.nextInt();
		int a[]=new int[n];
		System.out.println();
		Utility utility=new Utility();
		int ab=utility.BubbleSort(a,n);

	}

}
