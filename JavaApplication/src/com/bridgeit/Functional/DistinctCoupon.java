package com.bridgeit.Functional;
import java.util.Random;
import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class DistinctCoupon {
	public static void main(String[] args) 
	{
		
       Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
	 /*Utility utility=new Utility();
	 utility.getCoupon(n);
	 int c= Utility.collect(n);
	 System.out.println(c);
*/		
        Random random=new Random();
       int rand=random.nextInt(n);
       System.out.println("Random Integers:=\t"+  rand);
}
}