package com.bridgeit.ObjectOrientedPrograms;

public class DeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []suits= {"Clubs", "Diamonds", "Hearts", "Spades"};
		String [] Rank= {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		int [] deck=new int[52];
		for(int i=0;i<deck.length;i++) 
			deck[i]=i;
			for(int i=0;i<deck.length;i++)
		{
			int index=(int) Math.random()*deck.length;
			int temp=deck[i];
			deck[i]=deck[index];
			deck[index]=temp;
		}
			for(int i=0;i<deck.length;i++)
			{
				String rank=Rank[deck[i]% 13];
				String suit=suits[deck[i]/13];
				System.out.println("cards\t" +deck[i] + " ");
			}
			}
			
}
