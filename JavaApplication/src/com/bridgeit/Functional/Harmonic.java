/***************************************************************************************
 * Purpose: Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
 
 *@author  Pushpakumari_Navik
 *@version 1.0
 *@since   20-02-2018
****************************************************************************************/
package com.bridgeit.Functional;

import java.util.Scanner;

import com.bridegit.Utility.Utility;
/*
 * take value n from user and then compute the nth harmonic number
 */
public class Harmonic {
public static void main(String args[])
{
	int n;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the Harmonic value of N");
	n=scanner.nextInt();
	Utility utility=new Utility();
	utility.harmonic(n);
}
}
