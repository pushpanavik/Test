package com.bridgeit.DataStructurePrograms;

import java.util.Scanner;
import java.io.*;
import java.util.*;

/*
 * Purpose: To Read a List of Numbers from a file and arrange it ascending Order in a Linked List.
 *  		Take user input for a number, if found then pop the number out of the list 
 *  		else insert the number in appropriate position
 * @version 1.0
 * @since 07-03-2018
 */






class SortedLinkedList

{

    public static void main(String[] args) throws IOException

    {
      LinkedListClass list = new LinkedListClass();
      Scanner scan = new Scanner(System.in);
      String input; int key;
      int size;
      ArrayList<Integer> arr = new ArrayList<Integer>();

      System.out.println("Enter the file name to write");
      input = scan.next();

      File fileName = new File(input);
      FileOutputStream fos = new FileOutputStream(fileName);

      System.out.println("\nEnter the Data to write");
      input = scan.next();

      byte b[] = input.getBytes();

      fos.write(b);
      fos.close();


      Scanner read = new Scanner(fileName);
      read.useDelimiter(",");
      int i=0;

  //    System.out.println(list.size);

      while(read.hasNext())
      {
        int data = read.nextInt();
        list.insertAtEnd(data);
        arr.add(data);
      }


      System.out.println("\nThe Sorted Linked list:");
      list.sort(list.start);
      list.display();

      System.out.println("\nEnter the number to search");
      key = scan.nextInt();

      int flag = list.searchList(key);
      if(flag==1)
      {
        list.deleteValue(key);
        System.out.println("\n"+key+" found in file\nHence deleted from file");
        list.display();
      }
      else
      {
        list.insertAtEnd(key);
        System.out.println("\n"+key+" not found in file\nHence added to file");
        list.sort(list.start);
        list.display();
      }


        list.updateFile(fileName);


    }

}
