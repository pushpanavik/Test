package com.bridgeit.DataStructurePrograms;

import java.io.IOException;
import java.util.LinkedList;

import com.bridegit.Utility.Utility;

public class CashCounter{
	public static int cash = 25000;
        static Utility Utility=new Utility();
	public static void main(String[] args) throws IOException {
		System.out.println("\n"+" ***Simulate Banking Cash Counter***" +"\n");
		System.out.println("Enter the number of people in a queue:");
		int numberOfPeople=Utility.inputInteger();
		peopleQueue(numberOfPeople);
		System.out.println("Available balance in bank :" + cash);
	}

	static void peopleQueue(int numberOfPeople) throws IOException {
		LinkedList queue = new LinkedList();
		int choice;
		int i = 0,j=0;

		while (i < numberOfPeople) {
			queue.add(i);
			//System.out.println("Elements of queue-"+queue);
			i++;
		}
		while (j < numberOfPeople) {
			System.out.println(" Person " + (j + 1) + " \n 1.Deposit Cash \n 2.Withdraw Cash"
					+ " \n 3.Check Balance");

			choice = Utility.inputInteger();
			if (choice == 1) {
				queue.remove();
				//System.out.println("removed element" + choice);
				Utility.deposit(cash);
				
			} else if (choice == 2) {
				queue.remove();
				Utility.withdraw(cash);
			}
			j++;
		}
	}
}

