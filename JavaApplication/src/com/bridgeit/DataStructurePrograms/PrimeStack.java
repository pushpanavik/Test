package com.bridgeit.DataStructurePrograms;

import java.util.*;

public void push(int val)
{
  StackNode newNode = new StackNode(val);
  newNode.link = head;
  head = newNode;
  stackSize++;
}
 public StackNode pop()
{
	StackNode newNode=new StackNode(val);
  if(head == null)
    return null;
  StackNode temp = head;
  head = head.link;

  return temp;
}


void displayStack()
{
  if(stackSize == 0)
    {
      System.out.println("Empty Stack");
      return ;
    }
  StackNode temp = head;

  while(temp != null)
  {
    System.out.println(temp.data);
    temp = temp.link;
  }
}

int searchQueue(int val)
{
  StackNode temp = head;

  if(temp.data == val)
    {
      //System.out.println(val+" is an Anagram");
      return 1;
    }
  while(temp.link != null && temp.data != val)
  {
    temp = temp.link;
  }
  if(temp.data == val)
    {
      //System.out.println(val+" is an Anagram");
      return 1;
    }
  return 0;
}
}

class PrimeStack
{
	StackOperator stackoperator=new StackOperator();

  public static void findPrime(int low, int high, StackOperator stackoperator){
    int i,flag=0;

    for (i=low;i<=high;i++ ) {
      for(int j=2;j<i;j++)
      {
        if(i==0 || i==1)
        {
          flag = 1;

        }
        if( i % j == 0 )
        {
          flag = 1;
          break;
        }
      }
      if( flag == 0 )
        stackoperator.push(i);
      flag = 0;
    }
  }

  public static void findAnagrams(StackOperator stackoperator)
  {
    int arr[] = new int[stackoperator.stackSize] ,i=0;
    int brr[] = new int[stackoperator.stackSize];

    StackNode temp = stackoperator.head;

    System.out.println("\nAnagrams are ");

    while(temp !=null )
    {
      arr[i] = temp.data;
      temp = temp.next;
      //System.out.println(""+arr[i]+"");
      i++;
    }
  //System.out.println("STACKSIZE:"+QO.stackSize+"");
  int count = 0;
    for(i=0;i<stackoperator.stackSize;i++){

      String key = String.valueOf(arr[i]);
      char val[] = key.toCharArray();
      Arrays.sort(val);
      key = String.valueOf(val);
      int num = Integer.parseInt(key);
      brr[i] = num;
      count++;
    //  System.out.println(arr[i]+"   "+brr[i]);

    }
  //System.out.println(""+count+"");
  for(i=0;i<stackoperator.stackSize;i++)
  {
    for(int j=i+1;j<stackoperator.stackSize;j++)
    {
      if(brr[i]==brr[j])
      {
        System.out.println(arr[i]+"---"+arr[j]);

        // stackoperator.push(arr[i]);
        // stackoperator.push(arr[j]);

        //flag = 1;
      }
    }
  }
}
 

  public static void main(String args[])
  {
    int arr[] = new int[100],low=0,high=200;
    StackOperator stackoperator = new StackOperator();

    System.out.println("\nPrime numbers between "+high+" and "+low+" are ");
    findPrime(low,high,stackoperator);
    stackoperator.displayStack();
    findAnagrams(stackoperator);

    //QO.displayStack();

  }
}