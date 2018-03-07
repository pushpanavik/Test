/***************************************************************************************
 * Purpose:  To generate random number and to process distinct coupons. 
 
 *@author  Pushpakumari_Navik
 *@version 1.0
 *@since   27-02-2018
****************************************************************************************/
package com.bridgeit.Functional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import com.bridegit.Utility.Utility;
/* the main aim is  to generate random number by using Math.random function  and than to process distinct coupons by removing duplicates. */
public class DistinctCoupon {
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the distinct coupon number:");	//Enter number of coupons you want
		int distinct_number=scanner.nextInt();
		Utility utility=new Utility();			//class where method is defined for generating distinct coupon
		utility.distinctcoupon(distinct_number);

	}
}