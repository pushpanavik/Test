/*****************************************************************************************
*  Purpose: Print Permutation of String using recursive and iterative approach.
 *
 *  @author  Pushpakumar_Navik
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgeit.Functional;

import java.util.Scanner;

import com.bridegit.Utility.Utility;
/*
 * To take String input from user and print Permutation of String using recursive and iterative approach
 */
public class Permutation {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=scanner.next();
	int l=0;
	int r=str.length()-1;
	String Permutation=" ";
	Utility utility=new Utility();
	utility.permute(str, l, r);
}
}
