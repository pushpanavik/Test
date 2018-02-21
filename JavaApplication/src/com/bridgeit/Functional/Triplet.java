package com.bridgeit.Functional;

import java.util.*;

import com.bridegit.Utility.Utility;

public class Triplet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in the array:=");
		int n = scanner.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array elements");
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		
Utility.findTriplet(n,a);
		scanner.close();

	}

}
