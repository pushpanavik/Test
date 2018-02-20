package com.bridgeit.Functional;
import java.util.Scanner;

import com.bridegit.Utility.Utility;
public class FlipCoin {

	public static void main(String[] args) {
		
		
		int answer;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of time you want to flip coin:\n");
		int flipcoin=scanner.nextInt();
		
		Utility utility=new Utility();
utility.flipcoin(flipcoin);
		 
				
	}
	
}
