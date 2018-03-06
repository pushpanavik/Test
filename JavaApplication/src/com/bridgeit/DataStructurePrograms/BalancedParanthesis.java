/*  Purpose: Determines whether or not n is prime.
 *
 *  @author Pushpakumari_Navik
 *  @version 1.0
 *  @since   06-03-2018
 *
 ******************************************************************************/
package com.bridgeit.DataStructurePrograms;
import java.util.Scanner;
import java.util.Stack;

import com.bridegit.Utility.Utility;
 

 
public class BalancedParanthesis {
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
    Utility u=new Utility();
	
		boolean flag=false;
		System.out.println("Parenthesis Matching");
		System.out.println();
		 

		/* Accepting expression */
		System.out.println("Enter expression: ");
		String exp = scanner.next();        
		int len = exp.length();
		/* Creating Stack */
		Stack stack = new Stack();
		
		System.out.println("Matches and Mismatches: ");

		for (int i = 0; i < len; i++)
		{    
		char ch = exp.charAt(i);

			if (ch == '(')
			{
			stack.push(i);
			}
				else if (ch == ')')
				{
					try
					{
					int p = (int) (stack.pop());
					System.out.println("')' at index "+(i+1)+" matched with '(' at index "+p);
					flag=true;
					  
					}
					catch(Exception e)
					{
					System.out.println("')' at index "+(i+1)+" is unmatched");
					 
					}
				}  
			
			}
		if(!stack.isEmpty())
		{
				flag=false;
				if(flag==false)
				{
					System.out.println("')'  is unmatched");
				System.out.println("false");
				}
		} 
		else
		{
			System.out.println("true");
		
		}
              
    }
 }
 

