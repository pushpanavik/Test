/***************************************************************************************
 * Purpose:To implement Gambler Problem and Print Number of Wins and Percentage of Win and Loss.
 
 *@author  Pushpakumari_Navik
 *@version 1.0
 *@since   28-02-2018
****************************************************************************************/
package com.bridgeit.Functional;

import java.util.Scanner;

import com.bridegit.Utility.Utility;
/*
 *  ask the user for amount of cash he want to invest,the amount he want to win as goal and number of times he want to play.
 */
public class GamblerProgram {

	public static void main(String[] args) {
		
		int stake,goal,trials;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the stake you want to invest:=");
		stake = scanner.nextInt();
		System.out.println("Enter the goal you want to gain:=");
		goal=scanner.nextInt();
		System.out.println("Enter the number of trial you want to do:=");
		trials=scanner.nextInt();
		Utility utility=new Utility();
		utility.gambler(stake, goal, trials);
		
			
	}

	

}
