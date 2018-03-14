package com.bridgeit.ObjectOrientedPrograms;

import java.util.Random;

public class DeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []suits= {"C", "D", "H", "S"};
		String [] Rank= {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		String [] array=new String [52];
		for(int i=0;i<array.length;i++)
		{
			String quo=suits[i/13];
			
			String rem=Rank[i%13];
		 array[i] = quo+rem;
			System.out.print(array[i]+" ");
		}	
		System.out.println();
		Random r=new Random();
		
		int length=array.length;
		//System.out.print(length + " length of ARRAY");
		for(int i=0;i<array.length;i++)
		{
			int index=r.nextInt(52);
			//System.out.print(index+ " ");
			
			String temp=array[i];
			array[i]=array[index];
			array[index]=temp;
		}
		for(String u : array)
		{
			System.out.println(u);
		}
			
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<9;j++)
			{
				String value[][]=array[i][j];
				
			}
		}
	}		
}
