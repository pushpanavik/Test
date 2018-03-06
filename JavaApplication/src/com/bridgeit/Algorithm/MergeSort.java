
  /***************************************************************************************
 * Purpose:  To sort the array using Merge Sort Technique. 
 
 *@author  Pushpakumari_Navik
 *@version 1.0
 *@since   06-03-2018
****************************************************************************************/
package com.bridgeit.Algorithm;
import java.util.Scanner;

import com.bridegit.Utility.Utility;
/*
 * Aim is to sort an array using Merge Sort
 */
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter the number of elements you want in the array");
	int number=scanner.nextInt();
	String array[]=new String[number];
	int beg=0;
	int end=array.length-1;
	
	System.out.println("Enter the elements in the array");
	for(int i=0;i<array.length;i++)
	{
		array[i]=scanner.next();
	}
	
	Utility u=new Utility();
	
	u.mergeSort(array, beg, end);
	System.out.println("After Sorting");
	u.printMergeArray(array, number);
	
	
		
	
	
}

	
		
	}
