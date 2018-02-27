package com.bridgeit.Functional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class DistinctCoupon {
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the distinct coupon number:");
		int distinct_number=scanner.nextInt();
	Utility utility=new Utility();
	utility.distinctcoupon(distinct_number);
	
}
}