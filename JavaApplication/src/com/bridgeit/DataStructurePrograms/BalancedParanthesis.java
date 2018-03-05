package com.bridgeit.DataStructurePrograms;

import java.util.Scanner;
import java.util.Stack;
 

 
public class BalancedParanthesis {
 
 public static void main(String[] args) {
     
     
   
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the max size of stack");
     int n=sc.nextInt();
     Stack<Character> stack=new Stack<Character>();
     System.out.println();
     System.out.println("Parenthesis Matching");
     System.out.println();
     
     System.out.println("enter the expression");
     String expr=sc.next();
     for(int i=0;i<expr.length();i++)
     {
            char ch=expr.charAt(i);
            if(ch=='(')
            {
                stack.push((char) i);
            }
            else if(ch==')')
            {
               try
					{
					long p = (stack.pop() + 1);
					System.out.println("')' at index "+(i+1)+" matched with '(' at index "+p);
					}
					catch(Exception e)
					{
					System.out.println("')' at index "+(i+1)+" is unmatched");
					}
				}            
			}
		while (!stack.isEmpty() )
		{
		System.out.println("'(' at index "+(stack.pop() +1)+" is unmatched");
		}                          
    
     
   
     System.out.println(stack.size()+" ");
     System.out.println(stack.peek()+ " ");
    }
 
}
