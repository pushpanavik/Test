package com.bridgeit.DataStructurePrograms;
//question No-11
import java.util.*;
class primeCalculate{

	int[][] printArray=new int[50][40];
	int[] arr=new int[1000];
	int row=0,column=0,m=0,i,start;

	void primeCalc(int lowestRange,int highestRange)
	{

		for(i=lowestRange;i<highestRange;i++)
		{
			int flag=0;

			if(i==0 || i==1)
			{
				flag=1;
			}

			for(int j=2;j<i;j++)
			{
				if(i%j==0 || i==0 || i==1)
				{
					flag=1;
					break;
				}
			}

			if(flag==0)
			{
				arr[m]=i;
				m++;

			}


		int z=0;
		for(column=0;column<10;column++)
		{


			for(row=0;row<25;row++)
			{
				if(arr[z]==partitionRange(200,300) || arr[z]==partitionRange(300,400) || arr[z]==partitionRange(400,500) || arr[z]==partitionRange(500,600) || arr[z]==partitionRange(600,700) || arr[z]==partitionRange(700,800) || arr[z]==partitionRange(800,900) || arr[z]==partitionRange(900,1000) )

				{
					row=0;
                                      column++;
				}                          
                              
				printArray[row][column]=arr[z];
				z++;


			}
		}




		}



	}
	int partitionRange(int lowestRange,int highestRange)
	{
		for(int i=lowestRange;i<highestRange;i++)
		{
			int flag=0;
			if(i==0 || i==1)
			{
				flag=1;
			}

			for(int j=2;j<i;j++)
			{
				if(i%j==0 || i==0 || i==1)
				{
					flag=1;
					break;
				}
			}

			if(flag==0)
			{

				start=i;
				break;

			}

		}
		return start;
	}


	void print()
	{
		int z=0;
		for(row=0;row<25;row++)

		{


			for(column=0;column<10;column++)
			{

				if(printArray[row][column]==0)
				{
				break;
				}
				System.out.print(printArray[row][column]+"\t");

			}
			System.out.println();
		}
	}
}

class Prime2D{
	public static void main(String...args)
	{
	primeCalculate p=new primeCalculate();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter lowest number range");
      int lowestRange=sc.nextInt();
      System.out.println("enter highest range");
      int highestRange=sc.nextInt();

  System.out.println("\nPrime numbers:\n");
	p.primeCalc(lowestRange,highestRange);
	p.print();
      }
}
