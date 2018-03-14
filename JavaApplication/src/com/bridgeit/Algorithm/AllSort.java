package com.bridgeit.Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.bridegit.Utility.Utility;

public class AllSort {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
       Utility utility = new Utility();
        long startTime;
        long endTime;
        long difference;
        int choice;
        int count = 0;
        TreeMap<Long, String> timings = new TreeMap<Long, String>();

        int lenInt, lenString;

        Scanner read = new Scanner(System.in);

        System.out.println("Enter the no of elements in the Integer array");
        lenInt = read.nextInt();
        int[] arr = new int[lenInt];

        System.out.println("Enter the elements of Integer array");
        for (int i = 0; i < lenInt; i++) {
            arr[i] = read.nextInt();
        }

        System.out.println("Enter the no of elements in the String array");
        lenString = read.nextInt();
        String[] str = new String[lenString];

        System.out.println("Enter the elements of String array");
        for (int i = 0; i < lenString; i++) {
            str[i] = read.next();
        }

        do {

            System.out.println("Enter Choice");
            System.out.println("Press 1  binarySearch method for integer");
            System.out.println("Press 2  binarySearch method for String");
            System.out.println("Press 3  bubbleSort method for integer");
            System.out.println("Press 4  bubbleSirt method for String ");
            System.out.println("Pres  5  insertionSort method for integer ");
            System.out.println("Press 6  insertionSort method for String ");
            System.out.println("press 7  ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nEnter the element to be searched ");
                    int key = read.nextInt();
                    startTime = System.currentTimeMillis();
                    int result = utility.binarySearch(arr, 0, lenInt, key); 
                    System.out.println("Sorted array: \n");

                    for (int i = 0; i < lenInt; i++) {
                        System.out.println(arr[i]);
                    }
                    if (result == -1) {
                        System.out.println("\n" + key + " not found in the array");
                    } else {
                        System.out.println("\n" + key + " found in the array at position" + (result + 1));
                    }
                    endTime = System.currentTimeMillis();
                    difference = endTime - startTime;
                    System.out.println("\nElapsed Time " + difference + " NanoSeconds");

                    timings.put((difference), "BinarySearch (Int)");
                    count++;
                    break;

                case 2:
                    System.out.println("\nEnter the element to be searched ");
                    String value = read.next();
                    startTime = System.currentTimeMillis();
                    
                    result = Utility.binarySearch(str, 0, lenString, value);
                    if (result == -1) {
                        System.out.println("\n" + value + " not found in the array");
                    } else {
                        System.out.println("\n" + value + " found in the array at position " + (result + 1));
                    }
                    endTime = System.currentTimeMillis();
                    difference = endTime - startTime;
                    System.out.println("\nElapsed Time " + difference + " NanoSeconds");
                    timings.put(difference, value);
                    count++;
                    break;

                case 3:
                    startTime = System.currentTimeMillis();
                    arr = Utility.bubbleSort(arr, lenInt);
                    System.out.println("Sorted array: \n");
                    for (int i = 0; i < lenInt; i++) {
                        System.out.println(arr[i]);
                    }
                    endTime = System.currentTimeMillis();
                    difference = endTime - startTime;
                    System.out.println("\nElapsed Time " + difference + " NanoSeconds");

                    timings.put((difference), "BubbleSort (Int)");
                    //timings.add(end-start);
                    count++;

                    break;

                case 4:

                    startTime = System.currentTimeMillis();
                    str = Utility.bubbleSortString(str, lenInt);
                    System.out.println("Sorted array :\n");
                    endTime = System.currentTimeMillis();
                    difference = endTime = startTime;
                    for (int i = 0; i < lenString; i++) {
                        System.out.println(str[i]);
                    }

                    System.out.println("\nElapsed Time " + difference + " Milli Seconds\n");

                    timings.put((difference), "BubbleSort (String)");
                    count++;

                    break;

                case 5:

                    startTime = System.currentTimeMillis();
                    arr = Utility.InsertionSort(arr, lenInt);
                    System.out.println("Sorted array :\n");
                    endTime = System.currentTimeMillis();
                    difference = endTime = startTime;
                    for (int i = 0; i < lenInt; i++) {
                        System.out.println(arr[i]);
                    }

                    System.out.println("\nElapsed Time " + difference + " Milli Seconds\n");

                    timings.put((difference), "InsertionSort (Int)");
                    count++;

                    break;
                case 6:

                    startTime = System.currentTimeMillis();
                    str = Utility.InsertionSort(str, lenString);
                    System.out.println("Sorted array :\n");
                    endTime = System.currentTimeMillis();
                    difference = endTime = startTime;
                    for (int i = 0; i < lenString; i++) {
                        System.out.println(str[i]);
                    }
                    System.out.println("\nElapsed Time " + difference + " Milli Seconds\n");

                    timings.put((difference), "InsertionSort (String)");
                    count++;

                    break;
                default:
                    System.out.println("Invalid Choice");

            }
        } while (choice < 8);
        System.out.println("\nOrder of elapsed timing in Nano Seconds" + ":");

        NavigableMap nmap = timings.descendingMap();

        Set set = nmap.entrySet();

        Iterator it = set.iterator();

        while (it.hasNext()) {
            Map.Entry me = (Map.Entry) it.next();
            System.out.print(me.getValue() + "\t");
            System.out.print(me.getKey() + "\n");
        }
    }
}




	


