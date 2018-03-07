/******************************************************************************
 *  Purpose: To convert decimal number to binary  and determine whether they are power of 2 0r not.
 *
 *  @author  Pushpakumari_Navik
 *  @version 1.0
 *  @since   07-03-2018
 *
 ******************************************************************************/
package com.bridgeit.Algorithm;

import java.util.Scanner;
import com.bridegit.Utility.Utility;
/*
 * the main function is to convert decimal to binary ,split the byte into two nibbles(4 bits each) and swap the two nibbles
 */
public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the number\t ");
			int number=scanner.nextInt();
			Utility utility=new Utility();
			byte[] b = utility.decTobinary(number);
			 utility.printArray(b);
			 
			 System.out.println("After swapping two nibbles");
				int swap= utility.swapNibbles(number);
				System.out.println(swap);
				if(swap%2==0)	//to check whether swap contains a value which is power of 2 or not 
				{
					System.out.println("The resultant number  is a power of 2.");
				}
				else
				{
					System.out.println("The resultant number is not  a power of 2.");
				}
				
				
	}

}
