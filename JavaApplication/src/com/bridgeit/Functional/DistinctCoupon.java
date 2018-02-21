package com.bridgeit.Functional;

import java.util.Scanner;

public class DistinctCoupon {

	public static void main(String[] args) {
		int number_coupons;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of coupons you want:=");
		 number_coupons= scanner.nextInt();
		 int coupon[]=new int[number_coupons];
		 System.out.print("Enter the coupons  " +" ");
		 for(int i=0;i<number_coupons;i++)
		 {
			 coupon[i]=scanner.nextInt();
		 }
		
		 
		 }
		 

}
