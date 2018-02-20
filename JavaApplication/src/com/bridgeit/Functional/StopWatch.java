package com.bridgeit.Functional;

import java.util.Calendar;
import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class StopWatch {
	public static void main(String args[]) throws InterruptedException
	{
		//int starttime;
		//int stoptime;

		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter 1 for startTime");
		int ch=scanner.nextInt();

		long startTime = System.currentTimeMillis();
		System.out.println(startTime);


		System.out.println("Enter 2 for startTime");
		int ch1=scanner.nextInt();
		long endTime=System.currentTimeMillis();
		System.out.println(endTime);	



		long difference=endTime-startTime;
		System.out.println("elapsed time is:"+ difference);

		Utility utility=new Utility();
		utility.lapsedTime();
	}
}
