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
class NewNode{				/* creating a node */
    protected int data;
    protected NewNode link;
    public NewNode()
    {
        link = null;
        data = 0;
    }

    public NewNode(int val,NewNode n)
    {
        data = val;
        link = n;
    }
    public void setLink(NewNode n)
    {
        link = n;
    }


    public void setData(int val)
    {
        data = val;
    }
    public NewNode getLink()
    {
       return link;
    }
    public int getData()
    {
        return data;
    }
}


class LinkedListTest						//linked list to arrange the numbers in ascending order.
{
    protected NewNode start;
   protected NewNode end ;
    public int size ;
    
    public LinkedListTest()
    {
        start = null;
        end = null;
        size = 0;
    }


    public void insertAtEnd(int val)
    {
        NewNode nptr = new NewNode(val,null);
        size++ ;
        if(start==null)
        {
            start=nptr;
            end = start;
        }
        else
        {
            end.setLink(nptr);
            end = nptr;

        }

    }

    public void deleteValue(int key)
    {
      NewNode temp = start, prev = null;


        if (temp != null && temp.getData() == key)
        {
            start = temp.getLink();
            return;
        }


        while (temp != null && temp.getData() != key)
        {
            prev = temp;
            temp = temp.getLink();
        }


        if (temp == null)
          return;


        prev.setLink(temp.getLink());
        size --;
        }



    public void display()
    {
        System.out.print("\nLinked List = ");
        if (size == 0)
        {
            System.out.print("empty\n");
            return;
        }
        if (start.getLink() == null)
        {
            System.out.println(start.getData() );
            return;
        }

        NewNode ptr = start;
        System.out.print(start.getData()+ "->");
        ptr = start.getLink();
        while (ptr.getLink() != null)
        {
           System.out.print(ptr.getData()+ "->");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData()+ "\n");
    }

    public void sort(NewNode head) {
     if (size > 1) {
         for (int i = 0; i < size; i++ ) {
             NewNode currentNode = head;
             NewNode next = head.getLink();

             for (int j = 0; j < size - 1; j++) {
                 if (currentNode.getData() > next.getData()) {
                     int temp = currentNode.getData();
                     currentNode.data = next.data;
                     next.data = temp;
                 }
                 currentNode = next;
                 next = next.getLink();
             }
         }
     }
    }

    public void updateFile(File file1) throws IOException
    {
      FileOutputStream fos = new FileOutputStream(file1);
      NewNode temp=start;

      while(temp!=null)
      {

       byte b[] = String.valueOf(temp.getData()).getBytes();

         fos.write(b);
         fos.write(' ');

      temp = temp.getLink();

      }

        fos.close();

    }

    public int searchList(int key)
    {
      int flag = 0;
      NewNode temp = start;

      while(temp  != null)
      {
        if( temp.getData() == key )
        {
          flag =1;
        }
        temp = temp.getLink();
      }
      return flag;
    }



}


class SortedLinkedList

{

    public static void main(String[] args) throws IOException

    {
      LinkedListTest list = new LinkedListTest();
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
