package com.bridgeit.ObjectOrientedPrograms;

import com.bridegit.Utility.Utility;

public class CommercialData {

	public static void main(String[] args) throws Throwable {

		
            Utility Utility=new Utility();
		int choice;
		do {
			System.out.println("\n"+"Enter your choice:");
			System.out.println("1.Create user:");
			System.out.println("2.Buy:");
			System.out.println("3.Sell:");
			System.out.println("4.Display:");
			System.out.println("5.Exit:");
			choice = Utility.inputInteger();

			switch (choice) {
			case 1:
				System.out.println("Create User:" + "\n");
				Utility.create();
				break;

			case 2:
				Utility.buyShare();
				break;

			case 3:
				Utility.sellShare();
				break;

			case 4:
				Utility.displayReport();
				break;
			case 5:
				System.exit(0);
				break;
			}
		} while (choice <= 4);

	}
}