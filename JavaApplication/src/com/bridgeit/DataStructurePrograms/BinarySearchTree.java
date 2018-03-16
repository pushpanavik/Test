package com.bridgeit.DataStructurePrograms;




import java.util.Scanner;
import javax.rmi.CORBA.Util;

import com.bridegit.Utility.Utility;

/**
 *
 * @author PUSHPA
 */
public class BinarySearchTree {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        Utility Utility=new Utility();
        System.out.println("enter the number for testcases");
        int testcases=scanner.nextInt();
        int one=1;

        if(testcases>1 && testcases<=1000)
        {
            while(one<=testcases)
            {
                System.out.println("testcases are" +one);
                System.out.println("Enter how many nodes you want in the BST");
                int nodes=scanner.nextInt();
                if(nodes<1000 && nodes>1)
                {
                  double binaryTrees = Utility.binarySearchTrees(nodes);
						System.out.println("The number of different binary search trees that can be created using "+nodes+" nodes are : "+binaryTrees);
						one++;
					}
					else 
					{
						System.out.println("Enter the nodes value between 0 to 1000");
					}
				}
			}
			else 
			{
				System.out.println("Enter the value of Test Cases between 0 and 1000");
			}
			
			
		}

} 