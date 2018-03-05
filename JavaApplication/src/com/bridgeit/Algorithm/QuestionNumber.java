package com.bridgeit.Algorithm;


import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class QuestionNumber {

	public static void main(String args[])
	{
		int number;
		
		boolean found=false;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number which is in the power of 2");
		number=scanner.nextInt();
		 int[] array =new int[number];
		 for(int i=0;i<number;i++)
		 {
			 array[i]=i;
			 System.out.print(array[i]+ " \n");
		 }
		 int first=0;
		 int last=number-1;
		 int mid=first+(last-first)/2;
		 System.out.println("guess the number");
		 int guess=scanner.nextInt();
		
		
		 System.out.println("Enter  If your number is in between 0 to" +mid+" ");
		 boolean b=scanner.hasNext();
		 if(b==true)
		 {
			 mid=first+(last-first)/2;
			 System.out.println("Enter  If your number is in between "+a[i]+ "to" +mid+" ");
		 }
		 System.out.println("Enter If your number is between" +(mid+1)+" "+ (number-1)+ " ");
		 boolean c=scanner.hasNext();
		 
		
		 if(guess<mid)
		 {
			last=mid-1;
		 }
		 
		 else if (guess>mid)
		 {
			 first=mid+1;
		 }
		 else if(guess==mid)
		 {	
			 System.out.println("your number is" +mid);
		 }
		
		
		
	}

}