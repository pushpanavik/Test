package com.bridgeit.Functional;

import java.util.Scanner;

import com.bridegit.Utility.Utility;

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
				int var=utility.gambler(stake, goal, trials);

	}

}
