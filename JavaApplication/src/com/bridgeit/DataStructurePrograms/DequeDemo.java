package com.bridgeit.DataStructurePrograms;

//question no-5 Palindrome Checker
import java.util.*;

class DequeDemo
{
public static void main(String args[])
{
  DequeStringCheck DQ = new DequeStringCheck();
  Scanner scan = new Scanner(System.in);
  String word,revv;

  System.out.println("Enter a word");
  word = scan.next();

  char wordChar[] = word.toCharArray();

  for(int i=0;i<word.length();i++)
   DQ.insertAtRear(wordChar[i]);

  System.out.println("");
//  DQ.display();


  int flag = 0;
  int mid = (DQ.size-1)/2;

  for(int i=0;i<mid;i++)
  {
    if(DQ.front.getData() == DQ.rear.getData())
    {
      DQ.removeAtRear();
      DQ.removeAtFront();
      flag++;
    }

  }
  
  //DQ.display();
  if( flag == mid )
  {
    System.out.println("It is a palindrome");
  }
  else
  {
    System.out.println("It is not a palindrome");
  }


}

}