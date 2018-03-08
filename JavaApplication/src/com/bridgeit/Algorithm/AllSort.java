package com.bridgeit.Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class AllSort {

	public static <T> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Utility utility=new Utility();
		long startTime;
		long endTime;
		long difference;
		int ch;
		int ch1;
		int inputSearch;
		String temp=null;
		ArrayList<Long> al=new ArrayList();
		
		
				
		boolean flag=true;
		do{
		{
			System.out.println("Enter Choice");
			System.out.println("Press 1  binarySearch method for integer");
			System.out.println("Press 2  binarySearch method for String");
			System.out.println("Press 3  insertionSort method for integer");
			System.out.println("Press 4  insertionSort method for String");
			System.out.println("Pres  5  bubbleSort method for integer"  );
			System.out.println("Press 6  bubbleSort method for String");
			System.out.println("press 7 to display elapsed time");
			int choice=scanner.nextInt();
			System.out.println("Enter how many numbers you want in the array:");
			int  number=scanner.nextInt();
			
			String s[]=new String [number];
		switch(choice)
		{
		case 1:	startTime = System.currentTimeMillis();
				System.out.println("Enter the elements in the array");
				for(int i=0;i<a.length;i++)
				{
					a[i]=scanner.nextInt();
				}	
				System.out.println("Enter the number you want to search");
				inputSearch=scanner.nextInt();
				
				utility.binarysearch(inputSearch, a, number);
				
				System.out.println(startTime+" ");
				System.out.println("Enter 2 for startTime");
				ch1=scanner.nextInt();
				endTime=System.currentTimeMillis();
				difference=endTime-startTime;
				System.out.println("elapsed time is:"+ difference);
				al.add(1,difference);
				
		
				utility.lapsedTime();
				break;
				
		case 2: startTime = System.currentTimeMillis();		
				System.out.println("Enter the elements in the array");
				for(int i=0;i<s.length;i++)
				{
					s[i]=scanner.next();
				}
				Arrays.sort(s);
				System.out.println("Enter the String you want to search");
				String  Search=scanner.next();
				
				utility.searchString(s,Search);
				endTime=System.currentTimeMillis();
				difference=endTime-startTime;
				System.out.println("elapsed time is:"+ difference);
				al.add(2,difference);
				utility.lapsedTime();
				break;
				
		case 3:	System.out.println("Enter the elements in the array");
				for(int i=0;i<a.length;i++)
				{
					a[i]=scanner.nextInt();
				}
				utility.insertion_sort(number, a);
				
				startTime = System.currentTimeMillis();
				System.out.println(startTime+" ");
				System.out.println("Enter 2 for startTime");
				ch1=scanner.nextInt();
				endTime=System.currentTimeMillis();
				System.out.println(endTime);
				difference=endTime-startTime;
				System.out.println("elapsed time is:"+ difference);
				utility.lapsedTime();
				al.add(3,difference);
				break;
				
		case 4:	
				System.out.println("Enter the elements in the array");
				for(int i=0;i<s.length;i++)
				{
					s[i]=scanner.next();
				}
				utility.insertionString(number, s, temp);
				System.out.println("Enter 1 for startTime");
				ch=scanner.nextInt();
				startTime = System.currentTimeMillis();
				System.out.println(startTime+" ");
				System.out.println("Enter 2 for startTime");
				ch1=scanner.nextInt();
				endTime=System.currentTimeMillis();
				System.out.println(endTime);
				difference=endTime-startTime;
				System.out.println("elapsed time is:"+ difference);
				utility.lapsedTime();
				al.add(4,difference);
				break;
				
		case 5:	System.out.println("Enter the elements in the array");
				for(int i=0;i<a.length;i++)
				{
					a[i]=scanner.nextInt();
				}
				utility.BubbleSort(number, a);
				System.out.println("Enter 1 for startTime");
				ch=scanner.nextInt();
				startTime = System.currentTimeMillis();
				System.out.println(startTime+" ");
				System.out.println("Enter 2 for startTime");
				ch1=scanner.nextInt();
				endTime=System.currentTimeMillis();
				System.out.println(endTime);
				difference=endTime-startTime;
				System.out.println("elapsed time is:"+ difference);
				utility.lapsedTime();
				al.add(5,difference);
				break;
				
		case 6:	System.out.println("Enter the elements in the array");
				for(int i=0;i<s.length;i++)
				{
					s[i]=scanner.next();
				}
				utility.bubbleString(number, s, temp);
				System.out.println("Enter 1 for startTime");
				ch=scanner.nextInt();
				startTime = System.currentTimeMillis();
				System.out.println(startTime+" ");
				System.out.println("Enter 2 for startTime");
				ch1=scanner.nextInt();
				endTime=System.currentTimeMillis();
				System.out.println(endTime);
				difference=endTime-startTime;
				System.out.println("elapsed time is:"+ difference);
				utility.lapsedTime();
				al.add(6, difference);
				break;
		case 7: Iterator itr=al.iterator();
				while(itr.hasNext())
				{
					System.out.print(itr.next());
				}
				
		default:
			System.out.println("please give input &amp; try again...");
			
		}
		}while(choice<8)
		}
		}
	}
	


