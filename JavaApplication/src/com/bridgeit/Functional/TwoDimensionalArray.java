package com.bridgeit.Functional;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimensionalArray {
	

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of row you want:");
		int m=scanner.nextInt();
		System.out.println("Enter the number of columns you want:");
		int n=scanner.nextInt();
		int a[][]=new int[m][n];
		System.out.println("Enter the element");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=scanner.nextInt();
			}

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	
	
		
	}


