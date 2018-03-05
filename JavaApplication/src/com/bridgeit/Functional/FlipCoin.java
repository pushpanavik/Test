/***************************************************************************************
 * Purpose: Flip Coin and print percentage of Heads and Tails. .
 
 *@author  Pushpakumari_Navik
 *@version 1.0
 *@since   20-02-2018
****************************************************************************************/
package com.bridgeit.Functional;
import java.util.Scanner;

import com.bridegit.Utility.Utility;
public class FlipCoin {

	public static void main(String[] args) {
		
		
		int answer;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the number of time you want to flip coin:\n"); 
		int mflipcoin=scanner.nextInt();
		
		Utility utility=new Utility();
utility.flipcoin(mflipcoin);
		 
				
	}
	
}
