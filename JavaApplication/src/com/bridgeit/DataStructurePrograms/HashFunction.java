package com.bridgeit.DataStructurePrograms;
/**
*
* @author PUSHPA
*/
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**Purpose: This reads a set of numbers from a file and take user input to search a number
* @author Pushpa Navik
* @since 10/03/2018
*
*/
public class HashFunction {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		// Read a file
		Scanner scanfile = new Scanner(new File("/home/bridgeit/Desktop/Files Folder/NumberFile"));
		// Initializing a array
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// hasnext checks for next value
		while (scanfile.hasNext()) {
			list.add(scanfile.nextInt());
		}
		System.out.println(list);

		// creates an empty hashMap contains<K, value>
		HashMap<Integer, LinkedList<Integer>> map1 = new HashMap<Integer, LinkedList<Integer>>();

		// foreach prints list of integer
		for (Integer integer : list) {
			System.out.println("This number:" +integer);

			// Find modulo of the number to assign a slot
			int slotNo = integer % 11;
			System.out.println("Will be in Slot:" + slotNo + "\n");

			// Creates a linked list and pass a slot number
			LinkedList<Integer> numberList = map1.get(slotNo);
			if (numberList == null) {
				numberList = new LinkedList<Integer>();
				map1.put(slotNo, numberList);
			}
			// add to number list
			numberList.add(integer);
		}
		System.out.println(map1);

		System.out.println("Enter Number you want to search or delete");
		int number = scanner.nextInt();
		int SlotNumber = number % 11;
		map1.get(SlotNumber);// get a number

		//Aftr search checks for a number 
		LinkedList<Integer> numberList1 = map1.get(SlotNumber);
               
		System.out.println(numberList1);
               
		if (numberList1.contains(number)) {
                   numberList1.remove(number);
			System.out.println("Number is present and removed from table:");
			
                       
		} else {
			numberList1.add(number);
		}
		System.out.println(map1);
		scanfile.close();
		scanner.close();
	}
}