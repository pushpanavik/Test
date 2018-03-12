package com.bridgeit.DataStructurePrograms;

import java.util.*;


class PrimeStack
{

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
    int arr[] = new int[stackoperator.stackSize],i=0;
    int brr[] = new int[stackoperator.stackSize];

    StackNode temp = stackoperator.front;

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