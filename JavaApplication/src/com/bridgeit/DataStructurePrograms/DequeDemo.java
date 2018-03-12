package com.bridgeit.DataStructurePrograms;


import java.util.*;

/**
 * Purpose : To take string as an input and store the character in the dequeue , reverse the string 
 * 			  and then check whether the string is Palindrome Or Not.
 * @author Pushpakumari_Navik
 *@version 1.0
 *@since 09-03-2018
 */
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