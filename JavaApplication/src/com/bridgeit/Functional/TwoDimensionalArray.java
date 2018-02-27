package com.bridgeit.Functional;
import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class TwoDimensionalArray{


	public static void main(String[] args) {
		Utility utility=new Utility();

		Scanner scanner = new Scanner(System.in);
		

		while(true)
		{
			System.out.println("1.integer Array");
			System.out.println("2.Double Array");
			System.out.println("3.Boolean Array");
					
		System.out.println("Enter your choice");
		int ch=scanner.nextInt();
		System.out.println("Enter the number of rows ");
		int rows = scanner.nextInt();
		System.out.println("Enter the number of column you want");
		int columns = scanner.nextInt();
				
			switch(ch) {
			case 1: 
				Integer[][] integ=new Integer[rows][columns];
				System.out.println("Enter the elements");
				for(int i=0;i<rows;i++)
				{
					for(int j=0;j<columns;j++)
					{
						System.out.println("Row ["+i+"]:  Column  "+j+": ");
						integ[i][j]=scanner.nextInt();
					}
				}
				utility.printArray(integ, rows, columns);
				break;

			case 2: 
				Double[][] doub=new Double[rows][columns];
				System.out.println("Enter the elements");
				for(int i=0;i<rows;i++)
				{
					for(int j=0;j<columns;j++)
					{ 
						System.out.println("Row ["+i+"]:  Column  "+j+": ");
						doub[i][j]=scanner.nextDouble();

					}
				}
				utility.printArray(doub, rows, columns);
				break;

			case 3:
				Boolean[][] bool=new Boolean[rows][columns];
				System.out.println("Enter the elements");
				for(int i=0;i<rows;i++)
				{
					for(int j=0;j<columns;j++)
					{
						System.out.println("Row ["+i+"]:  Column  "+j+": ");
						bool[i][j]=scanner.nextBoolean();
					}
				}
				utility.printArray(bool, rows, columns);
				break;	

			default:System.exit(0);
			
			}
			}
			
	}
}
