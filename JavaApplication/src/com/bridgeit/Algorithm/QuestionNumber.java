package com.bridgeit.Algorithm;


import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class QuestionNumber 
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number which is in power of 2");
        int number=scanner.nextInt();
        for(int i=0;i<number;i++)
        {
           System.out.print(i+ " ");
        }
        
             int count=0;
            int lower=0;
            int upper=number-1;
            int mid=lower+upper/2;
        
       
        Utility utility=new Utility();
        int n=utility.guessNumber(lower, upper, mid, count, number);
        
        
        }
    }

